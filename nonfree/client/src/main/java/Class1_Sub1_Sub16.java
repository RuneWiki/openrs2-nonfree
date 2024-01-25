import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!um", name = "F", descriptor = "[I")
	private final int[] anIntArray699;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "[I")
	private final int[] anIntArray698;

	@OriginalMember(owner = "client!um", name = "H", descriptor = "Lclient!pj;")
	private final Class1_Sub8 aClass1_Sub8_3;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "Lclient!pj;")
	private final Class1_Sub8 aClass1_Sub8_1;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "Lclient!pj;")
	private final Class1_Sub8 aClass1_Sub8_2;

	@OriginalMember(owner = "client!um", name = "C", descriptor = "[Lclient!pj;")
	private final Class1_Sub8[] aClass1_Sub8Array39;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub16() {
		this.anIntArray699 = new int[0];
		this.anIntArray698 = new int[0];
		this.aClass1_Sub8_3 = new Class1_Sub8_Sub24(0);
		this.aClass1_Sub8_3.anInt7804 = 1;
		this.aClass1_Sub8_1 = new Class1_Sub8_Sub24();
		this.aClass1_Sub8_1.anInt7804 = 1;
		this.aClass1_Sub8_2 = new Class1_Sub8_Sub24();
		this.aClass1_Sub8_2.anInt7804 = 1;
		this.aClass1_Sub8Array39 = new Class1_Sub8[] { this.aClass1_Sub8_1, this.aClass1_Sub8_2, this.aClass1_Sub8_3 };
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class1_Sub1_Sub16(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method1171();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub8Array39 = new Class1_Sub8[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub8 local26 = Static241.method3635(arg0);
			if (local26.method6032() >= 0) {
				local9++;
			}
			if (local26.method6039() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub8Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method1171();
			}
			this.aClass1_Sub8Array39[local20] = local26;
		}
		this.anIntArray698 = new int[local9];
		this.anIntArray699 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class1_Sub8 local94 = this.aClass1_Sub8Array39[local87];
			local50 = local94.aClass1_Sub8Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass1_Sub8Array42[local100] = this.aClass1_Sub8Array39[local14[local87][local100]];
			}
			@Pc(122) int local122 = local94.method6032();
			@Pc(126) int local126 = local94.method6039();
			if (local122 > 0) {
				this.anIntArray698[local9++] = local122;
			}
			if (local126 > 0) {
				this.anIntArray699[local11++] = local126;
			}
			local14[local87] = null;
		}
		this.aClass1_Sub8_1 = this.aClass1_Sub8Array39[arg0.method1171()];
		this.aClass1_Sub8_2 = this.aClass1_Sub8Array39[arg0.method1171()];
		this.aClass1_Sub8_3 = this.aClass1_Sub8Array39[arg0.method1171()];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZLclient!qs;BIDLclient!l;)[I")
	public int[] method5597(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5, @OriginalArg(7) Interface7 arg6) {
		Static138.anInterface7_2 = arg6;
		Static169.aClass211_45 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub8Array39.length; local11++) {
			this.aClass1_Sub8Array39[local11].method6034(arg0, arg4);
		}
		Static18.method370(arg5);
		Static258.method3817(arg4, arg0);
		@Pc(45) int[] local45 = new int[arg4 * arg0];
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) byte local53;
		if (arg2) {
			local51 = -1;
			local53 = -1;
			local49 = arg0 - 1;
		} else {
			local49 = 0;
			local51 = arg0;
			local53 = 1;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg4; local67++) {
			if (arg1) {
				local65 = local67;
			}
			@Pc(87) int[] local87;
			@Pc(85) int[] local85;
			@Pc(89) int[] local89;
			if (this.aClass1_Sub8_1.aBoolean508) {
				@Pc(83) int[] local83 = this.aClass1_Sub8_1.method6031(local67);
				local85 = local83;
				local87 = local83;
				local89 = local83;
			} else {
				@Pc(99) int[][] local99 = this.aClass1_Sub8_1.method6030(local67);
				local85 = local99[1];
				local87 = local99[0];
				local89 = local99[2];
			}
			for (@Pc(113) int local113 = local49; local113 != local51; local113 += local53) {
				@Pc(121) int local121 = local87[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(141) int local141 = local85[local113] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(161) int local161 = local89[local113] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local121 = Static388.anIntArray674[local121];
				local141 = Static388.anIntArray674[local141];
				if (local161 < 0) {
					local161 = 0;
				}
				local161 = Static388.anIntArray674[local161];
				@Pc(195) int local195 = local161 + (local121 << 16) + (local141 << 8);
				if (local195 != 0) {
					local195 |= 0xFF000000;
				}
				local45[local65++] = local195;
				if (arg1) {
					local65 += arg0 - 1;
				}
			}
		}
		for (@Pc(246) int local246 = 0; local246 < this.aClass1_Sub8Array39.length; local246++) {
			this.aClass1_Sub8Array39[local246].method6036();
		}
		return local45;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!qs;Lclient!l;IZIZ)[F")
	public float[] method5599(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static138.anInterface7_2 = arg1;
		Static169.aClass211_45 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub8Array39.length; local11++) {
			this.aClass1_Sub8Array39[local11].method6034(arg3, arg2);
		}
		Static258.method3817(arg2, arg3);
		@Pc(47) float[] local47 = new float[arg3 * arg2 * 4];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg2; local51++) {
			@Pc(71) int[] local71;
			@Pc(67) int[] local67;
			@Pc(75) int[] local75;
			if (this.aClass1_Sub8_1.aBoolean508) {
				@Pc(83) int[] local83 = this.aClass1_Sub8_1.method6031(local51);
				local75 = local83;
				local71 = local83;
				local67 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass1_Sub8_1.method6030(local51);
				local67 = local63[1];
				local71 = local63[0];
				local75 = local63[2];
			}
			@Pc(101) int[] local101;
			if (this.aClass1_Sub8_2.aBoolean508) {
				local101 = this.aClass1_Sub8_2.method6031(local51);
			} else {
				local101 = this.aClass1_Sub8_2.method6030(local51)[0];
			}
			if (arg4) {
				local49 = local51 << 2;
			}
			@Pc(125) int[] local125;
			if (this.aClass1_Sub8_3.aBoolean508) {
				local125 = this.aClass1_Sub8_3.method6031(local51);
			} else {
				local125 = this.aClass1_Sub8_3.method6030(local51)[0];
			}
			for (@Pc(139) int local139 = arg3 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local101[local139] / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				@Pc(175) float local175 = ((float) local125[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local47[local49++] = (float) local71[local139] * local175;
				local47[local49++] = local175 * (float) local67[local139];
				local47[local49++] = local175 * (float) local75[local139];
				local47[local49++] = local148;
				if (arg4) {
					local49 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass1_Sub8Array39.length; local236++) {
			this.aClass1_Sub8Array39[local236].method6036();
		}
		return local47;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!l;Lclient!qs;)Z")
	public boolean method5600(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(12) int local12;
		if (Static397.anInt7191 >= 0) {
			for (local12 = 0; local12 < this.anIntArray698.length; local12++) {
				if (!arg1.method4760(Static397.anInt7191, this.anIntArray698[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray698.length; local12++) {
				if (!arg1.method4761(this.anIntArray698[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray699.length; local12++) {
			if (!arg0.method77(this.anIntArray699[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(DILclient!qs;IIZLclient!l;)[I")
	public int[] method5601(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Interface7 arg5) {
		Static169.aClass211_45 = arg2;
		Static138.anInterface7_2 = arg5;
		for (@Pc(23) int local23 = 0; local23 < this.aClass1_Sub8Array39.length; local23++) {
			this.aClass1_Sub8Array39[local23].method6034(arg1, arg3);
		}
		Static18.method370(arg0);
		Static258.method3817(arg3, arg1);
		@Pc(57) int[] local57 = new int[arg1 * arg3 * 4];
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg3; local61++) {
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			@Pc(73) int[] local73;
			if (this.aClass1_Sub8_1.aBoolean508) {
				local73 = this.aClass1_Sub8_1.method6031(local61);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(87) int[][] local87 = this.aClass1_Sub8_1.method6030(local61);
				local75 = local87[2];
				local77 = local87[0];
				local79 = local87[1];
			}
			if (arg4) {
				local59 = local61;
			}
			if (this.aClass1_Sub8_2.aBoolean508) {
				local73 = this.aClass1_Sub8_2.method6031(local61);
			} else {
				local73 = this.aClass1_Sub8_2.method6030(local61)[0];
			}
			for (@Pc(127) int local127 = arg1 - 1; local127 >= 0; local127--) {
				@Pc(135) int local135 = local77[local127] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(152) int local152 = local79[local127] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				@Pc(172) int local172 = local75[local127] >> 4;
				if (local172 > 255) {
					local172 = 255;
				}
				local152 = Static388.anIntArray674[local152];
				local135 = Static388.anIntArray674[local135];
				if (local172 < 0) {
					local172 = 0;
				}
				local172 = Static388.anIntArray674[local172];
				@Pc(206) int local206;
				if (local135 == 0 && local152 == 0 && local172 == 0) {
					local206 = 0;
				} else {
					local206 = local73[local127] >> 4;
					if (local206 > 255) {
						local206 = 255;
					}
					if (local206 < 0) {
						local206 = 0;
					}
				}
				local57[local59++] = (local135 << 16) + (local206 << 24) + (local152 << 8) + local172;
				if (arg4) {
					local59 += arg1 - 1;
				}
			}
		}
		for (@Pc(267) int local267 = 0; local267 < this.aClass1_Sub8Array39.length; local267++) {
			this.aClass1_Sub8Array39[local267].method6036();
		}
		return local57;
	}
}
