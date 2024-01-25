import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class11_Sub1_Sub1_Sub2 extends Class11_Sub1_Sub1 {

	@OriginalMember(owner = "client!pi", name = "Oc", descriptor = "Lclient!dea;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!pi", name = "dd", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!pi", name = "pd", descriptor = "I")
	private int anInt7462;

	@OriginalMember(owner = "client!pi", name = "ud", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!pi", name = "wd", descriptor = "I")
	public int anInt7468;

	@OriginalMember(owner = "client!pi", name = "Bd", descriptor = "I")
	public int anInt7473;

	@OriginalMember(owner = "client!pi", name = "Nc", descriptor = "I")
	public int anInt7443 = 0;

	@OriginalMember(owner = "client!pi", name = "Wc", descriptor = "B")
	private byte aByte84 = 0;

	@OriginalMember(owner = "client!pi", name = "Jc", descriptor = "Z")
	public boolean aBoolean547 = false;

	@OriginalMember(owner = "client!pi", name = "Zc", descriptor = "I")
	public int anInt7451 = -1;

	@OriginalMember(owner = "client!pi", name = "Lc", descriptor = "B")
	private byte aByte83 = 0;

	@OriginalMember(owner = "client!pi", name = "bd", descriptor = "I")
	public int anInt7453 = 0;

	@OriginalMember(owner = "client!pi", name = "ad", descriptor = "I")
	public int anInt7452 = -1;

	@OriginalMember(owner = "client!pi", name = "gd", descriptor = "B")
	private byte aByte85 = 0;

	@OriginalMember(owner = "client!pi", name = "Hc", descriptor = "I")
	public int anInt7439 = 0;

	@OriginalMember(owner = "client!pi", name = "Vc", descriptor = "I")
	public int anInt7448 = -1;

	@OriginalMember(owner = "client!pi", name = "Uc", descriptor = "Z")
	public boolean aBoolean548 = false;

	@OriginalMember(owner = "client!pi", name = "ed", descriptor = "Z")
	public boolean aBoolean549 = false;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
	public int anInt7436 = 255;

	@OriginalMember(owner = "client!pi", name = "qd", descriptor = "I")
	public int anInt7463 = 0;

	@OriginalMember(owner = "client!pi", name = "cd", descriptor = "I")
	public int anInt7454 = -1;

	@OriginalMember(owner = "client!pi", name = "Mc", descriptor = "I")
	public int anInt7442 = -1;

	@OriginalMember(owner = "client!pi", name = "od", descriptor = "I")
	public int anInt7461 = -1;

	@OriginalMember(owner = "client!pi", name = "td", descriptor = "I")
	public int anInt7466 = 0;

	@OriginalMember(owner = "client!pi", name = "fd", descriptor = "I")
	public int anInt7455 = -1;

	@OriginalMember(owner = "client!pi", name = "ld", descriptor = "I")
	public int anInt7458 = -1;

	@OriginalMember(owner = "client!pi", name = "Cd", descriptor = "Z")
	public boolean aBoolean550 = false;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		if (this.aClass67_1 == null || !super.aBoolean546 && !this.method6230(arg0, 0)) {
			return;
		}
		@Pc(24) Class8 local24 = arg0.method5417();
		local24.a(super.aClass134_7.method3705());
		local24.G(super.anInt7347, super.anInt7350 - 5, super.anInt7351);
		this.method6215(arg0, super.aClass23Array3, super.aBoolean546, local24);
		super.aClass23Array3[0] = super.aClass23Array3[1] = super.aClass23Array3[2] = super.aClass23Array3[3] = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method6223() {
		@Pc(12) String local12 = "";
		if (Static450.aStringArray48 != null) {
			local12 = local12 + Static450.aStringArray48[this.aByte84];
		}
		@Pc(36) int[] local36;
		if (this.aByte83 == 1 && Static227.anIntArray308 != null) {
			local36 = Static227.anIntArray308;
		} else {
			local36 = Static29.anIntArray67;
		}
		if (local36 != null && local36[this.aByte84] != -1) {
			@Pc(56) Class252 local56 = Static550.aClass94_1.method2506(local36[this.aByte84]);
			if (local56.aChar2 == 's') {
				local12 = local12 + local56.method6269(this.aByte85 & 0xFF);
			} else {
				Static5.method211(new Throwable(), "gdn1");
				local36[this.aByte84] = -1;
			}
		}
		local12 = local12 + this.aString96;
		if (Static129.aStringArray18 != null) {
			local12 = local12 + Static129.aStringArray18[this.aByte84];
		}
		return local12;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return super.anInt7380;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method6224(@OriginalArg(0) Class6_Sub26 arg0) {
		arg0.anInt5769 = 0;
		@Pc(12) int local12 = arg0.method4966();
		this.aByte83 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean547;
		this.aBoolean547 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method6212();
		this.method6220((local12 >> 3 & 0x7) + 1);
		this.aByte84 = (byte) (local12 >> 6 & 0x3);
		super.anInt7347 += this.method6212() - local45 << 8;
		super.anInt7351 += this.method6212() - local45 << 8;
		this.aByte85 = arg0.method4972();
		this.anInt7448 = arg0.method4972();
		this.anInt7452 = arg0.method4972();
		this.anInt7466 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(186) int local186;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(120) int local120 = arg0.method4966();
			if (local120 == 0) {
				local112[local114] = 0;
			} else {
				local134 = arg0.method4966();
				local140 = (local120 << 8) + local134;
				if (local114 == 0 && local140 == 65535) {
					local109 = arg0.method4999();
					this.anInt7466 = arg0.method4966();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static3.anIntArray439[local140 - 32768];
					local112[local114] = local140 | 0x40000000;
					local186 = Static98.aClass203_1.method4899(local140).anInt4459;
					if (local186 != 0) {
						this.anInt7466 = local186;
					}
				} else {
					local112[local114] = Integer.MIN_VALUE | local140 - 256;
				}
			}
		}
		@Pc(211) int[] local211 = new int[5];
		for (local134 = 0; local134 < 5; local134++) {
			local140 = arg0.method4966();
			if (local140 < 0 || local140 >= Static548.aShortArrayArray10[local134].length) {
				local140 = 0;
			}
			local211[local134] = local140;
		}
		this.anInt7462 = arg0.method4999();
		this.aString96 = arg0.method4941();
		this.aString95 = this.aString96;
		this.anInt7453 = arg0.method4966();
		if (local41) {
			this.anInt7463 = arg0.method4999();
			if (this.anInt7463 == 65535) {
				this.anInt7463 = -1;
			}
			this.anInt7454 = -1;
			this.anInt7443 = this.anInt7453;
		} else {
			this.anInt7463 = 0;
			this.anInt7443 = arg0.method4966();
			this.anInt7454 = arg0.method4966();
			if (this.anInt7454 == 255) {
				this.anInt7454 = -1;
			}
		}
		local140 = this.anInt7439;
		this.anInt7439 = arg0.method4966();
		@Pc(333) int local333;
		if (this.anInt7439 == 0) {
			Static239.method4219(this);
		} else {
			local186 = this.anInt7461;
			@Pc(330) int local330 = this.anInt7442;
			local333 = this.anInt7458;
			@Pc(336) int local336 = this.anInt7451;
			@Pc(339) int local339 = this.anInt7436;
			this.anInt7461 = arg0.method4999();
			this.anInt7442 = arg0.method4999();
			this.anInt7458 = arg0.method4999();
			this.anInt7451 = arg0.method4999();
			this.anInt7436 = arg0.method4966();
			if (this.aBoolean547 != local21 || local140 != this.anInt7439 || this.anInt7461 != local186 || this.anInt7442 != local330 || local333 != this.anInt7458 || this.anInt7451 != local336 || local339 != this.anInt7436) {
				Static547.method7829(this);
			}
		}
		if (this.aClass67_1 == null) {
			this.aClass67_1 = new Class67();
		}
		local186 = this.aClass67_1.anInt2174;
		@Pc(435) int[] local435 = this.aClass67_1.anIntArray158;
		this.aClass67_1.method1975(local211, this.method6208(), local109, this.aByte83 == 1, local112);
		if (local186 != local109) {
			super.anInt7347 = (super.anIntArray526[0] << 9) + (this.method6212() << 8);
			super.anInt7351 = (super.anIntArray527[0] << 9) + (this.method6212() << 8);
		}
		if (super.anInt7392 == Static412.anInt7714 && local435 != null) {
			for (local333 = 0; local333 < local211.length; local333++) {
				if (local211[local333] != local435[local333]) {
					Static98.aClass203_1.method4907();
					break;
				}
			}
		}
		if (super.aClass5_Sub2_6 != null) {
			super.aClass5_Sub2_6.method3780();
		}
		if (super.anInt7390 == -1 || !super.aBoolean545) {
			return;
		}
		@Pc(532) Class169 local532 = this.method6209();
		if (!local532.method4459(super.anInt7390)) {
			super.aBoolean545 = false;
			super.anInt7390 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBBI)V")
	public void method6225(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7432 < 9) {
			super.anInt7432++;
		}
		for (@Pc(18) int local18 = super.anInt7432; local18 > 0; local18--) {
			super.anIntArray526[local18] = super.anIntArray526[local18 - 1];
			super.anIntArray527[local18] = super.anIntArray527[local18 - 1];
			super.aByteArray84[local18] = super.aByteArray84[local18 - 1];
		}
		super.anIntArray526[0] = arg0;
		super.anIntArray527[0] = arg2;
		super.aByteArray84[0] = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I")
	@Override
	protected int method6208() {
		return this.anInt7462;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method6226() {
		return this.aString95;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)I")
	@Override
	public int method6205() {
		return -1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass67_1 == null || !this.method6230(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class8 local19 = arg1.method5417();
		@Pc(26) int local26 = super.aClass134_7.method3705();
		local19.a(local26);
		local19.G(super.anInt7347, super.anInt7350, super.anInt7351);
		@Pc(39) boolean local39 = false;
		for (@Pc(41) int local41 = 0; super.aClass23Array3.length > local41; local41++) {
			if (super.aClass23Array3[local41] != null && super.aClass23Array3[local41].method7073(arg2, arg0, local19, true)) {
				local39 = true;
				break;
			}
		}
		super.aClass23Array3[0] = super.aClass23Array3[1] = super.aClass23Array3[2] = super.aClass23Array3[3] = null;
		return local39;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!q;IILclient!oa;IILclient!ba;)V")
	private void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class23 arg6) {
		@Pc(12) int local12 = arg2 * arg2 + arg0 * arg0;
		if (local12 < 262144 || arg5 < local12) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg2, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(46) Class23 local46 = Static245.method4275(super.anInt7427, arg3, super.anInt7415, arg4, local32, super.lb);
		if (local46 != null) {
			arg4.method5455(false);
			local46.method7077(arg1, null, 0);
			arg4.method5455(true);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		if (this.aClass67_1 == null || !this.method6230(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class8 local19 = arg0.method5417();
		@Pc(26) int local26 = super.aClass134_7.method3705();
		local19.a(local26);
		local19.G(super.anInt7347, super.anInt7350 - 20, super.anInt7351);
		@Pc(104) int local104;
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean138) {
			@Pc(48) Class169 local48 = this.method6209();
			if (local48.aBoolean389 && (this.aClass67_1.anInt2174 == -1 || Static504.aClass343_2.method7994(this.aClass67_1.anInt2174).aBoolean462)) {
				@Pc(82) Class16 local82 = super.anInt7387 != -1 && super.anInt7401 == 0 ? Static114.aClass156_2.method4101(super.anInt7387) : null;
				@Pc(102) Class16 local102 = super.anInt7390 == -1 || this.aBoolean549 || super.aBoolean545 && local82 != null ? null : Static114.aClass156_2.method4101(super.anInt7390);
				local104 = 0;
				if (super.anInt7396 != 0) {
					local104 = this.method6211();
				}
				@Pc(149) Class23 local149 = Static73.method1562(super.lb, 0, super.anInt7427, 1, 160, arg0, local102 == null ? super.anInt7361 : super.anInt7383, super.aClass23Array3[0], 0, local26, local102 == null ? local82 : local102, super.anInt7415, 240, local104);
				if (local149 != null) {
					arg0.method5455(false);
					local149.method7077(local19, null, 0);
					arg0.method5455(true);
				}
			}
		}
		if (Static350.aClass11_Sub1_Sub1_Sub2_4 == this) {
			local19.GA(super.anInt7347, super.anInt7350, super.anInt7351);
			for (@Pc(178) int local178 = Static83.aClass332Array2.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class332 local184 = Static83.aClass332Array2[local178];
				if (local184 != null && local184.anInt9342 != -1) {
					@Pc(215) int local215;
					if (local184.anInt9341 == 1) {
						@Pc(203) Class6_Sub33 local203 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local184.anInt9334);
						if (local203 != null) {
							@Pc(208) Class11_Sub1_Sub1_Sub1 local208 = local203.aClass11_Sub1_Sub1_Sub1_2;
							local215 = local208.anInt7347 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347;
							@Pc(222) int local222 = local208.anInt7351 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351;
							this.method6229(local222, local19, local215, local184.anInt9342, arg0, 92160000, super.aClass23Array3[0]);
						}
					}
					if (local184.anInt9341 == 2) {
						@Pc(249) int local249 = local184.anInt9339 + 256 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347;
						local104 = local184.anInt9343 + 256 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351;
						local215 = local184.anInt9337 << 9;
						local215 *= local215;
						this.method6229(local104, local19, local249, local184.anInt9342, arg0, local215, super.aClass23Array3[0]);
					}
					if (local184.anInt9341 == 10 && local184.anInt9334 >= 0 && local184.anInt9334 < Static239.aClass11_Sub1_Sub1_Sub2Array1.length) {
						@Pc(300) Class11_Sub1_Sub1_Sub2 local300 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local184.anInt9334];
						if (local300 != null) {
							local104 = local300.anInt7347 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347;
							local215 = local300.anInt7351 - Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351;
							this.method6229(local215, local19, local104, local184.anInt9342, arg0, 92160000, super.aClass23Array3[0]);
						}
					}
				}
			}
			local19.a(local26);
			local19.G(super.anInt7347, super.anInt7350, super.anInt7351);
		}
		local19.a(local26);
		local19.G(super.anInt7347, super.anInt7350 - 5, super.anInt7351);
		@Pc(367) Class5_Sub5 local367 = Static342.method5386(super.aClass23Array3.length);
		this.method6215(arg0, super.aClass23Array3, false, local19);
		if (super.aClass5_Sub2_6 == null) {
			arg0.method5408(super.aClass23Array3, local19, local367.aClass5_Sub4Array1, Static350.aClass11_Sub1_Sub1_Sub2_4 == this ? 1 : 0);
		} else {
			@Pc(397) Class299 local397 = super.aClass5_Sub2_6.method3789();
			arg0.method5445(super.aClass23Array3, local397, local19, local367.aClass5_Sub4Array1, Static350.aClass11_Sub1_Sub1_Sub2_4 == this ? 1 : 0);
		}
		super.anInt7363 = Static555.anInt9478;
		super.aClass23Array3[0] = super.aClass23Array3[1] = super.aClass23Array3[2] = super.aClass23Array3[3] = null;
		return local367;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!oa;IB)Z")
	private boolean method6230(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1;
		@Pc(19) Class169 local19 = this.method6209();
		@Pc(38) Class16 local38 = super.anInt7387 != -1 && super.anInt7401 == 0 ? Static114.aClass156_2.method4101(super.anInt7387) : null;
		@Pc(59) Class16 local59 = super.anInt7390 == -1 || this.aBoolean549 || super.aBoolean545 && local38 != null ? null : Static114.aClass156_2.method4101(super.anInt7390);
		@Pc(62) int local62 = local19.anInt5183;
		@Pc(65) int local65 = local19.anInt5165;
		if (local62 != 0 || local65 != 0 || local19.anInt5167 != 0 || local19.anInt5176 != 0) {
			arg1 |= 0x7;
		}
		@Pc(107) boolean local107 = super.aByte82 != 0 && Static508.anInt8998 >= super.anInt7413 && Static508.anInt8998 < super.anInt7359;
		if (local107) {
			arg1 |= 0x80000;
		}
		@Pc(148) Class23 local148 = super.aClass23Array3[0] = this.aClass67_1.method1977(super.anInt7383, Static504.aClass343_2, super.anInt7414, Static435.aClass234_1, super.anInt7361, arg1, Static114.aClass156_2, Static416.aClass250_1, super.aClass324Array3, local38, arg0, super.anInt7371, local59, super.anInt7356, super.anInt7422, Static517.aClass285_2, Static98.aClass203_1);
		@Pc(151) int local151 = Static293.method4805();
		if (Static205.anInt4372 < 96 && local151 > 50) {
			Static451.method6908();
		}
		@Pc(174) int local174;
		if (Static230.aClass123_8 != Static186.aClass123_6 && local151 < 50) {
			local174 = 50 - local151;
			while (local174 > Static233.anInt4797) {
				Static135.aByteArrayArray10[Static233.anInt4797] = new byte[102400];
				Static233.anInt4797++;
			}
			while (local174 < Static233.anInt4797) {
				Static233.anInt4797--;
				Static135.aByteArrayArray10[Static233.anInt4797] = null;
			}
		} else if (Static230.aClass123_8 != Static186.aClass123_6) {
			Static233.anInt4797 = 0;
			Static135.aByteArrayArray10 = new byte[50][];
		}
		if (local148 == null) {
			return false;
		}
		super.anInt7380 = local148.DA();
		this.method6207(local148);
		local174 = super.aClass134_7.method3705();
		if (local62 == 0 && local65 == 0) {
			this.method6210(0, local174, this.method6212() << 9, 0, this.method6212() << 9);
		} else {
			this.method6210(local19.anInt5189, local174, local62, local19.anInt5180, local65);
			if (super.anInt7427 != 0) {
				local148.AA(super.anInt7427);
			}
			if (super.anInt7415 != 0) {
				local148.v(super.anInt7415);
			}
			if (super.lb != 0) {
				local148.m(0, super.lb, 0);
			}
		}
		if (local107) {
			local148.method7070(super.aByte81, super.aByte80, super.aByte79, super.aByte82 & 0xFF);
		}
		@Pc(331) Class212 local331;
		@Pc(348) boolean local348;
		@Pc(350) int local350;
		@Pc(390) Class23 local390;
		if (this.aBoolean549 || super.anInt7384 == -1 || super.anInt7417 == -1) {
			super.aClass23Array3[1] = null;
		} else {
			local331 = Static355.aClass278_2.method6826(super.anInt7384);
			local348 = local331.aByte56 == 3 && (local62 != 0 || local65 != 0);
			local350 = local15;
			if (local348) {
				local350 = local15 | 0x7;
			} else {
				if (super.anInt7430 != 0) {
					local350 = local15 | 0x5;
				}
				if (super.anInt7418 != 0) {
					local350 |= 0x2;
				}
			}
			local390 = super.aClass23Array3[1] = local331.method5191(super.anInt7417, arg0, super.anInt7408, Static114.aClass156_2, local350, super.anInt7398);
			if (local390 != null) {
				if (super.anInt7418 != 0) {
					local390.m(0, -super.anInt7418 << 2, 0);
				}
				if (super.anInt7430 != 0) {
					local390.I(super.anInt7430 * 2048);
				}
				if (local348) {
					if (super.anInt7427 != 0) {
						local390.AA(super.anInt7427);
					}
					if (super.anInt7415 != 0) {
						local390.v(super.anInt7415);
					}
					if (super.lb != 0) {
						local390.m(0, super.lb, 0);
					}
				}
			}
		}
		if (this.aBoolean549 || super.anInt7393 == -1 || super.anInt7360 == -1) {
			super.aClass23Array3[3] = null;
		} else {
			local331 = Static355.aClass278_2.method6826(super.anInt7393);
			local348 = local331.aByte56 == 3 && (local62 != 0 || local65 != 0);
			local350 = local15;
			if (local348) {
				local350 = local15 | 0x7;
			} else {
				if (super.anInt7409 != 0) {
					local350 = local15 | 0x5;
				}
				if (super.anInt7402 != 0) {
					local350 |= 0x2;
				}
			}
			local390 = super.aClass23Array3[3] = local331.method5192(Static114.aClass156_2, super.anInt7425, super.anInt7423, arg0, local350, super.anInt7360);
			if (local390 != null) {
				if (super.anInt7402 != 0) {
					local390.m(0, -super.anInt7402 << 2, 0);
				}
				if (super.anInt7409 != 0) {
					local390.I(super.anInt7409 * 2048);
				}
				if (local348) {
					if (super.anInt7427 != 0) {
						local390.AA(super.anInt7427);
					}
					if (super.anInt7415 != 0) {
						local390.v(super.anInt7415);
					}
					if (super.lb != 0) {
						local390.m(0, super.lb, 0);
					}
				}
			}
		}
		super.aClass23Array3[2] = null;
		if (!this.aBoolean549 && super.aClass6_Sub14_3 != null) {
			if (Static508.anInt8998 >= super.aClass6_Sub14_3.anInt1910) {
				super.aClass6_Sub14_3 = null;
			} else if (Static508.anInt8998 >= super.aClass6_Sub14_3.anInt1911) {
				@Pc(619) Class23 local619 = super.aClass6_Sub14_3.method1703(arg0, local15 | 0x7);
				if (local619 != null) {
					local619.m(-super.anInt7347 + super.aClass6_Sub14_3.anInt1902, -super.anInt7350 + super.aClass6_Sub14_3.anInt1904 + 5, super.aClass6_Sub14_3.anInt1908 - super.anInt7351);
					if (local174 != 0) {
						local619.I(-local174 & 0x3FFF);
					}
					super.aClass23Array3[2] = local619;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)I")
	@Override
	public int method6212() {
		return this.aClass67_1 == null || this.aClass67_1.anInt2174 == -1 ? super.method6212() : Static504.aClass343_2.method7994(this.aClass67_1.anInt2174).anInt6248;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBIB)V")
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt7387 != -1 && Static114.aClass156_2.method4101(super.anInt7387).anInt583 == 1) {
			super.anInt7387 = -1;
		}
		@Pc(34) Class212 local34;
		if (super.anInt7384 != -1) {
			local34 = Static355.aClass278_2.method6826(super.anInt7384);
			if (local34.aBoolean450 && local34.anInt6056 != -1 && Static114.aClass156_2.method4101(local34.anInt6056).anInt583 == 1) {
				super.anInt7384 = -1;
			}
		}
		if (super.anInt7393 != -1) {
			local34 = Static355.aClass278_2.method6826(super.anInt7393);
			if (local34.aBoolean450 && local34.anInt6056 != -1 && Static114.aClass156_2.method4101(local34.anInt6056).anInt583 == 1) {
				super.anInt7393 = -1;
			}
		}
		this.anInt7455 = -1;
		if (arg2 < 0 || Static228.anInt4746 <= arg2 || arg0 < 0 || Static44.anInt1275 <= arg0) {
			this.method6232(arg0, arg2);
		} else if (super.anIntArray526[0] >= 0 && super.anIntArray526[0] < Static228.anInt4746 && super.anIntArray527[0] >= 0 && super.anIntArray527[0] < Static44.anInt1275) {
			if (arg1 == 2) {
				Static27.method983(arg2, this, arg0);
			}
			this.method6225(arg2, arg1, arg0);
		} else {
			this.method6232(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V")
	public void method6232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7435 = 0;
		super.anIntArray526[0] = arg1;
		super.anInt7432 = 0;
		super.anInt7433 = 0;
		super.anIntArray527[0] = arg0;
		@Pc(26) int local26 = this.method6212();
		super.anInt7347 = local26 * 256 + super.anIntArray526[0] * 512;
		super.anInt7351 = super.anIntArray527[0] * 512 + local26 * 256;
		if (Static350.aClass11_Sub1_Sub1_Sub2_4 == this) {
			Static200.method3771();
		}
		if (super.aClass5_Sub2_6 != null) {
			super.aClass5_Sub2_6.method3780();
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(Z)Z")
	public boolean method6233() {
		return this.aClass67_1 != null;
	}
}
