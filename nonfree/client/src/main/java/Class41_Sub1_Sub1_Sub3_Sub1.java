import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class41_Sub1_Sub1_Sub3_Sub1 extends Class41_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!kia", name = "Vc", descriptor = "Lclient!sb;")
	public Class316 aClass316_1;

	@OriginalMember(owner = "client!kia", name = "Wc", descriptor = "Lclient!rn;")
	public Class311 aClass311_1;

	@OriginalMember(owner = "client!kia", name = "ud", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!kia", name = "wd", descriptor = "I")
	public int anInt5483;

	@OriginalMember(owner = "client!kia", name = "Xc", descriptor = "I")
	public int anInt5460 = -1;

	@OriginalMember(owner = "client!kia", name = "bd", descriptor = "I")
	public int anInt5464 = -1;

	@OriginalMember(owner = "client!kia", name = "qd", descriptor = "I")
	public int anInt5478 = 1;

	@OriginalMember(owner = "client!kia", name = "vd", descriptor = "I")
	public int anInt5482 = 1;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass311_1 == null || !this.method4721(131072, arg1)) {
			return false;
		}
		@Pc(23) Class56 local23 = arg1.method6212();
		@Pc(28) int local28 = super.aClass165_7.method3503();
		local23.method8391(local28);
		local23.method8390(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(53) boolean local53 = false;
		for (@Pc(55) int local55 = 0; super.aClass114Array3.length > local55; local55++) {
			if (super.aClass114Array3[local55] != null) {
				@Pc(78) boolean var10000;
				label41: {
					if (this.aClass311_1.anInt8672 <= 0) {
						label39: {
							if (this.aClass311_1.anInt8670 == -1) {
								if (this.aClass311_1.anInt8641 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass311_1.anInt8670 == 1) {
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
				@Pc(93) boolean local93 = var10000;
				@Pc(108) boolean local108;
				if (Static426.aBoolean555) {
					local108 = super.aClass114Array3[local55].method8798(arg2, arg0, local23, local93, this.aClass311_1.anInt8672, Static663.anInt10391);
				} else {
					local108 = super.aClass114Array3[local55].method8795(arg2, arg0, local23, local93, this.aClass311_1.anInt8672);
				}
				if (local108) {
					local53 = true;
					break;
				}
			}
		}
		super.aClass114Array3[0] = super.aClass114Array3[1] = super.aClass114Array3[2] = null;
		return local53;
	}

	@OriginalMember(owner = "client!kia", name = "k", descriptor = "(I)I")
	@Override
	public int method8663() {
		return this.aClass311_1 == null ? 0 : this.aClass311_1.anInt8672;
	}

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)I")
	@Override
	public int method7931() {
		if (this.aClass311_1.anIntArray476 != null) {
			@Pc(24) Class311 local24 = this.aClass311_1.method7325(Static413.aClass63_1);
			if (local24 != null && local24.anInt8656 != -1) {
				return local24.anInt8656;
			}
		}
		return this.aClass311_1.anInt8656 == -1 ? super.method7931() : this.aClass311_1.anInt8656;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		if (this.aClass311_1 == null || !this.method4721(2048, arg0)) {
			return null;
		}
		@Pc(19) Class56 local19 = arg0.method6212();
		@Pc(24) int local24 = super.aClass165_7.method3503();
		local19.method8391(local24);
		@Pc(42) Class313 local42 = Static129.aClass313ArrayArrayArray7[super.aByte149][super.anInt10366 >> Static138.anInt2287][super.anInt10367 >> Static138.anInt2287];
		if (local42 == null || local42.aClass41_Sub1_Sub4_1 == null) {
			super.anInt9465 = (int) ((float) super.anInt9465 - (float) super.anInt9465 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt9465 - local42.aClass41_Sub1_Sub4_1.aShort86;
			super.anInt9465 = (int) ((float) super.anInt9465 - (float) local69 / 10.0F);
		}
		local19.method8390(super.anInt10366, -super.anInt9465 + super.anInt10370 - 20, super.anInt10367);
		@Pc(98) Class201 local98 = this.method7933();
		@Pc(116) Class311 local116 = this.aClass311_1.anIntArray476 == null ? this.aClass311_1 : this.aClass311_1.method7325(Static413.aClass63_1);
		super.aBoolean694 = false;
		@Pc(121) Class41_Sub3 local121 = null;
		if (Static655.aClass5_Sub36_29.aClass2_Sub15_1.method6886() == 1 && local116.aBoolean623 && local98.aBoolean314) {
			@Pc(154) Class65 local154 = super.anInt9503 != -1 && super.anInt9463 == 0 ? Static459.aClass128_2.method2686(super.anInt9503) : null;
			@Pc(172) Class65 local172 = super.anInt9484 == -1 || super.aBoolean690 && local154 != null ? null : Static459.aClass128_2.method2686(super.anInt9484);
			@Pc(222) Class114 local222 = Static327.method5091(this.aClass311_1.anInt8641, arg0, local172 == null ? local154 : local172, super.anInt9508, this.aClass311_1.aShort96 & 0xFFFF, this.aClass311_1.aShort95 & 0xFFFF, super.anInt9504, super.anInt9487, this.aClass311_1.aByte110 & 0xFF, this.aClass311_1.aByte109 & 0xFF, local24, local172 == null ? super.anInt9507 : super.anInt9513, super.aClass114Array3[0]);
			if (local222 != null) {
				local121 = Static578.method7877(super.aClass114Array3.length + 1, this.method4719());
				super.aBoolean694 = true;
				arg0.C(false);
				if (Static426.aBoolean555) {
					local222.method8807(local19, local121.aClass41_Sub9Array1[super.aClass114Array3.length], Static663.anInt10391, 0);
				} else {
					local222.method8801(local19, local121.aClass41_Sub9Array1[super.aClass114Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method8391(local24);
		local19.method8390(super.anInt10366, super.anInt10370 - super.anInt9465 - 5, super.anInt10367);
		if (local121 == null) {
			local121 = Static578.method7877(super.aClass114Array3.length, this.method4719());
		}
		this.method7914(super.aClass114Array3, local19, arg0, false);
		@Pc(313) int local313;
		if (Static426.aBoolean555) {
			for (local313 = 0; super.aClass114Array3.length > local313; local313++) {
				if (super.aClass114Array3[local313] != null) {
					super.aClass114Array3[local313].method8807(local19, local121.aClass41_Sub9Array1[local313], Static663.anInt10391, 0);
				}
			}
		} else {
			for (local313 = 0; local313 < super.aClass114Array3.length; local313++) {
				if (super.aClass114Array3[local313] != null) {
					super.aClass114Array3[local313].method8801(local19, local121.aClass41_Sub9Array1[local313], 0);
				}
			}
		}
		if (super.aClass41_Sub7_7 != null) {
			@Pc(381) Class149 local381 = super.aClass41_Sub7_7.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local381, Static663.anInt10391);
			} else {
				arg0.method6215(local381);
			}
		}
		for (local313 = 0; super.aClass114Array3.length > local313; local313++) {
			if (super.aClass114Array3[local313] != null) {
				super.aBoolean694 |= super.aClass114Array3[local313].F();
			}
		}
		super.anInt9514 = Static219.anInt3472;
		super.aClass114Array3[0] = super.aClass114Array3[1] = super.aClass114Array3[2] = null;
		return local121;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIZIII)V")
	public void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte149 = super.aByte150 = (byte) arg4;
		if (Static488.method7149(arg1, arg3)) {
			super.aByte150++;
		}
		if (super.anInt9503 != -1 && Static459.aClass128_2.method2686(super.anInt9503).anInt1422 == 1) {
			super.anIntArray521 = null;
			super.anInt9503 = -1;
		}
		for (@Pc(45) int local45 = 0; local45 < super.aClass329Array3.length; local45++) {
			if (super.aClass329Array3[local45].anInt9066 != -1) {
				@Pc(63) Class385 local63 = Static312.aClass179_1.method3798(super.aClass329Array3[local45].anInt9066);
				if (local63.aBoolean742 && local63.anInt10218 != -1 && Static459.aClass128_2.method2686(local63.anInt10218).anInt1422 == 1) {
					super.aClass329Array3[local45].anInt9066 = -1;
				}
			}
		}
		if (!arg2) {
			@Pc(104) int local104 = arg1 - super.anIntArray528[0];
			@Pc(111) int local111 = arg3 - super.anIntArray527[0];
			if (local104 >= -8 && local104 <= 8 && local111 >= -8 && local111 <= 8) {
				if (super.anInt9526 < 9) {
					super.anInt9526++;
				}
				for (@Pc(144) int local144 = super.anInt9526; local144 > 0; local144--) {
					super.anIntArray528[local144] = super.anIntArray528[local144 - 1];
					super.anIntArray527[local144] = super.anIntArray527[local144 - 1];
					super.aByteArray90[local144] = super.aByteArray90[local144 - 1];
				}
				super.anIntArray528[0] = arg1;
				super.anIntArray527[0] = arg3;
				super.aByteArray90[0] = 1;
				return;
			}
		}
		super.anIntArray528[0] = arg1;
		super.anInt9523 = 0;
		super.anInt9525 = 0;
		super.anInt9526 = 0;
		super.anIntArray527[0] = arg3;
		super.anInt10366 = (super.anIntArray528[0] << 9) + (arg0 << 8);
		super.anInt10367 = (arg0 << 8) + (super.anIntArray527[0] << 9);
		if (super.aClass41_Sub7_7 != null) {
			super.aClass41_Sub7_7.method7077();
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		if (this.aClass311_1 == null || !super.aBoolean693 && !this.method4721(0, arg0)) {
			return;
		}
		@Pc(20) Class56 local20 = arg0.method6212();
		local20.method8391(super.aClass165_7.method3503());
		local20.method8390(super.anInt10366, super.anInt10370 - 20, super.anInt10367);
		this.method7914(super.aClass114Array3, local20, arg0, super.aBoolean693);
		super.aClass114Array3[0] = super.aClass114Array3[1] = super.aClass114Array3[2] = null;
	}

	@OriginalMember(owner = "client!kia", name = "f", descriptor = "(B)I")
	@Override
	protected int method7932() {
		if (this.aClass311_1.anIntArray476 != null) {
			@Pc(13) Class311 local13 = this.aClass311_1.method7325(Static413.aClass63_1);
			if (local13 != null && local13.anInt8671 != -1) {
				return local13.anInt8671;
			}
		}
		return this.aClass311_1.anInt8671;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)I")
	@Override
	public int method7913() {
		if (this.aClass311_1.anIntArray476 != null) {
			@Pc(18) Class311 local18 = this.aClass311_1.method7325(Static413.aClass63_1);
			if (local18 != null && local18.anInt8681 != -1) {
				return local18.anInt8681;
			}
		}
		return this.aClass311_1.anInt8681;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)V")
	public void method4715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = super.anIntArray528[0];
		@Pc(13) int local13 = super.anIntArray527[0];
		if (arg1 == 0) {
			local13++;
		}
		if (arg1 == 1) {
			local13++;
			local8++;
		}
		if (arg1 == 2) {
			local8++;
		}
		if (arg1 == 3) {
			local8++;
			local13--;
		}
		if (arg1 == 4) {
			local13--;
		}
		if (arg1 == 5) {
			local8--;
			local13--;
		}
		if (arg1 == 6) {
			local8--;
		}
		if (arg1 == 7) {
			local13++;
			local8--;
		}
		if (super.anInt9503 != -1 && Static459.aClass128_2.method2686(super.anInt9503).anInt1422 == 1) {
			super.anInt9503 = -1;
			super.anIntArray521 = null;
		}
		for (@Pc(86) int local86 = 0; super.aClass329Array3.length > local86; local86++) {
			if (super.aClass329Array3[local86].anInt9066 != -1) {
				@Pc(104) Class385 local104 = Static312.aClass179_1.method3798(super.aClass329Array3[local86].anInt9066);
				if (local104.aBoolean742 && local104.anInt10218 != -1 && Static459.aClass128_2.method2686(local104.anInt10218).anInt1422 == 1) {
					super.aClass329Array3[local86].anInt9066 = -1;
				}
			}
		}
		if (super.anInt9526 < 9) {
			super.anInt9526++;
		}
		for (@Pc(148) int local148 = super.anInt9526; local148 > 0; local148--) {
			super.anIntArray528[local148] = super.anIntArray528[local148 - 1];
			super.anIntArray527[local148] = super.anIntArray527[local148 - 1];
			super.aByteArray90[local148] = super.aByteArray90[local148 - 1];
		}
		super.anIntArray528[0] = local8;
		super.anIntArray527[0] = local13;
		super.aByteArray90[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!rn;B)V")
	public void method4716(@OriginalArg(0) Class311 arg0) {
		this.aClass311_1 = arg0;
		if (this.aClass311_1 != null) {
			this.anInt5483 = this.aClass311_1.anInt8679;
			this.aString45 = this.aClass311_1.aString92;
		}
		if (super.aClass41_Sub7_7 != null) {
			super.aClass41_Sub7_7.method7077();
		}
	}

	@OriginalMember(owner = "client!kia", name = "o", descriptor = "(I)Z")
	public boolean method4718() {
		return this.aClass311_1 != null;
	}

	@OriginalMember(owner = "client!kia", name = "p", descriptor = "(I)Z")
	private boolean method4719() {
		return this.aClass311_1.aBoolean624;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kia", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZILclient!ha;)Z")
	private boolean method4721(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class201 local9 = this.method7933();
		@Pc(24) Class65 local24 = super.anInt9503 != -1 && super.anInt9463 == 0 ? Static459.aClass128_2.method2686(super.anInt9503) : null;
		@Pc(42) Class65 local42 = super.anInt9484 == -1 || super.aBoolean690 && local24 != null ? null : Static459.aClass128_2.method2686(super.anInt9484);
		@Pc(45) int local45 = local9.anInt4788;
		@Pc(48) int local48 = local9.anInt4783;
		if (local45 != 0 || local48 != 0 || local9.anInt4747 != 0 || local9.anInt4773 != 0) {
			arg0 |= 0x7;
		}
		@Pc(93) boolean local93 = super.aByte128 != 0 && Static421.anInt7434 >= super.anInt9472 && Static421.anInt7434 < super.anInt9478;
		if (local93) {
			arg0 |= 0x80000;
		}
		@Pc(110) int local110 = super.aClass165_7.method3503();
		@Pc(146) Class114 local146 = super.aClass114Array3[0] = this.aClass311_1.method7330(super.aClass127Array3, super.anInt9480, super.anIntArray520, local24, super.anInt9459, super.anInt9507, local42, super.anInt9512, this.aClass316_1, Static413.aClass63_1, local110, super.anInt9461, Static459.aClass128_2, arg0, super.anInt9513, Static233.aClass172_1, arg1);
		if (local146 == null) {
			return false;
		}
		super.anInt9496 = local146.fa();
		super.anInt9485 = local146.ma();
		this.method7918(local146);
		if (local45 == 0 && local48 == 0) {
			this.method7919(this.method7917() << 9, 0, local110, this.method7917() << 9, 0);
		} else {
			this.method7919(local48, local9.anInt4758, local110, local45, local9.anInt4775);
			if (super.anInt9504 != 0) {
				super.aClass114Array3[0].FA(super.anInt9504);
			}
			if (super.anInt9487 != 0) {
				super.aClass114Array3[0].VA(super.anInt9487);
			}
			if (super.anInt9508 != 0) {
				super.aClass114Array3[0].H(0, super.anInt9508, 0);
			}
		}
		if (local93) {
			local146.method8800(super.aByte132, super.aByte130, super.aByte129, super.aByte128 & 0xFF);
		}
		this.method7912(local110, local45, local5, local48, arg1, local9);
		return true;
	}
}
