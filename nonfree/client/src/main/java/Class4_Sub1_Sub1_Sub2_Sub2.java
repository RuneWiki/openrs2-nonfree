import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class4_Sub1_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ns", name = "Nc", descriptor = "I")
	public int anInt6901;

	@OriginalMember(owner = "client!ns", name = "bd", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!ns", name = "gd", descriptor = "Lclient!faa;")
	public Class105 aClass105_1;

	@OriginalMember(owner = "client!ns", name = "id", descriptor = "Lclient!saa;")
	public Class322 aClass322_1;

	@OriginalMember(owner = "client!ns", name = "dd", descriptor = "I")
	public int anInt6902 = 1;

	@OriginalMember(owner = "client!ns", name = "Yc", descriptor = "I")
	public int anInt6907 = -1;

	@OriginalMember(owner = "client!ns", name = "Tc", descriptor = "I")
	public int anInt6918 = -1;

	@OriginalMember(owner = "client!ns", name = "kd", descriptor = "I")
	public int anInt6912 = 1;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		if (this.aClass105_1 == null || !this.method5943(arg2, 131072)) {
			return false;
		}
		@Pc(22) Class10 local22 = arg2.method8610();
		@Pc(27) int local27 = super.aClass49_7.method978();
		local22.method4217(local27);
		local22.method4225(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass43Array3.length; local42++) {
			if (super.aClass43Array3[local42] != null) {
				@Pc(75) boolean var10000;
				label50: {
					if (this.aClass105_1.anInt2834 <= 0) {
						label48: {
							if (this.aClass105_1.anInt2838 == -1) {
								if (this.aClass105_1.anInt2811 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass105_1.anInt2838 == 1) {
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
				@Pc(93) boolean local93 = var10000;
				@Pc(108) boolean local108;
				if (Static305.aBoolean339) {
					local108 = super.aClass43Array3[local42].method8844(arg1, arg0, local22, local93, this.aClass105_1.anInt2834, Static216.anInt1170);
				} else {
					local108 = super.aClass43Array3[local42].method8852(arg1, arg0, local22, local93, this.aClass105_1.anInt2834);
				}
				if (local108) {
					local40 = true;
					break;
				}
			}
		}
		for (@Pc(140) int local140 = 0; local140 < super.aClass43Array3.length; local140++) {
			super.aClass43Array3[local140] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
	@Override
	public int method8357() {
		return this.aClass105_1 == null ? 0 : this.aClass105_1.anInt2834;
	}

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "(I)Z")
	private boolean method5941() {
		return this.aClass105_1.aBoolean206;
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(B)Z")
	public boolean method5942() {
		return this.aClass105_1 != null;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLclient!ha;I)Z")
	private boolean method5943(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1;
		@Pc(15) Class92 local15 = this.method5930();
		@Pc(36) Class264 local36 = super.anInt6872 != -1 && super.anInt6886 == 0 ? Static315.aClass14_1.method227(super.anInt6872) : null;
		@Pc(58) Class264 local58 = super.anInt6837 == -1 || super.aBoolean456 && local36 != null ? null : Static315.aClass14_1.method227(super.anInt6837);
		@Pc(61) int local61 = local15.anInt1898;
		@Pc(64) int local64 = local15.anInt1901;
		if (local61 != 0 || local64 != 0 || local15.anInt1917 != 0 || local15.anInt1899 != 0) {
			arg1 |= 0x7;
		}
		@Pc(114) boolean local114 = super.aByte102 != 0 && super.anInt6856 <= Static565.anInt8921 && super.anInt6832 > Static565.anInt8921;
		if (local114) {
			arg1 |= 0x80000;
		}
		@Pc(125) int local125 = super.aClass49_7.method978();
		@Pc(161) Class43 local161 = super.aClass43Array3[0] = this.aClass105_1.method2621(Static23.aClass247_1, super.anInt6879, local125, super.anIntArray398, local58, super.anInt6867, super.anInt6836, super.aClass64Array3, this.aClass322_1, Static591.aClass148_2, super.anInt6839, Static315.aClass14_1, super.anInt6869, arg1, super.anInt6854, local36, arg0);
		if (local161 == null) {
			return false;
		}
		super.anInt6865 = local161.fa();
		super.anInt6833 = local161.ma();
		this.method5922(local161);
		if (local61 == 0 && local64 == 0) {
			this.method5937(0, this.method5932() << 9, this.method5932() << 9, 0, local125);
		} else {
			this.method5937(local15.anInt1924, local64, local61, local15.anInt1929, local125);
			if (super.anInt6885 != 0) {
				super.aClass43Array3[0].FA(super.anInt6885);
			}
			if (super.anInt6859 != 0) {
				super.aClass43Array3[0].VA(super.anInt6859);
			}
			if (super.anInt6842 != 0) {
				super.aClass43Array3[0].H(0, super.anInt6842, 0);
			}
		}
		if (local114) {
			local161.method8845(super.aByte100, super.aByte103, super.aByte104, super.aByte102 & 0xFF);
		}
		this.method5924(local11, (byte) -98, local61, local125, local64, local15, arg0);
		return true;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 <= -41) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(III)V")
	public void method5944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray405[0];
		@Pc(15) int local15 = super.anIntArray404[0];
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
			local15++;
			local10--;
		}
		if (super.anInt6872 != -1 && Static315.aClass14_1.method227(super.anInt6872).anInt7035 == 1) {
			super.anInt6872 = -1;
			super.anIntArray403 = null;
		}
		for (@Pc(100) int local100 = 0; local100 < super.aClass337Array3.length; local100++) {
			if (super.aClass337Array3[local100].anInt8754 != -1) {
				@Pc(120) Class295 local120 = Static463.aClass352_1.method8006(super.aClass337Array3[local100].anInt8754);
				if (local120.aBoolean514 && local120.anInt7610 != -1 && Static315.aClass14_1.method227(local120.anInt7610).anInt7035 == 1) {
					super.aClass337Array3[local100].anInt8754 = -1;
				}
			}
		}
		if (super.anInt6895 < 9) {
			super.anInt6895++;
		}
		for (@Pc(172) int local172 = super.anInt6895; local172 > 0; local172--) {
			super.anIntArray405[local172] = super.anIntArray405[local172 - 1];
			super.anIntArray404[local172] = super.anIntArray404[local172 - 1];
			super.aByteArray76[local172] = super.aByteArray76[local172 - 1];
		}
		super.anIntArray405[0] = local10;
		super.anIntArray404[0] = local15;
		super.aByteArray76[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 >= -10) {
			this.aString80 = null;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZIIII)V")
	public void method5946(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte139 = super.aByte138 = (byte) arg4;
		if (Static389.method1741(arg2, arg0)) {
			super.aByte138++;
		}
		if (super.anInt6872 != -1 && Static315.aClass14_1.method227(super.anInt6872).anInt7035 == 1) {
			super.anIntArray403 = null;
			super.anInt6872 = -1;
		}
		for (@Pc(58) int local58 = 0; super.aClass337Array3.length > local58; local58++) {
			if (super.aClass337Array3[local58].anInt8754 != -1) {
				@Pc(78) Class295 local78 = Static463.aClass352_1.method8006(super.aClass337Array3[local58].anInt8754);
				if (local78.aBoolean514 && local78.anInt7610 != -1 && Static315.aClass14_1.method227(local78.anInt7610).anInt7035 == 1) {
					super.aClass337Array3[local58].anInt8754 = -1;
				}
			}
		}
		if (!arg1) {
			@Pc(126) int local126 = arg0 - super.anIntArray405[0];
			@Pc(134) int local134 = arg2 - super.anIntArray404[0];
			if (local126 >= -8 && local126 <= 8 && local134 >= -8 && local134 <= 8) {
				if (super.anInt6895 < 9) {
					super.anInt6895++;
				}
				for (@Pc(173) int local173 = super.anInt6895; local173 > 0; local173--) {
					super.anIntArray405[local173] = super.anIntArray405[local173 - 1];
					super.anIntArray404[local173] = super.anIntArray404[local173 - 1];
					super.aByteArray76[local173] = super.aByteArray76[local173 - 1];
				}
				super.anIntArray405[0] = arg0;
				super.anIntArray404[0] = arg2;
				super.aByteArray76[0] = 1;
				return;
			}
		}
		super.anIntArray405[0] = arg0;
		super.anInt6896 = 0;
		super.anInt6895 = 0;
		super.anInt6897 = 0;
		super.anIntArray404[0] = arg2;
		super.anInt9805 = (super.anIntArray405[0] << 9) + (arg3 << 8);
		super.anInt9803 = (arg3 << 8) + (super.anIntArray404[0] << 9);
		if (super.aClass4_Sub9_6 != null) {
			super.aClass4_Sub9_6.method8045();
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)I")
	@Override
	public int method5940() {
		if (this.aClass105_1.anIntArray134 != null) {
			@Pc(21) Class105 local21 = this.aClass105_1.method2622(Static23.aClass247_1);
			if (local21 != null && local21.anInt2810 != -1) {
				return local21.anInt2810;
			}
		}
		return this.aClass105_1.anInt2810 == -1 ? super.method5940() : this.aClass105_1.anInt2810;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!faa;)V")
	public void method5947(@OriginalArg(1) Class105 arg0) {
		this.aClass105_1 = arg0;
		if (this.aClass105_1 != null) {
			this.anInt6901 = this.aClass105_1.anInt2831;
			this.aString80 = this.aClass105_1.aString19;
		}
		if (super.aClass4_Sub9_6 != null) {
			super.aClass4_Sub9_6.method8045();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		if (this.aClass105_1 == null || !super.aBoolean458 && !this.method5943(arg0, 0)) {
			return;
		}
		@Pc(26) Class10 local26 = arg0.method8610();
		local26.method4217(super.aClass49_7.method978());
		local26.method4225(super.anInt9805, super.anInt9797 - 20, super.anInt9803);
		this.method5938(arg0, super.aBoolean458, local26, super.aClass43Array3);
		for (@Pc(60) int local60 = 0; local60 < super.aClass43Array3.length; local60++) {
			super.aClass43Array3[local60] = null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		if (this.aClass105_1 == null || !this.method5943(arg0, 2048)) {
			return null;
		}
		@Pc(30) Class10 local30 = arg0.method8610();
		@Pc(35) int local35 = super.aClass49_7.method978();
		local30.method4217(local35);
		@Pc(53) Class128 local53 = Static283.aClass128ArrayArrayArray1[super.aByte139][super.anInt9805 >> Static314.anInt5377][super.anInt9803 >> Static314.anInt5377];
		if (local53 == null || local53.aClass4_Sub1_Sub3_1 == null) {
			super.anInt6849 = (int) ((float) super.anInt6849 - (float) super.anInt6849 / 10.0F);
		} else {
			@Pc(84) int local84 = super.anInt6849 - local53.aClass4_Sub1_Sub3_1.aShort48;
			super.anInt6849 = (int) ((float) super.anInt6849 - (float) local84 / 10.0F);
		}
		local30.method4225(super.anInt9805, -super.anInt6849 + super.anInt9797 - 20, super.anInt9803);
		@Pc(115) Class92 local115 = this.method5930();
		@Pc(129) Class105 local129 = this.aClass105_1.anIntArray134 == null ? this.aClass105_1 : this.aClass105_1.method2622(Static23.aClass247_1);
		super.aBoolean459 = false;
		@Pc(134) Class4_Sub6 local134 = null;
		if (Static577.aClass5_Sub19_25.aClass17_Sub8_1.method3164() == 1 && local129.aBoolean207 && local115.aBoolean137) {
			@Pc(173) Class264 local173 = super.anInt6872 != -1 && super.anInt6886 == 0 ? Static315.aClass14_1.method227(super.anInt6872) : null;
			@Pc(196) Class264 local196 = super.anInt6837 == -1 || super.aBoolean456 && local173 != null ? null : Static315.aClass14_1.method227(super.anInt6837);
			@Pc(248) Class43 local248 = Static64.method1077(local196 == null ? super.anInt6839 : super.anInt6854, this.aClass105_1.aByte27 & 0xFF, local35, this.aClass105_1.aShort34 & 0xFFFF, super.anInt6842, local196 == null ? local173 : local196, super.anInt6859, super.anInt6885, arg0, this.aClass105_1.anInt2811, this.aClass105_1.aByte33 & 0xFF, super.aClass43Array3[0], this.aClass105_1.aShort35 & 0xFFFF);
			if (local248 != null) {
				local134 = Static281.method4512(this.method5941(), super.aClass43Array3.length + 1);
				super.aBoolean459 = true;
				arg0.C(false);
				if (Static305.aBoolean339) {
					local248.method8846(local30, local134.aClass4_Sub8Array1[super.aClass43Array3.length], Static216.anInt1170, 0);
				} else {
					local248.method8849(local30, local134.aClass4_Sub8Array1[super.aClass43Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local30.method4217(local35);
		local30.method4225(super.anInt9805, -super.anInt6849 + super.anInt9797 - 5, super.anInt9803);
		if (local134 == null) {
			local134 = Static281.method4512(this.method5941(), super.aClass43Array3.length);
		}
		this.method5938(arg0, false, local30, super.aClass43Array3);
		@Pc(341) int local341;
		if (Static305.aBoolean339) {
			for (local341 = 0; local341 < super.aClass43Array3.length; local341++) {
				if (super.aClass43Array3[local341] != null) {
					super.aClass43Array3[local341].method8846(local30, local134.aClass4_Sub8Array1[local341], Static216.anInt1170, 0);
				}
			}
		} else {
			for (local341 = 0; local341 < super.aClass43Array3.length; local341++) {
				if (super.aClass43Array3[local341] != null) {
					super.aClass43Array3[local341].method8849(local30, local134.aClass4_Sub8Array1[local341], 0);
				}
			}
		}
		if (super.aClass4_Sub9_6 != null) {
			@Pc(421) Class336 local421 = super.aClass4_Sub9_6.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local421, Static216.anInt1170);
			} else {
				arg0.method8586(local421);
			}
		}
		for (local341 = 0; local341 < super.aClass43Array3.length; local341++) {
			if (super.aClass43Array3[local341] != null) {
				super.aBoolean459 |= super.aClass43Array3[local341].F();
			}
		}
		super.anInt6841 = Static154.anInt3001;
		super.aClass43Array3[0] = super.aClass43Array3[1] = super.aClass43Array3[2] = null;
		return local134;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I")
	@Override
	protected int method5934() {
		if (this.aClass105_1.anIntArray134 != null) {
			@Pc(13) Class105 local13 = this.aClass105_1.method2622(Static23.aClass247_1);
			if (local13 != null && local13.anInt2818 != -1) {
				return local13.anInt2818;
			}
		}
		return this.aClass105_1.anInt2818;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		if (this.aClass105_1.anIntArray134 != null) {
			@Pc(23) Class105 local23 = this.aClass105_1.method2622(Static23.aClass247_1);
			if (local23 != null && local23.anInt2842 != -1) {
				return local23.anInt2842;
			}
		}
		return this.aClass105_1.anInt2842;
	}
}
