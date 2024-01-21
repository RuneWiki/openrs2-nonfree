import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static int anInt1636;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!v;")
	public static Class88 aClass88_2;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_551 = Static161.method2971("::qa_op_test");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!dd;")
	private static Class13 aClass13_555 = Static161.method2971("K");

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_552 = aClass13_555;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_553 = aClass13_555;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_554 = Static161.method2971("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_556 = Static161.method2971(" )2>");

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!dd;")
	private static Class13 aClass13_557 = Static161.method2971("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!dd;")
	public static Class13 aClass13_558 = Static161.method2971("::fpsoff");

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_559 = aClass13_557;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_560 = Static161.method2971("Titelbild geladen)3");

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_561 = Static161.method2971("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
	public static void method1242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static101.anInt2832 * 128) {
			arg0 = Static101.anInt2832 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static90.anInt2623 * 128) {
			arg2 = Static90.anInt2623 * 128 - 1;
		}
		Static89.anInt2511++;
		Static1.anInt64 = Class1_Sub2_Sub1_Sub2.anIntArray41[arg3];
		Static179.anInt4051 = Class1_Sub2_Sub1_Sub2.anIntArray38[arg3];
		Static35.anInt1194 = Class1_Sub2_Sub1_Sub2.anIntArray41[arg4];
		Static125.anInt3233 = Class1_Sub2_Sub1_Sub2.anIntArray38[arg4];
		Static89.aBooleanArrayArray1 = Static150.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static4.anInt122 = arg0;
		Static2.anInt95 = arg1;
		Static24.anInt869 = arg2;
		Static81.anInt2305 = arg0 / 128;
		Static40.anInt1276 = arg2 / 128;
		Static77.anInt2154 = arg5;
		Static7.anInt3156 = Static81.anInt2305 - Static103.anInt2867;
		if (Static7.anInt3156 < 0) {
			Static7.anInt3156 = 0;
		}
		Static106.anInt2880 = Static40.anInt1276 - Static103.anInt2867;
		if (Static106.anInt2880 < 0) {
			Static106.anInt2880 = 0;
		}
		Static103.anInt2865 = Static81.anInt2305 + Static103.anInt2867;
		if (Static103.anInt2865 > Static101.anInt2832) {
			Static103.anInt2865 = Static101.anInt2832;
		}
		Static53.anInt1721 = Static40.anInt1276 + Static103.anInt2867;
		if (Static53.anInt1721 > Static90.anInt2623) {
			Static53.anInt1721 = Static90.anInt2623;
		}
		Static180.method2979();
		Static113.anInt3060 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static77.anInt2157; local118 < Static4.anInt118; local118++) {
			@Pc(123) Class1_Sub10[][] local123 = Static170.aClass1_Sub10ArrayArrayArray35[local118];
			for (local125 = Static7.anInt3156; local125 < Static103.anInt2865; local125++) {
				for (local128 = Static106.anInt2880; local128 < Static53.anInt1721; local128++) {
					@Pc(135) Class1_Sub10 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt1540 <= arg5 && (Static89.aBooleanArrayArray1[local125 + Static103.anInt2867 - Static81.anInt2305][local128 + Static103.anInt2867 - Static40.anInt1276] || Static114.anIntArrayArrayArray4[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean112 = true;
							local135.aBoolean114 = true;
							if (local135.anInt1544 > 0) {
								local135.aBoolean113 = true;
							} else {
								local135.aBoolean113 = false;
							}
							Static113.anInt3060++;
						} else {
							local135.aBoolean112 = false;
							local135.aBoolean114 = false;
							local135.anInt1545 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static77.anInt2157; local210 < Static4.anInt118; local210++) {
			@Pc(215) Class1_Sub10[][] local215 = Static170.aClass1_Sub10ArrayArrayArray35[local210];
			for (local128 = -Static103.anInt2867; local128 <= 0; local128++) {
				local223 = Static81.anInt2305 + local128;
				local227 = Static81.anInt2305 - local128;
				if (local223 >= Static7.anInt3156 || local227 < Static103.anInt2865) {
					for (local236 = -Static103.anInt2867; local236 <= 0; local236++) {
						local241 = Static40.anInt1276 + local236;
						local245 = Static40.anInt1276 - local236;
						@Pc(257) Class1_Sub10 local257;
						if (local223 >= Static7.anInt3156) {
							if (local241 >= Static106.anInt2880) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean112) {
									Static37.method993(local257, true);
								}
							}
							if (local245 < Static53.anInt1721) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean112) {
									Static37.method993(local257, true);
								}
							}
						}
						if (local227 < Static103.anInt2865) {
							if (local241 >= Static106.anInt2880) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean112) {
									Static37.method993(local257, true);
								}
							}
							if (local245 < Static53.anInt1721) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean112) {
									Static37.method993(local257, true);
								}
							}
						}
						if (Static113.anInt3060 == 0) {
							Static71.aBoolean156 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static77.anInt2157; local125 < Static4.anInt118; local125++) {
			@Pc(341) Class1_Sub10[][] local341 = Static170.aClass1_Sub10ArrayArrayArray35[local125];
			for (local223 = -Static103.anInt2867; local223 <= 0; local223++) {
				local227 = Static81.anInt2305 + local223;
				local236 = Static81.anInt2305 - local223;
				if (local227 >= Static7.anInt3156 || local236 < Static103.anInt2865) {
					for (local241 = -Static103.anInt2867; local241 <= 0; local241++) {
						local245 = Static40.anInt1276 + local241;
						@Pc(371) int local371 = Static40.anInt1276 - local241;
						@Pc(383) Class1_Sub10 local383;
						if (local227 >= Static7.anInt3156) {
							if (local245 >= Static106.anInt2880) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean112) {
									Static37.method993(local383, false);
								}
							}
							if (local371 < Static53.anInt1721) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean112) {
									Static37.method993(local383, false);
								}
							}
						}
						if (local236 < Static103.anInt2865) {
							if (local245 >= Static106.anInt2880) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean112) {
									Static37.method993(local383, false);
								}
							}
							if (local371 < Static53.anInt1721) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean112) {
									Static37.method993(local383, false);
								}
							}
						}
						if (Static113.anInt3060 == 0) {
							Static71.aBoolean156 = false;
							return;
						}
					}
				}
			}
		}
		Static71.aBoolean156 = false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)J")
	public static long method1243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		return local7 == null || local7.aClass56_1 == null ? 0L : local7.aClass56_1.aLong104;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z")
	public static boolean method1244(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method1245() {
		aClass13_561 = null;
		aClass13_560 = null;
		aClass13_558 = null;
		aClass13_555 = null;
		aClass13_552 = null;
		aClass88_2 = null;
		aClass13_559 = null;
		aClass13_553 = null;
		aClass13_554 = null;
		aClass13_557 = null;
		aClass13_556 = null;
		aClass13_551 = null;
		anIntArray174 = null;
	}
}
