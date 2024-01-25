import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class34_Sub1_Sub1_Sub2_Sub2 extends Class34_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ub", name = "Wc", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!ub", name = "cd", descriptor = "Lclient!oaa;")
	public Class261 aClass261_1;

	@OriginalMember(owner = "client!ub", name = "ld", descriptor = "Lclient!oj;")
	public Class269 aClass269_1;

	@OriginalMember(owner = "client!ub", name = "nd", descriptor = "I")
	public int anInt9726;

	@OriginalMember(owner = "client!ub", name = "Zc", descriptor = "I")
	public int anInt9714 = -1;

	@OriginalMember(owner = "client!ub", name = "Xc", descriptor = "I")
	public int anInt9713 = -1;

	@OriginalMember(owner = "client!ub", name = "md", descriptor = "I")
	public int anInt9725 = 1;

	@OriginalMember(owner = "client!ub", name = "hd", descriptor = "I")
	public int anInt9721 = 1;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		if (this.aClass261_1 == null || !this.method7884(2048, arg0)) {
			return null;
		}
		@Pc(19) Class17 local19 = arg0.method8013();
		@Pc(24) int local24 = super.aClass292_7.method6390();
		local19.method6227(local24);
		@Pc(42) Class368 local42 = Static254.aClass368ArrayArrayArray2[super.aByte132][super.anInt9614 >> Static571.anInt9216][super.anInt9619 >> Static571.anInt9216];
		if (local42 == null || local42.aClass34_Sub1_Sub2_1 == null) {
			super.anInt9669 = (int) ((float) super.anInt9669 - (float) super.anInt9669 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt9669 - local42.aClass34_Sub1_Sub2_1.aShort49;
			super.anInt9669 = (int) ((float) super.anInt9669 - (float) local69 / 10.0F);
		}
		local19.method6235(super.anInt9614, super.anInt9622 - super.anInt9669 - 20, super.anInt9619);
		@Pc(97) Class286 local97 = this.method7878();
		@Pc(110) Class261 local110 = this.aClass261_1.anIntArray364 == null ? this.aClass261_1 : this.aClass261_1.method5772(Static210.aClass262_1);
		super.aBoolean677 = false;
		@Pc(115) Class34_Sub8 local115 = null;
		if (Static336.aClass3_Sub41_18.aClass14_Sub20_1.method6068() == 1 && local110.aBoolean484 && local97.aBoolean533) {
			@Pc(145) Class239 local145 = super.anInt9664 != -1 && super.anInt9698 == 0 ? Static13.aClass213_1.method5008(super.anInt9664) : null;
			@Pc(162) Class239 local162 = super.anInt9647 == -1 || super.aBoolean673 && local145 != null ? null : Static13.aClass213_1.method5008(super.anInt9647);
			@Pc(212) Class149 local212 = Static116.method1793(local24, arg0, local162 == null ? local145 : local162, this.aClass261_1.anInt6807, this.aClass261_1.aByte101 & 0xFF, this.aClass261_1.aByte105 & 0xFF, super.anInt9660, super.anInt9665, super.aClass149Array3[0], this.aClass261_1.aShort58 & 0xFFFF, super.anInt9699, local162 == null ? super.anInt9674 : super.anInt9648, this.aClass261_1.aShort59 & 0xFFFF);
			if (local212 != null) {
				local115 = Static327.method4658(super.aClass149Array3.length + 1, this.method7880());
				super.aBoolean677 = true;
				arg0.C(false);
				if (Static375.aBoolean532) {
					local212.method8869(local19, local115.aClass34_Sub6Array1[super.aClass149Array3.length], Static501.anInt7929, 0);
				} else {
					local212.method8857(local19, local115.aClass34_Sub6Array1[super.aClass149Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method6227(local24);
		local19.method6235(super.anInt9614, super.anInt9622 - super.anInt9669 - 5, super.anInt9619);
		if (local115 == null) {
			local115 = Static327.method4658(super.aClass149Array3.length, this.method7880());
		}
		this.method7870(local19, false, super.aClass149Array3, arg0);
		@Pc(301) int local301;
		if (Static375.aBoolean532) {
			for (local301 = 0; local301 < super.aClass149Array3.length; local301++) {
				if (super.aClass149Array3[local301] != null) {
					super.aClass149Array3[local301].method8869(local19, local115.aClass34_Sub6Array1[local301], Static501.anInt7929, 0);
				}
			}
		} else {
			for (local301 = 0; local301 < super.aClass149Array3.length; local301++) {
				if (super.aClass149Array3[local301] != null) {
					super.aClass149Array3[local301].method8857(local19, local115.aClass34_Sub6Array1[local301], 0);
				}
			}
		}
		if (super.aClass34_Sub7_8 != null) {
			@Pc(365) Class347 local365 = super.aClass34_Sub7_8.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local365, Static501.anInt7929);
			} else {
				arg0.method8057(local365);
			}
		}
		for (local301 = 0; super.aClass149Array3.length > local301; local301++) {
			if (super.aClass149Array3[local301] != null) {
				super.aBoolean677 |= super.aClass149Array3[local301].F();
			}
		}
		super.anInt9644 = Static494.anInt7829;
		super.aClass149Array3[0] = super.aClass149Array3[1] = super.aClass149Array3[2] = null;
		return local115;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIIB)V")
	public void method7879(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte132 = super.aByte131 = (byte) arg3;
		if (Static209.method3118(arg4, arg2)) {
			super.aByte131++;
		}
		if (super.anInt9664 != -1 && Static13.aClass213_1.method5008(super.anInt9664).anInt6418 == 1) {
			super.anIntArray527 = null;
			super.anInt9664 = -1;
		}
		for (@Pc(47) int local47 = 0; local47 < super.aClass190Array3.length; local47++) {
			if (super.aClass190Array3[local47].anInt5051 != -1) {
				@Pc(68) Class106 local68 = Static366.aClass182_2.method4107(super.aClass190Array3[local47].anInt5051);
				if (local68.aBoolean203 && local68.anInt2680 != -1 && Static13.aClass213_1.method5008(local68.anInt2680).anInt6418 == 1) {
					super.aClass190Array3[local47].anInt5051 = -1;
				}
			}
		}
		if (!arg0) {
			@Pc(110) int local110 = arg4 - super.anIntArray529[0];
			@Pc(118) int local118 = arg2 - super.anIntArray528[0];
			if (local110 >= -8 && local110 <= 8 && local118 >= -8 && local118 <= 8) {
				if (super.anInt9703 < 9) {
					super.anInt9703++;
				}
				for (@Pc(147) int local147 = super.anInt9703; local147 > 0; local147--) {
					super.anIntArray529[local147] = super.anIntArray529[local147 - 1];
					super.anIntArray528[local147] = super.anIntArray528[local147 - 1];
					super.aByteArray89[local147] = super.aByteArray89[local147 - 1];
				}
				super.anIntArray529[0] = arg4;
				super.anIntArray528[0] = arg2;
				super.aByteArray89[0] = 1;
				return;
			}
		}
		super.anIntArray529[0] = arg4;
		super.anInt9705 = 0;
		super.anInt9704 = 0;
		super.anInt9703 = 0;
		super.anIntArray528[0] = arg2;
		super.anInt9614 = (super.anIntArray529[0] << 9) + (arg1 << 8);
		super.anInt9619 = (super.anIntArray528[0] << 9) + (arg1 << 8);
		if (super.aClass34_Sub7_8 != null) {
			super.aClass34_Sub7_8.method5089();
		}
	}

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "(I)Z")
	private boolean method7880() {
		return this.aClass261_1.aBoolean478;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I")
	@Override
	public int method7844() {
		return this.aClass261_1 == null ? 0 : this.aClass261_1.anInt6796;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IBI)V")
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray529[0];
		@Pc(15) int local15 = super.anIntArray528[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt9664 != -1 && Static13.aClass213_1.method5008(super.anInt9664).anInt6418 == 1) {
			super.anIntArray527 = null;
			super.anInt9664 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		for (@Pc(89) int local89 = 0; local89 < super.aClass190Array3.length; local89++) {
			if (super.aClass190Array3[local89].anInt5051 != -1) {
				@Pc(107) Class106 local107 = Static366.aClass182_2.method4107(super.aClass190Array3[local89].anInt5051);
				if (local107.aBoolean203 && local107.anInt2680 != -1 && Static13.aClass213_1.method5008(local107.anInt2680).anInt6418 == 1) {
					super.aClass190Array3[local89].anInt5051 = -1;
				}
			}
		}
		if (super.anInt9703 < 9) {
			super.anInt9703++;
		}
		for (@Pc(151) int local151 = super.anInt9703; local151 > 0; local151--) {
			super.anIntArray529[local151] = super.anIntArray529[local151 - 1];
			super.anIntArray528[local151] = super.anIntArray528[local151 - 1];
			super.aByteArray89[local151] = super.aByteArray89[local151 - 1];
		}
		super.anIntArray529[0] = local10;
		super.aByteArray89[0] = (byte) arg1;
		super.anIntArray528[0] = local15;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Z")
	public boolean method7882() {
		return this.aClass261_1 != null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass261_1 == null || !this.method7884(131072, arg1)) {
			return false;
		}
		@Pc(19) Class17 local19 = arg1.method8013();
		@Pc(24) int local24 = super.aClass292_7.method6390();
		local19.method6227(local24);
		local19.method6235(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass149Array3.length > local44; local44++) {
			if (super.aClass149Array3[local44] != null) {
				@Pc(68) boolean var10000;
				label41: {
					if (this.aClass261_1.anInt6796 <= 0) {
						label39: {
							if (this.aClass261_1.anInt6828 == -1) {
								if (this.aClass261_1.anInt6807 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass261_1.anInt6828 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(81) boolean local81 = var10000;
				@Pc(96) boolean local96;
				if (Static375.aBoolean532) {
					local96 = super.aClass149Array3[local44].method8862(arg0, arg2, local19, local81, this.aClass261_1.anInt6796, Static501.anInt7929);
				} else {
					local96 = super.aClass149Array3[local44].method8866(arg0, arg2, local19, local81, this.aClass261_1.anInt6796);
				}
				if (local96) {
					local42 = true;
					break;
				}
			}
		}
		super.aClass149Array3[0] = super.aClass149Array3[1] = super.aClass149Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ha;I)Z")
	private boolean method7884(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class286 local9 = this.method7878();
		@Pc(25) Class239 local25 = super.anInt9664 != -1 && super.anInt9698 == 0 ? Static13.aClass213_1.method5008(super.anInt9664) : null;
		@Pc(42) Class239 local42 = super.anInt9647 == -1 || super.aBoolean673 && local25 != null ? null : Static13.aClass213_1.method5008(super.anInt9647);
		@Pc(45) int local45 = local9.anInt7532;
		@Pc(48) int local48 = local9.anInt7534;
		if (local45 != 0 || local48 != 0 || local9.anInt7540 != 0 || local9.anInt7548 != 0) {
			arg0 |= 0x7;
		}
		@Pc(86) boolean local86 = super.aByte138 != 0 && Static122.anInt2190 >= super.anInt9700 && super.anInt9657 > Static122.anInt2190;
		if (local86) {
			arg0 |= 0x80000;
		}
		@Pc(97) int local97 = super.aClass292_7.method6390();
		@Pc(133) Class149 local133 = super.aClass149Array3[0] = this.aClass261_1.method5775(Static461.aClass223_42, super.anInt9674, super.anInt9680, super.anInt9648, super.anInt9678, arg1, local42, arg0, this.aClass269_1, super.anIntArray522, super.anInt9653, Static210.aClass262_1, super.aClass158Array3, super.anInt9697, local97, Static13.aClass213_1, local25);
		if (local133 == null) {
			return false;
		}
		super.anInt9655 = local133.fa();
		super.anInt9693 = local133.ma();
		this.method7865(local133);
		if (local45 == 0 && local48 == 0) {
			this.method7858(0, this.method7866() << 9, local97, 0, this.method7866() << 9);
		} else {
			this.method7858(local9.anInt7528, local48, local97, local9.anInt7537, local45);
			if (super.anInt9699 != 0) {
				super.aClass149Array3[0].FA(super.anInt9699);
			}
			if (super.anInt9660 != 0) {
				super.aClass149Array3[0].VA(super.anInt9660);
			}
			if (super.anInt9665 != 0) {
				super.aClass149Array3[0].H(0, super.anInt9665, 0);
			}
		}
		if (local86) {
			local133.method8851(super.aByte137, super.aByte135, super.aByte136, super.aByte138 & 0xFF);
		}
		this.method7863(local5, local97, local9, local48, local45, arg1);
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method7871() {
		if (this.aClass261_1.anIntArray364 != null) {
			@Pc(19) Class261 local19 = this.aClass261_1.method5772(Static210.aClass262_1);
			if (local19 != null && local19.anInt6805 != -1) {
				return local19.anInt6805;
			}
		}
		return this.aClass261_1.anInt6805;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "(I)I")
	@Override
	protected int method7874() {
		if (this.aClass261_1.anIntArray364 != null) {
			@Pc(13) Class261 local13 = this.aClass261_1.method5772(Static210.aClass262_1);
			if (local13 != null && local13.anInt6799 != -1) {
				return local13.anInt6799;
			}
		}
		return this.aClass261_1.anInt6799;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	@Override
	public int method7861() {
		if (this.aClass261_1.anIntArray364 != null) {
			@Pc(20) Class261 local20 = this.aClass261_1.method5772(Static210.aClass262_1);
			if (local20 != null && local20.anInt6801 != -1) {
				return local20.anInt6801;
			}
		}
		return this.aClass261_1.anInt6801 == -1 ? super.method7861() : this.aClass261_1.anInt6801;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		if (this.aClass261_1 == null || !super.aBoolean678 && !this.method7884(0, arg0)) {
			return;
		}
		@Pc(20) Class17 local20 = arg0.method8013();
		local20.method6227(super.aClass292_7.method6390());
		local20.method6235(super.anInt9614, super.anInt9622 - 20, super.anInt9619);
		this.method7870(local20, super.aBoolean678, super.aClass149Array3, arg0);
		super.aClass149Array3[0] = super.aClass149Array3[1] = super.aClass149Array3[2] = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!oaa;)V")
	public void method7886(@OriginalArg(1) Class261 arg0) {
		this.aClass261_1 = arg0;
		if (this.aClass261_1 != null) {
			this.aString109 = this.aClass261_1.aString85;
			this.anInt9726 = this.aClass261_1.anInt6815;
		}
		if (super.aClass34_Sub7_8 != null) {
			super.aClass34_Sub7_8.method5089();
		}
	}
}
