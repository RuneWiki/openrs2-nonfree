import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub6_Sub6 extends Class1_Sub6 {

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "[I")
	private final int[] anIntArray303;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	private final int[] anIntArray300;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Lclient!pa;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!pa;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Lclient!pa;")
	private final Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "[Lclient!pa;")
	private final Class1_Sub2[] aClass1_Sub2Array19;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	private Class1_Sub6_Sub6() {
		this.anIntArray303 = new int[0];
		this.anIntArray300 = new int[0];
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub18(0);
		this.aClass1_Sub2_2.anInt6344 = 1;
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub18();
		this.aClass1_Sub2_1.anInt6344 = 1;
		this.aClass1_Sub2_3 = new Class1_Sub2_Sub18();
		this.aClass1_Sub2_3.anInt6344 = 1;
		this.aClass1_Sub2Array19 = new Class1_Sub2[] { this.aClass1_Sub2_1, this.aClass1_Sub2_3, this.aClass1_Sub2_2 };
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class1_Sub6_Sub6(@OriginalArg(0) Class1_Sub33 arg0) {
		@Pc(7) int local7 = arg0.method5174();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub2Array19 = new Class1_Sub2[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub2 local26 = Static250.method3874(arg0);
			if (local26.method5511() >= 0) {
				local9++;
			}
			if (local26.method5503() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub2Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method5174();
			}
			this.aClass1_Sub2Array19[local20] = local26;
		}
		this.anIntArray303 = new int[local9];
		this.anIntArray300 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class1_Sub2 local95 = this.aClass1_Sub2Array19[local88];
			local47 = local95.aClass1_Sub2Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass1_Sub2Array42[local101] = this.aClass1_Sub2Array19[local14[local88][local101]];
			}
			@Pc(123) int local123 = local95.method5511();
			@Pc(127) int local127 = local95.method5503();
			if (local123 > 0) {
				this.anIntArray303[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray300[local11++] = local127;
			}
			local14[local88] = null;
		}
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array19[arg0.method5174()];
		this.aClass1_Sub2_3 = this.aClass1_Sub2Array19[arg0.method5174()];
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array19[arg0.method5174()];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ui;ZLclient!cp;ZDII)[I")
	public int[] method1915(@OriginalArg(0) Class230 arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static46.aClass230_15 = arg0;
		Static318.anInterface2_6 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array19.length; local11++) {
			this.aClass1_Sub2Array19[local11].method5509(arg5, arg4);
		}
		Static309.method4597(arg3);
		Static105.method1498(arg4, arg5);
		@Pc(59) int[] local59 = new int[arg5 * 4 * arg4];
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg4; local63++) {
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			@Pc(75) int[] local75;
			if (this.aClass1_Sub2_1.aBoolean586) {
				local75 = this.aClass1_Sub2_1.method5508(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub2_1.method5504(local63);
				local77 = local89[1];
				local79 = local89[0];
				local81 = local89[2];
			}
			if (this.aClass1_Sub2_3.aBoolean586) {
				local75 = this.aClass1_Sub2_3.method5508(local63);
			} else {
				local75 = this.aClass1_Sub2_3.method5504(local63)[0];
			}
			if (arg2) {
				local61 = local63;
			}
			for (@Pc(129) int local129 = arg5 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local79[local129] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(157) int local157 = local77[local129] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				@Pc(175) int local175 = local81[local129] >> 4;
				if (local175 > 255) {
					local175 = 255;
				}
				if (local175 < 0) {
					local175 = 0;
				}
				local157 = Static318.anIntArray633[local157];
				local137 = Static318.anIntArray633[local137];
				local175 = Static318.anIntArray633[local175];
				@Pc(216) int local216;
				if (local137 == 0 && local157 == 0 && local175 == 0) {
					local216 = 0;
				} else {
					local216 = local75[local129] >> 4;
					if (local216 > 255) {
						local216 = 255;
					}
					if (local216 < 0) {
						local216 = 0;
					}
				}
				local59[local61++] = local175 + (local157 << 8) + (local137 << 16) + (local216 << 24);
				if (arg2) {
					local61 += arg5 - 1;
				}
			}
		}
		for (@Pc(267) int local267 = 0; local267 < this.aClass1_Sub2Array19.length; local267++) {
			this.aClass1_Sub2Array19[local267].method5513();
		}
		return local59;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ui;Lclient!cp;Z)Z")
	public boolean method1917(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Interface2 arg1) {
		@Pc(18) int local18;
		if (Static182.anInt3224 >= 0) {
			for (local18 = 0; local18 < this.anIntArray303.length; local18++) {
				if (!arg0.method4974(this.anIntArray303[local18], Static182.anInt3224)) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray303.length; local18++) {
				if (!arg0.method4966(this.anIntArray303[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray300.length; local18++) {
			if (!arg1.method4740(this.anIntArray300[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!cp;Lclient!ui;ZII)[F")
	public float[] method1918(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class230 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static46.aClass230_15 = arg1;
		Static318.anInterface2_6 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array19.length; local11++) {
			this.aClass1_Sub2Array19[local11].method5509(arg4, arg3);
		}
		Static105.method1498(arg3, arg4);
		@Pc(38) float[] local38 = new float[arg4 * arg3 * 4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			@Pc(58) int[] local58;
			if (this.aClass1_Sub2_1.aBoolean586) {
				@Pc(74) int[] local74 = this.aClass1_Sub2_1.method5508(local42);
				local58 = local74;
				local66 = local74;
				local62 = local74;
			} else {
				@Pc(54) int[][] local54 = this.aClass1_Sub2_1.method5504(local42);
				local58 = local54[2];
				local62 = local54[1];
				local66 = local54[0];
			}
			@Pc(92) int[] local92;
			if (this.aClass1_Sub2_3.aBoolean586) {
				local92 = this.aClass1_Sub2_3.method5508(local42);
			} else {
				local92 = this.aClass1_Sub2_3.method5504(local42)[0];
			}
			if (arg2) {
				local40 = local42 << 2;
			}
			@Pc(120) int[] local120;
			if (this.aClass1_Sub2_2.aBoolean586) {
				local120 = this.aClass1_Sub2_2.method5508(local42);
			} else {
				local120 = this.aClass1_Sub2_2.method5504(local42)[0];
			}
			for (@Pc(134) int local134 = arg4 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local92[local134] / 4096.0F;
				@Pc(156) float local156 = ((float) local120[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				local38[local40++] = local156 * (float) local66[local134];
				local38[local40++] = local156 * (float) local62[local134];
				local38[local40++] = (float) local58[local134] * local156;
				local38[local40++] = local143;
				if (arg2) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass1_Sub2Array19.length; local231++) {
			this.aClass1_Sub2Array19[local231].method5513();
		}
		return local38;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!cp;ILclient!ui;ZIZD)[I")
	public int[] method1919(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class230 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) double arg6) {
		Static46.aClass230_15 = arg3;
		Static318.anInterface2_6 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array19.length; local11++) {
			this.aClass1_Sub2Array19[local11].method5509(arg0, arg2);
		}
		Static309.method4597(arg6);
		Static105.method1498(arg2, arg0);
		@Pc(43) int[] local43 = new int[arg2 * arg0];
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) byte local53;
		if (arg5) {
			local49 = arg0 - 1;
			local51 = -1;
			local53 = -1;
		} else {
			local49 = 0;
			local51 = arg0;
			local53 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
			if (arg4) {
				local63 = local65;
			}
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub2_1.aBoolean586) {
				@Pc(81) int[] local81 = this.aClass1_Sub2_1.method5508(local65);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass1_Sub2_1.method5504(local65);
				local85 = local95[2];
				local83 = local95[0];
				local87 = local95[1];
			}
			for (@Pc(109) int local109 = local49; local109 != local51; local109 += local53) {
				@Pc(117) int local117 = local83[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(134) int local134 = local87[local109] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(149) int local149 = local85[local109] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				local134 = Static318.anIntArray633[local134];
				local117 = Static318.anIntArray633[local117];
				if (local149 < 0) {
					local149 = 0;
				}
				local149 = Static318.anIntArray633[local149];
				@Pc(185) int local185 = (local134 << 8) + (local117 << 16) + local149;
				if (local185 != 0) {
					local185 |= 0xFF000000;
				}
				local43[local63++] = local185;
				if (arg4) {
					local63 += arg0 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass1_Sub2Array19.length; local230++) {
			this.aClass1_Sub2Array19[local230].method5513();
		}
		return local43;
	}
}
