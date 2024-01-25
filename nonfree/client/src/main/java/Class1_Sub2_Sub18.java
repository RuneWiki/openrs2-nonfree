import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "[I")
	private final int[] anIntArray538;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "[I")
	private final int[] anIntArray537;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "Lclient!oh;")
	private final Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!oh;")
	private final Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Lclient!oh;")
	private final Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "[Lclient!oh;")
	private final Class1_Sub3[] aClass1_Sub3Array34;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub18() {
		this.anIntArray538 = new int[0];
		this.anIntArray537 = new int[0];
		this.aClass1_Sub3_2 = new Class1_Sub3_Sub21(0);
		this.aClass1_Sub3_2.anInt7832 = 1;
		this.aClass1_Sub3_1 = new Class1_Sub3_Sub21();
		this.aClass1_Sub3_1.anInt7832 = 1;
		this.aClass1_Sub3_3 = new Class1_Sub3_Sub21();
		this.aClass1_Sub3_3.anInt7832 = 1;
		this.aClass1_Sub3Array34 = new Class1_Sub3[] { this.aClass1_Sub3_1, this.aClass1_Sub3_3, this.aClass1_Sub3_2 };
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!lh;)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) Class1_Sub1 arg0) {
		@Pc(7) int local7 = arg0.method4130();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub3Array34 = new Class1_Sub3[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static112.method1698(arg0);
			if (local26.method6077() >= 0) {
				local9++;
			}
			if (local26.method6075() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub3Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method4130();
			}
			this.aClass1_Sub3Array34[local20] = local26;
		}
		this.anIntArray538 = new int[local9];
		local9 = 0;
		this.anIntArray537 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub3 local98 = this.aClass1_Sub3Array34[local91];
			local50 = local98.aClass1_Sub3Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub3Array42[local104] = this.aClass1_Sub3Array34[local14[local91][local104]];
			}
			@Pc(130) int local130 = local98.method6077();
			@Pc(134) int local134 = local98.method6075();
			if (local130 > 0) {
				this.anIntArray538[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray537[local11++] = local134;
			}
			local14[local91] = null;
		}
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array34[arg0.method4130()];
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array34[arg0.method4130()];
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array34[arg0.method4130()];
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLclient!m;Lclient!vh;DII)[I")
	public int[] method5188(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) double arg4, @OriginalArg(6) int arg5) {
		Static97.aClass250_21 = arg3;
		Static74.anInterface7_3 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array34.length; local11++) {
			this.aClass1_Sub3Array34[local11].method6081(arg0, arg5);
		}
		Static227.method3409(arg4);
		Static214.method3259(arg5, arg0);
		@Pc(47) int[] local47 = new int[arg0 * 4 * arg5];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg5; local51++) {
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(63) int[] local63;
			if (this.aClass1_Sub3_1.aBoolean494) {
				local63 = this.aClass1_Sub3_1.method6084(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub3_1.method6083(local51);
				local65 = local77[1];
				local67 = local77[0];
				local69 = local77[2];
			}
			if (this.aClass1_Sub3_3.aBoolean494) {
				local63 = this.aClass1_Sub3_3.method6084(local51);
			} else {
				local63 = this.aClass1_Sub3_3.method6083(local51)[0];
			}
			if (arg1) {
				local49 = local51;
			}
			for (@Pc(117) int local117 = arg0 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local67[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(143) int local143 = local65[local117] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(158) int local158 = local69[local117] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local125 = Static310.anIntArray437[local125];
				local143 = Static310.anIntArray437[local143];
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static310.anIntArray437[local158];
				@Pc(193) int local193;
				if (local125 == 0 && local143 == 0 && local158 == 0) {
					local193 = 0;
				} else {
					local193 = local63[local117] >> 4;
					if (local193 > 255) {
						local193 = 255;
					}
					if (local193 < 0) {
						local193 = 0;
					}
				}
				local47[local49++] = local158 + (local143 << 8) + (local125 << 16) + (local193 << 24);
				if (arg1) {
					local49 += arg0 - 1;
				}
			}
		}
		for (@Pc(244) int local244 = 0; local244 < this.aClass1_Sub3Array34.length; local244++) {
			this.aClass1_Sub3Array34[local244].method6080();
		}
		return local47;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLclient!vh;BZLclient!m;DI)[I")
	public int[] method5189(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface7 arg4, @OriginalArg(6) double arg5, @OriginalArg(7) int arg6) {
		Static97.aClass250_21 = arg2;
		Static74.anInterface7_3 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array34.length; local11++) {
			this.aClass1_Sub3Array34[local11].method6081(arg6, arg0);
		}
		Static227.method3409(arg5);
		Static214.method3259(arg0, arg6);
		@Pc(43) int[] local43 = new int[arg0 * arg6];
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg1) {
			local47 = -1;
			local49 = -1;
			local53 = arg6 - 1;
		} else {
			local53 = 0;
			local49 = arg6;
			local47 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
			@Pc(86) int[] local86;
			@Pc(88) int[] local88;
			@Pc(84) int[] local84;
			if (this.aClass1_Sub3_1.aBoolean494) {
				@Pc(82) int[] local82 = this.aClass1_Sub3_1.method6084(local70);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(96) int[][] local96 = this.aClass1_Sub3_1.method6083(local70);
				local84 = local96[2];
				local86 = local96[0];
				local88 = local96[1];
			}
			if (arg3) {
				local63 = local70;
			}
			for (@Pc(114) int local114 = local53; local114 != local49; local114 += local47) {
				@Pc(122) int local122 = local86[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local88[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(159) int local159 = local84[local114] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local142 = Static310.anIntArray437[local142];
				local122 = Static310.anIntArray437[local122];
				if (local159 < 0) {
					local159 = 0;
				}
				local159 = Static310.anIntArray437[local159];
				@Pc(193) int local193 = local159 + (local122 << 16) + (local142 << 8);
				if (local193 != 0) {
					local193 |= 0xFF000000;
				}
				local43[local63++] = local193;
				if (arg3) {
					local63 += arg6 - 1;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass1_Sub3Array34.length; local228++) {
			this.aClass1_Sub3Array34[local228].method6080();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!m;ILclient!vh;)Z")
	public boolean method5190(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(12) int local12;
		if (Static187.anInt4910 < 0) {
			for (local12 = 0; local12 < this.anIntArray538.length; local12++) {
				if (!arg1.method5668(this.anIntArray538[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray538.length; local12++) {
				if (!arg1.method5660(Static187.anInt4910, this.anIntArray538[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray537.length; local12++) {
			if (!arg0.method4837(this.anIntArray537[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!m;ZIILclient!vh;)[F")
	public float[] method5193(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class250 arg4) {
		Static97.aClass250_21 = arg4;
		Static74.anInterface7_3 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array34.length; local11++) {
			this.aClass1_Sub3Array34[local11].method6081(arg2, arg3);
		}
		Static214.method3259(arg3, arg2);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg3];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			if (this.aClass1_Sub3_1.aBoolean494) {
				@Pc(78) int[] local78 = this.aClass1_Sub3_1.method6084(local46);
				local62 = local78;
				local66 = local78;
				local70 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass1_Sub3_1.method6083(local46);
				local62 = local58[2];
				local66 = local58[1];
				local70 = local58[0];
			}
			@Pc(94) int[] local94;
			if (this.aClass1_Sub3_3.aBoolean494) {
				local94 = this.aClass1_Sub3_3.method6084(local46);
			} else {
				local94 = this.aClass1_Sub3_3.method6083(local46)[0];
			}
			@Pc(114) int[] local114;
			if (this.aClass1_Sub3_2.aBoolean494) {
				local114 = this.aClass1_Sub3_2.method6084(local46);
			} else {
				local114 = this.aClass1_Sub3_2.method6083(local46)[0];
			}
			if (arg1) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg2 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				@Pc(156) float local156 = ((float) local114[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				local42[local44++] = (float) local70[local134] * local156;
				local42[local44++] = local156 * (float) local66[local134];
				local42[local44++] = (float) local62[local134] * local156;
				local42[local44++] = local143;
				if (arg1) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(244) int local244 = 0; local244 < this.aClass1_Sub3Array34.length; local244++) {
			this.aClass1_Sub3Array34[local244].method6080();
		}
		return local42;
	}
}
