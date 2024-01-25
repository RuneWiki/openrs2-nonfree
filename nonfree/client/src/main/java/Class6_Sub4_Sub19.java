import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class6_Sub4_Sub19 extends Class6_Sub4 {

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "[I")
	private final int[] anIntArray640;

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
	private final int[] anIntArray642;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "Lclient!uba;")
	private final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "Lclient!uba;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "Lclient!uba;")
	private final Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "[Lclient!uba;")
	private final Class6_Sub1[] aClass6_Sub1Array36;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	private Class6_Sub4_Sub19() {
		this.anIntArray640 = new int[0];
		this.anIntArray642 = new int[0];
		this.aClass6_Sub1_3 = new Class6_Sub1_Sub2(0);
		this.aClass6_Sub1_3.anInt10563 = 1;
		this.aClass6_Sub1_1 = new Class6_Sub1_Sub2();
		this.aClass6_Sub1_1.anInt10563 = 1;
		this.aClass6_Sub1_2 = new Class6_Sub1_Sub2();
		this.aClass6_Sub1_2.anInt10563 = 1;
		this.aClass6_Sub1Array36 = new Class6_Sub1[] { this.aClass6_Sub1_1, this.aClass6_Sub1_2, this.aClass6_Sub1_3 };
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class6_Sub4_Sub19(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(7) int local7 = arg0.method8374();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass6_Sub1Array36 = new Class6_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub1 local26 = Static585.method8097(arg0);
			if (local26.method8961() >= 0) {
				local9++;
			}
			if (local26.method8956() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method8374();
			}
			this.aClass6_Sub1Array36[local20] = local26;
		}
		this.anIntArray640 = new int[local9];
		this.anIntArray642 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class6_Sub1 local102 = this.aClass6_Sub1Array36[local95];
			local50 = local102.aClass6_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass6_Sub1Array42[local108] = this.aClass6_Sub1Array36[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method8961();
			@Pc(134) int local134 = local102.method8956();
			if (local130 > 0) {
				this.anIntArray640[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray642[local11++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass6_Sub1_1 = this.aClass6_Sub1Array36[arg0.method8374()];
		this.aClass6_Sub1_2 = this.aClass6_Sub1Array36[arg0.method8374()];
		this.aClass6_Sub1_3 = this.aClass6_Sub1Array36[arg0.method8374()];
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ae;DIILclient!d;ZIZ)[I")
	public int[] method8015(@OriginalArg(0) Class8 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static608.anInterface6_12 = arg3;
		Static207.aClass8_57 = arg0;
		for (@Pc(16) int local16 = 0; local16 < this.aClass6_Sub1Array36.length; local16++) {
			this.aClass6_Sub1Array36[local16].method8955(arg5, arg2);
		}
		Static40.method7250(arg1);
		Static540.method7691(arg2, arg5);
		@Pc(48) int[] local48 = new int[arg5 * arg2];
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(56) byte local56;
		if (arg6) {
			local54 = arg2 - 1;
			local56 = -1;
			local58 = -1;
		} else {
			local54 = 0;
			local56 = 1;
			local58 = arg2;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg5; local70++) {
			@Pc(90) int[] local90;
			@Pc(94) int[] local94;
			@Pc(86) int[] local86;
			if (this.aClass6_Sub1_1.aBoolean736) {
				@Pc(102) int[] local102 = this.aClass6_Sub1_1.method8954(local70);
				local86 = local102;
				local94 = local102;
				local90 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass6_Sub1_1.method8957(local70);
				local86 = local82[2];
				local90 = local82[0];
				local94 = local82[1];
			}
			if (arg4) {
				local68 = local70;
			}
			for (@Pc(114) int local114 = local54; local114 != local58; local114 += local56) {
				@Pc(122) int local122 = local90[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local94[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(157) int local157 = local86[local114] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local142 = Static293.anIntArray281[local142];
				local122 = Static293.anIntArray281[local122];
				local157 = Static293.anIntArray281[local157];
				@Pc(190) int local190 = local157 + (local142 << 8) + (local122 << 16);
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local48[local68++] = local190;
				if (arg4) {
					local68 += arg2 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass6_Sub1Array36.length; local229++) {
			this.aClass6_Sub1Array36[local229].method8952();
		}
		return local48;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!d;Lclient!ae;)Z")
	public boolean method8017(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) Class8 arg1) {
		@Pc(9) int local9;
		if (Static351.anInt5999 < 0) {
			for (local9 = 0; local9 < this.anIntArray640.length; local9++) {
				if (!arg1.method273(this.anIntArray640[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray640.length; local9++) {
				if (!arg1.method275(this.anIntArray640[local9], Static351.anInt5999)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray642.length; local9++) {
			if (!arg0.method7090(this.anIntArray642[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ae;IZIZLclient!d;D)[I")
	public int[] method8019(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface6 arg4, @OriginalArg(6) double arg5) {
		Static608.anInterface6_12 = arg4;
		Static207.aClass8_57 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array36.length; local11++) {
			this.aClass6_Sub1Array36[local11].method8955(arg2, arg1);
		}
		Static40.method7250(arg5);
		Static540.method7691(arg1, arg2);
		@Pc(39) int[] local39 = new int[arg1 * arg2];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(57) int[] local57;
			@Pc(55) int[] local55;
			if (this.aClass6_Sub1_1.aBoolean736) {
				local55 = this.aClass6_Sub1_1.method8954(local43);
				local57 = local55;
				local59 = local55;
				local61 = local55;
			} else {
				@Pc(69) int[][] local69 = this.aClass6_Sub1_1.method8957(local43);
				local59 = local69[1];
				local61 = local69[0];
				local57 = local69[2];
			}
			if (arg3) {
				local41 = local43;
			}
			if (this.aClass6_Sub1_2.aBoolean736) {
				local55 = this.aClass6_Sub1_2.method8954(local43);
			} else {
				local55 = this.aClass6_Sub1_2.method8957(local43)[0];
			}
			for (@Pc(109) int local109 = arg1 - 1; local109 >= 0; local109--) {
				@Pc(117) int local117 = local61[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(137) int local137 = local59[local109] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local57[local109] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				local117 = Static293.anIntArray281[local117];
				local137 = Static293.anIntArray281[local137];
				local154 = Static293.anIntArray281[local154];
				@Pc(195) int local195;
				if (local117 == 0 && local137 == 0 && local154 == 0) {
					local195 = 0;
				} else {
					local195 = local55[local109] >> 4;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 < 0) {
						local195 = 0;
					}
				}
				local39[local41++] = (local117 << 16) + (local195 << 24) + (local137 << 8) + local154;
				if (arg3) {
					local41 += arg1 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass6_Sub1Array36.length; local258++) {
			this.aClass6_Sub1Array36[local258].method8952();
		}
		return local39;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!d;IIILclient!ae;)[F")
	public float[] method8022(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8 arg4) {
		Static608.anInterface6_12 = arg1;
		Static207.aClass8_57 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array36.length; local11++) {
			this.aClass6_Sub1Array36[local11].method8955(arg3, arg2);
		}
		Static540.method7691(arg2, arg3);
		@Pc(42) float[] local42 = new float[arg3 * arg2 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			if (this.aClass6_Sub1_1.aBoolean736) {
				@Pc(78) int[] local78 = this.aClass6_Sub1_1.method8954(local46);
				local70 = local78;
				local66 = local78;
				local62 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass6_Sub1_1.method8957(local46);
				local62 = local58[0];
				local66 = local58[1];
				local70 = local58[2];
			}
			@Pc(96) int[] local96;
			if (this.aClass6_Sub1_2.aBoolean736) {
				local96 = this.aClass6_Sub1_2.method8954(local46);
			} else {
				local96 = this.aClass6_Sub1_2.method8957(local46)[0];
			}
			if (arg0) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass6_Sub1_3.aBoolean736) {
				local122 = this.aClass6_Sub1_3.method8954(local46);
			} else {
				local122 = this.aClass6_Sub1_3.method8957(local46)[0];
			}
			for (@Pc(134) int local134 = arg2 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local96[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local122[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local170 * (float) local62[local134];
				local42[local44++] = (float) local66[local134] * local170;
				local42[local44++] = local170 * (float) local70[local134];
				local42[local44++] = local143;
				if (arg0) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass6_Sub1Array36.length; local228++) {
			this.aClass6_Sub1Array36[local228].method8952();
		}
		return local42;
	}
}
