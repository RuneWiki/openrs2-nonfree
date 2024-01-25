import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class4_Sub4_Sub8 extends Class4_Sub4 {

	@OriginalMember(owner = "client!kj", name = "K", descriptor = "[I")
	private final int[] anIntArray311;

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "[I")
	private final int[] anIntArray310;

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "Lclient!qn;")
	private final Class4_Sub6 aClass4_Sub6_3;

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "Lclient!qn;")
	private final Class4_Sub6 aClass4_Sub6_2;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Lclient!qn;")
	private final Class4_Sub6 aClass4_Sub6_1;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "[Lclient!qn;")
	private final Class4_Sub6[] aClass4_Sub6Array19;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	private Class4_Sub4_Sub8() {
		this.anIntArray311 = new int[0];
		this.anIntArray310 = new int[0];
		this.aClass4_Sub6_3 = new Class4_Sub6_Sub5(0);
		this.aClass4_Sub6_3.anInt6811 = 1;
		this.aClass4_Sub6_2 = new Class4_Sub6_Sub5();
		this.aClass4_Sub6_2.anInt6811 = 1;
		this.aClass4_Sub6_1 = new Class4_Sub6_Sub5();
		this.aClass4_Sub6Array19 = new Class4_Sub6[] { this.aClass4_Sub6_2, this.aClass4_Sub6_1, this.aClass4_Sub6_3 };
		this.aClass4_Sub6_1.anInt6811 = 1;
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class4_Sub4_Sub8(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method3440();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub6Array19 = new Class4_Sub6[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub6 local26 = Static182.method3492(arg0);
			if (local26.method5695() >= 0) {
				local9++;
			}
			if (local26.method5703() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass4_Sub6Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method3440();
			}
			this.aClass4_Sub6Array19[local20] = local26;
		}
		this.anIntArray310 = new int[local9];
		this.anIntArray311 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(94) int local94 = 0; local94 < local7; local94++) {
			@Pc(101) Class4_Sub6 local101 = this.aClass4_Sub6Array19[local94];
			local53 = local101.aClass4_Sub6Array42.length;
			for (@Pc(107) int local107 = 0; local107 < local53; local107++) {
				local101.aClass4_Sub6Array42[local107] = this.aClass4_Sub6Array19[local14[local94][local107]];
			}
			@Pc(133) int local133 = local101.method5695();
			@Pc(137) int local137 = local101.method5703();
			if (local133 > 0) {
				this.anIntArray310[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray311[local11++] = local137;
			}
			local14[local94] = null;
		}
		this.aClass4_Sub6_2 = this.aClass4_Sub6Array19[arg0.method3440()];
		this.aClass4_Sub6_1 = this.aClass4_Sub6Array19[arg0.method3440()];
		this.aClass4_Sub6_3 = this.aClass4_Sub6Array19[arg0.method3440()];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!bk;Lclient!tj;)Z")
	public boolean method3202(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class193 arg1) {
		@Pc(9) int local9;
		if (Static7.anInt191 <= 0) {
			for (local9 = 0; local9 < this.anIntArray310.length; local9++) {
				if (!arg1.method5064(this.anIntArray310[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray310.length; local9++) {
				if (!arg1.method5065(Static7.anInt191, this.anIntArray310[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray311.length; local9++) {
			if (!arg0.method5439(this.anIntArray311[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIBZLclient!tj;Lclient!bk;)[F")
	public float[] method3203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class193 arg3, @OriginalArg(5) Interface3 arg4) {
		Static33.anInterface3_1 = arg4;
		Static176.aClass193_28 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub6Array19.length; local11++) {
			this.aClass4_Sub6Array19[local11].method5692(arg0, arg1);
		}
		Static265.method4581(arg1, arg0);
		@Pc(42) float[] local42 = new float[arg1 * 4 * arg0];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			if (this.aClass4_Sub6_2.aBoolean489) {
				@Pc(83) int[] local83 = this.aClass4_Sub6_2.method5698(local46);
				local67 = local83;
				local71 = local83;
				local75 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass4_Sub6_2.method5694(local46);
				local67 = local63[0];
				local71 = local63[1];
				local75 = local63[2];
			}
			@Pc(99) int[] local99;
			if (this.aClass4_Sub6_1.aBoolean489) {
				local99 = this.aClass4_Sub6_1.method5698(local46);
			} else {
				local99 = this.aClass4_Sub6_1.method5694(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			@Pc(127) int[] local127;
			if (this.aClass4_Sub6_3.aBoolean489) {
				local127 = this.aClass4_Sub6_3.method5698(local46);
			} else {
				local127 = this.aClass4_Sub6_3.method5694(local46)[0];
			}
			for (@Pc(139) int local139 = arg1 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local99[local139] / 4096.0F;
				@Pc(161) float local161 = ((float) local127[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				local42[local44++] = (float) local67[local139] * local161;
				local42[local44++] = (float) local71[local139] * local161;
				local42[local44++] = local161 * (float) local75[local139];
				local42[local44++] = local148;
				if (arg2) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass4_Sub6Array19.length; local229++) {
			this.aClass4_Sub6Array19[local229].method5699();
		}
		return local42;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZZZDILclient!tj;Lclient!bk;)[I")
	public int[] method3204(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class193 arg5, @OriginalArg(7) Interface3 arg6) {
		Static33.anInterface3_1 = arg6;
		Static176.aClass193_28 = arg5;
		for (@Pc(16) int local16 = 0; local16 < this.aClass4_Sub6Array19.length; local16++) {
			this.aClass4_Sub6Array19[local16].method5692(arg0, arg4);
		}
		Static255.method4465(arg3);
		Static265.method4581(arg4, arg0);
		@Pc(48) int[] local48 = new int[arg4 * arg0];
		@Pc(58) int local58;
		@Pc(54) int local54;
		@Pc(52) byte local52;
		if (arg1) {
			local52 = -1;
			local54 = -1;
			local58 = arg4 - 1;
		} else {
			local58 = 0;
			local54 = arg4;
			local52 = 1;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			@Pc(94) int[] local94;
			if (this.aClass4_Sub6_2.aBoolean489) {
				@Pc(102) int[] local102 = this.aClass4_Sub6_2.method5698(local70);
				local94 = local102;
				local90 = local102;
				local86 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass4_Sub6_2.method5694(local70);
				local86 = local82[1];
				local90 = local82[0];
				local94 = local82[2];
			}
			if (arg2) {
				local68 = local70;
			}
			for (@Pc(114) int local114 = local58; local114 != local54; local114 += local52) {
				@Pc(122) int local122 = local90[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local86[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(160) int local160 = local94[local114] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local122 = Static186.anIntArray330[local122];
				local142 = Static186.anIntArray330[local142];
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static186.anIntArray330[local160];
				@Pc(194) int local194 = local160 + (local142 << 8) + (local122 << 16);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local48[local68++] = local194;
				if (arg2) {
					local68 += arg4 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass4_Sub6Array19.length; local230++) {
			this.aClass4_Sub6Array19[local230].method5699();
		}
		return local48;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZDLclient!tj;ILclient!bk;I)[I")
	public int[] method3207(@OriginalArg(1) boolean arg0, @OriginalArg(2) double arg1, @OriginalArg(3) Class193 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5) {
		Static176.aClass193_28 = arg2;
		Static33.anInterface3_1 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub6Array19.length; local11++) {
			this.aClass4_Sub6Array19[local11].method5692(arg5, arg3);
		}
		Static255.method4465(arg1);
		Static265.method4581(arg3, arg5);
		@Pc(41) int[] local41 = new int[arg5 * arg3 * 4];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg5; local45++) {
			@Pc(59) int[] local59;
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(57) int[] local57;
			if (this.aClass4_Sub6_2.aBoolean489) {
				local57 = this.aClass4_Sub6_2.method5698(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass4_Sub6_2.method5694(local45);
				local63 = local71[2];
				local59 = local71[0];
				local61 = local71[1];
			}
			if (this.aClass4_Sub6_1.aBoolean489) {
				local57 = this.aClass4_Sub6_1.method5698(local45);
			} else {
				local57 = this.aClass4_Sub6_1.method5694(local45)[0];
			}
			if (arg0) {
				local43 = local45;
			}
			for (@Pc(111) int local111 = arg3 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local59[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local61[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(152) int local152 = local63[local111] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				local119 = Static186.anIntArray330[local119];
				local137 = Static186.anIntArray330[local137];
				local152 = Static186.anIntArray330[local152];
				@Pc(187) int local187;
				if (local119 == 0 && local137 == 0 && local152 == 0) {
					local187 = 0;
				} else {
					local187 = local57[local111] >> 4;
					if (local187 > 255) {
						local187 = 255;
					}
					if (local187 < 0) {
						local187 = 0;
					}
				}
				local41[local43++] = local152 + (local119 << 16) + (local187 << 24) + (local137 << 8);
				if (arg0) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < this.aClass4_Sub6Array19.length; local252++) {
			this.aClass4_Sub6Array19[local252].method5699();
		}
		return local41;
	}
}
