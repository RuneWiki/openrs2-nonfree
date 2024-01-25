import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class3_Sub1_Sub2_Sub2_Sub2 extends Class3_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!vk", name = "Yc", descriptor = "Lclient!gfa;")
	public Class133 aClass133_1;

	@OriginalMember(owner = "client!vk", name = "md", descriptor = "I")
	public int anInt10019;

	@OriginalMember(owner = "client!vk", name = "od", descriptor = "Ljava/lang/String;")
	public String aString120;

	@OriginalMember(owner = "client!vk", name = "td", descriptor = "Lclient!td;")
	public Class345 aClass345_1;

	@OriginalMember(owner = "client!vk", name = "Uc", descriptor = "I")
	public int anInt10004 = -1;

	@OriginalMember(owner = "client!vk", name = "fd", descriptor = "I")
	public int anInt10012 = -1;

	@OriginalMember(owner = "client!vk", name = "id", descriptor = "I")
	public int anInt10015 = 1;

	@OriginalMember(owner = "client!vk", name = "ud", descriptor = "I")
	public int anInt10025 = 1;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(Z)I")
	@Override
	public int method8520() {
		if (this.aClass345_1.anIntArray624 != null) {
			@Pc(18) Class345 local18 = this.aClass345_1.method7529(Static526.aClass293_1);
			if (local18 != null && local18.anInt8783 != -1) {
				return local18.anInt8783;
			}
		}
		return this.aClass345_1.anInt8783 == -1 ? super.method8520() : this.aClass345_1.anInt8783;
	}

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)I")
	@Override
	public int method8519() {
		if (this.aClass345_1.anIntArray624 != null) {
			@Pc(13) Class345 local13 = this.aClass345_1.method7529(Static526.aClass293_1);
			if (local13 != null && local13.anInt8801 != -1) {
				return local13.anInt8801;
			}
		}
		return this.aClass345_1.anInt8801;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Z")
	public boolean method8531() {
		return this.aClass345_1 != null;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method8532(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class377 local9 = this.method8525();
		@Pc(30) Class124 local30 = super.anInt9981 != -1 && super.anInt9934 == 0 ? Static99.aClass2_1.method22(super.anInt9981) : null;
		@Pc(49) Class124 local49 = super.anInt9967 == -1 || super.aBoolean776 && local30 != null ? null : Static99.aClass2_1.method22(super.anInt9967);
		@Pc(52) int local52 = local9.anInt10048;
		@Pc(55) int local55 = local9.anInt10029;
		if (local52 != 0 || local55 != 0 || local9.anInt10071 != 0 || local9.anInt10069 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte147 != 0 && Static177.anInt3088 >= super.anInt9956 && super.anInt9994 > Static177.anInt3088;
		if (local98) {
			arg0 |= 0x80000;
		}
		@Pc(109) int local109 = super.aClass240_7.method4986();
		@Pc(145) Class62 local145 = super.aClass62Array3[0] = this.aClass345_1.method7536(Static99.aClass2_1, super.anInt9972, super.anInt9946, super.anInt9960, super.anInt9940, super.anInt9941, arg1, this.aClass133_1, super.anIntArray684, Static116.aClass177_1, local109, Static526.aClass293_1, arg0, local30, super.anInt9973, super.aClass143Array3, local49);
		if (local145 == null) {
			return false;
		}
		super.anInt9951 = local145.fa();
		super.anInt9939 = local145.ma();
		this.method8518(local145);
		if (local52 == 0 && local55 == 0) {
			this.method8529(this.method8514() << 9, 0, local109, 0, this.method8514() << 9);
		} else {
			this.method8529(local55, local9.anInt10056, local109, local9.anInt10030, local52);
			if (super.anInt9978 != 0) {
				super.aClass62Array3[0].FA(super.anInt9978);
			}
			if (super.anInt9954 != 0) {
				super.aClass62Array3[0].VA(super.anInt9954);
			}
			if (super.anInt9948 != 0) {
				super.aClass62Array3[0].H(0, super.anInt9948, 0);
			}
		}
		if (local98) {
			local145.method7349(super.aByte145, super.aByte144, super.aByte146, super.aByte147 & 0xFF);
		}
		this.method8523(local109, arg1, local52, local5, local9, local55);
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "(Z)I")
	@Override
	protected int method8527() {
		if (this.aClass345_1.anIntArray624 != null) {
			@Pc(13) Class345 local13 = this.aClass345_1.method7529(Static526.aClass293_1);
			if (local13 != null && local13.anInt8793 != -1) {
				return local13.anInt8793;
			}
		}
		return this.aClass345_1.anInt8793;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIZ)V")
	public void method8534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte141 = super.aByte142 = (byte) arg1;
		if (Static547.method7286(arg2, arg0)) {
			super.aByte142++;
		}
		if (super.anInt9981 != -1 && Static99.aClass2_1.method22(super.anInt9981).anInt3030 == 1) {
			super.anIntArray690 = null;
			super.anInt9981 = -1;
		}
		for (@Pc(45) int local45 = 0; local45 < super.aClass78Array3.length; local45++) {
			if (super.aClass78Array3[local45].anInt2180 != -1) {
				@Pc(64) Class323 local64 = Static341.aClass349_1.method7597(super.aClass78Array3[local45].anInt2180);
				if (local64.aBoolean644 && local64.anInt8322 != -1 && Static99.aClass2_1.method22(local64.anInt8322).anInt3030 == 1) {
					super.aClass78Array3[local45].anInt2180 = -1;
				}
			}
		}
		if (!arg4) {
			@Pc(104) int local104 = arg2 - super.anIntArray693[0];
			@Pc(112) int local112 = arg0 - super.anIntArray694[0];
			if (local104 >= -8 && local104 <= 8 && local112 >= -8 && local112 <= 8) {
				if (super.anInt10003 < 9) {
					super.anInt10003++;
				}
				for (@Pc(145) int local145 = super.anInt10003; local145 > 0; local145--) {
					super.anIntArray693[local145] = super.anIntArray693[local145 - 1];
					super.anIntArray694[local145] = super.anIntArray694[local145 - 1];
					super.aByteArray102[local145] = super.aByteArray102[local145 - 1];
				}
				super.anIntArray693[0] = arg2;
				super.aByteArray102[0] = 1;
				super.anIntArray694[0] = arg0;
				return;
			}
		}
		super.anIntArray693[0] = arg2;
		super.anInt10002 = 0;
		super.anInt10001 = 0;
		super.anInt10003 = 0;
		super.anIntArray694[0] = arg0;
		super.anInt9917 = (arg3 << 8) + (super.anIntArray694[0] << 9);
		super.anInt9925 = (arg3 << 8) + (super.anIntArray693[0] << 9);
		if (super.aClass3_Sub7_8 != null) {
			super.aClass3_Sub7_8.method7303();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		if (this.aClass345_1 == null || !super.aBoolean777 && !this.method8532(0, arg0)) {
			return;
		}
		@Pc(26) Class92 local26 = arg0.method8078();
		local26.method3858(super.aClass240_7.method4986());
		local26.method3851(super.anInt9925, super.anInt9915 - 20, super.anInt9917);
		this.method8517(local26, super.aBoolean777, arg0, super.aClass62Array3);
		for (@Pc(53) int local53 = 0; super.aClass62Array3.length > local53; local53++) {
			super.aClass62Array3[local53] = null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(III)V")
	public void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray693[0];
		@Pc(15) int local15 = super.anIntArray694[0];
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
			local15--;
			local10++;
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
		if (super.anInt9981 != -1 && Static99.aClass2_1.method22(super.anInt9981).anInt3030 == 1) {
			super.anInt9981 = -1;
			super.anIntArray690 = null;
		}
		for (@Pc(85) int local85 = 0; local85 < super.aClass78Array3.length; local85++) {
			if (super.aClass78Array3[local85].anInt2180 != -1) {
				@Pc(104) Class323 local104 = Static341.aClass349_1.method7597(super.aClass78Array3[local85].anInt2180);
				if (local104.aBoolean644 && local104.anInt8322 != -1 && Static99.aClass2_1.method22(local104.anInt8322).anInt3030 == 1) {
					super.aClass78Array3[local85].anInt2180 = -1;
				}
			}
		}
		if (super.anInt10003 < 9) {
			super.anInt10003++;
		}
		for (@Pc(150) int local150 = super.anInt10003; local150 > 0; local150--) {
			super.anIntArray693[local150] = super.anIntArray693[local150 - 1];
			super.anIntArray694[local150] = super.anIntArray694[local150 - 1];
			super.aByteArray102[local150] = super.aByteArray102[local150 - 1];
		}
		super.anIntArray693[0] = local10;
		super.aByteArray102[0] = (byte) arg0;
		super.anIntArray694[0] = local15;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		if (this.aClass345_1 == null || !this.method8532(2048, arg0)) {
			return null;
		}
		@Pc(19) Class92 local19 = arg0.method8078();
		@Pc(24) int local24 = super.aClass240_7.method4986();
		local19.method3858(local24);
		@Pc(42) Class73 local42 = Static267.aClass73ArrayArrayArray2[super.aByte141][super.anInt9925 >> Static273.anInt4424][super.anInt9917 >> Static273.anInt4424];
		if (local42 == null || local42.aClass3_Sub1_Sub5_1 == null) {
			super.anInt9962 = (int) ((float) super.anInt9962 - (float) super.anInt9962 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt9962 - local42.aClass3_Sub1_Sub5_1.aShort105;
			super.anInt9962 = (int) ((float) super.anInt9962 - (float) local55 / 10.0F);
		}
		local19.method3851(super.anInt9925, super.anInt9915 - super.anInt9962 - 20, super.anInt9917);
		@Pc(97) Class377 local97 = this.method8525();
		@Pc(110) Class345 local110 = this.aClass345_1.anIntArray624 == null ? this.aClass345_1 : this.aClass345_1.method7529(Static526.aClass293_1);
		super.aBoolean778 = false;
		@Pc(115) Class3_Sub6 local115 = null;
		if (Static124.aClass4_Sub20_4.aClass8_Sub19_1.method6698() == 1 && local110.aBoolean696 && local97.aBoolean780) {
			@Pc(144) Class124 local144 = super.anInt9981 != -1 && super.anInt9934 == 0 ? Static99.aClass2_1.method22(super.anInt9981) : null;
			@Pc(162) Class124 local162 = super.anInt9967 == -1 || super.aBoolean776 && local144 != null ? null : Static99.aClass2_1.method22(super.anInt9967);
			@Pc(212) Class62 local212 = Static430.method5938(super.anInt9948, this.aClass345_1.aByte133 & 0xFF, super.aClass62Array3[0], this.aClass345_1.aShort114 & 0xFFFF, local162 == null ? local144 : local162, arg0, local162 == null ? super.anInt9960 : super.anInt9973, this.aClass345_1.aByte131 & 0xFF, super.anInt9954, local24, super.anInt9978, this.aClass345_1.anInt8812, this.aClass345_1.aShort113 & 0xFFFF);
			if (local212 != null) {
				local115 = Static665.method8806(super.aClass62Array3.length + 1, this.method8536());
				super.aBoolean778 = true;
				arg0.C(false);
				if (Static499.aBoolean608) {
					local212.method7332(local19, local115.aClass3_Sub4Array1[super.aClass62Array3.length], Static140.anInt8126, 0);
				} else {
					local212.method7335(local19, local115.aClass3_Sub4Array1[super.aClass62Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method3858(local24);
		local19.method3851(super.anInt9925, -super.anInt9962 + super.anInt9915 - 5, super.anInt9917);
		if (local115 == null) {
			local115 = Static665.method8806(super.aClass62Array3.length, this.method8536());
		}
		this.method8517(local19, false, arg0, super.aClass62Array3);
		@Pc(299) int local299;
		if (Static499.aBoolean608) {
			for (local299 = 0; local299 < super.aClass62Array3.length; local299++) {
				if (super.aClass62Array3[local299] != null) {
					super.aClass62Array3[local299].method7332(local19, local115.aClass3_Sub4Array1[local299], Static140.anInt8126, 0);
				}
			}
		} else {
			for (local299 = 0; local299 < super.aClass62Array3.length; local299++) {
				if (super.aClass62Array3[local299] != null) {
					super.aClass62Array3[local299].method7335(local19, local115.aClass3_Sub4Array1[local299], 0);
				}
			}
		}
		if (super.aClass3_Sub7_8 != null) {
			@Pc(359) Class9 local359 = super.aClass3_Sub7_8.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local359, Static140.anInt8126);
			} else {
				arg0.method8085(local359);
			}
		}
		for (local299 = 0; super.aClass62Array3.length > local299; local299++) {
			if (super.aClass62Array3[local299] != null) {
				super.aBoolean778 |= super.aClass62Array3[local299].F();
			}
		}
		super.aClass62Array3[0] = super.aClass62Array3[1] = super.aClass62Array3[2] = null;
		super.anInt9958 = Static472.anInt7502;
		return local115;
	}

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "(B)Z")
	private boolean method8536() {
		return this.aClass345_1.aBoolean699;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!td;B)V")
	public void method8537(@OriginalArg(0) Class345 arg0) {
		this.aClass345_1 = arg0;
		if (this.aClass345_1 != null) {
			this.anInt10019 = this.aClass345_1.anInt8811;
			this.aString120 = this.aClass345_1.aString107;
		}
		if (super.aClass3_Sub7_8 != null) {
			super.aClass3_Sub7_8.method7303();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)I")
	@Override
	public int method8493() {
		return this.aClass345_1 == null ? 0 : this.aClass345_1.anInt8771;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		if (this.aClass345_1 == null || !this.method8532(131072, arg2)) {
			return false;
		}
		@Pc(19) Class92 local19 = arg2.method8078();
		@Pc(24) int local24 = super.aClass240_7.method4986();
		local19.method3858(local24);
		local19.method3851(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass62Array3.length; local39++) {
			if (super.aClass62Array3[local39] != null) {
				@Pc(64) boolean var10000;
				label50: {
					if (this.aClass345_1.anInt8771 <= 0) {
						label48: {
							if (this.aClass345_1.anInt8806 == -1) {
								if (this.aClass345_1.anInt8812 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass345_1.anInt8806 == 1) {
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
				@Pc(77) boolean local77 = var10000;
				@Pc(92) boolean local92;
				if (Static499.aBoolean608) {
					local92 = super.aClass62Array3[local39].method7341(arg0, arg1, local19, local77, this.aClass345_1.anInt8771, Static140.anInt8126);
				} else {
					local92 = super.aClass62Array3[local39].method7347(arg0, arg1, local19, local77, this.aClass345_1.anInt8771);
				}
				if (local92) {
					local37 = true;
					break;
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < super.aClass62Array3.length; local127++) {
			super.aClass62Array3[local127] = null;
		}
		return local37;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return null;
	}
}
