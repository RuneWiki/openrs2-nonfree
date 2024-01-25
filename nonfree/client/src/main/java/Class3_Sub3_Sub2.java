import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "[I")
	private final int[] anIntArray49;

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "[I")
	private final int[] anIntArray50;

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "Lclient!dw;")
	private final Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!aw", name = "A", descriptor = "Lclient!dw;")
	private final Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!aw", name = "J", descriptor = "Lclient!dw;")
	private final Class3_Sub4 aClass3_Sub4_3;

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "[Lclient!dw;")
	private final Class3_Sub4[] aClass3_Sub4Array4;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	private Class3_Sub3_Sub2() {
		this.anIntArray49 = new int[0];
		this.anIntArray50 = new int[0];
		this.aClass3_Sub4_2 = new Class3_Sub4_Sub8(0);
		this.aClass3_Sub4_2.anInt7582 = 1;
		this.aClass3_Sub4_1 = new Class3_Sub4_Sub8();
		this.aClass3_Sub4_1.anInt7582 = 1;
		this.aClass3_Sub4_3 = new Class3_Sub4_Sub8();
		this.aClass3_Sub4Array4 = new Class3_Sub4[] { this.aClass3_Sub4_1, this.aClass3_Sub4_3, this.aClass3_Sub4_2 };
		this.aClass3_Sub4_3.anInt7582 = 1;
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method6053();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub4Array4 = new Class3_Sub4[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub4 local26 = Static405.method5473(arg0);
			if (local26.method5956() >= 0) {
				local9++;
			}
			if (local26.method5968() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub4Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method6053();
			}
			this.aClass3_Sub4Array4[local20] = local26;
		}
		this.anIntArray50 = new int[local9];
		this.anIntArray49 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class3_Sub4 local98 = this.aClass3_Sub4Array4[local91];
			local50 = local98.aClass3_Sub4Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass3_Sub4Array42[local104] = this.aClass3_Sub4Array4[local18[local91][local104]];
			}
			@Pc(126) int local126 = local98.method5956();
			@Pc(130) int local130 = local98.method5968();
			if (local126 > 0) {
				this.anIntArray50[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray49[local11++] = local130;
			}
			local18[local91] = null;
		}
		this.aClass3_Sub4_1 = this.aClass3_Sub4Array4[arg0.method6053()];
		this.aClass3_Sub4_3 = this.aClass3_Sub4Array4[arg0.method6053()];
		this.aClass3_Sub4_2 = this.aClass3_Sub4Array4[arg0.method6053()];
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!m;ILclient!dn;IIZ)[F")
	public float[] method604(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		Static226.aClass56_57 = arg2;
		Static194.anInterface7_7 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub4Array4.length; local11++) {
			this.aClass3_Sub4Array4[local11].method5969(arg1, arg3);
		}
		Static287.method4200(arg1, arg3);
		@Pc(42) float[] local42 = new float[arg1 * 4 * arg3];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			@Pc(62) int[] local62;
			if (this.aClass3_Sub4_1.aBoolean524) {
				@Pc(58) int[] local58 = this.aClass3_Sub4_1.method5966(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(74) int[][] local74 = this.aClass3_Sub4_1.method5955(local46);
				local64 = local74[0];
				local62 = local74[2];
				local60 = local74[1];
			}
			@Pc(98) int[] local98;
			if (this.aClass3_Sub4_3.aBoolean524) {
				local98 = this.aClass3_Sub4_3.method5966(local46);
			} else {
				local98 = this.aClass3_Sub4_3.method5955(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			@Pc(124) int[] local124;
			if (this.aClass3_Sub4_2.aBoolean524) {
				local124 = this.aClass3_Sub4_2.method5966(local46);
			} else {
				local124 = this.aClass3_Sub4_2.method5955(local46)[0];
			}
			for (@Pc(136) int local136 = arg3 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local98[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local124[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local64[local136] * local172;
				local42[local44++] = local172 * (float) local60[local136];
				local42[local44++] = (float) local62[local136] * local172;
				local42[local44++] = local145;
				if (arg4) {
					local44 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass3_Sub4Array4.length; local230++) {
			this.aClass3_Sub4Array4[local230].method5957();
		}
		return local42;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!m;Lclient!dn;B)Z")
	public boolean method605(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class56 arg1) {
		@Pc(12) int local12;
		if (Static179.anInt3653 >= 0) {
			for (local12 = 0; local12 < this.anIntArray50.length; local12++) {
				if (!arg1.method1388(Static179.anInt3653, this.anIntArray50[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray50.length; local12++) {
				if (!arg1.method1365(this.anIntArray50[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray49.length; local12++) {
			if (!arg0.method2132(this.anIntArray49[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZBLclient!m;Lclient!dn;DII)[I")
	public int[] method606(@OriginalArg(0) boolean arg0, @OriginalArg(2) Interface7 arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static194.anInterface7_7 = arg1;
		Static226.aClass56_57 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub4Array4.length; local11++) {
			this.aClass3_Sub4Array4[local11].method5969(arg4, arg5);
		}
		Static217.method3472(arg3);
		Static287.method4200(arg4, arg5);
		@Pc(45) int[] local45 = new int[arg5 * arg4 * 4];
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg4; local61++) {
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			if (this.aClass3_Sub4_1.aBoolean524) {
				local73 = this.aClass3_Sub4_1.method5966(local61);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(89) int[][] local89 = this.aClass3_Sub4_1.method5955(local61);
				local77 = local89[2];
				local79 = local89[0];
				local75 = local89[1];
			}
			if (this.aClass3_Sub4_3.aBoolean524) {
				local73 = this.aClass3_Sub4_3.method5966(local61);
			} else {
				local73 = this.aClass3_Sub4_3.method5955(local61)[0];
			}
			if (arg0) {
				local59 = local61;
			}
			for (@Pc(131) int local131 = arg5 - 1; local131 >= 0; local131--) {
				@Pc(139) int local139 = local79[local131] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(157) int local157 = local75[local131] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				@Pc(172) int local172 = local77[local131] >> 4;
				if (local172 > 255) {
					local172 = 255;
				}
				local139 = Static450.anIntArray577[local139];
				if (local172 < 0) {
					local172 = 0;
				}
				local157 = Static450.anIntArray577[local157];
				local172 = Static450.anIntArray577[local172];
				@Pc(206) int local206;
				if (local139 == 0 && local157 == 0 && local172 == 0) {
					local206 = 0;
				} else {
					local206 = local73[local131] >> 4;
					if (local206 > 255) {
						local206 = 255;
					}
					if (local206 < 0) {
						local206 = 0;
					}
				}
				local45[local59++] = (local206 << 24) - (-(local139 << 16) - ((local157 << 8) + local172));
				if (arg0) {
					local59 += arg5 - 1;
				}
			}
		}
		for (@Pc(264) int local264 = 0; local264 < this.aClass3_Sub4Array4.length; local264++) {
			this.aClass3_Sub4Array4[local264].method5957();
		}
		return local45;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZILclient!dn;Lclient!m;DIZI)[I")
	public int[] method608(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) double arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static226.aClass56_57 = arg2;
		Static194.anInterface7_7 = arg3;
		for (@Pc(23) int local23 = 0; local23 < this.aClass3_Sub4Array4.length; local23++) {
			this.aClass3_Sub4Array4[local23].method5969(arg1, arg6);
		}
		Static217.method3472(arg4);
		Static287.method4200(arg1, arg6);
		@Pc(55) int[] local55 = new int[arg1 * arg6];
		@Pc(63) int local63;
		@Pc(59) int local59;
		@Pc(61) byte local61;
		if (arg0) {
			local61 = -1;
			local59 = -1;
			local63 = arg6 - 1;
		} else {
			local59 = arg6;
			local61 = 1;
			local63 = 0;
		}
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < arg1; local77++) {
			if (arg5) {
				local75 = local77;
			}
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			@Pc(97) int[] local97;
			if (this.aClass3_Sub4_1.aBoolean524) {
				@Pc(93) int[] local93 = this.aClass3_Sub4_1.method5966(local77);
				local95 = local93;
				local97 = local93;
				local99 = local93;
			} else {
				@Pc(107) int[][] local107 = this.aClass3_Sub4_1.method5955(local77);
				local99 = local107[0];
				local95 = local107[1];
				local97 = local107[2];
			}
			for (@Pc(121) int local121 = local63; local121 != local59; local121 += local61) {
				@Pc(129) int local129 = local99[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(146) int local146 = local95[local121] >> 4;
				if (local146 > 255) {
					local146 = 255;
				}
				if (local146 < 0) {
					local146 = 0;
				}
				@Pc(161) int local161 = local97[local121] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local146 = Static450.anIntArray577[local146];
				if (local161 < 0) {
					local161 = 0;
				}
				local129 = Static450.anIntArray577[local129];
				local161 = Static450.anIntArray577[local161];
				@Pc(193) int local193 = local161 + (local129 << 16) + (local146 << 8);
				if (local193 != 0) {
					local193 |= 0xFF000000;
				}
				local55[local75++] = local193;
				if (arg5) {
					local75 += arg6 - 1;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass3_Sub4Array4.length; local232++) {
			this.aClass3_Sub4Array4[local232].method5957();
		}
		return local55;
	}
}
