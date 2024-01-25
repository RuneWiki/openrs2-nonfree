import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class11_Sub1_Sub1_Sub2_Sub1 extends Class11_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ak", name = "gd", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ak", name = "od", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!ak", name = "Cd", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "client!ak", name = "Pd", descriptor = "Lclient!in;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!ak", name = "Ud", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!ak", name = "Wd", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ak", name = "ed", descriptor = "I")
	public int anInt538 = 0;

	@OriginalMember(owner = "client!ak", name = "md", descriptor = "I")
	public int anInt543 = 0;

	@OriginalMember(owner = "client!ak", name = "hd", descriptor = "I")
	public int anInt540 = -1;

	@OriginalMember(owner = "client!ak", name = "td", descriptor = "I")
	public int anInt549 = 0;

	@OriginalMember(owner = "client!ak", name = "vd", descriptor = "B")
	private byte aByte26 = 0;

	@OriginalMember(owner = "client!ak", name = "pd", descriptor = "I")
	public int anInt546 = -1;

	@OriginalMember(owner = "client!ak", name = "Gd", descriptor = "I")
	public int anInt560 = -1;

	@OriginalMember(owner = "client!ak", name = "ld", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!ak", name = "Jd", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ak", name = "yd", descriptor = "I")
	public int anInt553 = 0;

	@OriginalMember(owner = "client!ak", name = "xd", descriptor = "I")
	public int anInt552 = -1;

	@OriginalMember(owner = "client!ak", name = "nd", descriptor = "I")
	public int anInt544 = -1;

	@OriginalMember(owner = "client!ak", name = "cd", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!ak", name = "Md", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ak", name = "Hd", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ak", name = "Td", descriptor = "I")
	public int anInt568 = -1;

	@OriginalMember(owner = "client!ak", name = "Sd", descriptor = "I")
	public int anInt567 = 255;

	@OriginalMember(owner = "client!ak", name = "Vd", descriptor = "I")
	public int anInt570 = -1;

	@OriginalMember(owner = "client!ak", name = "sd", descriptor = "I")
	public int anInt548 = -1;

	@OriginalMember(owner = "client!ak", name = "Ed", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!ak", name = "Kd", descriptor = "I")
	public int anInt562 = 0;

	@OriginalMember(owner = "client!ak", name = "kd", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILclient!ha;)Z")
	private boolean method419(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class165 local9 = this.method2761();
		@Pc(28) Class149 local28 = super.anInt3258 != -1 && super.anInt3232 == 0 ? Static185.aClass303_1.method7201(super.anInt3258) : null;
		@Pc(48) Class149 local48 = super.anInt3253 == -1 || this.aBoolean46 || super.aBoolean275 && local28 != null ? null : Static185.aClass303_1.method7201(super.anInt3253);
		@Pc(51) int local51 = local9.anInt4883;
		@Pc(54) int local54 = local9.anInt4898;
		if (local51 != 0 || local54 != 0 || local9.anInt4891 != 0 || local9.anInt4896 != 0) {
			arg0 |= 0x7;
		}
		@Pc(76) int local76 = super.aClass82_7.method1815();
		@Pc(98) boolean local98 = super.aByte60 != 0 && super.anInt3271 <= Static325.anInt5888 && Static325.anInt5888 < super.anInt3228;
		if (local98) {
			arg0 |= 0x80000;
		}
		@Pc(142) Class25 local142 = super.aClass25Array3[0] = this.aClass163_1.method4027(super.anInt3225, local76, super.anInt3263, super.aClass203Array3, super.anInt3266, super.anInt3281, local48, super.anInt3235, Static438.aClass198_1, super.anIntArray231, Static341.aClass76_1, Static185.aClass303_1, super.anInt3243, Static182.aClass140_1, arg0, Static489.aClass344_1, arg1, local28, Static570.aClass267_2);
		@Pc(145) int local145 = Static64.method1234();
		if (Static545.anInt9053 < 96 && local145 > 50) {
			Static184.method3328();
		}
		if (Static95.aClass86_5 != Static267.aClass86_7 && local145 < 50) {
			@Pc(167) int local167 = 50 - local145;
			while (Static568.anInt9372 < local167) {
				Static226.aByteArrayArray11[Static568.anInt9372] = new byte[102400];
				Static568.anInt9372++;
			}
			while (Static568.anInt9372 > local167) {
				Static568.anInt9372--;
				Static226.aByteArrayArray11[Static568.anInt9372] = null;
			}
		} else if (Static95.aClass86_5 != Static267.aClass86_7) {
			Static568.anInt9372 = 0;
			Static226.aByteArrayArray11 = new byte[50][];
		}
		if (local142 == null) {
			return false;
		}
		super.anInt3238 = local142.fa();
		super.anInt3213 = local142.ma();
		this.method2770(local142);
		if (local51 == 0 && local54 == 0) {
			this.method2772(this.method2778() << 9, local76, this.method2778() << 9, 0, 0);
		} else {
			this.method2772(local54, local76, local51, local9.anInt4909, local9.anInt4894);
			if (super.anInt3233 != 0) {
				local142.FA(super.anInt3233);
			}
			if (super.anInt3256 != 0) {
				local142.VA(super.anInt3256);
			}
			if (super.lb != 0) {
				local142.H(0, super.lb, 0);
			}
		}
		if (local98) {
			local142.method7733(super.aByte61, super.aByte62, super.aByte63, super.aByte60 & 0xFF);
		}
		@Pc(338) boolean local338;
		@Pc(340) int local340;
		@Pc(395) Class25 local395;
		@Pc(411) int local411;
		@Pc(413) int local413;
		@Pc(415) int local415;
		@Pc(502) int local502;
		@Pc(532) int local532;
		@Pc(541) int local541;
		@Pc(545) int local545;
		@Pc(555) int local555;
		@Pc(323) Class69 local323;
		if (this.aBoolean46 || super.anInt3270 == -1 || super.anInt3214 == -1) {
			super.aClass25Array3[1] = null;
		} else {
			local323 = Static414.aClass356_2.method8213(super.anInt3270);
			local338 = local323.aByte45 == 3 && (local51 != 0 || local54 != 0);
			local340 = local5;
			if (local338) {
				local340 = local5 | 0x7;
			} else {
				if (super.anInt3230 != 0) {
					local340 = local5 | 0x5;
				}
				if (super.anInt3268 != 0) {
					local340 |= 0x2;
				}
				if (super.anInt3242 != 0) {
					local340 |= 0x7;
				}
			}
			local395 = super.aClass25Array3[1] = local323.method1581(super.anInt3227, super.anInt3214, arg1, super.anInt3254, local340, Static185.aClass303_1);
			if (local395 != null) {
				if (super.anInt3242 >= 0 && local9.anIntArrayArray39 != null && local9.anIntArrayArray39[super.anInt3242] != null) {
					local411 = 0;
					local413 = 0;
					local415 = 0;
					if (local9.anIntArrayArray39 != null && local9.anIntArrayArray39[super.anInt3242] != null) {
						local411 = local9.anIntArrayArray39[super.anInt3242][0];
						local413 = local9.anIntArrayArray39[super.anInt3242][1];
						local415 = local9.anIntArrayArray39[super.anInt3242][2];
					}
					if (local9.anIntArrayArray40 != null && local9.anIntArrayArray40[super.anInt3242] != null) {
						local413 += local9.anIntArrayArray40[super.anInt3242][1];
						local411 += local9.anIntArrayArray40[super.anInt3242][0];
						local415 += local9.anIntArrayArray40[super.anInt3242][2];
					}
					if (local415 != 0 || local411 != 0) {
						local502 = local76;
						if (super.anIntArray231 != null && super.anIntArray231[super.anInt3242] != -1) {
							local502 = super.anIntArray231[super.anInt3242];
						}
						local532 = super.anInt3230 * 2048 + local502 - local76 & 0x3FFF;
						if (local532 != 0) {
							local395.a(local532);
						}
						local541 = Class353.anIntArray681[local532];
						local545 = Class353.anIntArray682[local532];
						local555 = local545 * local411 + local541 * local415 >> 14;
						local415 = local415 * local545 - local411 * local541 >> 14;
						local411 = local555;
					}
					local395.H(local411, local413, local415);
				} else if (super.anInt3230 != 0) {
					local395.a(super.anInt3230 * 2048);
				}
				if (super.anInt3268 != 0) {
					local395.H(0, -super.anInt3268 << 2, 0);
				}
				if (local338) {
					if (super.anInt3233 != 0) {
						local395.FA(super.anInt3233);
					}
					if (super.anInt3256 != 0) {
						local395.VA(super.anInt3256);
					}
					if (super.lb != 0) {
						local395.H(0, super.lb, 0);
					}
				}
			}
		}
		if (this.aBoolean46 || super.anInt3229 == -1 || super.anInt3208 == -1) {
			super.aClass25Array3[2] = null;
		} else {
			local323 = Static414.aClass356_2.method8213(super.anInt3229);
			local338 = local323.aByte45 == 3 && (local51 != 0 || local54 != 0);
			local340 = local5;
			if (local338) {
				local340 = local5 | 0x7;
			} else {
				if (super.anInt3247 != 0) {
					local340 = local5 | 0x5;
				}
				if (super.anInt3244 != 0) {
					local340 |= 0x2;
				}
				if (super.anInt3218 != 0) {
					local340 |= 0x7;
				}
			}
			local395 = super.aClass25Array3[2] = local323.method1579(local340, super.anInt3208, Static185.aClass303_1, super.anInt3210, arg1, super.anInt3231);
			if (local395 != null) {
				if (super.anInt3218 >= 0 && local9.anIntArrayArray39 != null && local9.anIntArrayArray39[super.anInt3218] != null) {
					local411 = 0;
					local413 = 0;
					local415 = 0;
					if (local9.anIntArrayArray39 != null && local9.anIntArrayArray39[super.anInt3218] != null) {
						local413 = local9.anIntArrayArray39[super.anInt3218][1];
						local415 = local9.anIntArrayArray39[super.anInt3218][2];
						local411 = local9.anIntArrayArray39[super.anInt3218][0];
					}
					if (local9.anIntArrayArray40 != null && local9.anIntArrayArray40[super.anInt3218] != null) {
						local413 += local9.anIntArrayArray40[super.anInt3218][1];
						local411 += local9.anIntArrayArray40[super.anInt3218][0];
						local415 += local9.anIntArrayArray40[super.anInt3218][2];
					}
					if (local415 != 0 || local411 != 0) {
						local502 = local76;
						if (super.anIntArray231 != null && super.anIntArray231[super.anInt3218] != -1) {
							local502 = super.anIntArray231[super.anInt3218];
						}
						local532 = super.anInt3247 * 2048 + local502 - local76 & 0x3FFF;
						if (local532 != 0) {
							local395.a(local532);
						}
						local541 = Class353.anIntArray681[local532];
						local545 = Class353.anIntArray682[local532];
						local555 = local545 * local411 + local415 * local541 >> 14;
						local415 = local545 * local415 - local541 * local411 >> 14;
						local411 = local555;
					}
					local395.H(local411, local413, local415);
				} else if (super.anInt3247 != 0) {
					local395.a(super.anInt3247 * 2048);
				}
				if (super.anInt3244 != 0) {
					local395.H(0, -super.anInt3244 << 2, 0);
				}
				if (local338) {
					if (super.anInt3233 != 0) {
						local395.FA(super.anInt3233);
					}
					if (super.anInt3256 != 0) {
						local395.VA(super.anInt3256);
					}
					if (super.lb != 0) {
						local395.H(0, super.lb, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
	@Override
	protected int method2769() {
		return this.anInt557;
	}

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "(B)Z")
	public boolean method420() {
		return this.aClass163_1 != null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method421() {
		@Pc(11) String local11 = "";
		if (Static1.aStringArray20 != null) {
			local11 = local11 + Static1.aStringArray20[this.aByte27];
		}
		@Pc(33) int[] local33;
		if (this.aByte25 == 1 && Static223.anIntArray315 != null) {
			local33 = Static223.anIntArray315;
		} else {
			local33 = Static590.anIntArray680;
		}
		if (local33 != null && local33[this.aByte27] != -1) {
			@Pc(53) Class340 local53 = Static197.aClass118_1.method3057(local33[this.aByte27]);
			if (local53.aChar5 == 's') {
				local11 = local11 + local53.method7879(this.aByte26 & 0xFF);
			} else {
				Static420.method6396("gdn1", new Throwable());
				local33[this.aByte27] = -1;
			}
		}
		local11 = local11 + this.aString3;
		if (Static271.aStringArray14 != null) {
			local11 = local11 + Static271.aStringArray14[this.aByte27];
		}
		return local11;
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass163_1 == null || !this.method419(131072, arg0)) {
			return false;
		}
		@Pc(17) Class6 local17 = arg0.method7892();
		@Pc(22) int local22 = super.aClass82_7.method1815();
		local17.method6692(local22);
		local17.method6694(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass25Array3.length > local44; local44++) {
			if (super.aClass25Array3[local44] != null && (Static172.aBoolean322 ? super.aClass25Array3[local44].method7730(arg2, arg1, local17, true, 0, Static388.anInt6979) : super.aClass25Array3[local44].method7721(arg2, arg1, local17, true, 0))) {
				local42 = true;
				break;
			}
		}
		super.aClass25Array3[0] = super.aClass25Array3[1] = super.aClass25Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZII)V")
	public void method424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray232[0] = arg1;
		super.anInt3296 = 0;
		super.anInt3294 = 0;
		super.anInt3295 = 0;
		super.anIntArray233[0] = arg0;
		@Pc(26) int local26 = this.method2778();
		super.anInt9929 = super.anIntArray233[0] * 512 + local26 * 256;
		super.anInt9925 = local26 * 256 + super.anIntArray232[0] * 512;
		if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == this) {
			Static57.method1058();
		}
		if (super.aClass11_Sub4_5 != null) {
			super.aClass11_Sub4_5.method2631();
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		if (this.aClass163_1 == null || !super.aBoolean279 && !this.method419(0, arg0)) {
			return;
		}
		@Pc(20) Class6 local20 = arg0.method7892();
		local20.method6692(super.aClass82_7.method1815());
		local20.method6694(super.anInt9925, super.anInt9930 - 5, super.anInt9929);
		this.method2764(local20, super.aClass25Array3, arg0, super.aBoolean279);
		super.aClass25Array3[0] = super.aClass25Array3[1] = super.aClass25Array3[2] = null;
	}

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "(I)I")
	@Override
	public int method2775() {
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method425() {
		return this.aString4;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
	@Override
	public int method2778() {
		return this.aClass163_1 == null || this.aClass163_1.anInt4833 == -1 ? super.method2778() : Static341.aClass76_1.method1676(this.aClass163_1.anInt4833).anInt6892;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		if (this.aClass163_1 == null || !this.method419(2048, arg0)) {
			return null;
		}
		@Pc(19) Class6 local19 = arg0.method7892();
		@Pc(24) int local24 = super.aClass82_7.method1815();
		local19.method6692(local24);
		@Pc(42) Class217 local42 = Static440.aClass217ArrayArrayArray3[super.aByte124][super.anInt9925 >> Static415.anInt7579][super.anInt9929 >> Static415.anInt7579];
		if (local42 == null || local42.aClass11_Sub1_Sub4_1 == null) {
			super.anInt3280 = (int) ((float) super.anInt3280 - (float) super.anInt3280 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt3280 - local42.aClass11_Sub1_Sub4_1.aShort113;
			super.anInt3280 = (int) ((float) super.anInt3280 - (float) local69 / 10.0F);
		}
		local19.method6694(super.anInt9925, -super.anInt3280 + super.anInt9930 - 20, super.anInt9929);
		@Pc(96) Class11_Sub10 local96 = null;
		super.aBoolean278 = false;
		if (Static404.aClass2_Sub13_2.aClass33_Sub15_1.method4903() == 1) {
			@Pc(111) Class165 local111 = this.method2761();
			if (local111.aBoolean395 && (this.aClass163_1.anInt4833 == -1 || Static341.aClass76_1.method1676(this.aClass163_1.anInt4833).aBoolean514)) {
				@Pc(143) Class149 local143 = super.anInt3258 != -1 && super.anInt3232 == 0 ? Static185.aClass303_1.method7201(super.anInt3258) : null;
				@Pc(163) Class149 local163 = super.anInt3253 == -1 || this.aBoolean46 || super.aBoolean275 && local143 != null ? null : Static185.aClass303_1.method7201(super.anInt3253);
				@Pc(195) Class25 local195 = Static51.method993(160, 0, 1, super.aClass25Array3[0], arg0, local24, super.lb, local163 == null ? super.anInt3263 : super.anInt3281, super.anInt3233, 240, super.anInt3256, 0, local163 == null ? local143 : local163);
				if (local195 != null) {
					local96 = Static600.method8238(super.aClass25Array3.length + 1, true);
					super.aBoolean278 = true;
					arg0.C(false);
					if (Static172.aBoolean322) {
						local195.method7725(local19, local96.aClass11_Sub7Array1[super.aClass25Array3.length], Static388.anInt6979, 0);
					} else {
						local195.method7735(local19, local96.aClass11_Sub7Array1[super.aClass25Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(256) int local256;
		if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == this) {
			local19.method6701(super.anInt9925, super.anInt9930, super.anInt9929);
			for (local256 = Static388.aClass60Array1.length - 1; local256 >= 0; local256--) {
				@Pc(262) Class60 local262 = Static388.aClass60Array1[local256];
				if (local262 != null && local262.anInt1604 != -1) {
					@Pc(294) int local294;
					if (local262.anInt1599 == 1) {
						@Pc(283) Class2_Sub51 local283 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local262.anInt1606);
						if (local283 != null) {
							@Pc(288) Class11_Sub1_Sub1_Sub2_Sub2 local288 = local283.aClass11_Sub1_Sub1_Sub2_Sub2_2;
							local294 = local288.anInt9925 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925;
							@Pc(301) int local301 = local288.anInt9929 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
							if (Static172.aBoolean322) {
								this.method427(92160000, arg0, super.aClass25Array3[0], local294, local19, local301, Static388.anInt6979, local262.anInt1604);
							} else {
								this.method428(local294, super.aClass25Array3[0], local19, local262.anInt1604, 92160000, local301, arg0);
							}
						}
					}
					@Pc(358) int local358;
					if (local262.anInt1599 == 2) {
						@Pc(349) int local349 = local262.anInt1602 + 256 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925;
						local358 = local262.anInt1600 + 256 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
						local294 = local262.anInt1603 << 9;
						local294 *= local294;
						if (Static172.aBoolean322) {
							this.method427(local294, arg0, super.aClass25Array3[0], local349, local19, local358, Static388.anInt6979, local262.anInt1604);
						} else {
							this.method428(local349, super.aClass25Array3[0], local19, local262.anInt1604, local294, local358, arg0);
						}
					}
					if (local262.anInt1599 == 10 && local262.anInt1606 >= 0 && local262.anInt1606 < Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1.length) {
						@Pc(419) Class11_Sub1_Sub1_Sub2_Sub1 local419 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local262.anInt1606];
						if (local419 != null) {
							local358 = local419.anInt9925 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925;
							local294 = local419.anInt9929 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
							if (Static172.aBoolean322) {
								this.method427(92160000, arg0, super.aClass25Array3[0], local358, local19, local294, Static388.anInt6979, local262.anInt1604);
							} else {
								this.method428(local358, super.aClass25Array3[0], local19, local262.anInt1604, 92160000, local294, arg0);
							}
						}
					}
				}
			}
			local19.method6692(local24);
			local19.method6694(super.anInt9925, super.anInt9930, super.anInt9929);
		}
		local19.method6692(local24);
		local19.method6694(super.anInt9925, -super.anInt3280 + super.anInt9930 - 5, super.anInt9929);
		if (local96 == null) {
			local96 = Static600.method8238(super.aClass25Array3.length, true);
		}
		this.method2764(local19, super.aClass25Array3, arg0, false);
		if (Static172.aBoolean322) {
			for (local256 = 0; local256 < super.aClass25Array3.length; local256++) {
				if (super.aClass25Array3[local256] != null) {
					super.aClass25Array3[local256].method7725(local19, local96.aClass11_Sub7Array1[local256], Static388.anInt6979, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local256 = 0; super.aClass25Array3.length > local256; local256++) {
				if (super.aClass25Array3[local256] != null) {
					super.aClass25Array3[local256].method7735(local19, local96.aClass11_Sub7Array1[local256], Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass11_Sub4_5 != null) {
			@Pc(594) Class247 local594 = super.aClass11_Sub4_5.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local594, Static388.anInt6979);
			} else {
				arg0.method7939(local594);
			}
		}
		for (local256 = 0; super.aClass25Array3.length > local256; local256++) {
			if (super.aClass25Array3[local256] != null) {
				super.aBoolean278 |= super.aClass25Array3[local256].F();
			}
		}
		super.anInt3211 = Static143.anInt3169;
		super.aClass25Array3[0] = super.aClass25Array3[1] = super.aClass25Array3[2] = null;
		return local96;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ha;Lclient!ka;ZILclient!kd;III)V")
	private void method427(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg3 * arg3 + arg5 * arg5;
		if (local12 < 262144 || arg0 < local12) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg3, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class25 local50 = Static188.method3424(local32, super.anInt3233, arg7, arg1, super.lb, super.anInt3256);
		if (local50 != null) {
			arg1.C(false);
			local50.method7725(arg4, null, arg6, 0);
			arg1.C(true);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ka;Lclient!kd;IIILclient!ha;I)V")
	private void method428(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class87 arg6) {
		@Pc(12) int local12 = arg0 * arg0 + arg5 * arg5;
		if (local12 < 262144 || arg4 < local12) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg0, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class25 local52 = Static188.method3424(local40, super.anInt3233, arg3, arg6, super.lb, super.anInt3256);
		if (local52 != null) {
			arg6.C(false);
			local52.method7735(arg2, null, 0);
			arg6.C(true);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ud;)V")
	public void method429(@OriginalArg(1) Class2_Sub34 arg0) {
		arg0.anInt8188 = 0;
		@Pc(10) int local10 = arg0.method6904();
		this.aByte25 = (byte) (local10 & 0x1);
		@Pc(19) boolean local19 = this.aBoolean45;
		this.aBoolean45 = (local10 & 0x2) != 0;
		@Pc(36) boolean local36 = (local10 & 0x4) != 0;
		@Pc(40) int local40 = super.method2778();
		this.method2767((local10 >> 3 & 0x7) + 1);
		this.aByte27 = (byte) (local10 >> 6 & 0x3);
		super.anInt9925 += this.method2778() - local40 << 8;
		super.anInt9929 += this.method2778() - local40 << 8;
		this.aByte26 = arg0.method6908();
		this.anInt546 = arg0.method6908();
		this.anInt560 = arg0.method6908();
		this.aBoolean48 = arg0.method6908() == 1;
		if (Static267.aClass86_7 == Static95.aClass86_5 && Static278.anInt5322 >= 2) {
			this.aBoolean48 = false;
		}
		this.anInt538 = 0;
		@Pc(140) int local140 = -1;
		@Pc(143) int[] local143 = new int[12];
		@Pc(166) int local166;
		@Pc(172) int local172;
		@Pc(210) int local210;
		for (@Pc(145) int local145 = 0; local145 < 12; local145++) {
			@Pc(152) int local152 = arg0.method6904();
			if (local152 == 0) {
				local143[local145] = 0;
			} else {
				local166 = arg0.method6904();
				local172 = (local152 << 8) + local166;
				if (local145 == 0 && local172 == 65535) {
					local140 = arg0.method6884();
					this.anInt538 = arg0.method6904();
					break;
				}
				if (local172 >= 32768) {
					local172 = Static420.anIntArray514[local172 - 32768];
					local143[local145] = local172 | 0x40000000;
					local210 = Static570.aClass267_2.method6597(local172).anInt7505;
					if (local210 != 0) {
						this.anInt538 = local210;
					}
				} else {
					local143[local145] = local172 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(234) int[] local234 = new int[5];
		for (local166 = 0; local166 < 5; local166++) {
			local172 = arg0.method6904();
			if (Static200.aShortArrayArrayArray5.length < 1 || local172 < 0 || Static200.aShortArrayArrayArray5[0][local166].length <= local172) {
				local172 = 0;
			}
			local234[local166] = local172;
		}
		this.anInt557 = arg0.method6884();
		this.aString3 = arg0.method6903();
		this.aString4 = this.aString3;
		this.anInt543 = arg0.method6904();
		if (local36) {
			this.anInt549 = arg0.method6884();
			this.anInt552 = -1;
			if (this.anInt549 == 65535) {
				this.anInt549 = -1;
			}
			this.anInt562 = this.anInt543;
		} else {
			this.anInt549 = 0;
			this.anInt562 = arg0.method6904();
			this.anInt552 = arg0.method6904();
			if (this.anInt552 == 255) {
				this.anInt552 = -1;
			}
		}
		local172 = this.anInt553;
		this.anInt553 = arg0.method6904();
		@Pc(363) int local363;
		if (this.anInt553 == 0) {
			Static104.method1770(this);
		} else {
			local210 = this.anInt570;
			@Pc(360) int local360 = this.anInt540;
			local363 = this.anInt548;
			@Pc(366) int local366 = this.anInt544;
			@Pc(369) int local369 = this.anInt567;
			this.anInt570 = arg0.method6884();
			this.anInt540 = arg0.method6884();
			this.anInt548 = arg0.method6884();
			this.anInt544 = arg0.method6884();
			this.anInt567 = arg0.method6904();
			if (local19 != this.aBoolean45 || local172 != this.anInt553 || this.anInt570 != local210 || local360 != this.anInt540 || this.anInt548 != local363 || local366 != this.anInt544 || this.anInt567 != local369) {
				Static28.method3674(this);
			}
		}
		if (this.aClass163_1 == null) {
			this.aClass163_1 = new Class163();
		}
		local210 = this.aClass163_1.anInt4833;
		@Pc(469) int[] local469 = this.aClass163_1.anIntArray329;
		this.aClass163_1.method4026(this.aByte25 == 1, local140, local143, local234, this.method2769());
		if (local140 != local210) {
			super.anInt9925 = (super.anIntArray232[0] << 9) + (this.method2778() << 8);
			super.anInt9929 = (super.anIntArray233[0] << 9) + (this.method2778() << 8);
		}
		if (Static182.anInt4021 == super.anInt3246 && local469 != null) {
			for (local363 = 0; local363 < local234.length; local363++) {
				if (local469[local363] != local234[local363]) {
					Static570.aClass267_2.method6593();
					break;
				}
			}
		}
		if (super.aClass11_Sub4_5 != null) {
			super.aClass11_Sub4_5.method2631();
		}
		if (super.anInt3253 == -1 || !super.aBoolean275) {
			return;
		}
		@Pc(560) Class165 local560 = this.method2761();
		if (!local560.method4048(super.anInt3253)) {
			super.anInt3253 = -1;
			super.aBoolean275 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBII)V")
	public void method430(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt3258 != -1 && Static185.aClass303_1.method7201(super.anInt3258).anInt4517 == 1) {
			super.anIntArray226 = null;
			super.anInt3258 = -1;
		}
		@Pc(32) Class69 local32;
		if (super.anInt3270 != -1) {
			local32 = Static414.aClass356_2.method8213(super.anInt3270);
			if (local32.aBoolean152 && local32.anInt1820 != -1 && Static185.aClass303_1.method7201(local32.anInt1820).anInt4517 == 1) {
				super.anInt3270 = -1;
			}
		}
		if (super.anInt3229 != -1) {
			local32 = Static414.aClass356_2.method8213(super.anInt3229);
			if (local32.aBoolean152 && local32.anInt1820 != -1 && Static185.aClass303_1.method7201(local32.anInt1820).anInt4517 == 1) {
				super.anInt3229 = -1;
			}
		}
		this.anInt568 = -1;
		if (arg1 < 0 || Static3.anInt46 <= arg1 || arg2 < 0 || arg2 >= Static270.anInt5194) {
			this.method424(arg2, arg1);
		} else if (super.anIntArray232[0] >= 0 && super.anIntArray232[0] < Static3.anInt46 && super.anIntArray233[0] >= 0 && Static270.anInt5194 > super.anIntArray233[0]) {
			if (arg0 == 2) {
				Static65.method1239(this, arg2, arg1);
			}
			this.method431(arg1, arg0, arg2);
		} else {
			this.method424(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IBII)V")
	public void method431(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt3296 < 9) {
			super.anInt3296++;
		}
		for (@Pc(16) int local16 = super.anInt3296; local16 > 0; local16--) {
			super.anIntArray232[local16] = super.anIntArray232[local16 - 1];
			super.anIntArray233[local16] = super.anIntArray233[local16 - 1];
			super.aByteArray31[local16] = super.aByteArray31[local16 - 1];
		}
		super.anIntArray232[0] = arg0;
		super.anIntArray233[0] = arg2;
		super.aByteArray31[0] = arg1;
	}
}
