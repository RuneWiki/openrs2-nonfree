import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public static int anInt2717;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!ia;")
	public static final Class89 aClass89_1 = Static170.method3321();

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!al;")
	public static final Class11 aClass11_61 = new Class11(4);

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	public static int anInt2718 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZB)V")
	public static void method2598(@OriginalArg(0) boolean arg0) {
		Static151.method3006();
		if (Static302.anInt5842 != 30 && Static302.anInt5842 != 25) {
			return;
		}
		Static102.anInt2290++;
		if (Static102.anInt2290 < 50 && !arg0) {
			return;
		}
		Static102.anInt2290 = 0;
		if (!Static140.aBoolean195 && Static138.aClass159_3 != null) {
			Static164.aClass14_Sub4_Sub2_3.method2557(248);
			try {
				Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
				Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
			} catch (@Pc(59) IOException local59) {
				Static140.aBoolean195 = true;
			}
		}
		Static151.method3006();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public static void method2599() {
		if (Static64.anInt1541 == 0) {
			return;
		}
		try {
			if (++Static165.anInt5076 > 1500) {
				if (Static138.aClass159_3 != null) {
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
				}
				if (Static101.anInt2284 >= 1) {
					Static276.anInt5254 = -5;
					Static64.anInt1541 = 0;
					return;
				}
				Static101.anInt2284++;
				Static64.anInt1541 = 1;
				if (Static164.anInt3456 == Static40.anInt978) {
					Static164.anInt3456 = Static214.anInt4285;
				} else {
					Static164.anInt3456 = Static40.anInt978;
				}
				Static165.anInt5076 = 0;
			}
			if (Static64.anInt1541 == 1) {
				Static281.aClass205_10 = Static105.aClass15_2.method284(Static274.aString196, Static164.anInt3456);
				Static64.anInt1541 = 2;
			}
			@Pc(123) int local123;
			if (Static64.anInt1541 == 2) {
				if (Static281.aClass205_10.anInt6370 == 2) {
					throw new IOException();
				}
				if (Static281.aClass205_10.anInt6370 != 1) {
					return;
				}
				Static138.aClass159_3 = new Class159((Socket) Static281.aClass205_10.anObject7, Static105.aClass15_2);
				Static281.aClass205_10 = null;
				Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				local123 = Static138.aClass159_3.method4086();
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				if (local123 != 101) {
					Static64.anInt1541 = 0;
					Static276.anInt5254 = local123;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
					return;
				}
				Static64.anInt1541 = 3;
			}
			if (Static64.anInt1541 == 3 && Static138.aClass159_3.method4083() >= 2) {
				local123 = Static138.aClass159_3.method4086() << 8 | Static138.aClass159_3.method4086();
				Static298.method5082(local123);
				if (Static296.anInt5689 == -1) {
					Static276.anInt5254 = 6;
					Static64.anInt1541 = 0;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
				} else {
					Static64.anInt1541 = 0;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
					Static260.method4485();
				}
			}
		} catch (@Pc(202) IOException local202) {
			if (Static138.aClass159_3 != null) {
				Static138.aClass159_3.method4079();
				Static138.aClass159_3 = null;
			}
			if (Static101.anInt2284 < 1) {
				Static101.anInt2284++;
				if (Static40.anInt978 == Static164.anInt3456) {
					Static164.anInt3456 = Static214.anInt4285;
				} else {
					Static164.anInt3456 = Static40.anInt978;
				}
				Static64.anInt1541 = 1;
				Static165.anInt5076 = 0;
			} else {
				Static64.anInt1541 = 0;
				Static276.anInt5254 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	public static void method2600() {
		@Pc(10) int local10 = Static30.aClass14_Sub4_Sub2_1.method2558(8);
		@Pc(19) int local19;
		if (local10 < Static307.anInt2887) {
			for (local19 = local10; local19 < Static307.anInt2887; local19++) {
				Static4.anIntArray6[Static164.anInt3458++] = Static213.anIntArray380[local19];
			}
		}
		if (Static307.anInt2887 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static307.anInt2887 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(65) int local65 = Static213.anIntArray380[local19];
			@Pc(69) Class10_Sub3_Sub3_Sub2 local69 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local65];
			@Pc(74) int local74 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
			if (local74 == 0) {
				Static213.anIntArray380[Static307.anInt2887++] = local65;
				local69.anInt5927 = Static153.anInt3257;
			} else {
				@Pc(94) int local94 = Static30.aClass14_Sub4_Sub2_1.method2558(2);
				if (local94 == 0) {
					Static213.anIntArray380[Static307.anInt2887++] = local65;
					local69.anInt5927 = Static153.anInt3257;
					Static116.anIntArray227[Static222.anInt4457++] = local65;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local94 == 1) {
						Static213.anIntArray380[Static307.anInt2887++] = local65;
						local69.anInt5927 = Static153.anInt3257;
						local138 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
						local69.method5361(local138, 1);
						local148 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
						if (local148 == 1) {
							Static116.anIntArray227[Static222.anInt4457++] = local65;
						}
					} else if (local94 == 2) {
						Static213.anIntArray380[Static307.anInt2887++] = local65;
						local69.anInt5927 = Static153.anInt3257;
						if (Static30.aClass14_Sub4_Sub2_1.method2558(1) == 1) {
							local138 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
							local69.method5361(local138, 2);
							local148 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
							local69.method5361(local148, 2);
						} else {
							local138 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
							local69.method5361(local138, 0);
						}
						local138 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
						if (local138 == 1) {
							Static116.anIntArray227[Static222.anInt4457++] = local65;
						}
					} else if (local94 == 3) {
						Static4.anIntArray6[Static164.anInt3458++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
	public static boolean method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static346.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static238.anInt4659) {
			return false;
		} else if (local7 == Static238.anInt4659) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static2.method106(local22 + 1, Static158.aClass114Array2[arg0].method3610(arg1, arg2), local26 + 1) && Static2.method106(local22 + 128 - 1, Static158.aClass114Array2[arg0].method3610(arg1 + 1, arg2), local26 + 1) && Static2.method106(local22 + 128 - 1, Static158.aClass114Array2[arg0].method3610(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static2.method106(local22 + 1, Static158.aClass114Array2[arg0].method3610(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static346.anIntArrayArrayArray13[arg0][arg1][arg2] = Static238.anInt4659;
				return true;
			} else {
				Static346.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static238.anInt4659;
				return false;
			}
		}
	}
}
