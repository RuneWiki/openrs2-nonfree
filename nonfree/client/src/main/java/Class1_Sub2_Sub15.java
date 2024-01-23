import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!o;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "Lclient!o;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "Lclient!o;")
	private Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "[Lclient!o;")
	private Class1_Sub1[] aClass1_Sub1Array29;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) Class1_Sub18 arg0) {
		@Pc(7) int local7 = arg0.method3122();
		this.aClass1_Sub1Array29 = new Class1_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(20) int local20;
		@Pc(27) Class1_Sub1 local27;
		@Pc(43) int local43;
		@Pc(50) int local50;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = Static48.method847(arg0);
			if (local27.method4453() >= 0) {
				local15++;
			}
			if (local27.method4448() >= 0) {
				local13++;
			}
			local43 = local27.aClass1_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3122();
			}
			this.aClass1_Sub1Array29[local20] = local27;
		}
		this.anIntArray467 = new int[local15];
		local15 = 0;
		this.anIntArray468 = new int[local13];
		local13 = 0;
		for (local20 = 0; local20 < local7; local20++) {
			local27 = this.aClass1_Sub1Array29[local20];
			local43 = local27.aClass1_Sub1Array42.length;
			for (local50 = 0; local50 < local43; local50++) {
				local27.aClass1_Sub1Array42[local50] = this.aClass1_Sub1Array29[local18[local20][local50]];
			}
			local50 = local27.method4453();
			@Pc(126) int local126 = local27.method4448();
			if (local50 > 0) {
				this.anIntArray467[local15++] = local50;
			}
			if (local126 > 0) {
				this.anIntArray468[local13++] = local126;
			}
			local18[local20] = null;
		}
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array29[arg0.method3122()];
		local18 = null;
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array29[arg0.method3122()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array29[arg0.method3122()];
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(DIILclient!eg;ZILclient!ak;)Lclient!ek;")
	public Class1_Sub2_Sub2_Sub1 method3206(@OriginalArg(0) double arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class7 arg4) {
		Static264.method1815(arg0);
		Static239.aClass7_196 = arg4;
		Static259.anInterface3_1 = arg2;
		Static130.method2052(arg1, arg3);
		@Pc(22) Class1_Sub2_Sub2_Sub1 local22 = new Class1_Sub2_Sub2_Sub1(arg1, arg3);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub1Array29.length; local24++) {
			this.aClass1_Sub1Array29[local24].method4452(arg1, arg3);
		}
		local24 = 0;
		@Pc(48) int local48;
		for (local48 = 0; local48 < arg3; local48++) {
			@Pc(74) int[] local74;
			@Pc(72) int[] local72;
			@Pc(76) int[] local76;
			if (this.aClass1_Sub1_1.aBoolean434) {
				@Pc(70) int[] local70 = this.aClass1_Sub1_1.method4459(local48);
				local72 = local70;
				local74 = local70;
				local76 = local70;
			} else {
				@Pc(84) int[][] local84 = this.aClass1_Sub1_1.method4444(local48);
				local76 = local84[2];
				local72 = local84[1];
				local74 = local84[0];
			}
			for (@Pc(98) int local98 = 0; local98 != arg1; local98++) {
				@Pc(111) int local111 = local76[local98] >> 4;
				if (local111 > 255) {
					local111 = 255;
				}
				@Pc(124) int local124 = local74[local98] >> 4;
				if (local111 < 0) {
					local111 = 0;
				}
				local111 = Static173.anIntArray382[local111];
				@Pc(139) int local139 = local72[local98] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local139 > 255) {
					local139 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				local124 = Static173.anIntArray382[local124];
				local139 = Static173.anIntArray382[local139];
				local22.anIntArray598[local24++] = (local139 << 8) + (local124 << 16) + local111;
			}
		}
		for (local48 = 0; local48 < this.aClass1_Sub1Array29.length; local48++) {
			this.aClass1_Sub1Array29[local48].method4460();
		}
		return local22;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!eg;IIZLclient!ak;BD)[I")
	public int[] method3207(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(6) double arg5) {
		@Pc(12) int[] local12 = new int[arg2 * arg1 * 4];
		Static264.method1815(arg5);
		Static259.anInterface3_1 = arg0;
		Static239.aClass7_196 = arg4;
		Static130.method2052(arg2, arg1);
		@Pc(25) int local25;
		for (local25 = 0; local25 < this.aClass1_Sub1Array29.length; local25++) {
			this.aClass1_Sub1Array29[local25].method4452(arg2, arg1);
		}
		local25 = 0;
		@Pc(51) int local51;
		for (local51 = 0; local51 < arg1; local51++) {
			if (arg3) {
				local25 = local51;
			}
			@Pc(80) int[] local80;
			@Pc(76) int[] local76;
			@Pc(72) int[] local72;
			@Pc(88) int[] local88;
			if (this.aClass1_Sub1_1.aBoolean434) {
				local88 = this.aClass1_Sub1_1.method4459(local51);
				local72 = local88;
				local80 = local88;
				local76 = local88;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub1_1.method4444(local51);
				local72 = local68[2];
				local76 = local68[1];
				local80 = local68[0];
			}
			if (this.aClass1_Sub1_3.aBoolean434) {
				local88 = this.aClass1_Sub1_3.method4459(local51);
			} else {
				local88 = this.aClass1_Sub1_3.method4444(local51)[0];
			}
			for (@Pc(118) int local118 = arg2 - 1; local118 >= 0; local118--) {
				@Pc(129) int local129 = local76[local118] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				@Pc(141) int local141 = local80[local118] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(165) int local165 = local72[local118] >> 4;
				local129 = Static173.anIntArray382[local129];
				local141 = Static173.anIntArray382[local141];
				if (local165 > 255) {
					local165 = 255;
				}
				if (local165 < 0) {
					local165 = 0;
				}
				local165 = Static173.anIntArray382[local165];
				@Pc(213) int local213;
				if (local141 == 0 && local129 == 0 && local165 == 0) {
					local213 = 0;
				} else {
					local213 = local88[local118] >> 4;
					if (local213 > 255) {
						local213 = 255;
					}
					if (local213 < 0) {
						local213 = 0;
					}
				}
				local12[local25++] = (local141 << 16) + (local213 << 24) + (local129 << 8) + local165;
				if (arg3) {
					local25 += arg2 - 1;
				}
			}
		}
		for (local51 = 0; local51 < this.aClass1_Sub1Array29.length; local51++) {
			this.aClass1_Sub1Array29[local51].method4460();
		}
		return local12;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!eg;ZLclient!ak;I)[F")
	public float[] method3210(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class7 arg3, @OriginalArg(5) int arg4) {
		Static259.anInterface3_1 = arg1;
		Static239.aClass7_196 = arg3;
		Static130.method2052(arg4, arg0);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass1_Sub1Array29.length; local23++) {
			this.aClass1_Sub1Array29[local23].method4452(arg4, arg0);
		}
		@Pc(50) float[] local50 = new float[arg4 * 4 * arg0];
		local23 = 0;
		@Pc(54) int local54;
		for (local54 = 0; local54 < arg0; local54++) {
			if (arg2) {
				local23 = local54 << 2;
			}
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			if (this.aClass1_Sub1_1.aBoolean434) {
				@Pc(73) int[] local73 = this.aClass1_Sub1_1.method4459(local54);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(87) int[][] local87 = this.aClass1_Sub1_1.method4444(local54);
				local77 = local87[1];
				local79 = local87[2];
				local75 = local87[0];
			}
			@Pc(109) int[] local109;
			if (this.aClass1_Sub1_3.aBoolean434) {
				local109 = this.aClass1_Sub1_3.method4459(local54);
			} else {
				local109 = this.aClass1_Sub1_3.method4444(local54)[0];
			}
			@Pc(129) int[] local129;
			if (this.aClass1_Sub1_2.aBoolean434) {
				local129 = this.aClass1_Sub1_2.method4459(local54);
			} else {
				local129 = this.aClass1_Sub1_2.method4444(local54)[0];
			}
			for (@Pc(143) int local143 = arg4 - 1; local143 >= 0; local143--) {
				@Pc(153) float local153 = (float) local109[local143] / 4096.0F;
				if (local153 < 0.0F) {
					local153 = 0.0F;
				} else if (local153 > 1.0F) {
					local153 = 1.0F;
				}
				@Pc(180) float local180 = ((float) local129[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local50[local23++] = local180 * (float) local75[local143];
				local50[local23++] = (float) local77[local143] * local180;
				local50[local23++] = local180 * (float) local79[local143];
				local50[local23++] = local153;
				if (arg2) {
					local23 += (arg4 << 2) - 4;
				}
			}
		}
		for (local54 = 0; local54 < this.aClass1_Sub1Array29.length; local54++) {
			this.aClass1_Sub1Array29[local54].method4460();
		}
		return local50;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ak;BLclient!eg;DIIZ)Lclient!ta;")
	public Class1_Sub2_Sub2_Sub1_Sub1 method3215(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static264.method1815(arg2);
		Static259.anInterface3_1 = arg1;
		Static239.aClass7_196 = arg0;
		Static130.method2052(arg3, arg4);
		@Pc(22) Class1_Sub2_Sub2_Sub1_Sub1 local22 = new Class1_Sub2_Sub2_Sub1_Sub1(arg3, arg4);
		@Pc(24) int local24;
		for (local24 = 0; local24 < this.aClass1_Sub1Array29.length; local24++) {
			this.aClass1_Sub1Array29[local24].method4452(arg3, arg4);
		}
		local24 = 0;
		@Pc(54) int local54;
		for (local54 = 0; local54 < arg4; local54++) {
			@Pc(89) int[] local89;
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(97) int[] local97;
			if (this.aClass1_Sub1_1.aBoolean434) {
				local97 = this.aClass1_Sub1_1.method4459(local54);
				local89 = local97;
				local85 = local97;
				local81 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub1_1.method4444(local54);
				local81 = local77[1];
				local85 = local77[2];
				local89 = local77[0];
			}
			if (this.aClass1_Sub1_3.aBoolean434) {
				local97 = this.aClass1_Sub1_3.method4459(local54);
			} else {
				local97 = this.aClass1_Sub1_3.method4444(local54)[0];
			}
			for (@Pc(127) int local127 = arg3 - 1; local127 >= 0; local127--) {
				@Pc(136) int local136 = local89[local127] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				@Pc(148) int local148 = local85[local127] >> 4;
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(160) int local160 = local81[local127] >> 4;
				local136 = Static173.anIntArray382[local136];
				if (local148 > 255) {
					local148 = 255;
				}
				if (local148 < 0) {
					local148 = 0;
				}
				local148 = Static173.anIntArray382[local148];
				if (local160 > 255) {
					local160 = 255;
				}
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static173.anIntArray382[local160];
				@Pc(210) int local210;
				if (local136 == 0 && local160 == 0 && local148 == 0) {
					local210 = 0;
				} else {
					local210 = local97[local127] >> 4;
					if (local210 > 255) {
						local210 = 255;
					}
					if (local210 < 0) {
						local210 = 0;
					}
				}
				local22.anIntArray598[local24++] = local148 + (local160 << 8) + (local136 << 16) + (local210 << 24);
			}
		}
		for (local54 = 0; local54 < this.aClass1_Sub1Array29.length; local54++) {
			this.aClass1_Sub1Array29[local54].method4460();
		}
		return local22;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!ak;IDILclient!eg;ZZ)[I")
	public int[] method3216(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface3 arg5, @OriginalArg(6) boolean arg6) {
		Static264.method1815(arg3);
		Static259.anInterface3_1 = arg5;
		Static239.aClass7_196 = arg1;
		@Pc(17) int[] local17 = new int[arg2 * arg4];
		Static130.method2052(arg2, arg4);
		@Pc(23) int local23;
		for (local23 = 0; local23 < this.aClass1_Sub1Array29.length; local23++) {
			this.aClass1_Sub1Array29[local23].method4452(arg2, arg4);
		}
		@Pc(43) int local43;
		@Pc(47) byte local47;
		if (arg6) {
			local47 = -1;
			local23 = arg2 - 1;
			local43 = -1;
		} else {
			local43 = arg2;
			local23 = 0;
			local47 = 1;
		}
		@Pc(59) int local59 = 0;
		@Pc(61) int local61;
		for (local61 = 0; local61 < arg4; local61++) {
			if (arg0) {
				local59 = local61;
			}
			@Pc(84) int[] local84;
			@Pc(82) int[] local82;
			@Pc(80) int[] local80;
			if (this.aClass1_Sub1_1.aBoolean434) {
				@Pc(78) int[] local78 = this.aClass1_Sub1_1.method4459(local61);
				local80 = local78;
				local82 = local78;
				local84 = local78;
			} else {
				@Pc(92) int[][] local92 = this.aClass1_Sub1_1.method4444(local61);
				local80 = local92[2];
				local84 = local92[0];
				local82 = local92[1];
			}
			for (@Pc(106) int local106 = local23; local106 != local43; local106 += local47) {
				@Pc(115) int local115 = local82[local106] >> 4;
				@Pc(121) int local121 = local84[local106] >> 4;
				@Pc(127) int local127 = local80[local106] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				local121 = Static173.anIntArray382[local121];
				if (local115 > 255) {
					local115 = 255;
				}
				local127 = Static173.anIntArray382[local127];
				if (local115 < 0) {
					local115 = 0;
				}
				local115 = Static173.anIntArray382[local115];
				local17[local59++] = local127 + (local115 << 8) + (local121 << 16);
				if (arg0) {
					local59 += arg2 - 1;
				}
			}
		}
		for (local61 = 0; local61 < this.aClass1_Sub1Array29.length; local61++) {
			this.aClass1_Sub1Array29[local61].method4460();
		}
		return local17;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!ak;Lclient!eg;)Z")
	public boolean method3217(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Interface3 arg1) {
		@Pc(12) int local12;
		if (Static103.anInt1939 > 0) {
			for (local12 = 0; local12 < this.anIntArray467.length; local12++) {
				if (!arg0.method235(this.anIntArray467[local12], Static103.anInt1939)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray467.length; local12++) {
				if (!arg0.method242(this.anIntArray467[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray468.length; local12++) {
			if (!arg1.method961(this.anIntArray468[local12])) {
				return false;
			}
		}
		return true;
	}
}
