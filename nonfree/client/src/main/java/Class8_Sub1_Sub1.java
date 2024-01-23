import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!be", name = "W", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "Lclient!ud;")
	private Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Lclient!ud;")
	private Class8_Sub3 aClass8_Sub3_2;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "Lclient!ud;")
	private Class8_Sub3 aClass8_Sub3_3;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "[Lclient!ud;")
	private Class8_Sub3[] aClass8_Sub3Array7;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) Class8_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2334();
		@Pc(9) int local9 = 0;
		this.aClass8_Sub3Array7 = new Class8_Sub3[local7];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(20) int local20;
		@Pc(31) Class8_Sub3 local31;
		@Pc(49) int local49;
		@Pc(56) int local56;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = Static95.method1517(arg0);
			if (local31.method4222() >= 0) {
				local9++;
			}
			if (local31.method4226() >= 0) {
				local15++;
			}
			local49 = local31.aClass8_Sub3Array42.length;
			local18[local20] = new int[local49];
			for (local56 = 0; local56 < local49; local56++) {
				local18[local20][local56] = arg0.method2334();
			}
			this.aClass8_Sub3Array7[local20] = local31;
		}
		this.anIntArray41 = new int[local9];
		local9 = 0;
		this.anIntArray39 = new int[local15];
		local15 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local31 = this.aClass8_Sub3Array7[local20];
			local49 = local31.aClass8_Sub3Array42.length;
			for (local56 = 0; local56 < local49; local56++) {
				local31.aClass8_Sub3Array42[local56] = this.aClass8_Sub3Array7[local18[local20][local56]];
			}
			local56 = local31.method4222();
			@Pc(136) int local136 = local31.method4226();
			if (local56 > 0) {
				this.anIntArray41[local9++] = local56;
			}
			if (local136 > 0) {
				this.anIntArray39[local15++] = local136;
			}
			local18[local20] = null;
		}
		this.aClass8_Sub3_2 = this.aClass8_Sub3Array7[arg0.method2334()];
		this.aClass8_Sub3_3 = this.aClass8_Sub3Array7[arg0.method2334()];
		this.aClass8_Sub3_1 = this.aClass8_Sub3Array7[arg0.method2334()];
		local18 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!pk;IBLclient!ln;IZD)Lclient!eg;")
	public Class8_Sub1_Sub7_Sub1 method356(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) double arg4) {
		Static156.method2489(arg4);
		Static172.anInterface3_1 = arg2;
		Static20.aClass132_6 = arg0;
		Static58.method1723(arg1, arg3);
		@Pc(22) Class8_Sub1_Sub7_Sub1 local22 = new Class8_Sub1_Sub7_Sub1(arg3, arg1);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass8_Sub3Array7.length; local24++) {
			this.aClass8_Sub3Array7[local24].method4225(arg3, arg1);
		}
		local24 = 0;
		@Pc(44) int local44;
		for (local44 = 0; local44 < arg1; local44++) {
			@Pc(74) int[] local74;
			@Pc(70) int[] local70;
			@Pc(78) int[] local78;
			if (this.aClass8_Sub3_2.aBoolean469) {
				@Pc(86) int[] local86 = this.aClass8_Sub3_2.method4227(local44);
				local78 = local86;
				local74 = local86;
				local70 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass8_Sub3_2.method4217(local44);
				local70 = local66[1];
				local74 = local66[0];
				local78 = local66[2];
			}
			for (@Pc(94) int local94 = 0; local94 != arg3; local94++) {
				@Pc(107) int local107 = local70[local94] >> 4;
				@Pc(113) int local113 = local78[local94] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				if (local107 < 0) {
					local107 = 0;
				}
				@Pc(142) int local142 = local74[local94] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				local113 = Static178.anIntArray264[local113];
				local142 = Static178.anIntArray264[local142];
				local107 = Static178.anIntArray264[local107];
				local22.anIntArray150[local24++] = local113 + (local142 << 16) + (local107 << 8);
			}
		}
		for (local44 = 0; local44 < this.aClass8_Sub3Array7.length; local44++) {
			this.aClass8_Sub3Array7[local44].method4219();
		}
		return local22;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(DIZIILclient!ln;Lclient!pk;)[I")
	public int[] method358(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) Class132 arg5) {
		@Pc(12) int[] local12 = new int[arg1 * 4 * arg3];
		Static156.method2489(arg0);
		Static172.anInterface3_1 = arg4;
		Static20.aClass132_6 = arg5;
		Static58.method1723(arg3, arg1);
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass8_Sub3Array7.length; local25++) {
			this.aClass8_Sub3Array7[local25].method4225(arg1, arg3);
		}
		local25 = 0;
		@Pc(55) int local55;
		for (local55 = 0; local55 < arg3; local55++) {
			if (arg2) {
				local25 = local55;
			}
			@Pc(84) int[] local84;
			@Pc(80) int[] local80;
			@Pc(88) int[] local88;
			@Pc(96) int[] local96;
			if (this.aClass8_Sub3_2.aBoolean469) {
				local96 = this.aClass8_Sub3_2.method4227(local55);
				local84 = local96;
				local88 = local96;
				local80 = local96;
			} else {
				@Pc(76) int[][] local76 = this.aClass8_Sub3_2.method4217(local55);
				local80 = local76[1];
				local84 = local76[0];
				local88 = local76[2];
			}
			if (this.aClass8_Sub3_3.aBoolean469) {
				local96 = this.aClass8_Sub3_3.method4227(local55);
			} else {
				local96 = this.aClass8_Sub3_3.method4217(local55)[0];
			}
			for (@Pc(126) int local126 = arg1 - 1; local126 >= 0; local126--) {
				@Pc(134) int local134 = local84[local126] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				@Pc(147) int local147 = local88[local126] >> 4;
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(160) int local160 = local80[local126] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local134 = Static178.anIntArray264[local134];
				if (local160 < 0) {
					local160 = 0;
				}
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				local160 = Static178.anIntArray264[local160];
				local147 = Static178.anIntArray264[local147];
				@Pc(217) int local217;
				if (local134 == 0 && local160 == 0 && local147 == 0) {
					local217 = 0;
				} else {
					local217 = local96[local126] >> 4;
					if (local217 > 255) {
						local217 = 255;
					}
					if (local217 < 0) {
						local217 = 0;
					}
				}
				local12[local25++] = (local160 << 8) + (local217 << 24) + (local134 << 16) + local147;
				if (arg2) {
					local25 += arg1 - 1;
				}
			}
		}
		for (local55 = 0; local55 < this.aClass8_Sub3Array7.length; local55++) {
			this.aClass8_Sub3Array7[local55].method4219();
		}
		return local12;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!pk;ILclient!ln;)Z")
	public boolean method359(@OriginalArg(0) Class132 arg0, @OriginalArg(2) Interface3 arg1) {
		@Pc(9) int local9;
		if (Static107.anInt2226 > 0) {
			for (local9 = 0; local9 < this.anIntArray41.length; local9++) {
				if (!arg0.method3180(this.anIntArray41[local9], Static107.anInt2226)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray41.length; local9++) {
				if (!arg0.method3166(this.anIntArray41[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray39.length; local9++) {
			if (!arg1.method1237(this.anIntArray39[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(DILclient!pk;BILclient!ln;ZZ)[I")
	public int[] method360(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		@Pc(10) int[] local10 = new int[arg3 * arg1];
		Static156.method2489(arg0);
		Static20.aClass132_6 = arg2;
		Static172.anInterface3_1 = arg4;
		Static58.method1723(arg1, arg3);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass8_Sub3Array7.length; local23++) {
			this.aClass8_Sub3Array7[local23].method4225(arg3, arg1);
		}
		@Pc(60) int local60;
		@Pc(58) byte local58;
		if (arg5) {
			local60 = -1;
			local23 = arg3 - 1;
			local58 = -1;
		} else {
			local58 = 1;
			local60 = arg3;
			local23 = 0;
		}
		@Pc(74) int local74 = 0;
		@Pc(76) int local76;
		for (local76 = 0; local76 < arg1; local76++) {
			if (arg6) {
				local74 = local76;
			}
			@Pc(105) int[] local105;
			@Pc(101) int[] local101;
			@Pc(97) int[] local97;
			if (this.aClass8_Sub3_2.aBoolean469) {
				@Pc(113) int[] local113 = this.aClass8_Sub3_2.method4227(local76);
				local97 = local113;
				local105 = local113;
				local101 = local113;
			} else {
				@Pc(93) int[][] local93 = this.aClass8_Sub3_2.method4217(local76);
				local97 = local93[2];
				local101 = local93[1];
				local105 = local93[0];
			}
			for (@Pc(121) int local121 = local23; local121 != local60; local121 += local58) {
				@Pc(134) int local134 = local105[local121] >> 4;
				@Pc(140) int local140 = local97[local121] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				local134 = Static178.anIntArray264[local134];
				@Pc(175) int local175 = local101[local121] >> 4;
				if (local175 > 255) {
					local175 = 255;
				}
				local140 = Static178.anIntArray264[local140];
				if (local175 < 0) {
					local175 = 0;
				}
				local175 = Static178.anIntArray264[local175];
				local10[local74++] = local140 + (local134 << 16) + (local175 << 8);
				if (arg6) {
					local74 += arg3 - 1;
				}
			}
		}
		for (local76 = 0; local76 < this.aClass8_Sub3Array7.length; local76++) {
			this.aClass8_Sub3Array7[local76].method4219();
		}
		return local10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!ln;ILclient!pk;ZID)Lclient!hh;")
	public Class8_Sub1_Sub7_Sub1_Sub1 method370(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) double arg4) {
		Static156.method2489(arg4);
		Static20.aClass132_6 = arg2;
		Static172.anInterface3_1 = arg0;
		Static58.method1723(arg3, arg1);
		@Pc(28) Class8_Sub1_Sub7_Sub1_Sub1 local28 = new Class8_Sub1_Sub7_Sub1_Sub1(arg1, arg3);
		@Pc(30) int local30;
		for (local30 = 0; local30 < this.aClass8_Sub3Array7.length; local30++) {
			this.aClass8_Sub3Array7[local30].method4225(arg1, arg3);
		}
		local30 = 0;
		@Pc(54) int local54;
		for (local54 = 0; local54 < arg3; local54++) {
			@Pc(81) int[] local81;
			@Pc(83) int[] local83;
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			if (this.aClass8_Sub3_2.aBoolean469) {
				local77 = this.aClass8_Sub3_2.method4227(local54);
				local79 = local77;
				local81 = local77;
				local83 = local77;
			} else {
				@Pc(91) int[][] local91 = this.aClass8_Sub3_2.method4217(local54);
				local83 = local91[1];
				local79 = local91[2];
				local81 = local91[0];
			}
			if (this.aClass8_Sub3_3.aBoolean469) {
				local77 = this.aClass8_Sub3_3.method4227(local54);
			} else {
				local77 = this.aClass8_Sub3_3.method4217(local54)[0];
			}
			for (@Pc(127) int local127 = arg1 - 1; local127 >= 0; local127--) {
				@Pc(138) int local138 = local83[local127] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				@Pc(150) int local150 = local79[local127] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				local138 = Static178.anIntArray264[local138];
				if (local150 < 0) {
					local150 = 0;
				}
				local150 = Static178.anIntArray264[local150];
				@Pc(188) int local188 = local81[local127] >> 4;
				if (local188 > 255) {
					local188 = 255;
				}
				if (local188 < 0) {
					local188 = 0;
				}
				local188 = Static178.anIntArray264[local188];
				@Pc(216) int local216;
				if (local188 == 0 && local138 == 0 && local150 == 0) {
					local216 = 0;
				} else {
					local216 = local77[local127] >> 4;
					if (local216 > 255) {
						local216 = 255;
					}
					if (local216 < 0) {
						local216 = 0;
					}
				}
				local28.anIntArray150[local30++] = local150 + (local138 << 8) + (local216 << 24) + (local188 << 16);
			}
		}
		for (local54 = 0; local54 < this.aClass8_Sub3Array7.length; local54++) {
			this.aClass8_Sub3Array7[local54].method4219();
		}
		return local28;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ln;IIZILclient!pk;)[F")
	public float[] method371(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class132 arg4) {
		Static20.aClass132_6 = arg4;
		@Pc(14) float[] local14 = new float[arg3 * arg1 * 4];
		Static172.anInterface3_1 = arg0;
		Static58.method1723(arg3, arg1);
		@Pc(22) int local22;
		for (local22 = 0; local22 < this.aClass8_Sub3Array7.length; local22++) {
			this.aClass8_Sub3Array7[local22].method4225(arg1, arg3);
		}
		local22 = 0;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg3; local46++) {
			if (arg2) {
				local22 = local46 << 2;
			}
			@Pc(71) int[] local71;
			@Pc(69) int[] local69;
			@Pc(67) int[] local67;
			if (this.aClass8_Sub3_2.aBoolean469) {
				@Pc(65) int[] local65 = this.aClass8_Sub3_2.method4227(local46);
				local67 = local65;
				local69 = local65;
				local71 = local65;
			} else {
				@Pc(79) int[][] local79 = this.aClass8_Sub3_2.method4217(local46);
				local67 = local79[2];
				local71 = local79[0];
				local69 = local79[1];
			}
			@Pc(101) int[] local101;
			if (this.aClass8_Sub3_3.aBoolean469) {
				local101 = this.aClass8_Sub3_3.method4227(local46);
			} else {
				local101 = this.aClass8_Sub3_3.method4217(local46)[0];
			}
			@Pc(121) int[] local121;
			if (this.aClass8_Sub3_1.aBoolean469) {
				local121 = this.aClass8_Sub3_1.method4227(local46);
			} else {
				local121 = this.aClass8_Sub3_1.method4217(local46)[0];
			}
			for (@Pc(135) int local135 = arg1 - 1; local135 >= 0; local135--) {
				@Pc(147) float local147 = (float) local101[local135] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local121[local135] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local14[local22++] = local174 * (float) local71[local135];
				local14[local22++] = local174 * (float) local69[local135];
				local14[local22++] = (float) local67[local135] * local174;
				local14[local22++] = local147;
				if (arg2) {
					local22 += (arg1 << 2) - 4;
				}
			}
		}
		for (local46 = 0; local46 < this.aClass8_Sub3Array7.length; local46++) {
			this.aClass8_Sub3Array7[local46].method4219();
		}
		return local14;
	}
}
