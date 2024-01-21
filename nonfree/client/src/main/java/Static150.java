import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
	public static int anInt3363;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_987 = Static81.method1507("Loading )2 please wait)3");

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
	public static int anInt3361 = 0;

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "Lclient!dj;")
	public static Class24 aClass24_988 = aClass24_987;

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "[I")
	public static final int[] anIntArray283 = new int[100];

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_989 = Static81.method1507("<img=0>");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22 = arg1 - arg0;
		@Pc(27) int local27 = arg7 - arg6;
		@Pc(36) int local36 = (arg3 - arg4 << 16) / local27;
		@Pc(45) int local45 = (arg2 - arg5 << 16) / local22;
		@Pc(54) boolean local54;
		if (Static70.anInt3206 > 0 && Static70.anInt3206 % 10 < 5) {
			local54 = true;
		} else {
			local54 = false;
		}
		@Pc(70) int local70;
		@Pc(81) int local81;
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(120) int local120;
		@Pc(159) int local159;
		@Pc(165) int local165;
		for (@Pc(60) int local60 = 0; local60 < local22; local60++) {
			local70 = (local60 + 1) * local45 >> 16;
			@Pc(76) int local76 = local45 * local60 >> 16;
			local81 = local70 - local76;
			if (local81 > 0) {
				local76 += arg5;
				@Pc(102) int[][] local102 = Static65.anIntArrayArrayArray4[arg0 + local60 >> 6];
				for (local104 = 0; local104 < local27; local104++) {
					local112 = local36 * local104 >> 16;
					local120 = local36 * (local104 + 1) >> 16;
					@Pc(125) int local125 = local120 - local112;
					if (local125 > 0) {
						local112 += arg4;
						@Pc(137) int local137 = arg6 + local104 >> 6;
						if (local102[local137] != null) {
							local159 = (local60 + arg0 & 0x3F) + ((arg6 + local104 & 0x3F) << 6);
							local165 = local102[local137][local159];
							if (local165 != 0) {
								@Pc(173) Class1_Sub2_Sub5 local173 = Static37.method702(local165 - 1);
								if (local54 && Static137.anInt3096 == local173.anInt957) {
									@Pc(183) Class1_Sub23 local183 = new Class1_Sub23();
									local183.anInt4152 = local76;
									local183.anInt4149 = local112;
									local183.anInt4153 = local173.anInt957;
									Static83.aClass87_13.method2823(local183);
								}
								Static138.aClass1_Sub2_Sub8_Sub3Array18[local173.anInt957].method2347(local76 - 7, local112 + -7);
							}
						}
					}
				}
			}
		}
		if (Static178.aDouble11 == Static29.aDouble1) {
			for (@Pc(231) Class1_Sub6 local231 = (Class1_Sub6) Static162.aClass87_23.method2827(); local231 != null; local231 = (Class1_Sub6) Static162.aClass87_23.method2830()) {
				local81 = local231.anInt873;
				local81 = Static122.anInt2713 + Static189.anInt4212 - local81;
				local70 = local231.anInt879;
				local104 = (local81 - arg6) * (arg3 - arg4) / (arg7 - arg6) + arg4;
				local112 = local231.anInt872;
				local70 -= Static174.anInt3876;
				@Pc(285) int local285 = arg5 + (local70 - arg0) * (arg2 - arg5) / (arg1 - arg0);
				local120 = 16777215;
				@Pc(289) Class1_Sub2_Sub8_Sub5 local289 = null;
				if (local112 == 0) {
					if (Static178.aDouble11 == 3.0D) {
						local289 = Static176.aClass1_Sub2_Sub8_Sub5_41;
					}
					if (Static178.aDouble11 == 4.0D) {
						local289 = Static112.aClass1_Sub2_Sub8_Sub5_25;
					}
					if (Static178.aDouble11 == 6.0D) {
						local289 = Static59.aClass1_Sub2_Sub8_Sub5_16;
					}
					if (Static178.aDouble11 == 8.0D) {
						local289 = Static47.aClass1_Sub2_Sub8_Sub5_11;
					}
				}
				if (local112 == 1) {
					if (Static178.aDouble11 == 3.0D) {
						local289 = Static59.aClass1_Sub2_Sub8_Sub5_16;
					}
					if (Static178.aDouble11 == 4.0D) {
						local289 = Static47.aClass1_Sub2_Sub8_Sub5_11;
					}
					if (Static178.aDouble11 == 6.0D) {
						local289 = Static66.aClass1_Sub2_Sub8_Sub5_18;
					}
					if (Static178.aDouble11 == 8.0D) {
						local289 = Static5.aClass1_Sub2_Sub8_Sub5_3;
					}
				}
				if (local112 == 2) {
					if (Static178.aDouble11 == 3.0D) {
						local289 = Static66.aClass1_Sub2_Sub8_Sub5_18;
					}
					if (Static178.aDouble11 == 4.0D) {
						local289 = Static5.aClass1_Sub2_Sub8_Sub5_3;
					}
					local120 = 16755200;
					if (Static178.aDouble11 == 6.0D) {
						local289 = Static91.aClass1_Sub2_Sub8_Sub5_21;
					}
					if (Static178.aDouble11 == 8.0D) {
						local289 = Static184.aClass1_Sub2_Sub8_Sub5_37;
					}
				}
				if (local289 != null) {
					@Pc(383) Class24[] local383 = local231.aClass24Array5;
					local159 = local383.length;
					local104 -= local289.method3509() * (local159 - 1) / 2;
					local104 += local289.method3508() / 2;
					for (local165 = 0; local165 < local159; local165++) {
						local289.method3502(local383[local165], local285, local104, local120);
						local104 += local289.method3509();
					}
				}
			}
		}
		for (@Pc(438) Class1_Sub23 local438 = (Class1_Sub23) Static83.aClass87_13.method2827(); local438 != null; local438 = (Class1_Sub23) Static83.aClass87_13.method2830()) {
			Static138.aClass1_Sub2_Sub8_Sub3Array18[local438.anInt4153].method2347(local438.anInt4152 - 7, local438.anInt4149 - 7);
			Static90.method3484(local438.anInt4152, local438.anInt4149, 15, 16776960, 128);
			Static90.method3484(local438.anInt4152, local438.anInt4149, 7, 16777215, 256);
		}
		Static83.aClass87_13.method2831();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!vc;)I")
	public static int method2584(@OriginalArg(0) int arg0, @OriginalArg(2) Class98 arg1) {
		if (arg1.anIntArrayArray34 == null || arg0 >= arg1.anIntArrayArray34.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray34[arg0];
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local31++];
				@Pc(38) byte local38 = 0;
				@Pc(40) int local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 15) {
					local38 = 1;
				}
				if (local36 == 16) {
					local38 = 2;
				}
				if (local36 == 1) {
					local40 = Static122.anIntArray212[local20[local31++]];
				}
				if (local36 == 17) {
					local38 = 3;
				}
				if (local36 == 2) {
					local40 = Static30.anIntArray75[local20[local31++]];
				}
				if (local36 == 3) {
					local40 = Static136.anIntArray251[local20[local31++]];
				}
				@Pc(108) int local108;
				@Pc(119) Class98 local119;
				@Pc(124) int local124;
				@Pc(136) int local136;
				if (local36 == 4) {
					local108 = local20[local31++] << 16;
					@Pc(115) int local115 = local108 + local20[local31++];
					local119 = Static188.method3229(local115);
					local124 = local20[local31++];
					if (local124 != -1 && (!Static168.method2886(local124).aBoolean197 || Static155.aBoolean139)) {
						for (local136 = 0; local136 < local119.anIntArray393.length; local136++) {
							if (local124 + 1 == local119.anIntArray393[local136]) {
								local40 += local119.anIntArray386[local136];
							}
						}
					}
				}
				if (local36 == 5) {
					local40 = Static122.anIntArray213[local20[local31++]];
				}
				if (local36 == 6) {
					local40 = Class1_Sub24.anIntArray382[Static30.anIntArray75[local20[local31++]] - 1];
				}
				if (local36 == 7) {
					local40 = Static122.anIntArray213[local20[local31++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local40 = Static87.aClass5_Sub2_Sub1_1.anInt620;
				}
				if (local36 == 9) {
					for (local108 = 0; local108 < 25; local108++) {
						if (Static204.aBooleanArray19[local108]) {
							local40 += Static30.anIntArray75[local108];
						}
					}
				}
				if (local36 == 10) {
					local108 = local20[local31++] << 16;
					local108 += local20[local31++];
					local119 = Static188.method3229(local108);
					local124 = local20[local31++];
					if (local124 != -1 && (!Static168.method2886(local124).aBoolean197 || Static155.aBoolean139)) {
						for (local136 = 0; local136 < local119.anIntArray393.length; local136++) {
							if (local124 + 1 == local119.anIntArray393[local136]) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local40 = Static158.anInt3516;
				}
				if (local36 == 12) {
					local40 = Static65.anInt1650;
				}
				if (local36 == 13) {
					local108 = Static122.anIntArray213[local20[local31++]];
					@Pc(329) int local329 = local20[local31++];
					local40 = (0x1 << local329 & local108) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local108 = local20[local31++];
					local40 = Static43.method797(local108);
				}
				if (local36 == 18) {
					local40 = (Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7) + Static196.anInt4343;
				}
				if (local36 == 19) {
					local40 = Static127.anInt2789 + (Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7);
				}
				if (local36 == 20) {
					local40 = local20[local31++];
				}
				if (local38 == 0) {
					if (local29 == 0) {
						local27 += local40;
					}
					if (local29 == 1) {
						local27 -= local40;
					}
					if (local29 == 2 && local40 != 0) {
						local27 /= local40;
					}
					if (local29 == 3) {
						local27 *= local40;
					}
					local29 = 0;
				} else {
					local29 = local38;
				}
			}
		} catch (@Pc(438) Exception local438) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[B)V")
	public static void method2585(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class1_Sub7 local4 = new Class1_Sub7(arg0);
		local4.anInt3592 = arg0.length - 2;
		Static96.anInt2211 = local4.method2765();
		Static80.anIntArray164 = new int[Static96.anInt2211];
		Static53.aByteArrayArray5 = new byte[Static96.anInt2211][];
		Static35.anIntArray360 = new int[Static96.anInt2211];
		Static153.anIntArray291 = new int[Static96.anInt2211];
		Static85.anIntArray288 = new int[Static96.anInt2211];
		local4.anInt3592 = arg0.length - Static96.anInt2211 * 8 - 7;
		Static83.anInt2001 = local4.method2765();
		Static201.anInt4511 = local4.method2765();
		@Pc(60) int local60 = (local4.method2771() & 0xFF) + 1;
		for (@Pc(62) int local62 = 0; local62 < Static96.anInt2211; local62++) {
			Static80.anIntArray164[local62] = local4.method2765();
		}
		for (@Pc(85) int local85 = 0; local85 < Static96.anInt2211; local85++) {
			Static35.anIntArray360[local85] = local4.method2765();
		}
		for (@Pc(102) int local102 = 0; local102 < Static96.anInt2211; local102++) {
			Static85.anIntArray288[local102] = local4.method2765();
		}
		for (@Pc(115) int local115 = 0; local115 < Static96.anInt2211; local115++) {
			Static153.anIntArray291[local115] = local4.method2765();
		}
		local4.anInt3592 = arg0.length + 3 - Static96.anInt2211 * 8 - local60 * 3 - 7;
		Static148.anIntArray279 = new int[local60];
		for (@Pc(150) int local150 = 1; local150 < local60; local150++) {
			Static148.anIntArray279[local150] = local4.method2745();
			if (Static148.anIntArray279[local150] == 0) {
				Static148.anIntArray279[local150] = 1;
			}
		}
		local4.anInt3592 = 0;
		for (@Pc(178) int local178 = 0; local178 < Static96.anInt2211; local178++) {
			@Pc(183) int local183 = Static85.anIntArray288[local178];
			@Pc(187) int local187 = Static153.anIntArray291[local178];
			@Pc(191) int local191 = local187 * local183;
			@Pc(194) byte[] local194 = new byte[local191];
			Static53.aByteArrayArray5[local178] = local194;
			@Pc(202) int local202 = local4.method2771();
			@Pc(209) int local209;
			if (local202 == 0) {
				for (local209 = 0; local209 < local191; local209++) {
					local194[local209] = local4.method2770();
				}
			} else if (local202 == 1) {
				for (local209 = 0; local209 < local183; local209++) {
					for (@Pc(229) int local229 = 0; local229 < local187; local229++) {
						local194[local209 + local229 * local183] = local4.method2770();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIZ)V")
	public static void method2587(@OriginalArg(3) boolean arg0) {
		Static106.anInt2399 = 2;
		Static138.aBoolean145 = arg0;
		Static148.anInt3288 = 22050;
	}
}
