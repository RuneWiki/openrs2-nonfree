import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!ha;")
	public static Class5 aClass5_5;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean471 = true;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLclient!fl;Ljava/awt/Component;)Lclient!qn;")
	public static Class114 method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class104 arg2, @OriginalArg(4) Component arg3) {
		if (Static322.anInt6392 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class114 local31 = (Class114) Class.forName("Class114_Sub2").getDeclaredConstructor().newInstance();
			local31.anInt5169 = arg0;
			local31.anIntArray219 = new int[(Static528.aBoolean739 ? 2 : 1) * 256];
			local31.method4226(arg3);
			local31.anInt5164 = (arg0 & 0xFFFFFC00) + 1024;
			if (local31.anInt5164 > 16384) {
				local31.anInt5164 = 16384;
			}
			local31.method4223(local31.anInt5164);
			if (Static131.anInt3188 > 0 && Static333.aClass120_1 == null) {
				Static333.aClass120_1 = new Class120();
				Static333.aClass120_1.aClass104_1 = arg2;
				arg2.method3127(Static131.anInt3188, Static333.aClass120_1);
			}
			if (Static333.aClass120_1 != null) {
				if (Static333.aClass120_1.aClass114Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static333.aClass120_1.aClass114Array1[arg1] = local31;
			}
			return local31;
		} catch (@Pc(104) Throwable local104) {
			try {
				@Pc(110) Class114_Sub1 local110 = new Class114_Sub1(arg2, arg1);
				local110.anInt5169 = arg0;
				local110.anIntArray219 = new int[(Static528.aBoolean739 ? 2 : 1) * 256];
				local110.method4226(arg3);
				local110.anInt5164 = 16384;
				local110.method4223(local110.anInt5164);
				if (Static131.anInt3188 > 0 && Static333.aClass120_1 == null) {
					Static333.aClass120_1 = new Class120();
					Static333.aClass120_1.aClass104_1 = arg2;
					arg2.method3127(Static131.anInt3188, Static333.aClass120_1);
				}
				if (Static333.aClass120_1 != null) {
					if (Static333.aClass120_1.aClass114Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static333.aClass120_1.aClass114Array1[arg1] = local110;
				}
				return local110;
			} catch (@Pc(174) Throwable local174) {
				return new Class114();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method5020() {
		Static349.aClass163_39 = new Class163();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(JB)V")
	public static void method5022(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static527.anInt9189 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360;
		@Pc(24) int local24 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 + Static211.anInt4068;
		if (Static369.anInt7056 - local10 < -2000 || Static369.anInt7056 - local10 > 2000 || Static387.anInt7286 - local24 < -2000 || Static387.anInt7286 - local24 > 2000) {
			Static369.anInt7056 = local10;
			Static387.anInt7286 = local24;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (Static369.anInt7056 != local10) {
			local66 = local10 - Static369.anInt7056;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local74 < local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local74 > local66) {
				local74 = local66;
			}
			Static369.anInt7056 += local74;
		}
		if (local24 != Static387.anInt7286) {
			local66 = local24 - Static387.anInt7286;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local66 > local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static387.anInt7286 += local74;
		}
		Static532.aFloat179 += (float) arg0 * Static529.aFloat136 / 6.0F;
		Static595.aFloat184 += (float) arg0 * Static338.aFloat133 / 6.0F;
		Static229.method4152();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)I")
	public static int method5023(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
