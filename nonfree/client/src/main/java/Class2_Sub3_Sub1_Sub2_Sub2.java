import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class2_Sub3_Sub1_Sub2_Sub2 extends Class2_Sub3_Sub1_Sub2 {

	@OriginalMember(owner = "client!lea", name = "ed", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!lea", name = "nd", descriptor = "Lclient!vea;")
	public Class352 aClass352_1;

	@OriginalMember(owner = "client!lea", name = "pd", descriptor = "I")
	private int anInt6357;

	@OriginalMember(owner = "client!lea", name = "rd", descriptor = "I")
	public int anInt6359;

	@OriginalMember(owner = "client!lea", name = "Md", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!lea", name = "Qd", descriptor = "I")
	public int anInt6376;

	@OriginalMember(owner = "client!lea", name = "cd", descriptor = "Z")
	public boolean aBoolean537 = false;

	@OriginalMember(owner = "client!lea", name = "id", descriptor = "I")
	public int anInt6351 = -1;

	@OriginalMember(owner = "client!lea", name = "vd", descriptor = "Z")
	public boolean aBoolean539 = false;

	@OriginalMember(owner = "client!lea", name = "xd", descriptor = "I")
	public int anInt6361 = 0;

	@OriginalMember(owner = "client!lea", name = "fd", descriptor = "I")
	public int anInt6348 = -1;

	@OriginalMember(owner = "client!lea", name = "yd", descriptor = "I")
	public int anInt6362 = 0;

	@OriginalMember(owner = "client!lea", name = "wd", descriptor = "B")
	private byte aByte84 = 0;

	@OriginalMember(owner = "client!lea", name = "hd", descriptor = "I")
	public int anInt6350 = -1;

	@OriginalMember(owner = "client!lea", name = "Pd", descriptor = "I")
	public int anInt6375 = -1;

	@OriginalMember(owner = "client!lea", name = "sd", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!lea", name = "gd", descriptor = "I")
	public int anInt6349 = -1;

	@OriginalMember(owner = "client!lea", name = "ud", descriptor = "I")
	public int anInt6360 = 255;

	@OriginalMember(owner = "client!lea", name = "td", descriptor = "B")
	private byte aByte83 = 0;

	@OriginalMember(owner = "client!lea", name = "zd", descriptor = "Z")
	public boolean aBoolean540 = false;

	@OriginalMember(owner = "client!lea", name = "kd", descriptor = "I")
	public int anInt6353 = 0;

	@OriginalMember(owner = "client!lea", name = "Bd", descriptor = "B")
	private byte aByte85 = 0;

	@OriginalMember(owner = "client!lea", name = "Sd", descriptor = "I")
	public int anInt6378 = -1;

	@OriginalMember(owner = "client!lea", name = "Vd", descriptor = "Z")
	public boolean aBoolean542 = false;

	@OriginalMember(owner = "client!lea", name = "Rd", descriptor = "I")
	public int anInt6377 = 0;

	@OriginalMember(owner = "client!lea", name = "Yd", descriptor = "I")
	public int anInt6383 = 0;

	@OriginalMember(owner = "client!lea", name = "Zd", descriptor = "I")
	public int anInt6384 = -1;

	@OriginalMember(owner = "client!lea", name = "Xd", descriptor = "I")
	public int anInt6382 = -1;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIBI)V")
	public void method5323(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6306 != -1 && Static618.aClass222_2.method5867(super.anInt6306).anInt8693 == 1) {
			super.anInt6306 = -1;
			super.anIntArray376 = null;
		}
		@Pc(33) Class268 local33;
		if (super.anInt6321 != -1) {
			local33 = Static35.aClass343_1.method8033(super.anInt6321);
			if (local33.aBoolean688 && local33.anInt8068 != -1 && Static618.aClass222_2.method5867(local33.anInt8068).anInt8693 == 1) {
				super.anInt6321 = -1;
			}
		}
		if (super.anInt6299 != -1) {
			local33 = Static35.aClass343_1.method8033(super.anInt6299);
			if (local33.aBoolean688 && local33.anInt8068 != -1 && Static618.aClass222_2.method5867(local33.anInt8068).anInt8693 == 1) {
				super.anInt6299 = -1;
			}
		}
		this.anInt6384 = -1;
		if (arg2 < 0 || Static394.anInt7540 <= arg2 || arg0 < 0 || arg0 >= Static462.anInt8391) {
			this.method5329(arg0, arg2);
		} else if (super.anIntArray378[0] >= 0 && super.anIntArray378[0] < Static394.anInt7540 && super.anIntArray377[0] >= 0 && Static462.anInt8391 > super.anIntArray377[0]) {
			if (arg1 == 2) {
				Static326.method5481(arg0, this, arg2);
			}
			this.method5325(arg0, arg2, arg1);
		} else {
			this.method5329(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BLclient!tn;)V")
	public void method5324(@OriginalArg(1) Class3_Sub15 arg0) {
		arg0.anInt10282 = 0;
		@Pc(12) int local12 = arg0.method8401();
		this.aByte85 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean542;
		this.aBoolean542 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method5308();
		this.method5309((local12 >> 3 & 0x7) + 1);
		this.aByte84 = (byte) (local12 >> 6 & 0x3);
		super.anInt10428 += this.method5308() - local48 << 8;
		super.anInt10424 += this.method5308() - local48 << 8;
		this.aByte83 = arg0.method8440();
		this.anInt6378 = arg0.method8440();
		this.anInt6351 = arg0.method8440();
		this.aBoolean537 = arg0.method8440() == 1;
		if (Static624.aClass107_7 == Static85.aClass107_2 && Static106.anInt2660 >= 2) {
			this.aBoolean537 = false;
		}
		this.anInt6377 = 0;
		@Pc(135) int local135 = -1;
		@Pc(138) int[] local138 = new int[12];
		@Pc(161) int local161;
		@Pc(167) int local167;
		@Pc(206) int local206;
		for (@Pc(140) int local140 = 0; local140 < 12; local140++) {
			@Pc(146) int local146 = arg0.method8401();
			if (local146 == 0) {
				local138[local140] = 0;
			} else {
				local161 = arg0.method8401();
				local167 = local161 + (local146 << 8);
				if (local140 == 0 && local167 == 65535) {
					local135 = arg0.method8414();
					this.anInt6377 = arg0.method8401();
					break;
				}
				if (local167 >= 32768) {
					local167 = Static573.anIntArray589[local167 - 32768];
					local138[local140] = local167 | 0x40000000;
					local206 = Static367.aClass281_1.method6975(local167).anInt7266;
					if (local206 != 0) {
						this.anInt6377 = local206;
					}
				} else {
					local138[local140] = Integer.MIN_VALUE | local167 - 256;
				}
			}
		}
		@Pc(230) int[] local230 = new int[5];
		for (local161 = 0; local161 < 5; local161++) {
			local167 = arg0.method8401();
			if (Static221.aShortArrayArrayArray1.length < 1 || local167 < 0 || local167 >= Static221.aShortArrayArrayArray1[0][local161].length) {
				local167 = 0;
			}
			local230[local161] = local167;
		}
		this.anInt6357 = arg0.method8414();
		this.aString67 = arg0.method8413();
		this.aString68 = this.aString67;
		if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == this) {
			Static46.aString10 = this.aString67;
		}
		this.anInt6383 = arg0.method8401();
		if (local44) {
			this.anInt6361 = arg0.method8414();
			this.anInt6349 = -1;
			this.anInt6353 = this.anInt6383;
			if (this.anInt6361 == 65535) {
				this.anInt6361 = -1;
			}
		} else {
			this.anInt6361 = 0;
			this.anInt6353 = arg0.method8401();
			this.anInt6349 = arg0.method8401();
			if (this.anInt6349 == 255) {
				this.anInt6349 = -1;
			}
		}
		local167 = this.anInt6362;
		this.anInt6362 = arg0.method8401();
		@Pc(352) int local352;
		if (this.anInt6362 == 0) {
			Static87.method2245(this);
		} else {
			local206 = this.anInt6375;
			@Pc(349) int local349 = this.anInt6348;
			local352 = this.anInt6350;
			@Pc(355) int local355 = this.anInt6382;
			@Pc(358) int local358 = this.anInt6360;
			this.anInt6375 = arg0.method8414();
			this.anInt6348 = arg0.method8414();
			this.anInt6350 = arg0.method8414();
			this.anInt6382 = arg0.method8414();
			this.anInt6360 = arg0.method8401();
			if (local21 != this.aBoolean542 || this.anInt6362 != local167 || local206 != this.anInt6375 || local349 != this.anInt6348 || this.anInt6350 != local352 || local355 != this.anInt6382 || local358 != this.anInt6360) {
				Static138.method3125(this);
			}
		}
		if (this.aClass352_1 == null) {
			this.aClass352_1 = new Class352();
		}
		local206 = this.aClass352_1.anInt9971;
		@Pc(451) int[] local451 = this.aClass352_1.anIntArray599;
		this.aClass352_1.method8176(local138, local230, this.aByte85 == 1, local135, this.method5321());
		if (local135 != local206) {
			super.anInt10428 = (super.anIntArray378[0] << 9) + (this.method5308() << 8);
			super.anInt10424 = (super.anIntArray377[0] << 9) + (this.method5308() << 8);
		}
		if (super.anInt6289 == Static399.anInt7626 && local451 != null) {
			for (local352 = 0; local352 < local230.length; local352++) {
				if (local451[local352] != local230[local352]) {
					Static367.aClass281_1.method6971();
					break;
				}
			}
		}
		if (super.aClass2_Sub2_6 != null) {
			super.aClass2_Sub2_6.method234();
		}
		if (super.anInt6273 == -1 || !super.aBoolean531) {
			return;
		}
		@Pc(565) Class232 local565 = this.method5304();
		if (!local565.method5994(super.anInt6273)) {
			super.aBoolean531 = false;
			super.anInt6273 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		if (this.aClass352_1 == null || !this.method5330(131072, arg2)) {
			return false;
		}
		@Pc(33) Class47 local33 = arg2.method6225();
		@Pc(38) int local38 = super.aClass145_7.method4535();
		local33.method7873(local38);
		local33.method7876(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < super.aClass128Array3.length; local53++) {
			if (super.aClass128Array3[local53] != null && (Static216.aBoolean440 ? super.aClass128Array3[local53].method6283(arg0, arg1, local33, true, 0, Static467.anInt8440) : super.aClass128Array3[local53].method6296(arg0, arg1, local33, true, 0))) {
				local51 = true;
				break;
			}
		}
		super.aClass128Array3[0] = super.aClass128Array3[1] = super.aClass128Array3[2] = null;
		return local51;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIB)V")
	public void method5325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6343 < 9) {
			super.anInt6343++;
		}
		for (@Pc(24) int local24 = super.anInt6343; local24 > 0; local24--) {
			super.anIntArray378[local24] = super.anIntArray378[local24 - 1];
			super.anIntArray377[local24] = super.anIntArray377[local24 - 1];
			super.aByteArray69[local24] = super.aByteArray69[local24 - 1];
		}
		super.anIntArray378[0] = arg1;
		super.aByteArray69[0] = arg2;
		super.anIntArray377[0] = arg0;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5327() {
		@Pc(7) String local7 = "";
		if (Static174.aStringArray15 != null) {
			local7 = local7 + Static174.aStringArray15[this.aByte84];
		}
		@Pc(31) int[] local31;
		if (this.aByte85 == 1 && Static128.anIntArray158 != null) {
			local31 = Static128.anIntArray158;
		} else {
			local31 = Static94.anIntArray96;
		}
		if (local31 != null && local31[this.aByte84] != -1) {
			@Pc(51) Class292 local51 = Static432.aClass311_1.method7468(local31[this.aByte84]);
			if (local51.aChar5 == 's') {
				local7 = local7 + local51.method7216(this.aByte83 & 0xFF);
			} else {
				Static544.method7724("gdn1", new Throwable());
				local31[this.aByte84] = -1;
			}
		}
		local7 = local7 + this.aString67;
		if (Static94.aStringArray11 != null) {
			local7 = local7 + Static94.aStringArray11[this.aByte84];
		}
		return local7;
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)Z")
	public boolean method5328() {
		return this.aClass352_1 != null;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		if (this.aClass352_1 == null || !super.aBoolean536 && !this.method5330(0, arg0)) {
			return;
		}
		@Pc(20) Class47 local20 = arg0.method6225();
		local20.method7873(super.aClass145_7.method4535());
		local20.method7876(super.anInt10428, super.anInt10429 - 5, super.anInt10424);
		this.method5314(super.aBoolean536, super.aClass128Array3, local20, arg0);
		super.aClass128Array3[0] = super.aClass128Array3[1] = super.aClass128Array3[2] = null;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V")
	public void method5329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray378[0] = arg1;
		super.anInt6346 = 0;
		super.anInt6345 = 0;
		super.anInt6343 = 0;
		super.anIntArray377[0] = arg0;
		@Pc(30) int local30 = this.method5308();
		super.anInt10428 = local30 * 256 + super.anIntArray378[0] * 512;
		super.anInt10424 = super.anIntArray377[0] * 512 + local30 * 256;
		if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == this) {
			Static34.method625();
		}
		if (super.aClass2_Sub2_6 != null) {
			super.aClass2_Sub2_6.method234();
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)I")
	@Override
	public int method5308() {
		return this.aClass352_1 == null || this.aClass352_1.anInt9971 == -1 ? super.method5308() : Static604.aClass139_2.method4345(this.aClass352_1.anInt9971).anInt404;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class232 local11 = this.method5304();
		@Pc(29) Class290 local29 = super.anInt6306 != -1 && super.anInt6297 == 0 ? Static618.aClass222_2.method5867(super.anInt6306) : null;
		@Pc(51) Class290 local51 = super.anInt6273 == -1 || this.aBoolean538 || super.aBoolean531 && local29 != null ? null : Static618.aClass222_2.method5867(super.anInt6273);
		@Pc(54) int local54 = local11.anInt7180;
		@Pc(57) int local57 = local11.anInt7148;
		if (local54 != 0 || local57 != 0 || local11.anInt7152 != 0 || local11.anInt7168 != 0) {
			arg0 |= 0x7;
		}
		@Pc(82) int local82 = super.aClass145_7.method4535();
		@Pc(104) boolean local104 = super.aByte80 != 0 && super.anInt6274 <= Static251.anInt5580 && Static251.anInt5580 < super.anInt6268;
		if (local104) {
			arg0 |= 0x80000;
		}
		@Pc(148) Class128 local148 = super.aClass128Array3[0] = this.aClass352_1.method8179(Static510.aClass97_2, arg0, local29, super.anIntArray373, super.anInt6337, super.anInt6314, super.aClass98Array3, arg1, Static618.aClass222_2, Static604.aClass139_2, local51, super.anInt6336, Static367.aClass281_1, super.anInt6313, Static514.aClass166_1, Static367.aClass285_1, super.anInt6315, local82, super.anInt6267);
		@Pc(151) int local151 = Static344.method5660();
		if (Static6.anInt66 < 96 && local151 > 50) {
			Static398.method6368();
		}
		if (Static85.aClass107_2 != Static624.aClass107_7 && local151 < 50) {
			@Pc(172) int local172 = 50 - local151;
			while (Static416.anInt7793 < local172) {
				Static28.aByteArrayArray1[Static416.anInt7793] = new byte[102400];
				Static416.anInt7793++;
			}
			while (Static416.anInt7793 > local172) {
				Static416.anInt7793--;
				Static28.aByteArrayArray1[Static416.anInt7793] = null;
			}
		} else if (Static624.aClass107_7 != Static85.aClass107_2) {
			Static28.aByteArrayArray1 = new byte[50][];
			Static416.anInt7793 = 0;
		}
		if (local148 == null) {
			return false;
		}
		super.anInt6296 = local148.fa();
		super.anInt6309 = local148.ma();
		this.method5312(local148);
		if (local54 == 0 && local57 == 0) {
			this.method5307(0, local82, this.method5308() << 9, 0, this.method5308() << 9);
		} else {
			this.method5307(local11.anInt7149, local82, local57, local11.anInt7169, local54);
			if (super.anInt6293 != 0) {
				local148.FA(super.anInt6293);
			}
			if (super.anInt6266 != 0) {
				local148.VA(super.anInt6266);
			}
			if (super.anInt6265 != 0) {
				local148.H(0, super.anInt6265, 0);
			}
		}
		if (local104) {
			local148.method6289(super.aByte79, super.aByte82, super.aByte78, super.aByte80 & 0xFF);
		}
		@Pc(343) boolean local343;
		@Pc(345) int local345;
		@Pc(398) Class128 local398;
		@Pc(414) int local414;
		@Pc(416) int local416;
		@Pc(418) int local418;
		@Pc(505) int local505;
		@Pc(532) int local532;
		@Pc(544) int local544;
		@Pc(548) int local548;
		@Pc(558) int local558;
		@Pc(325) Class268 local325;
		if (this.aBoolean538 || super.anInt6321 == -1 || super.anInt6325 == -1) {
			super.aClass128Array3[1] = null;
		} else {
			local325 = Static35.aClass343_1.method8033(super.anInt6321);
			local343 = local325.aByte97 == 3 && (local54 != 0 || local57 != 0);
			local345 = local7;
			if (local343) {
				local345 = local7 | 0x7;
			} else {
				if (super.anInt6257 != 0) {
					local345 = local7 | 0x5;
				}
				if (super.anInt6308 != 0) {
					local345 |= 0x2;
				}
				if (super.anInt6327 >= 0) {
					local345 |= 0x7;
				}
			}
			local398 = super.aClass128Array3[1] = local325.method6746(arg1, Static618.aClass222_2, local345, super.anInt6325, super.anInt6295, super.anInt6340);
			if (local398 != null) {
				if (super.anInt6327 >= 0 && local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6327] != null) {
					local414 = 0;
					local416 = 0;
					local418 = 0;
					if (local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6327] != null) {
						local416 = local11.anIntArrayArray66[super.anInt6327][1];
						local418 = local11.anIntArrayArray66[super.anInt6327][2];
						local414 = local11.anIntArrayArray66[super.anInt6327][0];
					}
					if (local11.anIntArrayArray65 != null && local11.anIntArrayArray65[super.anInt6327] != null) {
						local416 += local11.anIntArrayArray65[super.anInt6327][1];
						local414 += local11.anIntArrayArray65[super.anInt6327][0];
						local418 += local11.anIntArrayArray65[super.anInt6327][2];
					}
					if (local418 != 0 || local414 != 0) {
						local505 = local82;
						if (super.anIntArray373 != null && super.anIntArray373[super.anInt6327] != -1) {
							local505 = super.anIntArray373[super.anInt6327];
						}
						local532 = local505 + super.anInt6257 * 2048 - local82 & 0x3FFF;
						if (local532 != 0) {
							local398.a(local532);
						}
						local544 = Class3_Sub1_Sub2.anIntArray84[local532];
						local548 = Class3_Sub1_Sub2.anIntArray85[local532];
						local558 = local414 * local548 + local418 * local544 >> 14;
						local418 = local548 * local418 - local414 * local544 >> 14;
						local414 = local558;
					}
					local398.H(local414, local416, local418);
				} else if (super.anInt6257 != 0) {
					local398.a(super.anInt6257 * 2048);
				}
				if (super.anInt6308 != 0) {
					local398.H(0, -super.anInt6308 << 2, 0);
				}
				if (local343) {
					if (super.anInt6293 != 0) {
						local398.FA(super.anInt6293);
					}
					if (super.anInt6266 != 0) {
						local398.VA(super.anInt6266);
					}
					if (super.anInt6265 != 0) {
						local398.H(0, super.anInt6265, 0);
					}
				}
			}
		}
		if (this.aBoolean538 || super.anInt6299 == -1 || super.anInt6270 == -1) {
			super.aClass128Array3[2] = null;
		} else {
			local325 = Static35.aClass343_1.method8033(super.anInt6299);
			local343 = local325.aByte97 == 3 && (local54 != 0 || local57 != 0);
			local345 = local7;
			if (local343) {
				local345 = local7 | 0x7;
			} else {
				if (super.anInt6304 != 0) {
					local345 = local7 | 0x5;
				}
				if (super.anInt6323 != 0) {
					local345 |= 0x2;
				}
				if (super.anInt6300 >= 0) {
					local345 |= 0x7;
				}
			}
			local398 = super.aClass128Array3[2] = local325.method6745(Static618.aClass222_2, super.anInt6270, arg1, super.anInt6277, super.anInt6318, local345);
			if (local398 != null) {
				if (super.anInt6300 >= 0 && local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6300] != null) {
					local414 = 0;
					local416 = 0;
					local418 = 0;
					if (local11.anIntArrayArray66 != null && local11.anIntArrayArray66[super.anInt6300] != null) {
						local416 = local11.anIntArrayArray66[super.anInt6300][1];
						local418 = local11.anIntArrayArray66[super.anInt6300][2];
						local414 = local11.anIntArrayArray66[super.anInt6300][0];
					}
					if (local11.anIntArrayArray65 != null && local11.anIntArrayArray65[super.anInt6300] != null) {
						local414 += local11.anIntArrayArray65[super.anInt6300][0];
						local416 += local11.anIntArrayArray65[super.anInt6300][1];
						local418 += local11.anIntArrayArray65[super.anInt6300][2];
					}
					if (local418 != 0 || local414 != 0) {
						local505 = local82;
						if (super.anIntArray373 != null && super.anIntArray373[super.anInt6300] != -1) {
							local505 = super.anIntArray373[super.anInt6300];
						}
						local532 = super.anInt6304 * 2048 + local505 - local82 & 0x3FFF;
						if (local532 != 0) {
							local398.a(local532);
						}
						local544 = Class3_Sub1_Sub2.anIntArray84[local532];
						local548 = Class3_Sub1_Sub2.anIntArray85[local532];
						local558 = local548 * local414 + local544 * local418 >> 14;
						local418 = local548 * local418 - local414 * local544 >> 14;
						local414 = local558;
					}
					local398.H(local414, local416, local418);
				} else if (super.anInt6304 != 0) {
					local398.a(super.anInt6304 * 2048);
				}
				if (super.anInt6323 != 0) {
					local398.H(0, -super.anInt6323 << 2, 0);
				}
				if (local343) {
					if (super.anInt6293 != 0) {
						local398.FA(super.anInt6293);
					}
					if (super.anInt6266 != 0) {
						local398.VA(super.anInt6266);
					}
					if (super.anInt6265 != 0) {
						local398.H(0, super.anInt6265, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method5331() {
		return this.aString68;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)I")
	@Override
	public int method5305() {
		return -1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ka;IIILclient!wc;BIILclient!ha;)V")
	private void method5332(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class47 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class33 arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg1 * arg1;
		if (local11 < 262144 || local11 > arg6) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg2, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(49) Class128 local49 = Static144.method3175(super.anInt6266, arg7, super.anInt6265, super.anInt6293, arg5, local37);
		if (local49 != null) {
			arg7.C(false);
			local49.method6294(arg4, null, arg3, 0);
			arg7.C(true);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		if (this.aClass352_1 == null || !this.method5330(2048, arg0)) {
			return null;
		}
		@Pc(19) Class47 local19 = arg0.method6225();
		@Pc(24) int local24 = super.aClass145_7.method4535();
		local19.method7873(local24);
		@Pc(50) Class106 local50 = Static170.aClass106ArrayArrayArray1[super.aByte128][super.anInt10428 >> Static276.anInt5846][super.anInt10424 >> Static276.anInt5846];
		if (local50 == null || local50.aClass2_Sub3_Sub5_1 == null) {
			super.anInt6301 = (int) ((float) super.anInt6301 - (float) super.anInt6301 / 10.0F);
		} else {
			@Pc(77) int local77 = super.anInt6301 - local50.aClass2_Sub3_Sub5_1.aShort116;
			super.anInt6301 = (int) ((float) super.anInt6301 - (float) local77 / 10.0F);
		}
		local19.method7876(super.anInt10428, super.anInt10429 - super.anInt6301 - 20, super.anInt10424);
		@Pc(103) Class2_Sub6 local103 = null;
		super.aBoolean535 = false;
		if (Static552.aClass3_Sub48_30.aClass23_Sub13_1.method3796() == 1) {
			@Pc(116) Class232 local116 = this.method5304();
			if (local116.aBoolean623 && (this.aClass352_1.anInt9971 == -1 || Static604.aClass139_2.method4345(this.aClass352_1.anInt9971).aBoolean40)) {
				@Pc(152) Class290 local152 = super.anInt6306 != -1 && super.anInt6297 == 0 ? Static618.aClass222_2.method5867(super.anInt6306) : null;
				@Pc(172) Class290 local172 = super.anInt6273 == -1 || this.aBoolean538 || super.aBoolean531 && local152 != null ? null : Static618.aClass222_2.method5867(super.anInt6273);
				@Pc(204) Class128 local204 = Static245.method4650(arg0, 0, super.anInt6266, 160, local24, super.anInt6293, local172 == null ? local152 : local172, super.aClass128Array3[0], super.anInt6265, local172 == null ? super.anInt6315 : super.anInt6314, 1, 240, 0);
				if (local204 != null) {
					local103 = Static481.method2823(super.aClass128Array3.length + 1, true);
					super.aBoolean535 = true;
					arg0.C(false);
					if (Static216.aBoolean440) {
						local204.method6294(local19, local103.aClass2_Sub5Array1[super.aClass128Array3.length], Static467.anInt8440, 0);
					} else {
						local204.method6281(local19, local103.aClass2_Sub5Array1[super.aClass128Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(265) int local265;
		if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == this) {
			local19.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			for (local265 = Static253.aClass369Array1.length - 1; local265 >= 0; local265--) {
				@Pc(271) Class369 local271 = Static253.aClass369Array1[local265];
				if (local271 != null && local271.anInt10343 != -1) {
					@Pc(303) int local303;
					if (local271.anInt10333 == 1) {
						@Pc(291) Class3_Sub49 local291 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local271.anInt10340);
						if (local291 != null) {
							@Pc(296) Class2_Sub3_Sub1_Sub2_Sub1 local296 = local291.aClass2_Sub3_Sub1_Sub2_Sub1_2;
							local303 = local296.anInt10428 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428;
							@Pc(310) int local310 = local296.anInt10424 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424;
							if (Static216.aBoolean440) {
								this.method5332(super.aClass128Array3[0], local310, local303, Static467.anInt8440, local19, local271.anInt10343, 92160000, arg0);
							} else {
								this.method5333(super.aClass128Array3[0], local303, local310, local271.anInt10343, local19, 92160000, arg0);
							}
						}
					}
					@Pc(366) int local366;
					if (local271.anInt10333 == 2) {
						@Pc(357) int local357 = local271.anInt10341 + 256 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428;
						local366 = local271.anInt10342 + 256 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424;
						local303 = local271.anInt10339 << 9;
						local303 *= local303;
						if (Static216.aBoolean440) {
							this.method5332(super.aClass128Array3[0], local366, local357, Static467.anInt8440, local19, local271.anInt10343, local303, arg0);
						} else {
							this.method5333(super.aClass128Array3[0], local357, local366, local271.anInt10343, local19, local303, arg0);
						}
					}
					if (local271.anInt10333 == 10 && local271.anInt10340 >= 0 && Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2.length > local271.anInt10340) {
						@Pc(427) Class2_Sub3_Sub1_Sub2_Sub2 local427 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local271.anInt10340];
						if (local427 != null) {
							local366 = local427.anInt10428 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428;
							local303 = local427.anInt10424 - Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424;
							if (Static216.aBoolean440) {
								this.method5332(super.aClass128Array3[0], local303, local366, Static467.anInt8440, local19, local271.anInt10343, 92160000, arg0);
							} else {
								this.method5333(super.aClass128Array3[0], local366, local303, local271.anInt10343, local19, 92160000, arg0);
							}
						}
					}
				}
			}
			local19.method7873(local24);
			local19.method7876(super.anInt10428, super.anInt10429, super.anInt10424);
		}
		local19.method7873(local24);
		local19.method7876(super.anInt10428, super.anInt10429 - super.anInt6301 - 5, super.anInt10424);
		if (local103 == null) {
			local103 = Static481.method2823(super.aClass128Array3.length, true);
		}
		this.method5314(false, super.aClass128Array3, local19, arg0);
		if (Static216.aBoolean440) {
			for (local265 = 0; super.aClass128Array3.length > local265; local265++) {
				if (super.aClass128Array3[local265] != null) {
					super.aClass128Array3[local265].method6294(local19, local103.aClass2_Sub5Array1[local265], Static467.anInt8440, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local265 = 0; super.aClass128Array3.length > local265; local265++) {
				if (super.aClass128Array3[local265] != null) {
					super.aClass128Array3[local265].method6281(local19, local103.aClass2_Sub5Array1[local265], Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass2_Sub2_6 != null) {
			@Pc(602) Class40 local602 = super.aClass2_Sub2_6.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local602, Static467.anInt8440);
			} else {
				arg0.method6160(local602);
			}
		}
		for (local265 = 0; super.aClass128Array3.length > local265; local265++) {
			if (super.aClass128Array3[local265] != null) {
				super.aBoolean535 |= super.aClass128Array3[local265].F();
			}
		}
		super.aClass128Array3[0] = super.aClass128Array3[1] = super.aClass128Array3[2] = null;
		super.anInt6316 = Static469.anInt8476;
		return local103;
	}

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "(I)I")
	@Override
	protected int method5321() {
		return this.anInt6357;
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZLclient!ka;IIILclient!wc;ILclient!ha;)V")
	private void method5333(@OriginalArg(1) Class128 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class33 arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 < 262144 || arg5 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg1, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class128 local45 = Static144.method3175(super.anInt6266, arg6, super.anInt6265, super.anInt6293, arg3, local33);
		if (local45 != null) {
			arg6.C(false);
			local45.method6281(arg4, null, 0);
			arg6.C(true);
		}
	}
}
