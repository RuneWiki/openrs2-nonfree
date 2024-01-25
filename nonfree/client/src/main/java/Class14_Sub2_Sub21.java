import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class14_Sub2_Sub21 extends Class14_Sub2 {

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "[I")
	private final int[] anIntArray547;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "[I")
	private final int[] anIntArray548;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "Lclient!pia;")
	private final Class14_Sub7 aClass14_Sub7_3;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!pia;")
	private final Class14_Sub7 aClass14_Sub7_1;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "Lclient!pia;")
	private final Class14_Sub7 aClass14_Sub7_2;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "[Lclient!pia;")
	private final Class14_Sub7[] aClass14_Sub7Array38;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	private Class14_Sub2_Sub21() {
		this.anIntArray547 = new int[0];
		this.anIntArray548 = new int[0];
		this.aClass14_Sub7_3 = new Class14_Sub7_Sub8(0);
		this.aClass14_Sub7_3.anInt11067 = 1;
		this.aClass14_Sub7_1 = new Class14_Sub7_Sub8();
		this.aClass14_Sub7_1.anInt11067 = 1;
		this.aClass14_Sub7_2 = new Class14_Sub7_Sub8();
		this.aClass14_Sub7Array38 = new Class14_Sub7[] { this.aClass14_Sub7_1, this.aClass14_Sub7_2, this.aClass14_Sub7_3 };
		this.aClass14_Sub7_2.anInt11067 = 1;
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class14_Sub2_Sub21(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method7695(98);
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass14_Sub7Array38 = new Class14_Sub7[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(59) int local59;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class14_Sub7 local28 = Static464.method6837(arg0);
			if (local28.method9381() >= 0) {
				local9++;
			}
			if (local28.method9389() >= 0) {
				local11++;
			}
			@Pc(52) int local52 = local28.aClass14_Sub7Array42.length;
			local18[local20] = new int[local52];
			for (local59 = 0; local59 < local52; local59++) {
				local18[local20][local59] = arg0.method7695(106);
			}
			this.aClass14_Sub7Array38[local20] = local28;
		}
		this.anIntArray547 = new int[local9];
		local9 = 0;
		this.anIntArray548 = new int[local11];
		local11 = 0;
		for (@Pc(112) int local112 = 0; local112 < local7; local112++) {
			@Pc(121) Class14_Sub7 local121 = this.aClass14_Sub7Array38[local112];
			local59 = local121.aClass14_Sub7Array42.length;
			for (@Pc(127) int local127 = 0; local127 < local59; local127++) {
				local121.aClass14_Sub7Array42[local127] = this.aClass14_Sub7Array38[local18[local112][local127]];
			}
			@Pc(155) int local155 = local121.method9381();
			@Pc(159) int local159 = local121.method9389();
			if (local155 > 0) {
				this.anIntArray547[local9++] = local155;
			}
			if (local159 > 0) {
				this.anIntArray548[local11++] = local159;
			}
			local18[local112] = null;
		}
		this.aClass14_Sub7_1 = this.aClass14_Sub7Array38[arg0.method7695(109)];
		this.aClass14_Sub7_2 = this.aClass14_Sub7Array38[arg0.method7695(108)];
		this.aClass14_Sub7_3 = this.aClass14_Sub7Array38[arg0.method7695(118)];
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!d;Lclient!rg;B)Z")
	public boolean method8628(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class310 arg1) {
		@Pc(12) int local12;
		if (Static28.anInt6210 >= 0) {
			for (local12 = 0; local12 < this.anIntArray547.length; local12++) {
				if (!arg1.method7793(this.anIntArray547[local12], Static28.anInt6210)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray547.length; local12++) {
				if (!arg1.method7785(this.anIntArray547[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray548.length; local12++) {
			if (!arg0.method8974(this.anIntArray548[local12])) {
				return false;
			}
		}
		if (-17 != -17) {
			this.method8632((Class310) null, -22, (Interface4) null, -65, 20, 0.3845495768536978D, false);
		}
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!rg;ILclient!d;IZ)[F")
	public float[] method8629(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static338.anInterface4_8 = arg2;
		Static653.aClass310_131 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub7Array38.length; local11++) {
			this.aClass14_Sub7Array38[local11].method9378(arg3, arg0);
		}
		Static598.method8463(arg3, arg0);
		@Pc(40) float[] local40 = new float[arg0 * arg3 * 4];
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			@Pc(64) int[] local64;
			if (this.aClass14_Sub7_1.aBoolean773) {
				@Pc(60) int[] local60 = this.aClass14_Sub7_1.method9382(local44);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass14_Sub7_1.method9388(local44);
				local62 = local74[1];
				local64 = local74[2];
				local66 = local74[0];
			}
			@Pc(98) int[] local98;
			if (this.aClass14_Sub7_2.aBoolean773) {
				local98 = this.aClass14_Sub7_2.method9382(local44);
			} else {
				local98 = this.aClass14_Sub7_2.method9388(local44)[0];
			}
			@Pc(118) int[] local118;
			if (this.aClass14_Sub7_3.aBoolean773) {
				local118 = this.aClass14_Sub7_3.method9382(local44);
			} else {
				local118 = this.aClass14_Sub7_3.method9388(local44)[0];
			}
			if (arg4) {
				local42 = local44 << 2;
			}
			for (@Pc(136) int local136 = arg0 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local98[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local118[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local40[local42++] = local174 * (float) local66[local136];
				local40[local42++] = local174 * (float) local62[local136];
				local40[local42++] = local174 * (float) local64[local136];
				local40[local42++] = local145;
				if (arg4) {
					local42 += (arg0 << 2) - 4;
				}
			}
		}
		if (109 <= 97) {
			Static611.method8631(-32L);
		}
		for (@Pc(242) int local242 = 0; local242 < this.aClass14_Sub7Array38.length; local242++) {
			this.aClass14_Sub7Array38[local242].method9380();
		}
		return local40;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!d;ZZIIDILclient!rg;)[I")
	public int[] method8630(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5, @OriginalArg(7) Class310 arg6) {
		Static653.aClass310_131 = arg6;
		Static338.anInterface4_8 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub7Array38.length; local11++) {
			this.aClass14_Sub7Array38[local11].method9378(arg4, arg3);
		}
		Static431.method6451(arg5);
		Static598.method8463(arg4, arg3);
		@Pc(45) int[] local45 = new int[arg3 * arg4];
		@Pc(55) int local55;
		@Pc(51) int local51;
		@Pc(57) byte local57;
		if (arg1) {
			local51 = -1;
			local55 = arg3 - 1;
			local57 = -1;
		} else {
			local57 = 1;
			local51 = arg3;
			local55 = 0;
		}
		@Pc(83) int local83 = 0;
		for (@Pc(85) int local85 = 0; local85 < arg4; local85++) {
			if (arg2) {
				local83 = local85;
			}
			@Pc(107) int[] local107;
			@Pc(115) int[] local115;
			@Pc(111) int[] local111;
			if (this.aClass14_Sub7_1.aBoolean773) {
				@Pc(123) int[] local123 = this.aClass14_Sub7_1.method9382(local85);
				local115 = local123;
				local111 = local123;
				local107 = local123;
			} else {
				@Pc(103) int[][] local103 = this.aClass14_Sub7_1.method9388(local85);
				local107 = local103[0];
				local111 = local103[2];
				local115 = local103[1];
			}
			for (@Pc(131) int local131 = local55; local131 != local51; local131 += local57) {
				@Pc(139) int local139 = local107[local131] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(156) int local156 = local115[local131] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				if (local156 < 0) {
					local156 = 0;
				}
				@Pc(173) int local173 = local111[local131] >> 4;
				if (local173 > 255) {
					local173 = 255;
				}
				if (local173 < 0) {
					local173 = 0;
				}
				local139 = Static353.anIntArray572[local139];
				local156 = Static353.anIntArray572[local156];
				local173 = Static353.anIntArray572[local173];
				@Pc(206) int local206 = (local156 << 8) + (local139 << 16) + local173;
				if (local206 != 0) {
					local206 |= 0xFF000000;
				}
				local45[local83++] = local206;
				if (arg2) {
					local83 += arg3 - 1;
				}
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.aClass14_Sub7Array38.length; local251++) {
			this.aClass14_Sub7Array38[local251].method9380();
		}
		return local45;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!rg;ILclient!d;IIDZ)[I")
	public int[] method8632(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5, @OriginalArg(6) boolean arg6) {
		Static338.anInterface4_8 = arg2;
		Static653.aClass310_131 = arg0;
		if (arg3 != -16777216) {
			return null;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass14_Sub7Array38.length; local17++) {
			this.aClass14_Sub7Array38[local17].method9378(arg4, arg1);
		}
		Static431.method6451(arg5);
		Static598.method8463(arg4, arg1);
		@Pc(51) int[] local51 = new int[arg1 * arg4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg4; local55++) {
			@Pc(73) int[] local73;
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(71) int[] local71;
			if (this.aClass14_Sub7_1.aBoolean773) {
				local71 = this.aClass14_Sub7_1.method9382(local55);
				local73 = local71;
				local75 = local71;
				local77 = local71;
			} else {
				@Pc(85) int[][] local85 = this.aClass14_Sub7_1.method9388(local55);
				local73 = local85[0];
				local77 = local85[2];
				local75 = local85[1];
			}
			if (this.aClass14_Sub7_2.aBoolean773) {
				local71 = this.aClass14_Sub7_2.method9382(local55);
			} else {
				local71 = this.aClass14_Sub7_2.method9388(local55)[0];
			}
			if (arg6) {
				local53 = local55;
			}
			for (@Pc(125) int local125 = arg1 - 1; local125 >= 0; local125--) {
				@Pc(133) int local133 = local73[local125] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(148) int local148 = local75[local125] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				@Pc(165) int local165 = local77[local125] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				if (local165 < 0) {
					local165 = 0;
				}
				local148 = Static353.anIntArray572[local148];
				local133 = Static353.anIntArray572[local133];
				local165 = Static353.anIntArray572[local165];
				@Pc(206) int local206;
				if (local133 == 0 && local148 == 0 && local165 == 0) {
					local206 = 0;
				} else {
					local206 = local71[local125] >> 4;
					if (local206 > 255) {
						local206 = 255;
					}
					if (local206 < 0) {
						local206 = 0;
					}
				}
				local51[local53++] = local165 + (local148 << 8) + (local133 << 16) + (local206 << 24);
				if (arg6) {
					local53 += arg1 - 1;
				}
			}
		}
		for (@Pc(265) int local265 = 0; local265 < this.aClass14_Sub7Array38.length; local265++) {
			this.aClass14_Sub7Array38[local265].method9380();
		}
		return local51;
	}
}
