import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class2_Sub9_Sub10 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ij", name = "W", descriptor = "[I")
	private final int[] anIntArray242;

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
	private final int[] anIntArray241;

	@OriginalMember(owner = "client!ij", name = "O", descriptor = "Lclient!cj;")
	private final Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!ij", name = "X", descriptor = "Lclient!cj;")
	private final Class2_Sub3 aClass2_Sub3_3;

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "Lclient!cj;")
	private final Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "[Lclient!cj;")
	private final Class2_Sub3[] aClass2_Sub3Array17;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	private Class2_Sub9_Sub10() {
		this.anIntArray242 = new int[0];
		this.anIntArray241 = new int[0];
		this.aClass2_Sub3_2 = new Class2_Sub3_Sub1(0);
		this.aClass2_Sub3_2.anInt6813 = 1;
		this.aClass2_Sub3_3 = new Class2_Sub3_Sub1();
		this.aClass2_Sub3_3.anInt6813 = 1;
		this.aClass2_Sub3_1 = new Class2_Sub3_Sub1();
		this.aClass2_Sub3Array17 = new Class2_Sub3[] { this.aClass2_Sub3_3, this.aClass2_Sub3_1, this.aClass2_Sub3_2 };
		this.aClass2_Sub3_1.anInt6813 = 1;
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class2_Sub9_Sub10(@OriginalArg(0) Class2_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method3124();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub3Array17 = new Class2_Sub3[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub3 local26 = Static222.method5721(arg0);
			if (local26.method5701() >= 0) {
				local9++;
			}
			if (local26.method5706() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass2_Sub3Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method3124();
			}
			this.aClass2_Sub3Array17[local20] = local26;
		}
		this.anIntArray241 = new int[local9];
		this.anIntArray242 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class2_Sub3 local99 = this.aClass2_Sub3Array17[local92];
			local47 = local99.aClass2_Sub3Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass2_Sub3Array42[local105] = this.aClass2_Sub3Array17[local18[local92][local105]];
			}
			@Pc(127) int local127 = local99.method5701();
			@Pc(131) int local131 = local99.method5706();
			if (local127 > 0) {
				this.anIntArray241[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray242[local11++] = local131;
			}
			local18[local92] = null;
		}
		this.aClass2_Sub3_3 = this.aClass2_Sub3Array17[arg0.method3124()];
		this.aClass2_Sub3_1 = this.aClass2_Sub3Array17[arg0.method3124()];
		this.aClass2_Sub3_2 = this.aClass2_Sub3Array17[arg0.method3124()];
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ec;Lclient!iq;I)Z")
	public boolean method2692(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(17) int local17;
		if (Static244.anInt5186 < 0) {
			for (local17 = 0; local17 < this.anIntArray241.length; local17++) {
				if (!arg1.method2755(this.anIntArray241[local17])) {
					return false;
				}
			}
		} else {
			for (local17 = 0; local17 < this.anIntArray241.length; local17++) {
				if (!arg1.method2772(Static244.anInt5186, this.anIntArray241[local17])) {
					return false;
				}
			}
		}
		for (local17 = 0; local17 < this.anIntArray242.length; local17++) {
			if (!arg0.method167(this.anIntArray242[local17])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ec;IIZDZLclient!iq;I)[I")
	public int[] method2694(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) double arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class104 arg6) {
		Static16.aClass104_11 = arg6;
		Static166.anInterface3_4 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub3Array17.length; local11++) {
			this.aClass2_Sub3Array17[local11].method5698(arg1, arg2);
		}
		Static99.method1986(arg4);
		Static336.method5480(arg2, arg1);
		@Pc(39) int[] local39 = new int[arg1 * arg2];
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg3) {
			local45 = arg1 - 1;
			local47 = -1;
			local49 = -1;
		} else {
			local45 = 0;
			local47 = arg1;
			local49 = 1;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg2; local61++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			if (this.aClass2_Sub3_3.aBoolean606) {
				@Pc(95) int[] local95 = this.aClass2_Sub3_3.method5699(local61);
				local81 = local95;
				local85 = local95;
				local77 = local95;
			} else {
				@Pc(73) int[][] local73 = this.aClass2_Sub3_3.method5702(local61);
				local77 = local73[1];
				local81 = local73[0];
				local85 = local73[2];
			}
			if (arg5) {
				local59 = local61;
			}
			for (@Pc(107) int local107 = local45; local107 != local47; local107 += local49) {
				@Pc(115) int local115 = local81[local107] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				@Pc(135) int local135 = local77[local107] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(155) int local155 = local85[local107] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				local115 = Static335.anIntArray499[local115];
				local135 = Static335.anIntArray499[local135];
				if (local155 < 0) {
					local155 = 0;
				}
				local155 = Static335.anIntArray499[local155];
				@Pc(191) int local191 = (local115 << 16) + (local135 << 8) + local155;
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local39[local59++] = local191;
				if (arg5) {
					local59 += arg1 - 1;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass2_Sub3Array17.length; local234++) {
			this.aClass2_Sub3Array17[local234].method5705();
		}
		return local39;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!ec;ZLclient!iq;I)[F")
	public float[] method2696(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class104 arg3, @OriginalArg(5) int arg4) {
		Static16.aClass104_11 = arg3;
		Static166.anInterface3_4 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub3Array17.length; local11++) {
			this.aClass2_Sub3Array17[local11].method5698(arg0, arg4);
		}
		Static336.method5480(arg4, arg0);
		@Pc(42) float[] local42 = new float[arg0 * arg4 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			if (this.aClass2_Sub3_3.aBoolean606) {
				@Pc(78) int[] local78 = this.aClass2_Sub3_3.method5699(local46);
				local66 = local78;
				local62 = local78;
				local70 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass2_Sub3_3.method5702(local46);
				local62 = local58[2];
				local66 = local58[1];
				local70 = local58[0];
			}
			@Pc(94) int[] local94;
			if (this.aClass2_Sub3_1.aBoolean606) {
				local94 = this.aClass2_Sub3_1.method5699(local46);
			} else {
				local94 = this.aClass2_Sub3_1.method5702(local46)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass2_Sub3_2.aBoolean606) {
				local116 = this.aClass2_Sub3_2.method5699(local46);
			} else {
				local116 = this.aClass2_Sub3_2.method5702(local46)[0];
			}
			if (arg2) {
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
				local42[local44++] = local156 * (float) local70[local134];
				local42[local44++] = (float) local66[local134] * local156;
				local42[local44++] = local156 * (float) local62[local134];
				local42[local44++] = local143;
				if (arg2) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass2_Sub3Array17.length; local228++) {
			this.aClass2_Sub3Array17[local228].method5705();
		}
		return local42;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!iq;DIZLclient!ec;)[I")
	public int[] method2697(@OriginalArg(1) int arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Interface3 arg5) {
		Static166.anInterface3_4 = arg5;
		Static16.aClass104_11 = arg1;
		for (@Pc(17) int local17 = 0; local17 < this.aClass2_Sub3Array17.length; local17++) {
			this.aClass2_Sub3Array17[local17].method5698(arg3, arg0);
		}
		Static99.method1986(arg2);
		Static336.method5480(arg0, arg3);
		@Pc(47) int[] local47 = new int[arg0 * 4 * arg3];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			@Pc(83) int[] local83;
			if (this.aClass2_Sub3_3.aBoolean606) {
				local83 = this.aClass2_Sub3_3.method5699(local51);
				local75 = local83;
				local67 = local83;
				local71 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass2_Sub3_3.method5702(local51);
				local67 = local63[0];
				local71 = local63[1];
				local75 = local63[2];
			}
			if (this.aClass2_Sub3_1.aBoolean606) {
				local83 = this.aClass2_Sub3_1.method5699(local51);
			} else {
				local83 = this.aClass2_Sub3_1.method5702(local51)[0];
			}
			if (arg4) {
				local49 = local51;
			}
			for (@Pc(117) int local117 = arg3 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local67[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(142) int local142 = local71[local117] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(160) int local160 = local75[local117] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local125 = Static335.anIntArray499[local125];
				if (local160 < 0) {
					local160 = 0;
				}
				local142 = Static335.anIntArray499[local142];
				local160 = Static335.anIntArray499[local160];
				@Pc(201) int local201;
				if (local125 == 0 && local142 == 0 && local160 == 0) {
					local201 = 0;
				} else {
					local201 = local83[local117] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local47[local49++] = local160 + (local201 << 24) + (local125 << 16) + (local142 << 8);
				if (arg4) {
					local49 += arg3 - 1;
				}
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.aClass2_Sub3Array17.length; local260++) {
			this.aClass2_Sub3Array17[local260].method5705();
		}
		return local47;
	}
}
