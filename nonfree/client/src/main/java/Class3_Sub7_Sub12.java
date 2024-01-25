import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class3_Sub7_Sub12 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "[I")
	private final int[] anIntArray252;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
	private final int[] anIntArray251;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!gs;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!gs;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!gs;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "[Lclient!gs;")
	private final Class3_Sub2[] aClass3_Sub2Array16;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	private Class3_Sub7_Sub12() {
		this.anIntArray252 = new int[0];
		this.anIntArray251 = new int[0];
		this.aClass3_Sub2_3 = new Class3_Sub2_Sub36(0);
		this.aClass3_Sub2_3.anInt10284 = 1;
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub36();
		this.aClass3_Sub2_1.anInt10284 = 1;
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub36();
		this.aClass3_Sub2_2.anInt10284 = 1;
		this.aClass3_Sub2Array16 = new Class3_Sub2[] { this.aClass3_Sub2_1, this.aClass3_Sub2_2, this.aClass3_Sub2_3 };
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class3_Sub7_Sub12(@OriginalArg(0) Class3_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method5633();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub2Array16 = new Class3_Sub2[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub2 local26 = Static65.method1150(arg0);
			if (local26.method8662() >= 0) {
				local9++;
			}
			if (local26.method8668() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub2Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method5633();
			}
			this.aClass3_Sub2Array16[local20] = local26;
		}
		this.anIntArray252 = new int[local9];
		local9 = 0;
		this.anIntArray251 = new int[local11];
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class3_Sub2 local94 = this.aClass3_Sub2Array16[local87];
			local50 = local94.aClass3_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass3_Sub2Array42[local100] = this.aClass3_Sub2Array16[local14[local87][local100]];
			}
			@Pc(126) int local126 = local94.method8662();
			@Pc(130) int local130 = local94.method8668();
			if (local126 > 0) {
				this.anIntArray252[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray251[local11++] = local130;
			}
			local14[local87] = null;
		}
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array16[arg0.method5633()];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array16[arg0.method5633()];
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array16[arg0.method5633()];
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!d;ILclient!uu;)Z")
	public boolean method3901(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Class343 arg1) {
		@Pc(17) int local17;
		if (Static15.anInt237 < 0) {
			for (local17 = 0; local17 < this.anIntArray252.length; local17++) {
				if (!arg1.method8138(this.anIntArray252[local17])) {
					return false;
				}
			}
		} else {
			for (local17 = 0; local17 < this.anIntArray252.length; local17++) {
				if (!arg1.method8130(Static15.anInt237, this.anIntArray252[local17])) {
					return false;
				}
			}
		}
		for (local17 = 0; local17 < this.anIntArray251.length; local17++) {
			if (!arg0.method4130(this.anIntArray251[local17])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIILclient!uu;Lclient!d;I)[F")
	public float[] method3902(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class343 arg3, @OriginalArg(4) Interface5 arg4) {
		Static408.aClass343_193 = arg3;
		Static444.anInterface5_10 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array16.length; local11++) {
			this.aClass3_Sub2Array16[local11].method8670(arg2, arg1);
		}
		Static432.method6572(arg1, arg2);
		@Pc(50) float[] local50 = new float[arg1 * 4 * arg2];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
			@Pc(68) int[] local68;
			@Pc(70) int[] local70;
			@Pc(72) int[] local72;
			if (this.aClass3_Sub2_1.aBoolean778) {
				@Pc(66) int[] local66 = this.aClass3_Sub2_1.method8664(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass3_Sub2_1.method8665(local54);
				local72 = local80[2];
				local68 = local80[0];
				local70 = local80[1];
			}
			@Pc(104) int[] local104;
			if (this.aClass3_Sub2_2.aBoolean778) {
				local104 = this.aClass3_Sub2_2.method8664(local54);
			} else {
				local104 = this.aClass3_Sub2_2.method8665(local54)[0];
			}
			@Pc(122) int[] local122;
			if (this.aClass3_Sub2_3.aBoolean778) {
				local122 = this.aClass3_Sub2_3.method8664(local54);
			} else {
				local122 = this.aClass3_Sub2_3.method8665(local54)[0];
			}
			if (arg0) {
				local52 = local54 << 2;
			}
			for (@Pc(142) int local142 = arg1 - 1; local142 >= 0; local142--) {
				@Pc(151) float local151 = (float) local104[local142] / 4096.0F;
				@Pc(164) float local164 = ((float) local122[local142] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local151 < 0.0F) {
					local151 = 0.0F;
				} else if (local151 > 1.0F) {
					local151 = 1.0F;
				}
				local50[local52++] = local164 * (float) local68[local142];
				local50[local52++] = (float) local70[local142] * local164;
				local50[local52++] = local164 * (float) local72[local142];
				local50[local52++] = local151;
				if (arg0) {
					local52 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass3_Sub2Array16.length; local235++) {
			this.aClass3_Sub2Array16[local235].method8666();
		}
		return local50;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(DIZZLclient!uu;Lclient!d;II)[I")
	public int[] method3903(@OriginalArg(0) double arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class343 arg3, @OriginalArg(5) Interface5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static444.anInterface5_10 = arg4;
		Static408.aClass343_193 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array16.length; local11++) {
			this.aClass3_Sub2Array16[local11].method8670(arg5, arg6);
		}
		Static511.method7393(arg0);
		Static432.method6572(arg6, arg5);
		@Pc(43) int[] local43 = new int[arg6 * arg5];
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(61) byte local61;
		if (arg1) {
			local61 = -1;
			local65 = arg6 - 1;
			local67 = -1;
		} else {
			local65 = 0;
			local67 = arg6;
			local61 = 1;
		}
		@Pc(77) int local77 = 0;
		for (@Pc(79) int local79 = 0; local79 < arg5; local79++) {
			if (arg2) {
				local77 = local79;
			}
			@Pc(109) int[] local109;
			@Pc(101) int[] local101;
			@Pc(105) int[] local105;
			if (this.aClass3_Sub2_1.aBoolean778) {
				@Pc(117) int[] local117 = this.aClass3_Sub2_1.method8664(local79);
				local109 = local117;
				local101 = local117;
				local105 = local117;
			} else {
				@Pc(97) int[][] local97 = this.aClass3_Sub2_1.method8665(local79);
				local101 = local97[1];
				local105 = local97[2];
				local109 = local97[0];
			}
			for (@Pc(125) int local125 = local65; local125 != local67; local125 += local61) {
				@Pc(133) int local133 = local109[local125] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(148) int local148 = local101[local125] >> 4;
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				@Pc(165) int local165 = local105[local125] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				local148 = Static234.anIntArray256[local148];
				if (local165 < 0) {
					local165 = 0;
				}
				local133 = Static234.anIntArray256[local133];
				local165 = Static234.anIntArray256[local165];
				@Pc(196) int local196 = (local148 << 8) + (local133 << 16) + local165;
				if (local196 != 0) {
					local196 |= 0xFF000000;
				}
				local43[local77++] = local196;
				if (arg2) {
					local77 += arg6 - 1;
				}
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.aClass3_Sub2Array16.length; local239++) {
			this.aClass3_Sub2Array16[local239].method8666();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BDILclient!uu;IZLclient!d;)[I")
	public int[] method3906(@OriginalArg(1) double arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class343 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Interface5 arg5) {
		Static408.aClass343_193 = arg2;
		Static444.anInterface5_10 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array16.length; local11++) {
			this.aClass3_Sub2Array16[local11].method8670(arg1, arg3);
		}
		Static511.method7393(arg0);
		Static432.method6572(arg3, arg1);
		@Pc(39) int[] local39 = new int[arg3 * arg1];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
			@Pc(63) int[] local63;
			@Pc(67) int[] local67;
			@Pc(59) int[] local59;
			@Pc(75) int[] local75;
			if (this.aClass3_Sub2_1.aBoolean778) {
				local75 = this.aClass3_Sub2_1.method8664(local43);
				local67 = local75;
				local59 = local75;
				local63 = local75;
			} else {
				@Pc(55) int[][] local55 = this.aClass3_Sub2_1.method8665(local43);
				local59 = local55[2];
				local63 = local55[0];
				local67 = local55[1];
			}
			if (arg4) {
				local41 = local43;
			}
			if (this.aClass3_Sub2_2.aBoolean778) {
				local75 = this.aClass3_Sub2_2.method8664(local43);
			} else {
				local75 = this.aClass3_Sub2_2.method8665(local43)[0];
			}
			for (@Pc(109) int local109 = arg3 - 1; local109 >= 0; local109--) {
				@Pc(117) int local117 = local63[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(137) int local137 = local67[local109] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local59[local109] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local137 = Static234.anIntArray256[local137];
				local117 = Static234.anIntArray256[local117];
				if (local154 < 0) {
					local154 = 0;
				}
				local154 = Static234.anIntArray256[local154];
				@Pc(195) int local195;
				if (local117 == 0 && local137 == 0 && local154 == 0) {
					local195 = 0;
				} else {
					local195 = local75[local109] >> 4;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 < 0) {
						local195 = 0;
					}
				}
				local39[local41++] = (local117 << 16) + (local195 << 24) + (local137 << 8) + local154;
				if (arg4) {
					local41 += arg3 - 1;
				}
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.aClass3_Sub2Array16.length; local247++) {
			this.aClass3_Sub2Array16[local247].method8666();
		}
		return local39;
	}
}
