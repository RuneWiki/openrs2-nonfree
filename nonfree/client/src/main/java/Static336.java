import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "[I")
	public static final int[] anIntArray435 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Z")
	public static final boolean aBoolean486 = false;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public static void method5170() {
		for (@Pc(7) int local7 = 0; local7 < Static18.anInt423; local7++) {
			@Pc(13) int local13 = Static15.anIntArray29[local7];
			@Pc(21) Class14_Sub1_Sub1_Sub3_Sub2 local21 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) local13)).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			@Pc(25) int local25 = Static167.aClass5_Sub12_Sub2_1.method8645();
			if ((local25 & 0x4) != 0) {
				local25 += Static167.aClass5_Sub12_Sub2_1.method8645() << 8;
			}
			if ((local25 & 0x8000) != 0) {
				local25 += Static167.aClass5_Sub12_Sub2_1.method8645() << 16;
			}
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(74) int local74;
			@Pc(68) int local68;
			@Pc(70) int local70;
			@Pc(76) int local76;
			@Pc(114) int local114;
			@Pc(118) int local118;
			if ((local25 & 0x40) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8607();
				if (local60 > 0) {
					for (local64 = 0; local64 < local60; local64++) {
						local68 = -1;
						local70 = -1;
						local74 = Static167.aClass5_Sub12_Sub2_1.method8614();
						local76 = -1;
						if (local74 == 32767) {
							local74 = Static167.aClass5_Sub12_Sub2_1.method8614();
							local70 = Static167.aClass5_Sub12_Sub2_1.method8614();
							local68 = Static167.aClass5_Sub12_Sub2_1.method8614();
							local76 = Static167.aClass5_Sub12_Sub2_1.method8614();
						} else if (local74 == 32766) {
							local74 = -1;
						} else {
							local70 = Static167.aClass5_Sub12_Sub2_1.method8614();
						}
						local114 = Static167.aClass5_Sub12_Sub2_1.method8614();
						local118 = Static167.aClass5_Sub12_Sub2_1.method8639();
						local21.method2520(local68, local70, local114, Static235.anInt3998, local74, local118, local76);
					}
				}
			}
			@Pc(150) int[] local150;
			@Pc(153) int[] local153;
			if ((local25 & 0x100) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8645();
				local150 = new int[local60];
				local153 = new int[local60];
				@Pc(156) int[] local156 = new int[local60];
				for (local70 = 0; local70 < local60; local70++) {
					local76 = Static167.aClass5_Sub12_Sub2_1.method8640();
					if (local76 == 65535) {
						local76 = -1;
					}
					local150[local70] = local76;
					local153[local70] = Static167.aClass5_Sub12_Sub2_1.method8639();
					local156[local70] = Static167.aClass5_Sub12_Sub2_1.method8640();
				}
				Static92.method8490(local153, local21, local156, local150);
			}
			if ((local25 & 0x400) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8633();
				if (local60 == 65535) {
					local60 = -1;
				}
				local64 = Static167.aClass5_Sub12_Sub2_1.method8650();
				local74 = Static167.aClass5_Sub12_Sub2_1.method8615();
				local68 = local74 & 0x7;
				local70 = local74 >> 3 & 0xF;
				if (local70 == 15) {
					local70 = -1;
				}
				local21.method2506(local70, local60, local64, 1, local68);
			}
			if ((local25 & 0x1000) != 0) {
				local21.aByte70 = Static167.aClass5_Sub12_Sub2_1.method8658();
				local21.aByte67 = Static167.aClass5_Sub12_Sub2_1.method8592();
				local21.aByte71 = Static167.aClass5_Sub12_Sub2_1.method8635();
				local21.aByte69 = (byte) Static167.aClass5_Sub12_Sub2_1.method8645();
				local21.anInt2955 = Static235.anInt3998 + Static167.aClass5_Sub12_Sub2_1.method8606();
				local21.anInt2915 = Static235.anInt3998 + Static167.aClass5_Sub12_Sub2_1.method8606();
			}
			if ((local25 & 0x2000) != 0) {
				local21.anInt2911 = Static167.aClass5_Sub12_Sub2_1.method8658();
				local21.anInt2920 = Static167.aClass5_Sub12_Sub2_1.method8592();
				local21.anInt2916 = Static167.aClass5_Sub12_Sub2_1.method8649();
				local21.anInt2909 = Static167.aClass5_Sub12_Sub2_1.method8635();
				local21.anInt2912 = Static167.aClass5_Sub12_Sub2_1.method8633() + Static235.anInt3998;
				local21.anInt2942 = Static167.aClass5_Sub12_Sub2_1.method8606() + Static235.anInt3998;
				local21.anInt2943 = Static167.aClass5_Sub12_Sub2_1.method8607();
				local21.anInt2911 += local21.anIntArray253[0];
				local21.anInt2973 = 0;
				local21.anInt2909 += local21.anIntArray252[0];
				local21.anInt2916 += local21.anIntArray253[0];
				local21.anInt2920 += local21.anIntArray252[0];
				local21.anInt2972 = 1;
			}
			if ((local25 & 0x8) != 0) {
				@Pc(384) int[] local384 = new int[4];
				for (local64 = 0; local64 < 4; local64++) {
					local384[local64] = Static167.aClass5_Sub12_Sub2_1.method8640();
					if (local384[local64] == 65535) {
						local384[local64] = -1;
					}
				}
				local74 = Static167.aClass5_Sub12_Sub2_1.method8639();
				Static647.method8880(local384, local21, local74);
			}
			if ((local25 & 0x20000) != 0) {
				local21.aString51 = Static167.aClass5_Sub12_Sub2_1.method8617();
				if ("".equals(local21.aString51) || local21.aString51.equals(local21.aClass271_1.aString110)) {
					local21.aString51 = local21.aClass271_1.aString110;
				}
			}
			if ((local25 & 0x10) != 0) {
				if (local21.aClass271_1.method6479()) {
					Static341.method5232(local21);
				}
				local21.method2534(Static258.aClass138_1.method3202(Static167.aClass5_Sub12_Sub2_1.method8631()));
				local21.method2525(local21.aClass271_1.anInt7335);
				local21.anInt2956 = local21.aClass271_1.anInt7342 << 3;
				if (local21.aClass271_1.method6479()) {
					Static600.method8380(local21, 0, local21.anIntArray253[0], (Class283) null, local21.aByte125, local21.anIntArray252[0], (Class14_Sub1_Sub1_Sub3_Sub1) null);
				}
			}
			if ((local25 & 0x10000) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8631();
				local64 = Static167.aClass5_Sub12_Sub2_1.method8650();
				if (local60 == 65535) {
					local60 = -1;
				}
				local74 = Static167.aClass5_Sub12_Sub2_1.method8615();
				local68 = local74 & 0x7;
				local70 = local74 >> 3 & 0xF;
				if (local70 == 15) {
					local70 = -1;
				}
				local21.method2506(local70, local60, local64, 2, local68);
			}
			if ((local25 & 0x2) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8640();
				if (local60 == 65535) {
					local60 = -1;
				}
				local64 = Static167.aClass5_Sub12_Sub2_1.method8629();
				local74 = Static167.aClass5_Sub12_Sub2_1.method8645();
				local68 = local74 & 0x7;
				local70 = local74 >> 3 & 0xF;
				if (local70 == 15) {
					local70 = -1;
				}
				local21.method2506(local70, local60, local64, 0, local68);
			}
			if ((local25 & 0x200) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8640();
				local21.anInt2908 = Static167.aClass5_Sub12_Sub2_1.method8615();
				local21.anInt2934 = Static167.aClass5_Sub12_Sub2_1.method8639();
				local21.anInt2927 = local60 & 0x7FFF;
				local21.aBoolean256 = (local60 & 0x8000) != 0;
				local21.anInt2965 = local21.anInt2908 + local21.anInt2927 + Static235.anInt3998;
			}
			if ((local25 & 0x1) != 0) {
				local21.anInt2982 = Static167.aClass5_Sub12_Sub2_1.method8606();
				local21.anInt2990 = Static167.aClass5_Sub12_Sub2_1.method8633();
			}
			if ((local25 & 0x80000) != 0) {
				local21.anInt2995 = Static167.aClass5_Sub12_Sub2_1.method8640();
				if (local21.anInt2995 == 65535) {
					local21.anInt2995 = local21.aClass271_1.anInt7310;
				}
			}
			@Pc(779) short[] local779;
			@Pc(750) short[] local750;
			@Pc(816) long local816;
			@Pc(724) int[] local724;
			if ((local25 & 0x4000) != 0) {
				local60 = local21.aClass271_1.anIntArray587.length;
				local64 = 0;
				if (local21.aClass271_1.aShortArray109 != null) {
					local64 = local21.aClass271_1.aShortArray109.length;
				}
				local74 = 0;
				if (local21.aClass271_1.aShortArray108 != null) {
					local74 = local21.aClass271_1.aShortArray108.length;
				}
				local68 = Static167.aClass5_Sub12_Sub2_1.method8645();
				if ((local68 & 0x1) == 1) {
					local21.aClass141_1 = null;
				} else {
					local724 = null;
					if ((local68 & 0x2) == 2) {
						local724 = new int[local60];
						for (local76 = 0; local76 < local60; local76++) {
							local724[local76] = Static167.aClass5_Sub12_Sub2_1.method8640();
						}
					}
					local750 = null;
					if ((local68 & 0x4) == 4) {
						local750 = new short[local64];
						for (local114 = 0; local114 < local64; local114++) {
							local750[local114] = (short) Static167.aClass5_Sub12_Sub2_1.method8633();
						}
					}
					local779 = null;
					if ((local68 & 0x8) == 8) {
						local779 = new short[local74];
						for (local118 = 0; local118 < local74; local118++) {
							local779[local118] = (short) Static167.aClass5_Sub12_Sub2_1.method8631();
						}
					}
					local816 = (long) local21.anInt2987++ << 32 | (long) local13;
					local21.aClass141_1 = new Class141(local816, local724, local750, local779);
				}
			}
			if ((local25 & 0x800) != 0) {
				local60 = Static167.aClass5_Sub12_Sub2_1.method8615();
				local150 = new int[local60];
				local153 = new int[local60];
				for (local68 = 0; local68 < local60; local68++) {
					local70 = Static167.aClass5_Sub12_Sub2_1.method8640();
					if ((local70 & 0xC000) == 49152) {
						local76 = Static167.aClass5_Sub12_Sub2_1.method8633();
						local150[local68] = local76 | local70 << 16;
					} else {
						local150[local68] = local70;
					}
					local153[local68] = Static167.aClass5_Sub12_Sub2_1.method8633();
				}
				local21.method2515(local153, local150);
			}
			if ((local25 & 0x40000) != 0) {
				local60 = local21.aClass271_1.anIntArray588.length;
				local64 = 0;
				if (local21.aClass271_1.aShortArray109 != null) {
					local64 = local21.aClass271_1.aShortArray109.length;
				}
				if (local21.aClass271_1.aShortArray108 != null) {
					local64 = local21.aClass271_1.aShortArray108.length;
				}
				local68 = Static167.aClass5_Sub12_Sub2_1.method8607();
				if ((local68 & 0x1) != 1) {
					local724 = null;
					if ((local68 & 0x2) == 2) {
						local724 = new int[local60];
						for (local76 = 0; local76 < local60; local76++) {
							local724[local76] = Static167.aClass5_Sub12_Sub2_1.method8633();
						}
					}
					local750 = null;
					if ((local68 & 0x4) == 4) {
						local750 = new short[local64];
						for (local114 = 0; local114 < local64; local114++) {
							local750[local114] = (short) Static167.aClass5_Sub12_Sub2_1.method8631();
						}
					}
					local779 = null;
					if ((local68 & 0x8) == 8) {
						local779 = new short[0];
						for (local118 = 0; local118 < 0; local118++) {
							local779[local118] = (short) Static167.aClass5_Sub12_Sub2_1.method8640();
						}
					}
					local816 = (long) local21.anInt2983++ << 32 | (long) local13;
					new Class141(local816, local724, local750, local779);
				}
			}
			if ((local25 & 0x20) != 0) {
				local21.anInt2951 = Static167.aClass5_Sub12_Sub2_1.method8640();
				if (local21.anInt2951 == 65535) {
					local21.anInt2951 = -1;
				}
			}
			if ((local25 & 0x80) != 0) {
				local21.aString50 = Static167.aClass5_Sub12_Sub2_1.method8617();
				local21.anInt2957 = 100;
			}
		}
	}
}
