import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "[I")
	private final int[] anIntArray681;

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "[I")
	private final int[] anIntArray682;

	@OriginalMember(owner = "client!rq", name = "U", descriptor = "Lclient!cl;")
	private final Class2_Sub6 aClass2_Sub6_3;

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "Lclient!cl;")
	private final Class2_Sub6 aClass2_Sub6_2;

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "Lclient!cl;")
	private final Class2_Sub6 aClass2_Sub6_1;

	@OriginalMember(owner = "client!rq", name = "Q", descriptor = "[Lclient!cl;")
	private final Class2_Sub6[] aClass2_Sub6Array34;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub14() {
		this.anIntArray681 = new int[0];
		this.anIntArray682 = new int[0];
		this.aClass2_Sub6_3 = new Class2_Sub6_Sub11(0);
		this.aClass2_Sub6_3.anInt6584 = 1;
		this.aClass2_Sub6_2 = new Class2_Sub6_Sub11();
		this.aClass2_Sub6_2.anInt6584 = 1;
		this.aClass2_Sub6_1 = new Class2_Sub6_Sub11();
		this.aClass2_Sub6_1.anInt6584 = 1;
		this.aClass2_Sub6Array34 = new Class2_Sub6[] { this.aClass2_Sub6_2, this.aClass2_Sub6_1, this.aClass2_Sub6_3 };
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class2_Sub1_Sub14(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method4240();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass2_Sub6Array34 = new Class2_Sub6[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub6 local26 = Static240.method3890(arg0);
			if (local26.method5638() >= 0) {
				local9++;
			}
			if (local26.method5634() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass2_Sub6Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method4240();
			}
			this.aClass2_Sub6Array34[local20] = local26;
		}
		this.anIntArray681 = new int[local9];
		local9 = 0;
		this.anIntArray682 = new int[local11];
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class2_Sub6 local97 = this.aClass2_Sub6Array34[local90];
			local53 = local97.aClass2_Sub6Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass2_Sub6Array42[local103] = this.aClass2_Sub6Array34[local14[local90][local103]];
			}
			@Pc(129) int local129 = local97.method5638();
			@Pc(133) int local133 = local97.method5634();
			if (local129 > 0) {
				this.anIntArray681[local9++] = local129;
			}
			if (local133 > 0) {
				this.anIntArray682[local11++] = local133;
			}
			local14[local90] = null;
		}
		this.aClass2_Sub6_2 = this.aClass2_Sub6Array34[arg0.method4240()];
		this.aClass2_Sub6_1 = this.aClass2_Sub6Array34[arg0.method4240()];
		this.aClass2_Sub6_3 = this.aClass2_Sub6Array34[arg0.method4240()];
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!bc;DILclient!fc;ZI)[I")
	public int[] method4877(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(5) boolean arg5) {
		Static307.anInterface1_5 = arg1;
		Static343.aClass71_84 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub6Array34.length; local11++) {
			this.aClass2_Sub6Array34[local11].method5636(arg3, arg0);
		}
		Static39.method838(arg2);
		Static31.method736(arg0, arg3);
		@Pc(41) int[] local41 = new int[arg3 * arg0 * 4];
		@Pc(43) int local43 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(71) int[] local71;
			@Pc(67) int[] local67;
			@Pc(75) int[] local75;
			@Pc(83) int[] local83;
			if (this.aClass2_Sub6_2.aBoolean491) {
				local83 = this.aClass2_Sub6_2.method5642(local51);
				local67 = local83;
				local71 = local83;
				local75 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass2_Sub6_2.method5641(local51);
				local67 = local63[1];
				local71 = local63[0];
				local75 = local63[2];
			}
			if (arg5) {
				local43 = local51;
			}
			if (this.aClass2_Sub6_1.aBoolean491) {
				local83 = this.aClass2_Sub6_1.method5642(local51);
			} else {
				local83 = this.aClass2_Sub6_1.method5641(local51)[0];
			}
			for (@Pc(117) int local117 = arg3 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local71[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(140) int local140 = local67[local117] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(160) int local160 = local75[local117] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local125 = Static201.anIntArray595[local125];
				local140 = Static201.anIntArray595[local140];
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static201.anIntArray595[local160];
				@Pc(197) int local197;
				if (local125 == 0 && local140 == 0 && local160 == 0) {
					local197 = 0;
				} else {
					local197 = local83[local117] >> 4;
					if (local197 > 255) {
						local197 = 255;
					}
					if (local197 < 0) {
						local197 = 0;
					}
				}
				local41[local43++] = (local125 << 16) + (local197 << 24) + (local140 << 8) + local160;
				if (arg5) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.aClass2_Sub6Array34.length; local251++) {
			this.aClass2_Sub6Array34[local251].method5633();
		}
		return local41;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!fc;BLclient!bc;ZII)[F")
	public float[] method4878(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static307.anInterface1_5 = arg1;
		Static343.aClass71_84 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub6Array34.length; local11++) {
			this.aClass2_Sub6Array34[local11].method5636(arg4, arg3);
		}
		Static31.method736(arg3, arg4);
		@Pc(44) float[] local44 = new float[arg3 * arg4 * 4];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg3; local48++) {
			@Pc(71) int[] local71;
			@Pc(73) int[] local73;
			@Pc(75) int[] local75;
			if (this.aClass2_Sub6_2.aBoolean491) {
				@Pc(69) int[] local69 = this.aClass2_Sub6_2.method5642(local48);
				local71 = local69;
				local73 = local69;
				local75 = local69;
			} else {
				@Pc(83) int[][] local83 = this.aClass2_Sub6_2.method5641(local48);
				local71 = local83[0];
				local73 = local83[1];
				local75 = local83[2];
			}
			@Pc(105) int[] local105;
			if (this.aClass2_Sub6_1.aBoolean491) {
				local105 = this.aClass2_Sub6_1.method5642(local48);
			} else {
				local105 = this.aClass2_Sub6_1.method5641(local48)[0];
			}
			if (arg2) {
				local46 = local48 << 2;
			}
			@Pc(133) int[] local133;
			if (this.aClass2_Sub6_3.aBoolean491) {
				local133 = this.aClass2_Sub6_3.method5642(local48);
			} else {
				local133 = this.aClass2_Sub6_3.method5641(local48)[0];
			}
			for (@Pc(145) int local145 = arg4 - 1; local145 >= 0; local145--) {
				@Pc(154) float local154 = (float) local105[local145] / 4096.0F;
				if (local154 < 0.0F) {
					local154 = 0.0F;
				} else if (local154 > 1.0F) {
					local154 = 1.0F;
				}
				@Pc(181) float local181 = ((float) local133[local145] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local44[local46++] = (float) local71[local145] * local181;
				local44[local46++] = (float) local73[local145] * local181;
				local44[local46++] = (float) local75[local145] * local181;
				local44[local46++] = local154;
				if (arg2) {
					local46 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.aClass2_Sub6Array34.length; local238++) {
			this.aClass2_Sub6Array34[local238].method5633();
		}
		return local44;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!fc;ZZIDILclient!bc;B)[I")
	public int[] method4880(@OriginalArg(0) Class71 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Interface1 arg6) {
		Static307.anInterface1_5 = arg6;
		Static343.aClass71_84 = arg0;
		for (@Pc(16) int local16 = 0; local16 < this.aClass2_Sub6Array34.length; local16++) {
			this.aClass2_Sub6Array34[local16].method5636(arg3, arg5);
		}
		Static39.method838(arg4);
		Static31.method736(arg5, arg3);
		@Pc(44) int[] local44 = new int[arg3 * arg5];
		@Pc(50) int local50;
		@Pc(48) int local48;
		@Pc(52) byte local52;
		if (arg2) {
			local50 = arg3 - 1;
			local48 = -1;
			local52 = -1;
		} else {
			local48 = arg3;
			local50 = 0;
			local52 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg5; local66++) {
			if (arg1) {
				local64 = local66;
			}
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			@Pc(94) int[] local94;
			if (this.aClass2_Sub6_2.aBoolean491) {
				@Pc(102) int[] local102 = this.aClass2_Sub6_2.method5642(local66);
				local94 = local102;
				local90 = local102;
				local86 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass2_Sub6_2.method5641(local66);
				local86 = local82[1];
				local90 = local82[0];
				local94 = local82[2];
			}
			for (@Pc(110) int local110 = local50; local110 != local48; local110 += local52) {
				@Pc(118) int local118 = local90[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(138) int local138 = local86[local110] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(153) int local153 = local94[local110] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local118 = Static201.anIntArray595[local118];
				local138 = Static201.anIntArray595[local138];
				if (local153 < 0) {
					local153 = 0;
				}
				local153 = Static201.anIntArray595[local153];
				@Pc(188) int local188 = local153 + (local118 << 16) + (local138 << 8);
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local44[local64++] = local188;
				if (arg1) {
					local64 += arg3 - 1;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass2_Sub6Array34.length; local231++) {
			this.aClass2_Sub6Array34[local231].method5633();
		}
		return local44;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!fc;Lclient!bc;I)Z")
	public boolean method4884(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Interface1 arg1) {
		@Pc(12) int local12;
		if (Static163.anInt2947 >= 0) {
			for (local12 = 0; local12 < this.anIntArray681.length; local12++) {
				if (!arg0.method1561(Static163.anInt2947, this.anIntArray681[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray681.length; local12++) {
				if (!arg0.method1560(this.anIntArray681[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray682.length; local12++) {
			if (!arg1.method2846(this.anIntArray682[local12])) {
				return false;
			}
		}
		return true;
	}
}
