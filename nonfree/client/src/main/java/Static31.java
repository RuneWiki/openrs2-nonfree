import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!hia;")
	public static Class133 aClass133_3;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	public static final int[] anIntArray37 = new int[14];

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_2 = new Class166(4);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)I")
	public static int method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZII)Z")
	public static boolean method553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method555() {
		if (Static572.anInt9602 == 0 || Static572.anInt9602 == 5) {
			return;
		}
		try {
			@Pc(27) short local27;
			if (Static623.anInt10264 == 0) {
				local27 = 250;
			} else {
				local27 = 2000;
			}
			if (++Static369.anInt6804 > local27) {
				if (Static97.aClass29_1 != null) {
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
				}
				if (Static623.anInt10264 >= 3) {
					Static572.anInt9602 = 0;
					Static319.method5323(-5);
					return;
				}
				if (Static155.anInt2829 == 2) {
					Static315.aClass56_4.method1429();
				} else {
					Static288.aClass56_3.method1429();
				}
				Static623.anInt10264++;
				Static572.anInt9602 = 1;
				Static369.anInt6804 = 0;
			}
			if (Static572.anInt9602 == 1) {
				if (Static155.anInt2829 == 2) {
					Static218.aClass328_3 = Static315.aClass56_4.method1431(Static529.aClass112_6);
				} else {
					Static218.aClass328_3 = Static288.aClass56_3.method1431(Static529.aClass112_6);
				}
				Static572.anInt9602 = 2;
			}
			@Pc(141) Class6_Sub9 local141;
			if (Static572.anInt9602 == 2) {
				if (Static218.aClass328_3.anInt9389 == 2) {
					throw new IOException();
				}
				if (Static218.aClass328_3.anInt9389 != 1) {
					return;
				}
				Static97.aClass29_1 = Static226.method3873((Socket) Static218.aClass328_3.anObject21);
				Static218.aClass328_3 = null;
				Static28.method4860();
				local141 = Static573.method8156();
				local141.aClass6_Sub40_Sub2_1.method8589(Static640.aClass218_1.anInt6779);
				Static263.method4681(local141);
				Static265.method3201();
				Static572.anInt9602 = 3;
			}
			@Pc(182) int local182;
			if (Static572.anInt9602 == 3) {
				if (!Static97.aClass29_1.method4608(1)) {
					return;
				}
				Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
				local182 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
				if (local182 != 0) {
					Static572.anInt9602 = 0;
					Static319.method5323(local182);
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
					Static385.method6194();
					return;
				}
				Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
				@Pc(205) Class6_Sub40 local205 = new Class6_Sub40(518);
				@Pc(208) int[] local208 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local205.method8589(10);
				local205.method8554(local208[0]);
				local205.method8554(local208[1]);
				local205.method8554(local208[2]);
				local205.method8554(local208[3]);
				local205.method8594(0L);
				local205.method8551(Static286.aString63);
				local205.method8594(Static492.aLong220);
				local205.method8594(Static638.aLong277);
				local205.method8566(Static191.aBigInteger2, Static479.aBigInteger6);
				Static28.method4860();
				@Pc(294) Class6_Sub9 local294 = Static573.method8156();
				@Pc(297) Class6_Sub40_Sub2 local297 = local294.aClass6_Sub40_Sub2_1;
				@Pc(322) int local322;
				@Pc(337) int local337;
				if (Static155.anInt2829 == 2) {
					if (Static554.anInt1821 == 13) {
						local297.method8589(Static640.aClass218_5.anInt6779);
					} else {
						local297.method8589(Static640.aClass218_3.anInt6779);
					}
					local297.method8561(0);
					local322 = local297.anInt10169;
					local297.method8554(639);
					local297.method8562(0, local205.aByteArray113, local205.anInt10169);
					local337 = local297.anInt10169;
					local297.method8551(Static459.aString91);
					local297.method8589(Static19.anInt323);
					local297.method8589(Static323.method5374());
					local297.method8561(Static321.anInt6137);
					local297.method8561(Static356.anInt6630);
					local297.method8589(Static348.aClass6_Sub22_19.aClass15_Sub11_1.method4165());
					Static626.method8716(local297);
					local297.method8551(Static162.aString32);
					local297.method8554(Static364.anInt6726);
					@Pc(382) Class6_Sub40 local382 = Static348.aClass6_Sub22_19.method3529();
					local297.method8589(local382.anInt10169);
					local297.method8562(0, local382.aByteArray113, local382.anInt10169);
					Static509.aBoolean584 = true;
					@Pc(408) Class6_Sub40 local408 = new Class6_Sub40(Static428.aClass6_Sub28_1.method5287());
					Static428.aClass6_Sub28_1.method5286(local408);
					local297.method8562(0, local408.aByteArray113, local408.aByteArray113.length);
					local297.method8561(Static500.anInt8420);
					local297.method8594(Static548.aLong241);
					local297.method8589(Static108.aString25 == null ? 0 : 1);
					if (Static108.aString25 != null) {
						local297.method8551(Static108.aString25);
					}
					local297.method8589(Static227.method3878("jagtheora") ? 1 : 0);
					Static269.method4787(local297);
					local297.method8591(local297.anInt10169, local208, local337);
					local297.method8559(local297.anInt10169 - local322);
				} else {
					local297.method8589(Static640.aClass218_6.anInt6779);
					local297.method8561(0);
					local322 = local297.anInt10169;
					local297.method8554(639);
					local297.method8562(0, local205.aByteArray113, local205.anInt10169);
					local337 = local297.anInt10169;
					local297.method8551(Static459.aString91);
					local297.method8589(Static630.aClass271_17.anInt8162);
					local297.method8589(Static307.anInt5931);
					Static626.method8716(local297);
					local297.method8551(Static162.aString32);
					local297.method8554(Static364.anInt6726);
					Static269.method4787(local297);
					local297.method8591(local297.anInt10169, local208, local337);
					local297.method8559(local297.anInt10169 - local322);
				}
				Static263.method4681(local294);
				Static265.method3201();
				Static391.aClass126_1 = new Class126(local208);
				for (local322 = 0; local322 < 4; local322++) {
					local208[local322] += 50;
				}
				Static456.aClass6_Sub40_Sub2_2.method8624(local208);
				Static572.anInt9602 = 4;
			}
			if (Static572.anInt9602 == 4) {
				if (!Static97.aClass29_1.method4608(1)) {
					return;
				}
				Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
				local182 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
				if (local182 == 21) {
					Static572.anInt9602 = 7;
				} else if (local182 == 29) {
					Static572.anInt9602 = 13;
				} else if (local182 == 1) {
					Static572.anInt9602 = 5;
					Static319.method5323(local182);
					return;
				} else if (local182 == 2) {
					Static572.anInt9602 = 8;
				} else if (local182 == 15) {
					Static572.anInt9602 = 14;
					Static501.anInt8676 = -2;
				} else if (local182 == 23 && Static623.anInt10264 < 3) {
					Static623.anInt10264++;
					Static369.anInt6804 = 0;
					Static572.anInt9602 = 1;
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
					return;
				} else {
					Static572.anInt9602 = 0;
					Static319.method5323(local182);
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
					Static385.method6194();
					return;
				}
			}
			if (Static572.anInt9602 == 6) {
				Static28.method4860();
				local141 = Static573.method8156();
				@Pc(703) Class6_Sub40_Sub2 local703 = local141.aClass6_Sub40_Sub2_1;
				local703.method8622(Static391.aClass126_1);
				local703.method8626(Static640.aClass218_10.anInt6779);
				Static263.method4681(local141);
				Static265.method3201();
				Static572.anInt9602 = 4;
			} else if (Static572.anInt9602 == 7) {
				if (Static97.aClass29_1.method4608(1)) {
					Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
					local182 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
					Static525.anInt9140 = (local182 + 3) * 60;
					Static572.anInt9602 = 0;
					Static319.method5323(21);
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
					Static385.method6194();
				}
			} else if (Static572.anInt9602 == 13) {
				if (Static97.aClass29_1.method4608(1)) {
					Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
					Static572.anInt9602 = 0;
					Static442.anInt7972 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
					Static319.method5323(29);
					Static97.aClass29_1.method4606();
					Static97.aClass29_1 = null;
					Static385.method6194();
				}
			} else if (Static572.anInt9602 != 8) {
				@Pc(842) Class6_Sub40_Sub2 local842;
				if (Static572.anInt9602 == 9) {
					local842 = Static456.aClass6_Sub40_Sub2_2;
					if (Static155.anInt2829 == 2) {
						if (!Static97.aClass29_1.method4608(Static344.anInt6480)) {
							return;
						}
						Static97.aClass29_1.method4609(local842.aByteArray113, Static344.anInt6480, 0);
						local842.anInt10169 = 0;
						Static578.anInt6641 = local842.method8604();
						Static616.anInt10722 = local842.method8604();
						Static461.aBoolean555 = local842.method8604() == 1;
						Static279.aBoolean370 = local842.method8604() == 1;
						Static184.aBoolean271 = local842.method8604() == 1;
						Static441.aBoolean530 = local842.method8604() == 1;
						Static229.anInt4561 = local842.method8571();
						Static447.aBoolean546 = local842.method8604() == 1;
						Static613.anInt10091 = local842.method8577();
						Static265.aBoolean260 = local842.method8604() == 1;
						Static283.aClass210_2.method5640(Static265.aBoolean260);
						Static266.aClass138_1.method3729(Static265.aBoolean260);
						Static563.aClass346_2.method8198(Static265.aBoolean260);
					} else if (Static97.aClass29_1.method4608(Static344.anInt6480)) {
						Static97.aClass29_1.method4609(local842.aByteArray113, Static344.anInt6480, 0);
						local842.anInt10169 = 0;
						Static578.anInt6641 = local842.method8604();
						Static616.anInt10722 = local842.method8604();
						Static461.aBoolean555 = local842.method8604() == 1;
						Static279.aBoolean370 = local842.method8604() == 1;
						Static184.aBoolean271 = local842.method8604() == 1;
						Static97.anInt1910 = local842.method8615();
						Static447.aBoolean546 = Static97.anInt1910 > 0;
						Static349.anInt6551 = local842.method8571();
						Static348.anInt6549 = local842.method8571();
						Static95.anInt1862 = local842.method8571();
						Static517.anInt9061 = local842.method8579();
						Static528.aClass328_7 = Static529.aClass112_6.method3229(Static517.anInt9061);
						Static16.anInt282 = local842.method8604();
						Static153.anInt2792 = local842.method8571();
						Static206.anInt4093 = local842.method8571();
						Static54.aBoolean51 = local842.method8604() == 1;
						Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString13 = Static142.aString29 = local842.method8555();
						Static393.anInt7369 = local842.method8604();
						Static19.anInt324 = local842.method8579();
						Static561.aClass56_5 = new Class56();
						Static561.aClass56_5.anInt1712 = local842.method8571();
						if (Static561.aClass56_5.anInt1712 == 65535) {
							Static561.aClass56_5.anInt1712 = -1;
						}
						Static561.aClass56_5.aString17 = local842.method8555();
						if (Static212.aClass35_2 != Static418.aClass35_3) {
							Static561.aClass56_5.anInt1717 = Static561.aClass56_5.anInt1712 + 50000;
							Static561.aClass56_5.anInt1715 = Static561.aClass56_5.anInt1712 + 40000;
						}
						if (Static636.aClass35_7 != Static212.aClass35_2 && (Static315.aClass56_4.method1432(Static29.aClass56_2) || Static315.aClass56_4.method1432(Static19.aClass56_1))) {
							Static60.method1080();
						}
					} else {
						return;
					}
					if (Static461.aBoolean555 && !Static184.aBoolean271 || Static447.aBoolean546) {
						try {
							Static654.method5164(Static42.anApplet1, "zap");
						} catch (@Pc(1168) Throwable local1168) {
							if (Static369.aBoolean451) {
								try {
									Static42.anApplet1.getAppletContext().showDocument(new URL(Static42.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1182) Exception local1182) {
								}
							}
						}
					} else {
						try {
							Static654.method5164(Static42.anApplet1, "unzap");
						} catch (@Pc(1159) Throwable local1159) {
						}
					}
					if (Static418.aClass35_3 == Static212.aClass35_2) {
						try {
							Static654.method5164(Static42.anApplet1, "loggedin");
						} catch (@Pc(1195) Throwable local1195) {
						}
					}
					if (Static155.anInt2829 != 2) {
						Static572.anInt9602 = 0;
						Static319.method5323(2);
						Static608.method8495();
						Static190.method3390(7);
						Static5.aClass268_3 = null;
						return;
					}
					Static572.anInt9602 = 11;
				}
				if (Static572.anInt9602 == 11) {
					if (!Static97.aClass29_1.method4608(3)) {
						return;
					}
					Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 3, 0);
					Static572.anInt9602 = 12;
				}
				if (Static572.anInt9602 == 12) {
					local842 = Static456.aClass6_Sub40_Sub2_2;
					local842.anInt10169 = 0;
					if (local842.method8627()) {
						if (!Static97.aClass29_1.method4608(1)) {
							return;
						}
						Static97.aClass29_1.method4609(local842.aByteArray113, 1, 3);
					}
					Static5.aClass268_3 = Static365.method5783()[local842.method8620()];
					Static501.anInt8676 = local842.method8571();
					Static572.anInt9602 = 10;
				}
				if (Static572.anInt9602 == 10) {
					if (Static97.aClass29_1.method4608(Static501.anInt8676)) {
						Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, Static501.anInt8676, 0);
						Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
						local182 = Static501.anInt8676;
						Static572.anInt9602 = 0;
						Static319.method5323(2);
						Static393.method6336();
						Static462.method7054(Static456.aClass6_Sub40_Sub2_2);
						Static500.anInt8419 = -1;
						if (Static5.aClass268_3 == Static582.aClass268_174) {
							Static507.method7515();
						} else {
							Static510.method7561();
						}
						if (Static456.aClass6_Sub40_Sub2_2.anInt10169 != local182) {
							throw new RuntimeException("lswp pos:" + Static456.aClass6_Sub40_Sub2_2.anInt10169 + " psize:" + local182);
						}
						Static5.aClass268_3 = null;
					}
				} else if (Static572.anInt9602 == 14) {
					if (Static501.anInt8676 == -2) {
						if (!Static97.aClass29_1.method4608(2)) {
							return;
						}
						Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 2, 0);
						Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
						Static501.anInt8676 = Static456.aClass6_Sub40_Sub2_2.method8571();
					}
					if (Static97.aClass29_1.method4608(Static501.anInt8676)) {
						Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, Static501.anInt8676, 0);
						Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
						local182 = Static501.anInt8676;
						Static572.anInt9602 = 0;
						Static319.method5323(15);
						Static387.method6213();
						Static462.method7054(Static456.aClass6_Sub40_Sub2_2);
						if (local182 != Static456.aClass6_Sub40_Sub2_2.anInt10169) {
							throw new RuntimeException("lswpr pos:" + Static456.aClass6_Sub40_Sub2_2.anInt10169 + " psize:" + local182);
						}
						Static5.aClass268_3 = null;
					}
				}
			} else if (Static97.aClass29_1.method4608(1)) {
				Static97.aClass29_1.method4609(Static456.aClass6_Sub40_Sub2_2.aByteArray113, 1, 0);
				Static344.anInt6480 = Static456.aClass6_Sub40_Sub2_2.aByteArray113[0] & 0xFF;
				Static572.anInt9602 = 9;
			}
		} catch (@Pc(1444) IOException local1444) {
			if (Static97.aClass29_1 != null) {
				Static97.aClass29_1.method4606();
				Static97.aClass29_1 = null;
			}
			if (Static623.anInt10264 < 3) {
				if (Static155.anInt2829 == 2) {
					Static315.aClass56_4.method1429();
				} else {
					Static288.aClass56_3.method1429();
				}
				Static623.anInt10264++;
				Static572.anInt9602 = 1;
				Static369.anInt6804 = 0;
			} else {
				Static572.anInt9602 = 0;
				Static319.method5323(-4);
				Static385.method6194();
			}
		}
	}
}
