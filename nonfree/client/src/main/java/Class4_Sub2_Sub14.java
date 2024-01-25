import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!op", name = "B", descriptor = "[I")
	private final int[] anIntArray386;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "[I")
	private final int[] anIntArray385;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "Lclient!mm;")
	private final Class4_Sub4 aClass4_Sub4_2;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "Lclient!mm;")
	private final Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "Lclient!mm;")
	private final Class4_Sub4 aClass4_Sub4_3;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "[Lclient!mm;")
	private final Class4_Sub4[] aClass4_Sub4Array22;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	private Class4_Sub2_Sub14() {
		this.anIntArray386 = new int[0];
		this.anIntArray385 = new int[0];
		this.aClass4_Sub4_2 = new Class4_Sub4_Sub8(0);
		this.aClass4_Sub4_2.anInt7633 = 1;
		this.aClass4_Sub4_1 = new Class4_Sub4_Sub8();
		this.aClass4_Sub4_1.anInt7633 = 1;
		this.aClass4_Sub4_3 = new Class4_Sub4_Sub8();
		this.aClass4_Sub4_3.anInt7633 = 1;
		this.aClass4_Sub4Array22 = new Class4_Sub4[] { this.aClass4_Sub4_1, this.aClass4_Sub4_3, this.aClass4_Sub4_2 };
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class4_Sub2_Sub14(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method5007();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass4_Sub4Array22 = new Class4_Sub4[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub4 local26 = Static137.method1968(arg0);
			if (local26.method6045() >= 0) {
				local9++;
			}
			if (local26.method6039() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass4_Sub4Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method5007();
			}
			this.aClass4_Sub4Array22[local20] = local26;
		}
		this.anIntArray386 = new int[local9];
		local9 = 0;
		this.anIntArray385 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class4_Sub4 local95 = this.aClass4_Sub4Array22[local88];
			local47 = local95.aClass4_Sub4Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass4_Sub4Array42[local101] = this.aClass4_Sub4Array22[local18[local88][local101]];
			}
			@Pc(123) int local123 = local95.method6045();
			@Pc(127) int local127 = local95.method6039();
			if (local123 > 0) {
				this.anIntArray386[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray385[local11++] = local127;
			}
			local18[local88] = null;
		}
		this.aClass4_Sub4_1 = this.aClass4_Sub4Array22[arg0.method5007()];
		this.aClass4_Sub4_3 = this.aClass4_Sub4Array22[arg0.method5007()];
		this.aClass4_Sub4_2 = this.aClass4_Sub4Array22[arg0.method5007()];
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ga;IIDZBZLclient!qn;)[I")
	public int[] method3795(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class211 arg6) {
		Static380.anInterface5_6 = arg0;
		Static82.aClass211_23 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array22.length; local11++) {
			this.aClass4_Sub4Array22[local11].method6041(arg2, arg1);
		}
		Static67.method1123(arg3);
		Static409.method5559(arg1, arg2);
		@Pc(53) int[] local53 = new int[arg1 * arg2];
		@Pc(63) int local63;
		@Pc(57) int local57;
		@Pc(59) byte local59;
		if (arg5) {
			local57 = -1;
			local59 = -1;
			local63 = arg2 - 1;
		} else {
			local57 = arg2;
			local59 = 1;
			local63 = 0;
		}
		@Pc(73) int local73 = 0;
		for (@Pc(75) int local75 = 0; local75 < arg1; local75++) {
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			@Pc(93) int[] local93;
			if (this.aClass4_Sub4_1.aBoolean535) {
				@Pc(87) int[] local87 = this.aClass4_Sub4_1.method6037(local75);
				local89 = local87;
				local91 = local87;
				local93 = local87;
			} else {
				@Pc(101) int[][] local101 = this.aClass4_Sub4_1.method6043(local75);
				local93 = local101[2];
				local91 = local101[1];
				local89 = local101[0];
			}
			if (arg4) {
				local73 = local75;
			}
			for (@Pc(119) int local119 = local63; local119 != local57; local119 += local59) {
				@Pc(127) int local127 = local89[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(145) int local145 = local91[local119] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(160) int local160 = local93[local119] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local145 = Static91.anIntArray130[local145];
				if (local160 < 0) {
					local160 = 0;
				}
				local127 = Static91.anIntArray130[local127];
				local160 = Static91.anIntArray130[local160];
				@Pc(191) int local191 = local160 + (local127 << 16) + (local145 << 8);
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local53[local73++] = local191;
				if (arg4) {
					local73 += arg2 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass4_Sub4Array22.length; local227++) {
			this.aClass4_Sub4Array22[local227].method6042();
		}
		return local53;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!qn;BLclient!ga;)Z")
	public boolean method3796(@OriginalArg(0) Class211 arg0, @OriginalArg(2) Interface5 arg1) {
		@Pc(9) int local9;
		if (Static254.anInt4210 < 0) {
			for (local9 = 0; local9 < this.anIntArray386.length; local9++) {
				if (!arg0.method4382(this.anIntArray386[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray386.length; local9++) {
				if (!arg0.method4367(Static254.anInt4210, this.anIntArray386[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray385.length; local9++) {
			if (!arg1.method4075(this.anIntArray385[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZILclient!qn;ILclient!ga;)[F")
	public float[] method3798(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class211 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface5 arg4) {
		Static380.anInterface5_6 = arg4;
		Static82.aClass211_23 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array22.length; local11++) {
			this.aClass4_Sub4Array22[local11].method6041(arg3, arg0);
		}
		Static409.method5559(arg0, arg3);
		@Pc(42) float[] local42 = new float[arg3 * arg0 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(60) int[] local60;
			@Pc(64) int[] local64;
			@Pc(62) int[] local62;
			if (this.aClass4_Sub4_1.aBoolean535) {
				@Pc(58) int[] local58 = this.aClass4_Sub4_1.method6037(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(74) int[][] local74 = this.aClass4_Sub4_1.method6043(local46);
				local60 = local74[0];
				local62 = local74[2];
				local64 = local74[1];
			}
			@Pc(98) int[] local98;
			if (this.aClass4_Sub4_3.aBoolean535) {
				local98 = this.aClass4_Sub4_3.method6037(local46);
			} else {
				local98 = this.aClass4_Sub4_3.method6043(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass4_Sub4_2.aBoolean535) {
				local116 = this.aClass4_Sub4_2.method6037(local46);
			} else {
				local116 = this.aClass4_Sub4_2.method6043(local46)[0];
			}
			if (arg1) {
				local44 = local46 << 2;
			}
			for (@Pc(136) int local136 = arg3 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local98[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local116[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local172 * (float) local60[local136];
				local42[local44++] = local172 * (float) local64[local136];
				local42[local44++] = local172 * (float) local62[local136];
				local42[local44++] = local145;
				if (arg1) {
					local44 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass4_Sub4Array22.length; local235++) {
			this.aClass4_Sub4Array22[local235].method6042();
		}
		return local42;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ga;IDLclient!qn;ZI)[I")
	public int[] method3800(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) double arg2, @OriginalArg(4) Class211 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static82.aClass211_23 = arg3;
		Static380.anInterface5_6 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array22.length; local11++) {
			this.aClass4_Sub4Array22[local11].method6041(arg1, arg5);
		}
		Static67.method1123(arg2);
		Static409.method5559(arg5, arg1);
		@Pc(41) int[] local41 = new int[arg1 * 4 * arg5];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg5; local45++) {
			@Pc(69) int[] local69;
			@Pc(61) int[] local61;
			@Pc(65) int[] local65;
			@Pc(77) int[] local77;
			if (this.aClass4_Sub4_1.aBoolean535) {
				local77 = this.aClass4_Sub4_1.method6037(local45);
				local65 = local77;
				local61 = local77;
				local69 = local77;
			} else {
				@Pc(57) int[][] local57 = this.aClass4_Sub4_1.method6043(local45);
				local61 = local57[1];
				local65 = local57[2];
				local69 = local57[0];
			}
			if (this.aClass4_Sub4_3.aBoolean535) {
				local77 = this.aClass4_Sub4_3.method6037(local45);
			} else {
				local77 = this.aClass4_Sub4_3.method6043(local45)[0];
			}
			if (arg4) {
				local43 = local45;
			}
			for (@Pc(111) int local111 = arg1 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local69[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(136) int local136 = local61[local111] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(153) int local153 = local65[local111] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local119 = Static91.anIntArray130[local119];
				if (local153 < 0) {
					local153 = 0;
				}
				local136 = Static91.anIntArray130[local136];
				local153 = Static91.anIntArray130[local153];
				@Pc(185) int local185;
				if (local119 == 0 && local136 == 0 && local153 == 0) {
					local185 = 0;
				} else {
					local185 = local77[local111] >> 4;
					if (local185 > 255) {
						local185 = 255;
					}
					if (local185 < 0) {
						local185 = 0;
					}
				}
				local41[local43++] = (local185 << 24) + (local119 << 16) + (local136 << 8) + local153;
				if (arg4) {
					local43 += arg1 - 1;
				}
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.aClass4_Sub4Array22.length; local251++) {
			this.aClass4_Sub4Array22[local251].method6042();
		}
		return local41;
	}
}
