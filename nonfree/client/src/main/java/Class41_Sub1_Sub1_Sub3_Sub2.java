import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class41_Sub1_Sub1_Sub3_Sub2 extends Class41_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!ts", name = "Vc", descriptor = "Lclient!mw;")
	public Class239 aClass239_1;

	@OriginalMember(owner = "client!ts", name = "nd", descriptor = "I")
	public int anInt9539;

	@OriginalMember(owner = "client!ts", name = "rd", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!ts", name = "ud", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!ts", name = "Bd", descriptor = "I")
	public int anInt9549;

	@OriginalMember(owner = "client!ts", name = "Pd", descriptor = "I")
	private int anInt9562;

	@OriginalMember(owner = "client!ts", name = "od", descriptor = "I")
	public int anInt9540 = 0;

	@OriginalMember(owner = "client!ts", name = "id", descriptor = "B")
	private byte aByte134 = 0;

	@OriginalMember(owner = "client!ts", name = "bd", descriptor = "I")
	public int anInt9533 = 255;

	@OriginalMember(owner = "client!ts", name = "md", descriptor = "Z")
	public boolean aBoolean698 = false;

	@OriginalMember(owner = "client!ts", name = "xd", descriptor = "B")
	private byte aByte135 = 0;

	@OriginalMember(owner = "client!ts", name = "hd", descriptor = "Z")
	public boolean aBoolean696 = false;

	@OriginalMember(owner = "client!ts", name = "dd", descriptor = "I")
	public int anInt9535 = -1;

	@OriginalMember(owner = "client!ts", name = "Fd", descriptor = "Z")
	public boolean aBoolean700 = false;

	@OriginalMember(owner = "client!ts", name = "gd", descriptor = "B")
	private byte aByte133 = 0;

	@OriginalMember(owner = "client!ts", name = "wd", descriptor = "I")
	public int anInt9545 = -1;

	@OriginalMember(owner = "client!ts", name = "td", descriptor = "Z")
	public boolean aBoolean699 = false;

	@OriginalMember(owner = "client!ts", name = "Ad", descriptor = "I")
	public int anInt9548 = -1;

	@OriginalMember(owner = "client!ts", name = "Ed", descriptor = "I")
	public int anInt9552 = -1;

	@OriginalMember(owner = "client!ts", name = "Kd", descriptor = "I")
	public int anInt9557 = -1;

	@OriginalMember(owner = "client!ts", name = "zd", descriptor = "I")
	public int anInt9547 = -1;

	@OriginalMember(owner = "client!ts", name = "kd", descriptor = "Z")
	public boolean aBoolean697 = false;

	@OriginalMember(owner = "client!ts", name = "Ld", descriptor = "I")
	public int anInt9558 = 0;

	@OriginalMember(owner = "client!ts", name = "Hd", descriptor = "I")
	public int anInt9554 = 0;

	@OriginalMember(owner = "client!ts", name = "fd", descriptor = "Z")
	public boolean aBoolean695 = false;

	@OriginalMember(owner = "client!ts", name = "ad", descriptor = "I")
	public int anInt9532 = -1;

	@OriginalMember(owner = "client!ts", name = "yd", descriptor = "I")
	public int anInt9546 = 0;

	@OriginalMember(owner = "client!ts", name = "Gd", descriptor = "I")
	public int anInt9553 = -1;

	@OriginalMember(owner = "client!ts", name = "Nd", descriptor = "I")
	public int anInt9560 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method7935() {
		@Pc(5) String local5 = "";
		if (Static464.aStringArray30 != null) {
			local5 = local5 + Static464.aStringArray30[this.aByte135];
		}
		@Pc(29) int[] local29;
		if (this.aByte133 == 1 && Static179.anIntArray169 != null) {
			local29 = Static179.anIntArray169;
		} else {
			local29 = Static273.anIntArray254;
		}
		if (local29 != null && local29[this.aByte135] != -1) {
			@Pc(48) Class82 local48 = Static429.aClass309_1.method7317(local29[this.aByte135]);
			if (local48.aChar3 == 's') {
				local5 = local5 + local48.method1801(this.aByte134 & 0xFF);
			} else {
				Static17.method268("gdn1", new Throwable());
				local29[this.aByte135] = -1;
			}
		}
		local5 = local5 + this.aString101;
		if (Static568.aStringArray37 != null) {
			local5 = local5 + Static568.aStringArray37[this.aByte135];
		}
		return local5;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method7936() {
		return this.aString100;
	}

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "(I)Z")
	public boolean method7937() {
		return this.aClass239_1 != null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass239_1 == null || !this.method7940(131072, arg1)) {
			return false;
		}
		@Pc(19) Class56 local19 = arg1.method6212();
		@Pc(24) int local24 = super.aClass165_7.method3503();
		local19.method8391(local24);
		local19.method8390(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass114Array3.length > local39; local39++) {
			if (super.aClass114Array3[local39] != null && (Static426.aBoolean555 ? super.aClass114Array3[local39].method8798(arg2, arg0, local19, true, 0, Static663.anInt10391) : super.aClass114Array3[local39].method8795(arg2, arg0, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass114Array3[0] = super.aClass114Array3[1] = super.aClass114Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(B)I")
	@Override
	protected int method7932() {
		return this.anInt9562;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBII)V")
	public void method7938(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt9526 < 9) {
			super.anInt9526++;
		}
		for (@Pc(22) int local22 = super.anInt9526; local22 > 0; local22--) {
			super.anIntArray528[local22] = super.anIntArray528[local22 - 1];
			super.anIntArray527[local22] = super.anIntArray527[local22 - 1];
			super.aByteArray90[local22] = super.aByteArray90[local22 - 1];
		}
		super.anIntArray528[0] = arg2;
		super.anIntArray527[0] = arg0;
		super.aByteArray90[0] = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		if (this.aClass239_1 == null || !super.aBoolean693 && !this.method7940(0, arg0)) {
			return;
		}
		@Pc(28) Class56 local28 = arg0.method6212();
		local28.method8391(super.aClass165_7.method3503());
		local28.method8390(super.anInt10366, super.anInt10370 - 5, super.anInt10367);
		this.method7914(super.aClass114Array3, local28, arg0, super.aBoolean693);
		for (@Pc(55) int local55 = 0; local55 < super.aClass114Array3.length; local55++) {
			super.aClass114Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIB)V")
	public void method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt9503 != -1 && Static459.aClass128_2.method2686(super.anInt9503).anInt1422 == 1) {
			super.anInt9503 = -1;
			super.anIntArray521 = null;
		}
		for (@Pc(23) int local23 = 0; local23 < super.aClass329Array3.length; local23++) {
			if (super.aClass329Array3[local23].anInt9066 != -1) {
				@Pc(41) Class385 local41 = Static312.aClass179_1.method3798(super.aClass329Array3[local23].anInt9066);
				if (local41.aBoolean742 && local41.anInt10218 != -1 && Static459.aClass128_2.method2686(local41.anInt10218).anInt1422 == 1) {
					super.aClass329Array3[local23].anInt9066 = -1;
				}
			}
		}
		this.anInt9545 = -1;
		if (arg1 < 0 || arg1 >= Static124.anInt2150 || arg0 < 0 || arg0 >= Static64.anInt1015) {
			this.method7942(arg1, arg0);
		} else if (super.anIntArray528[0] >= 0 && Static124.anInt2150 > super.anIntArray528[0] && super.anIntArray527[0] >= 0 && Static64.anInt1015 > super.anIntArray527[0]) {
			if (arg2 == 2) {
				Static317.method4823(arg0, arg1, this);
			}
			this.method7938(arg0, arg2, arg1);
		} else {
			this.method7942(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)I")
	@Override
	public int method7917() {
		return this.aClass239_1 == null || this.aClass239_1.anInt6621 == -1 ? super.method7917() : Static58.aClass230_1.method5297(this.aClass239_1.anInt6621).anInt8641;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!ha;I)Z")
	private boolean method7940(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(11) Class201 local11 = this.method7933();
		@Pc(29) Class65 local29 = super.anInt9503 != -1 && super.anInt9463 == 0 ? Static459.aClass128_2.method2686(super.anInt9503) : null;
		@Pc(49) Class65 local49 = super.anInt9484 == -1 || this.aBoolean700 || super.aBoolean690 && local29 != null ? null : Static459.aClass128_2.method2686(super.anInt9484);
		@Pc(52) int local52 = local11.anInt4788;
		@Pc(55) int local55 = local11.anInt4783;
		if (local52 != 0 || local55 != 0 || local11.anInt4747 != 0 || local11.anInt4773 != 0) {
			arg0 |= 0x7;
		}
		@Pc(80) int local80 = super.aClass165_7.method3503();
		@Pc(102) boolean local102 = super.aByte128 != 0 && super.anInt9472 <= Static421.anInt7434 && super.anInt9478 > Static421.anInt7434;
		if (local102) {
			arg0 |= 0x80000;
		}
		@Pc(146) Class114 local146 = super.aClass114Array3[0] = this.aClass239_1.method5580(super.anInt9480, super.anIntArray520, local49, super.anInt9513, Static670.aClass83_2, Static459.aClass128_2, local29, super.anInt9512, arg0, Static58.aClass230_1, Static259.aClass135_1, local80, Static233.aClass172_1, Static413.aClass63_1, arg1, super.anInt9507, super.anInt9461, super.anInt9459, super.aClass127Array3);
		@Pc(149) int local149 = Static399.method5870();
		if (Static126.anInt2180 < 96 && local149 > 50) {
			Static379.method5102();
		}
		if (Static71.aClass267_2 != Static99.aClass267_3 && local149 < 50) {
			@Pc(173) int local173 = 50 - local149;
			while (Static465.anInt8115 < local173) {
				Static185.aByteArrayArray9[Static465.anInt8115] = new byte[102400];
				Static465.anInt8115++;
			}
			while (Static465.anInt8115 > local173) {
				Static465.anInt8115--;
				Static185.aByteArrayArray9[Static465.anInt8115] = null;
			}
		} else if (Static99.aClass267_3 != Static71.aClass267_2) {
			Static185.aByteArrayArray9 = new byte[50][];
			Static465.anInt8115 = 0;
		}
		if (local146 == null) {
			return false;
		}
		super.anInt9496 = local146.fa();
		super.anInt9485 = local146.ma();
		this.method7918(local146);
		if (local52 == 0 && local55 == 0) {
			this.method7919(this.method7917() << 9, 0, local80, this.method7917() << 9, 0);
		} else {
			this.method7919(local55, local11.anInt4758, local80, local52, local11.anInt4775);
			if (super.anInt9504 != 0) {
				local146.FA(super.anInt9504);
			}
			if (super.anInt9487 != 0) {
				local146.VA(super.anInt9487);
			}
			if (super.anInt9508 != 0) {
				local146.H(0, super.anInt9508, 0);
			}
		}
		if (local102) {
			local146.method8800(super.aByte132, super.aByte130, super.aByte129, super.aByte128 & 0xFF);
		}
		if (!this.aBoolean700) {
			this.method7912(local80, local52, local5, local55, arg1, local11);
		}
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!ka;Lclient!ha;IIIILclient!eh;)V")
	private void method7941(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class56 arg6) {
		@Pc(16) int local16 = arg5 * arg5 + arg0 * arg0;
		if (local16 < 262144 || local16 > arg4) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg5, (double) arg0) * 2607.5945876176133D - (double) super.aClass165_7.method3503()) & 0x3FFF;
		@Pc(52) Class114 local52 = Static85.method1308(arg3, super.anInt9508, local40, super.anInt9487, arg2, super.anInt9504);
		if (local52 != null) {
			arg2.C(false);
			local52.method8801(arg6, (Class41_Sub9) null, 0);
			arg2.C(true);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	public int method7913() {
		return -1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		if (this.aClass239_1 == null || !this.method7940(2048, arg0)) {
			return null;
		}
		@Pc(25) Class56 local25 = arg0.method6212();
		@Pc(30) int local30 = super.aClass165_7.method3503();
		local25.method8391(local30);
		@Pc(48) Class313 local48 = Static129.aClass313ArrayArrayArray7[super.aByte149][super.anInt10366 >> Static138.anInt2287][super.anInt10367 >> Static138.anInt2287];
		if (local48 == null || local48.aClass41_Sub1_Sub4_1 == null) {
			super.anInt9465 = (int) ((float) super.anInt9465 - (float) super.anInt9465 / 10.0F);
		} else {
			@Pc(61) int local61 = super.anInt9465 - local48.aClass41_Sub1_Sub4_1.aShort86;
			super.anInt9465 = (int) ((float) super.anInt9465 - (float) local61 / 10.0F);
		}
		local25.method8390(super.anInt10366, super.anInt10370 - super.anInt9465 - 20, super.anInt10367);
		@Pc(101) Class41_Sub3 local101 = null;
		super.aBoolean694 = false;
		if (Static655.aClass5_Sub36_29.aClass2_Sub15_1.method6886() == 1) {
			@Pc(114) Class201 local114 = this.method7933();
			if (local114.aBoolean314 && (this.aClass239_1.anInt6621 == -1 || Static58.aClass230_1.method5297(this.aClass239_1.anInt6621).aBoolean623)) {
				@Pc(150) Class65 local150 = super.anInt9503 != -1 && super.anInt9463 == 0 ? Static459.aClass128_2.method2686(super.anInt9503) : null;
				@Pc(170) Class65 local170 = super.anInt9484 == -1 || this.aBoolean700 || super.aBoolean690 && local150 != null ? null : Static459.aClass128_2.method2686(super.anInt9484);
				@Pc(204) Class114 local204 = Static327.method5091(1, arg0, local170 == null ? local150 : local170, super.anInt9508, 0, 0, super.anInt9504, super.anInt9487, 240, 160, local30, local170 == null ? super.anInt9507 : super.anInt9513, super.aClass114Array3[0]);
				if (local204 != null) {
					local101 = Static578.method7877(super.aClass114Array3.length + 1, true);
					super.aBoolean694 = true;
					arg0.C(false);
					if (Static426.aBoolean555) {
						local204.method8807(local25, local101.aClass41_Sub9Array1[super.aClass114Array3.length], Static663.anInt10391, 0);
					} else {
						local204.method8801(local25, local101.aClass41_Sub9Array1[super.aClass114Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(256) int local256;
		if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == this) {
			for (local256 = Static217.aClass358Array1.length - 1; local256 >= 0; local256--) {
				@Pc(261) Class358 local261 = Static217.aClass358Array1[local256];
				if (local261 != null && local261.anInt9739 != -1) {
					@Pc(293) int local293;
					if (local261.anInt9736 == 1) {
						@Pc(281) Class5_Sub34 local281 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local261.anInt9743);
						if (local281 != null) {
							@Pc(286) Class41_Sub1_Sub1_Sub3_Sub1 local286 = local281.aClass41_Sub1_Sub1_Sub3_Sub1_1;
							local293 = local286.anInt10366 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366;
							@Pc(299) int local299 = local286.anInt10367 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
							if (Static426.aBoolean555) {
								this.method7943(super.aClass114Array3[0], local299, 92160000, local261.anInt9739, local25, Static663.anInt10391, local293, arg0);
							} else {
								this.method7941(local299, super.aClass114Array3[0], arg0, local261.anInt9739, 92160000, local293, local25);
							}
						}
					}
					@Pc(351) int local351;
					if (local261.anInt9736 == 2) {
						@Pc(344) int local344 = local261.anInt9737 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366;
						local351 = local261.anInt9742 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
						local293 = local261.anInt9744 << 9;
						local293 *= local293;
						if (Static426.aBoolean555) {
							this.method7943(super.aClass114Array3[0], local351, local293, local261.anInt9739, local25, Static663.anInt10391, local344, arg0);
						} else {
							this.method7941(local351, super.aClass114Array3[0], arg0, local261.anInt9739, local293, local344, local25);
						}
					}
					if (local261.anInt9736 == 10 && local261.anInt9743 >= 0 && Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2.length > local261.anInt9743) {
						@Pc(415) Class41_Sub1_Sub1_Sub3_Sub2 local415 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local261.anInt9743];
						if (local415 != null) {
							local351 = local415.anInt10366 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366;
							local293 = local415.anInt10367 - Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
							if (Static426.aBoolean555) {
								this.method7943(super.aClass114Array3[0], local293, 92160000, local261.anInt9739, local25, Static663.anInt10391, local351, arg0);
							} else {
								this.method7941(local293, super.aClass114Array3[0], arg0, local261.anInt9739, 92160000, local351, local25);
							}
						}
					}
				}
			}
			local25.method8391(local30);
			local25.method8390(super.anInt10366, super.anInt10370, super.anInt10367);
		}
		local25.method8391(local30);
		local25.method8390(super.anInt10366, -super.anInt9465 + super.anInt10370 - 5, super.anInt10367);
		if (local101 == null) {
			local101 = Static578.method7877(super.aClass114Array3.length, true);
		}
		this.method7914(super.aClass114Array3, local25, arg0, false);
		if (Static426.aBoolean555) {
			for (local256 = 0; local256 < super.aClass114Array3.length; local256++) {
				if (super.aClass114Array3[local256] != null) {
					super.aClass114Array3[local256].method8807(local25, local101.aClass41_Sub9Array1[local256], Static663.anInt10391, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local256 = 0; super.aClass114Array3.length > local256; local256++) {
				if (super.aClass114Array3[local256] != null) {
					super.aClass114Array3[local256].method8801(local25, local101.aClass41_Sub9Array1[local256], Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass41_Sub7_7 != null) {
			@Pc(589) Class149 local589 = super.aClass41_Sub7_7.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local589, Static663.anInt10391);
			} else {
				arg0.method6215(local589);
			}
		}
		for (local256 = 0; super.aClass114Array3.length > local256; local256++) {
			if (super.aClass114Array3[local256] != null) {
				super.aBoolean694 |= super.aClass114Array3[local256].F();
			}
			super.aClass114Array3[local256] = null;
		}
		super.anInt9514 = Static219.anInt3472;
		return local101;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
	public void method7942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray528[0] = arg0;
		super.anInt9526 = 0;
		super.anInt9525 = 0;
		super.anInt9523 = 0;
		super.anIntArray527[0] = arg1;
		@Pc(26) int local26 = this.method7917();
		super.anInt10366 = local26 * 256 + super.anIntArray528[0] * 512;
		super.anInt10367 = super.anIntArray527[0] * 512 + local26 * 256;
		if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == this) {
			Static3.method39();
		}
		if (super.aClass41_Sub7_7 != null) {
			super.aClass41_Sub7_7.method7077();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ka;IIIILclient!eh;IILclient!ha;)V")
	private void method7943(@OriginalArg(0) Class114 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class56 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class143 arg7) {
		@Pc(11) int local11 = arg1 * arg1 + arg6 * arg6;
		if (local11 < 262144 || arg2 < local11) {
			return;
		}
		@Pc(54) int local54 = (int) (Math.atan2((double) arg6, (double) arg1) * 2607.5945876176133D - (double) super.aClass165_7.method3503()) & 0x3FFF;
		@Pc(66) Class114 local66 = Static85.method1308(arg3, super.anInt9508, local54, super.anInt9487, arg7, super.anInt9504);
		if (local66 != null) {
			arg7.C(false);
			local66.method8807(arg4, (Class41_Sub9) null, arg5, 0);
			arg7.C(true);
		}
	}

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLclient!rv;)V")
	public void method7944(@OriginalArg(1) Class5_Sub15 arg0) {
		arg0.anInt4144 = 0;
		@Pc(10) int local10 = arg0.method3642();
		this.aByte133 = (byte) (local10 & 0x1);
		@Pc(19) boolean local19 = this.aBoolean699;
		this.aBoolean699 = (local10 & 0x2) != 0;
		@Pc(39) boolean local39 = (local10 & 0x4) != 0;
		@Pc(43) int local43 = super.method7917();
		this.method7928((local10 >> 3 & 0x7) + 1);
		this.aByte135 = (byte) (local10 >> 6 & 0x3);
		super.anInt10366 += this.method7917() - local43 << 8;
		super.anInt10367 += this.method7917() - local43 << 8;
		this.aByte134 = arg0.method3677();
		this.anInt9552 = arg0.method3677();
		this.anInt9535 = arg0.method3677();
		this.aBoolean696 = arg0.method3677() == 1;
		if (Static99.aClass267_3 == Static71.aClass267_2 && Static281.anInt4403 >= 2) {
			this.aBoolean696 = false;
		}
		this.anInt9540 = 0;
		@Pc(128) int local128 = -1;
		@Pc(133) int[] local133 = new int[Static18.aClass145_1.anIntArray187.length];
		@Pc(138) Class9[] local138 = new Class9[Static18.aClass145_1.anIntArray187.length];
		@Pc(143) Class219[] local143 = new Class219[Static18.aClass145_1.anIntArray187.length];
		@Pc(156) int local156;
		@Pc(167) int local167;
		@Pc(173) int local173;
		@Pc(217) int local217;
		for (@Pc(145) int local145 = 0; local145 < Static18.aClass145_1.anIntArray187.length; local145++) {
			if (Static18.aClass145_1.anIntArray187[local145] != 1) {
				local156 = arg0.method3642();
				if (local156 == 0) {
					local133[local145] = 0;
				} else {
					local167 = arg0.method3642();
					local173 = (local156 << 8) + local167;
					if (local145 == 0 && local173 == 65535) {
						local128 = arg0.method3698();
						this.anInt9540 = arg0.method3642();
						break;
					}
					if (local173 >= 32768) {
						local173 = Static387.anIntArray379[local173 - 32768];
						local133[local145] = local173 | 0x40000000;
						local143[local145] = Static259.aClass135_1.method2776(local173);
						local217 = local143[local145].anInt6125;
						if (local217 != 0) {
							this.anInt9540 = local217;
						}
					} else {
						local133[local145] = local173 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local128 == -1) {
			local156 = arg0.method3698();
			local167 = 0;
			for (local173 = 0; local173 < Static18.aClass145_1.anIntArray187.length; local173++) {
				if (Static18.aClass145_1.anIntArray187[local173] == 0) {
					if ((local156 & 0x1 << local167) != 0) {
						local138[local173] = Static396.method5852(local143[local173], arg0);
					}
					local167++;
				}
			}
		}
		@Pc(290) int[] local290 = new int[5];
		for (local167 = 0; local167 < 5; local167++) {
			local173 = arg0.method3642();
			if (Static469.aShortArrayArrayArray4.length < 1 || local173 < 0 || local173 >= Static469.aShortArrayArrayArray4[0][local167].length) {
				local173 = 0;
			}
			local290[local167] = local173;
		}
		this.anInt9562 = arg0.method3698();
		this.aString101 = arg0.method3661();
		this.aString100 = this.aString101;
		if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == this) {
			Static126.aString19 = this.aString101;
		}
		this.anInt9558 = arg0.method3642();
		if (local39) {
			this.anInt9554 = arg0.method3698();
			this.anInt9546 = this.anInt9558;
			this.anInt9553 = -1;
			if (this.anInt9554 == 65535) {
				this.anInt9554 = -1;
			}
		} else {
			this.anInt9554 = 0;
			this.anInt9546 = arg0.method3642();
			this.anInt9553 = arg0.method3642();
			if (this.anInt9553 == 255) {
				this.anInt9553 = -1;
			}
		}
		local173 = this.anInt9560;
		this.anInt9560 = arg0.method3642();
		@Pc(418) int local418;
		if (this.anInt9560 == 0) {
			Static574.method7842(this);
		} else {
			local217 = this.anInt9547;
			@Pc(415) int local415 = this.anInt9557;
			local418 = this.anInt9532;
			@Pc(421) int local421 = this.anInt9548;
			@Pc(424) int local424 = this.anInt9533;
			this.anInt9547 = arg0.method3698();
			this.anInt9557 = arg0.method3698();
			this.anInt9532 = arg0.method3698();
			this.anInt9548 = arg0.method3698();
			this.anInt9533 = arg0.method3642();
			if (this.aBoolean699 != local19 || this.anInt9560 != local173 || local217 != this.anInt9547 || this.anInt9557 != local415 || this.anInt9532 != local418 || this.anInt9548 != local421 || this.anInt9533 != local424) {
				Static598.method8096(this);
			}
		}
		if (this.aClass239_1 == null) {
			this.aClass239_1 = new Class239();
		}
		local217 = this.aClass239_1.anInt6621;
		@Pc(528) int[] local528 = this.aClass239_1.anIntArray374;
		this.aClass239_1.method5579(local290, this.aByte133 == 1, local128, this.method7932(), local133, local138);
		if (local128 != local217) {
			super.anInt10366 = (super.anIntArray528[0] << 9) + (this.method7917() << 8);
			super.anInt10367 = (super.anIntArray527[0] << 9) + (this.method7917() << 8);
		}
		if (super.anInt9469 == Static177.anInt2910 && local528 != null) {
			for (local418 = 0; local418 < local290.length; local418++) {
				if (local290[local418] != local528[local418]) {
					Static259.aClass135_1.method2781();
					break;
				}
			}
		}
		if (super.aClass41_Sub7_7 != null) {
			super.aClass41_Sub7_7.method7077();
		}
		if (super.anInt9484 == -1 || !super.aBoolean690) {
			return;
		}
		@Pc(635) Class201 local635 = this.method7933();
		if (!local635.method4158(super.anInt9484)) {
			super.aBoolean690 = false;
			super.anInt9484 = -1;
			return;
		}
	}
}
