import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!al;")
	public static Interface1 anInterface1_5;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[Lclient!vd;")
	public static Class17_Sub7_Sub1_Sub1[] aClass17_Sub7_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
	public static final int[] anIntArray377 = new int[4096];

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public static int anInt4563 = -1;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static int anInt4567 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
	public static boolean method3770(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static297.anInt6000; local1 < Static112.anInt2455; local1++) {
			@Pc(6) Class57[][] local6 = Static18.aClass57ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static226.anInt4752; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static307.anInt3770 + local9;
				@Pc(18) int local18 = Static307.anInt3770 - local9;
				if (local14 >= Static151.anInt3337 || local18 < Static118.anInt2543) {
					for (@Pc(27) int local27 = -Static226.anInt4752; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static178.anInt6542 + local27;
						@Pc(36) int local36 = Static178.anInt6542 - local27;
						@Pc(48) Class57 local48;
						if (local14 >= Static151.anInt3337) {
							if (local32 >= Static349.anInt6795) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean117) {
									Static282.aBoolean503 = arg0;
									Static54.aClass80_1.method5709(local48);
									Static54.aClass80_1.method5703();
								}
							}
							if (local36 < Static259.anInt5346) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean117) {
									Static282.aBoolean503 = arg0;
									Static54.aClass80_1.method5709(local48);
									Static54.aClass80_1.method5703();
								}
							}
						}
						if (local18 < Static118.anInt2543) {
							if (local32 >= Static349.anInt6795) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean117) {
									Static282.aBoolean503 = arg0;
									Static54.aClass80_1.method5709(local48);
									Static54.aClass80_1.method5703();
								}
							}
							if (local36 < Static259.anInt5346) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean117) {
									Static282.aBoolean503 = arg0;
									Static54.aClass80_1.method5709(local48);
									Static54.aClass80_1.method5703();
								}
							}
						}
						if (Static40.anInt915 == 0) {
							if (Static147.aBoolean277) {
								Static54.aClass80_1.method5702(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
	public static int method3772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLclient!am;Lclient!am;)V")
	public static void method3773(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static326.aClass11_145 = arg0;
		Static282.aClass11_124 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V")
	public static void method3774(@OriginalArg(0) boolean arg0) {
		Static187.method3426(Static202.anInt4258, Static310.anInt6220, Static38.anInt832, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	public static void method3775() {
		for (@Pc(10) Class17_Sub4 local10 = (Class17_Sub4) Static145.aClass204_7.method5356(); local10 != null; local10 = (Class17_Sub4) Static145.aClass204_7.method5356()) {
			Static88.method1569(local10);
		}
		Static46.method871();
		Static46.method879();
		Static46.method884();
		Static46.method890();
		Static46.method878();
		Static46.method892();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[J[I)V")
	public static void method3776(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static242.method4209(arg1, arg0, 0, arg0.length - 1);
	}
}
