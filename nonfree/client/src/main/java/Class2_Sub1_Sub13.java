import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
	private final int[] anIntArray440;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
	private final int[] anIntArray439;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!sd;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Lclient!sd;")
	private final Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!sd;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "[Lclient!sd;")
	private final Class2_Sub2[] aClass2_Sub2Array26;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub13() {
		this.anIntArray440 = new int[0];
		this.anIntArray439 = new int[0];
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub26(0);
		this.aClass2_Sub2_1.anInt7759 = 1;
		this.aClass2_Sub2_3 = new Class2_Sub2_Sub26();
		this.aClass2_Sub2_3.anInt7759 = 1;
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub26();
		this.aClass2_Sub2Array26 = new Class2_Sub2[] { this.aClass2_Sub2_3, this.aClass2_Sub2_2, this.aClass2_Sub2_1 };
		this.aClass2_Sub2_2.anInt7759 = 1;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!hw;)V")
	public Class2_Sub1_Sub13(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method6138();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub2Array26 = new Class2_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static130.method2042(arg0);
			if (local26.method6268() >= 0) {
				local9++;
			}
			if (local26.method6263() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method6138();
			}
			this.aClass2_Sub2Array26[local20] = local26;
		}
		this.anIntArray439 = new int[local9];
		local9 = 0;
		this.anIntArray440 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class2_Sub2 local98 = this.aClass2_Sub2Array26[local91];
			local50 = local98.aClass2_Sub2Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass2_Sub2Array42[local104] = this.aClass2_Sub2Array26[local18[local91][local104]];
			}
			@Pc(126) int local126 = local98.method6268();
			@Pc(130) int local130 = local98.method6263();
			if (local126 > 0) {
				this.anIntArray439[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray440[local11++] = local130;
			}
			local18[local91] = null;
		}
		this.aClass2_Sub2_3 = this.aClass2_Sub2Array26[arg0.method6138()];
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array26[arg0.method6138()];
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array26[arg0.method6138()];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBLclient!l;ZLclient!mn;D)[I")
	public int[] method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class171 arg4, @OriginalArg(6) double arg5) {
		Static259.aClass171_60 = arg4;
		Static276.anInterface7_5 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array26.length; local11++) {
			this.aClass2_Sub2Array26[local11].method6277(arg0, arg1);
		}
		Static1.method25(arg5);
		Static249.method3443(arg1, arg0);
		@Pc(51) int[] local51 = new int[arg1 * arg0 * 4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg0; local55++) {
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(87) int[] local87;
			if (this.aClass2_Sub2_3.aBoolean518) {
				local87 = this.aClass2_Sub2_3.method6274(local55);
				local75 = local87;
				local71 = local87;
				local79 = local87;
			} else {
				@Pc(67) int[][] local67 = this.aClass2_Sub2_3.method6271(local55);
				local71 = local67[2];
				local75 = local67[1];
				local79 = local67[0];
			}
			if (arg3) {
				local53 = local55;
			}
			if (this.aClass2_Sub2_2.aBoolean518) {
				local87 = this.aClass2_Sub2_2.method6274(local55);
			} else {
				local87 = this.aClass2_Sub2_2.method6271(local55)[0];
			}
			for (@Pc(121) int local121 = arg1 - 1; local121 >= 0; local121--) {
				@Pc(129) int local129 = local79[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(144) int local144 = local75[local121] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(161) int local161 = local71[local121] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local144 = Static133.anIntArray473[local144];
				if (local161 < 0) {
					local161 = 0;
				}
				local129 = Static133.anIntArray473[local129];
				local161 = Static133.anIntArray473[local161];
				@Pc(202) int local202;
				if (local129 == 0 && local144 == 0 && local161 == 0) {
					local202 = 0;
				} else {
					local202 = local87[local121] >> 4;
					if (local202 > 255) {
						local202 = 255;
					}
					if (local202 < 0) {
						local202 = 0;
					}
				}
				local51[local53++] = local161 + (local144 << 8) + (local129 << 16) + (local202 << 24);
				if (arg3) {
					local53 += arg1 - 1;
				}
			}
		}
		for (@Pc(256) int local256 = 0; local256 < this.aClass2_Sub2Array26.length; local256++) {
			this.aClass2_Sub2Array26[local256].method6272();
		}
		return local51;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!l;IIIZLclient!mn;D)[I")
	public int[] method4109(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class171 arg5, @OriginalArg(7) double arg6) {
		Static259.aClass171_60 = arg5;
		Static276.anInterface7_5 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array26.length; local11++) {
			this.aClass2_Sub2Array26[local11].method6277(arg3, arg2);
		}
		Static1.method25(arg6);
		Static249.method3443(arg2, arg3);
		@Pc(43) int[] local43 = new int[arg3 * arg2];
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(47) byte local47;
		if (arg4) {
			local47 = -1;
			local49 = arg2 - 1;
			local51 = -1;
		} else {
			local47 = 1;
			local49 = 0;
			local51 = arg2;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			if (this.aClass2_Sub2_3.aBoolean518) {
				@Pc(97) int[] local97 = this.aClass2_Sub2_3.method6274(local65);
				local89 = local97;
				local85 = local97;
				local81 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass2_Sub2_3.method6271(local65);
				local81 = local77[0];
				local85 = local77[2];
				local89 = local77[1];
			}
			if (arg0) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local49; local109 != local51; local109 += local47) {
				@Pc(117) int local117 = local81[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local89[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(152) int local152 = local85[local109] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local117 = Static133.anIntArray473[local117];
				if (local152 < 0) {
					local152 = 0;
				}
				local132 = Static133.anIntArray473[local132];
				local152 = Static133.anIntArray473[local152];
				@Pc(183) int local183 = local152 + (local132 << 8) + (local117 << 16);
				if (local183 != 0) {
					local183 |= 0xFF000000;
				}
				local43[local63++] = local183;
				if (arg0) {
					local63 += arg2 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass2_Sub2Array26.length; local223++) {
			this.aClass2_Sub2Array26[local223].method6272();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!l;Lclient!mn;)Z")
	public boolean method4112(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(12) int local12;
		if (Static342.anInt6096 >= 0) {
			for (local12 = 0; local12 < this.anIntArray439.length; local12++) {
				if (!arg1.method3647(Static342.anInt6096, this.anIntArray439[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray439.length; local12++) {
				if (!arg1.method3666(this.anIntArray439[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray440.length; local12++) {
			if (!arg0.method1168(this.anIntArray440[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!mn;ZILclient!l;II)[F")
	public float[] method4114(@OriginalArg(0) Class171 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static276.anInterface7_5 = arg2;
		Static259.aClass171_60 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array26.length; local11++) {
			this.aClass2_Sub2Array26[local11].method6277(arg4, arg3);
		}
		Static249.method3443(arg3, arg4);
		@Pc(44) float[] local44 = new float[arg4 * arg3 * 4];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg4; local48++) {
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			if (this.aClass2_Sub2_3.aBoolean518) {
				@Pc(80) int[] local80 = this.aClass2_Sub2_3.method6274(local48);
				local72 = local80;
				local68 = local80;
				local64 = local80;
			} else {
				@Pc(60) int[][] local60 = this.aClass2_Sub2_3.method6271(local48);
				local64 = local60[0];
				local68 = local60[1];
				local72 = local60[2];
			}
			@Pc(96) int[] local96;
			if (this.aClass2_Sub2_2.aBoolean518) {
				local96 = this.aClass2_Sub2_2.method6274(local48);
			} else {
				local96 = this.aClass2_Sub2_2.method6271(local48)[0];
			}
			if (arg1) {
				local46 = local48 << 2;
			}
			@Pc(126) int[] local126;
			if (this.aClass2_Sub2_1.aBoolean518) {
				local126 = this.aClass2_Sub2_1.method6274(local48);
			} else {
				local126 = this.aClass2_Sub2_1.method6271(local48)[0];
			}
			for (@Pc(138) int local138 = arg3 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local96[local138] / 4096.0F;
				@Pc(160) float local160 = ((float) local126[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				local44[local46++] = local160 * (float) local64[local138];
				local44[local46++] = (float) local68[local138] * local160;
				local44[local46++] = local160 * (float) local72[local138];
				local44[local46++] = local147;
				if (arg1) {
					local46 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass2_Sub2Array26.length; local232++) {
			this.aClass2_Sub2Array26[local232].method6272();
		}
		return local44;
	}
}
