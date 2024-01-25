import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "[I")
	private final int[] anIntArray6;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "[I")
	private final int[] anIntArray7;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!wf;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Lclient!wf;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "Lclient!wf;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "[Lclient!wf;")
	private final Class3_Sub2[] aClass3_Sub2Array3;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	private Class3_Sub4_Sub1() {
		this.anIntArray6 = new int[0];
		this.anIntArray7 = new int[0];
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub39(0);
		this.aClass3_Sub2_2.anInt11031 = 1;
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub39();
		this.aClass3_Sub2_1.anInt11031 = 1;
		this.aClass3_Sub2_3 = new Class3_Sub2_Sub39();
		this.aClass3_Sub2_3.anInt11031 = 1;
		this.aClass3_Sub2Array3 = new Class3_Sub2[] { this.aClass3_Sub2_1, this.aClass3_Sub2_3, this.aClass3_Sub2_2 };
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5322(-20);
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub2Array3 = new Class3_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(57) int local57;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub2 local26 = Static80.method1036(arg0);
			if (local26.method9213() >= 0) {
				local9++;
			}
			if (local26.method9207() >= 0) {
				local11++;
			}
			@Pc(50) int local50 = local26.aClass3_Sub2Array42.length;
			local18[local20] = new int[local50];
			for (local57 = 0; local57 < local50; local57++) {
				local18[local20][local57] = arg0.method5322(-67);
			}
			this.aClass3_Sub2Array3[local20] = local26;
		}
		this.anIntArray6 = new int[local9];
		this.anIntArray7 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(108) int local108 = 0; local108 < local7; local108++) {
			@Pc(117) Class3_Sub2 local117 = this.aClass3_Sub2Array3[local108];
			local57 = local117.aClass3_Sub2Array42.length;
			for (@Pc(123) int local123 = 0; local123 < local57; local123++) {
				local117.aClass3_Sub2Array42[local123] = this.aClass3_Sub2Array3[local18[local108][local123]];
			}
			@Pc(147) int local147 = local117.method9213();
			@Pc(151) int local151 = local117.method9207();
			if (local147 > 0) {
				this.anIntArray6[local9++] = local147;
			}
			if (local151 > 0) {
				this.anIntArray7[local11++] = local151;
			}
			local18[local108] = null;
		}
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array3[arg0.method5322(-100)];
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array3[arg0.method5322(-18)];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array3[arg0.method5322(-11)];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILclient!lb;ILclient!d;ZDI)[I")
	public int[] method134(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface2 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) double arg6) {
		Static350.anInterface2_8 = arg4;
		Static111.aClass221_22 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array3.length; local11++) {
			this.aClass3_Sub2Array3[local11].method9210(arg3, arg1);
		}
		Static63.method796(arg6);
		Static702.method9177(arg3, arg1);
		@Pc(43) int[] local43 = new int[arg3 * arg1];
		@Pc(55) int local55;
		@Pc(49) int local49;
		@Pc(51) byte local51;
		if (arg0) {
			local49 = -1;
			local51 = -1;
			local55 = arg3 - 1;
		} else {
			local51 = 1;
			local49 = arg3;
			local55 = 0;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg1; local67++) {
			if (arg5) {
				local65 = local67;
			}
			@Pc(91) int[] local91;
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			if (this.aClass3_Sub2_1.aBoolean794) {
				@Pc(109) int[] local109 = this.aClass3_Sub2_1.method9209(local67);
				local99 = local109;
				local95 = local109;
				local91 = local109;
			} else {
				@Pc(87) int[][] local87 = this.aClass3_Sub2_1.method9203(local67);
				local91 = local87[0];
				local95 = local87[2];
				local99 = local87[1];
			}
			for (@Pc(117) int local117 = local55; local117 != local49; local117 += local51) {
				@Pc(125) int local125 = local91[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(140) int local140 = local99[local117] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(157) int local157 = local95[local117] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local125 = Static359.anIntArray345[local125];
				local140 = Static359.anIntArray345[local140];
				if (local157 < 0) {
					local157 = 0;
				}
				local157 = Static359.anIntArray345[local157];
				@Pc(190) int local190 = local157 + (local125 << 16) + (local140 << 8);
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local43[local65++] = local190;
				if (arg5) {
					local65 += arg3 - 1;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass3_Sub2Array3.length; local232++) {
			this.aClass3_Sub2Array3[local232].method9206();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!lb;IDILclient!d;I)[I")
	public int[] method135(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface2 arg4, @OriginalArg(6) int arg5) {
		Static111.aClass221_22 = arg1;
		Static350.anInterface2_8 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array3.length; local11++) {
			this.aClass3_Sub2Array3[local11].method9210(arg5, arg3);
		}
		Static63.method796(arg2);
		Static702.method9177(arg5, arg3);
		@Pc(43) int[] local43 = new int[arg3 * arg5];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(67) int[] local67;
			@Pc(85) int[] local85;
			if (this.aClass3_Sub2_1.aBoolean794) {
				local85 = this.aClass3_Sub2_1.method9209(local47);
				local71 = local85;
				local75 = local85;
				local67 = local85;
			} else {
				@Pc(63) int[][] local63 = this.aClass3_Sub2_1.method9203(local47);
				local67 = local63[2];
				local71 = local63[0];
				local75 = local63[1];
			}
			if (arg0) {
				local45 = local47;
			}
			if (this.aClass3_Sub2_3.aBoolean794) {
				local85 = this.aClass3_Sub2_3.method9209(local47);
			} else {
				local85 = this.aClass3_Sub2_3.method9203(local47)[0];
			}
			for (@Pc(121) int local121 = arg5 - 1; local121 >= 0; local121--) {
				@Pc(129) int local129 = local71[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(147) int local147 = local75[local121] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(167) int local167 = local67[local121] >> 4;
				if (local167 > 255) {
					local167 = 255;
				}
				if (local167 < 0) {
					local167 = 0;
				}
				local129 = Static359.anIntArray345[local129];
				local147 = Static359.anIntArray345[local147];
				local167 = Static359.anIntArray345[local167];
				@Pc(204) int local204;
				if (local129 == 0 && local147 == 0 && local167 == 0) {
					local204 = 0;
				} else {
					local204 = local85[local121] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local43[local45++] = local167 + (local204 << 24) + (local129 << 16) + (local147 << 8);
				if (arg0) {
					local45 += arg5 - 1;
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.aClass3_Sub2Array3.length; local259++) {
			this.aClass3_Sub2Array3[local259].method9206();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!d;Lclient!lb;I)Z")
	public boolean method137(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class221 arg1) {
		@Pc(20) int local20;
		if (Static492.anInt8481 < 0) {
			for (local20 = 0; local20 < this.anIntArray6.length; local20++) {
				if (!arg1.method5068(this.anIntArray6[local20])) {
					return false;
				}
			}
		} else {
			for (local20 = 0; local20 < this.anIntArray6.length; local20++) {
				if (!arg1.method5093(this.anIntArray6[local20], Static492.anInt8481)) {
					return false;
				}
			}
		}
		for (local20 = 0; local20 < this.anIntArray7.length; local20++) {
			if (!arg0.method1024(this.anIntArray7[local20])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!d;IILclient!lb;ZI)[F")
	public float[] method138(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class221 arg3, @OriginalArg(4) boolean arg4) {
		Static350.anInterface2_8 = arg0;
		Static111.aClass221_22 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array3.length; local11++) {
			this.aClass3_Sub2Array3[local11].method9210(arg1, arg2);
		}
		Static702.method9177(arg1, arg2);
		@Pc(44) float[] local44 = new float[arg2 * 4 * arg1];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			@Pc(70) int[] local70;
			@Pc(78) int[] local78;
			@Pc(74) int[] local74;
			if (this.aClass3_Sub2_1.aBoolean794) {
				@Pc(88) int[] local88 = this.aClass3_Sub2_1.method9209(local48);
				local70 = local88;
				local74 = local88;
				local78 = local88;
			} else {
				@Pc(66) int[][] local66 = this.aClass3_Sub2_1.method9203(local48);
				local70 = local66[0];
				local74 = local66[2];
				local78 = local66[1];
			}
			@Pc(104) int[] local104;
			if (this.aClass3_Sub2_3.aBoolean794) {
				local104 = this.aClass3_Sub2_3.method9209(local48);
			} else {
				local104 = this.aClass3_Sub2_3.method9203(local48)[0];
			}
			if (arg4) {
				local46 = local48 << 2;
			}
			@Pc(132) int[] local132;
			if (this.aClass3_Sub2_2.aBoolean794) {
				local132 = this.aClass3_Sub2_2.method9209(local48);
			} else {
				local132 = this.aClass3_Sub2_2.method9203(local48)[0];
			}
			for (@Pc(144) int local144 = arg1 - 1; local144 >= 0; local144--) {
				@Pc(153) float local153 = (float) local104[local144] / 4096.0F;
				if (local153 < 0.0F) {
					local153 = 0.0F;
				} else if (local153 > 1.0F) {
					local153 = 1.0F;
				}
				@Pc(182) float local182 = ((float) local132[local144] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local44[local46++] = (float) local70[local144] * local182;
				local44[local46++] = local182 * (float) local78[local144];
				local44[local46++] = local182 * (float) local74[local144];
				local44[local46++] = local153;
				if (arg4) {
					local46 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.aClass3_Sub2Array3.length; local238++) {
			this.aClass3_Sub2Array3[local238].method9206();
		}
		if (9675 != 9675) {
			Static9.method136(107);
		}
		return local44;
	}
}
