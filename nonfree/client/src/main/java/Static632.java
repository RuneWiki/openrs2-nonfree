import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Ljava/lang/Class;")
	private static Class aClass26;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	public static final int[] anIntArray584 = new int[32];

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
	public static int anInt10345 = 0;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
	public static final int[] anIntArray585 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
	public static int anInt10347 = -1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static void method8772() {
		@Pc(8) Class5_Sub36_Sub2 local8 = Static4.aClass389_17.aClass5_Sub36_Sub2_2;
		for (@Pc(17) int local17 = 0; local17 < Static149.anInt2925; local17++) {
			@Pc(23) int local23 = Static669.anIntArray619[local17];
			@Pc(31) Class4_Sub1_Sub1_Sub2_Sub2 local31 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) local23)).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			@Pc(35) int local35 = local8.method7291();
			if ((local35 & 0x4) != 0) {
				local35 += local8.method7291() << 8;
			}
			if ((local35 & 0x200) != 0) {
				local35 += local8.method7291() << 16;
			}
			if ((local35 & 0x20) != 0) {
				local31.anInt6918 = local8.method7333();
				local31.anInt6907 = local8.method7333();
			}
			@Pc(89) int local89;
			@Pc(92) int[] local92;
			@Pc(95) int[] local95;
			@Pc(97) int local97;
			@Pc(105) int local105;
			@Pc(114) int local114;
			if ((local35 & 0x1000) != 0) {
				local89 = local8.method7290();
				local92 = new int[local89];
				local95 = new int[local89];
				for (local97 = 0; local97 < local89; local97++) {
					local105 = local8.method7282();
					if ((local105 & 0xC000) == 49152) {
						local114 = local8.method7282();
						local92[local97] = local114 | local105 << 16;
					} else {
						local92[local97] = local105;
					}
					local95[local97] = local8.method7300();
				}
				local31.method5925(local92, local95);
			}
			if ((local35 & 0x40) != 0) {
				if (local31.aClass105_1.method2620()) {
					Static72.method1169(local31);
				}
				local31.method5947(Static378.aClass369_2.method8471(local8.method7316()));
				local31.method5931(local31.aClass105_1.anInt2811);
				local31.anInt6855 = local31.aClass105_1.anInt2841 << 3;
				if (local31.aClass105_1.method2620()) {
					Static114.method1694(local31, (Class354) null, 0, local31.aByte139, local31.anIntArray405[0], (Class4_Sub1_Sub1_Sub2_Sub1) null, local31.anIntArray404[0]);
				}
			}
			if ((local35 & 0x40000) != 0) {
				local31.aString80 = local8.method7281();
				if ("".equals(local31.aString80) || local31.aString80.equals(local31.aClass105_1.aString19)) {
					local31.aString80 = local31.aClass105_1.aString19;
				}
			}
			if ((local35 & 0x800) != 0) {
				local31.aByte100 = local8.method7272();
				local31.aByte103 = local8.method7332();
				local31.aByte104 = local8.method7332();
				local31.aByte102 = (byte) local8.method7280();
				local31.anInt6856 = Static565.anInt8921 + local8.method7333();
				local31.anInt6832 = Static565.anInt8921 + local8.method7333();
			}
			if ((local35 & 0x100) != 0) {
				local89 = local8.method7316();
				local31.anInt6882 = local8.method7330();
				local31.anInt6884 = local8.method7291();
				local31.aBoolean457 = (local89 & 0x8000) != 0;
				local31.anInt6847 = local89 & 0x7FFF;
				local31.anInt6868 = Static565.anInt8921 + local31.anInt6847 + local31.anInt6882;
			}
			@Pc(355) int local355;
			@Pc(359) int local359;
			if ((local35 & 0x400) != 0) {
				local89 = local8.method7300();
				if (local89 == 65535) {
					local89 = -1;
				}
				local355 = local8.method7274();
				local359 = local8.method7330();
				local97 = local359 & 0x7;
				local105 = local359 >> 3 & 0xF;
				if (local105 == 15) {
					local105 = -1;
				}
				local31.method5923(local97, 1, local355, local105, local89);
			}
			if ((local35 & 0x10000) != 0) {
				local31.anInt6901 = local8.method7282();
				if (local31.anInt6901 == 65535) {
					local31.anInt6901 = local31.aClass105_1.anInt2831;
				}
			}
			if ((local35 & 0x8000) != 0) {
				local31.anInt6887 = local8.method7272();
				local31.anInt6828 = local8.method7272();
				local31.anInt6861 = local8.method7272();
				local31.anInt6848 = local8.method7332();
				local31.anInt6893 = local8.method7282() + Static565.anInt8921;
				local31.anInt6835 = local8.method7282() + Static565.anInt8921;
				local31.anInt6875 = local8.method7280();
				local31.anInt6887 += local31.anIntArray405[0];
				local31.anInt6848 += local31.anIntArray404[0];
				local31.anInt6897 = 0;
				local31.anInt6861 += local31.anIntArray405[0];
				local31.anInt6828 += local31.anIntArray404[0];
				local31.anInt6895 = 1;
			}
			if ((local35 & 0x2000) != 0) {
				local89 = local8.method7290();
				local92 = new int[local89];
				local95 = new int[local89];
				@Pc(516) int[] local516 = new int[local89];
				for (local105 = 0; local105 < local89; local105++) {
					local114 = local8.method7316();
					if (local114 == 65535) {
						local114 = -1;
					}
					local92[local105] = local114;
					local95[local105] = local8.method7280();
					local516[local105] = local8.method7316();
				}
				Static440.method6337(local516, local95, local31, local92);
			}
			@Pc(628) int local628;
			@Pc(632) int local632;
			if ((local35 & 0x10) != 0) {
				local89 = local8.method7291();
				if (local89 > 0) {
					for (local355 = 0; local355 < local89; local355++) {
						local97 = -1;
						local105 = -1;
						local359 = local8.method7306();
						local114 = -1;
						if (local359 == 32767) {
							local359 = local8.method7306();
							local105 = local8.method7306();
							local97 = local8.method7306();
							local114 = local8.method7306();
						} else if (local359 == 32766) {
							local359 = -1;
						} else {
							local105 = local8.method7306();
						}
						local628 = local8.method7306();
						local632 = local8.method7290();
						local31.method5939(local628, local359, local632, Static565.anInt8921, local97, local114, local105);
					}
				}
			}
			@Pc(763) short[] local763;
			@Pc(706) int[] local706;
			@Pc(736) short[] local736;
			@Pc(808) long local808;
			if ((local35 & 0x4000) != 0) {
				local89 = local31.aClass105_1.anIntArray133.length;
				local355 = 0;
				if (local31.aClass105_1.aShortArray35 != null) {
					local355 = local31.aClass105_1.aShortArray35.length;
				}
				local359 = 0;
				if (local31.aClass105_1.aShortArray37 != null) {
					local359 = local31.aClass105_1.aShortArray37.length;
				}
				local97 = local8.method7280();
				if ((local97 & 0x1) == 1) {
					local31.aClass322_1 = null;
				} else {
					local706 = null;
					if ((local97 & 0x2) == 2) {
						local706 = new int[local89];
						for (local114 = 0; local114 < local89; local114++) {
							local706[local114] = local8.method7300();
						}
					}
					local736 = null;
					if ((local97 & 0x4) == 4) {
						local736 = new short[local355];
						for (local628 = 0; local628 < local355; local628++) {
							local736[local628] = (short) local8.method7282();
						}
					}
					local763 = null;
					if ((local97 & 0x8) == 8) {
						local763 = new short[local359];
						for (local632 = 0; local632 < local359; local632++) {
							local763[local632] = (short) local8.method7316();
						}
					}
					local808 = (long) local23 | (long) local31.anInt6902++ << 32;
					local31.aClass322_1 = new Class322(local808, local706, local736, local763);
				}
			}
			if ((local35 & 0x2) != 0) {
				@Pc(827) int[] local827 = new int[4];
				for (local355 = 0; local355 < 4; local355++) {
					local827[local355] = local8.method7300();
					if (local827[local355] == 65535) {
						local827[local355] = -1;
					}
				}
				local359 = local8.method7280();
				Static70.method1153(local359, local31, local827);
			}
			if ((local35 & 0x1) != 0) {
				local89 = local8.method7282();
				if (local89 == 65535) {
					local89 = -1;
				}
				local355 = local8.method7292();
				local359 = local8.method7330();
				local97 = local359 & 0x7;
				local105 = local359 >> 3 & 0xF;
				if (local105 == 15) {
					local105 = -1;
				}
				local31.method5923(local97, 0, local355, local105, local89);
			}
			if ((local35 & 0x20000) != 0) {
				local89 = local8.method7333();
				if (local89 == 65535) {
					local89 = -1;
				}
				local355 = local8.method7292();
				local359 = local8.method7291();
				local97 = local359 & 0x7;
				local105 = local359 >> 3 & 0xF;
				if (local105 == 15) {
					local105 = -1;
				}
				local31.method5923(local97, 2, local355, local105, local89);
			}
			if ((local35 & 0x80000) != 0) {
				local89 = local31.aClass105_1.anIntArray132.length;
				local355 = 0;
				if (local31.aClass105_1.aShortArray35 != null) {
					local355 = local31.aClass105_1.aShortArray35.length;
				}
				if (local31.aClass105_1.aShortArray37 != null) {
					local355 = local31.aClass105_1.aShortArray37.length;
				}
				local97 = local8.method7330();
				if ((local97 & 0x1) != 1) {
					local706 = null;
					if ((local97 & 0x2) == 2) {
						local706 = new int[local89];
						for (local114 = 0; local114 < local89; local114++) {
							local706[local114] = local8.method7316();
						}
					}
					local736 = null;
					if ((local97 & 0x4) == 4) {
						local736 = new short[local355];
						for (local628 = 0; local628 < local355; local628++) {
							local736[local628] = (short) local8.method7316();
						}
					}
					local763 = null;
					if ((local97 & 0x8) == 8) {
						local763 = new short[0];
						for (local632 = 0; local632 < 0; local632++) {
							local763[local632] = (short) local8.method7282();
						}
					}
					local808 = (long) local23 | (long) local31.anInt6912++ << 32;
					new Class322(local808, local706, local736, local763);
				}
			}
			if ((local35 & 0x80) != 0) {
				local31.aString79 = local8.method7281();
				local31.anInt6873 = 100;
			}
			if ((local35 & 0x8) != 0) {
				local31.anInt6863 = local8.method7316();
				if (local31.anInt6863 == 65535) {
					local31.anInt6863 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!jm;")
	public static Class164 method8776(@OriginalArg(2) Component arg0) {
		try {
			@Pc(34) Constructor local34 = Class.forName("lga").getDeclaredConstructor(aClass26 == null ? (aClass26 = Class376.a("java.awt.Component")) : aClass26, Boolean.TYPE);
			return (Class164) local34.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(52) Throwable local52) {
			return new Class164_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(FBIZIIII)[I")
	public static int[] method8777(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class5_Sub3_Sub9 local10 = new Class5_Sub3_Sub9();
		local10.anInt2155 = 8;
		local10.anInt2156 = 8;
		local10.anInt2151 = 35;
		local10.anInt2150 = (int) (arg0 * 4096.0F);
		local10.anInt2145 = 4;
		local10.aBoolean145 = true;
		local10.method9210();
		Static515.method7064(1, 2048);
		local10.method1917(local6, 0);
		return local6;
	}
}
