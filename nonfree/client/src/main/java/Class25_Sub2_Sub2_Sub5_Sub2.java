import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class25_Sub2_Sub2_Sub5_Sub2 extends Class25_Sub2_Sub2_Sub5 {

	@OriginalMember(owner = "client!sp", name = "Xc", descriptor = "Lclient!ms;")
	public Class213 aClass213_1;

	@OriginalMember(owner = "client!sp", name = "bd", descriptor = "I")
	public int anInt8584 = -1;

	@OriginalMember(owner = "client!sp", name = "ud", descriptor = "I")
	public int anInt8601 = -1;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)V")
	public void method6685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray512[0];
		@Pc(15) int local15 = super.anIntArray513[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
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
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt8545 != -1 && Static245.aClass155_1.method3820(super.anInt8545).anInt7695 == 1) {
			super.anInt8545 = -1;
			super.anIntArray508 = null;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(87) Class250 local87;
		if (super.anInt8548 != -1) {
			local87 = Static386.aClass23_1.method228(super.anInt8548);
			if (local87.aBoolean484 && local87.anInt7025 != -1 && Static245.aClass155_1.method3820(local87.anInt7025).anInt7695 == 1) {
				super.anInt8548 = -1;
			}
		}
		if (super.anInt8508 != -1) {
			local87 = Static386.aClass23_1.method228(super.anInt8508);
			if (local87.aBoolean484 && local87.anInt7025 != -1 && Static245.aClass155_1.method3820(local87.anInt7025).anInt7695 == 1) {
				super.anInt8508 = -1;
			}
		}
		if (super.anInt8580 < 9) {
			super.anInt8580++;
		}
		for (@Pc(154) int local154 = super.anInt8580; local154 > 0; local154--) {
			super.anIntArray512[local154] = super.anIntArray512[local154 - 1];
			super.anIntArray513[local154] = super.anIntArray513[local154 - 1];
			super.aByteArray209[local154] = super.aByteArray209[local154 - 1];
		}
		super.anIntArray512[0] = local10;
		super.aByteArray209[0] = (byte) arg1;
		super.anIntArray513[0] = local15;
	}

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "(I)I")
	@Override
	public int method6674() {
		if (this.aClass213_1.anIntArray345 != null) {
			@Pc(18) Class213 local18 = this.aClass213_1.method4998(Static206.aClass143_3);
			if (local18 != null && local18.anInt6185 != -1) {
				return local18.anInt6185;
			}
		}
		return this.aClass213_1.anInt6185;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		if (this.aClass213_1 == null || !this.method6691(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class42 local19 = arg0.method8052();
		@Pc(24) int local24 = super.aClass252_7.method5714();
		local19.o(local24);
		@Pc(48) Class333 local48 = Static189.aClass333ArrayArrayArray1[super.aByte117][super.anInt8476 >> Static385.anInt6657][super.anInt8482 >> Static385.anInt6657];
		if (local48 == null || local48.aClass25_Sub2_Sub5_1 == null) {
			super.anInt8515 = (int) ((float) super.anInt8515 - (float) super.anInt8515 / 10.0F);
		} else {
			@Pc(75) int local75 = super.anInt8515 - local48.aClass25_Sub2_Sub5_1.aShort48;
			super.anInt8515 = (int) ((float) super.anInt8515 - (float) local75 / 10.0F);
		}
		local19.U(super.anInt8476, -super.anInt8515 + super.anInt8480 - 20, super.anInt8482);
		@Pc(104) Class122 local104 = this.method6683();
		@Pc(117) Class213 local117 = this.aClass213_1.anIntArray345 == null ? this.aClass213_1 : this.aClass213_1.method4998(Static206.aClass143_3);
		super.aBoolean580 = false;
		if (Static348.aClass3_Sub51_Sub1_5.aBoolean684 && local117.aBoolean437 && local104.aBoolean284) {
			@Pc(147) Class270 local147 = super.anInt8545 != -1 && super.anInt8492 == 0 ? Static245.aClass155_1.method3820(super.anInt8545) : null;
			@Pc(164) Class270 local164 = super.anInt8516 == -1 || super.aBoolean579 && local147 != null ? null : Static245.aClass155_1.method3820(super.anInt8516);
			@Pc(214) Class52 local214 = Static469.method7148(this.aClass213_1.aShort80 & 0xFFFF, arg0, this.aClass213_1.aByte83 & 0xFF, local164 == null ? local147 : local164, this.aClass213_1.anInt6196, super.anInt8534, super.aClass52Array3[0], this.aClass213_1.aShort81 & 0xFFFF, super.anInt8555, local164 == null ? super.anInt8539 : super.anInt8517, super.anInt8505, this.aClass213_1.aByte79 & 0xFF, local24);
			if (local214 != null) {
				super.aBoolean580 = true;
				arg0.ZA(false);
				if (Static547.aBoolean631) {
					local214.method7619(local19, null, Static150.anInt3469, 0);
				} else {
					local214.method7617(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt8476, -super.anInt8515 + super.anInt8480 - 5, super.anInt8482);
		@Pc(259) Class25_Sub10 local259 = null;
		if (this.method6689()) {
			local259 = Static65.method1625(super.aClass52Array3.length);
		}
		this.method6663(arg0, local19, super.aClass52Array3, false);
		@Pc(281) int local281;
		if (Static547.aBoolean631) {
			for (local281 = 0; local281 < super.aClass52Array3.length; local281++) {
				if (super.aClass52Array3[local281] != null) {
					super.aClass52Array3[local281].method7619(local19, local259 == null ? null : local259.aClass25_Sub1Array1[local281], Static150.anInt3469, 0);
				}
			}
		} else {
			for (local281 = 0; super.aClass52Array3.length > local281; local281++) {
				if (super.aClass52Array3[local281] != null) {
					super.aClass52Array3[local281].method7617(local19, local259 == null ? null : local259.aClass25_Sub1Array1[local281], 0);
				}
			}
		}
		if (super.aClass25_Sub7_7 != null) {
			@Pc(353) Class323 local353 = super.aClass25_Sub7_7.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local353, Static150.anInt3469);
			} else {
				arg0.method8090(local353);
			}
		}
		for (local281 = 0; super.aClass52Array3.length > local281; local281++) {
			if (super.aClass52Array3[local281] != null) {
				super.aBoolean580 |= super.aClass52Array3[local281].LA();
			}
		}
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		super.anInt8564 = Static335.anInt6052;
		return local259;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBZIII)V")
	public void method6688(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte117 = super.aByte118 = (byte) arg3;
		if (Static269.method4098(arg2, arg4)) {
			super.aByte118++;
		}
		if (super.anInt8545 != -1 && Static245.aClass155_1.method3820(super.anInt8545).anInt7695 == 1) {
			super.anIntArray508 = null;
			super.anInt8545 = -1;
		}
		@Pc(56) Class250 local56;
		if (super.anInt8548 != -1) {
			local56 = Static386.aClass23_1.method228(super.anInt8548);
			if (local56.aBoolean484 && local56.anInt7025 != -1 && Static245.aClass155_1.method3820(local56.anInt7025).anInt7695 == 1) {
				super.anInt8548 = -1;
			}
		}
		if (super.anInt8508 != -1) {
			local56 = Static386.aClass23_1.method228(super.anInt8508);
			if (local56.aBoolean484 && local56.anInt7025 != -1 && Static245.aClass155_1.method3820(local56.anInt7025).anInt7695 == 1) {
				super.anInt8508 = -1;
			}
		}
		if (!arg1) {
			@Pc(124) int local124 = arg2 - super.anIntArray512[0];
			@Pc(132) int local132 = arg4 - super.anIntArray513[0];
			if (local124 >= -8 && local124 <= 8 && local132 >= -8 && local132 <= 8) {
				if (super.anInt8580 < 9) {
					super.anInt8580++;
				}
				for (@Pc(163) int local163 = super.anInt8580; local163 > 0; local163--) {
					super.anIntArray512[local163] = super.anIntArray512[local163 - 1];
					super.anIntArray513[local163] = super.anIntArray513[local163 - 1];
					super.aByteArray209[local163] = super.aByteArray209[local163 - 1];
				}
				super.anIntArray512[0] = arg2;
				super.anIntArray513[0] = arg4;
				super.aByteArray209[0] = 1;
				return;
			}
		}
		super.anInt8580 = 0;
		super.anInt8578 = 0;
		super.anIntArray512[0] = arg2;
		super.anInt8579 = 0;
		super.anIntArray513[0] = arg4;
		super.anInt8476 = (arg0 << 8) + (super.anIntArray512[0] << 9);
		super.anInt8482 = (arg0 << 8) + (super.anIntArray513[0] << 9);
		if (super.aClass25_Sub7_7 != null) {
			super.aClass25_Sub7_7.method3785();
		}
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass213_1 == null || !this.method6691(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class42 local19 = arg1.method8052();
		@Pc(24) int local24 = super.aClass252_7.method5714();
		local19.o(local24);
		local19.U(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass52Array3.length; local39++) {
			if (super.aClass52Array3[local39] != null) {
				@Pc(74) boolean local74 = this.aClass213_1.anInt6200 == -1 ? this.aClass213_1.anInt6196 == 1 : this.aClass213_1.anInt6200 == 1;
				@Pc(87) boolean local87;
				if (Static547.aBoolean631) {
					local87 = super.aClass52Array3[local39].method7612(arg2, arg0, local19, local74, Static150.anInt3469);
				} else {
					local87 = super.aClass52Array3[local39].method7635(arg2, arg0, local19, local74);
				}
				if (local87) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I")
	@Override
	protected int method6665() {
		if (this.aClass213_1.anIntArray345 != null) {
			@Pc(18) Class213 local18 = this.aClass213_1.method4998(Static206.aClass143_3);
			if (local18 != null && local18.anInt6182 != -1) {
				return local18.anInt6182;
			}
		}
		return this.aClass213_1.anInt6182;
	}

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "(I)Z")
	private boolean method6689() {
		return this.aClass213_1.aBoolean443;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLclient!ms;)V")
	public void method6690(@OriginalArg(1) Class213 arg0) {
		this.aClass213_1 = arg0;
		if (super.aClass25_Sub7_7 != null) {
			super.aClass25_Sub7_7.method3785();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!r;II)Z")
	private boolean method6691(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1;
		@Pc(17) Class122 local17 = this.method6683();
		@Pc(33) Class270 local33 = super.anInt8545 != -1 && super.anInt8492 == 0 ? Static245.aClass155_1.method3820(super.anInt8545) : null;
		@Pc(50) Class270 local50 = super.anInt8516 == -1 || super.aBoolean579 && local33 != null ? null : Static245.aClass155_1.method3820(super.anInt8516);
		@Pc(53) int local53 = local17.anInt4191;
		@Pc(56) int local56 = local17.anInt4196;
		if (local53 != 0 || local56 != 0 || local17.anInt4223 != 0 || local17.anInt4199 != 0) {
			arg1 |= 0x7;
		}
		@Pc(99) boolean local99 = super.aByte122 != 0 && super.anInt8530 <= Static397.anInt6998 && super.anInt8510 > Static397.anInt6998;
		if (local99) {
			arg1 |= 0x80000;
		}
		@Pc(110) int local110 = super.aClass252_7.method5714();
		@Pc(146) Class52 local146 = super.aClass52Array3[0] = this.aClass213_1.method5002(local110, local33, local50, super.anIntArray509, super.anInt8526, Static98.aClass313_1, super.anInt8517, super.lb, super.anInt8522, super.anInt8521, arg1, super.aClass271Array3, super.anInt8539, Static206.aClass143_3, arg0, Static245.aClass155_1);
		if (local146 == null) {
			return false;
		}
		super.anInt8562 = local146.J();
		super.anInt8497 = local146.RA();
		this.method6666(local146);
		if (local53 == 0 && local56 == 0) {
			this.method6679(0, this.method6668() << 9, 0, this.method6668() << 9, local110);
		} else {
			this.method6679(local17.anInt4217, local53, local17.anInt4183, local56, local110);
			if (super.anInt8555 != 0) {
				super.aClass52Array3[0].MA(super.anInt8555);
			}
			if (super.anInt8534 != 0) {
				super.aClass52Array3[0].W(super.anInt8534);
			}
			if (super.anInt8505 != 0) {
				super.aClass52Array3[0].oa(0, super.anInt8505, 0);
			}
		}
		if (local99) {
			local146.method7631(super.aByte120, super.aByte121, super.aByte123, super.aByte122 & 0xFF);
		}
		@Pc(271) Class250 local271;
		@Pc(286) boolean local286;
		@Pc(288) int local288;
		@Pc(328) Class52 local328;
		if (super.anInt8548 == -1 || super.anInt8567 == -1) {
			super.aClass52Array3[1] = null;
		} else {
			local271 = Static386.aClass23_1.method228(super.anInt8548);
			local286 = local271.aByte99 == 3 && (local53 != 0 || local56 != 0);
			local288 = local13;
			if (local286) {
				local288 = local13 | 0x7;
			} else {
				if (super.anInt8498 != 0) {
					local288 = local13 | 0x5;
				}
				if (super.anInt8537 != 0) {
					local288 |= 0x2;
				}
			}
			local328 = super.aClass52Array3[1] = local271.method5609(super.anInt8567, Static245.aClass155_1, super.anInt8561, arg0, super.anInt8540, local288);
			if (local328 != null) {
				if (super.anInt8537 != 0) {
					local328.oa(0, -super.anInt8537 << 2, 0);
				}
				if (super.anInt8498 != 0) {
					local328.M(super.anInt8498 * 2048);
				}
				if (local286) {
					if (super.anInt8555 != 0) {
						local328.MA(super.anInt8555);
					}
					if (super.anInt8534 != 0) {
						local328.W(super.anInt8534);
					}
					if (super.anInt8505 != 0) {
						local328.oa(0, super.anInt8505, 0);
					}
				}
			}
		}
		if (super.anInt8508 == -1 || super.anInt8495 == -1) {
			super.aClass52Array3[2] = null;
		} else {
			local271 = Static386.aClass23_1.method228(super.anInt8508);
			local286 = local271.aByte99 == 3 && (local53 != 0 || local56 != 0);
			local288 = local13;
			if (local286) {
				local288 = local13 | 0x7;
			} else {
				if (super.anInt8557 != 0) {
					local288 = local13 | 0x5;
				}
				if (super.anInt8565 != 0) {
					local288 |= 0x2;
				}
			}
			local328 = super.aClass52Array3[2] = local271.method5608(arg0, local288, super.anInt8499, super.anInt8495, Static245.aClass155_1, super.anInt8504);
			if (local328 != null) {
				if (super.anInt8565 != 0) {
					local328.oa(0, -super.anInt8565 << 2, 0);
				}
				if (super.anInt8557 != 0) {
					local328.M(super.anInt8557 * 2048);
				}
				if (local286) {
					if (super.anInt8555 != 0) {
						local328.MA(super.anInt8555);
					}
					if (super.anInt8534 != 0) {
						local328.W(super.anInt8534);
					}
					if (super.anInt8505 != 0) {
						local328.oa(0, super.anInt8505, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		if (this.aClass213_1 == null || !super.aBoolean581 && !this.method6691(arg0, 0)) {
			return;
		}
		@Pc(20) Class42 local20 = arg0.method8052();
		local20.o(super.aClass252_7.method5714());
		local20.U(super.anInt8476, super.anInt8480 - 20, super.anInt8482);
		this.method6663(arg0, local20, super.aClass52Array3, super.aBoolean581);
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)I")
	@Override
	public int method6675() {
		if (this.aClass213_1.anIntArray345 != null) {
			@Pc(13) Class213 local13 = this.aClass213_1.method4998(Static206.aClass143_3);
			if (local13 != null && local13.anInt6204 != -1) {
				return local13.anInt6204;
			}
		}
		return this.aClass213_1.anInt6204 == -1 ? super.method6675() : this.aClass213_1.anInt6204;
	}

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "(I)Z")
	public boolean method6694() {
		return this.aClass213_1 != null;
	}
}
