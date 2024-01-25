import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class12_Sub2_Sub1_Sub4_Sub2 extends Class12_Sub2_Sub1_Sub4 {

	@OriginalMember(owner = "client!u", name = "Sc", descriptor = "Lclient!rda;")
	public Class295 aClass295_1;

	@OriginalMember(owner = "client!u", name = "Uc", descriptor = "I")
	public int anInt8436 = -1;

	@OriginalMember(owner = "client!u", name = "ad", descriptor = "I")
	public int anInt8442 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)V")
	public void method6780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray566[0];
		@Pc(15) int local15 = super.anIntArray565[0];
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
			local10++;
			local15--;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt8394 != -1 && Static117.aClass18_1.method296(super.anInt8394).anInt3052 == 1) {
			super.anInt8394 = -1;
			super.anIntArray558 = null;
		}
		@Pc(101) Class82 local101;
		if (super.anInt8370 != -1) {
			local101 = Static62.aClass49_1.method1021(super.anInt8370);
			if (local101.aBoolean116 && local101.anInt1827 != -1 && Static117.aClass18_1.method296(local101.anInt1827).anInt3052 == 1) {
				super.anInt8370 = -1;
			}
		}
		if (super.anInt8366 != -1) {
			local101 = Static62.aClass49_1.method1021(super.anInt8366);
			if (local101.aBoolean116 && local101.anInt1827 != -1 && Static117.aClass18_1.method296(local101.anInt1827).anInt3052 == 1) {
				super.anInt8366 = -1;
			}
		}
		if (super.anInt8431 < 9) {
			super.anInt8431++;
		}
		for (@Pc(165) int local165 = super.anInt8431; local165 > 0; local165--) {
			super.anIntArray566[local165] = super.anIntArray566[local165 - 1];
			super.anIntArray565[local165] = super.anIntArray565[local165 - 1];
			super.aByteArray92[local165] = super.aByteArray92[local165 - 1];
		}
		super.anIntArray566[0] = local10;
		super.aByteArray92[0] = (byte) arg1;
		super.anIntArray565[0] = local15;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!r;I)Z")
	private boolean method6781(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class61 local11 = this.method6767();
		@Pc(29) Class148 local29 = super.anInt8394 != -1 && super.anInt8397 == 0 ? Static117.aClass18_1.method296(super.anInt8394) : null;
		@Pc(48) Class148 local48 = super.anInt8351 == -1 || super.aBoolean710 && local29 != null ? null : Static117.aClass18_1.method296(super.anInt8351);
		@Pc(51) int local51 = local11.anInt1315;
		@Pc(54) int local54 = local11.anInt1323;
		if (local51 != 0 || local54 != 0 || local11.anInt1295 != 0 || local11.anInt1334 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte119 != 0 && super.anInt8352 <= Static532.anInt8757 && super.anInt8422 > Static532.anInt8757;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(111) int local111 = super.aClass352_7.method7410();
		@Pc(145) Class33 local145 = super.aClass33Array3[0] = this.aClass295_1.method5941(Static117.aClass18_1, super.anInt8353, arg0, local111, Static380.aClass221_3, super.anInt8420, Static426.aClass160_1, super.anInt8376, super.anInt8379, arg1, super.anInt8415, super.anIntArray559, local48, super.aClass324Array3, local29, super.anInt8396);
		if (local145 == null) {
			return false;
		}
		super.anInt8388 = local145.J();
		super.anInt8378 = local145.RA();
		this.method6772(local145);
		if (local51 == 0 && local54 == 0) {
			this.method6768(0, this.method6777() << 9, local111, 0, this.method6777() << 9);
		} else {
			this.method6768(local11.anInt1319, local54, local111, local11.anInt1311, local51);
			if (super.anInt8425 != 0) {
				super.aClass33Array3[0].MA(super.anInt8425);
			}
			if (super.anInt8381 != 0) {
				super.aClass33Array3[0].W(super.anInt8381);
			}
			if (super.anInt8410 != 0) {
				super.aClass33Array3[0].oa(0, super.anInt8410, 0);
			}
		}
		if (local100) {
			local145.method7204(super.aByte121, super.aByte122, super.aByte120, super.aByte119 & 0xFF);
		}
		@Pc(262) Class82 local262;
		@Pc(279) boolean local279;
		@Pc(281) int local281;
		@Pc(324) Class33 local324;
		if (super.anInt8370 == -1 || super.lb == -1) {
			super.aClass33Array3[1] = null;
		} else {
			local262 = Static62.aClass49_1.method1021(super.anInt8370);
			local279 = local262.aByte23 == 3 && (local51 != 0 || local54 != 0);
			local281 = local7;
			if (local279) {
				local281 = local7 | 0x7;
			} else {
				if (super.anInt8386 != 0) {
					local281 = local7 | 0x5;
				}
				if (super.anInt8361 != 0) {
					local281 |= 0x2;
				}
			}
			local324 = super.aClass33Array3[1] = local262.method1544(super.anInt8405, Static117.aClass18_1, super.anInt8408, local281, arg1, super.lb);
			if (local324 != null) {
				if (super.anInt8361 != 0) {
					local324.oa(0, -super.anInt8361 << 2, 0);
				}
				if (super.anInt8386 != 0) {
					local324.M(super.anInt8386 * 2048);
				}
				if (local279) {
					if (super.anInt8425 != 0) {
						local324.MA(super.anInt8425);
					}
					if (super.anInt8381 != 0) {
						local324.W(super.anInt8381);
					}
					if (super.anInt8410 != 0) {
						local324.oa(0, super.anInt8410, 0);
					}
				}
			}
		}
		if (super.anInt8366 == -1 || super.anInt8393 == -1) {
			super.aClass33Array3[2] = null;
		} else {
			local262 = Static62.aClass49_1.method1021(super.anInt8366);
			local279 = local262.aByte23 == 3 && (local51 != 0 || local54 != 0);
			local281 = local7;
			if (local279) {
				local281 = local7 | 0x7;
			} else {
				if (super.anInt8390 != 0) {
					local281 = local7 | 0x5;
				}
				if (super.anInt8382 != 0) {
					local281 |= 0x2;
				}
			}
			local324 = super.aClass33Array3[2] = local262.method1541(super.anInt8349, super.anInt8393, Static117.aClass18_1, arg1, local281, super.anInt8398);
			if (local324 != null) {
				if (super.anInt8382 != 0) {
					local324.oa(0, -super.anInt8382 << 2, 0);
				}
				if (super.anInt8390 != 0) {
					local324.M(super.anInt8390 * 2048);
				}
				if (local279) {
					if (super.anInt8425 != 0) {
						local324.MA(super.anInt8425);
					}
					if (super.anInt8381 != 0) {
						local324.W(super.anInt8381);
					}
					if (super.anInt8410 != 0) {
						local324.oa(0, super.anInt8410, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7510() {
		return false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	@Override
	public int method6775() {
		if (this.aClass295_1.anIntArray493 != null) {
			@Pc(18) Class295 local18 = this.aClass295_1.method5942(Static426.aClass160_1);
			if (local18 != null && local18.anInt7330 != -1) {
				return local18.anInt7330;
			}
		}
		return this.aClass295_1.anInt7330;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	@Override
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(B)I")
	@Override
	public int method6778() {
		if (this.aClass295_1.anIntArray493 != null) {
			@Pc(21) Class295 local21 = this.aClass295_1.method5942(Static426.aClass160_1);
			if (local21 != null && local21.anInt7332 != -1) {
				return local21.anInt7332;
			}
		}
		return this.aClass295_1.anInt7332 == -1 ? super.method6778() : this.aClass295_1.anInt7332;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIZI)V")
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte128 = super.aByte127 = (byte) arg0;
		if (Static562.method7350(arg4, arg2)) {
			super.aByte127++;
		}
		if (super.anInt8394 != -1 && Static117.aClass18_1.method296(super.anInt8394).anInt3052 == 1) {
			super.anInt8394 = -1;
			super.anIntArray558 = null;
		}
		@Pc(55) Class82 local55;
		if (super.anInt8370 != -1) {
			local55 = Static62.aClass49_1.method1021(super.anInt8370);
			if (local55.aBoolean116 && local55.anInt1827 != -1 && Static117.aClass18_1.method296(local55.anInt1827).anInt3052 == 1) {
				super.anInt8370 = -1;
			}
		}
		if (super.anInt8366 != -1) {
			local55 = Static62.aClass49_1.method1021(super.anInt8366);
			if (local55.aBoolean116 && local55.anInt1827 != -1 && Static117.aClass18_1.method296(local55.anInt1827).anInt3052 == 1) {
				super.anInt8366 = -1;
			}
		}
		if (!arg3) {
			@Pc(116) int local116 = arg4 - super.anIntArray566[0];
			@Pc(124) int local124 = arg2 - super.anIntArray565[0];
			if (local116 >= -8 && local116 <= 8 && local124 >= -8 && local124 <= 8) {
				if (super.anInt8431 < 9) {
					super.anInt8431++;
				}
				for (@Pc(157) int local157 = super.anInt8431; local157 > 0; local157--) {
					super.anIntArray566[local157] = super.anIntArray566[local157 - 1];
					super.anIntArray565[local157] = super.anIntArray565[local157 - 1];
					super.aByteArray92[local157] = super.aByteArray92[local157 - 1];
				}
				super.anIntArray566[0] = arg4;
				super.aByteArray92[0] = 1;
				super.anIntArray565[0] = arg2;
				return;
			}
		}
		super.anIntArray566[0] = arg4;
		super.anInt8431 = 0;
		super.anInt8430 = 0;
		super.anInt8428 = 0;
		super.anIntArray565[0] = arg2;
		super.anInt9375 = (arg1 << 8) + (super.anIntArray565[0] << 9);
		super.anInt9374 = (super.anIntArray566[0] << 9) + (arg1 << 8);
		if (super.aClass12_Sub4_7 != null) {
			super.aClass12_Sub4_7.method4132();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
		if (this.aClass295_1 == null || !super.aBoolean711 && !this.method6781(0, arg0)) {
			return;
		}
		@Pc(20) Class25 local20 = arg0.method6862();
		local20.o(super.aClass352_7.method7410());
		local20.U(super.anInt9374, super.anInt9373 - 20, super.anInt9375);
		this.method6764(local20, arg0, super.aBoolean711, super.aClass33Array3);
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		if (this.aClass295_1 == null || !this.method6781(2048, arg0)) {
			return null;
		}
		@Pc(19) Class25 local19 = arg0.method6862();
		@Pc(24) int local24 = super.aClass352_7.method7410();
		local19.o(local24);
		@Pc(42) Class228 local42 = Static469.aClass228ArrayArrayArray6[super.aByte128][super.anInt9374 >> Static562.anInt9207][super.anInt9375 >> Static562.anInt9207];
		if (local42 == null || local42.aClass12_Sub2_Sub2_1 == null) {
			super.anInt8365 = (int) ((float) super.anInt8365 - (float) super.anInt8365 / 10.0F);
		} else {
			@Pc(68) int local68 = super.anInt8365 - local42.aClass12_Sub2_Sub2_1.aShort39;
			super.anInt8365 = (int) ((float) super.anInt8365 - (float) local68 / 10.0F);
		}
		local19.U(super.anInt9374, super.anInt9373 - super.anInt8365 - 20, super.anInt9375);
		@Pc(97) Class61 local97 = this.method6767();
		@Pc(110) Class295 local110 = this.aClass295_1.anIntArray493 == null ? this.aClass295_1 : this.aClass295_1.method5942(Static426.aClass160_1);
		super.aBoolean712 = false;
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean640 && local110.aBoolean610 && local97.aBoolean91) {
			@Pc(138) Class148 local138 = super.anInt8394 != -1 && super.anInt8397 == 0 ? Static117.aClass18_1.method296(super.anInt8394) : null;
			@Pc(155) Class148 local155 = super.anInt8351 == -1 || super.aBoolean710 && local138 != null ? null : Static117.aClass18_1.method296(super.anInt8351);
			@Pc(205) Class33 local205 = Static178.method2296(local155 == null ? super.anInt8420 : super.anInt8376, super.anInt8425, arg0, this.aClass295_1.aByte103 & 0xFF, local155 == null ? local138 : local155, this.aClass295_1.aByte109 & 0xFF, this.aClass295_1.anInt7362, super.aClass33Array3[0], this.aClass295_1.aShort90 & 0xFFFF, super.anInt8381, local24, this.aClass295_1.aShort89 & 0xFFFF, super.anInt8410);
			if (local205 != null) {
				super.aBoolean712 = true;
				arg0.ZA(false);
				if (Static286.aBoolean372) {
					local205.method7183(local19, null, Static578.anInt9366, 0);
				} else {
					local205.method7192(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt9374, -super.anInt8365 + super.anInt9373 - 5, super.anInt9375);
		@Pc(250) Class12_Sub3 local250 = null;
		if (this.method6787()) {
			local250 = Static443.method5793(super.aClass33Array3.length);
		}
		this.method6764(local19, arg0, false, super.aClass33Array3);
		@Pc(272) int local272;
		if (Static286.aBoolean372) {
			for (local272 = 0; super.aClass33Array3.length > local272; local272++) {
				if (super.aClass33Array3[local272] != null) {
					super.aClass33Array3[local272].method7183(local19, local250 == null ? null : local250.aClass12_Sub6Array1[local272], Static578.anInt9366, 0);
				}
			}
		} else {
			for (local272 = 0; super.aClass33Array3.length > local272; local272++) {
				if (super.aClass33Array3[local272] != null) {
					super.aClass33Array3[local272].method7192(local19, local250 == null ? null : local250.aClass12_Sub6Array1[local272], 0);
				}
			}
		}
		if (super.aClass12_Sub4_7 != null) {
			@Pc(348) Class339 local348 = super.aClass12_Sub4_7.method4130();
			if (Static286.aBoolean372) {
				arg0.method6883(local348, Static578.anInt9366);
			} else {
				arg0.method6860(local348);
			}
		}
		for (local272 = 0; local272 < super.aClass33Array3.length; local272++) {
			if (super.aClass33Array3[local272] != null) {
				super.aBoolean712 |= super.aClass33Array3[local272].LA();
			}
		}
		super.anInt8413 = Static388.anInt6397;
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = null;
		return local250;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	@Override
	public void method7511() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rda;B)V")
	public void method6784(@OriginalArg(0) Class295 arg0) {
		this.aClass295_1 = arg0;
		if (super.aClass12_Sub4_7 != null) {
			super.aClass12_Sub4_7.method4132();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
	@Override
	protected int method6765() {
		if (this.aClass295_1.anIntArray493 != null) {
			@Pc(13) Class295 local13 = this.aClass295_1.method5942(Static426.aClass160_1);
			if (local13 != null && local13.anInt7340 != -1) {
				return local13.anInt7340;
			}
		}
		return this.aClass295_1.anInt7340;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		if (this.aClass295_1 == null || !this.method6781(131072, arg2)) {
			return false;
		}
		@Pc(19) Class25 local19 = arg2.method6862();
		@Pc(24) int local24 = super.aClass352_7.method7410();
		local19.o(local24);
		local19.U(super.anInt9374, super.anInt9373, super.anInt9375);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass33Array3.length > local39; local39++) {
			if (super.aClass33Array3[local39] != null) {
				@Pc(73) boolean local73 = this.aClass295_1.anInt7343 == -1 ? this.aClass295_1.anInt7362 == 1 : this.aClass295_1.anInt7343 == 1;
				@Pc(86) boolean local86;
				if (Static286.aBoolean372) {
					local86 = super.aClass33Array3[local39].method7201(arg0, arg1, local19, local73, Static578.anInt9366);
				} else {
					local86 = super.aClass33Array3[local39].method7193(arg0, arg1, local19, local73);
				}
				if (local86) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(B)Z")
	private boolean method6787() {
		return this.aClass295_1.aBoolean609;
	}

	@OriginalMember(owner = "client!u", name = "i", descriptor = "(I)Z")
	public boolean method6789() {
		return this.aClass295_1 != null;
	}
}
