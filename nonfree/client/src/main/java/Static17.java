import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_13 = new Class225(46, 1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public static void method245() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static403.aClass23Array1.length; local3++) {
				if (Static403.aClass23Array1[local3].method377()) {
					Static205.aLongArray3[local3] = Static403.aClass23Array1[local3].method376();
				} else {
					synchronized (Static403.aClass23Array1[local3]) {
						Static403.aClass23Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static403.aClass23Array1[Static403.aClass23Array1.length - 1].method380();
				Static373.method5319(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static403.aClass23Array1.length - 1; local3++) {
						if (!Static403.aClass23Array1[local3].method377()) {
							synchronized (Static403.aClass23Array1[local3]) {
								Static403.aClass23Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static403.aClass23Array1.length - 2; local106++) {
							Static403.aClass23Array1[local106].method380();
						}
						Static373.method5319(2);
						while (!Static403.aClass23Array1[0].method377()) {
							synchronized (Static403.aClass23Array1[0]) {
								Static403.aClass23Array1[0].notify();
							}
							try {
								Static570.method7907(1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static403.aClass23Array1[0].method380();
						return;
					}
					try {
						Static570.method7907(1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static570.method7907(1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)Z")
	public static boolean method246(@OriginalArg(0) int arg0) {
		return arg0 == 13 || arg0 == 51 || arg0 == 45 || arg0 == 57 || arg0 == 59 || arg0 == 15 || arg0 == 5 || arg0 == 20 || arg0 == 12 || arg0 == 17 || arg0 == 22;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIILclient!mda;)V")
	public static void method247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub38 arg4) {
		if (arg4.anInt6458 == -1 && arg4.anIntArray446 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg4.anInt6461 * Static650.aClass2_Sub30_29.aClass11_Sub5_1.method1696(1) >> 8;
		if (arg0 > arg4.anInt6454) {
			local19 = arg0 - arg4.anInt6454;
		} else if (arg0 < arg4.anInt6462) {
			local19 = arg4.anInt6462 - arg0;
		}
		if (arg4.anInt6465 < arg3) {
			local19 += arg3 - arg4.anInt6465;
		} else if (arg4.anInt6467 > arg3) {
			local19 += arg4.anInt6467 - arg3;
		}
		if (arg4.anInt6464 == 0 || local19 - 256 > arg4.anInt6464 || Static650.aClass2_Sub30_29.aClass11_Sub5_1.method1696(1) == 0 || arg4.anInt6455 != arg2) {
			if (arg4.aClass2_Sub23_Sub2_3 != null) {
				Static130.aClass2_Sub23_Sub3_1.method6797(arg4.aClass2_Sub23_Sub2_3);
				arg4.aClass2_Sub4_Sub1_4 = null;
				arg4.aClass2_Sub23_Sub2_3 = null;
				arg4.aClass2_Sub17_3 = null;
			}
			if (arg4.aClass2_Sub23_Sub2_4 != null) {
				Static130.aClass2_Sub23_Sub3_1.method6797(arg4.aClass2_Sub23_Sub2_4);
				arg4.aClass2_Sub17_2 = null;
				arg4.aClass2_Sub4_Sub1_3 = null;
				arg4.aClass2_Sub23_Sub2_4 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(182) int local182 = arg4.anInt6464 - arg4.anInt6459;
		if (local182 < 0) {
			local182 = arg4.anInt6464;
		}
		@Pc(192) int local192 = local29;
		@Pc(198) int local198 = local19 - arg4.anInt6459;
		if (local198 > 0 && local182 > 0) {
			local192 = local29 * (local182 - local198) / local182;
		}
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046();
		@Pc(228) int local228 = 8192;
		@Pc(238) int local238 = (arg4.anInt6462 + arg4.anInt6454) / 2 - arg0;
		@Pc(249) int local249 = (arg4.anInt6467 + arg4.anInt6465) / 2 - arg3;
		@Pc(275) int local275;
		@Pc(297) int local297;
		if (local238 != 0 || local249 != 0) {
			local275 = -Static611.anInt9456 - (int) (Math.atan2((double) local238, (double) local249) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local275 > 8192) {
				local275 = 16384 - local275;
			}
			if (local19 <= 0) {
				local297 = 8192;
			} else if (local19 >= 4096) {
				local297 = 16384;
			} else {
				local297 = local19 * 8192 / 4096 + 8192;
			}
			local228 = local275 * local297 / 8192 + (16384 - local297 >> 1);
		}
		@Pc(453) Class2_Sub23_Sub2 local453;
		if (arg4.aClass2_Sub23_Sub2_3 != null) {
			arg4.aClass2_Sub23_Sub2_3.method4499(local192);
			arg4.aClass2_Sub23_Sub2_3.method4510(local228);
		} else if (arg4.anInt6458 >= 0) {
			local275 = arg4.anInt6453 == 256 && arg4.anInt6457 == 256 ? 256 : Static231.method3315(arg4.anInt6457, arg4.anInt6453);
			if (arg4.aBoolean546) {
				if (arg4.aClass2_Sub17_3 == null) {
					arg4.aClass2_Sub17_3 = Static115.method1664(Static514.aClass254_129, arg4.anInt6458);
				}
				if (arg4.aClass2_Sub17_3 != null) {
					if (arg4.aClass2_Sub4_Sub1_4 == null) {
						arg4.aClass2_Sub4_Sub1_4 = arg4.aClass2_Sub17_3.method1672(new int[] { 22050 });
					}
					if (arg4.aClass2_Sub4_Sub1_4 != null) {
						local453 = Static733.method4506(arg4.aClass2_Sub4_Sub1_4, local275, local192 << 6, local228);
						local453.method4498(-1);
						Static130.aClass2_Sub23_Sub3_1.method6795(local453);
						arg4.aClass2_Sub23_Sub2_3 = local453;
					}
				}
			} else {
				@Pc(381) Class250 local381 = Static735.method6017(Static157.aClass254_60, arg4.anInt6458, 0);
				if (local381 != null) {
					@Pc(388) Class2_Sub4_Sub1 local388 = local381.method6019().method7558(Static182.aClass51_6);
					@Pc(396) Class2_Sub23_Sub2 local396 = Static733.method4506(local388, local275, local192 << 6, local228);
					local396.method4498(-1);
					Static130.aClass2_Sub23_Sub3_1.method6795(local396);
					arg4.aClass2_Sub23_Sub2_3 = local396;
				}
			}
		}
		if (arg4.aClass2_Sub23_Sub2_4 != null) {
			arg4.aClass2_Sub23_Sub2_4.method4499(local192);
			arg4.aClass2_Sub23_Sub2_4.method4510(local228);
			if (arg4.aClass2_Sub23_Sub2_4.method9871()) {
				return;
			}
			arg4.aClass2_Sub23_Sub2_4 = null;
			arg4.aClass2_Sub17_2 = null;
			arg4.aClass2_Sub4_Sub1_3 = null;
		} else if (arg4.anIntArray446 != null && (arg4.anInt6460 -= arg1) <= 0) {
			local275 = arg4.anInt6453 == 256 && arg4.anInt6457 == 256 ? 256 : (int) ((double) (arg4.anInt6453 - arg4.anInt6457) * Math.random()) + arg4.anInt6457;
			if (arg4.aBoolean545) {
				if (arg4.aClass2_Sub17_2 == null) {
					local297 = (int) ((double) arg4.anIntArray446.length * Math.random());
					arg4.aClass2_Sub17_2 = Static115.method1664(Static514.aClass254_129, arg4.anIntArray446[local297]);
				}
				if (arg4.aClass2_Sub17_2 != null) {
					if (arg4.aClass2_Sub4_Sub1_3 == null) {
						arg4.aClass2_Sub4_Sub1_3 = arg4.aClass2_Sub17_2.method1672(new int[] { 22050 });
					}
					if (arg4.aClass2_Sub4_Sub1_3 != null) {
						local453 = Static733.method4506(arg4.aClass2_Sub4_Sub1_3, local275, local192 << 6, local228);
						local453.method4498(0);
						Static130.aClass2_Sub23_Sub3_1.method6795(local453);
						arg4.aClass2_Sub23_Sub2_4 = local453;
						arg4.anInt6460 = (int) ((double) (arg4.anInt6456 - arg4.anInt6466) * Math.random()) + arg4.anInt6466;
						return;
					}
				}
				return;
			}
			local297 = (int) (Math.random() * (double) arg4.anIntArray446.length);
			@Pc(612) Class250 local612 = Static735.method6017(Static157.aClass254_60, arg4.anIntArray446[local297], 0);
			if (local612 != null) {
				@Pc(619) Class2_Sub4_Sub1 local619 = local612.method6019().method7558(Static182.aClass51_6);
				@Pc(627) Class2_Sub23_Sub2 local627 = Static733.method4506(local619, local275, local192 << 6, local228);
				local627.method4498(0);
				Static130.aClass2_Sub23_Sub3_1.method6795(local627);
				arg4.anInt6460 = arg4.anInt6466 + (int) (Math.random() * (double) (arg4.anInt6456 - arg4.anInt6466));
				arg4.aClass2_Sub23_Sub2_4 = local627;
				return;
			}
		}
	}
}
