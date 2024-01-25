import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	public static int anInt3848;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Z")
	public static boolean aBoolean291 = true;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
	public static final int[] anIntArray451 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	public static int anInt3858 = -1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!ml;")
	public static Class136 method3756(@OriginalArg(0) int arg0) {
		@Pc(10) Class136 local10 = (Class136) Static12.aClass70_7.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static156.aClass53_151.method1033(arg0, 4);
		local10 = new Class136();
		if (local20 != null) {
			local10.method3616(new Class6_Sub10(local20), arg0);
		}
		local10.method3617(arg0);
		Static12.aClass70_7.method1406(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!m;ILclient!m;)V")
	public static void method3757(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg1.aClass6_Sub2_62 != null) {
			arg1.method5761();
		}
		arg1.aClass6_Sub2_62 = arg0;
		arg1.aClass6_Sub2_61 = arg0.aClass6_Sub2_61;
		arg1.aClass6_Sub2_62.aClass6_Sub2_61 = arg1;
		arg1.aClass6_Sub2_61.aClass6_Sub2_62 = arg1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZ)V")
	public static void method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(1, arg1);
		local8.method2648();
		local8.anInt2511 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lclient!nq;")
	public static Class147 method3762(@OriginalArg(1) int arg0) {
		@Pc(5) Class70 local5 = Static290.aClass70_91;
		@Pc(22) Class147 local22;
		synchronized (Static290.aClass70_91) {
			local22 = (Class147) Static290.aClass70_91.method1396((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(42) byte[] local42 = Static319.aClass53_145.method1033(Static259.method4409(arg0), Static150.method2938(arg0));
		local22 = new Class147();
		local22.anInt3953 = arg0;
		if (local42 != null) {
			local22.method3849(new Class6_Sub10(local42));
		}
		local22.method3854();
		if (local22.anInt3940 != -1) {
			local22.method3843(method3762(local22.anInt3952), method3762(local22.anInt3940));
		}
		if (local22.anInt3999 != -1) {
			local22.method3853(method3762(local22.anInt3999), method3762(local22.anInt3973));
		}
		if (!Static327.aBoolean227 && local22.aBoolean294) {
			local22.aString170 = Static340.aString26;
			local22.aStringArray28 = Static63.aStringArray6;
			local22.anInt3955 = 0;
			local22.aStringArray27 = Static285.aStringArray35;
			local22.anIntArray465 = null;
			local22.aBoolean295 = false;
		}
		@Pc(117) Class70 local117 = Static290.aClass70_91;
		synchronized (Static290.aClass70_91) {
			Static290.aClass70_91.method1406(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
	public static void method3764() {
		if (Static181.anInt3370 == 0 || Static181.anInt3370 == 5) {
			return;
		}
		try {
			if (++Static250.anInt493 > 2000) {
				if (Static216.aClass11_5 != null) {
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
				}
				if (Static208.anInt6332 >= 1) {
					Static181.anInt3370 = 0;
					Static24.anInt400 = -5;
					return;
				}
				if (Static253.anInt4714 == Static309.anInt5826) {
					Static253.anInt4714 = Static47.anInt914;
				} else {
					Static253.anInt4714 = Static309.anInt5826;
				}
				Static250.anInt493 = 0;
				Static181.anInt3370 = 1;
				Static208.anInt6332++;
			}
			if (Static181.anInt3370 == 1) {
				Static173.aClass196_4 = Static308.aClass206_5.method5525(Static253.anInt4714, Static239.aString304);
				Static181.anInt3370 = 2;
			}
			if (Static181.anInt3370 == 2) {
				if (Static173.aClass196_4.anInt5851 == 2) {
					throw new IOException();
				}
				if (Static173.aClass196_4.anInt5851 != 1) {
					return;
				}
				Static216.aClass11_5 = new Class11((Socket) Static173.aClass196_4.anObject8, Static308.aClass206_5);
				Static173.aClass196_4 = null;
				@Pc(113) long local113 = Static121.aLong190 = Static217.method3880(Static323.aString278);
				@Pc(120) int local120 = (int) (local113 >> 16 & 0x1FL);
				Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
				Static131.aClass6_Sub10_Sub1_2.method3968(14);
				Static131.aClass6_Sub10_Sub1_2.method3968(local120);
				Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, 2);
				if (Static292.aClass34_1 != null) {
					Static292.aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				@Pc(152) int local152 = Static216.aClass11_5.method167();
				if (Static292.aClass34_1 != null) {
					Static292.aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				if (local152 != 0) {
					Static24.anInt400 = local152;
					Static181.anInt3370 = 0;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
					return;
				}
				Static181.anInt3370 = 3;
			}
			if (Static181.anInt3370 == 3) {
				if (Static216.aClass11_5.method160() < 8) {
					return;
				}
				Static216.aClass11_5.method164(Static142.aClass6_Sub10_Sub1_3.aByteArray67, 8, 0);
				Static142.aClass6_Sub10_Sub1_3.anInt4188 = 0;
				Static319.aLong198 = Static142.aClass6_Sub10_Sub1_3.method4016();
				@Pc(206) int[] local206 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, 0 };
				Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
				local206[2] = (int) (Static319.aLong198 >> 32);
				local206[3] = (int) Static319.aLong198;
				Static131.aClass6_Sub10_Sub1_2.method3968(10);
				Static131.aClass6_Sub10_Sub1_2.method3976(local206[0]);
				Static131.aClass6_Sub10_Sub1_2.method3976(local206[1]);
				Static131.aClass6_Sub10_Sub1_2.method3976(local206[2]);
				Static131.aClass6_Sub10_Sub1_2.method3976(local206[3]);
				Static131.aClass6_Sub10_Sub1_2.method3970(Static217.method3880(Static323.aString278));
				Static131.aClass6_Sub10_Sub1_2.method3966(Static294.aString249);
				Static131.aClass6_Sub10_Sub1_2.method4004(Static343.aBigInteger6, Static102.aBigInteger5);
				Static111.aClass6_Sub10_Sub1_1.anInt4188 = 0;
				if (Static129.anInt2374 == 40) {
					Static111.aClass6_Sub10_Sub1_1.method3968(18);
				} else {
					Static111.aClass6_Sub10_Sub1_1.method3968(16);
				}
				Static111.aClass6_Sub10_Sub1_1.method4025(Static131.aClass6_Sub10_Sub1_2.anInt4188 + Static302.method5198(Static106.aString74) + 161);
				Static111.aClass6_Sub10_Sub1_1.method3976(558);
				Static111.aClass6_Sub10_Sub1_1.method3968(Static117.anInt2215);
				Static111.aClass6_Sub10_Sub1_1.method3968(Static137.method2629());
				Static111.aClass6_Sub10_Sub1_1.method4025(Static209.anInt3815);
				Static111.aClass6_Sub10_Sub1_1.method4025(Static94.anInt1731);
				Static111.aClass6_Sub10_Sub1_1.method3968(Static297.anInt5582);
				Static36.method635(Static111.aClass6_Sub10_Sub1_1);
				Static111.aClass6_Sub10_Sub1_1.method3966(Static106.aString74);
				Static111.aClass6_Sub10_Sub1_1.method3976(Static41.anInt6384);
				Static111.aClass6_Sub10_Sub1_1.method3976(Static164.method3246());
				Static263.aBoolean339 = true;
				Static111.aClass6_Sub10_Sub1_1.method4025(Static31.anInt579);
				Static111.aClass6_Sub10_Sub1_1.method3976(Static127.aClass53_105.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static87.aClass53_42.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static114.aClass53_62.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static129.aClass53_75.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static15.aClass53_14.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static71.aClass53_36.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static244.aClass53_116.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static17.aClass53_155.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static269.aClass53_124.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static244.aClass53_115.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static73.aClass53_38.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static243.aClass53_113.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static109.aClass53_55.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static5.aClass53_8.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static306.aClass53_142.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static350.aClass53_159.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static282.aClass53_130.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static284.aClass53_131.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static128.aClass53_74.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static110.aClass53_57.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static111.aClass53_59.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static291.aClass53_133.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static276.aClass53_128.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static138.aClass53_114.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static238.aClass53_126.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static27.aClass53_24.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static250.aClass53_22.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static160.aClass53_88.method1005());
				Static111.aClass6_Sub10_Sub1_1.method3976(Static179.aClass53_93.method1005());
				Static111.aClass6_Sub10_Sub1_1.method4014(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
				Static216.aClass11_5.method158(Static111.aClass6_Sub10_Sub1_1.aByteArray67, Static111.aClass6_Sub10_Sub1_1.anInt4188);
				Static131.aClass6_Sub10_Sub1_2.method2882(local206);
				for (@Pc(551) int local551 = 0; local551 < 4; local551++) {
					local206[local551] += 50;
				}
				Static142.aClass6_Sub10_Sub1_3.method2882(local206);
				Static181.anInt3370 = 4;
			}
			if (Static181.anInt3370 == 4) {
				if (Static216.aClass11_5.method160() < 1) {
					return;
				}
				@Pc(587) int local587 = Static216.aClass11_5.method167();
				if (local587 == 21) {
					Static181.anInt3370 = 7;
				} else if (local587 == 29) {
					Static181.anInt3370 = 10;
				} else if (local587 == 1) {
					Static181.anInt3370 = 5;
					Static24.anInt400 = local587;
					return;
				} else if (local587 == 2) {
					Static181.anInt3370 = 8;
				} else if (local587 == 15) {
					Static24.anInt400 = local587;
					Static181.anInt3370 = 0;
					return;
				} else if (local587 == 23 && Static208.anInt6332 < 1) {
					Static208.anInt6332++;
					Static250.anInt493 = 0;
					Static181.anInt3370 = 1;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
					return;
				} else {
					Static181.anInt3370 = 0;
					Static24.anInt400 = local587;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
					return;
				}
			}
			if (Static181.anInt3370 == 6) {
				Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
				Static131.aClass6_Sub10_Sub1_2.method2886(17);
				Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
				Static181.anInt3370 = 4;
			} else if (Static181.anInt3370 == 7) {
				if (Static216.aClass11_5.method160() >= 1) {
					Static106.anInt1969 = (Static216.aClass11_5.method167() + 3) * 60;
					Static181.anInt3370 = 0;
					Static24.anInt400 = 21;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
				}
			} else if (Static181.anInt3370 != 10) {
				if (Static181.anInt3370 == 8) {
					if (Static216.aClass11_5.method160() < 14) {
						return;
					}
					Static216.aClass11_5.method164(Static142.aClass6_Sub10_Sub1_3.aByteArray67, 14, 0);
					Static142.aClass6_Sub10_Sub1_3.anInt4188 = 0;
					Static115.anInt2157 = Static142.aClass6_Sub10_Sub1_3.method3972();
					Static265.anInt4936 = Static142.aClass6_Sub10_Sub1_3.method3972();
					Static78.aBoolean95 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static344.aBoolean415 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static1.aBoolean1 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static281.aBoolean368 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static109.aBoolean173 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static44.anInt879 = Static142.aClass6_Sub10_Sub1_3.method4021();
					Static256.aBoolean335 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static177.aBoolean242 = Static142.aClass6_Sub10_Sub1_3.method3972() == 1;
					Static102.method4782(Static177.aBoolean242);
					Static287.method4915(Static177.aBoolean242);
					Static50.method848(Static177.aBoolean242);
					if (Static78.aBoolean95 && !Static1.aBoolean1 || Static256.aBoolean335) {
						try {
							Static365.method3241(Static308.aClass206_5.anApplet1, "zap");
						} catch (@Pc(878) Throwable local878) {
						}
					} else {
						try {
							Static365.method3241(Static308.aClass206_5.anApplet1, "unzap");
						} catch (@Pc(868) Throwable local868) {
						}
					}
					if (Static189.anInt3601 == 0) {
						try {
							Static365.method3241(Static308.aClass206_5.anApplet1, "loggedin");
						} catch (@Pc(892) Throwable local892) {
						}
					}
					Static336.anInt6134 = Static142.aClass6_Sub10_Sub1_3.method2889();
					Static31.anInt578 = Static142.aClass6_Sub10_Sub1_3.method4021();
					Static181.anInt3370 = 9;
				}
				if (Static181.anInt3370 == 9 && Static216.aClass11_5.method160() >= Static31.anInt578) {
					Static142.aClass6_Sub10_Sub1_3.anInt4188 = 0;
					Static216.aClass11_5.method164(Static142.aClass6_Sub10_Sub1_3.aByteArray67, Static31.anInt578, 0);
					Static181.anInt3370 = 0;
					Static24.anInt400 = 2;
					Static18.method289();
					Static296.anInt5969 = -1;
					Static88.method1490(false);
					Static336.anInt6134 = -1;
				}
			} else if (Static216.aClass11_5.method160() >= 1) {
				Static131.anInt2393 = Static216.aClass11_5.method167();
				Static181.anInt3370 = 0;
				Static24.anInt400 = 29;
				Static216.aClass11_5.method159();
				Static216.aClass11_5 = null;
			}
		} catch (@Pc(941) IOException local941) {
			if (Static216.aClass11_5 != null) {
				Static216.aClass11_5.method159();
				Static216.aClass11_5 = null;
			}
			if (Static208.anInt6332 < 1) {
				Static208.anInt6332++;
				if (Static253.anInt4714 == Static309.anInt5826) {
					Static253.anInt4714 = Static47.anInt914;
				} else {
					Static253.anInt4714 = Static309.anInt5826;
				}
				Static250.anInt493 = 0;
				Static181.anInt3370 = 1;
			} else {
				Static181.anInt3370 = 0;
				Static24.anInt400 = -4;
			}
		}
	}
}
