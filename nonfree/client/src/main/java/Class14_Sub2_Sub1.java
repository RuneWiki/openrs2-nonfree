import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class14_Sub2_Sub1 extends Class14_Sub2 {

	@OriginalMember(owner = "client!fj", name = "Ic", descriptor = "Lclient!lb;")
	public Class93 aClass93_1;

	@OriginalMember(owner = "client!fj", name = "Zc", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!fj", name = "Cc", descriptor = "I")
	public int anInt1719 = 0;

	@OriginalMember(owner = "client!fj", name = "Ac", descriptor = "I")
	public int anInt1718 = 0;

	@OriginalMember(owner = "client!fj", name = "Kc", descriptor = "I")
	public int anInt1725 = -1;

	@OriginalMember(owner = "client!fj", name = "xc", descriptor = "I")
	public int anInt1715 = -1;

	@OriginalMember(owner = "client!fj", name = "vc", descriptor = "I")
	public int anInt1714 = -1;

	@OriginalMember(owner = "client!fj", name = "Tc", descriptor = "I")
	public int anInt1734 = 0;

	@OriginalMember(owner = "client!fj", name = "Xc", descriptor = "I")
	public int anInt1738 = -1;

	@OriginalMember(owner = "client!fj", name = "Wc", descriptor = "I")
	public int anInt1737 = 255;

	@OriginalMember(owner = "client!fj", name = "zc", descriptor = "I")
	public int anInt1717 = 0;

	@OriginalMember(owner = "client!fj", name = "ed", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!fj", name = "dd", descriptor = "I")
	public int anInt1742 = -1;

	@OriginalMember(owner = "client!fj", name = "gd", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!fj", name = "ad", descriptor = "I")
	public int anInt1739 = -1;

	@OriginalMember(owner = "client!fj", name = "fd", descriptor = "I")
	public int anInt1743 = 0;

	@OriginalMember(owner = "client!fj", name = "Rc", descriptor = "I")
	public int anInt1732 = -1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!cg;I)V")
	public void method1348(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.anInt3264 = 0;
		@Pc(10) int local10 = arg0.method2690();
		@Pc(14) int local14 = local10 & 0x1;
		@Pc(29) boolean local29 = (local10 & 0x4) != 0;
		@Pc(31) int local31 = -1;
		@Pc(44) int local44 = super.method3656();
		@Pc(47) int[] local47 = new int[12];
		this.method3653((local10 >> 3 & 0x7) + 1);
		this.aByte7 = (byte) (local10 >> 6 & 0x3);
		this.anInt4680 += (this.method3656() - local44) * 64;
		this.anInt4630 += (this.method3656() - local44) * 64;
		this.anInt1715 = arg0.method2663();
		this.anInt1732 = arg0.method2663();
		this.anInt1743 = 0;
		@Pc(115) int local115;
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(180) int local180;
		for (@Pc(106) int local106 = 0; local106 < 12; local106++) {
			local115 = arg0.method2690();
			if (local115 == 0) {
				local47[local106] = 0;
			} else {
				local132 = arg0.method2690();
				local138 = local132 + (local115 << 8);
				if (local106 == 0 && local138 == 65535) {
					local31 = arg0.method2691();
					this.anInt1743 = arg0.method2690();
					break;
				}
				if (local138 < 32768) {
					local47[local106] = local138 - 256 | Integer.MIN_VALUE;
				} else {
					local138 = Static249.anIntArray435[local138 - 32768];
					local47[local106] = local138 | 0x40000000;
					local180 = Static112.method2060(local138).anInt1483;
					if (local180 != 0) {
						this.anInt1743 = local180;
					}
				}
			}
		}
		@Pc(205) int[] local205 = new int[5];
		for (local115 = 0; local115 < 5; local115++) {
			local132 = arg0.method2690();
			if (local132 < 0 || local132 >= Static267.aShortArrayArray6[local115].length) {
				local132 = 0;
			}
			local205[local115] = local132;
		}
		this.anInt4674 = arg0.method2691();
		@Pc(245) long local245 = arg0.method2646();
		this.aString99 = Static24.method3641(local245);
		this.anInt1719 = arg0.method2690();
		if (local29) {
			this.anInt1717 = arg0.method2691();
			this.anInt1738 = -1;
			this.anInt1734 = this.anInt1719;
		} else {
			this.anInt1717 = 0;
			this.anInt1734 = arg0.method2690();
			this.anInt1738 = arg0.method2690();
			if (this.anInt1738 == 255) {
				this.anInt1738 = -1;
			}
		}
		local138 = this.anInt1718;
		this.anInt1718 = arg0.method2690();
		if (this.anInt1718 == 0) {
			Static187.method3139(this);
		} else {
			@Pc(311) int local311 = this.anInt1739;
			local180 = this.anInt1742;
			@Pc(317) int local317 = this.anInt1725;
			@Pc(320) int local320 = this.anInt1714;
			@Pc(323) int local323 = this.anInt1737;
			this.anInt1742 = arg0.method2691();
			this.anInt1739 = arg0.method2691();
			this.anInt1725 = arg0.method2691();
			this.anInt1714 = arg0.method2691();
			this.anInt1737 = arg0.method2690();
			if (local138 != this.anInt1718 || this.anInt1742 != local180 || this.anInt1739 != local311 || local317 != this.anInt1725 || this.anInt1714 != local320 || this.anInt1737 != local323) {
				Static268.method4065(this);
			}
		}
		if (this.aClass93_1 == null) {
			this.aClass93_1 = new Class93();
		}
		local180 = this.aClass93_1.anInt3216;
		this.aClass93_1.method2595(local31, local205, local47, this.anInt4674, local14 == 1);
		if (local31 != local180) {
			this.anInt4680 = this.anIntArray415[0] * 128 + this.method3656() * 64;
			this.anInt4630 = this.anIntArray418[0] * 128 + this.method3656() * 64;
		}
		if (this.aClass86_Sub1_6 != null) {
			this.aClass86_Sub1_6.method3618();
		}
	}

	@OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZI)V")
	public void method1349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		super.method3654(this.method3656(), arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
	@Override
	protected int method3644() {
		return this.anInt4674;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!sa;IIIIILclient!q;IIIIIII)V")
	private void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class14_Sub6 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = arg6 * arg6 + arg1 * arg1;
		if (local11 < 16 || arg3 < local11) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg1, (double) arg6) * 325.949D) & 0x7FF;
		@Pc(53) Class14_Sub6 local53 = Static198.method42(this.anInt4694, this.anInt4680, this.anInt4630, arg12, arg7, local32);
		if (local53 == null) {
			return;
		}
		if (!Static277.aBoolean412) {
			local53.method4097(0, arg10, arg5, arg9, arg0, arg14, arg13, arg4, -1L, arg8, arg2);
			return;
		}
		@Pc(75) float local75 = Static277.method4203();
		@Pc(77) float local77 = Static277.method4218();
		Static277.method4208();
		Static277.method4224(local75, local77 - 150.0F);
		local53.method4097(0, arg10, arg5, arg9, arg0, arg14, arg13, arg4, -1L, arg8, arg2);
		Static277.method4215();
		Static277.method4224(local75, local77);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method3647() {
		return this.aClass93_1 != null;
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I")
	@Override
	public int method3656() {
		return this.aClass93_1 == null || this.aClass93_1.anInt3216 == -1 ? super.method3656() : Static205.method3293(this.aClass93_1.anInt3216).anInt1532;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		return this.anInt4699;
	}

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method1357() {
		@Pc(13) String local13 = this.aString99;
		if (Static142.aStringArray40 != null) {
			local13 = Static142.aStringArray40[this.aByte7] + local13;
		}
		if (Static100.aStringArray30 != null) {
			local13 = local13 + Static100.aStringArray30[this.aByte7];
		}
		return local13;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		if (this.aClass93_1 == null) {
			return;
		}
		@Pc(29) Class125 local29 = this.anInt4620 != -1 && this.anInt4695 == 0 ? Static90.method1591(this.anInt4620) : null;
		@Pc(55) Class125 local55 = this.anInt4658 == -1 || this.aBoolean123 || this.anInt4658 == this.method3650().anInt5190 && local29 != null ? null : Static90.method1591(this.anInt4658);
		@Pc(77) Class14_Sub6 local77 = this.aClass93_1.method2589(this.anInt4637, local29, this.aClass3Array3, this.anInt4663, this.anInt4662, this.anInt4638, local55, this.anInt4632, this.anInt4633);
		@Pc(80) int local80 = Static209.method3318();
		if (Static277.aBoolean412 && Static177.anInt3741 < 96 && local80 > 50) {
			Static190.method3154();
		}
		@Pc(110) int local110;
		if (Static49.anInt1127 != 0 && local80 < 50) {
			local110 = 50 - local80;
			while (local110 > Static73.anInt1564) {
				Static102.aByteArrayArray7[Static73.anInt1564] = new byte[102400];
				Static73.anInt1564++;
			}
			while (local110 < Static73.anInt1564) {
				Static73.anInt1564--;
				Static102.aByteArrayArray7[Static73.anInt1564] = null;
			}
		}
		if (local77 == null) {
			return;
		}
		this.anInt4699 = local77.method4091();
		@Pc(195) Class14_Sub6 local195;
		if (Static199.aBoolean308 && (this.aClass93_1.anInt3216 == -1 || Static205.method3293(this.aClass93_1.anInt3216).aBoolean109)) {
			local195 = Static299.method4472(160, local77, this.anInt4630, 240, this.anInt4694, this.anInt4680, local55 == null ? this.anInt4633 : this.anInt4638, 0, this.aBoolean356, 0, 1, arg0, local55 == null ? local29 : local55);
			if (Static277.aBoolean412) {
				@Pc(214) float local214 = Static277.method4203();
				@Pc(216) float local216 = Static277.method4218();
				Static277.method4208();
				Static277.method4224(local214, local216 - 150.0F);
				local195.method4097(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static277.method4215();
				Static277.method4224(local214, local216);
			} else {
				local195.method4097(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static197.aClass14_Sub2_Sub1_2 == this) {
			for (local110 = Static198.aClass80Array2.length - 1; local110 >= 0; local110--) {
				@Pc(254) Class80 local254 = Static198.aClass80Array2[local110];
				if (local254 != null && local254.anInt2852 != -1) {
					@Pc(297) int local297;
					@Pc(308) int local308;
					if (local254.anInt2843 == 1 && local254.anInt2839 >= 0 && Static254.aClass14_Sub2_Sub2Array1.length > local254.anInt2839) {
						@Pc(282) Class14_Sub2_Sub2 local282 = Static254.aClass14_Sub2_Sub2Array1[local254.anInt2839];
						if (local282 != null) {
							local297 = local282.anInt4680 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
							local308 = local282.anInt4630 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
							this.method1353(arg4, local297, null, 360000, arg7, arg2, local308, local77, arg9, arg3, arg1, arg0, local254.anInt2852, arg6, arg5);
						}
					}
					if (local254.anInt2843 == 2) {
						@Pc(349) int local349 = (local254.anInt2847 - Static53.anInt5288) * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
						local297 = (local254.anInt2855 - Static83.anInt1875) * 4 + 2 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
						local308 = local254.anInt2838 * 4;
						local308 *= local308;
						this.method1353(arg4, local349, null, local308, arg7, arg2, local297, local77, arg9, arg3, arg1, arg0, local254.anInt2852, arg6, arg5);
					}
					if (local254.anInt2843 == 10 && local254.anInt2839 >= 0 && local254.anInt2839 < Static98.aClass14_Sub2_Sub1Array1.length) {
						@Pc(418) Class14_Sub2_Sub1 local418 = Static98.aClass14_Sub2_Sub1Array1[local254.anInt2839];
						if (local418 != null) {
							local297 = local418.anInt4680 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4680 / 32;
							local308 = local418.anInt4630 / 32 - Static197.aClass14_Sub2_Sub1_2.anInt4630 / 32;
							this.method1353(arg4, local297, null, 360000, arg7, arg2, local308, local77, arg9, arg3, arg1, arg0, local254.anInt2852, arg6, arg5);
						}
					}
				}
			}
		}
		this.method3652(local77);
		this.method3645(arg0, local77);
		local195 = null;
		if (!this.aBoolean123 && this.anInt4656 != -1 && this.anInt4673 != -1) {
			@Pc(492) Class157 local492 = Static242.method3711(this.anInt4656);
			local195 = local492.method3873(this.anInt4673, this.anInt4655, this.anInt4657);
			if (local195 != null) {
				local195.method4107(0, -this.anInt4641, 0);
				if (local492.aBoolean376) {
					if (Static118.anInt2736 != 0) {
						local195.method4108(Static118.anInt2736);
					}
					if (Static230.anInt2005 != 0) {
						local195.method4126(Static230.anInt2005);
					}
					if (Static73.anInt1538 != 0) {
						local195.method4107(0, Static73.anInt1538, 0);
					}
				}
			}
		}
		@Pc(547) Class14_Sub6 local547 = null;
		if (!this.aBoolean123 && this.anObject6 != null) {
			if (this.anInt4683 <= Static237.anInt4710) {
				this.anObject6 = null;
			}
			if (this.anInt4640 <= Static237.anInt4710 && Static237.anInt4710 < this.anInt4683) {
				if (this.anObject6 instanceof Class14_Sub1) {
					local547 = (Class14_Sub6) ((Class14_Sub1) this.anObject6).method408();
				} else {
					local547 = (Class14_Sub6) this.anObject6;
				}
				local547.method4107(this.anInt4625 - this.anInt4680, this.anInt4700 + -this.anInt4694, this.anInt4654 - this.anInt4630);
				if (this.anInt4618 == 512) {
					local547.method4106();
				} else if (this.anInt4618 == 1024) {
					local547.method4116();
				} else if (this.anInt4618 == 1536) {
					local547.method4111();
				}
			}
		}
		if (Static277.aBoolean412) {
			local77.aBoolean393 = true;
			local77.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_6);
			if (local195 != null) {
				local195.aBoolean393 = true;
				local195.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_6);
			}
		} else {
			if (local195 != null) {
				local77 = ((Class14_Sub6_Sub2) local77).method4135(local195);
			}
			if (local547 != null) {
				local77 = ((Class14_Sub6_Sub2) local77).method4135(local547);
			}
			local77.aBoolean393 = true;
			local77.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_6);
		}
		if (local547 == null) {
			return;
		}
		if (this.anInt4618 == 512) {
			local547.method4111();
		} else if (this.anInt4618 == 1024) {
			local547.method4116();
		} else if (this.anInt4618 == 1536) {
			local547.method4106();
		}
		local547.method4107(this.anInt4680 - this.anInt4625, -this.anInt4700 + this.anInt4694, this.anInt4630 - this.anInt4654);
	}
}
