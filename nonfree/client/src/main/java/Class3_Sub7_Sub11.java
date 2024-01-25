import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class3_Sub7_Sub11 extends Class3_Sub7 {

	@OriginalMember(owner = "client!je", name = "B", descriptor = "[I")
	private final int[] anIntArray356;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
	private final int[] anIntArray355;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!en;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!en;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!en;")
	private final Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[Lclient!en;")
	private final Class3_Sub1[] aClass3_Sub1Array18;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	private Class3_Sub7_Sub11() {
		this.anIntArray356 = new int[0];
		this.anIntArray355 = new int[0];
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub9(0);
		this.aClass3_Sub1_2.anInt11242 = 1;
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub9();
		this.aClass3_Sub1_1.anInt11242 = 1;
		this.aClass3_Sub1_3 = new Class3_Sub1_Sub9();
		this.aClass3_Sub1_3.anInt11242 = 1;
		this.aClass3_Sub1Array18 = new Class3_Sub1[] { this.aClass3_Sub1_1, this.aClass3_Sub1_3, this.aClass3_Sub1_2 };
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class3_Sub7_Sub11(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2048(255);
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub1Array18 = new Class3_Sub1[local7];
		@Pc(59) int local59;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class3_Sub1 local28 = Static507.method6899(arg0);
			if (local28.method9579() >= 0) {
				local9++;
			}
			if (local28.method9575() >= 0) {
				local11++;
			}
			@Pc(52) int local52 = local28.aClass3_Sub1Array42.length;
			local14[local20] = new int[local52];
			for (local59 = 0; local59 < local52; local59++) {
				local14[local20][local59] = arg0.method2048(255);
			}
			this.aClass3_Sub1Array18[local20] = local28;
		}
		this.anIntArray356 = new int[local9];
		this.anIntArray355 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(108) int local108 = 0; local108 < local7; local108++) {
			@Pc(117) Class3_Sub1 local117 = this.aClass3_Sub1Array18[local108];
			local59 = local117.aClass3_Sub1Array42.length;
			for (@Pc(123) int local123 = 0; local123 < local59; local123++) {
				local117.aClass3_Sub1Array42[local123] = this.aClass3_Sub1Array18[local14[local108][local123]];
			}
			@Pc(147) int local147 = local117.method9579();
			@Pc(151) int local151 = local117.method9575();
			if (local147 > 0) {
				this.anIntArray356[local9++] = local147;
			}
			if (local151 > 0) {
				this.anIntArray355[local11++] = local151;
			}
			local14[local108] = null;
		}
		this.aClass3_Sub1_1 = this.aClass3_Sub1Array18[arg0.method2048(255)];
		this.aClass3_Sub1_3 = this.aClass3_Sub1Array18[arg0.method2048(255)];
		this.aClass3_Sub1_2 = this.aClass3_Sub1Array18[arg0.method2048(255)];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ik;ILclient!d;)Z")
	public boolean method4478(@OriginalArg(0) Class182 arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(9) int local9;
		if (Static227.anInt3696 < 0) {
			for (local9 = 0; local9 < this.anIntArray356.length; local9++) {
				if (!arg0.method3964(this.anIntArray356[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray356.length; local9++) {
				if (!arg0.method3986(Static227.anInt3696, this.anIntArray356[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray355.length; local9++) {
			if (!arg1.method5758(this.anIntArray355[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBZLclient!ik;Lclient!d;DI)[I")
	public int[] method4480(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class182 arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5) {
		Static644.aClass182_117 = arg2;
		Static342.anInterface4_7 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array18.length; local11++) {
			this.aClass3_Sub1Array18[local11].method9583(arg5, arg0);
		}
		if (-20 < -123) {
			this.method4478((Class182) null, (Interface4) null);
		}
		Static392.method5321(arg4);
		Static433.method5744(arg0, arg5);
		@Pc(56) int[] local56 = new int[arg0 * arg5];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < arg5; local60++) {
			@Pc(80) int[] local80;
			@Pc(76) int[] local76;
			@Pc(78) int[] local78;
			@Pc(74) int[] local74;
			if (this.aClass3_Sub1_1.aBoolean773) {
				local74 = this.aClass3_Sub1_1.method9573(local60);
				local76 = local74;
				local78 = local74;
				local80 = local74;
			} else {
				@Pc(88) int[][] local88 = this.aClass3_Sub1_1.method9580(local60);
				local78 = local88[2];
				local76 = local88[1];
				local80 = local88[0];
			}
			if (arg1) {
				local58 = local60;
			}
			if (this.aClass3_Sub1_3.aBoolean773) {
				local74 = this.aClass3_Sub1_3.method9573(local60);
			} else {
				local74 = this.aClass3_Sub1_3.method9580(local60)[0];
			}
			for (@Pc(128) int local128 = arg0 - 1; local128 >= 0; local128--) {
				@Pc(136) int local136 = local80[local128] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(156) int local156 = local76[local128] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				if (local156 < 0) {
					local156 = 0;
				}
				@Pc(176) int local176 = local78[local128] >> 4;
				if (local176 > 255) {
					local176 = 255;
				}
				local156 = Static637.anIntArray647[local156];
				if (local176 < 0) {
					local176 = 0;
				}
				local136 = Static637.anIntArray647[local136];
				local176 = Static637.anIntArray647[local176];
				@Pc(224) int local224;
				if (local136 == 0 && local156 == 0 && local176 == 0) {
					local224 = 0;
				} else {
					local224 = local74[local128] >> 4;
					if (local224 > 255) {
						local224 = 255;
					}
					if (local224 < 0) {
						local224 = 0;
					}
				}
				local56[local58++] = (local224 << 24) + (local136 << 16) + (local156 << 8) + local176;
				if (arg1) {
					local58 += arg0 - 1;
				}
			}
		}
		for (@Pc(280) int local280 = 0; local280 < this.aClass3_Sub1Array18.length; local280++) {
			this.aClass3_Sub1Array18[local280].method9574();
		}
		return local56;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!d;DILclient!ik;IBZ)[I")
	public int[] method4481(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class182 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		Static644.aClass182_117 = arg4;
		Static342.anInterface4_7 = arg1;
		for (@Pc(19) int local19 = 0; local19 < this.aClass3_Sub1Array18.length; local19++) {
			this.aClass3_Sub1Array18[local19].method9583(arg3, arg5);
		}
		Static392.method5321(arg2);
		Static433.method5744(arg5, arg3);
		@Pc(49) int[] local49 = new int[arg3 * arg5];
		@Pc(57) int local57;
		@Pc(55) int local55;
		@Pc(59) byte local59;
		if (arg6) {
			local59 = -1;
			local55 = -1;
			local57 = arg5 - 1;
		} else {
			local55 = arg5;
			local57 = 0;
			local59 = 1;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg3; local73++) {
			@Pc(91) int[] local91;
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			if (this.aClass3_Sub1_1.aBoolean773) {
				@Pc(107) int[] local107 = this.aClass3_Sub1_1.method9573(local73);
				local95 = local107;
				local99 = local107;
				local91 = local107;
			} else {
				@Pc(87) int[][] local87 = this.aClass3_Sub1_1.method9580(local73);
				local91 = local87[0];
				local95 = local87[2];
				local99 = local87[1];
			}
			if (arg0) {
				local71 = local73;
			}
			for (@Pc(119) int local119 = local57; local119 != local55; local119 += local59) {
				@Pc(127) int local127 = local91[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(144) int local144 = local99[local119] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(164) int local164 = local95[local119] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				if (local164 < 0) {
					local164 = 0;
				}
				local144 = Static637.anIntArray647[local144];
				local127 = Static637.anIntArray647[local127];
				local164 = Static637.anIntArray647[local164];
				@Pc(200) int local200 = local164 + (local144 << 8) + (local127 << 16);
				if (local200 != 0) {
					local200 |= 0xFF000000;
				}
				local49[local71++] = local200;
				if (arg0) {
					local71 += arg5 - 1;
				}
			}
		}
		for (@Pc(241) int local241 = 0; local241 < this.aClass3_Sub1Array18.length; local241++) {
			this.aClass3_Sub1Array18[local241].method9574();
		}
		return local49;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZILclient!ik;ILclient!d;)[F")
	public float[] method4482(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class182 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface4 arg4) {
		Static644.aClass182_117 = arg2;
		Static342.anInterface4_7 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array18.length; local11++) {
			this.aClass3_Sub1Array18[local11].method9583(arg1, arg3);
		}
		Static433.method5744(arg3, arg1);
		@Pc(48) float[] local48 = new float[arg3 * arg1 * 4];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
			@Pc(72) int[] local72;
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			if (this.aClass3_Sub1_1.aBoolean773) {
				@Pc(68) int[] local68 = this.aClass3_Sub1_1.method9573(local52);
				local70 = local68;
				local72 = local68;
				local74 = local68;
			} else {
				@Pc(82) int[][] local82 = this.aClass3_Sub1_1.method9580(local52);
				local74 = local82[2];
				local72 = local82[0];
				local70 = local82[1];
			}
			@Pc(106) int[] local106;
			if (this.aClass3_Sub1_3.aBoolean773) {
				local106 = this.aClass3_Sub1_3.method9573(local52);
			} else {
				local106 = this.aClass3_Sub1_3.method9580(local52)[0];
			}
			if (arg0) {
				local50 = local52 << 2;
			}
			@Pc(132) int[] local132;
			if (this.aClass3_Sub1_2.aBoolean773) {
				local132 = this.aClass3_Sub1_2.method9573(local52);
			} else {
				local132 = this.aClass3_Sub1_2.method9580(local52)[0];
			}
			for (@Pc(144) int local144 = arg3 - 1; local144 >= 0; local144--) {
				@Pc(153) float local153 = (float) local106[local144] / 4096.0F;
				@Pc(166) float local166 = ((float) local132[local144] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local153 < 0.0F) {
					local153 = 0.0F;
				} else if (local153 > 1.0F) {
					local153 = 1.0F;
				}
				local48[local50++] = local166 * (float) local72[local144];
				local48[local50++] = local166 * (float) local70[local144];
				local48[local50++] = (float) local74[local144] * local166;
				local48[local50++] = local153;
				if (arg0) {
					local50 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(241) int local241 = 0; local241 < this.aClass3_Sub1Array18.length; local241++) {
			this.aClass3_Sub1Array18[local241].method9574();
		}
		return local48;
	}
}
