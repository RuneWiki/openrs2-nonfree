import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class47_Sub1_Sub5_Sub2 extends Class47_Sub1_Sub5 {

	@OriginalMember(owner = "client!ps", name = "Ec", descriptor = "Lclient!qn;")
	public Class201 aClass201_1;

	@OriginalMember(owner = "client!ps", name = "Lc", descriptor = "I")
	private int anInt5425;

	@OriginalMember(owner = "client!ps", name = "Oc", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!ps", name = "Vc", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!ps", name = "Yc", descriptor = "I")
	public int anInt5436;

	@OriginalMember(owner = "client!ps", name = "md", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!ps", name = "Ic", descriptor = "B")
	private byte aByte78 = 0;

	@OriginalMember(owner = "client!ps", name = "Fc", descriptor = "I")
	public int anInt5422 = 0;

	@OriginalMember(owner = "client!ps", name = "Jc", descriptor = "I")
	public int anInt5424 = -1;

	@OriginalMember(owner = "client!ps", name = "Sc", descriptor = "I")
	public int anInt5431 = 0;

	@OriginalMember(owner = "client!ps", name = "Kc", descriptor = "Z")
	public boolean aBoolean436 = false;

	@OriginalMember(owner = "client!ps", name = "dd", descriptor = "I")
	public int anInt5441 = 0;

	@OriginalMember(owner = "client!ps", name = "Nc", descriptor = "I")
	public int anInt5427 = 255;

	@OriginalMember(owner = "client!ps", name = "cd", descriptor = "I")
	public int anInt5440 = -1;

	@OriginalMember(owner = "client!ps", name = "pd", descriptor = "I")
	public int anInt5451 = -1;

	@OriginalMember(owner = "client!ps", name = "xd", descriptor = "I")
	public int anInt5458 = -1;

	@OriginalMember(owner = "client!ps", name = "wd", descriptor = "I")
	public int anInt5457 = -1;

	@OriginalMember(owner = "client!ps", name = "yd", descriptor = "B")
	private byte aByte79 = 0;

	@OriginalMember(owner = "client!ps", name = "Uc", descriptor = "I")
	public int anInt5433 = 0;

	@OriginalMember(owner = "client!ps", name = "ud", descriptor = "Z")
	public boolean aBoolean438 = false;

	@OriginalMember(owner = "client!ps", name = "nd", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ps", name = "Pc", descriptor = "I")
	public int anInt5429 = 0;

	@OriginalMember(owner = "client!ps", name = "zd", descriptor = "I")
	public int anInt5459 = -1;

	@OriginalMember(owner = "client!ps", name = "qd", descriptor = "I")
	public int anInt5452 = -1;

	@OriginalMember(owner = "client!ps", name = "kd", descriptor = "I")
	public int anInt5448 = -1;

	@OriginalMember(owner = "client!ps", name = "Ed", descriptor = "B")
	private byte aByte80 = 0;

	static {
		new Class96(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
		new Class96(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIB)V")
	public void method4334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5348 != -1 && Static322.aClass45_5.method690(super.anInt5348).anInt1430 == 1) {
			super.anInt5348 = -1;
		}
		@Pc(35) Class166 local35;
		if (super.anInt5381 != -1) {
			local35 = Static294.aClass125_2.method2961(super.anInt5381);
			if (local35.aBoolean344 && local35.anInt4334 != -1 && Static322.aClass45_5.method690(local35.anInt4334).anInt1430 == 1) {
				super.anInt5381 = -1;
			}
		}
		if (super.anInt5392 != -1) {
			local35 = Static294.aClass125_2.method2961(super.anInt5392);
			if (local35.aBoolean344 && local35.anInt4334 != -1 && Static322.aClass45_5.method690(local35.anInt4334).anInt1430 == 1) {
				super.anInt5392 = -1;
			}
		}
		this.anInt5440 = -1;
		if (arg1 < 0 || arg1 >= Static80.anInt6558 || arg0 < 0 || arg0 >= Static104.anInt2048) {
			this.method4336(arg1, arg0);
		} else if (super.anIntArray407[0] >= 0 && Static80.anInt6558 > super.anIntArray407[0] && super.anIntArray408[0] >= 0 && Static104.anInt2048 > super.anIntArray408[0]) {
			if (arg2 == 2) {
				Static362.method5156(arg0, arg1, this);
			}
			this.method4337(arg1, arg2, arg0);
		} else {
			this.method4336(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		if (this.aClass201_1 != null && (super.aBoolean435 || this.method4343(0, arg0))) {
			this.method4324(super.aClass37Array3, arg0, super.aBoolean435);
			super.aClass37Array3[0] = super.aClass37Array3[1] = super.aClass37Array3[2] = super.aClass37Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
	public void method4336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt5421 = 0;
		super.anIntArray407[0] = arg0;
		super.anInt5419 = 0;
		super.anInt5420 = 0;
		super.anIntArray408[0] = arg1;
		@Pc(26) int local26 = this.method4317();
		super.anInt7060 = super.anIntArray407[0] * 128 + local26 * 64;
		super.anInt7066 = local26 * 64 + super.anIntArray408[0] * 128;
		if (Static255.aClass47_Sub1_Sub5_Sub2_2 == this) {
			Static92.method1453();
		}
		if (super.aClass36_Sub7_6 != null) {
			super.aClass36_Sub7_6.method4877();
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBBI)V")
	public void method4337(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt5421 < 9) {
			super.anInt5421++;
		}
		for (@Pc(18) int local18 = super.anInt5421; local18 > 0; local18--) {
			super.anIntArray407[local18] = super.anIntArray407[local18 - 1];
			super.anIntArray408[local18] = super.anIntArray408[local18 - 1];
			super.aByteArray63[local18] = super.aByteArray63[local18 - 1];
		}
		super.anIntArray407[0] = arg0;
		super.anIntArray408[0] = arg2;
		super.aByteArray63[0] = arg1;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		if (this.aClass201_1 == null || !this.method4343(2048, arg0)) {
			return null;
		}
		@Pc(19) Class43 local19 = arg0.method4588();
		@Pc(24) int local24 = super.aClass134_7.method3097();
		local19.O(local24);
		local19.ZA(super.anInt7060, super.anInt7064, super.anInt7066);
		@Pc(38) float local38 = arg0.la();
		@Pc(41) float local41 = arg0.w();
		if (Static327.aClass230_Sub1_1.aBoolean613) {
			@Pc(48) Class231 local48 = this.method4327();
			if (local48.aBoolean586 && (this.aClass201_1.anInt6012 == -1 || Static268.aClass26_1.method429(this.aClass201_1.anInt6012).aBoolean447)) {
				@Pc(80) Class58 local80 = super.anInt5348 != -1 && super.anInt5370 == 0 ? Static322.aClass45_5.method690(super.anInt5348) : null;
				@Pc(101) Class58 local101 = super.anInt5393 == -1 || this.aBoolean437 || super.aBoolean432 && local80 != null ? null : Static322.aClass45_5.method690(super.anInt5393);
				@Pc(135) Class37 local135 = Static100.method1625(super.anInt5410, arg0, super.aBoolean434, super.anInt5362, local24, 160, 0, 1, local101 == null ? local80 : local101, super.anInt5383, local101 == null ? super.anInt5350 : super.anInt5407, 240, 0, super.aClass37Array3[0]);
				if (local135 != null) {
					arg0.o(local38, local41 - 128.0F);
					arg0.method4596(false);
					local135.method4167(local19, null, 0);
					arg0.method4596(true);
				}
			}
		}
		if (Static255.aClass47_Sub1_Sub5_Sub2_2 == this) {
			arg0.o(local38, local41 - 144.0F);
			local19.R(super.anInt7060, super.anInt7064, super.anInt7066);
			for (@Pc(176) int local176 = Static416.aClass262Array1.length - 1; local176 >= 0; local176--) {
				@Pc(182) Class262 local182 = Static416.aClass262Array1[local176];
				if (local182 != null && local182.anInt7691 != -1) {
					@Pc(230) int local230;
					@Pc(224) int local224;
					if (local182.anInt7695 == 1 && local182.anInt7698 >= 0 && local182.anInt7698 < Static307.aClass47_Sub1_Sub5_Sub1Array1.length) {
						@Pc(215) Class47_Sub1_Sub5_Sub1 local215 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local182.anInt7698];
						if (local215 != null) {
							local224 = local215.anInt7060 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060;
							local230 = local215.anInt7066 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066;
							this.method4340(arg0, 5760000, local230, local19, super.aClass37Array3[0], local224, local182.anInt7691);
						}
					}
					if (local182.anInt7695 == 2) {
						@Pc(259) int local259 = local182.anInt7697 + 64 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060;
						local224 = local182.anInt7694 + 64 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066;
						local230 = local182.anInt7700 << 7;
						local230 *= local230;
						this.method4340(arg0, local230, local224, local19, super.aClass37Array3[0], local259, local182.anInt7691);
					}
					if (local182.anInt7695 == 10 && local182.anInt7698 >= 0 && Static362.aClass47_Sub1_Sub5_Sub2Array1.length > local182.anInt7698) {
						@Pc(312) Class47_Sub1_Sub5_Sub2 local312 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local182.anInt7698];
						if (local312 != null) {
							local224 = local312.anInt7060 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060;
							local230 = local312.anInt7066 - Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066;
							this.method4340(arg0, 5760000, local230, local19, super.aClass37Array3[0], local224, local182.anInt7691);
						}
					}
				}
			}
			local19.O(local24);
			local19.ZA(super.anInt7060, super.anInt7064, super.anInt7066);
		}
		arg0.o(local38, local41);
		@Pc(366) Class36_Sub1 local366 = Static309.method4241(super.aClass37Array3.length);
		if (super.aClass36_Sub7_6 == null) {
			arg0.method4585(super.aClass37Array3, local19, local366.aClass36_Sub8Array1, Static255.aClass47_Sub1_Sub5_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(388) Class101 local388 = super.aClass36_Sub7_6.method4874();
			arg0.method4593(super.aClass37Array3, local388, local19, local366.aClass36_Sub8Array1, Static255.aClass47_Sub1_Sub5_Sub2_2 == this ? 1 : 0);
		}
		this.method4324(super.aClass37Array3, arg0, false);
		if (super.aClass37Array3[2] != null) {
			if (local24 != 0) {
				super.aClass37Array3[2].k(local24);
			}
			super.aClass37Array3[2].ja(super.anInt7060 - super.aClass1_Sub36_3.anInt6210, -super.aClass1_Sub36_3.anInt6194 + super.anInt7064, -super.aClass1_Sub36_3.anInt6200 + super.anInt7066);
		}
		super.anInt5376 = Static177.anInt3327;
		super.aClass37Array3[0] = super.aClass37Array3[1] = super.aClass37Array3[2] = super.aClass37Array3[3] = null;
		return local366;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4339() {
		return this.aString66;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		if (this.aClass201_1 == null || !this.method4343(131072, arg2)) {
			return false;
		}
		@Pc(24) Class43 local24 = arg2.method4588();
		@Pc(29) int local29 = super.aClass134_7.method3097();
		local24.O(local29);
		local24.ZA(super.anInt7060, super.anInt7064, super.anInt7066);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass37Array3.length; local44++) {
			if (super.aClass37Array3[local44] != null && super.aClass37Array3[local44].method4166(arg1, arg0, local24, true)) {
				local42 = true;
				break;
			}
		}
		super.aClass37Array3[0] = super.aClass37Array3[1] = super.aClass37Array3[2] = super.aClass37Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
	@Override
	public int method4317() {
		return this.aClass201_1 == null || this.aClass201_1.anInt6012 == -1 ? super.method4317() : Static268.aClass26_1.method429(this.aClass201_1.anInt6012).anInt5550;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!qa;IBILclient!ia;Lclient!c;II)V")
	private void method4340(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class43 arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg5 * arg5 + arg2 * arg2;
		if (local12 < 16384 || local12 > arg1) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg5, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(46) Class37 local46 = Static289.method3981(super.anInt5362, local32, arg0, super.anInt5383, arg6, super.anInt5410);
		if (local46 != null) {
			arg0.method4596(false);
			local46.method4167(arg3, null, 0);
			arg0.method4596(true);
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)I")
	@Override
	public int method4319() {
		return -1;
	}

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "(I)Z")
	public boolean method4341() {
		return this.aClass201_1 != null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLclient!ti;)V")
	public void method4342(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.anInt5695 = 0;
		@Pc(12) int local12 = arg0.method4548();
		this.aByte79 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method4317();
		this.method4330((local12 >> 3 & 0x7) + 1);
		this.aByte80 = (byte) (local12 >> 6 & 0x3);
		super.anInt7060 += this.method4317() - local38 << 6;
		super.anInt7066 += this.method4317() - local38 << 6;
		this.aByte78 = arg0.method4529();
		this.anInt5424 = arg0.method4529();
		this.anInt5448 = arg0.method4529();
		this.anInt5422 = 0;
		@Pc(101) int local101 = -1;
		@Pc(104) int[] local104 = new int[12];
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(172) int local172;
		for (@Pc(106) int local106 = 0; local106 < 12; local106++) {
			@Pc(112) int local112 = arg0.method4548();
			if (local112 == 0) {
				local104[local106] = 0;
			} else {
				local127 = arg0.method4548();
				local133 = local127 + (local112 << 8);
				if (local106 == 0 && local133 == 65535) {
					local101 = arg0.method4498();
					this.anInt5422 = arg0.method4548();
					break;
				}
				if (local133 >= 32768) {
					local133 = Static141.anIntArray202[local133 - 32768];
					local104[local106] = local133 | 0x40000000;
					local172 = Static388.aClass193_3.method4249(local133).anInt6308;
					if (local172 != 0) {
						this.anInt5422 = local172;
					}
				} else {
					local104[local106] = Integer.MIN_VALUE | local133 - 256;
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (local127 = 0; local127 < 5; local127++) {
			local133 = arg0.method4548();
			if (local133 < 0 || local133 >= Static207.aShortArrayArray3[local127].length) {
				local133 = 0;
			}
			local199[local127] = local133;
		}
		this.anInt5425 = arg0.method4498();
		this.aString65 = arg0.method4509();
		if (local26) {
			this.aString66 = arg0.method4509();
		} else {
			this.aString66 = this.aString65;
		}
		this.anInt5429 = arg0.method4548();
		if (local34) {
			this.anInt5431 = arg0.method4498();
			this.anInt5433 = this.anInt5429;
			this.anInt5451 = -1;
		} else {
			this.anInt5431 = 0;
			this.anInt5433 = arg0.method4548();
			this.anInt5451 = arg0.method4548();
			if (this.anInt5451 == 255) {
				this.anInt5451 = -1;
			}
		}
		local133 = this.anInt5441;
		this.anInt5441 = arg0.method4548();
		@Pc(329) int local329;
		if (this.anInt5441 == 0) {
			Static121.method1887(this);
		} else {
			local172 = this.anInt5452;
			@Pc(326) int local326 = this.anInt5457;
			local329 = this.anInt5459;
			@Pc(332) int local332 = this.anInt5458;
			@Pc(335) int local335 = this.anInt5427;
			this.anInt5452 = arg0.method4498();
			this.anInt5457 = arg0.method4498();
			this.anInt5459 = arg0.method4498();
			this.anInt5458 = arg0.method4498();
			this.anInt5427 = arg0.method4548();
			if (this.anInt5441 != local133 || this.anInt5452 != local172 || this.anInt5457 != local326 || local329 != this.anInt5459 || this.anInt5458 != local332 || this.anInt5427 != local335) {
				Static315.method4335(this);
			}
		}
		if (this.aClass201_1 == null) {
			this.aClass201_1 = new Class201();
		}
		local172 = this.aClass201_1.anInt6012;
		@Pc(419) int[] local419 = this.aClass201_1.anIntArray442;
		this.aClass201_1.method4761(this.method4322(), this.aByte79 == 1, local101, local104, local199);
		if (local172 != local101) {
			super.anInt7060 = (super.anIntArray407[0] << 7) + (this.method4317() << 6);
			super.anInt7066 = (super.anIntArray408[0] << 7) + (this.method4317() << 6);
		}
		if (Static179.anInt3373 == super.anInt5358 && local419 != null) {
			for (local329 = 0; local329 < local199.length; local329++) {
				if (local199[local329] != local419[local329]) {
					Static388.aClass193_3.method4248();
					break;
				}
			}
		}
		if (super.aClass36_Sub7_6 != null) {
			super.aClass36_Sub7_6.method4877();
		}
		if (super.anInt5393 == -1 || !super.aBoolean432) {
			return;
		}
		@Pc(528) Class231 local528 = this.method4327();
		if (!local528.method5400(super.anInt5393)) {
			super.anInt5393 = -1;
			super.aBoolean432 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!qa;)Z")
	private boolean method4343(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class231 local11 = this.method4327();
		@Pc(30) Class58 local30 = super.anInt5348 != -1 && super.anInt5370 == 0 ? Static322.aClass45_5.method690(super.anInt5348) : null;
		@Pc(50) Class58 local50 = super.anInt5393 == -1 || this.aBoolean437 || super.aBoolean432 && local30 != null ? null : Static322.aClass45_5.method690(super.anInt5393);
		@Pc(53) int local53 = local11.anInt6990;
		@Pc(56) int local56 = local11.anInt6999;
		if (local53 != 0 || local56 != 0 || local11.anInt7003 != 0 || local11.anInt7013 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte77 != 0 && super.anInt5340 <= Static123.anInt2333 && super.anInt5386 > Static123.anInt2333;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(141) Class37 local141 = super.aClass37Array3[0] = this.aClass201_1.method4765(super.aClass226Array3, arg0, super.anInt5391, Static237.aClass80_1, super.anInt5372, arg1, super.anInt5388, Static117.aClass81_1, Static388.aClass193_3, super.anInt5407, local30, super.anInt5350, Static322.aClass45_5, super.anInt5403, local50, Static160.aClass122_5, Static268.aClass26_1);
		@Pc(144) int local144 = Static76.method1130();
		if (Static188.anInt3481 < 96 && local144 > 50) {
			Static148.method5612();
		}
		@Pc(177) int local177;
		if (Static153.aClass174_7 != Static191.aClass174_5 && local144 < 50) {
			local177 = 50 - local144;
			while (local177 > Static170.anInt3035) {
				Static334.aByteArrayArray25[Static170.anInt3035] = new byte[102400];
				Static170.anInt3035++;
			}
			while (Static170.anInt3035 > local177) {
				Static170.anInt3035--;
				Static334.aByteArrayArray25[Static170.anInt3035] = null;
			}
		} else if (Static191.aClass174_5 != Static153.aClass174_7) {
			Static170.anInt3035 = 0;
			Static334.aByteArrayArray25 = new byte[50][];
		}
		if (local141 == null) {
			return false;
		}
		super.anInt5356 = local141.b();
		this.method4312(local141);
		local177 = super.aClass134_7.method3097();
		if (local53 == 0 && local56 == 0) {
			this.method4329(this.method4317() << 7, 0, this.method4317() << 7, local177, 0);
		} else {
			this.method4329(local53, local11.anInt6977, local56, local177, local11.anInt6996);
			if (super.anInt5383 != 0) {
				local141.WA(super.anInt5383);
			}
			if (super.anInt5410 != 0) {
				local141.o(super.anInt5410);
			}
			if (super.anInt5362 != 0) {
				local141.ja(0, super.anInt5362, 0);
			}
		}
		if (local100) {
			local141.method4164(super.aByte75, super.aByte74, super.aByte76, super.aByte77 & 0xFF);
		}
		@Pc(325) Class166 local325;
		@Pc(340) boolean local340;
		@Pc(342) int local342;
		@Pc(382) Class37 local382;
		if (this.aBoolean437 || super.anInt5381 == -1 || super.anInt5382 == -1) {
			super.aClass37Array3[1] = null;
		} else {
			local325 = Static294.aClass125_2.method2961(super.anInt5381);
			local340 = local325.aByte65 == 3 && (local53 != 0 || local56 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt5401 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.lb != 0) {
					local342 |= 0x2;
				}
			}
			local382 = super.aClass37Array3[1] = local325.method3603(Static322.aClass45_5, arg1, super.anInt5374, super.anInt5345, super.anInt5382, local342);
			if (local382 != null) {
				if (super.lb != 0) {
					local382.ja(0, -super.lb << 0, 0);
				}
				if (super.anInt5401 != 0) {
					local382.k(super.anInt5401 * 2048);
				}
				if (local340) {
					if (super.anInt5383 != 0) {
						local382.WA(super.anInt5383);
					}
					if (super.anInt5410 != 0) {
						local382.o(super.anInt5410);
					}
					if (super.anInt5362 != 0) {
						local382.ja(0, super.anInt5362, 0);
					}
				}
			}
		}
		if (this.aBoolean437 || super.anInt5392 == -1 || super.anInt5400 == -1) {
			super.aClass37Array3[3] = null;
		} else {
			local325 = Static294.aClass125_2.method2961(super.anInt5392);
			local340 = local325.aByte65 == 3 && (local53 != 0 || local56 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt5409 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt5351 != 0) {
					local342 |= 0x2;
				}
			}
			local382 = super.aClass37Array3[3] = local325.method3600(arg1, Static322.aClass45_5, local342, super.anInt5354, super.anInt5400, super.anInt5349);
			if (local382 != null) {
				if (super.anInt5351 != 0) {
					local382.ja(0, -super.anInt5351 << 0, 0);
				}
				if (super.anInt5409 != 0) {
					local382.k(super.anInt5409 * 2048);
				}
				if (local340) {
					if (super.anInt5383 != 0) {
						local382.WA(super.anInt5383);
					}
					if (super.anInt5410 != 0) {
						local382.o(super.anInt5410);
					}
					if (super.anInt5362 != 0) {
						local382.ja(0, super.anInt5362, 0);
					}
				}
			}
		}
		super.aClass37Array3[2] = null;
		if (!this.aBoolean437 && super.aClass1_Sub36_3 != null) {
			if (Static123.anInt2333 >= super.aClass1_Sub36_3.anInt6196) {
				super.aClass1_Sub36_3 = null;
			} else if (Static123.anInt2333 >= super.aClass1_Sub36_3.anInt6202) {
				@Pc(628) Class37 local628 = super.aClass1_Sub36_3.method4907(arg1, local7 | 0x7);
				if (local628 != null) {
					local628.ja(super.aClass1_Sub36_3.anInt6210 - super.anInt7060, -super.anInt7064 + super.aClass1_Sub36_3.anInt6194, -super.anInt7066 + super.aClass1_Sub36_3.anInt6200);
					if (local177 != 0) {
						local628.k(-local177 & 0x3FFF);
					}
					super.aClass37Array3[2] = local628;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)I")
	@Override
	public int method5447() {
		return super.anInt5356;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4345() {
		@Pc(12) String local12 = "";
		if (Static156.aStringArray19 != null) {
			local12 = local12 + Static156.aStringArray19[this.aByte80];
		}
		@Pc(36) int[] local36;
		if (this.aByte79 == 1 && Static14.anIntArray19 != null) {
			local36 = Static14.anIntArray19;
		} else {
			local36 = Static268.anIntArray357;
		}
		if (local36 != null && local36[this.aByte80] != -1) {
			@Pc(57) Class74 local57 = Static178.aClass138_1.method3163(local36[this.aByte80]);
			if (local57.aChar2 == 's') {
				local12 = local12 + local57.method1462(this.aByte78 & 0xFF);
			} else {
				Static101.method1630("gdn1", new Throwable());
				local36[this.aByte80] = -1;
			}
		}
		local12 = local12 + this.aString65;
		if (Static293.aStringArray23 != null) {
			local12 = local12 + Static293.aStringArray23[this.aByte80];
		}
		return local12;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)I")
	@Override
	protected int method4322() {
		return this.anInt5425;
	}
}
