import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class1_Sub4_Sub2_Sub1_Sub1 extends Class1_Sub4_Sub2_Sub1 {

	@OriginalMember(owner = "client!kfa", name = "dd", descriptor = "Lclient!rb;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!kfa", name = "Xc", descriptor = "I")
	public int anInt5244 = -1;

	@OriginalMember(owner = "client!kfa", name = "od", descriptor = "I")
	public int anInt5258 = -1;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!rb;I)V")
	public void method4510(@OriginalArg(0) Class283 arg0) {
		this.aClass283_1 = arg0;
		if (super.aClass1_Sub2_6 != null) {
			super.aClass1_Sub2_6.method336();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		if (this.aClass283_1 == null || !this.method4515(2048, arg0)) {
			return null;
		}
		@Pc(19) Class8 local19 = arg0.method5007();
		@Pc(24) int local24 = super.aClass229_7.method5582();
		local19.o(local24);
		@Pc(48) Class53 local48 = Static60.aClass53ArrayArrayArray1[super.aByte126][super.anInt9934 >> Static145.anInt3093][super.anInt9935 >> Static145.anInt3093];
		if (local48 == null || local48.aClass1_Sub4_Sub4_1 == null) {
			super.anInt8411 = (int) ((float) super.anInt8411 - (float) super.anInt8411 / 10.0F);
		} else {
			@Pc(74) int local74 = super.anInt8411 - local48.aClass1_Sub4_Sub4_1.aShort83;
			super.anInt8411 = (int) ((float) super.anInt8411 - (float) local74 / 10.0F);
		}
		local19.U(super.anInt9934, super.anInt9932 - super.anInt8411 - 20, super.anInt9935);
		@Pc(102) Class316 local102 = this.method6921();
		@Pc(115) Class283 local115 = this.aClass283_1.anIntArray453 == null ? this.aClass283_1 : this.aClass283_1.method6834(Static45.aClass148_1);
		super.aBoolean593 = false;
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean251 && local115.aBoolean576 && local102.aBoolean639) {
			@Pc(142) Class365 local142 = super.anInt8412 != -1 && super.anInt8378 == 0 ? Static61.aClass48_1.method1016(super.anInt8412) : null;
			@Pc(159) Class365 local159 = super.anInt8409 == -1 || super.aBoolean589 && local142 != null ? null : Static61.aClass48_1.method1016(super.anInt8409);
			@Pc(209) Class57 local209 = Static474.method7129(local159 == null ? super.anInt8391 : super.anInt8398, super.anInt8366, super.anInt8389, this.aClass283_1.aShort90 & 0xFFFF, this.aClass283_1.aShort89 & 0xFFFF, arg0, local24, this.aClass283_1.aByte92 & 0xFF, local159 == null ? local142 : local159, this.aClass283_1.anInt8266, super.aClass57Array3[0], super.anInt8375, this.aClass283_1.aByte93 & 0xFF);
			if (local209 != null) {
				super.aBoolean593 = true;
				arg0.ZA(false);
				if (Static361.aBoolean500) {
					local209.method7919(local19, null, Static6.anInt161, 0);
				} else {
					local209.method7927(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt9934, super.anInt9932 - super.anInt8411 - 5, super.anInt9935);
		@Pc(253) Class1_Sub8 local253 = null;
		if (this.method4516()) {
			local253 = Static361.method5833(super.aClass57Array3.length);
		}
		this.method6924(super.aClass57Array3, false, local19, arg0);
		@Pc(277) int local277;
		if (Static361.aBoolean500) {
			for (local277 = 0; super.aClass57Array3.length > local277; local277++) {
				if (super.aClass57Array3[local277] != null) {
					super.aClass57Array3[local277].method7919(local19, local253 == null ? null : local253.aClass1_Sub9Array1[local277], Static6.anInt161, 0);
				}
			}
		} else {
			for (local277 = 0; local277 < super.aClass57Array3.length; local277++) {
				if (super.aClass57Array3[local277] != null) {
					super.aClass57Array3[local277].method7927(local19, local253 == null ? null : local253.aClass1_Sub9Array1[local277], 0);
				}
			}
		}
		if (super.aClass1_Sub2_6 != null) {
			@Pc(349) Class305 local349 = super.aClass1_Sub2_6.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local349, Static6.anInt161);
			} else {
				arg0.method5017(local349);
			}
		}
		for (local277 = 0; local277 < super.aClass57Array3.length; local277++) {
			if (super.aClass57Array3[local277] != null) {
				super.aBoolean593 |= super.aClass57Array3[local277].LA();
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		super.anInt8431 = Static203.anInt3850;
		return local253;
	}

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "(B)I")
	@Override
	public int method6935() {
		if (this.aClass283_1.anIntArray453 != null) {
			@Pc(22) Class283 local22 = this.aClass283_1.method6834(Static45.aClass148_1);
			if (local22 != null && local22.anInt8236 != -1) {
				return local22.anInt8236;
			}
		}
		return this.aClass283_1.anInt8236 == -1 ? super.method6935() : this.aClass283_1.anInt8236;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BIIIZI)V")
	public void method4512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte126 = super.aByte127 = (byte) arg4;
		if (Static310.method5267(arg2, arg1)) {
			super.aByte127++;
		}
		if (super.anInt8412 != -1 && Static61.aClass48_1.method1016(super.anInt8412).anInt10226 == 1) {
			super.anIntArray459 = null;
			super.anInt8412 = -1;
		}
		@Pc(53) Class200 local53;
		if (super.anInt8403 != -1) {
			local53 = Static569.aClass213_2.method5291(super.anInt8403);
			if (local53.aBoolean441 && local53.anInt5925 != -1 && Static61.aClass48_1.method1016(local53.anInt5925).anInt10226 == 1) {
				super.anInt8403 = -1;
			}
		}
		if (super.anInt8406 != -1) {
			local53 = Static569.aClass213_2.method5291(super.anInt8406);
			if (local53.aBoolean441 && local53.anInt5925 != -1 && Static61.aClass48_1.method1016(local53.anInt5925).anInt10226 == 1) {
				super.anInt8406 = -1;
			}
		}
		if (!arg3) {
			@Pc(114) int local114 = arg2 - super.anIntArray463[0];
			@Pc(122) int local122 = arg1 - super.anIntArray462[0];
			if (local114 >= -8 && local114 <= 8 && local122 >= -8 && local122 <= 8) {
				if (super.anInt8447 < 9) {
					super.anInt8447++;
				}
				for (@Pc(149) int local149 = super.anInt8447; local149 > 0; local149--) {
					super.anIntArray463[local149] = super.anIntArray463[local149 - 1];
					super.anIntArray462[local149] = super.anIntArray462[local149 - 1];
					super.aByteArray94[local149] = super.aByteArray94[local149 - 1];
				}
				super.anIntArray463[0] = arg2;
				super.anIntArray462[0] = arg1;
				super.aByteArray94[0] = 1;
				return;
			}
		}
		super.anInt8447 = 0;
		super.anInt8448 = 0;
		super.anIntArray463[0] = arg2;
		super.anInt8445 = 0;
		super.anIntArray462[0] = arg1;
		super.anInt9934 = (arg0 << 8) + (super.anIntArray463[0] << 9);
		super.anInt9935 = (super.anIntArray462[0] << 9) + (arg0 << 8);
		if (super.aClass1_Sub2_6 != null) {
			super.aClass1_Sub2_6.method336();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass283_1 == null || !this.method4515(131072, arg0)) {
			return false;
		}
		@Pc(19) Class8 local19 = arg0.method5007();
		@Pc(24) int local24 = super.aClass229_7.method5582();
		local19.o(local24);
		local19.U(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(37) boolean local37 = false;
		for (@Pc(44) int local44 = 0; super.aClass57Array3.length > local44; local44++) {
			if (super.aClass57Array3[local44] != null) {
				@Pc(74) boolean local74 = this.aClass283_1.anInt8245 == -1 ? this.aClass283_1.anInt8266 == 1 : this.aClass283_1.anInt8245 == 1;
				@Pc(86) boolean local86;
				if (Static361.aBoolean500) {
					local86 = super.aClass57Array3[local44].method7924(arg1, arg2, local19, local74, Static6.anInt161);
				} else {
					local86 = super.aClass57Array3[local44].method7933(arg1, arg2, local19, local74);
				}
				if (local86) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BII)V")
	public void method4514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray463[0];
		@Pc(15) int local15 = super.anIntArray462[0];
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
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt8412 != -1 && Static61.aClass48_1.method1016(super.anInt8412).anInt10226 == 1) {
			super.anInt8412 = -1;
			super.anIntArray459 = null;
		}
		@Pc(95) Class200 local95;
		if (super.anInt8403 != -1) {
			local95 = Static569.aClass213_2.method5291(super.anInt8403);
			if (local95.aBoolean441 && local95.anInt5925 != -1 && Static61.aClass48_1.method1016(local95.anInt5925).anInt10226 == 1) {
				super.anInt8403 = -1;
			}
		}
		if (super.anInt8406 != -1) {
			local95 = Static569.aClass213_2.method5291(super.anInt8406);
			if (local95.aBoolean441 && local95.anInt5925 != -1 && Static61.aClass48_1.method1016(local95.anInt5925).anInt10226 == 1) {
				super.anInt8406 = -1;
			}
		}
		if (super.anInt8447 < 9) {
			super.anInt8447++;
		}
		for (@Pc(160) int local160 = super.anInt8447; local160 > 0; local160--) {
			super.anIntArray463[local160] = super.anIntArray463[local160 - 1];
			super.anIntArray462[local160] = super.anIntArray462[local160 - 1];
			super.aByteArray94[local160] = super.aByteArray94[local160 - 1];
		}
		super.anIntArray463[0] = local10;
		super.anIntArray462[0] = local15;
		super.aByteArray94[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)I")
	@Override
	protected int method6927() {
		if (this.aClass283_1.anIntArray453 != null) {
			@Pc(17) Class283 local17 = this.aClass283_1.method6834(Static45.aClass148_1);
			if (local17 != null && local17.anInt8256 != -1) {
				return local17.anInt8256;
			}
		}
		return this.aClass283_1.anInt8256;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)I")
	@Override
	public int method6932() {
		if (this.aClass283_1.anIntArray453 != null) {
			@Pc(13) Class283 local13 = this.aClass283_1.method6834(Static45.aClass148_1);
			if (local13 != null && local13.anInt8250 != -1) {
				return local13.anInt8250;
			}
		}
		return this.aClass283_1.anInt8250;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		if (this.aClass283_1 == null || !super.aBoolean592 && !this.method4515(0, arg0)) {
			return;
		}
		@Pc(26) Class8 local26 = arg0.method5007();
		local26.o(super.aClass229_7.method5582());
		local26.U(super.anInt9934, super.anInt9932 - 20, super.anInt9935);
		this.method6924(super.aClass57Array3, super.aBoolean592, local26, arg0);
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = null;
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!r;I)Z")
	private boolean method4515(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(13) Class316 local13 = this.method6921();
		@Pc(28) Class365 local28 = super.anInt8412 != -1 && super.anInt8378 == 0 ? Static61.aClass48_1.method1016(super.anInt8412) : null;
		@Pc(53) Class365 local53 = super.anInt8409 == -1 || super.aBoolean589 && local28 != null ? null : Static61.aClass48_1.method1016(super.anInt8409);
		@Pc(56) int local56 = local13.anInt9118;
		@Pc(59) int local59 = local13.anInt9144;
		if (local56 != 0 || local59 != 0 || local13.anInt9139 != 0 || local13.anInt9164 != 0) {
			arg0 |= 0x7;
		}
		@Pc(108) boolean local108 = super.aByte104 != 0 && Static106.anInt2418 >= super.anInt8377 && Static106.anInt2418 < super.anInt8418;
		if (local108) {
			arg0 |= 0x80000;
		}
		@Pc(119) int local119 = super.aClass229_7.method5582();
		@Pc(153) Class57 local153 = super.aClass57Array3[0] = this.aClass283_1.method6840(super.anInt8369, super.anInt8398, super.anInt8391, arg1, local53, super.anInt8433, local119, arg0, super.anInt8392, Static61.aClass48_1, Static462.aClass178_1, local28, super.anInt8386, super.aClass129Array3, super.anIntArray458, Static45.aClass148_1);
		if (local153 == null) {
			return false;
		}
		super.anInt8401 = local153.J();
		super.anInt8420 = local153.RA();
		this.method6923(local153);
		if (local56 == 0 && local59 == 0) {
			this.method6930(this.method6925() << 9, this.method6925() << 9, local119, 0, 0);
		} else {
			this.method6930(local56, local59, local119, local13.anInt9137, local13.anInt9123);
			if (super.anInt8375 != 0) {
				super.aClass57Array3[0].MA(super.anInt8375);
			}
			if (super.anInt8389 != 0) {
				super.aClass57Array3[0].W(super.anInt8389);
			}
			if (super.anInt8366 != 0) {
				super.aClass57Array3[0].oa(0, super.anInt8366, 0);
			}
		}
		if (local108) {
			local153.method7917(super.aByte105, super.aByte106, super.aByte107, super.aByte104 & 0xFF);
		}
		@Pc(273) Class200 local273;
		@Pc(287) boolean local287;
		@Pc(289) int local289;
		@Pc(334) Class57 local334;
		if (super.anInt8403 == -1 || super.anInt8417 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local273 = Static569.aClass213_2.method5291(super.anInt8403);
			local287 = local273.aByte64 == 3 && (local56 != 0 || local59 != 0);
			local289 = local7;
			if (local287) {
				local289 = local7 | 0x7;
			} else {
				if (super.anInt8437 != 0) {
					local289 = local7 | 0x5;
				}
				if (super.anInt8380 != 0) {
					local289 |= 0x2;
				}
			}
			local334 = super.aClass57Array3[1] = local273.method5070(super.anInt8397, local289, arg1, Static61.aClass48_1, super.anInt8417, super.anInt8396);
			if (local334 != null) {
				if (super.anInt8380 != 0) {
					local334.oa(0, -super.anInt8380 << 2, 0);
				}
				if (super.anInt8437 != 0) {
					local334.M(super.anInt8437 * 2048);
				}
				if (local287) {
					if (super.anInt8375 != 0) {
						local334.MA(super.anInt8375);
					}
					if (super.anInt8389 != 0) {
						local334.W(super.anInt8389);
					}
					if (super.anInt8366 != 0) {
						local334.oa(0, super.anInt8366, 0);
					}
				}
			}
		}
		if (super.anInt8406 == -1 || super.anInt8383 == -1) {
			super.aClass57Array3[2] = null;
		} else {
			local273 = Static569.aClass213_2.method5291(super.anInt8406);
			local287 = local273.aByte64 == 3 && (local56 != 0 || local59 != 0);
			local289 = local7;
			if (local287) {
				local289 = local7 | 0x7;
			} else {
				if (super.anInt8438 != 0) {
					local289 = local7 | 0x5;
				}
				if (super.anInt8387 != 0) {
					local289 |= 0x2;
				}
			}
			local334 = super.aClass57Array3[2] = local273.method5072(super.anInt8383, super.anInt8421, Static61.aClass48_1, local289, arg1, super.anInt8432);
			if (local334 != null) {
				if (super.anInt8387 != 0) {
					local334.oa(0, -super.anInt8387 << 2, 0);
				}
				if (super.anInt8438 != 0) {
					local334.M(super.anInt8438 * 2048);
				}
				if (local287) {
					if (super.anInt8375 != 0) {
						local334.MA(super.anInt8375);
					}
					if (super.anInt8389 != 0) {
						local334.W(super.anInt8389);
					}
					if (super.anInt8366 != 0) {
						local334.oa(0, super.anInt8366, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "(B)Z")
	private boolean method4516() {
		return this.aClass283_1.aBoolean575;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "(B)Z")
	public boolean method4517() {
		return this.aClass283_1 != null;
	}
}
