import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 {

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "[I")
	private final int[] anIntArray430;

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "[I")
	private final int[] anIntArray429;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "Lclient!nc;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "Lclient!nc;")
	private final Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "Lclient!nc;")
	private final Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "[Lclient!nc;")
	private final Class4_Sub2[] aClass4_Sub2Array29;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	private Class4_Sub1_Sub13() {
		this.anIntArray430 = new int[0];
		this.anIntArray429 = new int[0];
		this.aClass4_Sub2_1 = new Class4_Sub2_Sub22(0);
		this.aClass4_Sub2_1.anInt7578 = 1;
		this.aClass4_Sub2_2 = new Class4_Sub2_Sub22();
		this.aClass4_Sub2_2.anInt7578 = 1;
		this.aClass4_Sub2_3 = new Class4_Sub2_Sub22();
		this.aClass4_Sub2_3.anInt7578 = 1;
		this.aClass4_Sub2Array29 = new Class4_Sub2[] { this.aClass4_Sub2_2, this.aClass4_Sub2_3, this.aClass4_Sub2_1 };
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!tl;)V")
	public Class4_Sub1_Sub13(@OriginalArg(0) Class4_Sub30 arg0) {
		@Pc(7) int local7 = arg0.method4864();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass4_Sub2Array29 = new Class4_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub2 local26 = Static335.method4532(arg0);
			if (local26.method5841() >= 0) {
				local9++;
			}
			if (local26.method5844() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass4_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method4864();
			}
			this.aClass4_Sub2Array29[local20] = local26;
		}
		this.anIntArray430 = new int[local9];
		this.anIntArray429 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class4_Sub2 local98 = this.aClass4_Sub2Array29[local91];
			local50 = local98.aClass4_Sub2Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass4_Sub2Array42[local104] = this.aClass4_Sub2Array29[local18[local91][local104]];
			}
			@Pc(126) int local126 = local98.method5841();
			@Pc(130) int local130 = local98.method5844();
			if (local126 > 0) {
				this.anIntArray430[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray429[local11++] = local130;
			}
			local18[local91] = null;
		}
		this.aClass4_Sub2_2 = this.aClass4_Sub2Array29[arg0.method4864()];
		this.aClass4_Sub2_3 = this.aClass4_Sub2Array29[arg0.method4864()];
		this.aClass4_Sub2_1 = this.aClass4_Sub2Array29[arg0.method4864()];
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIILclient!m;ZDZLclient!ns;)[I")
	public int[] method3644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface10 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) double arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class166 arg6) {
		Static206.aClass166_149 = arg6;
		Static8.anInterface10_1 = arg2;
		for (@Pc(16) int local16 = 0; local16 < this.aClass4_Sub2Array29.length; local16++) {
			this.aClass4_Sub2Array29[local16].method5839(arg0, arg1);
		}
		Static109.method5356(arg4);
		Static105.method1659(arg0, arg1);
		@Pc(44) int[] local44 = new int[arg1 * arg0];
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) byte local52;
		if (arg5) {
			local48 = arg0 - 1;
			local52 = -1;
			local50 = -1;
		} else {
			local48 = 0;
			local50 = arg0;
			local52 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg1; local66++) {
			@Pc(80) int[] local80;
			@Pc(82) int[] local82;
			@Pc(84) int[] local84;
			if (this.aClass4_Sub2_2.aBoolean501) {
				@Pc(78) int[] local78 = this.aClass4_Sub2_2.method5838(local66);
				local80 = local78;
				local82 = local78;
				local84 = local78;
			} else {
				@Pc(92) int[][] local92 = this.aClass4_Sub2_2.method5842(local66);
				local80 = local92[0];
				local82 = local92[1];
				local84 = local92[2];
			}
			if (arg3) {
				local64 = local66;
			}
			for (@Pc(110) int local110 = local48; local110 != local50; local110 += local52) {
				@Pc(118) int local118 = local80[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(135) int local135 = local82[local110] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(153) int local153 = local84[local110] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local135 = Static197.anIntArray565[local135];
				if (local153 < 0) {
					local153 = 0;
				}
				local118 = Static197.anIntArray565[local118];
				local153 = Static197.anIntArray565[local153];
				@Pc(186) int local186 = (local118 << 16) + (local135 << 8) + local153;
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local44[local64++] = local186;
				if (arg3) {
					local64 += arg0 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass4_Sub2Array29.length; local225++) {
			this.aClass4_Sub2Array29[local225].method5840();
		}
		return local44;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(DILclient!m;ILclient!ns;ZI)[I")
	public int[] method3645(@OriginalArg(0) double arg0, @OriginalArg(2) Interface10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class166 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static206.aClass166_149 = arg3;
		Static8.anInterface10_1 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array29.length; local11++) {
			this.aClass4_Sub2Array29[local11].method5839(arg5, arg2);
		}
		Static109.method5356(arg0);
		Static105.method1659(arg5, arg2);
		@Pc(45) int[] local45 = new int[arg2 * 4 * arg5];
		@Pc(47) int local47 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			if (this.aClass4_Sub2_2.aBoolean501) {
				local69 = this.aClass4_Sub2_2.method5838(local57);
				local71 = local69;
				local73 = local69;
				local75 = local69;
			} else {
				@Pc(83) int[][] local83 = this.aClass4_Sub2_2.method5842(local57);
				local73 = local83[2];
				local71 = local83[1];
				local75 = local83[0];
			}
			if (arg4) {
				local47 = local57;
			}
			if (this.aClass4_Sub2_3.aBoolean501) {
				local69 = this.aClass4_Sub2_3.method5838(local57);
			} else {
				local69 = this.aClass4_Sub2_3.method5842(local57)[0];
			}
			for (@Pc(123) int local123 = arg5 - 1; local123 >= 0; local123--) {
				@Pc(131) int local131 = local75[local123] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(148) int local148 = local71[local123] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				@Pc(163) int local163 = local73[local123] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local148 = Static197.anIntArray565[local148];
				local131 = Static197.anIntArray565[local131];
				if (local163 < 0) {
					local163 = 0;
				}
				local163 = Static197.anIntArray565[local163];
				@Pc(204) int local204;
				if (local131 == 0 && local148 == 0 && local163 == 0) {
					local204 = 0;
				} else {
					local204 = local69[local123] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local45[local47++] = (local148 << 8) + (local204 << 24) + (local131 << 16) + local163;
				if (arg4) {
					local47 += arg5 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass4_Sub2Array29.length; local258++) {
			this.aClass4_Sub2Array29[local258].method5840();
		}
		return local45;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!ns;Lclient!m;IIZ)[F")
	public float[] method3646(@OriginalArg(1) Class166 arg0, @OriginalArg(2) Interface10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static8.anInterface10_1 = arg1;
		Static206.aClass166_149 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array29.length; local11++) {
			this.aClass4_Sub2Array29[local11].method5839(arg2, arg3);
		}
		Static105.method1659(arg2, arg3);
		@Pc(46) float[] local46 = new float[arg3 * 4 * arg2];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg3; local50++) {
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			@Pc(66) int[] local66;
			if (this.aClass4_Sub2_2.aBoolean501) {
				@Pc(62) int[] local62 = this.aClass4_Sub2_2.method5838(local50);
				local64 = local62;
				local66 = local62;
				local68 = local62;
			} else {
				@Pc(76) int[][] local76 = this.aClass4_Sub2_2.method5842(local50);
				local66 = local76[2];
				local68 = local76[1];
				local64 = local76[0];
			}
			@Pc(100) int[] local100;
			if (this.aClass4_Sub2_3.aBoolean501) {
				local100 = this.aClass4_Sub2_3.method5838(local50);
			} else {
				local100 = this.aClass4_Sub2_3.method5842(local50)[0];
			}
			if (arg4) {
				local48 = local50 << 2;
			}
			@Pc(126) int[] local126;
			if (this.aClass4_Sub2_1.aBoolean501) {
				local126 = this.aClass4_Sub2_1.method5838(local50);
			} else {
				local126 = this.aClass4_Sub2_1.method5842(local50)[0];
			}
			for (@Pc(138) int local138 = arg2 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local100[local138] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local126[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local46[local48++] = local174 * (float) local64[local138];
				local46[local48++] = local174 * (float) local68[local138];
				local46[local48++] = local174 * (float) local66[local138];
				local46[local48++] = local147;
				if (arg4) {
					local48 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass4_Sub2Array29.length; local228++) {
			this.aClass4_Sub2Array29[local228].method5840();
		}
		return local46;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!m;BLclient!ns;)Z")
	public boolean method3647(@OriginalArg(0) Interface10 arg0, @OriginalArg(2) Class166 arg1) {
		@Pc(12) int local12;
		if (Static68.anInt4583 < 0) {
			for (local12 = 0; local12 < this.anIntArray430.length; local12++) {
				if (!arg1.method3670(this.anIntArray430[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray430.length; local12++) {
				if (!arg1.method3693(Static68.anInt4583, this.anIntArray430[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray429.length; local12++) {
			if (!arg0.method4242(this.anIntArray429[local12])) {
				return false;
			}
		}
		return true;
	}
}
