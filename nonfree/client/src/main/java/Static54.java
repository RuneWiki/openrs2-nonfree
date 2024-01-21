import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
	public static int anInt1732;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!ea;")
	private static Class18 aClass18_431 = Static8.method128("Loading title screen )2 ");

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_430 = aClass18_431;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt1730 = 0;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public static int anInt1731 = 0;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array3 = new Class1_Sub1_Sub8_Sub3[1000];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method1133() {
		while (true) {
			@Pc(10) Class59 local10 = Static164.aClass59_58;
			@Pc(17) Class1_Sub7 local17;
			synchronized (Static164.aClass59_58) {
				local17 = (Class1_Sub7) Static57.aClass59_27.method2423();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass16_Sub1_14.method2265((int) local17.aLong139, false, local17.aClass69_2, local17.aByteArray5);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	public static int method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!dd;ZLclient!dd;)V")
	public static void method1136(@OriginalArg(1) Class16 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class16 arg2) {
		Static173.aClass16_38 = arg0;
		Static132.aClass16_24 = arg2;
		Static161.aBoolean196 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	public static void method1137() {
		anIntArray137 = null;
		aByteArrayArray9 = null;
		aClass18_430 = null;
		aClass1_Sub1_Sub8_Sub3Array3 = null;
		aClass18_431 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!qa;II)V")
	public static void method1138(@OriginalArg(1) Class1_Sub1_Sub5_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		if ((arg1 & 0x10) != 0) {
			local9 = Static167.aClass1_Sub6_Sub1_3.method518();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(17) Class1_Sub6 local17 = new Class1_Sub6(local12);
			Static167.aClass1_Sub6_Sub1_3.method529(local9, local12);
			Static85.aClass1_Sub6Array1[arg2] = local17;
			arg0.method2487(local17);
		}
		if ((arg1 & 0x100) != 0) {
			arg0.anInt3552 = Static167.aClass1_Sub6_Sub1_3.method550();
			local9 = Static167.aClass1_Sub6_Sub1_3.method535();
			arg0.anInt3601 = local9 >> 16;
			arg0.anInt3565 = Static41.anInt1322 + (local9 & 0xFFFF);
			if (arg0.anInt3552 == 65535) {
				arg0.anInt3552 = -1;
			}
			arg0.anInt3577 = 0;
			arg0.anInt3567 = 0;
			if (arg0.anInt3565 > Static41.anInt1322) {
				arg0.anInt3567 = -1;
			}
		}
		if ((arg1 & 0x1) != 0) {
			arg0.anInt3595 = Static167.aClass1_Sub6_Sub1_3.method541();
			arg0.anInt3588 = Static167.aClass1_Sub6_Sub1_3.method522();
		}
		if ((arg1 & 0x40) != 0) {
			arg0.aClass18_899 = Static167.aClass1_Sub6_Sub1_3.method510();
			if (arg0.aClass18_899.method736(0) == 126) {
				arg0.aClass18_899 = arg0.aClass18_899.method733(1);
				Static88.method1922(arg0.aClass18_908, 2, arg0.aClass18_899);
			} else if (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1 == arg0) {
				Static88.method1922(arg0.aClass18_908, 2, arg0.aClass18_899);
			}
			arg0.anInt3571 = 0;
			arg0.anInt3584 = 0;
			arg0.anInt3575 = 150;
		}
		@Pc(159) int local159;
		if ((arg1 & 0x8) != 0) {
			local9 = Static167.aClass1_Sub6_Sub1_3.method550();
			local159 = Static167.aClass1_Sub6_Sub1_3.method544();
			if (local9 == 65535) {
				local9 = -1;
			}
			Static83.method3200(local159, local9, arg0);
		}
		if ((arg1 & 0x2) != 0) {
			arg0.anInt3566 = Static167.aClass1_Sub6_Sub1_3.method546();
			if (arg0.anInt3566 == 65535) {
				arg0.anInt3566 = -1;
			}
		}
		if ((arg1 & 0x4) != 0) {
			local9 = Static167.aClass1_Sub6_Sub1_3.method544();
			local159 = Static167.aClass1_Sub6_Sub1_3.method518();
			arg0.method2478(Static41.anInt1322, local9, local159);
			arg0.anInt3604 = Static41.anInt1322 + 300;
			arg0.anInt3600 = Static167.aClass1_Sub6_Sub1_3.method533();
			arg0.anInt3598 = Static167.aClass1_Sub6_Sub1_3.method498();
		}
		if ((arg1 & 0x80) != 0) {
			local9 = Static167.aClass1_Sub6_Sub1_3.method522();
			local159 = Static167.aClass1_Sub6_Sub1_3.method518();
			@Pc(241) int local241 = Static167.aClass1_Sub6_Sub1_3.method533();
			@Pc(244) int local244 = Static167.aClass1_Sub6_Sub1_3.anInt839;
			if (arg0.aClass18_908 != null && arg0.aClass31_2 != null) {
				@Pc(252) boolean local252 = false;
				@Pc(257) long local257 = arg0.aClass18_908.method727();
				if (local159 <= 1) {
					for (@Pc(262) int local262 = 0; local262 < Static39.anInt1205; local262++) {
						if (local257 == Static162.aLongArray6[local262]) {
							local252 = true;
							break;
						}
					}
				}
				if (!local252 && Static107.anInt3144 == 0) {
					Static80.aClass1_Sub6_2.anInt839 = 0;
					Static167.aClass1_Sub6_Sub1_3.method534(local241, Static80.aClass1_Sub6_2.aByteArray3);
					Static80.aClass1_Sub6_2.anInt839 = 0;
					@Pc(309) Class18 local309 = Static67.method2014(Static82.method1801(Static80.aClass1_Sub6_2).method725());
					arg0.aClass18_899 = local309.method726();
					arg0.anInt3571 = local9 >> 8;
					arg0.anInt3584 = local9 & 0xFF;
					arg0.anInt3575 = 150;
					if (local159 == 2 || local159 == 3) {
						Static88.method1922(Static144.method2735(new Class18[] { Static95.aClass18_743, arg0.aClass18_908 }), 1, local309);
					} else if (local159 == 1) {
						Static88.method1922(Static144.method2735(new Class18[] { Static73.aClass18_464, arg0.aClass18_908 }), 1, local309);
					} else {
						Static88.method1922(arg0.aClass18_908, 2, local309);
					}
				}
			}
			Static167.aClass1_Sub6_Sub1_3.anInt839 = local241 + local244;
		}
		if ((arg1 & 0x200) != 0) {
			local9 = Static167.aClass1_Sub6_Sub1_3.method533();
			local159 = Static167.aClass1_Sub6_Sub1_3.method533();
			arg0.method2478(Static41.anInt1322, local9, local159);
			arg0.anInt3604 = Static41.anInt1322 + 300;
			arg0.anInt3600 = Static167.aClass1_Sub6_Sub1_3.method544();
			arg0.anInt3598 = Static167.aClass1_Sub6_Sub1_3.method544();
		}
		if ((arg1 & 0x400) == 0) {
			return;
		}
		arg0.anInt3592 = Static167.aClass1_Sub6_Sub1_3.method498();
		arg0.anInt3555 = Static167.aClass1_Sub6_Sub1_3.method533();
		arg0.anInt3596 = Static167.aClass1_Sub6_Sub1_3.method533();
		arg0.anInt3559 = Static167.aClass1_Sub6_Sub1_3.method498();
		arg0.anInt3563 = Static167.aClass1_Sub6_Sub1_3.method546() + Static41.anInt1322;
		arg0.anInt3580 = Static167.aClass1_Sub6_Sub1_3.method550() + Static41.anInt1322;
		arg0.anInt3574 = Static167.aClass1_Sub6_Sub1_3.method544();
		arg0.anInt3556 = 0;
		arg0.anInt3561 = 1;
	}
}
