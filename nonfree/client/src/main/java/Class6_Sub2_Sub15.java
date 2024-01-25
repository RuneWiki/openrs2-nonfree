import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class6_Sub2_Sub15 extends Class6_Sub2 {

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "[I")
	private final int[] anIntArray481;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "[I")
	private final int[] anIntArray480;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "Lclient!qfa;")
	private final Class6_Sub8 aClass6_Sub8_3;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "Lclient!qfa;")
	private final Class6_Sub8 aClass6_Sub8_2;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "Lclient!qfa;")
	private final Class6_Sub8 aClass6_Sub8_1;

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "[Lclient!qfa;")
	private final Class6_Sub8[] aClass6_Sub8Array30;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	private Class6_Sub2_Sub15() {
		this.anIntArray481 = new int[0];
		this.anIntArray480 = new int[0];
		this.aClass6_Sub8_3 = new Class6_Sub8_Sub30(0);
		this.aClass6_Sub8_3.anInt10353 = 1;
		this.aClass6_Sub8_2 = new Class6_Sub8_Sub30();
		this.aClass6_Sub8_2.anInt10353 = 1;
		this.aClass6_Sub8_1 = new Class6_Sub8_Sub30();
		this.aClass6_Sub8Array30 = new Class6_Sub8[] { this.aClass6_Sub8_2, this.aClass6_Sub8_1, this.aClass6_Sub8_3 };
		this.aClass6_Sub8_1.anInt10353 = 1;
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class6_Sub2_Sub15(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3030();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub8Array30 = new Class6_Sub8[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class6_Sub8 local28 = Static579.method8067(arg0);
			if (local28.method8927() >= 0) {
				local9++;
			}
			if (local28.method8932() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local28.aClass6_Sub8Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method3030();
			}
			this.aClass6_Sub8Array30[local20] = local28;
		}
		this.anIntArray480 = new int[local9];
		this.anIntArray481 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(102) int local102 = 0; local102 < local7; local102++) {
			@Pc(111) Class6_Sub8 local111 = this.aClass6_Sub8Array30[local102];
			local53 = local111.aClass6_Sub8Array42.length;
			for (@Pc(117) int local117 = 0; local117 < local53; local117++) {
				local111.aClass6_Sub8Array42[local117] = this.aClass6_Sub8Array30[local14[local102][local117]];
			}
			@Pc(141) int local141 = local111.method8927();
			@Pc(145) int local145 = local111.method8932();
			if (local141 > 0) {
				this.anIntArray480[local9++] = local141;
			}
			if (local145 > 0) {
				this.anIntArray481[local11++] = local145;
			}
			local14[local102] = null;
		}
		this.aClass6_Sub8_2 = this.aClass6_Sub8Array30[arg0.method3030()];
		this.aClass6_Sub8_1 = this.aClass6_Sub8Array30[arg0.method3030()];
		this.aClass6_Sub8_3 = this.aClass6_Sub8Array30[arg0.method3030()];
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IDLclient!d;ILclient!lga;IZZ)[I")
	public int[] method6625(@OriginalArg(1) double arg0, @OriginalArg(2) Interface11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		Static624.anInterface11_12 = arg1;
		Static312.aClass223_69 = arg3;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub8Array30.length; local19++) {
			this.aClass6_Sub8Array30[local19].method8931(arg2, arg4);
		}
		Static573.method8012(arg0);
		Static497.method7321(arg2, arg4);
		@Pc(51) int[] local51 = new int[arg2 * arg4];
		@Pc(63) int local63;
		@Pc(57) int local57;
		@Pc(59) byte local59;
		if (arg5) {
			local57 = -1;
			local59 = -1;
			local63 = arg2 - 1;
		} else {
			local59 = 1;
			local57 = arg2;
			local63 = 0;
		}
		@Pc(73) int local73 = 0;
		for (@Pc(75) int local75 = 0; local75 < arg4; local75++) {
			if (arg6) {
				local73 = local75;
			}
			@Pc(105) int[] local105;
			@Pc(97) int[] local97;
			@Pc(101) int[] local101;
			if (this.aClass6_Sub8_2.aBoolean766) {
				@Pc(113) int[] local113 = this.aClass6_Sub8_2.method8935(local75);
				local101 = local113;
				local97 = local113;
				local105 = local113;
			} else {
				@Pc(93) int[][] local93 = this.aClass6_Sub8_2.method8934(local75);
				local97 = local93[1];
				local101 = local93[2];
				local105 = local93[0];
			}
			for (@Pc(121) int local121 = local63; local121 != local57; local121 += local59) {
				@Pc(129) int local129 = local105[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(144) int local144 = local97[local121] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(162) int local162 = local101[local121] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local144 = Static639.anIntArray652[local144];
				if (local162 < 0) {
					local162 = 0;
				}
				local129 = Static639.anIntArray652[local129];
				local162 = Static639.anIntArray652[local162];
				@Pc(194) int local194 = (local129 << 16) + (local144 << 8) + local162;
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local51[local73++] = local194;
				if (arg6) {
					local73 += arg2 - 1;
				}
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.aClass6_Sub8Array30.length; local239++) {
			this.aClass6_Sub8Array30[local239].method8937();
		}
		return local51;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(DIZLclient!d;ZLclient!lga;I)[I")
	public int[] method6626(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(5) Class223 arg4, @OriginalArg(6) int arg5) {
		Static312.aClass223_69 = arg4;
		Static624.anInterface11_12 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub8Array30.length; local11++) {
			this.aClass6_Sub8Array30[local11].method8931(arg1, arg5);
		}
		Static573.method8012(arg0);
		Static497.method7321(arg1, arg5);
		@Pc(45) int[] local45 = new int[arg5 * arg1];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg5; local49++) {
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			@Pc(85) int[] local85;
			if (this.aClass6_Sub8_2.aBoolean766) {
				local85 = this.aClass6_Sub8_2.method8935(local49);
				local69 = local85;
				local73 = local85;
				local77 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass6_Sub8_2.method8934(local49);
				local69 = local65[2];
				local73 = local65[1];
				local77 = local65[0];
			}
			if (this.aClass6_Sub8_1.aBoolean766) {
				local85 = this.aClass6_Sub8_1.method8935(local49);
			} else {
				local85 = this.aClass6_Sub8_1.method8934(local49)[0];
			}
			if (arg2) {
				local47 = local49;
			}
			for (@Pc(119) int local119 = arg1 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local77[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(144) int local144 = local73[local119] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(162) int local162 = local69[local119] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local144 = Static639.anIntArray652[local144];
				local127 = Static639.anIntArray652[local127];
				if (local162 < 0) {
					local162 = 0;
				}
				local162 = Static639.anIntArray652[local162];
				@Pc(198) int local198;
				if (local127 == 0 && local144 == 0 && local162 == 0) {
					local198 = 0;
				} else {
					local198 = local85[local119] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local45[local47++] = local162 + (local127 << 16) + (local198 << 24) + (local144 << 8);
				if (arg2) {
					local47 += arg1 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass6_Sub8Array30.length; local258++) {
			this.aClass6_Sub8Array30[local258].method8937();
		}
		if (false) {
			return null;
		} else {
			return local45;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZILclient!d;IILclient!lga;)[F")
	public float[] method6627(@OriginalArg(0) boolean arg0, @OriginalArg(2) Interface11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class223 arg4) {
		Static312.aClass223_69 = arg4;
		Static624.anInterface11_12 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub8Array30.length; local11++) {
			this.aClass6_Sub8Array30[local11].method8931(arg3, arg2);
		}
		Static497.method7321(arg3, arg2);
		@Pc(46) float[] local46 = new float[arg3 * 4 * arg2];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg2; local50++) {
			@Pc(74) int[] local74;
			@Pc(70) int[] local70;
			@Pc(78) int[] local78;
			if (this.aClass6_Sub8_2.aBoolean766) {
				@Pc(86) int[] local86 = this.aClass6_Sub8_2.method8935(local50);
				local70 = local86;
				local78 = local86;
				local74 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass6_Sub8_2.method8934(local50);
				local70 = local66[1];
				local74 = local66[0];
				local78 = local66[2];
			}
			@Pc(104) int[] local104;
			if (this.aClass6_Sub8_1.aBoolean766) {
				local104 = this.aClass6_Sub8_1.method8935(local50);
			} else {
				local104 = this.aClass6_Sub8_1.method8934(local50)[0];
			}
			@Pc(126) int[] local126;
			if (this.aClass6_Sub8_3.aBoolean766) {
				local126 = this.aClass6_Sub8_3.method8935(local50);
			} else {
				local126 = this.aClass6_Sub8_3.method8934(local50)[0];
			}
			if (arg0) {
				local48 = local50 << 2;
			}
			for (@Pc(146) int local146 = arg3 - 1; local146 >= 0; local146--) {
				@Pc(155) float local155 = (float) local104[local146] / 4096.0F;
				if (local155 < 0.0F) {
					local155 = 0.0F;
				} else if (local155 > 1.0F) {
					local155 = 1.0F;
				}
				@Pc(184) float local184 = ((float) local126[local146] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local46[local48++] = local184 * (float) local74[local146];
				local46[local48++] = (float) local70[local146] * local184;
				local46[local48++] = (float) local78[local146] * local184;
				local46[local48++] = local155;
				if (arg0) {
					local48 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(240) int local240 = 0; local240 < this.aClass6_Sub8Array30.length; local240++) {
			this.aClass6_Sub8Array30[local240].method8937();
		}
		return local46;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!lga;ILclient!d;)Z")
	public boolean method6629(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface11 arg2) {
		@Pc(9) int local9;
		if (Static367.anInt6183 >= 0) {
			for (local9 = 0; local9 < this.anIntArray480.length; local9++) {
				if (!arg0.method5261(Static367.anInt6183, this.anIntArray480[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray480.length; local9++) {
				if (!arg0.method5285(this.anIntArray480[local9])) {
					return false;
				}
			}
		}
		if (arg1 != 255) {
			this.method6629((Class223) null, 92, (Interface11) null);
		}
		for (local9 = 0; local9 < this.anIntArray481.length; local9++) {
			if (!arg2.method6032(this.anIntArray481[local9])) {
				return false;
			}
		}
		return true;
	}
}
