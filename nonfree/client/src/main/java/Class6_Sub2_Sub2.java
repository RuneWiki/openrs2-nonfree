import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "[I")
	private final int[] anIntArray88;

	@OriginalMember(owner = "client!cm", name = "E", descriptor = "[I")
	private final int[] anIntArray87;

	@OriginalMember(owner = "client!cm", name = "I", descriptor = "Lclient!lk;")
	private final Class6_Sub5 aClass6_Sub5_2;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "Lclient!lk;")
	private final Class6_Sub5 aClass6_Sub5_3;

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "Lclient!lk;")
	private final Class6_Sub5 aClass6_Sub5_1;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[Lclient!lk;")
	private final Class6_Sub5[] aClass6_Sub5Array7;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	private Class6_Sub2_Sub2() {
		this.anIntArray88 = new int[0];
		this.anIntArray87 = new int[0];
		this.aClass6_Sub5_2 = new Class6_Sub5_Sub13(0);
		this.aClass6_Sub5_2.anInt7987 = 1;
		this.aClass6_Sub5_3 = new Class6_Sub5_Sub13();
		this.aClass6_Sub5_3.anInt7987 = 1;
		this.aClass6_Sub5_1 = new Class6_Sub5_Sub13();
		this.aClass6_Sub5_1.anInt7987 = 1;
		this.aClass6_Sub5Array7 = new Class6_Sub5[] { this.aClass6_Sub5_3, this.aClass6_Sub5_1, this.aClass6_Sub5_2 };
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) Class6_Sub1 arg0) {
		@Pc(7) int local7 = arg0.method6433();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub5Array7 = new Class6_Sub5[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub5 local26 = Static206.method3171(arg0);
			if (local26.method6539() >= 0) {
				local9++;
			}
			if (local26.method6535() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub5Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method6433();
			}
			this.aClass6_Sub5Array7[local20] = local26;
		}
		this.anIntArray88 = new int[local9];
		local9 = 0;
		this.anIntArray87 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class6_Sub5 local98 = this.aClass6_Sub5Array7[local91];
			local50 = local98.aClass6_Sub5Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass6_Sub5Array42[local104] = this.aClass6_Sub5Array7[local14[local91][local104]];
			}
			@Pc(126) int local126 = local98.method6539();
			@Pc(130) int local130 = local98.method6535();
			if (local126 > 0) {
				this.anIntArray88[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray87[local11++] = local130;
			}
			local14[local91] = null;
		}
		this.aClass6_Sub5_3 = this.aClass6_Sub5Array7[arg0.method6433()];
		this.aClass6_Sub5_1 = this.aClass6_Sub5Array7[arg0.method6433()];
		this.aClass6_Sub5_2 = this.aClass6_Sub5Array7[arg0.method6433()];
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZZDLclient!ps;Lclient!he;I)[I")
	public int[] method1169(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Interface8 arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) int arg6) {
		Static402.anInterface8_7 = arg4;
		Static370.aClass100_75 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub5Array7.length; local11++) {
			this.aClass6_Sub5Array7[local11].method6547(arg0, arg6);
		}
		Static436.method6323(arg3);
		Static369.method3609(arg0, arg6);
		@Pc(39) int[] local39 = new int[arg6 * arg0];
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(43) byte local43;
		if (arg1) {
			local43 = -1;
			local45 = arg0 - 1;
			local47 = -1;
		} else {
			local43 = 1;
			local45 = 0;
			local47 = arg0;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg6; local67++) {
			@Pc(83) int[] local83;
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			if (this.aClass6_Sub5_3.aBoolean495) {
				@Pc(99) int[] local99 = this.aClass6_Sub5_3.method6537(local67);
				local91 = local99;
				local83 = local99;
				local87 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass6_Sub5_3.method6545(local67);
				local83 = local79[0];
				local87 = local79[2];
				local91 = local79[1];
			}
			if (arg2) {
				local65 = local67;
			}
			for (@Pc(111) int local111 = local45; local111 != local47; local111 += local43) {
				@Pc(119) int local119 = local83[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local91[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(157) int local157 = local87[local111] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local119 = Static234.anIntArray329[local119];
				local137 = Static234.anIntArray329[local137];
				if (local157 < 0) {
					local157 = 0;
				}
				local157 = Static234.anIntArray329[local157];
				@Pc(191) int local191 = local157 + (local119 << 16) + (local137 << 8);
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local39[local65++] = local191;
				if (arg2) {
					local65 += arg0 - 1;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass6_Sub5Array7.length; local234++) {
			this.aClass6_Sub5Array7[local234].method6541();
		}
		return local39;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!he;Lclient!ps;ZDIB)[I")
	public int[] method1171(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) double arg4, @OriginalArg(5) int arg5) {
		Static402.anInterface8_7 = arg2;
		Static370.aClass100_75 = arg1;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub5Array7.length; local19++) {
			this.aClass6_Sub5Array7[local19].method6547(arg5, arg0);
		}
		Static436.method6323(arg4);
		Static369.method3609(arg5, arg0);
		@Pc(53) int[] local53 = new int[arg0 * 4 * arg5];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
			@Pc(73) int[] local73;
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(69) int[] local69;
			if (this.aClass6_Sub5_3.aBoolean495) {
				local69 = this.aClass6_Sub5_3.method6537(local57);
				local71 = local69;
				local73 = local69;
				local75 = local69;
			} else {
				@Pc(83) int[][] local83 = this.aClass6_Sub5_3.method6545(local57);
				local75 = local83[2];
				local73 = local83[0];
				local71 = local83[1];
			}
			if (arg3) {
				local55 = local57;
			}
			if (this.aClass6_Sub5_1.aBoolean495) {
				local69 = this.aClass6_Sub5_1.method6537(local57);
			} else {
				local69 = this.aClass6_Sub5_1.method6545(local57)[0];
			}
			for (@Pc(123) int local123 = arg5 - 1; local123 >= 0; local123--) {
				@Pc(131) int local131 = local73[local123] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(149) int local149 = local71[local123] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				@Pc(169) int local169 = local75[local123] >> 4;
				if (local169 > 255) {
					local169 = 255;
				}
				local131 = Static234.anIntArray329[local131];
				if (local169 < 0) {
					local169 = 0;
				}
				local149 = Static234.anIntArray329[local149];
				local169 = Static234.anIntArray329[local169];
				@Pc(211) int local211;
				if (local131 == 0 && local149 == 0 && local169 == 0) {
					local211 = 0;
				} else {
					local211 = local69[local123] >> 4;
					if (local211 > 255) {
						local211 = 255;
					}
					if (local211 < 0) {
						local211 = 0;
					}
				}
				local53[local55++] = local169 + (local131 << 16) + (local211 << 24) + (local149 << 8);
				if (arg3) {
					local55 += arg5 - 1;
				}
			}
		}
		for (@Pc(263) int local263 = 0; local263 < this.aClass6_Sub5Array7.length; local263++) {
			this.aClass6_Sub5Array7[local263].method6541();
		}
		return local53;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ps;ILclient!he;)Z")
	public boolean method1173(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(9) int local9;
		if (Static147.anInt2987 < 0) {
			for (local9 = 0; local9 < this.anIntArray88.length; local9++) {
				if (!arg1.method2492(this.anIntArray88[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray88.length; local9++) {
				if (!arg1.method2495(this.anIntArray88[local9], Static147.anInt2987)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray87.length; local9++) {
			if (!arg0.method5562(this.anIntArray87[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!he;Lclient!ps;IIIZ)[F")
	public float[] method1174(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		Static402.anInterface8_7 = arg1;
		Static370.aClass100_75 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub5Array7.length; local11++) {
			this.aClass6_Sub5Array7[local11].method6547(arg2, arg3);
		}
		Static369.method3609(arg2, arg3);
		@Pc(42) float[] local42 = new float[arg2 * arg3 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			@Pc(62) int[] local62;
			if (this.aClass6_Sub5_3.aBoolean495) {
				@Pc(78) int[] local78 = this.aClass6_Sub5_3.method6537(local46);
				local62 = local78;
				local70 = local78;
				local66 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass6_Sub5_3.method6545(local46);
				local62 = local58[2];
				local66 = local58[0];
				local70 = local58[1];
			}
			@Pc(96) int[] local96;
			if (this.aClass6_Sub5_1.aBoolean495) {
				local96 = this.aClass6_Sub5_1.method6537(local46);
			} else {
				local96 = this.aClass6_Sub5_1.method6545(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass6_Sub5_2.aBoolean495) {
				local116 = this.aClass6_Sub5_2.method6537(local46);
			} else {
				local116 = this.aClass6_Sub5_2.method6545(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			for (@Pc(136) int local136 = arg2 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local116[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local172 * (float) local66[local136];
				local42[local44++] = (float) local70[local136] * local172;
				local42[local44++] = local172 * (float) local62[local136];
				local42[local44++] = local145;
				if (arg4) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass6_Sub5Array7.length; local226++) {
			this.aClass6_Sub5Array7[local226].method6541();
		}
		return local42;
	}
}
