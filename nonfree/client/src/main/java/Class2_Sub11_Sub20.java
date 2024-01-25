import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub11_Sub20 extends Class2_Sub11 {

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
	private final int[] anIntArray479;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
	private final int[] anIntArray480;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!r;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "Lclient!r;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "Lclient!r;")
	private final Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "[Lclient!r;")
	private final Class2_Sub2[] aClass2_Sub2Array41;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	private Class2_Sub11_Sub20() {
		this.anIntArray479 = new int[0];
		this.anIntArray480 = new int[0];
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub36(0);
		this.aClass2_Sub2_2.anInt6821 = 1;
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub36();
		this.aClass2_Sub2_1.anInt6821 = 1;
		this.aClass2_Sub2_3 = new Class2_Sub2_Sub36();
		this.aClass2_Sub2_3.anInt6821 = 1;
		this.aClass2_Sub2Array41 = new Class2_Sub2[] { this.aClass2_Sub2_1, this.aClass2_Sub2_3, this.aClass2_Sub2_2 };
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!dg;)V")
	public Class2_Sub11_Sub20(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(7) int local7 = arg0.method4421();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub2Array41 = new Class2_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static139.method2754(arg0);
			if (local26.method5881() >= 0) {
				local9++;
			}
			if (local26.method5879() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass2_Sub2Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method4421();
			}
			this.aClass2_Sub2Array41[local20] = local26;
		}
		this.anIntArray480 = new int[local9];
		local9 = 0;
		this.anIntArray479 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class2_Sub2 local95 = this.aClass2_Sub2Array41[local88];
			local47 = local95.aClass2_Sub2Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass2_Sub2Array42[local101] = this.aClass2_Sub2Array41[local18[local88][local101]];
			}
			@Pc(127) int local127 = local95.method5881();
			@Pc(131) int local131 = local95.method5879();
			if (local127 > 0) {
				this.anIntArray480[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray479[local11++] = local131;
			}
			local18[local88] = null;
		}
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array41[arg0.method4421()];
		this.aClass2_Sub2_3 = this.aClass2_Sub2Array41[arg0.method4421()];
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array41[arg0.method4421()];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZILclient!ul;Lclient!tq;)[F")
	public float[] method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) Class191 arg4) {
		Static157.aClass191_98 = arg4;
		Static200.anInterface7_7 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array41.length; local11++) {
			this.aClass2_Sub2Array41[local11].method5875(arg0, arg1);
		}
		Static102.method2280(arg0, arg1);
		@Pc(42) float[] local42 = new float[arg1 * arg0 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			if (this.aClass2_Sub2_1.aBoolean597) {
				@Pc(78) int[] local78 = this.aClass2_Sub2_1.method5883(local46);
				local70 = local78;
				local62 = local78;
				local66 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass2_Sub2_1.method5884(local46);
				local62 = local58[0];
				local66 = local58[1];
				local70 = local58[2];
			}
			@Pc(96) int[] local96;
			if (this.aClass2_Sub2_3.aBoolean597) {
				local96 = this.aClass2_Sub2_3.method5883(local46);
			} else {
				local96 = this.aClass2_Sub2_3.method5884(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			@Pc(124) int[] local124;
			if (this.aClass2_Sub2_2.aBoolean597) {
				local124 = this.aClass2_Sub2_2.method5883(local46);
			} else {
				local124 = this.aClass2_Sub2_2.method5884(local46)[0];
			}
			for (@Pc(136) int local136 = arg1 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local124[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = local172 * (float) local62[local136];
				local42[local44++] = local172 * (float) local66[local136];
				local42[local44++] = (float) local70[local136] * local172;
				local42[local44++] = local145;
				if (arg2) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass2_Sub2Array41.length; local233++) {
			this.aClass2_Sub2Array41[local233].method5878();
		}
		return local42;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!tq;ZILclient!ul;DZIB)[I")
	public int[] method5734(@OriginalArg(0) Class191 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) double arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		Static200.anInterface7_7 = arg3;
		Static157.aClass191_98 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array41.length; local11++) {
			this.aClass2_Sub2Array41[local11].method5875(arg2, arg6);
		}
		Static25.method1439(arg4);
		Static102.method2280(arg2, arg6);
		@Pc(43) int[] local43 = new int[arg6 * arg2];
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(51) byte local51;
		if (arg5) {
			local47 = arg6 - 1;
			local49 = -1;
			local51 = -1;
		} else {
			local47 = 0;
			local49 = arg6;
			local51 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
			if (arg1) {
				local63 = local65;
			}
			@Pc(87) int[] local87;
			@Pc(85) int[] local85;
			@Pc(83) int[] local83;
			if (this.aClass2_Sub2_1.aBoolean597) {
				@Pc(81) int[] local81 = this.aClass2_Sub2_1.method5883(local65);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass2_Sub2_1.method5884(local65);
				local83 = local95[2];
				local87 = local95[0];
				local85 = local95[1];
			}
			for (@Pc(109) int local109 = local47; local109 != local49; local109 += local51) {
				@Pc(117) int local117 = local87[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local85[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(152) int local152 = local83[local109] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local117 = Static104.anIntArray409[local117];
				local132 = Static104.anIntArray409[local132];
				if (local152 < 0) {
					local152 = 0;
				}
				local152 = Static104.anIntArray409[local152];
				@Pc(186) int local186 = local152 + (local132 << 8) + (local117 << 16);
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local43[local63++] = local186;
				if (arg1) {
					local63 += arg6 - 1;
				}
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.aClass2_Sub2Array41.length; local221++) {
			this.aClass2_Sub2Array41[local221].method5878();
		}
		return local43;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ul;Lclient!tq;)Z")
	public boolean method5735(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class191 arg1) {
		@Pc(12) int local12;
		if (Static287.anInt5817 >= 0) {
			for (local12 = 0; local12 < this.anIntArray480.length; local12++) {
				if (!arg1.method5454(Static287.anInt5817, this.anIntArray480[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray480.length; local12++) {
				if (!arg1.method5440(this.anIntArray480[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray479.length; local12++) {
			if (!arg0.method5780(this.anIntArray479[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!tq;ILclient!ul;ZIDI)[I")
	public int[] method5738(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5) {
		Static157.aClass191_98 = arg0;
		Static200.anInterface7_7 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array41.length; local11++) {
			this.aClass2_Sub2Array41[local11].method5875(arg1, arg4);
		}
		Static25.method1439(arg5);
		Static102.method2280(arg1, arg4);
		@Pc(47) int[] local47 = new int[arg4 * arg1 * 4];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(67) int[] local67;
			@Pc(69) int[] local69;
			@Pc(65) int[] local65;
			@Pc(63) int[] local63;
			if (this.aClass2_Sub2_1.aBoolean597) {
				local63 = this.aClass2_Sub2_1.method5883(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass2_Sub2_1.method5884(local51);
				local67 = local77[0];
				local65 = local77[2];
				local69 = local77[1];
			}
			if (arg3) {
				local49 = local51;
			}
			if (this.aClass2_Sub2_3.aBoolean597) {
				local63 = this.aClass2_Sub2_3.method5883(local51);
			} else {
				local63 = this.aClass2_Sub2_3.method5884(local51)[0];
			}
			for (@Pc(117) int local117 = arg4 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local67[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(143) int local143 = local69[local117] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(163) int local163 = local65[local117] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				if (local163 < 0) {
					local163 = 0;
				}
				local143 = Static104.anIntArray409[local143];
				local125 = Static104.anIntArray409[local125];
				local163 = Static104.anIntArray409[local163];
				@Pc(203) int local203;
				if (local125 == 0 && local143 == 0 && local163 == 0) {
					local203 = 0;
				} else {
					local203 = local63[local117] >> 4;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 < 0) {
						local203 = 0;
					}
				}
				local47[local49++] = local163 + (local143 << 8) + (local203 << 24) + (local125 << 16);
				if (arg3) {
					local49 += arg4 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass2_Sub2Array41.length; local261++) {
			this.aClass2_Sub2Array41[local261].method5878();
		}
		return local47;
	}
}
