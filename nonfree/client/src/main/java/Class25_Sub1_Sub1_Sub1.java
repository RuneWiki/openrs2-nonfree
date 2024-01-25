import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class25_Sub1_Sub1_Sub1 extends Class25_Sub1_Sub1 {

	@OriginalMember(owner = "client!bg", name = "mc", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!bg", name = "Nc", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!bg", name = "Pc", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!bg", name = "Uc", descriptor = "Lclient!cu;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!bg", name = "ad", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!bg", name = "id", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!bg", name = "pc", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!bg", name = "zc", descriptor = "I")
	public int anInt584 = -1;

	@OriginalMember(owner = "client!bg", name = "Jc", descriptor = "I")
	public int anInt594 = 0;

	@OriginalMember(owner = "client!bg", name = "Rc", descriptor = "I")
	public int anInt601 = 0;

	@OriginalMember(owner = "client!bg", name = "yc", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!bg", name = "xc", descriptor = "I")
	public int anInt583 = -1;

	@OriginalMember(owner = "client!bg", name = "wc", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!bg", name = "tc", descriptor = "I")
	public int anInt579 = -1;

	@OriginalMember(owner = "client!bg", name = "dd", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bg", name = "qc", descriptor = "I")
	public int anInt576 = -1;

	@OriginalMember(owner = "client!bg", name = "Sc", descriptor = "I")
	public int anInt602 = 0;

	@OriginalMember(owner = "client!bg", name = "bd", descriptor = "I")
	public int anInt607 = 0;

	@OriginalMember(owner = "client!bg", name = "Yc", descriptor = "B")
	private byte aByte10 = 0;

	@OriginalMember(owner = "client!bg", name = "Wc", descriptor = "I")
	public int anInt604 = -1;

	@OriginalMember(owner = "client!bg", name = "Qc", descriptor = "I")
	public int anInt600 = -1;

	@OriginalMember(owner = "client!bg", name = "Xc", descriptor = "I")
	public int anInt605 = -1;

	@OriginalMember(owner = "client!bg", name = "fd", descriptor = "I")
	public int anInt610 = 255;

	@OriginalMember(owner = "client!bg", name = "vc", descriptor = "I")
	public int anInt581 = 0;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "(I)I")
	@Override
	public int method1883() {
		return -1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method462() {
		@Pc(7) String local7 = "";
		if (Static295.aStringArray71 != null) {
			local7 = local7 + Static295.aStringArray71[this.aByte9];
		}
		@Pc(29) int[] local29;
		if (this.aByte8 == 1 && Static228.anIntArray485 != null) {
			local29 = Static228.anIntArray485;
		} else {
			local29 = Static129.anIntArray297;
		}
		if (local29 != null && local29[this.aByte9] != -1) {
			@Pc(49) Class187 local49 = Static8.aClass242_1.method5294(local29[this.aByte9]);
			if (local49.aChar4 == 's') {
				local7 = local7 + local49.method4298(this.aByte10 & 0xFF);
			} else {
				Static62.method1006(new Throwable(), "gdn1");
				local29[this.aByte9] = -1;
			}
		}
		local7 = local7 + this.aString5;
		if (Static26.aStringArray8 != null) {
			local7 = local7 + Static26.aStringArray8[this.aByte9];
		}
		return local7;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIBI)V")
	public void method464(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt2333 != -1 && Static25.aClass67_1.method1227(super.anInt2333).anInt4804 == 1) {
			super.anInt2333 = -1;
		}
		if (super.anInt2338 != -1) {
			@Pc(37) Class134 local37 = Static10.aClass246_1.method5429(super.anInt2338);
			if (local37.aBoolean297 && local37.anInt3346 != -1 && Static25.aClass67_1.method1227(local37.anInt3346).anInt4804 == 1) {
				super.anInt2338 = -1;
			}
		}
		this.anInt579 = -1;
		if (arg1 < 0 || Static92.anInt1675 <= arg1 || arg2 < 0 || arg2 >= Static262.anInt6340) {
			this.method468(arg2, arg1);
		} else if (super.anIntArray296[0] >= 0 && Static92.anInt1675 > super.anIntArray296[0] && super.anIntArray295[0] >= 0 && super.anIntArray295[0] < Static262.anInt6340) {
			if (arg0 == 2) {
				Static360.method3252(this, arg1, arg2);
			}
			this.method465(arg1, arg2, arg0);
		} else {
			this.method468(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)I")
	@Override
	protected int method1886() {
		return this.anInt598;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		if (this.aClass49_1 != null && (super.aBoolean192 || this.method470(0, arg0))) {
			this.method1884(super.aBoolean192, arg0, super.aClass22Array3);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass49_1 == null || !this.method470(65536, arg0)) {
			return true;
		}
		@Pc(19) Class127 local19 = arg0.method5378();
		@Pc(24) int local24 = super.aClass99_7.method2036();
		local19.method5274(local24);
		local19.method5260(super.anInt6080, super.anInt6085, super.anInt6077);
		for (@Pc(45) int local45 = 0; local45 < super.aClass22Array3.length; local45++) {
			if (super.aClass22Array3[local45] != null && super.aClass22Array3[local45].method1584(arg1, arg2, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return super.anInt2315;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIB)V")
	public void method465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt2381 < 9) {
			super.anInt2381++;
		}
		for (@Pc(24) int local24 = super.anInt2381; local24 > 0; local24--) {
			super.anIntArray296[local24] = super.anIntArray296[local24 - 1];
			super.anIntArray295[local24] = super.anIntArray295[local24 - 1];
			super.aByteArray40[local24] = super.aByteArray40[local24 - 1];
		}
		super.anIntArray296[0] = arg0;
		super.aByteArray40[0] = arg2;
		super.anIntArray295[0] = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		if (this.aClass49_1 == null || !this.method470(1024, arg0)) {
			return null;
		}
		@Pc(19) Class127 local19 = arg0.method5378();
		@Pc(24) int local24 = super.aClass99_7.method2036();
		local19.method5274(local24);
		local19.method5260(super.anInt6080, super.anInt6085, super.anInt6077);
		@Pc(38) float local38 = arg0.method5338();
		@Pc(41) float local41 = arg0.method5333();
		if (Static188.aClass135_Sub1_1.aBoolean327) {
			@Pc(48) Class8 local48 = this.method1880();
			if (local48.aBoolean11 && (this.aClass49_1.anInt1143 == -1 || Static168.aClass196_2.method4452(this.aClass49_1.anInt1143).aBoolean128)) {
				@Pc(83) Class185 local83 = super.anInt2333 != -1 && super.anInt2323 == 0 ? Static25.aClass67_1.method1227(super.anInt2333) : null;
				@Pc(103) Class185 local103 = super.anInt2340 == -1 || this.aBoolean54 || super.aBoolean191 && local83 != null ? null : Static25.aClass67_1.method1227(super.anInt2340);
				@Pc(137) Class22 local137 = Static343.method4861(local24, super.aClass22Array3[0], arg0, super.anInt2365, 0, 160, local103 == null ? super.anInt2322 : super.anInt2332, super.aBoolean189, super.anInt2350, local103 == null ? local83 : local103, super.anInt2374, 0, 1, 240);
				if (local137 != null) {
					arg0.method5314(local38, local41 - 128.0F);
					arg0.method5307(false);
					local137.method1565(local19, null, 0);
					arg0.method5307(true);
				}
			}
		}
		if (Static321.aClass25_Sub1_Sub1_Sub1_2 == this) {
			arg0.method5314(local38, local41 - 144.0F);
			local19.method5265(super.anInt6080, super.anInt6085, super.anInt6077);
			for (@Pc(178) int local178 = Static274.aClass11Array1.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class11 local184 = Static274.aClass11Array1[local178];
				if (local184 != null && local184.anInt177 != -1) {
					@Pc(234) int local234;
					@Pc(223) int local223;
					if (local184.anInt167 == 1 && local184.anInt172 >= 0 && Static171.aClass25_Sub1_Sub1_Sub2Array1.length > local184.anInt172) {
						@Pc(211) Class25_Sub1_Sub1_Sub2 local211 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local184.anInt172];
						if (local211 != null) {
							local223 = local211.anInt6080 / 32 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 / 32;
							local234 = local211.anInt6077 / 32 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 / 32;
							this.method473(local223, local19, super.aClass22Array3[0], 360000, local184.anInt177, local234, arg0);
						}
					}
					if (local184.anInt167 == 2) {
						@Pc(272) int local272 = (local184.anInt179 - Static256.anInt4410) * 4 + 2 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 / 32;
						local223 = (local184.anInt174 - Static293.anInt5053) * 4 + 2 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 / 32;
						local234 = local184.anInt169 * 4;
						local234 *= local234;
						this.method473(local272, local19, super.aClass22Array3[0], local234, local184.anInt177, local223, arg0);
					}
					if (local184.anInt167 == 10 && local184.anInt172 >= 0 && local184.anInt172 < Static225.aClass25_Sub1_Sub1_Sub1Array3.length) {
						@Pc(329) Class25_Sub1_Sub1_Sub1 local329 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local184.anInt172];
						if (local329 != null) {
							local223 = local329.anInt6080 / 32 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 / 32;
							local234 = local329.anInt6077 / 32 - Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 / 32;
							this.method473(local223, local19, super.aClass22Array3[0], 360000, local184.anInt177, local234, arg0);
						}
					}
				}
			}
			local19.method5274(local24);
			local19.method5260(super.anInt6080, super.anInt6085, super.anInt6077);
		}
		arg0.method5314(local38, local41);
		@Pc(395) Class41_Sub1 local395 = Static277.method4255(super.aClass22Array3.length);
		if (super.aClass41_Sub3_5 == null) {
			arg0.method5370(super.aClass22Array3, local19, local395.aClass41_Sub5Array1, Static321.aClass25_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(402) Class108 local402 = super.aClass41_Sub3_5.method2143();
			arg0.method5316(super.aClass22Array3, local402, local19, local395.aClass41_Sub5Array1, Static321.aClass25_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
		}
		this.method1884(false, arg0, super.aClass22Array3);
		if (super.aClass22Array3[2] != null) {
			if (local24 != 0) {
				super.aClass22Array3[2].method1605(local24);
			}
			super.aClass22Array3[2].method1568(super.anInt6080 - super.aClass1_Sub44_3.anInt6140, -super.aClass1_Sub44_3.anInt6135 + super.anInt6085, -super.aClass1_Sub44_3.anInt6133 + super.anInt6077);
		}
		super.anInt2367 = Static32.anInt649;
		return local395;
	}

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "(I)Z")
	public boolean method466() {
		return this.aClass49_1 != null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method467() {
		return this.aString6;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt2379 = 0;
		super.anIntArray296[0] = arg1;
		super.anInt2381 = 0;
		super.anInt2380 = 0;
		super.anIntArray295[0] = arg0;
		@Pc(32) int local32 = this.method1877();
		super.anInt6077 = local32 * 64 + super.anIntArray295[0] * 128;
		super.anInt6080 = super.anIntArray296[0] * 128 + local32 * 64;
		if (Static321.aClass25_Sub1_Sub1_Sub1_2 == this) {
			Static146.method2198();
		}
		if (super.aClass41_Sub3_5 != null) {
			super.aClass41_Sub3_5.method2142();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILclient!tq;)Z")
	private boolean method470(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class8 local11 = this.method1880();
		@Pc(29) Class185 local29 = super.anInt2333 != -1 && super.anInt2323 == 0 ? Static25.aClass67_1.method1227(super.anInt2333) : null;
		@Pc(50) Class185 local50 = super.anInt2340 == -1 || this.aBoolean54 || super.aBoolean191 && local29 != null ? null : Static25.aClass67_1.method1227(super.anInt2340);
		@Pc(53) int local53 = local11.anInt152;
		@Pc(56) int local56 = local11.anInt125;
		if (local53 != 0 || local56 != 0 || local11.anInt126 != 0 || local11.anInt129 != 0) {
			arg0 |= 0x7;
		}
		super.aClass22Array3[0] = this.aClass49_1.method911(super.anInt2354, super.anInt2332, Static25.aClass67_1, local50, Static230.aClass72_3, local29, super.anInt2326, super.anInt2322, arg0, super.anInt2375, Static168.aClass196_2, arg1, Static183.aClass146_2, super.aClass103Array3, Static160.aClass163_1, Static263.aClass102_2, super.anInt2325);
		@Pc(118) int local118 = Static278.method4117();
		if (Static294.anInt5063 < 96 && local118 > 50) {
			Static161.method2397();
		}
		@Pc(141) int local141;
		if (Static314.aClass73_5 != Static96.aClass73_2 && local118 < 50) {
			local141 = 50 - local118;
			while (Static334.anInt5573 < local141) {
				Static54.aByteArrayArray5[Static334.anInt5573] = new byte[102400];
				Static334.anInt5573++;
			}
			while (local141 < Static334.anInt5573) {
				Static334.anInt5573--;
				Static54.aByteArrayArray5[Static334.anInt5573] = null;
			}
		} else if (Static314.aClass73_5 != Static96.aClass73_2) {
			Static54.aByteArrayArray5 = new byte[50][];
			Static334.anInt5573 = 0;
		}
		if (super.aClass22Array3[0] == null) {
			return false;
		}
		super.anInt2315 = super.aClass22Array3[0].method1561();
		this.method1887(super.aClass22Array3[0]);
		local141 = super.aClass99_7.method2036();
		super.anInt2374 = 0;
		super.anInt2365 = 0;
		super.anInt2350 = 0;
		if (local53 == 0 && local56 == 0) {
			this.method1885(local141, this.method1877() << 7, this.method1877() << 7);
		} else {
			this.method1885(local141, local53, local56);
			if (super.anInt2365 != 0) {
				super.aClass22Array3[0].method1582(super.anInt2365);
			}
			if (super.anInt2374 != 0) {
				super.aClass22Array3[0].method1580(super.anInt2374);
			}
			if (super.anInt2350 != 0) {
				super.aClass22Array3[0].method1568(0, super.anInt2350, 0);
			}
		}
		super.aClass22Array3[1] = null;
		if (!this.aBoolean54 && super.anInt2338 != -1 && super.anInt2373 != -1) {
			@Pc(302) Class134 local302 = Static10.aClass246_1.method5429(super.anInt2338);
			@Pc(322) Class22 local322 = local302.method2734((local302.aBoolean298 ? 7 : 2) | local7, arg1, super.anInt2373, super.anInt2330, super.anInt2372, Static25.aClass67_1);
			if (local322 != null) {
				local322.method1568(0, -super.anInt2351, 0);
				if (local302.aBoolean298 && (local53 != 0 || local56 != 0)) {
					if (super.anInt2365 != 0) {
						local322.method1582(super.anInt2365);
					}
					if (super.anInt2374 != 0) {
						local322.method1580(super.anInt2374);
					}
					if (super.anInt2350 != 0) {
						local322.method1568(0, super.anInt2350, 0);
					}
				}
				super.aClass22Array3[1] = local322;
			}
		}
		super.aClass22Array3[2] = null;
		if (!this.aBoolean54 && super.aClass1_Sub44_3 != null) {
			if (Static366.anInt5883 >= super.aClass1_Sub44_3.anInt6141) {
				super.aClass1_Sub44_3 = null;
			} else if (Static366.anInt5883 >= super.aClass1_Sub44_3.anInt6143) {
				@Pc(407) Class22 local407 = super.aClass1_Sub44_3.method5300(arg1, local7 | 0x7);
				if (local407 != null) {
					local407.method1568(-super.anInt6080 + super.aClass1_Sub44_3.anInt6140, -super.anInt6085 + super.aClass1_Sub44_3.anInt6135, super.aClass1_Sub44_3.anInt6133 - super.anInt6077);
					if (local141 != 0) {
						local407.method1605(-local141 & 0x3FFF);
					}
					super.aClass22Array3[2] = local407;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!re;B)V")
	public void method472(@OriginalArg(0) Class1_Sub33 arg0) {
		arg0.lb = 0;
		@Pc(12) int local12 = arg0.method5174();
		this.aByte8 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method1877();
		this.method1882((local12 >> 3 & 0x7) + 1);
		this.aByte9 = (byte) (local12 >> 6 & 0x3);
		super.anInt6080 += (this.method1877() - local41) * 64;
		super.anInt6077 += (this.method1877() - local41) * 64;
		this.aByte10 = arg0.method5188();
		this.anInt600 = arg0.method5188();
		this.anInt582 = arg0.method5188();
		this.anInt594 = 0;
		@Pc(104) int local104 = -1;
		@Pc(107) int[] local107 = new int[12];
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(176) int local176;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(119) int local119 = arg0.method5174();
			if (local119 == 0) {
				local107[local113] = 0;
			} else {
				local131 = arg0.method5174();
				local137 = local131 + (local119 << 8);
				if (local113 == 0 && local137 == 65535) {
					local104 = arg0.method5177();
					this.anInt594 = arg0.method5174();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static115.anIntArray262[local137 - 32768];
					local107[local113] = local137 | 0x40000000;
					local176 = Static263.aClass102_2.method2172(local137).anInt2041;
					if (local176 != 0) {
						this.anInt594 = local176;
					}
				} else {
					local107[local113] = Integer.MIN_VALUE | local137 - 256;
				}
			}
		}
		@Pc(201) int[] local201 = new int[5];
		for (local131 = 0; local131 < 5; local131++) {
			local137 = arg0.method5174();
			if (local137 < 0 || local137 >= Static107.aShortArrayArray8[local131].length) {
				local137 = 0;
			}
			local201[local131] = local137;
		}
		this.anInt598 = arg0.method5177();
		this.aString5 = arg0.method5128();
		if (local26) {
			this.aString6 = arg0.method5128();
		} else {
			this.aString6 = this.aString5;
		}
		this.anInt607 = arg0.method5174();
		if (local37) {
			this.anInt602 = arg0.method5177();
			this.anInt584 = -1;
			this.anInt601 = this.anInt607;
		} else {
			this.anInt602 = 0;
			this.anInt601 = arg0.method5174();
			this.anInt584 = arg0.method5174();
			if (this.anInt584 == 255) {
				this.anInt584 = -1;
			}
		}
		local137 = this.anInt581;
		this.anInt581 = arg0.method5174();
		@Pc(311) int local311;
		if (this.anInt581 == 0) {
			Static31.method494(this);
		} else {
			local176 = this.anInt605;
			@Pc(308) int local308 = this.anInt604;
			local311 = this.anInt576;
			@Pc(314) int local314 = this.anInt583;
			@Pc(317) int local317 = this.anInt610;
			this.anInt605 = arg0.method5177();
			this.anInt604 = arg0.method5177();
			this.anInt576 = arg0.method5177();
			this.anInt583 = arg0.method5177();
			this.anInt610 = arg0.method5174();
			if (this.anInt581 != local137 || this.anInt605 != local176 || this.anInt604 != local308 || local311 != this.anInt576 || this.anInt583 != local314 || local317 != this.anInt610) {
				Static5.method57(this);
			}
		}
		if (this.aClass49_1 == null) {
			this.aClass49_1 = new Class49();
		}
		local176 = this.aClass49_1.anInt1143;
		@Pc(398) int[] local398 = this.aClass49_1.anIntArray148;
		this.aClass49_1.method912(local107, this.method1886(), local104, this.aByte8 == 1, local201);
		if (local104 != local176) {
			super.anInt6080 = super.anIntArray296[0] * 128 + this.method1877() * 64;
			super.anInt6077 = super.anIntArray295[0] * 128 + this.method1877() * 64;
		}
		if (Static43.anInt861 == super.anInt2331 && local398 != null) {
			for (local311 = 0; local311 < local201.length; local311++) {
				if (local398[local311] != local201[local311]) {
					Static263.aClass102_2.method2180();
					break;
				}
			}
		}
		if (super.aClass41_Sub3_5 != null) {
			super.aClass41_Sub3_5.method2142();
		}
		if (super.anInt2340 == -1 || !super.aBoolean191) {
			return;
		}
		@Pc(492) Class8 local492 = this.method1880();
		if (!local492.method98(super.anInt2340)) {
			super.aBoolean191 = false;
			super.anInt2340 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	@Override
	public int method1877() {
		return this.aClass49_1 == null || this.aClass49_1.anInt1143 == -1 ? super.method1877() : Static168.aClass196_2.method4452(this.aClass49_1.anInt1143).anInt1420;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!mu;Lclient!ns;IIIILclient!tq;)V")
	private void method473(@OriginalArg(0) int arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class164 arg6) {
		@Pc(12) int local12 = arg0 * arg0 + arg5 * arg5;
		if (local12 < 16 || arg3 < local12) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg0, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(61) Class22 local61 = Static302.method4520(arg6, super.anInt6085, super.anInt6077, super.anInt6080, super.anInt2365, arg4, super.anInt2374, super.anInt2350, local34, arg2);
		if (local61 != null) {
			arg6.method5307(false);
			local61.method1565(arg1, null, 0);
			arg6.method5307(true);
		}
	}
}
