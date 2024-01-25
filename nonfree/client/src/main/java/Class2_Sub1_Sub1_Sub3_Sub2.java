import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class2_Sub1_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!kf", name = "jd", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!kf", name = "md", descriptor = "Lclient!ne;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!kf", name = "qd", descriptor = "Lclient!em;")
	public Class91 aClass91_1;

	@OriginalMember(owner = "client!kf", name = "sd", descriptor = "I")
	public int anInt5137;

	@OriginalMember(owner = "client!kf", name = "gd", descriptor = "I")
	public int anInt5128 = 1;

	@OriginalMember(owner = "client!kf", name = "rd", descriptor = "I")
	public int anInt5136 = -1;

	@OriginalMember(owner = "client!kf", name = "yd", descriptor = "I")
	public int anInt5143 = 1;

	@OriginalMember(owner = "client!kf", name = "ed", descriptor = "I")
	public int anInt5126 = -1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	@Override
	public int method4324() {
		if (this.aClass91_1.anIntArray140 != null) {
			@Pc(18) Class91 local18 = this.aClass91_1.method2036(Static659.aClass363_3);
			if (local18 != null && local18.anInt2359 != -1) {
				return local18.anInt2359;
			}
		}
		return this.aClass91_1.anInt2359 == -1 ? super.method4324() : this.aClass91_1.anInt2359;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		if (this.aClass91_1 == null || !this.method4344(2048, arg0)) {
			return null;
		}
		@Pc(31) Class207 local31 = arg0.method7456();
		@Pc(36) int local36 = super.lb.method8507();
		local31.method8200(local36);
		@Pc(54) Class351 local54 = Static441.aClass351ArrayArrayArray1[super.aByte140][super.anInt10006 >> Static185.anInt3178][super.anInt10001 >> Static185.anInt3178];
		if (local54 == null || local54.aClass2_Sub1_Sub3_1 == null) {
			super.anInt5058 = (int) ((float) super.anInt5058 - (float) super.anInt5058 / 10.0F);
		} else {
			@Pc(81) int local81 = super.anInt5058 - local54.aClass2_Sub1_Sub3_1.aShort61;
			super.anInt5058 = (int) ((float) super.anInt5058 - (float) local81 / 10.0F);
		}
		local31.method8209(super.anInt10006, -super.anInt5058 + super.anInt10004 - 20, super.anInt10001);
		@Pc(110) Class389 local110 = this.method4317();
		@Pc(123) Class91 local123 = this.aClass91_1.anIntArray140 == null ? this.aClass91_1 : this.aClass91_1.method2036(Static659.aClass363_3);
		super.aBoolean332 = false;
		@Pc(128) Class2_Sub9 local128 = null;
		if (Static96.aClass6_Sub22_7.aClass29_Sub28_1.method8981() == 1 && local123.aBoolean143 && local110.aBoolean738) {
			@Pc(157) Class119 local157 = super.anInt5077 != -1 && super.anInt5065 == 0 ? Static334.aClass268_2.method6469(super.anInt5077) : null;
			@Pc(175) Class119 local175 = super.anInt5112 == -1 || super.aBoolean331 && local157 != null ? null : Static334.aClass268_2.method6469(super.anInt5112);
			@Pc(225) Class184 local225 = Static388.method5541(this.aClass91_1.aShort31 & 0xFFFF, super.anInt5099, local175 == null ? super.anInt5115 : super.anInt5067, arg0, this.aClass91_1.aShort32 & 0xFFFF, super.anInt5072, this.aClass91_1.anInt2346, this.aClass91_1.aByte42 & 0xFF, this.aClass91_1.aByte36 & 0xFF, super.anInt5118, super.aClass184Array3[0], local36, local175 == null ? local157 : local175);
			if (local225 != null) {
				local128 = Static49.method971(super.aClass184Array3.length + 1, this.method4337());
				super.aBoolean332 = true;
				arg0.C(false);
				if (Static487.aBoolean565) {
					local225.method8658(local31, local128.aClass2_Sub5Array1[super.aClass184Array3.length], Static472.anInt8136, 0);
				} else {
					local225.method8662(local31, local128.aClass2_Sub5Array1[super.aClass184Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local31.method8200(local36);
		local31.method8209(super.anInt10006, -super.anInt5058 + super.anInt10004 - 5, super.anInt10001);
		if (local128 == null) {
			local128 = Static49.method971(super.aClass184Array3.length, this.method4337());
		}
		this.method4321(local31, false, super.aClass184Array3, arg0);
		@Pc(312) int local312;
		if (Static487.aBoolean565) {
			for (local312 = 0; local312 < super.aClass184Array3.length; local312++) {
				if (super.aClass184Array3[local312] != null) {
					super.aClass184Array3[local312].method8658(local31, local128.aClass2_Sub5Array1[local312], Static472.anInt8136, 0);
				}
			}
		} else {
			for (local312 = 0; local312 < super.aClass184Array3.length; local312++) {
				if (super.aClass184Array3[local312] != null) {
					super.aClass184Array3[local312].method8662(local31, local128.aClass2_Sub5Array1[local312], 0);
				}
			}
		}
		if (super.aClass2_Sub8_5 != null) {
			@Pc(376) Class137 local376 = super.aClass2_Sub8_5.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local376, Static472.anInt8136);
			} else {
				arg0.method7455(local376);
			}
		}
		for (local312 = 0; local312 < super.aClass184Array3.length; local312++) {
			if (super.aClass184Array3[local312] != null) {
				super.aBoolean332 |= super.aClass184Array3[local312].F();
			}
		}
		super.aClass184Array3[0] = super.aClass184Array3[1] = super.aClass184Array3[2] = null;
		super.anInt5088 = Static61.anInt1167;
		return local128;
	}

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "(B)Z")
	private boolean method4337() {
		return this.aClass91_1.lb;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "(I)Z")
	public boolean method4338() {
		return this.aClass91_1 != null;
	}

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "(I)I")
	@Override
	public int method4330() {
		if (this.aClass91_1.anIntArray140 != null) {
			@Pc(19) Class91 local19 = this.aClass91_1.method2036(Static659.aClass363_3);
			if (local19 != null && local19.anInt2360 != -1) {
				return local19.anInt2360;
			}
		}
		return this.aClass91_1.anInt2360;
	}

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "(I)I")
	@Override
	protected int method4334() {
		if (this.aClass91_1.anIntArray140 != null) {
			@Pc(13) Class91 local13 = this.aClass91_1.method2036(Static659.aClass363_3);
			if (local13 != null && local13.anInt2333 != -1) {
				return local13.anInt2333;
			}
		}
		return this.aClass91_1.anInt2333;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		if (this.aClass91_1 == null || !super.aBoolean333 && !this.method4344(0, arg0)) {
			return;
		}
		@Pc(22) Class207 local22 = arg0.method7456();
		local22.method8200(super.lb.method8507());
		local22.method8209(super.anInt10006, super.anInt10004 - 20, super.anInt10001);
		this.method4321(local22, super.aBoolean333, super.aClass184Array3, arg0);
		for (@Pc(57) int local57 = 0; local57 < super.aClass184Array3.length; local57++) {
			super.aClass184Array3[local57] = null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!em;)V")
	public void method4341(@OriginalArg(1) Class91 arg0) {
		this.aClass91_1 = arg0;
		if (this.aClass91_1 != null) {
			this.aString67 = this.aClass91_1.aString25;
			this.anInt5137 = this.aClass91_1.anInt2338;
		}
		if (super.aClass2_Sub8_5 != null) {
			super.aClass2_Sub8_5.method4173();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass91_1 == null || !this.method4344(131072, arg1)) {
			return false;
		}
		@Pc(25) Class207 local25 = arg1.method7456();
		@Pc(30) int local30 = super.lb.method8507();
		local25.method8200(local30);
		local25.method8209(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass184Array3.length; local45++) {
			if (super.aClass184Array3[local45] != null) {
				@Pc(70) boolean var10000;
				label50: {
					if (this.aClass91_1.anInt2329 <= 0) {
						label48: {
							if (this.aClass91_1.anInt2331 == -1) {
								if (this.aClass91_1.anInt2346 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass91_1.anInt2331 == 1) {
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
				@Pc(83) boolean local83 = var10000;
				@Pc(98) boolean local98;
				if (Static487.aBoolean565) {
					local98 = super.aClass184Array3[local45].method8653(arg0, arg2, local25, local83, this.aClass91_1.anInt2329, Static472.anInt8136);
				} else {
					local98 = super.aClass184Array3[local45].method8656(arg0, arg2, local25, local83, this.aClass91_1.anInt2329);
				}
				if (local98) {
					local43 = true;
					break;
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < super.aClass184Array3.length; local132++) {
			super.aClass184Array3[local132] = null;
		}
		return local43;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZIZI)V")
	public void method4342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte140 = super.aByte141 = (byte) arg4;
		if (Static250.method3635(arg2, arg0)) {
			super.aByte141++;
		}
		if (super.anInt5077 != -1 && Static334.aClass268_2.method6469(super.anInt5077).anInt3016 == 1) {
			super.anInt5077 = -1;
			super.anIntArray296 = null;
		}
		for (@Pc(46) int local46 = 0; super.aClass118Array3.length > local46; local46++) {
			if (super.aClass118Array3[local46].anInt2965 != -1) {
				@Pc(65) Class213 local65 = Static111.aClass279_4.method6905(super.aClass118Array3[local46].anInt2965);
				if (local65.aBoolean398 && local65.anInt6006 != -1 && Static334.aClass268_2.method6469(local65.anInt6006).anInt3016 == 1) {
					super.aClass118Array3[local46].anInt2965 = -1;
				}
			}
		}
		if (!arg3) {
			@Pc(107) int local107 = arg2 - super.anIntArray302[0];
			@Pc(115) int local115 = arg0 - super.anIntArray301[0];
			if (local107 >= -8 && local107 <= 8 && local115 >= -8 && local115 <= 8) {
				if (super.anInt5119 < 9) {
					super.anInt5119++;
				}
				for (@Pc(146) int local146 = super.anInt5119; local146 > 0; local146--) {
					super.anIntArray302[local146] = super.anIntArray302[local146 - 1];
					super.anIntArray301[local146] = super.anIntArray301[local146 - 1];
					super.aByteArray51[local146] = super.aByteArray51[local146 - 1];
				}
				super.anIntArray302[0] = arg2;
				super.aByteArray51[0] = 1;
				super.anIntArray301[0] = arg0;
				return;
			}
		}
		super.anIntArray302[0] = arg2;
		super.anInt5122 = 0;
		super.anInt5120 = 0;
		super.anInt5119 = 0;
		super.anIntArray301[0] = arg0;
		super.anInt10001 = (arg1 << 8) + (super.anIntArray301[0] << 9);
		super.anInt10006 = (super.anIntArray302[0] << 9) + (arg1 << 8);
		if (super.aClass2_Sub8_5 != null) {
			super.aClass2_Sub8_5.method4173();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
	public void method4343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray302[0];
		@Pc(21) int local21 = super.anIntArray301[0];
		if (arg0 == 0) {
			local21++;
		}
		if (arg0 == 1) {
			local21++;
			local10++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local10++;
			local21--;
		}
		if (arg0 == 4) {
			local21--;
		}
		if (arg0 == 5) {
			local21--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt5077 != -1 && Static334.aClass268_2.method6469(super.anInt5077).anInt3016 == 1) {
			super.anInt5077 = -1;
			super.anIntArray296 = null;
		}
		if (arg0 == 7) {
			local21++;
			local10--;
		}
		for (@Pc(88) int local88 = 0; super.aClass118Array3.length > local88; local88++) {
			if (super.aClass118Array3[local88].anInt2965 != -1) {
				@Pc(106) Class213 local106 = Static111.aClass279_4.method6905(super.aClass118Array3[local88].anInt2965);
				if (local106.aBoolean398 && local106.anInt6006 != -1 && Static334.aClass268_2.method6469(local106.anInt6006).anInt3016 == 1) {
					super.aClass118Array3[local88].anInt2965 = -1;
				}
			}
		}
		if (super.anInt5119 < 9) {
			super.anInt5119++;
		}
		for (@Pc(152) int local152 = super.anInt5119; local152 > 0; local152--) {
			super.anIntArray302[local152] = super.anIntArray302[local152 - 1];
			super.anIntArray301[local152] = super.anIntArray301[local152 - 1];
			super.aByteArray51[local152] = super.aByteArray51[local152 - 1];
		}
		super.anIntArray302[0] = local10;
		super.aByteArray51[0] = (byte) arg1;
		super.anIntArray301[0] = local21;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)I")
	@Override
	public int method8443() {
		return this.aClass91_1 == null ? 0 : this.aClass91_1.anInt2329;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method4344(@OriginalArg(1) int arg0, @OriginalArg(2) Class132 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class389 local9 = this.method4317();
		@Pc(33) Class119 local33 = super.anInt5077 != -1 && super.anInt5065 == 0 ? Static334.aClass268_2.method6469(super.anInt5077) : null;
		@Pc(50) Class119 local50 = super.anInt5112 == -1 || super.aBoolean331 && local33 != null ? null : Static334.aClass268_2.method6469(super.anInt5112);
		@Pc(53) int local53 = local9.anInt10690;
		@Pc(56) int local56 = local9.anInt10703;
		if (local53 != 0 || local56 != 0 || local9.anInt10705 != 0 || local9.anInt10717 != 0) {
			arg0 |= 0x7;
		}
		@Pc(96) boolean local96 = super.aByte92 != 0 && Static90.anInt1698 >= super.anInt5055 && super.anInt5116 > Static90.anInt1698;
		if (local96) {
			arg0 |= 0x80000;
		}
		@Pc(107) int local107 = super.lb.method8507();
		@Pc(143) Class184 local143 = super.aClass184Array3[0] = this.aClass91_1.method2040(super.anInt5067, this.aClass236_1, local50, super.anInt5071, arg1, super.anInt5054, Static334.aClass268_2, Static659.aClass363_3, local33, local107, super.anInt5049, super.aClass245Array3, super.anInt5115, arg0, Static12.aClass368_1, super.anInt5075, super.anIntArray297);
		if (local143 == null) {
			return false;
		}
		super.anInt5061 = local143.fa();
		super.anInt5070 = local143.ma();
		this.method4325(local143);
		if (local53 == 0 && local56 == 0) {
			this.method4319(this.method4326() << 9, 0, 0, this.method4326() << 9, local107);
		} else {
			this.method4319(local53, local9.anInt10724, local9.anInt10721, local56, local107);
			if (super.anInt5118 != 0) {
				super.aClass184Array3[0].FA(super.anInt5118);
			}
			if (super.anInt5072 != 0) {
				super.aClass184Array3[0].VA(super.anInt5072);
			}
			if (super.anInt5099 != 0) {
				super.aClass184Array3[0].H(0, super.anInt5099, 0);
			}
		}
		if (local96) {
			local143.method8654(super.aByte90, super.aByte89, super.aByte93, super.aByte92 & 0xFF);
		}
		this.method4318(arg1, local9, local56, local107, local5, local53);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}
}
