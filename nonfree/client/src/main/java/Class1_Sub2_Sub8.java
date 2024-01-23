import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "Lclient!rf;")
	private Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!rf;")
	private Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "Lclient!rf;")
	private Class1_Sub4 aClass1_Sub4_3;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "[Lclient!rf;")
	private Class1_Sub4[] aClass1_Sub4Array25;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method1378();
		@Pc(9) int local9 = 0;
		this.aClass1_Sub4Array25 = new Class1_Sub4[local7];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(20) int local20;
		@Pc(31) Class1_Sub4 local31;
		@Pc(51) int local51;
		@Pc(58) int local58;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = Static110.method1971(arg0);
			if (local31.method4753() >= 0) {
				local9++;
			}
			if (local31.method4754() >= 0) {
				local15++;
			}
			local51 = local31.aClass1_Sub4Array42.length;
			local18[local20] = new int[local51];
			for (local58 = 0; local58 < local51; local58++) {
				local18[local20][local58] = arg0.method1378();
			}
			this.aClass1_Sub4Array25[local20] = local31;
		}
		this.anIntArray242 = new int[local15];
		this.anIntArray241 = new int[local9];
		local9 = 0;
		local15 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = this.aClass1_Sub4Array25[local20];
			local51 = local31.aClass1_Sub4Array42.length;
			for (local58 = 0; local58 < local51; local58++) {
				local31.aClass1_Sub4Array42[local58] = this.aClass1_Sub4Array25[local18[local20][local58]];
			}
			local58 = local31.method4753();
			@Pc(142) int local142 = local31.method4754();
			if (local58 > 0) {
				this.anIntArray241[local9++] = local58;
			}
			if (local142 > 0) {
				this.anIntArray242[local15++] = local142;
			}
			local18[local20] = null;
		}
		local18 = null;
		this.aClass1_Sub4_1 = this.aClass1_Sub4Array25[arg0.method1378()];
		this.aClass1_Sub4_3 = this.aClass1_Sub4Array25[arg0.method1378()];
		this.aClass1_Sub4_2 = this.aClass1_Sub4Array25[arg0.method1378()];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!nk;Lclient!ce;I)Z")
	public boolean method2455(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Interface1 arg1) {
		@Pc(25) int local25;
		if (Static201.anInt3861 <= 0) {
			for (local25 = 0; local25 < this.anIntArray241.length; local25++) {
				if (!arg0.method3140(this.anIntArray241[local25])) {
					return false;
				}
			}
		} else {
			for (local25 = 0; local25 < this.anIntArray241.length; local25++) {
				if (!arg0.method3110(Static201.anInt3861, this.anIntArray241[local25])) {
					return false;
				}
			}
		}
		for (local25 = 0; local25 < this.anIntArray242.length; local25++) {
			if (!arg1.method756(this.anIntArray242[local25])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!nk;Lclient!ce;IIZ)[F")
	public float[] method2458(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static100.anInterface1_1 = arg1;
		@Pc(14) float[] local14 = new float[arg3 * 4 * arg2];
		Static70.aClass121_40 = arg0;
		Static225.method3499(arg2, arg3);
		@Pc(22) int local22;
		for (local22 = 0; local22 < this.aClass1_Sub4Array25.length; local22++) {
			this.aClass1_Sub4Array25[local22].method4743(arg2, arg3);
		}
		local22 = 0;
		@Pc(48) int local48;
		for (local48 = 0; local48 < arg2; local48++) {
			if (arg4) {
				local22 = local48 << 2;
			}
			@Pc(84) int[] local84;
			@Pc(80) int[] local80;
			@Pc(76) int[] local76;
			if (this.aClass1_Sub4_1.aBoolean383) {
				@Pc(92) int[] local92 = this.aClass1_Sub4_1.method4746(local48);
				local80 = local92;
				local76 = local92;
				local84 = local92;
			} else {
				@Pc(72) int[][] local72 = this.aClass1_Sub4_1.method4756(local48);
				local76 = local72[2];
				local80 = local72[1];
				local84 = local72[0];
			}
			@Pc(110) int[] local110;
			if (this.aClass1_Sub4_3.aBoolean383) {
				local110 = this.aClass1_Sub4_3.method4746(local48);
			} else {
				local110 = this.aClass1_Sub4_3.method4756(local48)[0];
			}
			@Pc(130) int[] local130;
			if (this.aClass1_Sub4_2.aBoolean383) {
				local130 = this.aClass1_Sub4_2.method4746(local48);
			} else {
				local130 = this.aClass1_Sub4_2.method4756(local48)[0];
			}
			for (@Pc(142) int local142 = arg3 - 1; local142 >= 0; local142--) {
				@Pc(160) float local160 = ((float) local130[local142] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				@Pc(167) float local167 = (float) local110[local142] / 4096.0F;
				if (local167 < 0.0F) {
					local167 = 0.0F;
				} else if (local167 > 1.0F) {
					local167 = 1.0F;
				}
				local14[local22++] = (float) local84[local142] * local160;
				local14[local22++] = (float) local80[local142] * local160;
				local14[local22++] = local160 * (float) local76[local142];
				local14[local22++] = local167;
				if (arg4) {
					local22 += (arg3 << 2) - 4;
				}
			}
		}
		for (local48 = 0; local48 < this.aClass1_Sub4Array25.length; local48++) {
			this.aClass1_Sub4Array25[local48].method4751();
		}
		return local14;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ce;Lclient!nk;ZDII)[I")
	public int[] method2460(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static141.method2437(arg3);
		Static100.anInterface1_1 = arg0;
		@Pc(17) int[] local17 = new int[arg4 * arg5 * 4];
		Static70.aClass121_40 = arg1;
		Static225.method3499(arg4, arg5);
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass1_Sub4Array25.length; local25++) {
			this.aClass1_Sub4Array25[local25].method4743(arg4, arg5);
		}
		local25 = 0;
		@Pc(49) int local49;
		for (local49 = 0; local49 < arg4; local49++) {
			if (arg2) {
				local25 = local49;
			}
			@Pc(72) int[] local72;
			@Pc(76) int[] local76;
			@Pc(74) int[] local74;
			@Pc(70) int[] local70;
			if (this.aClass1_Sub4_1.aBoolean383) {
				local70 = this.aClass1_Sub4_1.method4746(local49);
				local72 = local70;
				local74 = local70;
				local76 = local70;
			} else {
				@Pc(84) int[][] local84 = this.aClass1_Sub4_1.method4756(local49);
				local74 = local84[2];
				local72 = local84[0];
				local76 = local84[1];
			}
			if (this.aClass1_Sub4_3.aBoolean383) {
				local70 = this.aClass1_Sub4_3.method4746(local49);
			} else {
				local70 = this.aClass1_Sub4_3.method4756(local49)[0];
			}
			for (@Pc(120) int local120 = arg5 - 1; local120 >= 0; local120--) {
				@Pc(131) int local131 = local72[local120] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				@Pc(142) int local142 = local74[local120] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(164) int local164 = local76[local120] >> 4;
				local142 = Static155.anIntArray258[local142];
				if (local164 > 255) {
					local164 = 255;
				}
				local131 = Static155.anIntArray258[local131];
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static155.anIntArray258[local164];
				@Pc(204) int local204;
				if (local131 == 0 && local164 == 0 && local142 == 0) {
					local204 = 0;
				} else {
					local204 = local70[local120] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local17[local25++] = local142 + (local131 << 16) + (local204 << 24) + (local164 << 8);
				if (arg2) {
					local25 += arg5 - 1;
				}
			}
		}
		for (local49 = 0; local49 < this.aClass1_Sub4Array25.length; local49++) {
			this.aClass1_Sub4Array25[local49].method4751();
		}
		return local17;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!nk;DBIZLclient!ce;)Lclient!ch;")
	public Class1_Sub2_Sub1_Sub2 method2462(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) double arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Interface1 arg4) {
		Static141.method2437(arg2);
		Static70.aClass121_40 = arg1;
		Static100.anInterface1_1 = arg4;
		Static225.method3499(arg0, arg3);
		@Pc(22) Class1_Sub2_Sub1_Sub2 local22 = new Class1_Sub2_Sub1_Sub2(arg3, arg0);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub4Array25.length; local24++) {
			this.aClass1_Sub4Array25[local24].method4743(arg0, arg3);
		}
		local24 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			if (this.aClass1_Sub4_1.aBoolean383) {
				@Pc(85) int[] local85 = this.aClass1_Sub4_1.method4746(local48);
				local73 = local85;
				local77 = local85;
				local69 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass1_Sub4_1.method4756(local48);
				local69 = local65[0];
				local73 = local65[1];
				local77 = local65[2];
			}
			for (@Pc(95) int local95 = arg3 - 1; local95 >= 0; local95--) {
				@Pc(103) int local103 = local69[local95] >> 4;
				if (local103 > 255) {
					local103 = 255;
				}
				if (local103 < 0) {
					local103 = 0;
				}
				local103 = Static155.anIntArray258[local103];
				@Pc(127) int local127 = local73[local95] >> 4;
				@Pc(133) int local133 = local77[local95] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				if (local127 > 255) {
					local127 = 255;
				}
				local133 = Static155.anIntArray258[local133];
				if (local127 < 0) {
					local127 = 0;
				}
				local127 = Static155.anIntArray258[local127];
				local22.anIntArray391[local24++] = local133 + (local103 << 16) + (local127 << 8);
			}
		}
		for (@Pc(207) int local207 = 0; local207 < this.aClass1_Sub4Array25.length; local207++) {
			this.aClass1_Sub4Array25[local207].method4751();
		}
		return local22;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ce;IDIZILclient!nk;)Lclient!rh;")
	public Class1_Sub2_Sub1_Sub2_Sub1 method2463(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class121 arg4) {
		Static141.method2437(arg2);
		Static100.anInterface1_1 = arg0;
		Static70.aClass121_40 = arg4;
		Static225.method3499(arg1, arg3);
		@Pc(22) Class1_Sub2_Sub1_Sub2_Sub1 local22 = new Class1_Sub2_Sub1_Sub2_Sub1(arg3, arg1);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub4Array25.length; local24++) {
			this.aClass1_Sub4Array25[local24].method4743(arg1, arg3);
		}
		local24 = 0;
		@Pc(44) int local44;
		for (local44 = 0; local44 < arg1; local44++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub4_1.aBoolean383) {
				local85 = this.aClass1_Sub4_1.method4746(local44);
				local67 = local85;
				local71 = local85;
				local75 = local85;
			} else {
				@Pc(63) int[][] local63 = this.aClass1_Sub4_1.method4756(local44);
				local67 = local63[0];
				local71 = local63[1];
				local75 = local63[2];
			}
			if (this.aClass1_Sub4_3.aBoolean383) {
				local85 = this.aClass1_Sub4_3.method4746(local44);
			} else {
				local85 = this.aClass1_Sub4_3.method4756(local44)[0];
			}
			for (@Pc(115) int local115 = arg3 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local71[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				@Pc(135) int local135 = local75[local115] >> 4;
				@Pc(141) int local141 = local67[local115] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				local123 = Static155.anIntArray258[local123];
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				local135 = Static155.anIntArray258[local135];
				local141 = Static155.anIntArray258[local141];
				@Pc(199) int local199;
				if (local141 == 0 && local123 == 0 && local135 == 0) {
					local199 = 0;
				} else {
					local199 = local85[local115] >> 4;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 < 0) {
						local199 = 0;
					}
				}
				local22.anIntArray391[local24++] = (local123 << 8) + (local141 << 16) + (local199 << 24) + local135;
			}
		}
		for (local44 = 0; local44 < this.aClass1_Sub4Array25.length; local44++) {
			this.aClass1_Sub4Array25[local44].method4751();
		}
		return local22;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIZLclient!nk;DILclient!ce;I)[I")
	public int[] method2464(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(4) double arg4, @OriginalArg(6) Interface1 arg5, @OriginalArg(7) int arg6) {
		Static141.method2437(arg4);
		Static70.aClass121_40 = arg3;
		Static100.anInterface1_1 = arg5;
		@Pc(13) int[] local13 = new int[arg6 * arg1];
		Static225.method3499(arg1, arg6);
		@Pc(19) int local19;
		for (local19 = 0; local19 < this.aClass1_Sub4Array25.length; local19++) {
			this.aClass1_Sub4Array25[local19].method4743(arg1, arg6);
		}
		@Pc(61) int local61;
		@Pc(57) byte local57;
		if (arg2) {
			local61 = -1;
			local19 = arg6 - 1;
			local57 = -1;
		} else {
			local57 = 1;
			local19 = 0;
			local61 = arg6;
		}
		@Pc(73) int local73 = 0;
		@Pc(75) int local75;
		for (local75 = 0; local75 < arg1; local75++) {
			if (arg0) {
				local73 = local75;
			}
			@Pc(101) int[] local101;
			@Pc(105) int[] local105;
			@Pc(109) int[] local109;
			if (this.aClass1_Sub4_1.aBoolean383) {
				@Pc(117) int[] local117 = this.aClass1_Sub4_1.method4746(local75);
				local101 = local117;
				local109 = local117;
				local105 = local117;
			} else {
				@Pc(97) int[][] local97 = this.aClass1_Sub4_1.method4756(local75);
				local101 = local97[0];
				local105 = local97[1];
				local109 = local97[2];
			}
			for (@Pc(125) int local125 = local19; local125 != local61; local125 += local57) {
				@Pc(134) int local134 = local101[local125] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(151) int local151 = local105[local125] >> 4;
				@Pc(157) int local157 = local109[local125] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local151 > 255) {
					local151 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local157 = Static155.anIntArray258[local157];
				local134 = Static155.anIntArray258[local134];
				if (local151 < 0) {
					local151 = 0;
				}
				local151 = Static155.anIntArray258[local151];
				local13[local73++] = local157 + (local134 << 16) + (local151 << 8);
				if (arg0) {
					local73 += arg6 - 1;
				}
			}
		}
		for (local75 = 0; local75 < this.aClass1_Sub4Array25.length; local75++) {
			this.aClass1_Sub4Array25[local75].method4751();
		}
		return local13;
	}
}
