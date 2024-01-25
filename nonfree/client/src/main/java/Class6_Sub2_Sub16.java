import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class6_Sub2_Sub16 extends Class6_Sub2 {

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "[I")
	private final int[] anIntArray564;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "[I")
	private final int[] anIntArray565;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "Lclient!qba;")
	private final Class6_Sub4 aClass6_Sub4_1;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "Lclient!qba;")
	private final Class6_Sub4 aClass6_Sub4_3;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "Lclient!qba;")
	private final Class6_Sub4 aClass6_Sub4_2;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "[Lclient!qba;")
	private final Class6_Sub4[] aClass6_Sub4Array32;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	private Class6_Sub2_Sub16() {
		this.anIntArray564 = new int[0];
		this.anIntArray565 = new int[0];
		this.aClass6_Sub4_1 = new Class6_Sub4_Sub25(0);
		this.aClass6_Sub4_1.anInt9490 = 1;
		this.aClass6_Sub4_3 = new Class6_Sub4_Sub25();
		this.aClass6_Sub4_3.anInt9490 = 1;
		this.aClass6_Sub4_2 = new Class6_Sub4_Sub25();
		this.aClass6_Sub4_2.anInt9490 = 1;
		this.aClass6_Sub4Array32 = new Class6_Sub4[] { this.aClass6_Sub4_3, this.aClass6_Sub4_2, this.aClass6_Sub4_1 };
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class6_Sub2_Sub16(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method6069();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub4Array32 = new Class6_Sub4[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub4 local26 = Static13.method6287(arg0);
			if (local26.method7749() >= 0) {
				local9++;
			}
			if (local26.method7758() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub4Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method6069();
			}
			this.aClass6_Sub4Array32[local20] = local26;
		}
		this.anIntArray565 = new int[local9];
		local9 = 0;
		this.anIntArray564 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class6_Sub4 local98 = this.aClass6_Sub4Array32[local91];
			local50 = local98.aClass6_Sub4Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass6_Sub4Array42[local104] = this.aClass6_Sub4Array32[local14[local91][local104]];
			}
			@Pc(130) int local130 = local98.method7749();
			@Pc(134) int local134 = local98.method7758();
			if (local130 > 0) {
				this.anIntArray565[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray564[local11++] = local134;
			}
			local14[local91] = null;
		}
		this.aClass6_Sub4_3 = this.aClass6_Sub4Array32[arg0.method6069()];
		this.aClass6_Sub4_2 = this.aClass6_Sub4Array32[arg0.method6069()];
		this.aClass6_Sub4_1 = this.aClass6_Sub4Array32[arg0.method6069()];
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!pfa;Lclient!e;DIII)[I")
	public int[] method6438(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static210.anInterface4_8 = arg2;
		Static131.aClass251_32 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub4Array32.length; local11++) {
			this.aClass6_Sub4Array32[local11].method7756(arg4, arg5);
		}
		Static314.method4914(arg3);
		Static533.method7242(arg5, arg4);
		@Pc(49) int[] local49 = new int[arg4 * arg5 * 4];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg4; local53++) {
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			if (this.aClass6_Sub4_3.aBoolean728) {
				local85 = this.aClass6_Sub4_3.method7753(local53);
				local69 = local85;
				local73 = local85;
				local77 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass6_Sub4_3.method7757(local53);
				local69 = local65[0];
				local73 = local65[1];
				local77 = local65[2];
			}
			if (arg0) {
				local51 = local53;
			}
			if (this.aClass6_Sub4_2.aBoolean728) {
				local85 = this.aClass6_Sub4_2.method7753(local53);
			} else {
				local85 = this.aClass6_Sub4_2.method7757(local53)[0];
			}
			for (@Pc(119) int local119 = arg5 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local69[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(147) int local147 = local73[local119] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(165) int local165 = local77[local119] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				local127 = Static176.anIntArray217[local127];
				local147 = Static176.anIntArray217[local147];
				if (local165 < 0) {
					local165 = 0;
				}
				local165 = Static176.anIntArray217[local165];
				@Pc(204) int local204;
				if (local127 == 0 && local147 == 0 && local165 == 0) {
					local204 = 0;
				} else {
					local204 = local85[local119] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local49[local51++] = local165 + (local204 << 24) + (local127 << 16) + (local147 << 8);
				if (arg0) {
					local51 += arg5 - 1;
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < this.aClass6_Sub4Array32.length; local252++) {
			this.aClass6_Sub4Array32[local252].method7751();
		}
		return local49;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!pfa;Lclient!e;I)Z")
	public boolean method6440(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Interface4 arg1) {
		@Pc(9) int local9;
		if (Static328.anInt5995 >= 0) {
			for (local9 = 0; local9 < this.anIntArray565.length; local9++) {
				if (!arg0.method5780(this.anIntArray565[local9], Static328.anInt5995)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray565.length; local9++) {
				if (!arg0.method5782(this.anIntArray565[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray564.length; local9++) {
			if (!arg1.method4233(this.anIntArray564[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILclient!pfa;IZLclient!e;)[F")
	public float[] method6441(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface4 arg4) {
		Static131.aClass251_32 = arg1;
		Static210.anInterface4_8 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub4Array32.length; local11++) {
			this.aClass6_Sub4Array32[local11].method7756(arg0, arg2);
		}
		Static533.method7242(arg2, arg0);
		@Pc(42) float[] local42 = new float[arg2 * arg0 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			if (this.aClass6_Sub4_3.aBoolean728) {
				@Pc(80) int[] local80 = this.aClass6_Sub4_3.method7753(local46);
				local70 = local80;
				local66 = local80;
				local62 = local80;
			} else {
				@Pc(58) int[][] local58 = this.aClass6_Sub4_3.method7757(local46);
				local62 = local58[0];
				local66 = local58[2];
				local70 = local58[1];
			}
			@Pc(96) int[] local96;
			if (this.aClass6_Sub4_2.aBoolean728) {
				local96 = this.aClass6_Sub4_2.method7753(local46);
			} else {
				local96 = this.aClass6_Sub4_2.method7757(local46)[0];
			}
			@Pc(118) int[] local118;
			if (this.aClass6_Sub4_1.aBoolean728) {
				local118 = this.aClass6_Sub4_1.method7753(local46);
			} else {
				local118 = this.aClass6_Sub4_1.method7757(local46)[0];
			}
			if (arg3) {
				local44 = local46 << 2;
			}
			for (@Pc(136) int local136 = arg2 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local118[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local42[local44++] = local158 * (float) local62[local136];
				local42[local44++] = local158 * (float) local70[local136];
				local42[local44++] = (float) local66[local136] * local158;
				local42[local44++] = local145;
				if (arg3) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass6_Sub4Array32.length; local233++) {
			this.aClass6_Sub4Array32[local233].method7751();
		}
		return local42;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIBLclient!e;DLclient!pfa;IZ)[I")
	public int[] method6442(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Class251 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static131.aClass251_32 = arg4;
		Static210.anInterface4_8 = arg2;
		for (@Pc(23) int local23 = 0; local23 < this.aClass6_Sub4Array32.length; local23++) {
			this.aClass6_Sub4Array32[local23].method7756(arg1, arg5);
		}
		Static314.method4914(arg3);
		Static533.method7242(arg5, arg1);
		@Pc(51) int[] local51 = new int[arg1 * arg5];
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(57) byte local57;
		if (arg0) {
			local55 = arg5 - 1;
			local59 = -1;
			local57 = -1;
		} else {
			local55 = 0;
			local57 = 1;
			local59 = arg5;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg1; local73++) {
			if (arg6) {
				local71 = local73;
			}
			@Pc(101) int[] local101;
			@Pc(93) int[] local93;
			@Pc(97) int[] local97;
			if (this.aClass6_Sub4_3.aBoolean728) {
				@Pc(111) int[] local111 = this.aClass6_Sub4_3.method7753(local73);
				local97 = local111;
				local93 = local111;
				local101 = local111;
			} else {
				@Pc(89) int[][] local89 = this.aClass6_Sub4_3.method7757(local73);
				local93 = local89[1];
				local97 = local89[2];
				local101 = local89[0];
			}
			for (@Pc(119) int local119 = local55; local119 != local59; local119 += local57) {
				@Pc(127) int local127 = local101[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(147) int local147 = local93[local119] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(162) int local162 = local97[local119] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local127 = Static176.anIntArray217[local127];
				if (local162 < 0) {
					local162 = 0;
				}
				local147 = Static176.anIntArray217[local147];
				local162 = Static176.anIntArray217[local162];
				@Pc(196) int local196 = (local127 << 16) + (local147 << 8) + local162;
				if (local196 != 0) {
					local196 |= 0xFF000000;
				}
				local51[local71++] = local196;
				if (arg6) {
					local71 += arg5 - 1;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass6_Sub4Array32.length; local236++) {
			this.aClass6_Sub4Array32[local236].method7751();
		}
		return local51;
	}
}
