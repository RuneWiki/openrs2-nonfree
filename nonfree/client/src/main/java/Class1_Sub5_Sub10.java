import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub5_Sub10 extends Class1_Sub5 {

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!kg", name = "V", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "Lclient!ie;")
	private Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "Lclient!ie;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "Lclient!ie;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "[Lclient!ie;")
	private Class1_Sub1[] aClass1_Sub1Array24;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class1_Sub5_Sub10(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method1853();
		this.aClass1_Sub1Array24 = new Class1_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(20) int local20;
		@Pc(27) Class1_Sub1 local27;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = Static198.method3331(arg0);
			if (local27.method4457() >= 0) {
				local15++;
			}
			if (local27.method4455() >= 0) {
				local13++;
			}
			local48 = local27.aClass1_Sub1Array42.length;
			local18[local20] = new int[local48];
			for (local55 = 0; local55 < local48; local55++) {
				local18[local20][local55] = arg0.method1853();
			}
			this.aClass1_Sub1Array24[local20] = local27;
		}
		this.anIntArray246 = new int[local13];
		this.anIntArray245 = new int[local15];
		local15 = 0;
		local13 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = this.aClass1_Sub1Array24[local20];
			local48 = local27.aClass1_Sub1Array42.length;
			for (local55 = 0; local55 < local48; local55++) {
				local27.aClass1_Sub1Array42[local55] = this.aClass1_Sub1Array24[local18[local20][local55]];
			}
			local55 = local27.method4457();
			@Pc(135) int local135 = local27.method4455();
			if (local55 > 0) {
				this.anIntArray245[local15++] = local55;
			}
			if (local135 > 0) {
				this.anIntArray246[local13++] = local135;
			}
			local18[local20] = null;
		}
		local18 = null;
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array24[arg0.method1853()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array24[arg0.method1853()];
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array24[arg0.method1853()];
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(DZLclient!nm;IILclient!eh;B)Lclient!le;")
	public Class1_Sub5_Sub6_Sub1 method2499(@OriginalArg(0) double arg0, @OriginalArg(2) Class119 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface1 arg4) {
		Static204.method3586(arg0);
		Static87.anInterface1_1 = arg4;
		Static166.aClass119_62 = arg1;
		Static62.method1108(arg3, arg2);
		@Pc(22) Class1_Sub5_Sub6_Sub1 local22 = new Class1_Sub5_Sub6_Sub1(arg2, arg3);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub1Array24.length; local24++) {
			this.aClass1_Sub1Array24[local24].method4463(arg2, arg3);
		}
		local24 = 0;
		@Pc(52) int local52;
		for (local52 = 0; local52 < arg3; local52++) {
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(77) int[] local77;
			if (this.aClass1_Sub1_1.aBoolean505) {
				@Pc(93) int[] local93 = this.aClass1_Sub1_1.method4465(local52);
				local85 = local93;
				local81 = local93;
				local77 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass1_Sub1_1.method4462(local52);
				local77 = local73[2];
				local81 = local73[0];
				local85 = local73[1];
			}
			for (@Pc(103) int local103 = arg2 - 1; local103 >= 0; local103--) {
				@Pc(114) int local114 = local81[local103] >> 4;
				@Pc(120) int local120 = local77[local103] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(139) int local139 = local85[local103] >> 4;
				if (local114 > 255) {
					local114 = 255;
				}
				local120 = Static192.anIntArray395[local120];
				if (local139 > 255) {
					local139 = 255;
				}
				if (local114 < 0) {
					local114 = 0;
				}
				local114 = Static192.anIntArray395[local114];
				if (local139 < 0) {
					local139 = 0;
				}
				local139 = Static192.anIntArray395[local139];
				local22.anIntArray117[local24++] = (local139 << 8) + ((local114 << 16) + local120);
			}
		}
		for (local52 = 0; local52 < this.aClass1_Sub1Array24.length; local52++) {
			this.aClass1_Sub1Array24[local52].method4458();
		}
		return local22;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZIILclient!nm;Lclient!eh;)[F")
	public float[] method2501(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class119 arg3, @OriginalArg(5) Interface1 arg4) {
		Static87.anInterface1_1 = arg4;
		@Pc(14) float[] local14 = new float[arg2 * arg1 * 4];
		Static166.aClass119_62 = arg3;
		Static62.method1108(arg2, arg1);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub1Array24.length; local24++) {
			this.aClass1_Sub1Array24[local24].method4463(arg1, arg2);
		}
		local24 = 0;
		@Pc(50) int local50;
		for (local50 = 0; local50 < arg2; local50++) {
			if (arg0) {
				local24 = local50 << 2;
			}
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			@Pc(79) int[] local79;
			if (this.aClass1_Sub1_1.aBoolean505) {
				@Pc(95) int[] local95 = this.aClass1_Sub1_1.method4465(local50);
				local83 = local95;
				local87 = local95;
				local79 = local95;
			} else {
				@Pc(75) int[][] local75 = this.aClass1_Sub1_1.method4462(local50);
				local79 = local75[2];
				local83 = local75[0];
				local87 = local75[1];
			}
			@Pc(111) int[] local111;
			if (this.aClass1_Sub1_2.aBoolean505) {
				local111 = this.aClass1_Sub1_2.method4465(local50);
			} else {
				local111 = this.aClass1_Sub1_2.method4462(local50)[0];
			}
			@Pc(133) int[] local133;
			if (this.aClass1_Sub1_3.aBoolean505) {
				local133 = this.aClass1_Sub1_3.method4465(local50);
			} else {
				local133 = this.aClass1_Sub1_3.method4462(local50)[0];
			}
			for (@Pc(145) int local145 = arg1 - 1; local145 >= 0; local145--) {
				@Pc(157) float local157 = (float) local111[local145] / 4096.0F;
				if (local157 < 0.0F) {
					local157 = 0.0F;
				} else if (local157 > 1.0F) {
					local157 = 1.0F;
				}
				@Pc(184) float local184 = ((float) local133[local145] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local14[local24++] = (float) local83[local145] * local184;
				local14[local24++] = (float) local87[local145] * local184;
				local14[local24++] = (float) local79[local145] * local184;
				local14[local24++] = local157;
				if (arg0) {
					local24 += (arg1 << 2) - 4;
				}
			}
		}
		for (local50 = 0; local50 < this.aClass1_Sub1Array24.length; local50++) {
			this.aClass1_Sub1Array24[local50].method4458();
		}
		return local14;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZDILclient!eh;Lclient!nm;I)Lclient!f;")
	public Class1_Sub5_Sub6_Sub1_Sub1 method2505(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface1 arg3, @OriginalArg(5) Class119 arg4) {
		Static204.method3586(arg1);
		Static166.aClass119_62 = arg4;
		Static87.anInterface1_1 = arg3;
		Static62.method1108(arg0, arg2);
		@Pc(24) Class1_Sub5_Sub6_Sub1_Sub1 local24 = new Class1_Sub5_Sub6_Sub1_Sub1(arg2, arg0);
		@Pc(26) int local26;
		for (local26 = 0; local26 < this.aClass1_Sub1Array24.length; local26++) {
			this.aClass1_Sub1Array24[local26].method4463(arg2, arg0);
		}
		local26 = 0;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg0; local46++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(69) int[] local69;
			@Pc(65) int[] local65;
			if (this.aClass1_Sub1_1.aBoolean505) {
				local65 = this.aClass1_Sub1_1.method4465(local46);
				local67 = local65;
				local69 = local65;
				local71 = local65;
			} else {
				@Pc(79) int[][] local79 = this.aClass1_Sub1_1.method4462(local46);
				local69 = local79[2];
				local67 = local79[0];
				local71 = local79[1];
			}
			if (this.aClass1_Sub1_2.aBoolean505) {
				local65 = this.aClass1_Sub1_2.method4465(local46);
			} else {
				local65 = this.aClass1_Sub1_2.method4462(local46)[0];
			}
			for (@Pc(115) int local115 = arg2 - 1; local115 >= 0; local115--) {
				@Pc(126) int local126 = local69[local115] >> 4;
				@Pc(132) int local132 = local71[local115] >> 4;
				@Pc(138) int local138 = local67[local115] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				if (local132 > 255) {
					local132 = 255;
				}
				if (local126 > 255) {
					local126 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				local132 = Static192.anIntArray395[local132];
				local138 = Static192.anIntArray395[local138];
				if (local126 < 0) {
					local126 = 0;
				}
				local126 = Static192.anIntArray395[local126];
				@Pc(201) int local201;
				if (local138 == 0 && local132 == 0 && local126 == 0) {
					local201 = 0;
				} else {
					local201 = local65[local115] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local24.anIntArray117[local26++] = (local138 << 16) + ((local201 << 24) - (-(local132 << 8) - local126));
			}
		}
		for (local46 = 0; local46 < this.aClass1_Sub1Array24.length; local46++) {
			this.aClass1_Sub1Array24[local46].method4458();
		}
		return local24;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!nm;Lclient!eh;)Z")
	public boolean method2506(@OriginalArg(1) Class119 arg0, @OriginalArg(2) Interface1 arg1) {
		@Pc(9) int local9;
		if (Static178.anInt3542 > 0) {
			for (local9 = 0; local9 < this.anIntArray245.length; local9++) {
				if (!arg0.method3229(Static178.anInt3542, this.anIntArray245[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray245.length; local9++) {
				if (!arg0.method3250(this.anIntArray245[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray246.length; local9++) {
			if (!arg1.method1451(this.anIntArray246[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!eh;IDIILclient!nm;Z)[I")
	public int[] method2509(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class119 arg4, @OriginalArg(6) boolean arg5) {
		Static204.method3586(arg2);
		Static166.aClass119_62 = arg4;
		Static87.anInterface1_1 = arg0;
		Static62.method1108(arg3, arg1);
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.aClass1_Sub1Array24.length; local20++) {
			this.aClass1_Sub1Array24[local20].method4463(arg1, arg3);
		}
		@Pc(43) int[] local43 = new int[arg3 * 4 * arg1];
		local20 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < arg3; local47++) {
			if (arg5) {
				local20 = local47;
			}
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub1_1.aBoolean505) {
				local85 = this.aClass1_Sub1_1.method4465(local47);
				local73 = local85;
				local69 = local85;
				local77 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass1_Sub1_1.method4462(local47);
				local69 = local65[2];
				local73 = local65[1];
				local77 = local65[0];
			}
			if (this.aClass1_Sub1_2.aBoolean505) {
				local85 = this.aClass1_Sub1_2.method4465(local47);
			} else {
				local85 = this.aClass1_Sub1_2.method4462(local47)[0];
			}
			for (@Pc(115) int local115 = arg1 - 1; local115 >= 0; local115--) {
				@Pc(126) int local126 = local77[local115] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(144) int local144 = local73[local115] >> 4;
				@Pc(150) int local150 = local69[local115] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				local126 = Static192.anIntArray395[local126];
				if (local150 < 0) {
					local150 = 0;
				}
				if (local144 > 255) {
					local144 = 255;
				}
				local150 = Static192.anIntArray395[local150];
				if (local144 < 0) {
					local144 = 0;
				}
				local144 = Static192.anIntArray395[local144];
				@Pc(200) int local200;
				if (local126 == 0 && local144 == 0 && local150 == 0) {
					local200 = 0;
				} else {
					local200 = local85[local115] >> 4;
					if (local200 > 255) {
						local200 = 255;
					}
					if (local200 < 0) {
						local200 = 0;
					}
				}
				local43[local20++] = (local126 << 16) + (local200 << 24) + (local144 << 8) + local150;
				if (arg5) {
					local20 += arg1 - 1;
				}
			}
		}
		for (local47 = 0; local47 < this.aClass1_Sub1Array24.length; local47++) {
			this.aClass1_Sub1Array24[local47].method4458();
		}
		return local43;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIDLclient!eh;Lclient!nm;IZI)[I")
	public int[] method2510(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) Interface1 arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static204.method3586(arg2);
		Static87.anInterface1_1 = arg3;
		@Pc(11) int[] local11 = new int[arg1 * arg6];
		Static166.aClass119_62 = arg4;
		Static62.method1108(arg6, arg1);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass1_Sub1Array24.length; local23++) {
			this.aClass1_Sub1Array24[local23].method4463(arg1, arg6);
		}
		@Pc(51) int local51;
		@Pc(53) byte local53;
		if (arg0) {
			local23 = arg1 - 1;
			local51 = -1;
			local53 = -1;
		} else {
			local53 = 1;
			local51 = arg1;
			local23 = 0;
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65;
		for (local65 = 0; local65 < arg6; local65++) {
			if (arg5) {
				local63 = local65;
			}
			@Pc(87) int[] local87;
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub1_1.aBoolean505) {
				@Pc(83) int[] local83 = this.aClass1_Sub1_1.method4465(local65);
				local85 = local83;
				local87 = local83;
				local89 = local83;
			} else {
				@Pc(97) int[][] local97 = this.aClass1_Sub1_1.method4462(local65);
				local87 = local97[0];
				local89 = local97[1];
				local85 = local97[2];
			}
			for (@Pc(111) int local111 = local23; local111 != local51; local111 += local53) {
				@Pc(120) int local120 = local87[local111] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				@Pc(132) int local132 = local89[local111] >> 4;
				if (local120 < 0) {
					local120 = 0;
				}
				local120 = Static192.anIntArray395[local120];
				@Pc(147) int local147 = local85[local111] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				local132 = Static192.anIntArray395[local132];
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				local147 = Static192.anIntArray395[local147];
				local11[local63++] = local147 + (local132 << 8) + (local120 << 16);
				if (arg5) {
					local63 += arg1 - 1;
				}
			}
		}
		for (local65 = 0; local65 < this.aClass1_Sub1Array24.length; local65++) {
			this.aClass1_Sub1Array24[local65].method4458();
		}
		return local11;
	}
}
