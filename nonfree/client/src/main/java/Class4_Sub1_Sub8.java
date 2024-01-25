import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!et", name = "H", descriptor = "[I")
	public static final int[] anIntArray187 = new int[256];

	@OriginalMember(owner = "client!et", name = "B", descriptor = "[I")
	private final int[] anIntArray185;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "[I")
	private final int[] anIntArray186;

	@OriginalMember(owner = "client!et", name = "M", descriptor = "Lclient!pn;")
	private final Class4_Sub3 aClass4_Sub3_3;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "Lclient!pn;")
	private final Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!et", name = "A", descriptor = "Lclient!pn;")
	private final Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "[Lclient!pn;")
	private final Class4_Sub3[] aClass4_Sub3Array10;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray187[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	private Class4_Sub1_Sub8() {
		this.anIntArray185 = new int[0];
		this.anIntArray186 = new int[0];
		this.aClass4_Sub3_3 = new Class4_Sub3_Sub37(0);
		this.aClass4_Sub3_3.anInt8008 = 1;
		this.aClass4_Sub3_2 = new Class4_Sub3_Sub37();
		this.aClass4_Sub3_2.anInt8008 = 1;
		this.aClass4_Sub3_1 = new Class4_Sub3_Sub37();
		this.aClass4_Sub3_1.anInt8008 = 1;
		this.aClass4_Sub3Array10 = new Class4_Sub3[] { this.aClass4_Sub3_2, this.aClass4_Sub3_1, this.aClass4_Sub3_3 };
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!wn;)V")
	public Class4_Sub1_Sub8(@OriginalArg(0) Class4_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method4614();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub3Array10 = new Class4_Sub3[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub3 local26 = Static229.method3914(arg0);
			if (local26.method6332() >= 0) {
				local9++;
			}
			if (local26.method6333() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass4_Sub3Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method4614();
			}
			this.aClass4_Sub3Array10[local20] = local26;
		}
		this.anIntArray185 = new int[local9];
		local9 = 0;
		this.anIntArray186 = new int[local11];
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class4_Sub3 local97 = this.aClass4_Sub3Array10[local90];
			local53 = local97.aClass4_Sub3Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass4_Sub3Array42[local103] = this.aClass4_Sub3Array10[local14[local90][local103]];
			}
			@Pc(129) int local129 = local97.method6332();
			@Pc(133) int local133 = local97.method6333();
			if (local129 > 0) {
				this.anIntArray185[local9++] = local129;
			}
			if (local133 > 0) {
				this.anIntArray186[local11++] = local133;
			}
			local14[local90] = null;
		}
		this.aClass4_Sub3_2 = this.aClass4_Sub3Array10[arg0.method4614()];
		this.aClass4_Sub3_1 = this.aClass4_Sub3Array10[arg0.method4614()];
		this.aClass4_Sub3_3 = this.aClass4_Sub3Array10[arg0.method4614()];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BIZLclient!l;ILclient!ci;)[F")
	public float[] method1877(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class38 arg4) {
		Static320.anInterface4_7 = arg2;
		Static21.aClass38_5 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub3Array10.length; local11++) {
			this.aClass4_Sub3Array10[local11].method6336(arg3, arg0);
		}
		Static447.method6111(arg0, arg3);
		@Pc(42) float[] local42 = new float[arg0 * arg3 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			if (this.aClass4_Sub3_2.aBoolean587) {
				@Pc(78) int[] local78 = this.aClass4_Sub3_2.method6339(local46);
				local70 = local78;
				local62 = local78;
				local66 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass4_Sub3_2.method6335(local46);
				local62 = local58[1];
				local66 = local58[0];
				local70 = local58[2];
			}
			@Pc(94) int[] local94;
			if (this.aClass4_Sub3_1.aBoolean587) {
				local94 = this.aClass4_Sub3_1.method6339(local46);
			} else {
				local94 = this.aClass4_Sub3_1.method6335(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass4_Sub3_3.aBoolean587) {
				local116 = this.aClass4_Sub3_3.method6339(local46);
			} else {
				local116 = this.aClass4_Sub3_3.method6335(local46)[0];
			}
			if (arg1) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg0 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				@Pc(156) float local156 = ((float) local116[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				local42[local44++] = local156 * (float) local66[local134];
				local42[local44++] = local156 * (float) local62[local134];
				local42[local44++] = (float) local70[local134] * local156;
				local42[local44++] = local143;
				if (arg1) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass4_Sub3Array10.length; local236++) {
			this.aClass4_Sub3Array10[local236].method6334();
		}
		return local42;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BILclient!l;Lclient!ci;DZI)[I")
	public int[] method1878(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Class38 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static21.aClass38_5 = arg2;
		Static320.anInterface4_7 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub3Array10.length; local11++) {
			this.aClass4_Sub3Array10[local11].method6336(arg0, arg5);
		}
		Static209.method3676(arg3);
		Static447.method6111(arg5, arg0);
		@Pc(45) int[] local45 = new int[arg5 * 4 * arg0];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
			@Pc(65) int[] local65;
			@Pc(67) int[] local67;
			@Pc(63) int[] local63;
			@Pc(61) int[] local61;
			if (this.aClass4_Sub3_2.aBoolean587) {
				local61 = this.aClass4_Sub3_2.method6339(local49);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass4_Sub3_2.method6335(local49);
				local65 = local75[0];
				local63 = local75[2];
				local67 = local75[1];
			}
			if (this.aClass4_Sub3_1.aBoolean587) {
				local61 = this.aClass4_Sub3_1.method6339(local49);
			} else {
				local61 = this.aClass4_Sub3_1.method6335(local49)[0];
			}
			if (arg4) {
				local47 = local49;
			}
			for (@Pc(115) int local115 = arg5 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local65[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(143) int local143 = local67[local115] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(161) int local161 = local63[local115] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local123 = Static77.anIntArray131[local123];
				local143 = Static77.anIntArray131[local143];
				if (local161 < 0) {
					local161 = 0;
				}
				local161 = Static77.anIntArray131[local161];
				@Pc(208) int local208;
				if (local123 == 0 && local143 == 0 && local161 == 0) {
					local208 = 0;
				} else {
					local208 = local61[local115] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local45[local47++] = (local123 << 16) + (local208 << 24) + (local143 << 8) + local161;
				if (arg4) {
					local47 += arg5 - 1;
				}
			}
		}
		for (@Pc(271) int local271 = 0; local271 < this.aClass4_Sub3Array10.length; local271++) {
			this.aClass4_Sub3Array10[local271].method6334();
		}
		return local45;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IBZIDZLclient!ci;Lclient!l;)[I")
	public int[] method1879(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class38 arg5, @OriginalArg(7) Interface4 arg6) {
		Static320.anInterface4_7 = arg6;
		Static21.aClass38_5 = arg5;
		for (@Pc(18) int local18 = 0; local18 < this.aClass4_Sub3Array10.length; local18++) {
			this.aClass4_Sub3Array10[local18].method6336(arg2, arg0);
		}
		Static209.method3676(arg3);
		Static447.method6111(arg0, arg2);
		@Pc(50) int[] local50 = new int[arg0 * arg2];
		@Pc(58) int local58;
		@Pc(54) int local54;
		@Pc(56) byte local56;
		if (arg4) {
			local56 = -1;
			local58 = arg0 - 1;
			local54 = -1;
		} else {
			local54 = arg0;
			local56 = 1;
			local58 = 0;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg2; local72++) {
			@Pc(96) int[] local96;
			@Pc(88) int[] local88;
			@Pc(92) int[] local92;
			if (this.aClass4_Sub3_2.aBoolean587) {
				@Pc(104) int[] local104 = this.aClass4_Sub3_2.method6339(local72);
				local96 = local104;
				local92 = local104;
				local88 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass4_Sub3_2.method6335(local72);
				local88 = local84[1];
				local92 = local84[2];
				local96 = local84[0];
			}
			if (arg1) {
				local70 = local72;
			}
			for (@Pc(116) int local116 = local58; local116 != local54; local116 += local56) {
				@Pc(124) int local124 = local96[local116] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				@Pc(142) int local142 = local88[local116] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(157) int local157 = local92[local116] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local124 = Static77.anIntArray131[local124];
				local142 = Static77.anIntArray131[local142];
				local157 = Static77.anIntArray131[local157];
				@Pc(188) int local188 = (local142 << 8) + (local124 << 16) + local157;
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local50[local70++] = local188;
				if (arg1) {
					local70 += arg0 - 1;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass4_Sub3Array10.length; local231++) {
			this.aClass4_Sub3Array10[local231].method6334();
		}
		return local50;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!l;Lclient!ci;Z)Z")
	public boolean method1881(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class38 arg1) {
		@Pc(9) int local9;
		if (Static283.anInt1662 >= 0) {
			for (local9 = 0; local9 < this.anIntArray185.length; local9++) {
				if (!arg1.method1021(Static283.anInt1662, this.anIntArray185[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray185.length; local9++) {
				if (!arg1.method1037(this.anIntArray185[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray186.length; local9++) {
			if (!arg0.method5684(this.anIntArray186[local9])) {
				return false;
			}
		}
		return true;
	}
}
