import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
	public static boolean aBoolean85;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_5 = new Class229(7, 14);

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	public static int anInt1365 = 0;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "[B")
	public static final byte[] aByteArray25 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!paa;)V")
	public static void method1285(@OriginalArg(1) Class229 arg0) {
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(45) int local45;
		@Pc(51) int local51;
		@Pc(63) int local63;
		@Pc(155) int local155;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(83) int local83;
		@Pc(89) int local89;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(39) boolean local39;
		if (Static322.aClass229_17 == arg0) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = Static535.anInt9012 * 2 + (local12 >> 4 & 0xF);
			local31 = Static192.anInt3402 * 2 + (local12 & 0xF);
			local39 = Static97.aClass1_Sub6_Sub2_1.method3922() != 0;
			local45 = Static97.aClass1_Sub6_Sub2_1.method3928() + local23;
			local51 = Static97.aClass1_Sub6_Sub2_1.method3928() + local31;
			local55 = Static97.aClass1_Sub6_Sub2_1.method3964();
			local59 = Static97.aClass1_Sub6_Sub2_1.method3964();
			local63 = Static97.aClass1_Sub6_Sub2_1.method3967();
			@Pc(67) byte local67 = Static97.aClass1_Sub6_Sub2_1.method3928();
			local73 = Static97.aClass1_Sub6_Sub2_1.method3922() * 4;
			local77 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local83 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local89 = Static97.aClass1_Sub6_Sub2_1.method3922();
			if (local89 == 255) {
				local89 = -1;
			}
			@Pc(100) int local100 = Static97.aClass1_Sub6_Sub2_1.method3967();
			if (local23 >= 0 && local31 >= 0 && local23 < Static459.anInt7799 * 2 && Static459.anInt7799 * 2 > local31 && local45 >= 0 && local51 >= 0 && local45 < Static482.anInt7990 * 2 && local51 < Static482.anInt7990 * 2 && local63 != 65535) {
				local45 = local45 * 256;
				local73 <<= 0x2;
				local155 = local67 << 2;
				local31 *= 256;
				local23 = local23 * 256;
				local51 = local51 * 256;
				local100 <<= 0x2;
				if (local55 != 0) {
					@Pc(175) Class49_Sub2_Sub2 local175 = null;
					@Pc(191) int local191;
					@Pc(181) int local181;
					@Pc(185) int local185;
					if (local55 >= 0) {
						local181 = local55 - 1;
						local185 = local181 & 0x7FF;
						local191 = local181 >> 11 & 0xF;
						@Pc(198) Class1_Sub17 local198 = (Class1_Sub17) Static380.aClass17_29.method738((long) local185);
						if (local198 != null) {
							local175 = local198.aClass49_Sub2_Sub2_Sub2_2;
						}
					} else {
						local181 = -local55 - 1;
						local185 = local181 & 0x7FF;
						local191 = local181 >> 11 & 0xF;
						if (Static198.anInt3873 == local185) {
							local175 = Static63.aClass49_Sub2_Sub2_Sub1_1;
						} else {
							local175 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local185];
						}
					}
					if (local175 != null) {
						@Pc(235) Class230 local235 = local175.method3799();
						if (local235.anIntArrayArray84 != null && local235.anIntArrayArray84[local191] != null) {
							local185 = local235.anIntArrayArray84[local191][0];
							@Pc(257) int local257 = local235.anIntArrayArray84[local191][2];
							@Pc(262) int local262 = local175.aClass143_7.method3599();
							@Pc(266) int local266 = Class310.anIntArray827[local262];
							@Pc(270) int local270 = Class310.anIntArray826[local262];
							@Pc(280) int local280 = local270 * local185 + local257 * local266 >> 14;
							@Pc(291) int local291 = local257 * local270 - local266 * local185 >> 14;
							local23 += local280;
							local155 -= local235.anIntArrayArray84[local191][1];
							local31 += local291;
						}
					}
				}
				@Pc(331) Class49_Sub2_Sub1 local331 = new Class49_Sub2_Sub1(local63, Static32.anInt747, local23, local31, local155, local77 + Static436.anInt6850, Static436.anInt6850 + local83, local89, local100, local59, local73, local39);
				local331.method1373(Static38.method884(Static32.anInt747, local45, local51) - local73, local45, Static436.anInt6850 + local77, local51);
				Static522.aClass37_104.method970(new Class1_Sub1_Sub15(local331));
			}
			return;
		}
		@Pc(539) Class49_Sub2_Sub1 local539;
		if (arg0 == Static267.aClass229_14) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = Static535.anInt9012 * 2 + (local12 >> 4 & 0xF);
			local31 = Static192.anInt3402 * 2 + (local12 & 0xF);
			local39 = Static97.aClass1_Sub6_Sub2_1.method3922() != 0;
			local45 = Static97.aClass1_Sub6_Sub2_1.method3928() + local23;
			local51 = Static97.aClass1_Sub6_Sub2_1.method3928() + local31;
			local55 = Static97.aClass1_Sub6_Sub2_1.method3964();
			local59 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local63 = Static97.aClass1_Sub6_Sub2_1.method3922() * 4;
			local155 = Static97.aClass1_Sub6_Sub2_1.method3922() * 4;
			local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local77 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local83 = Static97.aClass1_Sub6_Sub2_1.method3922();
			if (local83 == 255) {
				local83 = -1;
			}
			local89 = Static97.aClass1_Sub6_Sub2_1.method3967();
			if (local23 >= 0 && local31 >= 0 && Static459.anInt7799 * 2 > local23 && local31 < Static459.anInt7799 * 2 && local45 >= 0 && local51 >= 0 && Static482.anInt7990 * 2 > local45 && Static482.anInt7990 * 2 > local51 && local59 != 65535) {
				local89 <<= 0x2;
				local45 = local45 * 256;
				local31 = local31 * 256;
				local155 <<= 0x2;
				local51 = local51 * 256;
				local23 *= 256;
				local63 <<= 0x2;
				local539 = new Class49_Sub2_Sub1(local59, Static32.anInt747, local23, local31, local63, Static436.anInt6850 + local73, local77 - -Static436.anInt6850, local83, local89, local55, local155, local39);
				local539.method1373(Static38.method884(Static32.anInt747, local45, local51) - local155, local45, Static436.anInt6850 + local73, local51);
				Static522.aClass37_104.method970(new Class1_Sub1_Sub15(local539));
			}
			return;
		}
		@Pc(588) int local588;
		if (arg0 == Static123.aClass229_6) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = (local12 & 0x7) + Static192.anInt3402;
			local31 = Static534.anInt9007 + local23;
			local588 = (local12 >> 4 & 0x7) + Static535.anInt9012;
			local45 = local588 + Static470.anInt7897;
			local51 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local55 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local59 = Static97.aClass1_Sub6_Sub2_1.method3967();
			if (Static255.aClass17_20 != null) {
				@Pc(622) Class1_Sub26 local622 = (Class1_Sub26) Static255.aClass17_20.method738((long) (Static32.anInt747 << 28 | local31 << 14 | local45));
				if (local622 != null) {
					for (@Pc(630) Class1_Sub38 local630 = (Class1_Sub38) local622.aClass37_48.method977(); local630 != null; local630 = (Class1_Sub38) local622.aClass37_48.method971()) {
						if ((local51 & 0x7FFF) == local630.anInt7117 && local630.anInt7119 == local55) {
							local630.method7525();
							local630.anInt7119 = local59;
							Static370.method7390(local45, local31, Static32.anInt747, local630);
							break;
						}
					}
					if (local588 >= 0 && local23 >= 0 && Static459.anInt7799 > local588 && Static482.anInt7990 > local23) {
						Static424.method6219(local588, local23, Static32.anInt747);
					}
				}
			}
		} else if (arg0 == Static177.aClass229_10) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3916();
			local23 = Static97.aClass1_Sub6_Sub2_1.method3943();
			local31 = Static97.aClass1_Sub6_Sub2_1.method3914();
			local588 = Static97.aClass1_Sub6_Sub2_1.method3941();
			local45 = Static192.anInt3402 + (local588 & 0x7);
			local51 = local45 + Static534.anInt9007;
			local55 = (local588 >> 4 & 0x7) + Static535.anInt9012;
			local59 = local55 + Static470.anInt7897;
			if (local12 != Static198.anInt3873) {
				@Pc(754) boolean local754 = local55 >= 0 && local45 >= 0 && Static459.anInt7799 > local55 && local45 < Static482.anInt7990;
				if (local754 || Static512.method7097(Static271.anInt5150)) {
					Static370.method7390(local59, local51, Static32.anInt747, new Class1_Sub38(local31, local23));
					if (local754) {
						Static424.method6219(local55, local45, Static32.anInt747);
					}
				}
			}
		} else if (arg0 == Static339.aClass229_20) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3912();
			local23 = local12 >> 2;
			local31 = local12 & 0x3;
			local588 = Static280.anIntArray530[local23];
			local45 = Static97.aClass1_Sub6_Sub2_1.method3912();
			local51 = (local45 >> 4 & 0x7) + Static535.anInt9012;
			local55 = (local45 & 0x7) + Static192.anInt3402;
			local59 = Static97.aClass1_Sub6_Sub2_1.method3967();
			if (Static512.method7097(Static271.anInt5150) || local51 >= 0 && local55 >= 0 && local51 < Static459.anInt7799 && Static482.anInt7990 > local55) {
				Static165.method2542(local23, local51, local31, local588, local59, local55, Static32.anInt747);
			}
		} else if (arg0 == Static158.aClass229_7) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = (local12 >> 4 & 0x7) + Static535.anInt9012;
			local31 = (local12 & 0x7) + Static192.anInt3402;
			local588 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local45 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local51 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local55 = Static97.aClass1_Sub6_Sub2_1.method3922();
			if (local23 >= 0 && local31 >= 0 && local23 < Static459.anInt7799 && Static482.anInt7990 > local31) {
				local59 = local23 * 512 + 256;
				local63 = local31 * 512 + 256;
				local155 = Static32.anInt747;
				if (local155 < 3 && Static505.method7002(local31, local23)) {
					local155++;
				}
				@Pc(960) Class49_Sub2_Sub5 local960 = new Class49_Sub2_Sub5(local588, local51, Static436.anInt6850, Static32.anInt747, local155, local59, Static38.method884(Static32.anInt747, local59, local63) - local45, local63, local23, local23, local31, local31, local55);
				Static266.aClass37_105.method970(new Class1_Sub1_Sub12(local960));
			}
		} else if (arg0 == Static429.aClass229_28) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3941();
			local23 = Static535.anInt9012 + (local12 >> 4 & 0x7);
			local31 = (local12 & 0x7) + Static192.anInt3402;
			local588 = Static97.aClass1_Sub6_Sub2_1.method3912();
			local45 = local588 >> 2;
			local51 = local588 & 0x3;
			local55 = Static280.anIntArray530[local45];
			if (Static512.method7097(Static271.anInt5150) || local23 >= 0 && local31 >= 0 && Static459.anInt7799 > local23 && Static482.anInt7990 > local31) {
				Static165.method2542(local45, local23, local51, local55, -1, local31, Static32.anInt747);
			}
		} else if (Static357.aClass229_22 == arg0) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = Static192.anInt3402 + (local12 & 0x7);
			local31 = Static534.anInt9007 + local23;
			local588 = Static535.anInt9012 + (local12 >> 4 & 0x7);
			local45 = Static470.anInt7897 + local588;
			local51 = Static97.aClass1_Sub6_Sub2_1.method3914();
			local55 = Static97.aClass1_Sub6_Sub2_1.method3943();
			@Pc(1108) boolean local1108 = local588 >= 0 && local23 >= 0 && Static459.anInt7799 > local588 && local23 < Static482.anInt7990;
			if (local1108 || Static512.method7097(Static271.anInt5150)) {
				Static370.method7390(local45, local31, Static32.anInt747, new Class1_Sub38(local55, local51));
				if (local1108) {
					Static424.method6219(local588, local23, Static32.anInt747);
				}
			}
		} else if (arg0 == Static544.aClass229_31) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local23 = Static97.aClass1_Sub6_Sub2_1.method3922();
			Static308.aClass96_4.method2274(local12).method953(local23);
		} else if (arg0 == aClass229_5) {
			@Pc(1163) byte local1163 = Static97.aClass1_Sub6_Sub2_1.method3911();
			local23 = Static97.aClass1_Sub6_Sub2_1.method3941();
			local31 = local23 >> 2;
			local588 = local23 & 0x3;
			local45 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local51 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local55 = Static97.aClass1_Sub6_Sub2_1.method3941();
			local59 = (local55 >> 4 & 0x7) + Static535.anInt9012;
			local63 = (local55 & 0x7) + Static192.anInt3402;
			local155 = Static97.aClass1_Sub6_Sub2_1.method3939();
			local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
			@Pc(1215) byte local1215 = Static97.aClass1_Sub6_Sub2_1.method3928();
			@Pc(1219) byte local1219 = Static97.aClass1_Sub6_Sub2_1.method3928();
			@Pc(1223) byte local1223 = Static97.aClass1_Sub6_Sub2_1.method3911();
			if (!Static513.aClass122_10.method7267()) {
				Static518.method7136(local73, local1219, local155, local51, local1215, Static32.anInt747, local1163, local45, local59, local1223, local588, local31, local63);
			}
		} else if (arg0 == Static300.aClass229_15) {
			Static97.aClass1_Sub6_Sub2_1.method3922();
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = Static535.anInt9012 + (local12 >> 4 & 0x7);
			local31 = (local12 & 0x7) + Static192.anInt3402;
			local588 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local45 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local51 = Static97.aClass1_Sub6_Sub2_1.method3920();
			@Pc(1285) String local1285 = Static97.aClass1_Sub6_Sub2_1.method3954();
			Static69.method1249(local51, local23, local1285, Static32.anInt747, local588, local45, local31);
		} else if (Static379.aClass229_30 == arg0) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3941();
			local23 = local12 >> 2;
			local31 = local12 & 0x3;
			local588 = Static280.anIntArray530[local23];
			local45 = Static97.aClass1_Sub6_Sub2_1.method3918();
			local51 = (local45 >> 4 & 0x7) + Static535.anInt9012;
			local55 = Static192.anInt3402 + (local45 & 0x7);
			local59 = Static97.aClass1_Sub6_Sub2_1.method3916();
			if (local59 == 65535) {
				local59 = -1;
			}
			Static497.method6755(local51, local59, local55, local31, Static32.anInt747, local23, local588);
		} else if (Static345.aClass229_21 == arg0) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = (local12 >> 4 & 0x7) + Static535.anInt9012;
			local31 = (local12 & 0x7) + Static192.anInt3402;
			local588 = Static97.aClass1_Sub6_Sub2_1.method3967();
			if (local588 == 65535) {
				local588 = -1;
			}
			local45 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local51 = local45 >> 4 & 0xF;
			local55 = local45 & 0x7;
			local59 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local63 = Static97.aClass1_Sub6_Sub2_1.method3922();
			if (local23 >= 0 && local31 >= 0 && local23 < Static459.anInt7799 && Static482.anInt7990 > local31) {
				local155 = local51 + 1;
				if (Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0] >= local23 - local155 && local155 + local23 >= Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0] && local31 - local155 <= Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] && Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] <= local155 + local31) {
					Static486.method6641(local63, (Static32.anInt747 << 24) + (local23 << 16) + (local31 << 8) + local51, local588, local55, local59);
				}
			}
		} else if (Static314.aClass229_16 == arg0) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			local23 = (local12 & 0x7) + Static192.anInt3402;
			local31 = local23 + Static534.anInt9007;
			local588 = Static535.anInt9012 + (local12 >> 4 & 0x7);
			local45 = Static470.anInt7897 + local588;
			local51 = Static97.aClass1_Sub6_Sub2_1.method3916();
			@Pc(1540) Class1_Sub26 local1540 = (Class1_Sub26) Static255.aClass17_20.method738((long) (local31 << 14 | Static32.anInt747 << 28 | local45));
			if (local1540 != null) {
				for (@Pc(1548) Class1_Sub38 local1548 = (Class1_Sub38) local1540.aClass37_48.method977(); local1548 != null; local1548 = (Class1_Sub38) local1540.aClass37_48.method971()) {
					if ((local51 & 0x7FFF) == local1548.anInt7117) {
						local1548.method7525();
						break;
					}
				}
				if (local1540.aClass37_48.method968()) {
					local1540.method7525();
				}
				if (local588 >= 0 && local23 >= 0 && Static459.anInt7799 > local588 && local23 < Static482.anInt7990) {
					Static424.method6219(local588, local23, Static32.anInt747);
				}
			}
		} else if (arg0 == Static250.aClass229_13) {
			local12 = Static97.aClass1_Sub6_Sub2_1.method3922();
			@Pc(1613) boolean local1613 = (local12 & 0x80) != 0;
			local31 = Static535.anInt9012 + (local12 >> 3 & 0x7);
			local588 = (local12 & 0x7) + Static192.anInt3402;
			local45 = Static97.aClass1_Sub6_Sub2_1.method3928() + local31;
			local51 = local588 + Static97.aClass1_Sub6_Sub2_1.method3928();
			local55 = Static97.aClass1_Sub6_Sub2_1.method3964();
			local59 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local63 = Static97.aClass1_Sub6_Sub2_1.method3922() * 4;
			local155 = Static97.aClass1_Sub6_Sub2_1.method3922() * 4;
			local73 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local77 = Static97.aClass1_Sub6_Sub2_1.method3967();
			local83 = Static97.aClass1_Sub6_Sub2_1.method3922();
			if (local83 == 255) {
				local83 = -1;
			}
			local89 = Static97.aClass1_Sub6_Sub2_1.method3967();
			if (local31 >= 0 && local588 >= 0 && local31 < Static459.anInt7799 && Static482.anInt7990 > local588 && local45 >= 0 && local51 >= 0 && local45 < Static459.anInt7799 && local51 < Static482.anInt7990 && local59 != 65535) {
				local51 = local51 * 512 + 256;
				local89 <<= 0x2;
				local588 = local588 * 512 + 256;
				local45 = local45 * 512 + 256;
				local155 <<= 0x2;
				local31 = local31 * 512 + 256;
				local63 <<= 0x2;
				local539 = new Class49_Sub2_Sub1(local59, Static32.anInt747, local31, local588, local63, Static436.anInt6850 + local73, local77 - -Static436.anInt6850, local83, local89, local55, local155, local1613);
				local539.method1373(Static38.method884(Static32.anInt747, local45, local51) - local155, local45, Static436.anInt6850 + local73, local51);
				Static522.aClass37_104.method970(new Class1_Sub1_Sub15(local539));
			}
		} else {
			Static234.method4051(null, "T3 - " + arg0);
			Static123.method2107(false);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!jc;)I")
	public static int method1286(@OriginalArg(1) Class49_Sub2_Sub2_Sub2 arg0) {
		@Pc(8) Class196 local8 = arg0.aClass196_1;
		if (local8.anIntArray570 != null) {
			local8 = local8.method4855(Static251.aClass119_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt5691;
		@Pc(32) Class230 local32 = arg0.method3799();
		if (arg0.aBoolean306) {
			local28 = local8.anInt5699;
		} else if (arg0.anInt4282 == local32.anInt6382 || local32.anInt6408 == arg0.anInt4282 || arg0.anInt4282 == local32.anInt6378 || local32.anInt6390 == arg0.anInt4282) {
			local28 = local8.anInt5709;
		} else if (arg0.anInt4282 == local32.anInt6377 || local32.anInt6398 == arg0.anInt4282 || arg0.anInt4282 == local32.anInt6400 || local32.anInt6407 == arg0.anInt4282) {
			local28 = local8.anInt5716;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IC)I")
	public static int method1288(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class1_Sub3_Sub13.anIntArray248.length > arg0 ? Class1_Sub3_Sub13.anIntArray248[arg0] : -1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public static void method1289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class255 local28 = Static242.aClass255ArrayArrayArray2[local9][arg0][arg1] = Static242.aClass255ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte107--;
				for (@Pc(40) Class63 local40 = local28.aClass63_3; local40 != null; local40 = local40.aClass63_1) {
					@Pc(44) Class49_Sub2 local44 = local40.aClass49_Sub2_1;
					if (local44.aShort117 == arg0 && local44.aShort116 == arg1) {
						local44.aByte98--;
					}
				}
			}
		}
		if (Static242.aClass255ArrayArrayArray2[0][arg0][arg1] == null) {
			Static242.aClass255ArrayArrayArray2[0][arg0][arg1] = new Class255(0, arg0, arg1);
			Static242.aClass255ArrayArrayArray2[0][arg0][arg1].aByte101 = 1;
		}
		Static242.aClass255ArrayArrayArray2[0][arg0][arg1].aClass255_1 = local7;
		Static242.aClass255ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
