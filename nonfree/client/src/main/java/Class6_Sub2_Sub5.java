import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 {

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "[I")
	private final int[] anIntArray148;

	@OriginalMember(owner = "client!dq", name = "E", descriptor = "[I")
	private final int[] anIntArray149;

	@OriginalMember(owner = "client!dq", name = "G", descriptor = "Lclient!be;")
	private final Class6_Sub4 aClass6_Sub4_2;

	@OriginalMember(owner = "client!dq", name = "I", descriptor = "Lclient!be;")
	private final Class6_Sub4 aClass6_Sub4_3;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "Lclient!be;")
	private final Class6_Sub4 aClass6_Sub4_1;

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "[Lclient!be;")
	private final Class6_Sub4[] aClass6_Sub4Array7;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	private Class6_Sub2_Sub5() {
		this.anIntArray148 = new int[0];
		this.anIntArray149 = new int[0];
		this.aClass6_Sub4_2 = new Class6_Sub4_Sub7(0);
		this.aClass6_Sub4_2.anInt9849 = 1;
		this.aClass6_Sub4_3 = new Class6_Sub4_Sub7();
		this.aClass6_Sub4_3.anInt9849 = 1;
		this.aClass6_Sub4_1 = new Class6_Sub4_Sub7();
		this.aClass6_Sub4Array7 = new Class6_Sub4[] { this.aClass6_Sub4_3, this.aClass6_Sub4_1, this.aClass6_Sub4_2 };
		this.aClass6_Sub4_1.anInt9849 = 1;
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class6_Sub2_Sub5(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(7) int local7 = arg0.method8604();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub4Array7 = new Class6_Sub4[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub4 local26 = Static625.method8702(arg0);
			if (local26.method8316() >= 0) {
				local9++;
			}
			if (local26.method8321() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub4Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method8604();
			}
			this.aClass6_Sub4Array7[local20] = local26;
		}
		this.anIntArray148 = new int[local9];
		this.anIntArray149 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class6_Sub4 local102 = this.aClass6_Sub4Array7[local95];
			local50 = local102.aClass6_Sub4Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass6_Sub4Array42[local108] = this.aClass6_Sub4Array7[local14[local95][local108]];
			}
			@Pc(130) int local130 = local102.method8316();
			@Pc(134) int local134 = local102.method8321();
			if (local130 > 0) {
				this.anIntArray148[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray149[local11++] = local134;
			}
			local14[local95] = null;
		}
		this.aClass6_Sub4_3 = this.aClass6_Sub4Array7[arg0.method8604()];
		this.aClass6_Sub4_1 = this.aClass6_Sub4Array7[arg0.method8604()];
		this.aClass6_Sub4_2 = this.aClass6_Sub4Array7[arg0.method8604()];
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!vd;ZZIIDLclient!d;)[I")
	public int[] method1814(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5, @OriginalArg(7) Interface4 arg6) {
		Static488.aClass353_135 = arg1;
		Static594.anInterface4_11 = arg6;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub4Array7.length; local19++) {
			this.aClass6_Sub4Array7[local19].method8318(arg0, arg4);
		}
		Static113.method1879(arg5);
		Static535.method7897(arg4, arg0);
		@Pc(51) int[] local51 = new int[arg4 * arg0];
		@Pc(61) int local61;
		@Pc(57) int local57;
		@Pc(55) byte local55;
		if (arg2) {
			local55 = -1;
			local57 = -1;
			local61 = arg0 - 1;
		} else {
			local55 = 1;
			local57 = arg0;
			local61 = 0;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg4; local73++) {
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			if (this.aClass6_Sub4_3.aBoolean674) {
				@Pc(85) int[] local85 = this.aClass6_Sub4_3.method8323(local73);
				local87 = local85;
				local89 = local85;
				local91 = local85;
			} else {
				@Pc(99) int[][] local99 = this.aClass6_Sub4_3.method8320(local73);
				local89 = local99[0];
				local87 = local99[2];
				local91 = local99[1];
			}
			if (arg3) {
				local71 = local73;
			}
			for (@Pc(117) int local117 = local61; local117 != local57; local117 += local55) {
				@Pc(125) int local125 = local89[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(140) int local140 = local91[local117] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(155) int local155 = local87[local117] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				local140 = Static283.anIntArray370[local140];
				if (local155 < 0) {
					local155 = 0;
				}
				local125 = Static283.anIntArray370[local125];
				local155 = Static283.anIntArray370[local155];
				@Pc(191) int local191 = (local125 << 16) + (local140 << 8) + local155;
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local51[local71++] = local191;
				if (arg3) {
					local71 += arg0 - 1;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass6_Sub4Array7.length; local231++) {
			this.aClass6_Sub4Array7[local231].method8322();
		}
		return local51;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILclient!vd;ZBLclient!d;)[F")
	public float[] method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Interface4 arg4) {
		Static488.aClass353_135 = arg2;
		Static594.anInterface4_11 = arg4;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub4Array7.length; local19++) {
			this.aClass6_Sub4Array7[local19].method8318(arg1, arg0);
		}
		Static535.method7897(arg0, arg1);
		@Pc(46) float[] local46 = new float[arg1 * 4 * arg0];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg0; local50++) {
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			if (this.aClass6_Sub4_3.aBoolean674) {
				@Pc(82) int[] local82 = this.aClass6_Sub4_3.method8323(local50);
				local70 = local82;
				local66 = local82;
				local74 = local82;
			} else {
				@Pc(62) int[][] local62 = this.aClass6_Sub4_3.method8320(local50);
				local66 = local62[0];
				local70 = local62[1];
				local74 = local62[2];
			}
			@Pc(98) int[] local98;
			if (this.aClass6_Sub4_1.aBoolean674) {
				local98 = this.aClass6_Sub4_1.method8323(local50);
			} else {
				local98 = this.aClass6_Sub4_1.method8320(local50)[0];
			}
			if (arg3) {
				local48 = local50 << 2;
			}
			@Pc(126) int[] local126;
			if (this.aClass6_Sub4_2.aBoolean674) {
				local126 = this.aClass6_Sub4_2.method8323(local50);
			} else {
				local126 = this.aClass6_Sub4_2.method8320(local50)[0];
			}
			for (@Pc(138) int local138 = arg1 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local126[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local46[local48++] = local174 * (float) local66[local138];
				local46[local48++] = local174 * (float) local70[local138];
				local46[local48++] = local174 * (float) local74[local138];
				local46[local48++] = local147;
				if (arg3) {
					local48 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass6_Sub4Array7.length; local235++) {
			this.aClass6_Sub4Array7[local235].method8322();
		}
		return local46;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!vd;Lclient!d;B)Z")
	public boolean method1818(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Interface4 arg1) {
		@Pc(9) int local9;
		if (Static648.anInt10742 < 0) {
			for (local9 = 0; local9 < this.anIntArray148.length; local9++) {
				if (!arg0.method8401(this.anIntArray148[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray148.length; local9++) {
				if (!arg0.method8407(this.anIntArray148[local9], Static648.anInt10742)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray149.length; local9++) {
			if (!arg1.method892(this.anIntArray149[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILclient!vd;IZLclient!d;D)[I")
	public int[] method1819(@OriginalArg(1) int arg0, @OriginalArg(2) Class353 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) double arg5) {
		Static594.anInterface4_11 = arg4;
		Static488.aClass353_135 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub4Array7.length; local11++) {
			this.aClass6_Sub4Array7[local11].method8318(arg2, arg0);
		}
		Static113.method1879(arg5);
		Static535.method7897(arg0, arg2);
		@Pc(39) int[] local39 = new int[arg0 * arg2];
		@Pc(41) int local41 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			@Pc(64) int[] local64;
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(60) int[] local60;
			if (this.aClass6_Sub4_3.aBoolean674) {
				local60 = this.aClass6_Sub4_3.method8323(local48);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass6_Sub4_3.method8320(local48);
				local66 = local74[2];
				local64 = local74[0];
				local62 = local74[1];
			}
			if (this.aClass6_Sub4_1.aBoolean674) {
				local60 = this.aClass6_Sub4_1.method8323(local48);
			} else {
				local60 = this.aClass6_Sub4_1.method8320(local48)[0];
			}
			if (arg3) {
				local41 = local48;
			}
			for (@Pc(114) int local114 = arg2 - 1; local114 >= 0; local114--) {
				@Pc(122) int local122 = local64[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(137) int local137 = local62[local114] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(152) int local152 = local66[local114] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local122 = Static283.anIntArray370[local122];
				local137 = Static283.anIntArray370[local137];
				if (local152 < 0) {
					local152 = 0;
				}
				local152 = Static283.anIntArray370[local152];
				@Pc(184) int local184;
				if (local122 == 0 && local137 == 0 && local152 == 0) {
					local184 = 0;
				} else {
					local184 = local60[local114] >> 4;
					if (local184 > 255) {
						local184 = 255;
					}
					if (local184 < 0) {
						local184 = 0;
					}
				}
				local39[local41++] = (local122 << 16) + (local184 << 24) + (local137 << 8) + local152;
				if (arg3) {
					local41 += arg2 - 1;
				}
			}
		}
		for (@Pc(241) int local241 = 0; local241 < this.aClass6_Sub4Array7.length; local241++) {
			this.aClass6_Sub4Array7[local241].method8322();
		}
		return local39;
	}
}
