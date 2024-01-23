import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_126;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1278 = Static231.method3737("Loading interfaces )2 ");

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1279 = Static231.method3737("Angreifen");

	@OriginalMember(owner = "client!va", name = "db", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1280 = aClass107_1278;

	@OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
	public static int anInt4746 = 0;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)V")
	public static void method3554(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub20 local10 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg0);
		if (local10 != null) {
			local10.method3735();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!o;IIIZ)V")
	public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg1 * arg1 + arg0 * arg0;
		if (local8 > 360000) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg2.anInt3280 / 2, arg2.anInt3270 / 2);
		if (local8 <= local31 * local31) {
			Static200.method2573(arg4, Static116.aClass1_Sub2_Sub2Array7[arg3], arg1, arg0, arg2, arg5);
			return;
		}
		local31 -= 10;
		@Pc(43) int local43 = Static123.anInt2690 + Static79.anInt1741 & 0x7FF;
		@Pc(47) int local47 = Class45.anIntArray159[local43];
		@Pc(51) int local51 = Class45.anIntArray156[local43];
		@Pc(59) int local59 = local51 * 256 / (Static174.anInt3796 + 256);
		@Pc(67) int local67 = local47 * 256 / (Static174.anInt3796 + 256);
		@Pc(78) int local78 = local59 * arg0 - arg1 * local67 >> 16;
		@Pc(88) int local88 = arg1 * local59 + local67 * arg0 >> 16;
		@Pc(94) double local94 = Math.atan2((double) local88, (double) local78);
		@Pc(101) int local101 = (int) ((double) local31 * Math.sin(local94));
		@Pc(108) int local108 = (int) (Math.cos(local94) * (double) local31);
		((Class1_Sub2_Sub2_Sub1) Static11.aClass1_Sub2_Sub2Array1[arg3]).method211(local101 + arg2.anInt3280 / 2 + arg5 - 10, -local108 + arg4 - -(arg2.anInt3270 / 2) - 10, local94);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!jb;Lclient!jb;I)V")
	public static void method3557(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1) {
		Static115.aClass28_46 = arg0;
		Static189.aClass28_65 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ed;III)V")
	public static void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static204.aClass5_Sub5_Sub1_2 == arg1 || Static8.anInt259 >= 400) {
			return;
		}
		@Pc(64) Class107 local64;
		if (arg1.anInt1277 == 0) {
			local64 = Static149.method2437(new Class107[] { arg1.method1018(), Static104.method2403(Static204.aClass5_Sub5_Sub1_2.anInt1286, arg1.anInt1286), Static232.aClass107_1156, Static49.aClass107_353, Static115.method2001(arg1.anInt1286), Static159.aClass107_930 });
		} else {
			local64 = Static149.method2437(new Class107[] { arg1.method1018(), Static232.aClass107_1156, Static128.aClass107_747, Static115.method2001(arg1.anInt1277), Static159.aClass107_930 });
		}
		@Pc(105) int local105;
		if (Static167.anInt3590 == 1) {
			Static137.method2291(Static149.method2437(new Class107[] { Static6.aClass107_820, Static220.aClass107_1301, local64 }), arg3, (short) 36, arg2, (long) arg0, Static13.aClass107_124);
		} else if (!Static56.aBoolean124) {
			for (local105 = 7; local105 >= 0; local105--) {
				if (Static175.aClass107Array22[local105] != null) {
					@Pc(119) short local119 = 0;
					if (Static46.anInt1029 == 0 && Static175.aClass107Array22[local105].method3096(Static95.aClass107_581)) {
						if (Static204.aClass5_Sub5_Sub1_2.anInt1286 < arg1.anInt1286) {
							local119 = 2000;
						}
						if (Static204.aClass5_Sub5_Sub1_2.anInt1287 != 0 && arg1.anInt1287 != 0) {
							if (arg1.anInt1287 == Static204.aClass5_Sub5_Sub1_2.anInt1287) {
								local119 = 2000;
							} else {
								local119 = 0;
							}
						}
					} else if (Static43.aBooleanArray8[local105]) {
						local119 = 2000;
					}
					@Pc(180) short local180 = Static140.aShortArray13[local105];
					@Pc(185) short local185 = (short) (local180 + local119);
					Static137.method2291(Static149.method2437(new Class107[] { Static125.aClass107_735, local64 }), arg3, local185, arg2, (long) arg0, Static175.aClass107Array22[local105]);
				}
			}
		} else if ((Static172.anInt3729 & 0x8) == 8) {
			Static137.method2291(Static149.method2437(new Class107[] { Static219.aClass107_1291, Static220.aClass107_1301, local64 }), arg3, (short) 57, arg2, (long) arg0, Static71.aClass107_470);
		}
		for (local105 = 0; local105 < Static8.anInt259; local105++) {
			if (Static106.aShortArray30[local105] == 20) {
				Static168.aClass107Array21[local105] = Static149.method2437(new Class107[] { Static125.aClass107_735, local64 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ej;BLclient!vf;I)V")
	public static void method3559(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class1_Sub26 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class1_Sub10 local5 = new Class1_Sub10();
		local5.anInt1556 = arg1.method2945();
		local5.anInt1560 = arg1.method2958();
		local5.aClass84Array1 = new Class84[local5.anInt1556];
		local5.aClass84Array2 = new Class84[local5.anInt1556];
		local5.anIntArray137 = new int[local5.anInt1556];
		local5.aByteArrayArrayArray5 = new byte[local5.anInt1556][][];
		local5.anIntArray135 = new int[local5.anInt1556];
		local5.anIntArray134 = new int[local5.anInt1556];
		for (@Pc(55) int local55 = 0; local55 < local5.anInt1556; local55++) {
			try {
				@Pc(61) int local61 = arg1.method2945();
				@Pc(89) String local89;
				@Pc(98) String local98;
				@Pc(102) int local102;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local89 = new String(arg1.method2978().method3116());
					local98 = new String(arg1.method2978().method3116());
					local102 = 0;
					if (local61 == 1) {
						local102 = arg1.method2958();
					}
					local5.anIntArray134[local55] = local61;
					local5.anIntArray137[local55] = local102;
					local5.aClass84Array1[local55] = arg0.method1063(local98, Static77.method1354(local89));
				} else if (local61 == 3 || local61 == 4) {
					local89 = new String(arg1.method2978().method3116());
					local98 = new String(arg1.method2978().method3116());
					local102 = arg1.method2945();
					@Pc(105) String[] local105 = new String[local102];
					for (@Pc(107) int local107 = 0; local107 < local102; local107++) {
						local105[local107] = new String(arg1.method2978().method3116());
					}
					@Pc(131) byte[][] local131 = new byte[local102][];
					@Pc(142) int local142;
					if (local61 == 3) {
						for (@Pc(136) int local136 = 0; local136 < local102; local136++) {
							local142 = arg1.method2958();
							local131[local136] = new byte[local142];
							arg1.method2959(local131[local136], local142);
						}
					}
					@Pc(162) Class[] local162 = new Class[local102];
					local5.anIntArray134[local55] = local61;
					for (local142 = 0; local142 < local102; local142++) {
						local162[local142] = Static77.method1354(local105[local142]);
					}
					local5.aClass84Array2[local55] = arg0.method1067(local162, local98, Static77.method1354(local89));
					local5.aByteArrayArrayArray5[local55] = local131;
				}
			} catch (@Pc(260) ClassNotFoundException local260) {
				local5.anIntArray135[local55] = -1;
			} catch (@Pc(267) SecurityException local267) {
				local5.anIntArray135[local55] = -2;
			} catch (@Pc(274) NullPointerException local274) {
				local5.anIntArray135[local55] = -3;
			} catch (@Pc(281) Exception local281) {
				local5.anIntArray135[local55] = -4;
			} catch (@Pc(288) Throwable local288) {
				local5.anIntArray135[local55] = -5;
			}
		}
		Static114.aClass120_13.method3567(local5);
	}
}
