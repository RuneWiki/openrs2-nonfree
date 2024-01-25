import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class4_Sub6_Sub18 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "[I")
	private final int[] anIntArray557;

	@OriginalMember(owner = "client!ur", name = "A", descriptor = "[I")
	private final int[] anIntArray556;

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "Lclient!ai;")
	private final Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!ur", name = "D", descriptor = "Lclient!ai;")
	private final Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!ur", name = "B", descriptor = "Lclient!ai;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!ur", name = "E", descriptor = "[Lclient!ai;")
	private final Class4_Sub2[] aClass4_Sub2Array38;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	private Class4_Sub6_Sub18() {
		this.anIntArray557 = new int[0];
		this.anIntArray556 = new int[0];
		this.aClass4_Sub2_3 = new Class4_Sub2_Sub39(0);
		this.aClass4_Sub2_3.anInt10522 = 1;
		this.aClass4_Sub2_2 = new Class4_Sub2_Sub39();
		this.aClass4_Sub2_2.anInt10522 = 1;
		this.aClass4_Sub2_1 = new Class4_Sub2_Sub39();
		this.aClass4_Sub2Array38 = new Class4_Sub2[] { this.aClass4_Sub2_2, this.aClass4_Sub2_1, this.aClass4_Sub2_3 };
		this.aClass4_Sub2_1.anInt10522 = 1;
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ek;)V")
	public Class4_Sub6_Sub18(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method7004();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub2Array38 = new Class4_Sub2[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub2 local26 = Static87.method1819(arg0);
			if (local26.method8205() >= 0) {
				local9++;
			}
			if (local26.method8207() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass4_Sub2Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method7004();
			}
			this.aClass4_Sub2Array38[local20] = local26;
		}
		this.anIntArray556 = new int[local9];
		this.anIntArray557 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class4_Sub2 local94 = this.aClass4_Sub2Array38[local87];
			local50 = local94.aClass4_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass4_Sub2Array42[local100] = this.aClass4_Sub2Array38[local14[local87][local100]];
			}
			@Pc(126) int local126 = local94.method8205();
			@Pc(130) int local130 = local94.method8207();
			if (local126 > 0) {
				this.anIntArray556[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray557[local11++] = local130;
			}
			local14[local87] = null;
		}
		this.aClass4_Sub2_2 = this.aClass4_Sub2Array38[arg0.method7004()];
		this.aClass4_Sub2_1 = this.aClass4_Sub2Array38[arg0.method7004()];
		this.aClass4_Sub2_3 = this.aClass4_Sub2Array38[arg0.method7004()];
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIZLclient!fa;Lclient!vo;)[F")
	public float[] method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) Class348 arg4) {
		Static333.anInterface7_7 = arg3;
		Static585.aClass348_135 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array38.length; local11++) {
			this.aClass4_Sub2Array38[local11].method8211(arg1, arg0);
		}
		Static407.method6144(arg1, arg0);
		@Pc(38) float[] local38 = new float[arg1 * 4 * arg0];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
			@Pc(62) int[] local62;
			@Pc(58) int[] local58;
			@Pc(66) int[] local66;
			if (this.aClass4_Sub2_2.aBoolean713) {
				@Pc(74) int[] local74 = this.aClass4_Sub2_2.method8203(local42);
				local66 = local74;
				local58 = local74;
				local62 = local74;
			} else {
				@Pc(54) int[][] local54 = this.aClass4_Sub2_2.method8201(local42);
				local58 = local54[1];
				local62 = local54[0];
				local66 = local54[2];
			}
			@Pc(90) int[] local90;
			if (this.aClass4_Sub2_1.aBoolean713) {
				local90 = this.aClass4_Sub2_1.method8203(local42);
			} else {
				local90 = this.aClass4_Sub2_1.method8201(local42)[0];
			}
			if (arg2) {
				local40 = local42 << 2;
			}
			@Pc(118) int[] local118;
			if (this.aClass4_Sub2_3.aBoolean713) {
				local118 = this.aClass4_Sub2_3.method8203(local42);
			} else {
				local118 = this.aClass4_Sub2_3.method8201(local42)[0];
			}
			for (@Pc(132) int local132 = arg1 - 1; local132 >= 0; local132--) {
				@Pc(141) float local141 = (float) local90[local132] / 4096.0F;
				if (local141 < 0.0F) {
					local141 = 0.0F;
				} else if (local141 > 1.0F) {
					local141 = 1.0F;
				}
				@Pc(168) float local168 = ((float) local118[local132] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = (float) local62[local132] * local168;
				local38[local40++] = local168 * (float) local58[local132];
				local38[local40++] = (float) local66[local132] * local168;
				local38[local40++] = local141;
				if (arg2) {
					local40 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.aClass4_Sub2Array38.length; local222++) {
			this.aClass4_Sub2Array38[local222].method8209();
		}
		return local38;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!vo;ILclient!fa;)Z")
	public boolean method7591(@OriginalArg(0) Class348 arg0, @OriginalArg(2) Interface7 arg1) {
		@Pc(18) int local18;
		if (Static33.anInt1199 >= 0) {
			for (local18 = 0; local18 < this.anIntArray556.length; local18++) {
				if (!arg0.method7972(Static33.anInt1199, this.anIntArray556[local18])) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray556.length; local18++) {
				if (!arg0.method7960(this.anIntArray556[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray557.length; local18++) {
			if (!arg1.method4463(this.anIntArray557[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIDZLclient!vo;IILclient!fa;)[I")
	public int[] method7594(@OriginalArg(0) boolean arg0, @OriginalArg(2) double arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class348 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Interface7 arg6) {
		Static333.anInterface7_7 = arg6;
		Static585.aClass348_135 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array38.length; local11++) {
			this.aClass4_Sub2Array38[local11].method8211(arg4, arg5);
		}
		Static410.method6364(arg1);
		Static407.method6144(arg4, arg5);
		@Pc(39) int[] local39 = new int[arg5 * arg4];
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(45) byte local45;
		if (arg2) {
			local45 = -1;
			local43 = arg4 - 1;
			local47 = -1;
		} else {
			local43 = 0;
			local45 = 1;
			local47 = arg4;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
			if (arg0) {
				local59 = local61;
			}
			@Pc(81) int[] local81;
			@Pc(83) int[] local83;
			@Pc(79) int[] local79;
			if (this.aClass4_Sub2_2.aBoolean713) {
				@Pc(77) int[] local77 = this.aClass4_Sub2_2.method8203(local61);
				local79 = local77;
				local81 = local77;
				local83 = local77;
			} else {
				@Pc(91) int[][] local91 = this.aClass4_Sub2_2.method8201(local61);
				local83 = local91[1];
				local79 = local91[2];
				local81 = local91[0];
			}
			for (@Pc(105) int local105 = local43; local105 != local47; local105 += local45) {
				@Pc(113) int local113 = local81[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(130) int local130 = local83[local105] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				@Pc(148) int local148 = local79[local105] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				local130 = Static149.anIntArray156[local130];
				if (local148 < 0) {
					local148 = 0;
				}
				local113 = Static149.anIntArray156[local113];
				local148 = Static149.anIntArray156[local148];
				@Pc(184) int local184 = local148 + (local113 << 16) + (local130 << 8);
				if (local184 != 0) {
					local184 |= 0xFF000000;
				}
				local39[local59++] = local184;
				if (arg0) {
					local59 += arg4 - 1;
				}
			}
		}
		for (@Pc(219) int local219 = 0; local219 < this.aClass4_Sub2Array38.length; local219++) {
			this.aClass4_Sub2Array38[local219].method8209();
		}
		return local39;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!vo;ZIDILclient!fa;)[I")
	public int[] method7598(@OriginalArg(0) int arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4, @OriginalArg(6) Interface7 arg5) {
		Static333.anInterface7_7 = arg5;
		Static585.aClass348_135 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array38.length; local11++) {
			this.aClass4_Sub2Array38[local11].method8211(arg3, arg0);
		}
		Static410.method6364(arg4);
		Static407.method6144(arg3, arg0);
		@Pc(45) int[] local45 = new int[arg0 * arg3 * 4];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
			@Pc(63) int[] local63;
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			@Pc(61) int[] local61;
			if (this.aClass4_Sub2_2.aBoolean713) {
				local61 = this.aClass4_Sub2_2.method8203(local49);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass4_Sub2_2.method8201(local49);
				local67 = local75[1];
				local63 = local75[0];
				local65 = local75[2];
			}
			if (arg2) {
				local47 = local49;
			}
			if (this.aClass4_Sub2_1.aBoolean713) {
				local61 = this.aClass4_Sub2_1.method8203(local49);
			} else {
				local61 = this.aClass4_Sub2_1.method8201(local49)[0];
			}
			for (@Pc(117) int local117 = arg3 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local63[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(142) int local142 = local67[local117] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(157) int local157 = local65[local117] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local142 = Static149.anIntArray156[local142];
				if (local157 < 0) {
					local157 = 0;
				}
				local125 = Static149.anIntArray156[local125];
				local157 = Static149.anIntArray156[local157];
				@Pc(198) int local198;
				if (local125 == 0 && local142 == 0 && local157 == 0) {
					local198 = 0;
				} else {
					local198 = local61[local117] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local45[local47++] = local157 + (local198 << 24) + (local125 << 16) + (local142 << 8);
				if (arg2) {
					local47 += arg3 - 1;
				}
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.aClass4_Sub2Array38.length; local262++) {
			this.aClass4_Sub2Array38[local262].method8209();
		}
		return local45;
	}
}
