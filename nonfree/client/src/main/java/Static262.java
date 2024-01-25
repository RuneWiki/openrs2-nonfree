import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public static int anInt4465;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_91 = new Class254(8, -1);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method3693() {
		Static361.aClass229Array1 = null;
		Static42.method4170(-1, 0, 0, Static324.anInt5725, Static403.anInt7142, Static246.anInt4292, 0, 0);
		if (Static361.aClass229Array1 != null) {
			Static372.method5280(Static361.aClass229Array1, Static15.anInt286, Static324.anInt5725, -1412584499, 0, Static196.aClass229_5.anInt6938, Static380.anInt6830, 0, Static403.anInt7142);
			Static361.aClass229Array1 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!ci;ILjava/awt/Component;)Lclient!ig;")
	public static Class118 method3695(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static3.anInt61 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class118 local38 = (Class118) Class.forName("Class118_Sub2").getDeclaredConstructor().newInstance();
			local38.anIntArray372 = new int[(Static183.aBoolean268 ? 2 : 1) * 256];
			local38.anInt4811 = arg0;
			local38.method3941(arg3);
			local38.anInt4803 = (arg0 & -1024) + 1024;
			if (local38.anInt4803 > 16384) {
				local38.anInt4803 = 16384;
			}
			local38.method3939(local38.anInt4803);
			if (Static228.anInt3926 > 0 && Static394.aClass204_1 == null) {
				Static394.aClass204_1 = new Class204();
				Static394.aClass204_1.aClass42_5 = arg1;
				arg1.method653(Static228.anInt3926, Static394.aClass204_1);
			}
			if (Static394.aClass204_1 != null) {
				if (Static394.aClass204_1.aClass118Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static394.aClass204_1.aClass118Array1[arg2] = local38;
			}
			return local38;
		} catch (@Pc(110) Throwable local110) {
			try {
				@Pc(124) Class118_Sub1 local124 = new Class118_Sub1(arg1, arg2);
				local124.anInt4811 = arg0;
				local124.anIntArray372 = new int[(Static183.aBoolean268 ? 2 : 1) * 256];
				local124.method3941(arg3);
				local124.anInt4803 = 16384;
				local124.method3939(local124.anInt4803);
				if (Static228.anInt3926 > 0 && Static394.aClass204_1 == null) {
					Static394.aClass204_1 = new Class204();
					Static394.aClass204_1.aClass42_5 = arg1;
					arg1.method653(Static228.anInt3926, Static394.aClass204_1);
				}
				if (Static394.aClass204_1 != null) {
					if (Static394.aClass204_1.aClass118Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static394.aClass204_1.aClass118Array1[arg2] = local124;
				}
				return local124;
			} catch (@Pc(186) Throwable local186) {
				return new Class118();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZZ)I")
	public static int method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class1_Sub13 local10 = Static379.method5347(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray82.length; local18++) {
			if (local10.anIntArray82[local18] >= 0 && Static388.aClass193_3.anInt5241 > local10.anIntArray82[local18]) {
				@Pc(40) Class206 local40 = Static388.aClass193_3.method4249(local10.anIntArray82[local18]);
				@Pc(50) int local50 = local40.method4971(arg1, Static192.aClass75_1.method1517(arg1).anInt2527);
				if (arg2) {
					local16 += local10.anIntArray80[local18] * local50;
				} else {
					local16 += local50;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)I")
	public static int method3697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static432.method5813(4, arg0 + 91923, arg1 - -45365) + (Static432.method5813(2, arg0 + 37821, arg1 + 10294) - 128 >> 1) + (Static432.method5813(1, arg0, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
