import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class28_Sub1_Sub1_Sub1_Sub2 extends Class28_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!wp", name = "Zc", descriptor = "Ljava/lang/String;")
	public String aString126;

	@OriginalMember(owner = "client!wp", name = "wd", descriptor = "Lclient!ah;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!wp", name = "xd", descriptor = "Lclient!rea;")
	public Class300 aClass300_1;

	@OriginalMember(owner = "client!wp", name = "yd", descriptor = "I")
	public int anInt10835;

	@OriginalMember(owner = "client!wp", name = "ad", descriptor = "I")
	public int anInt10815 = -1;

	@OriginalMember(owner = "client!wp", name = "qd", descriptor = "I")
	public int anInt10830 = -1;

	@OriginalMember(owner = "client!wp", name = "vd", descriptor = "I")
	public int anInt10834 = 1;

	@OriginalMember(owner = "client!wp", name = "Ed", descriptor = "I")
	public int anInt10840 = 1;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)I")
	@Override
	public int method9318() {
		if (this.aClass300_1.anIntArray696 != null) {
			@Pc(19) Class300 local19 = this.aClass300_1.method7258(Static131.aClass66_1);
			if (local19 != null && local19.anInt8336 != -1) {
				return local19.anInt8336;
			}
		}
		return this.aClass300_1.anInt8336;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		if (this.aClass300_1 == null || !super.aBoolean822 && !this.method9333(arg0, 0)) {
			return;
		}
		@Pc(28) Class239 local28 = arg0.method8447();
		local28.method9233(super.aClass282_7.method7022());
		local28.method9244(super.anInt10729, super.anInt10722 - 20, super.anInt10731);
		this.method9317(super.aClass95Array3, arg0, local28, super.aBoolean822);
		for (@Pc(55) int local55 = 0; super.aClass95Array3.length > local55; local55++) {
			super.aClass95Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)I")
	@Override
	public int method9294() {
		return this.aClass300_1 == null ? 0 : this.aClass300_1.anInt8297;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		if (this.aClass300_1 == null || !this.method9333(arg2, 131072)) {
			return false;
		}
		@Pc(24) Class239 local24 = arg2.method8447();
		@Pc(29) int local29 = super.aClass282_7.method7022();
		local24.method9233(local29);
		local24.method9244(super.anInt10729, super.anInt10722, super.anInt10731);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass95Array3.length > local44; local44++) {
			if (super.aClass95Array3[local44] != null) {
				@Pc(66) boolean var10000;
				label50: {
					if (this.aClass300_1.anInt8297 <= 0) {
						label48: {
							if (this.aClass300_1.anInt8312 == -1) {
								if (this.aClass300_1.anInt8313 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass300_1.anInt8312 == 1) {
									break label48;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label50;
							}
						}
					}
					var10000 = true;
				}
				@Pc(79) boolean local79 = var10000;
				@Pc(94) boolean local94;
				if (Static443.aBoolean515) {
					local94 = super.aClass95Array3[local44].method5650(arg1, arg0, local24, local79, this.aClass300_1.anInt8297, Static675.anInt10880);
				} else {
					local94 = super.aClass95Array3[local44].method5658(arg1, arg0, local24, local79, this.aClass300_1.anInt8297);
				}
				if (local94) {
					local42 = true;
					break;
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < super.aClass95Array3.length; local128++) {
			super.aClass95Array3[local128] = null;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(B)I")
	@Override
	public int method9321() {
		if (this.aClass300_1.anIntArray696 != null) {
			@Pc(13) Class300 local13 = this.aClass300_1.method7258(Static131.aClass66_1);
			if (local13 != null && local13.anInt8295 != -1) {
				return local13.anInt8295;
			}
		}
		return this.aClass300_1.anInt8295 == -1 ? super.method9321() : this.aClass300_1.anInt8295;
	}

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "(B)Z")
	private boolean method9328() {
		return this.aClass300_1.aBoolean631;
	}

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "(I)Z")
	public boolean method9329() {
		return this.aClass300_1 != null;
	}

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
	public void method9330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray956[0];
		@Pc(15) int local15 = super.anIntArray955[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt10773 != -1 && Static243.aClass343_3.method8356(super.anInt10773).anInt10260 == 1) {
			super.lb = null;
			super.anInt10773 = -1;
		}
		for (@Pc(81) int local81 = 0; super.aClass280Array3.length > local81; local81++) {
			if (super.aClass280Array3[local81].anInt7952 != -1) {
				@Pc(99) Class144 local99 = Static354.aClass236_2.method5615(super.aClass280Array3[local81].anInt7952);
				if (local99.aBoolean324 && local99.anInt4332 != -1 && Static243.aClass343_3.method8356(local99.anInt4332).anInt10260 == 1) {
					super.aClass280Array3[local81].anInt7952 = -1;
				}
			}
		}
		if (super.anInt10812 < 9) {
			super.anInt10812++;
		}
		for (@Pc(148) int local148 = super.anInt10812; local148 > 0; local148--) {
			super.anIntArray956[local148] = super.anIntArray956[local148 - 1];
			super.anIntArray955[local148] = super.anIntArray955[local148 - 1];
			super.aByteArray111[local148] = super.aByteArray111[local148 - 1];
		}
		super.anIntArray956[0] = local10;
		super.anIntArray955[0] = local15;
		super.aByteArray111[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method9333(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class359 local9 = this.method9315();
		@Pc(25) Class372 local25 = super.anInt10773 != -1 && super.anInt10775 == 0 ? Static243.aClass343_3.method8356(super.anInt10773) : null;
		@Pc(42) Class372 local42 = super.anInt10749 == -1 || super.aBoolean820 && local25 != null ? null : Static243.aClass343_3.method8356(super.anInt10749);
		@Pc(45) int local45 = local9.anInt10005;
		@Pc(48) int local48 = local9.anInt10002;
		if (local45 != 0 || local48 != 0 || local9.anInt10006 != 0 || local9.anInt9979 != 0) {
			arg1 |= 0x7;
		}
		@Pc(91) boolean local91 = super.aByte180 != 0 && Static588.anInt9467 >= super.anInt10805 && super.anInt10757 > Static588.anInt9467;
		if (local91) {
			arg1 |= 0x80000;
		}
		@Pc(107) int local107 = super.aClass282_7.method7022();
		@Pc(143) Class95 local143 = super.aClass95Array3[0] = this.aClass300_1.method7266(local25, Static131.aClass66_1, super.anInt10750, arg0, super.aClass107Array3, Static243.aClass343_3, super.anInt10760, super.anIntArray954, Static282.aClass52_1, super.anInt10804, super.anInt10779, this.aClass11_1, local107, local42, arg1, super.anInt10783, super.anInt10758);
		if (local143 == null) {
			return false;
		}
		super.anInt10748 = local143.fa();
		super.anInt10807 = local143.ma();
		this.method9320(local143);
		if (local45 == 0 && local48 == 0) {
			this.method9305(0, this.method9314() << 9, local107, 0, this.method9314() << 9);
		} else {
			this.method9305(local9.anInt10011, local48, local107, local9.anInt9975, local45);
			if (super.anInt10782 != 0) {
				super.aClass95Array3[0].FA(super.anInt10782);
			}
			if (super.anInt10759 != 0) {
				super.aClass95Array3[0].VA(super.anInt10759);
			}
			if (super.anInt10778 != 0) {
				super.aClass95Array3[0].H(0, super.anInt10778, 0);
			}
		}
		if (local91) {
			local143.method5662(super.aByte176, super.aByte179, super.aByte178, super.aByte180 & 0xFF);
		}
		this.method9309(arg0, local9, local107, local45, local48, local5);
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		if (this.aClass300_1 == null || !this.method9333(arg0, 2048)) {
			return null;
		}
		@Pc(21) Class239 local21 = arg0.method8447();
		@Pc(26) int local26 = super.aClass282_7.method7022();
		local21.method9233(local26);
		@Pc(44) Class164 local44 = Static15.aClass164ArrayArrayArray5[super.aByte174][super.anInt10729 >> Static391.anInt10262][super.anInt10731 >> Static391.anInt10262];
		if (local44 == null || local44.aClass28_Sub1_Sub3_1 == null) {
			super.anInt10771 = (int) ((float) super.anInt10771 - (float) super.anInt10771 / 10.0F);
		} else {
			@Pc(56) int local56 = super.anInt10771 - local44.aClass28_Sub1_Sub3_1.aShort92;
			super.anInt10771 = (int) ((float) super.anInt10771 - (float) local56 / 10.0F);
		}
		local21.method9244(super.anInt10729, -super.anInt10771 + super.anInt10722 - 20, super.anInt10731);
		@Pc(105) Class359 local105 = this.method9315();
		@Pc(118) Class300 local118 = this.aClass300_1.anIntArray696 == null ? this.aClass300_1 : this.aClass300_1.method7258(Static131.aClass66_1);
		super.aBoolean823 = false;
		@Pc(123) Class28_Sub3 local123 = null;
		if (Static24.aClass3_Sub22_4.aClass6_Sub19_1.method6779() == 1 && local118.aBoolean634 && local105.aBoolean760) {
			@Pc(152) Class372 local152 = super.anInt10773 != -1 && super.anInt10775 == 0 ? Static243.aClass343_3.method8356(super.anInt10773) : null;
			@Pc(170) Class372 local170 = super.anInt10749 == -1 || super.aBoolean820 && local152 != null ? null : Static243.aClass343_3.method8356(super.anInt10749);
			@Pc(220) Class95 local220 = Static292.method4565(local26, super.anInt10782, super.aClass95Array3[0], super.anInt10778, local170 == null ? local152 : local170, this.aClass300_1.aShort89 & 0xFFFF, local170 == null ? super.anInt10750 : super.anInt10760, arg0, this.aClass300_1.aByte123 & 0xFF, super.anInt10759, this.aClass300_1.aShort88 & 0xFFFF, this.aClass300_1.aByte122 & 0xFF, this.aClass300_1.anInt8313);
			if (local220 != null) {
				local123 = Static4.method120(this.method9328(), super.aClass95Array3.length + 1);
				super.aBoolean823 = true;
				arg0.C(false);
				if (Static443.aBoolean515) {
					local220.method5659(local21, local123.aClass28_Sub8Array1[super.aClass95Array3.length], Static675.anInt10880, 0);
				} else {
					local220.method5653(local21, local123.aClass28_Sub8Array1[super.aClass95Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local21.method9233(local26);
		local21.method9244(super.anInt10729, -super.anInt10771 + super.anInt10722 - 5, super.anInt10731);
		if (local123 == null) {
			local123 = Static4.method120(this.method9328(), super.aClass95Array3.length);
		}
		this.method9317(super.aClass95Array3, arg0, local21, false);
		@Pc(309) int local309;
		if (Static443.aBoolean515) {
			for (local309 = 0; super.aClass95Array3.length > local309; local309++) {
				if (super.aClass95Array3[local309] != null) {
					super.aClass95Array3[local309].method5659(local21, local123.aClass28_Sub8Array1[local309], Static675.anInt10880, 0);
				}
			}
		} else {
			for (local309 = 0; local309 < super.aClass95Array3.length; local309++) {
				if (super.aClass95Array3[local309] != null) {
					super.aClass95Array3[local309].method5653(local21, local123.aClass28_Sub8Array1[local309], 0);
				}
			}
		}
		if (super.aClass28_Sub7_8 != null) {
			@Pc(373) Class84 local373 = super.aClass28_Sub7_8.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local373, Static675.anInt10880);
			} else {
				arg0.method8499(local373);
			}
		}
		for (local309 = 0; local309 < super.aClass95Array3.length; local309++) {
			if (super.aClass95Array3[local309] != null) {
				super.aBoolean823 |= super.aClass95Array3[local309].F();
			}
		}
		super.anInt10777 = Static58.anInt1217;
		super.aClass95Array3[0] = super.aClass95Array3[1] = super.aClass95Array3[2] = null;
		return local123;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBIIIZ)V")
	public void method9334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte174 = super.aByte173 = (byte) arg0;
		if (Static488.method7052(arg1, arg2)) {
			super.aByte173++;
		}
		if (super.anInt10773 != -1 && Static243.aClass343_3.method8356(super.anInt10773).anInt10260 == 1) {
			super.anInt10773 = -1;
			super.lb = null;
		}
		for (@Pc(46) int local46 = 0; super.aClass280Array3.length > local46; local46++) {
			if (super.aClass280Array3[local46].anInt7952 != -1) {
				@Pc(64) Class144 local64 = Static354.aClass236_2.method5615(super.aClass280Array3[local46].anInt7952);
				if (local64.aBoolean324 && local64.anInt4332 != -1 && Static243.aClass343_3.method8356(local64.anInt4332).anInt10260 == 1) {
					super.aClass280Array3[local46].anInt7952 = -1;
				}
			}
		}
		if (!arg4) {
			@Pc(106) int local106 = arg1 - super.anIntArray956[0];
			@Pc(114) int local114 = arg2 - super.anIntArray955[0];
			if (local106 >= -8 && local106 <= 8 && local114 >= -8 && local114 <= 8) {
				if (super.anInt10812 < 9) {
					super.anInt10812++;
				}
				for (@Pc(141) int local141 = super.anInt10812; local141 > 0; local141--) {
					super.anIntArray956[local141] = super.anIntArray956[local141 - 1];
					super.anIntArray955[local141] = super.anIntArray955[local141 - 1];
					super.aByteArray111[local141] = super.aByteArray111[local141 - 1];
				}
				super.anIntArray956[0] = arg1;
				super.anIntArray955[0] = arg2;
				super.aByteArray111[0] = 1;
				return;
			}
		}
		super.anIntArray956[0] = arg1;
		super.anInt10814 = 0;
		super.anInt10811 = 0;
		super.anInt10812 = 0;
		super.anIntArray955[0] = arg2;
		super.anInt10729 = (arg3 << 8) + (super.anIntArray956[0] << 9);
		super.anInt10731 = (super.anIntArray955[0] << 9) + (arg3 << 8);
		if (super.aClass28_Sub7_8 != null) {
			super.aClass28_Sub7_8.method7908();
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(Z)I")
	@Override
	protected int method9323() {
		if (this.aClass300_1.anIntArray696 != null) {
			@Pc(18) Class300 local18 = this.aClass300_1.method7258(Static131.aClass66_1);
			if (local18 != null && local18.anInt8329 != -1) {
				return local18.anInt8329;
			}
		}
		return this.aClass300_1.anInt8329;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!rea;Z)V")
	public void method9335(@OriginalArg(0) Class300 arg0) {
		this.aClass300_1 = arg0;
		if (this.aClass300_1 != null) {
			this.aString126 = this.aClass300_1.aString101;
			this.anInt10835 = this.aClass300_1.anInt8310;
		}
		if (super.aClass28_Sub7_8 != null) {
			super.aClass28_Sub7_8.method7908();
		}
	}
}
