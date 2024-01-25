import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class8_Sub1_Sub3_Sub2_Sub2 extends Class8_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!nw", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!nw", name = "id", descriptor = "Lclient!fr;")
	public Class133 aClass133_1;

	@OriginalMember(owner = "client!nw", name = "Uc", descriptor = "I")
	public int anInt7069;

	@OriginalMember(owner = "client!nw", name = "Yc", descriptor = "Lclient!maa;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!nw", name = "kd", descriptor = "I")
	public int anInt7058 = -1;

	@OriginalMember(owner = "client!nw", name = "jd", descriptor = "I")
	public int anInt7074 = 1;

	@OriginalMember(owner = "client!nw", name = "Vc", descriptor = "I")
	public int anInt7059 = -1;

	@OriginalMember(owner = "client!nw", name = "Wc", descriptor = "I")
	public int anInt7077 = 1;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZLclient!maa;)V")
	public void method6004(@OriginalArg(1) Class227 arg0) {
		this.aClass227_1 = arg0;
		if (this.aClass227_1 != null) {
			this.aString93 = this.aClass227_1.aString79;
			this.anInt7069 = this.aClass227_1.anInt6257;
		}
		if (super.aClass8_Sub5_7 != null) {
			super.aClass8_Sub5_7.method4904();
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 65) {
			this.method8904((Class57) null, -115);
		}
		return null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!ha;IZ)Z")
	private boolean method6005(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class101 local9 = this.method5991(106);
		@Pc(31) Class165 local31 = super.anInt7023 != -1 && super.anInt7045 == 0 ? Static158.aClass317_1.method7882(super.anInt7023, 100) : null;
		@Pc(54) Class165 local54 = super.anInt7008 == -1 || super.aBoolean543 && local31 != null ? null : Static158.aClass317_1.method7882(super.anInt7008, 100);
		@Pc(57) int local57 = local9.anInt2176;
		@Pc(60) int local60 = local9.anInt2173;
		if (local57 != 0 || local60 != 0 || local9.anInt2178 != 0 || local9.anInt2208 != 0) {
			arg1 |= 0x7;
		}
		@Pc(109) boolean local109 = super.aByte118 != 0 && Static44.anInt740 >= super.anInt7013 && super.anInt7029 > Static44.anInt740;
		if (local109) {
			arg1 |= 0x80000;
		}
		@Pc(120) int local120 = super.aClass270_7.method6422(5);
		@Pc(156) Class164 local156 = super.aClass164Array3[0] = this.aClass227_1.method5324(super.anInt7028, this.aClass133_1, super.anInt6979, local31, super.anInt6978, Static356.aClass325_2, arg1, local120, Static158.aClass317_1, super.anInt7006, super.anInt7044, local54, super.anInt7002, arg0, super.anIntArray408, super.aClass10Array3, Static413.aClass118_1);
		if (local156 == null) {
			return false;
		}
		super.anInt6993 = local156.fa();
		super.anInt7039 = local156.ma();
		this.method6000(local156, (byte) 30);
		if (local57 == 0 && local60 == 0) {
			this.method5985(0, local120, 0, this.method5993() << 9, this.method5993() << 9);
		} else {
			this.method5985(local9.anInt2189, local120, local9.anInt2204, local60, local57);
			if (super.anInt7033 != 0) {
				super.aClass164Array3[0].FA(super.anInt7033);
			}
			if (super.anInt6988 != 0) {
				super.aClass164Array3[0].VA(super.anInt6988);
			}
			if (super.anInt7035 != 0) {
				super.aClass164Array3[0].H(0, super.anInt7035, 0);
			}
		}
		if (local109) {
			local156.method9082(super.aByte120, super.aByte121, super.aByte119, super.aByte118 & 0xFF);
		}
		this.method5986(local57, local120, local5, local9, arg0, local60);
		return true;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(III)V")
	public void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = super.anIntArray414[0];
		@Pc(15) int local15 = super.anIntArray415[0];
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
			local15--;
			local10++;
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
		if (super.anInt7023 != -1 && Static158.aClass317_1.method7882(super.anInt7023, 100).anInt3912 == 1) {
			super.anInt7023 = -1;
			super.anIntArray412 = null;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		for (@Pc(102) int local102 = 0; local102 < super.aClass150Array3.length; local102++) {
			if (super.aClass150Array3[local102].anInt3303 != -1) {
				@Pc(123) Class160 local123 = Static421.aClass385_2.method9166(super.aClass150Array3[local102].anInt3303);
				if (local123.aBoolean288 && local123.anInt3635 != -1 && Static158.aClass317_1.method7882(local123.anInt3635, 100).anInt3912 == 1) {
					super.aClass150Array3[local102].anInt3303 = -1;
				}
			}
		}
		if (super.anInt7050 < 9) {
			super.anInt7050++;
		}
		for (@Pc(176) int local176 = super.anInt7050; local176 > 0; local176--) {
			super.anIntArray414[local176] = super.anIntArray414[local176 - 1];
			super.anIntArray415[local176] = super.anIntArray415[local176 - 1];
			super.aByteArray64[local176] = super.aByteArray64[local176 - 1];
		}
		super.anIntArray414[0] = local10;
		if (arg1 > -104) {
			this.method8907(-58, (Class57) null);
		}
		super.anIntArray415[0] = local15;
		super.aByteArray64[0] = (byte) arg2;
	}

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "(I)I")
	@Override
	public int method8908(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method6010((byte) 77);
		}
		return this.aClass227_1 == null ? 0 : this.aClass227_1.anInt6228;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass227_1 == null || !this.method6005(arg2, 131072)) {
			return false;
		}
		@Pc(22) Class203 local22 = arg2.method7672();
		@Pc(27) int local27 = super.aClass270_7.method6422(5);
		local22.method8331(local27);
		local22.method8335(super.anInt10355, super.anInt10357, super.anInt10363);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; super.aClass164Array3.length > local42; local42++) {
			if (super.aClass164Array3[local42] != null) {
				@Pc(75) boolean var10000;
				label54: {
					if (this.aClass227_1.anInt6228 <= 0) {
						label52: {
							if (this.aClass227_1.anInt6234 == -1) {
								if (this.aClass227_1.anInt6248 == 1) {
									break label52;
								}
								var10000 = false;
							} else {
								if (this.aClass227_1.anInt6234 == 1) {
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
				@Pc(91) boolean local91 = var10000;
				@Pc(107) boolean local107;
				if (Static565.aBoolean768) {
					local107 = super.aClass164Array3[local42].method9069(arg1, arg0, local22, local91, this.aClass227_1.anInt6228, Static243.anInt4189);
				} else {
					local107 = super.aClass164Array3[local42].method9093(arg1, arg0, local22, local91, this.aClass227_1.anInt6228);
				}
				if (local107) {
					local40 = true;
					break;
				}
			}
		}
		for (@Pc(140) int local140 = 0; super.aClass164Array3.length > local140; local140++) {
			super.aClass164Array3[local140] = null;
		}
		if (arg3 >= -43) {
			this.anInt7074 = 124;
		}
		return local40;
	}

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 == -38) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "(B)Z")
	public boolean method6010(@OriginalArg(0) byte arg0) {
		if (this.aClass227_1 == null) {
			return false;
		} else {
			return arg0 == -102;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass227_1 == null || !this.method6005(arg1, 2048)) {
			return null;
		}
		@Pc(22) Class203 local22 = arg1.method7672();
		@Pc(27) int local27 = super.aClass270_7.method6422(5);
		local22.method8331(local27);
		@Pc(45) Class174 local45 = Static260.aClass174ArrayArrayArray2[super.aByte145][super.anInt10355 >> Static611.anInt10115][super.anInt10363 >> Static611.anInt10115];
		if (local45 == null || local45.aClass8_Sub1_Sub1_1 == null) {
			super.anInt7016 = (int) ((float) super.anInt7016 - (float) super.anInt7016 / 10.0F);
		} else {
			@Pc(60) int local60 = super.anInt7016 - local45.aClass8_Sub1_Sub1_1.aShort4;
			super.anInt7016 = (int) ((float) super.anInt7016 - (float) local60 / 10.0F);
		}
		local22.method8335(super.anInt10355, -super.anInt7016 + super.anInt10357 - 20, super.anInt10363);
		@Pc(105) Class101 local105 = this.method5991(127);
		@Pc(119) Class227 local119 = this.aClass227_1.anIntArray341 == null ? this.aClass227_1 : this.aClass227_1.method5322(Static413.aClass118_1);
		super.aBoolean544 = false;
		@Pc(124) Class8_Sub10 local124 = null;
		if (Static637.aClass5_Sub20_31.aClass24_Sub19_1.method6612() == 1 && local119.aBoolean468 && local105.aBoolean190) {
			@Pc(165) Class165 local165 = super.anInt7023 != -1 && super.anInt7045 == 0 ? Static158.aClass317_1.method7882(super.anInt7023, arg0 + 204) : null;
			@Pc(187) Class165 local187 = super.anInt7008 == -1 || super.aBoolean543 && local165 != null ? null : Static158.aClass317_1.method7882(super.anInt7008, 100);
			@Pc(239) Class164 local239 = Static262.method7572(local27, local187 == null ? super.anInt7028 : super.anInt6978, this.aClass227_1.aByte85 & 0xFF, local187 == null ? local165 : local187, this.aClass227_1.anInt6248, super.aClass164Array3[0], this.aClass227_1.aShort77 & 0xFFFF, super.anInt7035, super.anInt7033, this.aClass227_1.aByte87 & 0xFF, arg1, super.anInt6988, this.aClass227_1.aShort76 & 0xFFFF, -19478);
			if (local239 != null) {
				local124 = Static213.method3056(this.method6011(), 0, super.aClass164Array3.length + 1);
				super.aBoolean544 = true;
				arg1.C(false);
				if (Static565.aBoolean768) {
					local239.method9092(local22, local124.aClass8_Sub7Array1[super.aClass164Array3.length], Static243.anInt4189, 0);
				} else {
					local239.method9073(local22, local124.aClass8_Sub7Array1[super.aClass164Array3.length], 0);
				}
				arg1.C(true);
			}
		}
		local22.method8331(local27);
		local22.method8335(super.anInt10355, super.anInt10357 - super.anInt7016 - 5, super.anInt10363);
		if (local124 == null) {
			local124 = Static213.method3056(this.method6011(), 0, super.aClass164Array3.length);
		}
		this.method5998(arg1, false, local22, super.aClass164Array3);
		@Pc(329) int local329;
		if (Static565.aBoolean768) {
			for (local329 = 0; super.aClass164Array3.length > local329; local329++) {
				if (super.aClass164Array3[local329] != null) {
					super.aClass164Array3[local329].method9092(local22, local124.aClass8_Sub7Array1[local329], Static243.anInt4189, 0);
				}
			}
		} else {
			for (local329 = 0; super.aClass164Array3.length > local329; local329++) {
				if (super.aClass164Array3[local329] != null) {
					super.aClass164Array3[local329].method9073(local22, local124.aClass8_Sub7Array1[local329], 0);
				}
			}
		}
		if (super.aClass8_Sub5_7 != null) {
			@Pc(413) Class193 local413 = super.aClass8_Sub5_7.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local413, Static243.anInt4189);
			} else {
				arg1.method7728(local413);
			}
		}
		if (arg0 != -104) {
			return null;
		}
		for (local329 = 0; super.aClass164Array3.length > local329; local329++) {
			if (super.aClass164Array3[local329] != null) {
				super.aBoolean544 |= super.aClass164Array3[local329].F();
			}
		}
		super.aClass164Array3[0] = super.aClass164Array3[1] = super.aClass164Array3[2] = null;
		super.anInt6981 = Static287.anInt5060;
		return local124;
	}

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "(B)I")
	@Override
	public int method5994() {
		if (this.aClass227_1.anIntArray341 != null) {
			@Pc(13) Class227 local13 = this.aClass227_1.method5322(Static413.aClass118_1);
			if (local13 != null && local13.anInt6232 != -1) {
				return local13.anInt6232;
			}
		}
		return this.aClass227_1.anInt6232 == -1 ? super.method5994() : this.aClass227_1.anInt6232;
	}

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.method8895(4, 56, (Class57) null, (byte) -12);
		}
		return false;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(Z)Z")
	private boolean method6011() {
		return this.aClass227_1.aBoolean462;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (this.aClass227_1 == null || !super.aBoolean545 && !this.method6005(arg1, 0)) {
			return;
		}
		@Pc(26) Class203 local26 = arg1.method7672();
		local26.method8331(super.aClass270_7.method6422(5));
		local26.method8335(super.anInt10355, super.anInt10357 - 20, super.anInt10363);
		this.method5998(arg1, super.aBoolean545, local26, super.aClass164Array3);
		for (@Pc(53) int local53 = arg0; local53 < super.aClass164Array3.length; local53++) {
			super.aClass164Array3[local53] = null;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)I")
	@Override
	protected int method5990() {
		if (this.aClass227_1.anIntArray341 != null) {
			@Pc(23) Class227 local23 = this.aClass227_1.method5322(Static413.aClass118_1);
			if (local23 != null && local23.anInt6236 != -1) {
				return local23.anInt6236;
			}
		}
		return this.aClass227_1.anInt6236;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIZIII)V")
	public void method6012(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte145 = super.aByte146 = (byte) arg4;
		if (Static90.method1353(1, arg0, arg2)) {
			super.aByte146++;
		}
		if (super.anInt7023 != -1 && Static158.aClass317_1.method7882(super.anInt7023, 100).anInt3912 == 1) {
			super.anIntArray412 = null;
			super.anInt7023 = -1;
		}
		for (@Pc(61) int local61 = 0; super.aClass150Array3.length > local61; local61++) {
			if (super.aClass150Array3[local61].anInt3303 != -1) {
				@Pc(81) Class160 local81 = Static421.aClass385_2.method9166(super.aClass150Array3[local61].anInt3303);
				if (local81.aBoolean288 && local81.anInt3635 != -1 && Static158.aClass317_1.method7882(local81.anInt3635, 100).anInt3912 == 1) {
					super.aClass150Array3[local61].anInt3303 = -1;
				}
			}
		}
		if (!arg1) {
			@Pc(132) int local132 = arg2 - super.anIntArray414[0];
			@Pc(140) int local140 = arg0 - super.anIntArray415[0];
			if (local132 >= -8 && local132 <= 8 && local140 >= -8 && local140 <= 8) {
				if (super.anInt7050 < 9) {
					super.anInt7050++;
				}
				for (@Pc(177) int local177 = super.anInt7050; local177 > 0; local177--) {
					super.anIntArray414[local177] = super.anIntArray414[local177 - 1];
					super.anIntArray415[local177] = super.anIntArray415[local177 - 1];
					super.aByteArray64[local177] = super.aByteArray64[local177 - 1];
				}
				super.anIntArray414[0] = arg2;
				super.anIntArray415[0] = arg0;
				super.aByteArray64[0] = 1;
				return;
			}
		}
		super.anInt7050 = 0;
		super.anInt7052 = 0;
		super.anInt7049 = 0;
		super.anIntArray414[0] = arg2;
		super.anIntArray415[0] = arg0;
		super.anInt10355 = (super.anIntArray414[0] << 9) + (arg3 << 8);
		super.anInt10363 = (super.anIntArray415[0] << 9) + (arg3 << 8);
		if (super.aClass8_Sub5_7 != null) {
			super.aClass8_Sub5_7.method4904();
		}
	}

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "(B)I")
	@Override
	public int method5992() {
		if (this.aClass227_1.anIntArray341 != null) {
			@Pc(13) Class227 local13 = this.aClass227_1.method5322(Static413.aClass118_1);
			if (local13 != null && local13.anInt6251 != -1) {
				return local13.anInt6251;
			}
		}
		return this.aClass227_1.anInt6251;
	}
}
