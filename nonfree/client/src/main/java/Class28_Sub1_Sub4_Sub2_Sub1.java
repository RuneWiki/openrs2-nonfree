import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class28_Sub1_Sub4_Sub2_Sub1 extends Class28_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!ft", name = "bd", descriptor = "Lclient!ge;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!ft", name = "cd", descriptor = "Lclient!gj;")
	public Class134 aClass134_1;

	@OriginalMember(owner = "client!ft", name = "id", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!ft", name = "md", descriptor = "I")
	public int anInt3582;

	@OriginalMember(owner = "client!ft", name = "Tc", descriptor = "I")
	public int anInt3566 = -1;

	@OriginalMember(owner = "client!ft", name = "dd", descriptor = "I")
	public int anInt3574 = 1;

	@OriginalMember(owner = "client!ft", name = "gd", descriptor = "I")
	public int anInt3577 = -1;

	@OriginalMember(owner = "client!ft", name = "jd", descriptor = "I")
	public int anInt3579 = 1;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method3060(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class167 local9 = this.method4580();
		@Pc(27) Class175 local27 = super.anInt5482 != -1 && super.anInt5475 == 0 ? Static591.aClass66_2.method1768(super.anInt5482) : null;
		@Pc(45) Class175 local45 = super.anInt5479 == -1 || super.aBoolean470 && local27 != null ? null : Static591.aClass66_2.method1768(super.anInt5479);
		@Pc(48) int local48 = local9.anInt4886;
		@Pc(51) int local51 = local9.anInt4902;
		if (local48 != 0 || local51 != 0 || local9.anInt4885 != 0 || local9.anInt4880 != 0) {
			arg1 |= 0x7;
		}
		@Pc(86) boolean local86 = super.aByte78 != 0 && super.anInt5490 <= Static26.anInt350 && Static26.anInt350 < super.anInt5495;
		if (local86) {
			arg1 |= 0x80000;
		}
		@Pc(97) int local97 = super.aClass306_7.method7389();
		@Pc(133) Class153 local133 = super.aClass153Array3[0] = this.aClass134_1.method3272(super.anInt5498, arg0, super.anInt5504, Static299.aClass286_2, super.aClass321Array3, super.anInt5477, super.anIntArray306, Static591.aClass66_2, super.anInt5456, local97, this.aClass129_1, Static161.aClass237_3, arg1, local45, super.anInt5493, local27, super.anInt5499);
		if (local133 == null) {
			return false;
		}
		super.anInt5516 = local133.fa();
		super.anInt5501 = local133.ma();
		this.method4593(local133);
		if (local48 == 0 && local51 == 0) {
			this.method4600(0, this.method4599() << 9, local97, 0, this.method4599() << 9);
		} else {
			this.method4600(local9.anInt4887, local48, local97, local9.anInt4915, local51);
			if (super.anInt5458 != 0) {
				super.aClass153Array3[0].FA(super.anInt5458);
			}
			if (super.anInt5466 != 0) {
				super.aClass153Array3[0].VA(super.anInt5466);
			}
			if (super.anInt5486 != 0) {
				super.aClass153Array3[0].H(0, super.anInt5486, 0);
			}
		}
		if (local86) {
			local133.method8597(super.aByte81, super.lb, super.aByte80, super.aByte78 & 0xFF);
		}
		this.method4587(local5, local97, local9, local48, arg0, local51);
		return true;
	}

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)I")
	@Override
	protected int method4596() {
		if (this.aClass134_1.anIntArray191 != null) {
			@Pc(23) Class134 local23 = this.aClass134_1.method3276(Static161.aClass237_3);
			if (local23 != null && local23.anInt3835 != -1) {
				return local23.anInt3835;
			}
		}
		return this.aClass134_1.anInt3835;
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)I")
	@Override
	public int method8966() {
		return this.aClass134_1 == null ? 0 : this.aClass134_1.anInt3841;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!gj;I)V")
	public void method3061(@OriginalArg(0) Class134 arg0) {
		this.aClass134_1 = arg0;
		if (this.aClass134_1 != null) {
			this.anInt3582 = this.aClass134_1.anInt3820;
			this.aString25 = this.aClass134_1.aString29;
		}
		if (super.aClass28_Sub5_4 != null) {
			super.aClass28_Sub5_4.method5844();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIZII)V")
	public void method3062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte145 = super.aByte144 = (byte) arg4;
		if (Static599.method8200(arg0, arg2)) {
			super.aByte144++;
		}
		if (super.anInt5482 != -1 && Static591.aClass66_2.method1768(super.anInt5482).anInt5032 == 1) {
			super.anInt5482 = -1;
			super.anIntArray305 = null;
		}
		for (@Pc(42) int local42 = 0; local42 < super.aClass227Array3.length; local42++) {
			if (super.aClass227Array3[local42].anInt6677 != -1) {
				@Pc(59) Class338 local59 = Static239.aClass91_1.method2243(super.aClass227Array3[local42].anInt6677);
				if (local59.aBoolean794 && local59.anInt9376 != -1 && Static591.aClass66_2.method1768(local59.anInt9376).anInt5032 == 1) {
					super.aClass227Array3[local42].anInt6677 = -1;
				}
			}
		}
		if (!arg3) {
			@Pc(101) int local101 = arg2 - super.anIntArray308[0];
			@Pc(108) int local108 = arg0 - super.anIntArray307[0];
			if (local101 >= -8 && local101 <= 8 && local108 >= -8 && local108 <= 8) {
				if (super.anInt5524 < 9) {
					super.anInt5524++;
				}
				for (@Pc(139) int local139 = super.anInt5524; local139 > 0; local139--) {
					super.anIntArray308[local139] = super.anIntArray308[local139 - 1];
					super.anIntArray307[local139] = super.anIntArray307[local139 - 1];
					super.aByteArray44[local139] = super.aByteArray44[local139 - 1];
				}
				super.anIntArray308[0] = arg2;
				super.anIntArray307[0] = arg0;
				super.aByteArray44[0] = 1;
				return;
			}
		}
		super.anInt5525 = 0;
		super.anInt5522 = 0;
		super.anIntArray308[0] = arg2;
		super.anInt5524 = 0;
		super.anIntArray307[0] = arg0;
		super.anInt10784 = (arg1 << 8) + (super.anIntArray307[0] << 9);
		super.anInt10781 = (arg1 << 8) + (super.anIntArray308[0] << 9);
		if (super.aClass28_Sub5_4 != null) {
			super.aClass28_Sub5_4.method5844();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)I")
	@Override
	public int method4591() {
		if (this.aClass134_1.anIntArray191 != null) {
			@Pc(19) Class134 local19 = this.aClass134_1.method3276(Static161.aClass237_3);
			if (local19 != null && local19.anInt3819 != -1) {
				return local19.anInt3819;
			}
		}
		return this.aClass134_1.anInt3819;
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)I")
	@Override
	public int method4584() {
		if (this.aClass134_1.anIntArray191 != null) {
			@Pc(22) Class134 local22 = this.aClass134_1.method3276(Static161.aClass237_3);
			if (local22 != null && local22.anInt3845 != -1) {
				return local22.anInt3845;
			}
		}
		return this.aClass134_1.anInt3845 == -1 ? super.method4584() : this.aClass134_1.anInt3845;
	}

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "(I)Z")
	private boolean method3064() {
		return this.aClass134_1.aBoolean302;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		if (this.aClass134_1 == null || !this.method3060(arg0, 2048)) {
			return null;
		}
		@Pc(24) Class254 local24 = arg0.method6903();
		@Pc(29) int local29 = super.aClass306_7.method7389();
		local24.method7346(local29);
		@Pc(47) Class226 local47 = Static635.aClass226ArrayArrayArray3[super.aByte145][super.anInt10781 >> Static588.anInt9672][super.anInt10784 >> Static588.anInt9672];
		if (local47 == null || local47.aClass28_Sub1_Sub2_1 == null) {
			super.anInt5455 = (int) ((float) super.anInt5455 - (float) super.anInt5455 / 10.0F);
		} else {
			@Pc(59) int local59 = super.anInt5455 - local47.aClass28_Sub1_Sub2_1.aShort106;
			super.anInt5455 = (int) ((float) super.anInt5455 - (float) local59 / 10.0F);
		}
		local24.method7358(super.anInt10781, super.anInt10779 - super.anInt5455 - 20, super.anInt10784);
		@Pc(103) Class167 local103 = this.method4580();
		@Pc(116) Class134 local116 = this.aClass134_1.anIntArray191 == null ? this.aClass134_1 : this.aClass134_1.method3276(Static161.aClass237_3);
		super.aBoolean472 = false;
		@Pc(121) Class28_Sub7 local121 = null;
		if (Static172.aClass5_Sub50_14.aClass12_Sub18_1.method5001() == 1 && local116.aBoolean300 && local103.aBoolean416) {
			@Pc(148) Class175 local148 = super.anInt5482 != -1 && super.anInt5475 == 0 ? Static591.aClass66_2.method1768(super.anInt5482) : null;
			@Pc(166) Class175 local166 = super.anInt5479 == -1 || super.aBoolean470 && local148 != null ? null : Static591.aClass66_2.method1768(super.anInt5479);
			@Pc(218) Class153 local218 = Static266.method4129(this.aClass134_1.aShort34 & 0xFFFF, this.aClass134_1.aByte42 & 0xFF, local166 == null ? local148 : local166, super.anInt5486, super.anInt5466, this.aClass134_1.anInt3851, super.aClass153Array3[0], arg0, local166 == null ? super.anInt5498 : super.anInt5499, this.aClass134_1.aShort35 & 0xFFFF, local29, this.aClass134_1.aByte43 & 0xFF, super.anInt5458);
			if (local218 != null) {
				local121 = Static375.method5607(this.method3064(), super.aClass153Array3.length + 1);
				super.aBoolean472 = true;
				arg0.C(false);
				if (Static632.aBoolean877) {
					local218.method8594(local24, local121.aClass28_Sub9Array1[super.aClass153Array3.length], Static483.anInt8094, 0);
				} else {
					local218.method8585(local24, local121.aClass28_Sub9Array1[super.aClass153Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local24.method7346(local29);
		local24.method7358(super.anInt10781, -super.anInt5455 + super.anInt10779 - 5, super.anInt10784);
		if (local121 == null) {
			local121 = Static375.method5607(this.method3064(), super.aClass153Array3.length);
		}
		this.method4597(false, super.aClass153Array3, arg0, local24);
		@Pc(309) int local309;
		if (Static632.aBoolean877) {
			for (local309 = 0; local309 < super.aClass153Array3.length; local309++) {
				if (super.aClass153Array3[local309] != null) {
					super.aClass153Array3[local309].method8594(local24, local121.aClass28_Sub9Array1[local309], Static483.anInt8094, 0);
				}
			}
		} else {
			for (local309 = 0; local309 < super.aClass153Array3.length; local309++) {
				if (super.aClass153Array3[local309] != null) {
					super.aClass153Array3[local309].method8585(local24, local121.aClass28_Sub9Array1[local309], 0);
				}
			}
		}
		if (super.aClass28_Sub5_4 != null) {
			@Pc(369) Class392 local369 = super.aClass28_Sub5_4.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local369, Static483.anInt8094);
			} else {
				arg0.method6899(local369);
			}
		}
		for (local309 = 0; super.aClass153Array3.length > local309; local309++) {
			if (super.aClass153Array3[local309] != null) {
				super.aBoolean472 |= super.aClass153Array3[local309].F();
			}
		}
		super.anInt5474 = Static349.anInt6360;
		super.aClass153Array3[0] = super.aClass153Array3[1] = super.aClass153Array3[2] = null;
		return local121;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(III)V")
	public void method3065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray308[0];
		@Pc(15) int local15 = super.anIntArray307[0];
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
		if (super.anInt5482 != -1 && Static591.aClass66_2.method1768(super.anInt5482).anInt5032 == 1) {
			super.anInt5482 = -1;
			super.anIntArray305 = null;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		for (@Pc(77) int local77 = 0; local77 < super.aClass227Array3.length; local77++) {
			if (super.aClass227Array3[local77].anInt6677 != -1) {
				@Pc(95) Class338 local95 = Static239.aClass91_1.method2243(super.aClass227Array3[local77].anInt6677);
				if (local95.aBoolean794 && local95.anInt9376 != -1 && Static591.aClass66_2.method1768(local95.anInt9376).anInt5032 == 1) {
					super.aClass227Array3[local77].anInt6677 = -1;
				}
			}
		}
		if (super.anInt5524 < 9) {
			super.anInt5524++;
		}
		for (@Pc(137) int local137 = super.anInt5524; local137 > 0; local137--) {
			super.anIntArray308[local137] = super.anIntArray308[local137 - 1];
			super.anIntArray307[local137] = super.anIntArray307[local137 - 1];
			super.aByteArray44[local137] = super.aByteArray44[local137 - 1];
		}
		super.anIntArray308[0] = local10;
		super.anIntArray307[0] = local15;
		super.aByteArray44[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		if (this.aClass134_1 == null || !super.aBoolean471 && !this.method3060(arg0, 0)) {
			return;
		}
		@Pc(22) Class254 local22 = arg0.method6903();
		local22.method7346(super.aClass306_7.method7389());
		local22.method7358(super.anInt10781, super.anInt10779 - 20, super.anInt10784);
		this.method4597(super.aBoolean471, super.aClass153Array3, arg0, local22);
		for (@Pc(49) int local49 = 0; super.aClass153Array3.length > local49; local49++) {
			super.aClass153Array3[local49] = null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		if (this.aClass134_1 == null || !this.method3060(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class254 local19 = arg2.method6903();
		@Pc(24) int local24 = super.aClass306_7.method7389();
		local19.method7346(local24);
		local19.method7358(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(37) boolean local37 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass153Array3.length; local47++) {
			if (super.aClass153Array3[local47] != null) {
				@Pc(75) boolean var10000;
				label50: {
					if (this.aClass134_1.anInt3841 <= 0) {
						label48: {
							if (this.aClass134_1.anInt3852 == -1) {
								if (this.aClass134_1.anInt3851 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass134_1.anInt3852 == 1) {
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
				@Pc(90) boolean local90 = var10000;
				@Pc(105) boolean local105;
				if (Static632.aBoolean877) {
					local105 = super.aClass153Array3[local47].method8590(arg0, arg1, local19, local90, this.aClass134_1.anInt3841, Static483.anInt8094);
				} else {
					local105 = super.aClass153Array3[local47].method8593(arg0, arg1, local19, local90, this.aClass134_1.anInt3841);
				}
				if (local105) {
					local37 = true;
					break;
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < super.aClass153Array3.length; local135++) {
			super.aClass153Array3[local135] = null;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)Z")
	public boolean method3066() {
		return this.aClass134_1 != null;
	}
}
