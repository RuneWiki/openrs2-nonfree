import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class4_Sub2_Sub1_Sub2_Sub2 extends Class4_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!efa", name = "Tc", descriptor = "I")
	public int anInt2378;

	@OriginalMember(owner = "client!efa", name = "Dc", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!efa", name = "Uc", descriptor = "Lclient!vh;")
	public Class384 aClass384_1;

	@OriginalMember(owner = "client!efa", name = "Kc", descriptor = "Lclient!nl;")
	public Class261 aClass261_1;

	@OriginalMember(owner = "client!efa", name = "Lc", descriptor = "I")
	public int anInt2388 = -1;

	@OriginalMember(owner = "client!efa", name = "Fc", descriptor = "I")
	public int anInt2379 = 1;

	@OriginalMember(owner = "client!efa", name = "Yc", descriptor = "I")
	public int anInt2398 = -1;

	@OriginalMember(owner = "client!efa", name = "Nc", descriptor = "I")
	public int anInt2382 = 1;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "(B)Z")
	private boolean method2065() {
		return this.aClass261_1.aBoolean585;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "(I)I")
	@Override
	public int method8979(@OriginalArg(0) int arg0) {
		if (this.aClass261_1 == null) {
			return 0;
		} else {
			if (arg0 != 65535) {
				this.method8973();
			}
			return this.aClass261_1.anInt7008;
		}
	}

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "(Z)I")
	@Override
	public int method2051() {
		if (this.aClass261_1.anIntArray499 != null) {
			@Pc(19) Class261 local19 = this.aClass261_1.method6272(Static396.aClass107_1);
			if (local19 != null && local19.anInt7019 != -1) {
				return local19.anInt7019;
			}
		}
		return this.aClass261_1.anInt7019 == -1 ? super.method2051() : this.aClass261_1.anInt7019;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		if (this.aClass261_1 == null || !super.aBoolean249 && !this.method2074(0, arg0)) {
			return;
		}
		@Pc(26) Class86 local26 = arg0.method9699();
		local26.method7023(super.aClass178_7.method3799());
		local26.method7020(super.anInt10229, super.anInt10234 - 20, super.anInt10228);
		this.method2059(super.aClass45Array3, local26, super.aBoolean249, arg0);
		for (@Pc(58) int local58 = 0; super.aClass45Array3.length > local58; local58++) {
			super.aClass45Array3[local58] = null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Lclient!l;")
	@Override
	public Class217 method2052() {
		return super.aClass217_3 != null && super.aClass217_3.aString60 == null ? null : super.aClass217_3;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BLclient!nl;)V")
	public void method2068(@OriginalArg(1) Class261 arg0) {
		if (this.aClass261_1 != arg0 && Static189.aBoolean301 && Static347.method4807(super.anInt2320)) {
			Static640.method8677();
		}
		this.aClass261_1 = arg0;
		if (this.aClass261_1 != null) {
			this.anInt2378 = this.aClass261_1.anInt7011;
			this.aString24 = this.aClass261_1.aString76;
		}
		if (super.aClass4_Sub7_4 != null) {
			super.aClass4_Sub7_4.method3634();
		}
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(III)V")
	public void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray183[0];
		@Pc(15) int local15 = super.anIntArray182[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
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
		if (super.aClass53_7.method4094() && super.aClass53_7.method4074().anInt8130 == 1) {
			super.anIntArray179 = null;
			super.aClass53_7.method4089(-1);
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		for (@Pc(102) int local102 = 0; local102 < super.aClass315Array3.length; local102++) {
			if (super.aClass315Array3[local102].anInt8456 != -1) {
				@Pc(122) Class347 local122 = Static119.aClass209_1.method4570(super.aClass315Array3[local102].anInt8456);
				if (local122.aBoolean800 && local122.anInt9356 != -1 && Static89.aClass274_1.method6626(local122.anInt9356).anInt8130 == 1) {
					super.aClass315Array3[local102].aClass53_10.method4089(-1);
					super.aClass315Array3[local102].anInt8456 = -1;
				}
			}
		}
		if (super.anIntArray183.length - 1 > super.anInt2371) {
			super.anInt2371++;
		}
		for (@Pc(189) int local189 = super.anInt2371; local189 > 0; local189--) {
			super.anIntArray183[local189] = super.anIntArray183[local189 - 1];
			super.anIntArray182[local189] = super.anIntArray182[local189 - 1];
			super.aByteArray27[local189] = super.aByteArray27[local189 - 1];
		}
		if (9766 != 9766) {
			this.method8967((Class4_Sub2) null, -47, (Class145) null, -5, true, -62, (byte) 33);
		}
		super.anIntArray183[0] = local10;
		super.anIntArray182[0] = local15;
		super.aByteArray27[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILjava/lang/String;II)V")
	public void method2070(@OriginalArg(1) String arg0) {
		@Pc(9) int local9 = Static280.method6055() * Static519.aClass132_1.anInt3150;
		this.method2055(local9, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "(Z)I")
	@Override
	public int method2042() {
		if (this.aClass261_1.anIntArray499 != null) {
			@Pc(19) Class261 local19 = this.aClass261_1.method6272(Static396.aClass107_1);
			if (local19 != null && local19.anInt6998 != -1) {
				return local19.anInt6998;
			}
		}
		return this.aClass261_1.anInt6998;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIZZI)V")
	public void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte133 = super.aByte134 = (byte) arg0;
		if (Static83.method1237(arg1, arg2)) {
			super.aByte134++;
		}
		if (super.aClass53_7.method4094() && super.aClass53_7.method4074().anInt8130 == 1) {
			super.anIntArray179 = null;
			super.aClass53_7.method4089(-1);
		}
		for (@Pc(54) int local54 = 0; local54 < super.aClass315Array3.length; local54++) {
			if (super.aClass315Array3[local54].anInt8456 != -1) {
				@Pc(74) Class347 local74 = Static119.aClass209_1.method4570(super.aClass315Array3[local54].anInt8456);
				if (local74.aBoolean800 && local74.anInt9356 != -1 && Static89.aClass274_1.method6626(local74.anInt9356).anInt8130 == 1) {
					super.aClass315Array3[local54].aClass53_10.method4089(-1);
					super.aClass315Array3[local54].anInt8456 = -1;
				}
			}
		}
		if (!arg3) {
			@Pc(136) int local136 = arg1 - super.anIntArray183[0];
			@Pc(143) int local143 = arg2 - super.anIntArray182[0];
			if (local136 >= -8 && local136 <= 8 && local143 >= -8 && local143 <= 8) {
				if (super.anInt2371 < super.anIntArray183.length - 1) {
					super.anInt2371++;
				}
				for (@Pc(188) int local188 = super.anInt2371; local188 > 0; local188--) {
					super.anIntArray183[local188] = super.anIntArray183[local188 - 1];
					super.anIntArray182[local188] = super.anIntArray182[local188 - 1];
					super.aByteArray27[local188] = super.aByteArray27[local188 - 1];
				}
				super.anIntArray183[0] = arg1;
				super.aByteArray27[0] = 1;
				super.anIntArray182[0] = arg2;
				return;
			}
		}
		super.anInt2371 = 0;
		super.anInt2370 = 0;
		super.anInt2369 = 0;
		super.anIntArray183[0] = arg1;
		super.anIntArray182[0] = arg2;
		super.anInt10229 = (super.anIntArray183[0] << 9) + (arg4 << 8);
		super.anInt10228 = (arg4 << 8) + (super.anIntArray182[0] << 9);
		if (super.aClass4_Sub7_4 != null) {
			super.aClass4_Sub7_4.method3634();
		}
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2048() {
		return Static519.aClass132_1.aBoolean302;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		if (this.aClass261_1 == null || !this.method2074(2048, arg0)) {
			return null;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		@Pc(27) int local27 = super.aClass178_7.method3799();
		local22.method7023(local27);
		@Pc(51) Class311 local51 = Static632.aClass311ArrayArrayArray3[super.aByte133][super.anInt10229 >> Static260.anInt4053][super.anInt10228 >> Static260.anInt4053];
		if (local51 == null || local51.aClass4_Sub2_Sub2_1 == null) {
			super.anInt2317 = (int) ((float) super.anInt2317 - (float) super.anInt2317 / 10.0F);
		} else {
			@Pc(82) int local82 = super.anInt2317 - local51.aClass4_Sub2_Sub2_1.aShort86;
			super.anInt2317 = (int) ((float) super.anInt2317 - (float) local82 / 10.0F);
		}
		local22.method7020(super.anInt10229, super.anInt10234 - super.anInt2317 - 20, super.anInt10228);
		@Pc(111) Class49 local111 = this.method2064(-80);
		@Pc(125) Class261 local125 = this.aClass261_1.anIntArray499 == null ? this.aClass261_1 : this.aClass261_1.method6272(Static396.aClass107_1);
		super.aBoolean250 = false;
		@Pc(130) Class4_Sub8 local130 = null;
		if (Static650.aClass2_Sub30_29.aClass11_Sub21_1.method5163() == 1 && local125.aBoolean590 && local111.aBoolean127) {
			@Pc(166) Class53 local166 = super.aClass53_7.method4094() && super.aClass53_7.method4075() ? super.aClass53_7 : null;
			@Pc(186) Class53 local186 = super.aClass53_6.method4094() && (!super.aBoolean248 || local166 == null) ? super.aClass53_6 : null;
			@Pc(230) Class45 local230 = Static190.method2723(this.aClass261_1.aByte93 & 0xFF, this.aClass261_1.anInt7010, this.aClass261_1.aByte90 & 0xFF, this.aClass261_1.aShort92 & 0xFFFF, super.anInt2338, local186 == null ? local166 : local186, local27, this.aClass261_1.aShort91 & 0xFFFF, super.aClass45Array3[0], super.anInt2326, super.anInt2327, arg0);
			if (local230 != null) {
				local130 = Static118.method1730(super.aClass45Array3.length + 1, this.method2065());
				super.aBoolean250 = true;
				arg0.C(false);
				if (Static591.aBoolean812) {
					local230.method5759(local22, local130.aClass4_Sub6Array1[super.aClass45Array3.length], Static96.anInt1733, 0);
				} else {
					local230.method5769(local22, local130.aClass4_Sub6Array1[super.aClass45Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method7023(local27);
		local22.method7020(super.anInt10229, super.anInt10234 - super.anInt2317 - 5, super.anInt10228);
		if (local130 == null) {
			local130 = Static118.method1730(super.aClass45Array3.length, this.method2065());
		}
		this.method2059(super.aClass45Array3, local22, false, arg0);
		@Pc(321) int local321;
		if (Static591.aBoolean812) {
			for (local321 = 0; local321 < super.aClass45Array3.length; local321++) {
				if (super.aClass45Array3[local321] != null) {
					super.aClass45Array3[local321].method5759(local22, local130.aClass4_Sub6Array1[local321], Static96.anInt1733, 0);
				}
			}
		} else {
			for (local321 = 0; super.aClass45Array3.length > local321; local321++) {
				if (super.aClass45Array3[local321] != null) {
					super.aClass45Array3[local321].method5769(local22, local130.aClass4_Sub6Array1[local321], 0);
				}
			}
		}
		if (super.aClass4_Sub7_4 != null) {
			@Pc(405) Class236 local405 = super.aClass4_Sub7_4.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local405, Static96.anInt1733);
			} else {
				arg0.method9666(local405);
			}
		}
		for (local321 = 0; super.aClass45Array3.length > local321; local321++) {
			if (super.aClass45Array3[local321] != null) {
				super.aBoolean250 |= super.aClass45Array3[local321].F();
			}
			super.aClass45Array3[local321] = null;
		}
		super.anInt2329 = Static68.anInt1174;
		return local130;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass261_1 == null || !this.method2074(131072, arg0)) {
			return false;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		@Pc(27) int local27 = super.aClass178_7.method3799();
		local22.method7023(local27);
		local22.method7020(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass45Array3.length; local42++) {
			if (super.aClass45Array3[local42] != null) {
				@Pc(75) boolean var10000;
				label54: {
					if (this.aClass261_1.anInt7008 <= 0) {
						label52: {
							if (this.aClass261_1.anInt7034 == -1) {
								if (this.aClass261_1.anInt7010 == 1) {
									break label52;
								}
								var10000 = false;
							} else {
								if (this.aClass261_1.anInt7034 == 1) {
									break label52;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label54;
							}
						}
					}
					var10000 = true;
				}
				@Pc(93) boolean local93 = var10000;
				@Pc(109) boolean local109;
				if (Static591.aBoolean812) {
					local109 = super.aClass45Array3[local42].method5743(arg1, arg3, local22, local93, this.aClass261_1.anInt7008, Static96.anInt1733);
				} else {
					local109 = super.aClass45Array3[local42].method5770(arg1, arg3, local22, local93, this.aClass261_1.anInt7008);
				}
				if (local109) {
					local40 = true;
					break;
				}
			}
		}
		if (arg2 == -11191) {
			for (@Pc(154) int local154 = 0; super.aClass45Array3.length > local154; local154++) {
				super.aClass45Array3[local154] = null;
			}
			return local40;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "(I)I")
	@Override
	protected int method2045() {
		if (this.aClass261_1.anIntArray499 != null) {
			@Pc(13) Class261 local13 = this.aClass261_1.method6272(Static396.aClass107_1);
			if (local13 != null && local13.anInt7029 != -1) {
				return local13.anInt7029;
			}
		}
		return this.aClass261_1.anInt7029;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)Z")
	public boolean method2073() {
		return this.aClass261_1 != null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method2074(@OriginalArg(1) int arg0, @OriginalArg(2) Class145 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class49 local9 = this.method2064(-126);
		@Pc(35) Class53 local35 = super.aClass53_7.method4094() && !super.aClass53_7.method4075() ? super.aClass53_7 : null;
		@Pc(55) Class53 local55 = super.aClass53_6.method4094() && (!super.aBoolean248 || local35 == null) ? super.aClass53_6 : null;
		@Pc(58) int local58 = local9.anInt1092;
		@Pc(61) int local61 = local9.anInt1061;
		if (local58 != 0 || local61 != 0 || local9.anInt1079 != 0 || local9.anInt1076 != 0) {
			arg0 |= 0x7;
		}
		@Pc(114) boolean local114 = super.aByte59 != 0 && Static528.anInt8386 >= super.anInt2364 && Static528.anInt8386 < super.anInt2366;
		if (local114) {
			arg0 |= 0x80000;
		}
		@Pc(125) int local125 = super.aClass178_7.method3799();
		@Pc(148) Class45 local148 = super.aClass45Array3[0] = this.aClass261_1.method6277(this.aClass384_1, local35, super.aClass53_Sub1_Sub1Array3, local55, Static396.aClass107_1, arg0, Static378.aClass314_2, arg1, super.anIntArray181, local125);
		if (local148 == null) {
			return false;
		}
		super.anInt2322 = local148.fa();
		super.anInt2313 = local148.ma();
		this.method2043(local148);
		if (local58 == 0 && local61 == 0) {
			this.method2062(local125, this.method2046() << 9, 0, this.method2046() << 9, 0);
		} else {
			this.method2062(local125, local61, local9.anInt1091, local58, local9.anInt1080);
			if (super.anInt2326 != 0) {
				super.aClass45Array3[0].FA(super.anInt2326);
			}
			if (super.anInt2327 != 0) {
				super.aClass45Array3[0].VA(super.anInt2327);
			}
			if (super.anInt2338 != 0) {
				super.aClass45Array3[0].H(0, super.anInt2338, 0);
			}
		}
		if (local114) {
			local148.method5748(super.aByte60, super.aByte58, super.aByte61, super.aByte59 & 0xFF);
		}
		this.method2044(local125, local61, local9, arg1, local58, local5, (byte) -35);
		return true;
	}
}
