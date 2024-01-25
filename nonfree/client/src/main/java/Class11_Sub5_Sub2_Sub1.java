import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class11_Sub5_Sub2_Sub1 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!ki", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!ki", name = "Vc", descriptor = "I")
	public int anInt4165;

	@OriginalMember(owner = "client!ki", name = "cd", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!ki", name = "Ad", descriptor = "Lclient!gv;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!ki", name = "Bd", descriptor = "I")
	private int anInt4194;

	@OriginalMember(owner = "client!ki", name = "Dd", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!ki", name = "Nc", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!ki", name = "Sc", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!ki", name = "Rc", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!ki", name = "gd", descriptor = "I")
	public int anInt4174 = 0;

	@OriginalMember(owner = "client!ki", name = "hd", descriptor = "I")
	public int anInt4175 = -1;

	@OriginalMember(owner = "client!ki", name = "Tc", descriptor = "I")
	public int anInt4163 = -1;

	@OriginalMember(owner = "client!ki", name = "Oc", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!ki", name = "bd", descriptor = "I")
	public int anInt4170 = -1;

	@OriginalMember(owner = "client!ki", name = "Yc", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!ki", name = "Lc", descriptor = "I")
	public int anInt4160 = 0;

	@OriginalMember(owner = "client!ki", name = "od", descriptor = "I")
	public int anInt4182 = -1;

	@OriginalMember(owner = "client!ki", name = "ad", descriptor = "I")
	public int anInt4169 = 0;

	@OriginalMember(owner = "client!ki", name = "fd", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!ki", name = "vd", descriptor = "I")
	public int anInt4189 = 0;

	@OriginalMember(owner = "client!ki", name = "rd", descriptor = "I")
	public int anInt4185 = -1;

	@OriginalMember(owner = "client!ki", name = "Cd", descriptor = "I")
	public int anInt4195 = 0;

	@OriginalMember(owner = "client!ki", name = "Fc", descriptor = "I")
	public int anInt4156 = 255;

	@OriginalMember(owner = "client!ki", name = "pd", descriptor = "I")
	public int anInt4183 = -1;

	@OriginalMember(owner = "client!ki", name = "zd", descriptor = "I")
	public int anInt4193 = -1;

	@OriginalMember(owner = "client!ki", name = "Hc", descriptor = "I")
	public int anInt4157 = -1;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)I")
	@Override
	public int method6044() {
		return super.anInt6523;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBI)V")
	public void method3617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6549 = 0;
		super.anInt6550 = 0;
		super.anInt6551 = 0;
		super.anIntArray523[0] = arg0;
		super.anIntArray524[0] = arg1;
		@Pc(26) int local26 = this.method5302();
		super.anInt7515 = super.anIntArray524[0] * 128 + local26 * 64;
		super.anInt7514 = local26 * 64 + super.anIntArray523[0] * 128;
		if (Static52.aClass11_Sub5_Sub2_Sub1_2 == this) {
			Static94.method1834();
		}
		if (super.aClass71_Sub6_6 != null) {
			super.aClass71_Sub6_6.method5793();
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)I")
	@Override
	public int method5296() {
		return -1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!wn;)V")
	public void method3619(@OriginalArg(1) Class4_Sub20 arg0) {
		arg0.anInt5526 = 0;
		@Pc(12) int local12 = arg0.method4614();
		this.aByte39 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method5302();
		this.method5304((local12 >> 3 & 0x7) + 1);
		this.aByte40 = (byte) (local12 >> 6 & 0x3);
		super.anInt7514 += this.method5302() - local44 << 6;
		super.anInt7515 += this.method5302() - local44 << 6;
		this.aByte38 = arg0.method4576();
		this.anInt4163 = arg0.method4576();
		this.anInt4193 = arg0.method4576();
		this.anInt4189 = 0;
		@Pc(108) int local108 = -1;
		@Pc(111) int[] local111 = new int[12];
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(179) int local179;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(119) int local119 = arg0.method4614();
			if (local119 == 0) {
				local111[local113] = 0;
			} else {
				local131 = arg0.method4614();
				local137 = (local119 << 8) + local131;
				if (local113 == 0 && local137 == 65535) {
					local108 = arg0.method4560();
					this.anInt4189 = arg0.method4614();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static216.anIntArray472[local137 - 32768];
					local111[local113] = local137 | 0x40000000;
					local179 = Static139.aClass193_1.method4650(local137).anInt7864;
					if (local179 != 0) {
						this.anInt4189 = local179;
					}
				} else {
					local111[local113] = local137 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(203) int[] local203 = new int[5];
		for (local131 = 0; local131 < 5; local131++) {
			local137 = arg0.method4614();
			if (local137 < 0 || Static220.aShortArrayArray5[local131].length <= local137) {
				local137 = 0;
			}
			local203[local131] = local137;
		}
		this.anInt4194 = arg0.method4560();
		this.aString32 = arg0.method4624();
		if (local29) {
			this.aString31 = arg0.method4624();
		} else {
			this.aString31 = this.aString32;
		}
		this.anInt4174 = arg0.method4614();
		if (local40) {
			this.anInt4169 = arg0.method4560();
			this.anInt4160 = this.anInt4174;
			this.anInt4183 = -1;
		} else {
			this.anInt4169 = 0;
			this.anInt4160 = arg0.method4614();
			this.anInt4183 = arg0.method4614();
			if (this.anInt4183 == 255) {
				this.anInt4183 = -1;
			}
		}
		local137 = this.anInt4195;
		this.anInt4195 = arg0.method4614();
		@Pc(333) int local333;
		if (this.anInt4195 == 0) {
			Static72.method1585(this);
		} else {
			local179 = this.anInt4175;
			@Pc(330) int local330 = this.anInt4182;
			local333 = this.anInt4170;
			@Pc(336) int local336 = this.anInt4157;
			@Pc(339) int local339 = this.anInt4156;
			this.anInt4175 = arg0.method4560();
			this.anInt4182 = arg0.method4560();
			this.anInt4170 = arg0.method4560();
			this.anInt4157 = arg0.method4560();
			this.anInt4156 = arg0.method4614();
			if (local137 != this.anInt4195 || local179 != this.anInt4175 || this.anInt4182 != local330 || this.anInt4170 != local333 || local336 != this.anInt4157 || local339 != this.anInt4156) {
				Static249.method4101(this);
			}
		}
		if (this.aClass90_1 == null) {
			this.aClass90_1 = new Class90();
		}
		local179 = this.aClass90_1.anInt2861;
		@Pc(424) int[] local424 = this.aClass90_1.anIntArray242;
		this.aClass90_1.method2572(local108, this.method5295(), local111, local203, this.aByte39 == 1);
		if (local179 != local108) {
			super.anInt7514 = (super.anIntArray523[0] << 7) + (this.method5302() << 6);
			super.anInt7515 = (super.anIntArray524[0] << 7) + (this.method5302() << 6);
		}
		if (super.anInt6518 == Static147.anInt3062 && local424 != null) {
			for (local333 = 0; local333 < local203.length; local333++) {
				if (local424[local333] != local203[local333]) {
					Static139.aClass193_1.method4649();
					break;
				}
			}
		}
		if (super.aClass71_Sub6_6 != null) {
			super.aClass71_Sub6_6.method5793();
		}
		if (super.anInt6484 == -1 || !super.aBoolean475) {
			return;
		}
		@Pc(527) Class231 local527 = this.method5306();
		if (!local527.method5239(super.anInt6484)) {
			super.aBoolean475 = false;
			super.anInt6484 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	@Override
	protected int method5295() {
		return this.anInt4194;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "(I)Z")
	public boolean method3620() {
		return this.aClass90_1 != null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIB)V")
	public void method3621(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt6505 != -1 && Static143.aClass85_1.method2406(super.anInt6505).anInt3950 == 1) {
			super.anInt6505 = -1;
		}
		@Pc(37) Class149 local37;
		if (super.anInt6515 != -1) {
			local37 = Static193.aClass186_1.method4462(super.anInt6515);
			if (local37.aBoolean297 && local37.anInt4573 != -1 && Static143.aClass85_1.method2406(local37.anInt4573).anInt3950 == 1) {
				super.anInt6515 = -1;
			}
		}
		if (super.anInt6486 != -1) {
			local37 = Static193.aClass186_1.method4462(super.anInt6486);
			if (local37.aBoolean297 && local37.anInt4573 != -1 && Static143.aClass85_1.method2406(local37.anInt4573).anInt3950 == 1) {
				super.anInt6486 = -1;
			}
		}
		this.anInt4185 = -1;
		if (arg2 < 0 || Static193.anInt3853 <= arg2 || arg1 < 0 || arg1 >= Static301.anInt5585) {
			this.method3617(arg2, arg1);
		} else if (super.anIntArray523[0] >= 0 && super.anIntArray523[0] < Static193.anInt3853 && super.anIntArray524[0] >= 0 && super.anIntArray524[0] < Static301.anInt5585) {
			if (arg0 == 2) {
				Static136.method2532(arg1, this, arg2);
			}
			this.method3627(arg2, arg1, arg0);
		} else {
			this.method3617(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		if (this.aClass90_1 == null || !this.method3626(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class72 local19 = arg2.method2092();
		@Pc(24) int local24 = super.aClass102_7.method2899();
		local19.s(local24);
		local19.J(super.anInt7514, super.anInt7511, super.anInt7515);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass57Array3.length; local44++) {
			if (super.aClass57Array3[local44] != null && super.aClass57Array3[local44].method6070(arg1, arg0, local19, true)) {
				local42 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILclient!ka;ILclient!qa;ILclient!n;)V")
	private void method3623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class72 arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg0 * arg0;
		if (local11 < 16384 || arg5 < local11) {
			return;
		}
		@Pc(44) int local44 = (int) (Math.atan2((double) arg1, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(56) Class57 local56 = Static236.method3988(arg3, arg4, super.anInt6480, super.anInt6510, super.anInt6483, local44);
		if (local56 != null) {
			arg4.method2106(false);
			local56.method6073(arg6, null, 0);
			arg4.method2106(true);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3624() {
		return this.aString31;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method3625() {
		@Pc(7) String local7 = "";
		if (Static228.aStringArray21 != null) {
			local7 = local7 + Static228.aStringArray21[this.aByte40];
		}
		@Pc(31) int[] local31;
		if (this.aByte39 == 1 && Static393.anIntArray556 != null) {
			local31 = Static393.anIntArray556;
		} else {
			local31 = Static295.anIntArray444;
		}
		if (local31 != null && local31[this.aByte40] != -1) {
			@Pc(57) Class43 local57 = Static166.aClass246_3.method5653(local31[this.aByte40]);
			if (local57.aChar1 == 's') {
				local7 = local7 + local57.method1209(this.aByte38 & 0xFF);
			} else {
				Static417.method5814(new Throwable(), "gdn1");
				local31[this.aByte40] = -1;
			}
		}
		local7 = local7 + this.aString32;
		if (Static255.aStringArray24 != null) {
			local7 = local7 + Static255.aStringArray24[this.aByte40];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method3626(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class231 local11 = this.method5306();
		@Pc(26) Class130 local26 = super.anInt6505 != -1 && super.anInt6496 == 0 ? Static143.aClass85_1.method2406(super.anInt6505) : null;
		@Pc(46) Class130 local46 = super.anInt6484 == -1 || this.aBoolean261 || super.aBoolean475 && local26 != null ? null : Static143.aClass85_1.method2406(super.anInt6484);
		@Pc(57) int local57 = local11.anInt6417;
		@Pc(60) int local60 = local11.anInt6383;
		if (local57 != 0 || local60 != 0 || local11.anInt6386 != 0 || local11.anInt6420 != 0) {
			arg1 |= 0x7;
		}
		@Pc(101) boolean local101 = super.aByte78 != 0 && Static277.anInt2834 >= super.anInt6492 && super.anInt6524 > Static277.anInt2834;
		if (local101) {
			arg1 |= 0x80000;
		}
		@Pc(142) Class57 local142 = super.aClass57Array3[0] = this.aClass90_1.method2563(local26, super.anInt6472, arg0, Static123.aClass223_1, super.anInt6540, Static383.aClass126_2, super.anInt6491, Static143.aClass85_1, super.anInt6543, Static67.aClass224_1, arg1, super.anInt6479, Static220.aClass247_1, local46, super.aClass15Array3, super.anInt6487, Static139.aClass193_1);
		@Pc(145) int local145 = Static290.method4479();
		if (Static263.anInt5007 < 96 && local145 > 50) {
			Static304.method4690();
		}
		@Pc(178) int local178;
		if (Static42.aClass219_1 != Static297.aClass219_2 && local145 < 50) {
			local178 = 50 - local145;
			while (Static459.anInt7451 < local178) {
				Static1.aByteArrayArray1[Static459.anInt7451] = new byte[102400];
				Static459.anInt7451++;
			}
			while (Static459.anInt7451 > local178) {
				Static459.anInt7451--;
				Static1.aByteArrayArray1[Static459.anInt7451] = null;
			}
		} else if (Static297.aClass219_2 != Static42.aClass219_1) {
			Static1.aByteArrayArray1 = new byte[50][];
			Static459.anInt7451 = 0;
		}
		if (local142 == null) {
			return false;
		}
		super.anInt6523 = local142.ja();
		this.method5308(local142);
		local178 = super.aClass102_7.method2899();
		if (local57 == 0 && local60 == 0) {
			this.method5293(this.method5302() << 7, 0, this.method5302() << 7, local178, 0);
		} else {
			this.method5293(local57, local11.anInt6393, local60, local178, local11.anInt6387);
			if (super.anInt6483 != 0) {
				local142.E(super.anInt6483);
			}
			if (super.anInt6510 != 0) {
				local142.S(super.anInt6510);
			}
			if (super.anInt6480 != 0) {
				local142.R(0, super.anInt6480, 0);
			}
		}
		if (local101) {
			local142.method6079(super.aByte80, super.aByte79, super.aByte77, super.aByte78 & 0xFF);
		}
		@Pc(322) Class149 local322;
		@Pc(336) boolean local336;
		@Pc(338) int local338;
		@Pc(381) Class57 local381;
		if (this.aBoolean261 || super.anInt6515 == -1 || super.anInt6512 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local322 = Static193.aClass186_1.method4462(super.anInt6515);
			local336 = local322.aByte46 == 3 && (local57 != 0 || local60 != 0);
			local338 = local7;
			if (local336) {
				local338 = local7 | 0x7;
			} else {
				if (super.anInt6507 != 0) {
					local338 = local7 | 0x5;
				}
				if (super.anInt6504 != 0) {
					local338 |= 0x2;
				}
			}
			local381 = super.aClass57Array3[1] = local322.method3923(arg0, Static143.aClass85_1, super.anInt6490, local338, super.anInt6512, super.anInt6521);
			if (local381 != null) {
				if (super.anInt6504 != 0) {
					local381.R(0, -super.anInt6504 << 0, 0);
				}
				if (super.anInt6507 != 0) {
					local381.l(super.anInt6507 * 2048);
				}
				if (local336) {
					if (super.anInt6483 != 0) {
						local381.E(super.anInt6483);
					}
					if (super.anInt6510 != 0) {
						local381.S(super.anInt6510);
					}
					if (super.anInt6480 != 0) {
						local381.R(0, super.anInt6480, 0);
					}
				}
			}
		}
		if (this.aBoolean261 || super.anInt6486 == -1 || super.anInt6494 == -1) {
			super.aClass57Array3[3] = null;
		} else {
			local322 = Static193.aClass186_1.method4462(super.anInt6486);
			local336 = local322.aByte46 == 3 && (local57 != 0 || local60 != 0);
			local338 = local7;
			if (local336) {
				local338 = local7 | 0x7;
			} else {
				if (super.anInt6528 != 0) {
					local338 = local7 | 0x5;
				}
				if (super.anInt6493 != 0) {
					local338 |= 0x2;
				}
			}
			local381 = super.aClass57Array3[3] = local322.method3925(Static143.aClass85_1, local338, arg0, super.anInt6534, super.anInt6497, super.anInt6494);
			if (local381 != null) {
				if (super.anInt6493 != 0) {
					local381.R(0, -super.anInt6493 << 0, 0);
				}
				if (super.anInt6528 != 0) {
					local381.l(super.anInt6528 * 2048);
				}
				if (local336) {
					if (super.anInt6483 != 0) {
						local381.E(super.anInt6483);
					}
					if (super.anInt6510 != 0) {
						local381.S(super.anInt6510);
					}
					if (super.anInt6480 != 0) {
						local381.R(0, super.anInt6480, 0);
					}
				}
			}
		}
		super.aClass57Array3[2] = null;
		if (!this.aBoolean261 && super.aClass4_Sub46_3 != null) {
			if (super.aClass4_Sub46_3.anInt7379 <= Static277.anInt2834) {
				super.aClass4_Sub46_3 = null;
			} else if (Static277.anInt2834 >= super.aClass4_Sub46_3.anInt7373) {
				@Pc(620) Class57 local620 = super.aClass4_Sub46_3.method5933(arg0, local7 | 0x7);
				if (local620 != null) {
					local620.R(super.aClass4_Sub46_3.anInt7381 - super.anInt7514, -super.anInt7511 + super.aClass4_Sub46_3.anInt7387, super.aClass4_Sub46_3.anInt7374 - super.anInt7515);
					if (local178 != 0) {
						local620.l(-local178 & 0x3FFF);
					}
					super.aClass57Array3[2] = local620;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBIB)V")
	public void method3627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6549 < 9) {
			super.anInt6549++;
		}
		for (@Pc(24) int local24 = super.anInt6549; local24 > 0; local24--) {
			super.anIntArray523[local24] = super.anIntArray523[local24 - 1];
			super.anIntArray524[local24] = super.anIntArray524[local24 - 1];
			super.aByteArray87[local24] = super.aByteArray87[local24 - 1];
		}
		super.anIntArray523[0] = arg0;
		super.aByteArray87[0] = arg2;
		super.anIntArray524[0] = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
	@Override
	public int method5302() {
		return this.aClass90_1 == null || this.aClass90_1.anInt2861 == -1 ? super.method5302() : Static220.aClass247_1.method5660(this.aClass90_1.anInt2861).anInt7007;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		if (this.aClass90_1 == null || !this.method3626(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class72 local19 = arg0.method2092();
		@Pc(24) int local24 = super.aClass102_7.method2899();
		local19.s(local24);
		local19.J(super.anInt7514, super.anInt7511, super.anInt7515);
		@Pc(38) float local38 = arg0.I();
		@Pc(41) float local41 = arg0.s();
		@Pc(108) int local108;
		if (Static157.aClass185_Sub1_1.aBoolean395) {
			@Pc(48) Class231 local48 = this.method5306();
			if (local48.aBoolean472 && (this.aClass90_1.anInt2861 == -1 || Static220.aClass247_1.method5660(this.aClass90_1.anInt2861).aBoolean519)) {
				@Pc(86) Class130 local86 = super.anInt6505 != -1 && super.anInt6496 == 0 ? Static143.aClass85_1.method2406(super.anInt6505) : null;
				@Pc(106) Class130 local106 = super.anInt6484 == -1 || this.aBoolean261 || super.aBoolean475 && local86 != null ? null : Static143.aClass85_1.method2406(super.anInt6484);
				local108 = 0;
				if (super.anInt6481 != 0) {
					local108 = this.method5300();
				}
				@Pc(153) Class57 local153 = Static219.method3807(local106 == null ? local86 : local106, local106 == null ? super.anInt6543 : super.anInt6491, 240, local108, super.anInt6483, 1, arg0, local24, super.aClass57Array3[0], 0, super.anInt6480, super.anInt6510, 160, 0);
				if (local153 != null) {
					arg0.PA(local38, local41 - 128.0F);
					arg0.method2106(false);
					local153.method6073(local19, null, 0);
					arg0.method2106(true);
				}
			}
		}
		if (Static52.aClass11_Sub5_Sub2_Sub1_2 == this) {
			arg0.PA(local38, local41 - 144.0F);
			local19.C(super.anInt7514, super.anInt7511, super.anInt7515);
			for (@Pc(194) int local194 = Static209.aClass51Array1.length - 1; local194 >= 0; local194--) {
				@Pc(200) Class51 local200 = Static209.aClass51Array1[local194];
				if (local200 != null && local200.anInt1747 != -1) {
					@Pc(231) int local231;
					if (local200.anInt1749 == 1) {
						@Pc(219) Class4_Sub44 local219 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local200.anInt1740);
						if (local219 != null) {
							@Pc(224) Class11_Sub5_Sub2_Sub2 local224 = local219.aClass11_Sub5_Sub2_Sub2_2;
							local231 = local224.anInt7514 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514;
							@Pc(238) int local238 = local224.anInt7515 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515;
							this.method3623(local238, local231, super.aClass57Array3[0], local200.anInt1747, arg0, 5760000, local19);
						}
					}
					if (local200.anInt1749 == 2) {
						@Pc(267) int local267 = local200.anInt1746 + 64 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514;
						local108 = local200.anInt1748 + 64 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515;
						local231 = local200.anInt1738 << 7;
						local231 *= local231;
						this.method3623(local108, local267, super.aClass57Array3[0], local200.anInt1747, arg0, local231, local19);
					}
					if (local200.anInt1749 == 10 && local200.anInt1740 >= 0 && Static39.aClass11_Sub5_Sub2_Sub1Array1.length > local200.anInt1740) {
						@Pc(323) Class11_Sub5_Sub2_Sub1 local323 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local200.anInt1740];
						if (local323 != null) {
							local108 = local323.anInt7514 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514;
							local231 = local323.anInt7515 - Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515;
							this.method3623(local231, local108, super.aClass57Array3[0], local200.anInt1747, arg0, 5760000, local19);
						}
					}
				}
			}
			local19.s(local24);
			local19.J(super.anInt7514, super.anInt7511, super.anInt7515);
		}
		arg0.PA(local38, local41);
		@Pc(377) Class71_Sub3 local377 = Static127.method2399(super.aClass57Array3.length);
		if (super.aClass71_Sub6_6 == null) {
			arg0.method2050(super.aClass57Array3, local19, local377.aClass71_Sub7Array1, Static52.aClass11_Sub5_Sub2_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(384) Class270 local384 = super.aClass71_Sub6_6.method5794();
			arg0.method2078(super.aClass57Array3, local384, local19, local377.aClass71_Sub7Array1, Static52.aClass11_Sub5_Sub2_Sub1_2 == this ? 1 : 0);
		}
		this.method5290(arg0, super.aClass57Array3, false);
		if (super.aClass57Array3[2] != null) {
			if (local24 != 0) {
				super.aClass57Array3[2].l(local24);
			}
			super.aClass57Array3[2].R(super.anInt7514 - super.aClass4_Sub46_3.anInt7381, -super.aClass4_Sub46_3.anInt7387 + super.anInt7511, -super.aClass4_Sub46_3.anInt7374 + super.anInt7515);
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		super.anInt6473 = Static213.anInt4343;
		return local377;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		if (this.aClass90_1 != null && (super.aBoolean478 || this.method3626(arg0, 0))) {
			this.method5290(arg0, super.aClass57Array3, super.aBoolean478);
			super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		}
	}
}
