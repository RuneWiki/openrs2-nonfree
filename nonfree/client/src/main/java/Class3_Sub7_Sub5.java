import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "[I")
	private final int[] anIntArray121;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "[I")
	private final int[] anIntArray122;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "Lclient!cu;")
	private final Class3_Sub6 aClass3_Sub6_3;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "Lclient!cu;")
	private final Class3_Sub6 aClass3_Sub6_1;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "Lclient!cu;")
	private final Class3_Sub6 aClass3_Sub6_2;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "[Lclient!cu;")
	private final Class3_Sub6[] aClass3_Sub6Array11;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	private Class3_Sub7_Sub5() {
		this.anIntArray121 = new int[0];
		this.anIntArray122 = new int[0];
		this.aClass3_Sub6_3 = new Class3_Sub6_Sub38(0);
		this.aClass3_Sub6_3.anInt9361 = 1;
		this.aClass3_Sub6_1 = new Class3_Sub6_Sub38();
		this.aClass3_Sub6_1.anInt9361 = 1;
		this.aClass3_Sub6_2 = new Class3_Sub6_Sub38();
		this.aClass3_Sub6Array11 = new Class3_Sub6[] { this.aClass3_Sub6_1, this.aClass3_Sub6_2, this.aClass3_Sub6_3 };
		this.aClass3_Sub6_2.anInt9361 = 1;
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!np;)V")
	public Class3_Sub7_Sub5(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method5175();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub6Array11 = new Class3_Sub6[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub6 local26 = Static194.method3266(arg0);
			if (local26.method7772() >= 0) {
				local9++;
			}
			if (local26.method7766() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass3_Sub6Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method5175();
			}
			this.aClass3_Sub6Array11[local20] = local26;
		}
		this.anIntArray122 = new int[local9];
		local9 = 0;
		this.anIntArray121 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class3_Sub6 local95 = this.aClass3_Sub6Array11[local88];
			local47 = local95.aClass3_Sub6Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass3_Sub6Array42[local101] = this.aClass3_Sub6Array11[local18[local88][local101]];
			}
			@Pc(127) int local127 = local95.method7772();
			@Pc(131) int local131 = local95.method7766();
			if (local127 > 0) {
				this.anIntArray122[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray121[local11++] = local131;
			}
			local18[local88] = null;
		}
		this.aClass3_Sub6_1 = this.aClass3_Sub6Array11[arg0.method5175()];
		this.aClass3_Sub6_2 = this.aClass3_Sub6Array11[arg0.method5175()];
		this.aClass3_Sub6_3 = this.aClass3_Sub6Array11[arg0.method5175()];
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!tf;Lclient!fa;ZBD)[I")
	public int[] method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) double arg5) {
		Static17.anInterface3_1 = arg3;
		Static522.aClass322_142 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub6Array11.length; local11++) {
			this.aClass3_Sub6Array11[local11].method7765(arg0, arg1);
		}
		Static298.method4425(arg5);
		Static181.method3119(arg1, arg0);
		@Pc(41) int[] local41 = new int[arg0 * arg1 * 4];
		@Pc(43) int local43 = 0;
		for (@Pc(58) int local58 = 0; local58 < arg0; local58++) {
			@Pc(72) int[] local72;
			@Pc(74) int[] local74;
			@Pc(76) int[] local76;
			@Pc(70) int[] local70;
			if (this.aClass3_Sub6_1.aBoolean729) {
				local70 = this.aClass3_Sub6_1.method7775(local58);
				local72 = local70;
				local74 = local70;
				local76 = local70;
			} else {
				@Pc(84) int[][] local84 = this.aClass3_Sub6_1.method7776(local58);
				local74 = local84[1];
				local76 = local84[2];
				local72 = local84[0];
			}
			if (arg4) {
				local43 = local58;
			}
			if (this.aClass3_Sub6_2.aBoolean729) {
				local70 = this.aClass3_Sub6_2.method7775(local58);
			} else {
				local70 = this.aClass3_Sub6_2.method7776(local58)[0];
			}
			for (@Pc(124) int local124 = arg1 - 1; local124 >= 0; local124--) {
				@Pc(132) int local132 = local72[local124] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(152) int local152 = local74[local124] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				@Pc(167) int local167 = local76[local124] >> 4;
				if (local167 > 255) {
					local167 = 255;
				}
				local132 = Static574.anIntArray599[local132];
				local152 = Static574.anIntArray599[local152];
				if (local167 < 0) {
					local167 = 0;
				}
				local167 = Static574.anIntArray599[local167];
				@Pc(204) int local204;
				if (local132 == 0 && local152 == 0 && local167 == 0) {
					local204 = 0;
				} else {
					local204 = local70[local124] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local41[local43++] = (local152 << 8) + (local132 << 16) + (local204 << 24) + local167;
				if (arg4) {
					local43 += arg1 - 1;
				}
			}
		}
		for (@Pc(264) int local264 = 0; local264 < this.aClass3_Sub6Array11.length; local264++) {
			this.aClass3_Sub6Array11[local264].method7770();
		}
		return local41;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZDIIZLclient!fa;ILclient!tf;)[I")
	public int[] method2499(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class322 arg6) {
		Static17.anInterface3_1 = arg4;
		Static522.aClass322_142 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub6Array11.length; local11++) {
			this.aClass3_Sub6Array11[local11].method7765(arg2, arg5);
		}
		Static298.method4425(arg1);
		Static181.method3119(arg5, arg2);
		@Pc(43) int[] local43 = new int[arg5 * arg2];
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(51) byte local51;
		if (arg0) {
			local47 = arg5 - 1;
			local49 = -1;
			local51 = -1;
		} else {
			local47 = 0;
			local49 = arg5;
			local51 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
			if (arg3) {
				local63 = local65;
			}
			@Pc(87) int[] local87;
			@Pc(83) int[] local83;
			@Pc(85) int[] local85;
			if (this.aClass3_Sub6_1.aBoolean729) {
				@Pc(81) int[] local81 = this.aClass3_Sub6_1.method7775(local65);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass3_Sub6_1.method7776(local65);
				local85 = local95[2];
				local83 = local95[1];
				local87 = local95[0];
			}
			for (@Pc(109) int local109 = local47; local109 != local49; local109 += local51) {
				@Pc(117) int local117 = local87[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local83[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(155) int local155 = local85[local109] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				local117 = Static574.anIntArray599[local117];
				local135 = Static574.anIntArray599[local135];
				local155 = Static574.anIntArray599[local155];
				@Pc(193) int local193 = (local117 << 16) + (local135 << 8) + local155;
				if (local193 != 0) {
					local193 |= 0xFF000000;
				}
				local43[local63++] = local193;
				if (arg3) {
					local63 += arg5 - 1;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass3_Sub6Array11.length; local234++) {
			this.aClass3_Sub6Array11[local234].method7770();
		}
		return local43;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!tf;Lclient!fa;)Z")
	public boolean method2501(@OriginalArg(1) Class322 arg0, @OriginalArg(2) Interface3 arg1) {
		@Pc(12) int local12;
		if (Static503.anInt8175 < 0) {
			for (local12 = 0; local12 < this.anIntArray122.length; local12++) {
				if (!arg0.method6797(this.anIntArray122[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray122.length; local12++) {
				if (!arg0.method6808(this.anIntArray122[local12], Static503.anInt8175)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray121.length; local12++) {
			if (!arg1.method4774(this.anIntArray121[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fa;IBLclient!tf;ZI)[F")
	public float[] method2502(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class322 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static522.aClass322_142 = arg2;
		Static17.anInterface3_1 = arg0;
		for (@Pc(16) int local16 = 0; local16 < this.aClass3_Sub6Array11.length; local16++) {
			this.aClass3_Sub6Array11[local16].method7765(arg1, arg4);
		}
		Static181.method3119(arg4, arg1);
		@Pc(43) float[] local43 = new float[arg4 * arg1 * 4];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg1; local47++) {
			@Pc(67) int[] local67;
			@Pc(63) int[] local63;
			@Pc(71) int[] local71;
			if (this.aClass3_Sub6_1.aBoolean729) {
				@Pc(79) int[] local79 = this.aClass3_Sub6_1.method7775(local47);
				local71 = local79;
				local63 = local79;
				local67 = local79;
			} else {
				@Pc(59) int[][] local59 = this.aClass3_Sub6_1.method7776(local47);
				local63 = local59[1];
				local67 = local59[0];
				local71 = local59[2];
			}
			@Pc(95) int[] local95;
			if (this.aClass3_Sub6_2.aBoolean729) {
				local95 = this.aClass3_Sub6_2.method7775(local47);
			} else {
				local95 = this.aClass3_Sub6_2.method7776(local47)[0];
			}
			if (arg3) {
				local45 = local47 << 2;
			}
			@Pc(121) int[] local121;
			if (this.aClass3_Sub6_3.aBoolean729) {
				local121 = this.aClass3_Sub6_3.method7775(local47);
			} else {
				local121 = this.aClass3_Sub6_3.method7776(local47)[0];
			}
			for (@Pc(135) int local135 = arg4 - 1; local135 >= 0; local135--) {
				@Pc(144) float local144 = (float) local95[local135] / 4096.0F;
				if (local144 < 0.0F) {
					local144 = 0.0F;
				} else if (local144 > 1.0F) {
					local144 = 1.0F;
				}
				@Pc(171) float local171 = ((float) local121[local135] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local43[local45++] = (float) local67[local135] * local171;
				local43[local45++] = local171 * (float) local63[local135];
				local43[local45++] = (float) local71[local135] * local171;
				local43[local45++] = local144;
				if (arg3) {
					local45 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass3_Sub6Array11.length; local228++) {
			this.aClass3_Sub6Array11[local228].method7770();
		}
		return local43;
	}
}
