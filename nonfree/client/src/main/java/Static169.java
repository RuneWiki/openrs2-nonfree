import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "[Lclient!p;")
	public static final Class151[] aClass151Array1 = new Class151[4];

	@OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
	public static int anInt3463 = 0;

	@OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
	public static int anInt3464 = 0;

	@OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
	public static int anInt3465 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILclient!fj;Z)V")
	public static void method3188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62_Sub1_Sub2 arg3) {
		@Pc(9) Class180 local9 = arg3.method4775();
		@Pc(19) int local19 = arg3.anInt5353 - arg3.aClass110_7.anInt3429 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg3.anInt5309 > 25) {
				arg3.aBoolean484 = false;
				if (arg2 < 0 && local9.anInt5751 != -1) {
					arg3.anInt5347 = local9.anInt5751;
				} else if (arg2 <= 0 || local9.anInt5771 == -1) {
					arg3.anInt5347 = local9.anInt5750;
				} else {
					arg3.anInt5347 = local9.anInt5771;
				}
			} else if (!arg3.aBoolean484 || !local9.method5103(arg3.anInt5347)) {
				arg3.anInt5347 = local9.method5102();
				arg3.aBoolean484 = arg3.anInt5347 != -1;
			}
		} else if (arg3.anInt5292 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(115) int local115 = Static206.anIntArray319[arg0] - arg3.aClass110_7.anInt3429 & 0x3FFF;
			arg3.aBoolean484 = false;
			if (arg1 == 2 && local9.anInt5767 != -1) {
				if (local115 > 2048 && local115 <= 6144 && local9.anInt5762 != -1) {
					arg3.anInt5347 = local9.anInt5762;
				} else if (local115 >= 10240 && local115 < 14336 && local9.anInt5773 != -1) {
					arg3.anInt5347 = local9.anInt5773;
				} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt5755 == -1) {
					arg3.anInt5347 = local9.anInt5767;
				} else {
					arg3.anInt5347 = local9.anInt5755;
				}
			} else if (arg1 == 0 && local9.anInt5728 != -1) {
				if (local115 > 2048 && local115 <= 6144 && local9.anInt5746 != -1) {
					arg3.anInt5347 = local9.anInt5746;
				} else if (local115 >= 10240 && local115 < 14336 && local9.anInt5744 != -1) {
					arg3.anInt5347 = local9.anInt5744;
				} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt5754 == -1) {
					arg3.anInt5347 = local9.anInt5728;
				} else {
					arg3.anInt5347 = local9.anInt5754;
				}
			} else if (local115 > 2048 && local115 <= 6144 && local9.anInt5763 != -1) {
				arg3.anInt5347 = local9.anInt5763;
			} else if (local115 >= 10240 && local115 < 14336 && local9.anInt5743 != -1) {
				arg3.anInt5347 = local9.anInt5743;
			} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt5768 == -1) {
				arg3.anInt5347 = local9.anInt5750;
			} else {
				arg3.anInt5347 = local9.anInt5768;
			}
		} else if (local19 == 0 && arg3.anInt5309 <= 25) {
			arg3.aBoolean484 = false;
			if (arg1 == 2 && local9.anInt5767 != -1) {
				arg3.anInt5347 = local9.anInt5767;
			} else if (arg1 == 0 && local9.anInt5728 != -1) {
				arg3.anInt5347 = local9.anInt5728;
			} else {
				arg3.anInt5347 = local9.anInt5750;
			}
		} else {
			arg3.aBoolean484 = false;
			if (arg1 == 2 && local9.anInt5767 != -1) {
				if (arg2 < 0 && local9.anInt5747 != -1) {
					arg3.anInt5347 = local9.anInt5747;
				} else if (arg2 <= 0 || local9.anInt5731 == -1) {
					arg3.anInt5347 = local9.anInt5767;
				} else {
					arg3.anInt5347 = local9.anInt5731;
				}
			} else if (arg1 == 0 && local9.anInt5728 != -1) {
				if (arg2 < 0 && local9.anInt5738 != -1) {
					arg3.anInt5347 = local9.anInt5738;
				} else if (arg2 <= 0 || local9.anInt5748 == -1) {
					arg3.anInt5347 = local9.anInt5728;
				} else {
					arg3.anInt5347 = local9.anInt5748;
				}
			} else if (arg2 < 0 && local9.anInt5770 != -1) {
				arg3.anInt5347 = local9.anInt5770;
			} else if (arg2 <= 0 || local9.anInt5766 == -1) {
				arg3.anInt5347 = local9.anInt5750;
			} else {
				arg3.anInt5347 = local9.anInt5766;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!ae;Lclient!ul;I)V")
	public static void method3190(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Interface7 arg1) {
		if (Static127.aClass2_Sub11_Sub6_2 == null) {
			return;
		}
		if (Static85.anInt1831 < 10) {
			if (!Static127.aClass191_45.method5455(Static127.aClass2_Sub11_Sub6_2.aString23)) {
				Static85.anInt1831 = Static133.aClass191_84.method5458(Static127.aClass2_Sub11_Sub6_2.aString23) / 10;
				return;
			}
			Static15.method626();
			Static85.anInt1831 = 10;
		}
		if (Static85.anInt1831 == 10) {
			Static127.anInt1567 = Static127.aClass2_Sub11_Sub6_2.anInt2441 >> 6 << 6;
			Static127.anInt1568 = Static127.aClass2_Sub11_Sub6_2.anInt2446 >> 6 << 6;
			Static127.anInt1566 = (Static127.aClass2_Sub11_Sub6_2.anInt2444 >> 6 << 6) + 64 - Static127.anInt1567;
			Static127.anInt1564 = (Static127.aClass2_Sub11_Sub6_2.anInt2443 >> 6 << 6) + 64 - Static127.anInt1568;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static127.aClass2_Sub11_Sub6_2.method2389(Static342.anInt6864 + (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7), (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7) + Static138.anInt2879, Static182.anInt3603, local74)) {
				local76 = local74[1] - Static127.anInt1568;
				local78 = local74[2] - Static127.anInt1567;
			}
			if (!Static166.aBoolean298 && local76 >= 0 && local76 < Static127.anInt1564 && local78 >= 0 && Static127.anInt1566 > local78) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static109.anInt2412 = local78;
				Static210.anInt4066 = local76;
			} else if (Static249.anInt4907 == -1 || Static335.anInt6702 == -1) {
				Static127.aClass2_Sub11_Sub6_2.method2390(Static127.aClass2_Sub11_Sub6_2.anInt2445 >> 14 & 0x3FFF, local74, Static127.aClass2_Sub11_Sub6_2.anInt2445 & 0x3FFF);
				Static210.anInt4066 = local74[1] - Static127.anInt1568;
				Static109.anInt2412 = local74[2] - Static127.anInt1567;
			} else {
				Static127.aClass2_Sub11_Sub6_2.method2390(Static249.anInt4907, local74, Static335.anInt6702);
				if (local74 != null) {
					Static109.anInt2412 = local74[2] - Static127.anInt1567;
					Static210.anInt4066 = local74[1] - Static127.anInt1568;
				}
				Static166.aBoolean298 = false;
				Static335.anInt6702 = -1;
				Static249.anInt4907 = -1;
			}
			if (Static127.aClass2_Sub11_Sub6_2.anInt2439 == 37) {
				Static127.aFloat34 = 3.0F;
				Static127.aFloat33 = 3.0F;
			} else if (Static127.aClass2_Sub11_Sub6_2.anInt2439 == 50) {
				Static127.aFloat34 = 4.0F;
				Static127.aFloat33 = 4.0F;
			} else if (Static127.aClass2_Sub11_Sub6_2.anInt2439 == 75) {
				Static127.aFloat34 = 6.0F;
				Static127.aFloat33 = 6.0F;
			} else if (Static127.aClass2_Sub11_Sub6_2.anInt2439 == 100) {
				Static127.aFloat34 = 8.0F;
				Static127.aFloat33 = 8.0F;
			} else if (Static127.aClass2_Sub11_Sub6_2.anInt2439 == 200) {
				Static127.aFloat34 = 16.0F;
				Static127.aFloat33 = 16.0F;
			} else {
				Static127.aFloat34 = 8.0F;
				Static127.aFloat33 = 8.0F;
			}
			Static127.anInt1561 = (int) Static127.aFloat34 >> 1;
			Static127.aByteArrayArrayArray5 = Static283.method5093(Static127.anInt1561);
			Static19.method675();
			Static127.method1631();
			Static56.aClass216_19 = new Class216();
			Static127.anInt1560 += (int) (Math.random() * 5.0D) - 2;
			if (Static127.anInt1560 < -8) {
				Static127.anInt1560 = -8;
			}
			if (Static127.anInt1560 > 8) {
				Static127.anInt1560 = 8;
			}
			Static127.anInt1559 += (int) (Math.random() * 5.0D) - 2;
			if (Static127.anInt1559 < -16) {
				Static127.anInt1559 = -16;
			}
			if (Static127.anInt1559 > 16) {
				Static127.anInt1559 = 16;
			}
			Static127.method1628(arg1, Static127.anInt1560 >> 2 << 10, Static127.anInt1559 >> 1);
			Static113.method2468(256, 1024);
			Static145.method5964(256, 256);
			Static281.method5076(4096);
			Static326.method5733(256);
			Static85.anInt1831 = 20;
		} else if (Static85.anInt1831 == 20) {
			Static126.method2619(true);
			Static127.method1617(arg0, Static127.anInt1560, Static127.anInt1559);
			Static85.anInt1831 = 60;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 60) {
			if (Static127.aClass191_45.method5433(Static127.aClass2_Sub11_Sub6_2.aString23 + "_staticelements")) {
				if (!Static127.aClass191_45.method5455(Static127.aClass2_Sub11_Sub6_2.aString23 + "_staticelements")) {
					return;
				}
				Static127.aClass142_2 = Static256.method4648(Static127.aClass191_45, Static127.aClass2_Sub11_Sub6_2.aString23 + "_staticelements", Static58.aBoolean116);
			} else {
				Static127.aClass142_2 = new Class142(0);
			}
			Static127.method1632();
			Static85.anInt1831 = 70;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 70) {
			Static167.aClass98_6 = new Class98(arg0, 11, true, Static240.aCanvas4);
			Static85.anInt1831 = 73;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 73) {
			Static60.aClass98_3 = new Class98(arg0, 12, true, Static240.aCanvas4);
			Static85.anInt1831 = 76;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 76) {
			Static262.aClass98_7 = new Class98(arg0, 14, true, Static240.aCanvas4);
			Static85.anInt1831 = 79;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 79) {
			Static66.aClass98_5 = new Class98(arg0, 17, true, Static240.aCanvas4);
			Static85.anInt1831 = 82;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 82) {
			Static293.aClass98_8 = new Class98(arg0, 19, true, Static240.aCanvas4);
			Static85.anInt1831 = 85;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 85) {
			Static344.aClass98_10 = new Class98(arg0, 22, true, Static240.aCanvas4);
			Static85.anInt1831 = 88;
			Static126.method2619(true);
			Static295.method5215();
		} else if (Static85.anInt1831 == 88) {
			Static25.aClass98_4 = new Class98(arg0, 26, true, Static240.aCanvas4);
			Static85.anInt1831 = 91;
			Static126.method2619(true);
			Static295.method5215();
		} else {
			Static343.aClass98_9 = new Class98(arg0, 30, true, Static240.aCanvas4);
			Static85.anInt1831 = 100;
			Static126.method2619(true);
			Static295.method5215();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)V")
	public static void method3191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static147.anIntArray22[arg0] = arg1;
		@Pc(23) Class2_Sub30 local23 = (Class2_Sub30) Static23.aClass199_2.method5751((long) arg0);
		if (local23 == null) {
			local23 = new Class2_Sub30(4611686018427387905L);
			Static23.aClass199_2.method5749(local23, (long) arg0);
		} else if (local23.aLong125 != 4611686018427387905L) {
			local23.aLong125 = Static51.method1197() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
	public static void method3192() {
		Static300.anInt5860 = -1;
		Static10.anInt231 = -1;
		Static237.anInt4541 = 1;
		Static68.anInt1466 = 2;
		Static75.aBoolean146 = false;
		Static144.aClass191_93 = null;
		Static122.anInt4369 = 0;
	}
}
