import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class2_Sub10_Sub17 extends Class2_Sub10 {

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
	private final int[] anIntArray1191;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "[I")
	private final int[] anIntArray1192;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "Lclient!ol;")
	private final Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!uj", name = "R", descriptor = "Lclient!ol;")
	private final Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "Lclient!ol;")
	private final Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[Lclient!ol;")
	private final Class2_Sub4[] aClass2_Sub4Array38;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	private Class2_Sub10_Sub17() {
		this.anIntArray1191 = new int[0];
		this.anIntArray1192 = new int[0];
		this.aClass2_Sub4_2 = new Class2_Sub4_Sub37(0);
		this.aClass2_Sub4_2.anInt6518 = 1;
		this.aClass2_Sub4_3 = new Class2_Sub4_Sub37();
		this.aClass2_Sub4_3.anInt6518 = 1;
		this.aClass2_Sub4_1 = new Class2_Sub4_Sub37();
		this.aClass2_Sub4_1.anInt6518 = 1;
		this.aClass2_Sub4Array38 = new Class2_Sub4[] { this.aClass2_Sub4_3, this.aClass2_Sub4_1, this.aClass2_Sub4_2 };
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!kk;)V")
	public Class2_Sub10_Sub17(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(7) int local7 = arg0.method5350();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub4Array38 = new Class2_Sub4[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub4 local26 = Static359.method5245(arg0);
			if (local26.method5595() >= 0) {
				local9++;
			}
			if (local26.method5590() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass2_Sub4Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method5350();
			}
			this.aClass2_Sub4Array38[local20] = local26;
		}
		this.anIntArray1192 = new int[local9];
		local9 = 0;
		this.anIntArray1191 = new int[local11];
		local11 = 0;
		for (@Pc(98) int local98 = 0; local98 < local7; local98++) {
			@Pc(105) Class2_Sub4 local105 = this.aClass2_Sub4Array38[local98];
			local53 = local105.aClass2_Sub4Array42.length;
			for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
				local105.aClass2_Sub4Array42[local111] = this.aClass2_Sub4Array38[local18[local98][local111]];
			}
			@Pc(137) int local137 = local105.method5595();
			@Pc(141) int local141 = local105.method5590();
			if (local137 > 0) {
				this.anIntArray1192[local9++] = local137;
			}
			if (local141 > 0) {
				this.anIntArray1191[local11++] = local141;
			}
			local18[local98] = null;
		}
		this.aClass2_Sub4_3 = this.aClass2_Sub4Array38[arg0.method5350()];
		this.aClass2_Sub4_1 = this.aClass2_Sub4Array38[arg0.method5350()];
		this.aClass2_Sub4_2 = this.aClass2_Sub4Array38[arg0.method5350()];
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILclient!nl;ZLclient!tq;I)[F")
	public float[] method5035(@OriginalArg(1) int arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) int arg4) {
		Static176.anInterface9_4 = arg3;
		Static57.aClass171_48 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array38.length; local11++) {
			this.aClass2_Sub4Array38[local11].method5592(arg0, arg4);
		}
		Static176.method3101(arg0, arg4);
		@Pc(42) float[] local42 = new float[arg4 * arg0 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			@Pc(62) int[] local62;
			if (this.aClass2_Sub4_3.aBoolean465) {
				@Pc(78) int[] local78 = this.aClass2_Sub4_3.method5589(local46);
				local62 = local78;
				local66 = local78;
				local70 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass2_Sub4_3.method5594(local46);
				local62 = local58[2];
				local66 = local58[0];
				local70 = local58[1];
			}
			@Pc(94) int[] local94;
			if (this.aClass2_Sub4_1.aBoolean465) {
				local94 = this.aClass2_Sub4_1.method5589(local46);
			} else {
				local94 = this.aClass2_Sub4_1.method5594(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass2_Sub4_2.aBoolean465) {
				local116 = this.aClass2_Sub4_2.method5589(local46);
			} else {
				local116 = this.aClass2_Sub4_2.method5594(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg0 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local116[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local170 * (float) local66[local134];
				local42[local44++] = (float) local70[local134] * local170;
				local42[local44++] = local170 * (float) local62[local134];
				local42[local44++] = local143;
				if (arg2) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass2_Sub4Array38.length; local233++) {
			this.aClass2_Sub4Array38[local233].method5587();
		}
		return local42;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILclient!tq;DIBLclient!nl;)[I")
	public int[] method5037(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class171 arg5) {
		Static57.aClass171_48 = arg5;
		Static176.anInterface9_4 = arg2;
		for (@Pc(16) int local16 = 0; local16 < this.aClass2_Sub4Array38.length; local16++) {
			this.aClass2_Sub4Array38[local16].method5592(arg4, arg1);
		}
		Static29.method510(arg3);
		Static176.method3101(arg4, arg1);
		@Pc(50) int[] local50 = new int[arg1 * arg4 * 4];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg1; local54++) {
			@Pc(78) int[] local78;
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			@Pc(86) int[] local86;
			if (this.aClass2_Sub4_3.aBoolean465) {
				local86 = this.aClass2_Sub4_3.method5589(local54);
				local78 = local86;
				local74 = local86;
				local70 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass2_Sub4_3.method5594(local54);
				local70 = local66[1];
				local74 = local66[2];
				local78 = local66[0];
			}
			if (arg0) {
				local52 = local54;
			}
			if (this.aClass2_Sub4_1.aBoolean465) {
				local86 = this.aClass2_Sub4_1.method5589(local54);
			} else {
				local86 = this.aClass2_Sub4_1.method5594(local54)[0];
			}
			for (@Pc(120) int local120 = arg4 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local78[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(145) int local145 = local70[local120] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(165) int local165 = local74[local120] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				if (local165 < 0) {
					local165 = 0;
				}
				local145 = Static52.anIntArray215[local145];
				local128 = Static52.anIntArray215[local128];
				local165 = Static52.anIntArray215[local165];
				@Pc(202) int local202;
				if (local128 == 0 && local145 == 0 && local165 == 0) {
					local202 = 0;
				} else {
					local202 = local86[local120] >> 4;
					if (local202 > 255) {
						local202 = 255;
					}
					if (local202 < 0) {
						local202 = 0;
					}
				}
				local50[local52++] = local165 + (local128 << 16) + (local202 << 24) + (local145 << 8);
				if (arg0) {
					local52 += arg4 - 1;
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.aClass2_Sub4Array38.length; local259++) {
			this.aClass2_Sub4Array38[local259].method5587();
		}
		return local50;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!nl;ILclient!tq;IZZD)[I")
	public int[] method5038(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) double arg6) {
		Static176.anInterface9_4 = arg3;
		Static57.aClass171_48 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array38.length; local11++) {
			this.aClass2_Sub4Array38[local11].method5592(arg2, arg0);
		}
		Static29.method510(arg6);
		Static176.method3101(arg2, arg0);
		@Pc(41) int[] local41 = new int[arg2 * arg0];
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(45) byte local45;
		if (arg4) {
			local45 = -1;
			local49 = arg2 - 1;
			local51 = -1;
		} else {
			local51 = arg2;
			local45 = 1;
			local49 = 0;
		}
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			if (arg5) {
				local61 = local63;
			}
			@Pc(91) int[] local91;
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			if (this.aClass2_Sub4_3.aBoolean465) {
				@Pc(99) int[] local99 = this.aClass2_Sub4_3.method5589(local63);
				local91 = local99;
				local83 = local99;
				local87 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass2_Sub4_3.method5594(local63);
				local83 = local79[1];
				local87 = local79[2];
				local91 = local79[0];
			}
			for (@Pc(107) int local107 = local49; local107 != local51; local107 += local45) {
				@Pc(115) int local115 = local91[local107] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				@Pc(132) int local132 = local83[local107] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(152) int local152 = local87[local107] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local132 = Static52.anIntArray215[local132];
				if (local152 < 0) {
					local152 = 0;
				}
				local115 = Static52.anIntArray215[local115];
				local152 = Static52.anIntArray215[local152];
				@Pc(184) int local184 = (local132 << 8) + ((local115 << 16) + local152);
				if (local184 != 0) {
					local184 |= 0xFF000000;
				}
				local41[local61++] = local184;
				if (arg5) {
					local61 += arg2 - 1;
				}
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.aClass2_Sub4Array38.length; local221++) {
			this.aClass2_Sub4Array38[local221].method5587();
		}
		return local41;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!nl;ZLclient!tq;)Z")
	public boolean method5040(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Interface9 arg1) {
		@Pc(9) int local9;
		if (Static135.anInt3519 >= 0) {
			for (local9 = 0; local9 < this.anIntArray1192.length; local9++) {
				if (!arg0.method3761(this.anIntArray1192[local9], Static135.anInt3519)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray1192.length; local9++) {
				if (!arg0.method3739(this.anIntArray1192[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray1191.length; local9++) {
			if (!arg1.method142(this.anIntArray1191[local9])) {
				return false;
			}
		}
		return true;
	}
}
