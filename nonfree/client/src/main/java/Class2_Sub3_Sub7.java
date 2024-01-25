import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "[I")
	private final int[] anIntArray237;

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "[I")
	private final int[] anIntArray236;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "Lclient!mca;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "Lclient!mca;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "Lclient!mca;")
	private final Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "[Lclient!mca;")
	private final Class2_Sub2[] aClass2_Sub2Array15;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	private Class2_Sub3_Sub7() {
		this.anIntArray237 = new int[0];
		this.anIntArray236 = new int[0];
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub15(0);
		this.aClass2_Sub2_1.anInt9552 = 1;
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub15();
		this.aClass2_Sub2_2.anInt9552 = 1;
		this.aClass2_Sub2_3 = new Class2_Sub2_Sub15();
		this.aClass2_Sub2Array15 = new Class2_Sub2[] { this.aClass2_Sub2_2, this.aClass2_Sub2_3, this.aClass2_Sub2_1 };
		this.aClass2_Sub2_3.anInt9552 = 1;
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class2_Sub3_Sub7(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method4325();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub2Array15 = new Class2_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static142.method2407(arg0);
			if (local26.method7940() >= 0) {
				local9++;
			}
			if (local26.method7945() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method4325();
			}
			this.aClass2_Sub2Array15[local20] = local26;
		}
		this.anIntArray237 = new int[local9];
		this.anIntArray236 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class2_Sub2 local98 = this.aClass2_Sub2Array15[local91];
			local50 = local98.aClass2_Sub2Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass2_Sub2Array42[local104] = this.aClass2_Sub2Array15[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method7940();
			@Pc(134) int local134 = local98.method7945();
			if (local130 > 0) {
				this.anIntArray237[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray236[local11++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array15[arg0.method4325()];
		this.aClass2_Sub2_3 = this.aClass2_Sub2Array15[arg0.method4325()];
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array15[arg0.method4325()];
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!fa;IZLclient!pl;IDI)[I")
	public int[] method3310(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5) {
		Static229.aClass259_72 = arg3;
		Static405.anInterface5_9 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array15.length; local11++) {
			this.aClass2_Sub2Array15[local11].method7944(arg4, arg1);
		}
		Static137.method2310(arg5);
		Static226.method4128(arg4, arg1);
		@Pc(50) int[] local50 = new int[arg4 * 4 * arg1];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg4; local54++) {
			@Pc(72) int[] local72;
			@Pc(68) int[] local68;
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			if (this.aClass2_Sub2_2.aBoolean729) {
				local66 = this.aClass2_Sub2_2.method7941(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass2_Sub2_2.method7946(local54);
				local72 = local80[0];
				local68 = local80[1];
				local70 = local80[2];
			}
			if (arg2) {
				local52 = local54;
			}
			if (this.aClass2_Sub2_3.aBoolean729) {
				local66 = this.aClass2_Sub2_3.method7941(local54);
			} else {
				local66 = this.aClass2_Sub2_3.method7946(local54)[0];
			}
			for (@Pc(120) int local120 = arg1 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local72[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(143) int local143 = local68[local120] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(163) int local163 = local70[local120] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local143 = Static484.anIntArray585[local143];
				if (local163 < 0) {
					local163 = 0;
				}
				local128 = Static484.anIntArray585[local128];
				local163 = Static484.anIntArray585[local163];
				@Pc(198) int local198;
				if (local128 == 0 && local143 == 0 && local163 == 0) {
					local198 = 0;
				} else {
					local198 = local66[local120] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local50[local52++] = (local198 << 24) - (-(local128 << 16) - ((local143 << 8) + local163));
				if (arg2) {
					local52 += arg1 - 1;
				}
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.aClass2_Sub2Array15.length; local262++) {
			this.aClass2_Sub2Array15[local262].method7939();
		}
		return local50;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!pl;Lclient!fa;)Z")
	public boolean method3311(@OriginalArg(1) Class259 arg0, @OriginalArg(2) Interface5 arg1) {
		@Pc(10) int local10;
		if (Static337.anInt6204 < 0) {
			for (local10 = 0; local10 < this.anIntArray237.length; local10++) {
				if (!arg0.method5988(this.anIntArray237[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray237.length; local10++) {
				if (!arg0.method5990(this.anIntArray237[local10], Static337.anInt6204)) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray236.length; local10++) {
			if (!arg1.method914(this.anIntArray236[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIILclient!fa;Lclient!pl;I)[F")
	public float[] method3312(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) Class259 arg3, @OriginalArg(5) int arg4) {
		Static405.anInterface5_9 = arg2;
		Static229.aClass259_72 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array15.length; local11++) {
			this.aClass2_Sub2Array15[local11].method7944(arg1, arg4);
		}
		Static226.method4128(arg1, arg4);
		@Pc(38) float[] local38 = new float[arg1 * 4 * arg4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			@Pc(62) int[] local62;
			@Pc(58) int[] local58;
			@Pc(66) int[] local66;
			if (this.aClass2_Sub2_2.aBoolean729) {
				@Pc(74) int[] local74 = this.aClass2_Sub2_2.method7941(local42);
				local62 = local74;
				local66 = local74;
				local58 = local74;
			} else {
				@Pc(54) int[][] local54 = this.aClass2_Sub2_2.method7946(local42);
				local58 = local54[1];
				local62 = local54[0];
				local66 = local54[2];
			}
			@Pc(92) int[] local92;
			if (this.aClass2_Sub2_3.aBoolean729) {
				local92 = this.aClass2_Sub2_3.method7941(local42);
			} else {
				local92 = this.aClass2_Sub2_3.method7946(local42)[0];
			}
			if (arg0) {
				local40 = local42 << 2;
			}
			@Pc(120) int[] local120;
			if (this.aClass2_Sub2_1.aBoolean729) {
				local120 = this.aClass2_Sub2_1.method7941(local42);
			} else {
				local120 = this.aClass2_Sub2_1.method7946(local42)[0];
			}
			for (@Pc(132) int local132 = arg4 - 1; local132 >= 0; local132--) {
				@Pc(141) float local141 = (float) local92[local132] / 4096.0F;
				@Pc(154) float local154 = ((float) local120[local132] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local141 < 0.0F) {
					local141 = 0.0F;
				} else if (local141 > 1.0F) {
					local141 = 1.0F;
				}
				local38[local40++] = local154 * (float) local62[local132];
				local38[local40++] = (float) local58[local132] * local154;
				local38[local40++] = local154 * (float) local66[local132];
				local38[local40++] = local141;
				if (arg0) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass2_Sub2Array15.length; local229++) {
			this.aClass2_Sub2Array15[local229].method7939();
		}
		return local38;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!pl;DIZZILclient!fa;)[I")
	public int[] method3313(@OriginalArg(1) Class259 arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Interface5 arg6) {
		Static229.aClass259_72 = arg0;
		Static405.anInterface5_9 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array15.length; local11++) {
			this.aClass2_Sub2Array15[local11].method7944(arg5, arg2);
		}
		Static137.method2310(arg1);
		Static226.method4128(arg5, arg2);
		@Pc(39) int[] local39 = new int[arg5 * arg2];
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(43) byte local43;
		if (arg3) {
			local43 = -1;
			local47 = arg2 - 1;
			local49 = -1;
		} else {
			local43 = 1;
			local47 = 0;
			local49 = arg2;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg5; local67++) {
			@Pc(83) int[] local83;
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			if (this.aClass2_Sub2_2.aBoolean729) {
				@Pc(99) int[] local99 = this.aClass2_Sub2_2.method7941(local67);
				local87 = local99;
				local83 = local99;
				local91 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass2_Sub2_2.method7946(local67);
				local83 = local79[0];
				local87 = local79[2];
				local91 = local79[1];
			}
			if (arg4) {
				local59 = local67;
			}
			for (@Pc(111) int local111 = local47; local111 != local49; local111 += local43) {
				@Pc(119) int local119 = local83[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(139) int local139 = local91[local111] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(157) int local157 = local87[local111] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local119 = Static484.anIntArray585[local119];
				local139 = Static484.anIntArray585[local139];
				if (local157 < 0) {
					local157 = 0;
				}
				local157 = Static484.anIntArray585[local157];
				@Pc(190) int local190 = local157 + (local119 << 16) + (local139 << 8);
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local39[local59++] = local190;
				if (arg4) {
					local59 += arg2 - 1;
				}
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.aClass2_Sub2Array15.length; local222++) {
			this.aClass2_Sub2Array15[local222].method7939();
		}
		return local39;
	}
}
