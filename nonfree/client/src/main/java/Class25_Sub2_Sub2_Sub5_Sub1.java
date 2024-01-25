import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class25_Sub2_Sub2_Sub5_Sub1 extends Class25_Sub2_Sub2_Sub5 {

	@OriginalMember(owner = "client!pba", name = "Zc", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!pba", name = "rd", descriptor = "Ljava/lang/String;")
	public String aString182;

	@OriginalMember(owner = "client!pba", name = "Fd", descriptor = "I")
	private int anInt7163;

	@OriginalMember(owner = "client!pba", name = "Kd", descriptor = "Lclient!hq;")
	public Class131 aClass131_1;

	@OriginalMember(owner = "client!pba", name = "Wd", descriptor = "I")
	public int anInt7178;

	@OriginalMember(owner = "client!pba", name = "Yd", descriptor = "Ljava/lang/String;")
	public String aString183;

	@OriginalMember(owner = "client!pba", name = "ad", descriptor = "B")
	private byte aByte107 = 0;

	@OriginalMember(owner = "client!pba", name = "cd", descriptor = "I")
	public int anInt7145 = 0;

	@OriginalMember(owner = "client!pba", name = "bd", descriptor = "I")
	public int anInt7144 = -1;

	@OriginalMember(owner = "client!pba", name = "td", descriptor = "I")
	public int anInt7154 = 0;

	@OriginalMember(owner = "client!pba", name = "jd", descriptor = "Z")
	public boolean aBoolean493 = false;

	@OriginalMember(owner = "client!pba", name = "od", descriptor = "B")
	private byte aByte108 = 0;

	@OriginalMember(owner = "client!pba", name = "qd", descriptor = "Z")
	public boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pba", name = "Cd", descriptor = "I")
	public int anInt7160 = -1;

	@OriginalMember(owner = "client!pba", name = "hd", descriptor = "Z")
	public boolean aBoolean492 = false;

	@OriginalMember(owner = "client!pba", name = "zd", descriptor = "B")
	private byte aByte109 = 0;

	@OriginalMember(owner = "client!pba", name = "Jd", descriptor = "I")
	public int anInt7167 = 0;

	@OriginalMember(owner = "client!pba", name = "yd", descriptor = "Z")
	public boolean aBoolean496 = false;

	@OriginalMember(owner = "client!pba", name = "sd", descriptor = "Z")
	public boolean aBoolean495 = false;

	@OriginalMember(owner = "client!pba", name = "Gd", descriptor = "I")
	public int anInt7164 = -1;

	@OriginalMember(owner = "client!pba", name = "id", descriptor = "I")
	public int anInt7149 = -1;

	@OriginalMember(owner = "client!pba", name = "md", descriptor = "I")
	public int anInt7152 = -1;

	@OriginalMember(owner = "client!pba", name = "Qd", descriptor = "I")
	public int anInt7172 = -1;

	@OriginalMember(owner = "client!pba", name = "Sd", descriptor = "I")
	public int anInt7174 = 255;

	@OriginalMember(owner = "client!pba", name = "wd", descriptor = "I")
	public int anInt7157 = -1;

	@OriginalMember(owner = "client!pba", name = "Hd", descriptor = "I")
	public int anInt7165 = 0;

	@OriginalMember(owner = "client!pba", name = "Rd", descriptor = "I")
	public int anInt7173 = 0;

	@OriginalMember(owner = "client!pba", name = "Ud", descriptor = "I")
	public int anInt7176 = -1;

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!r;BI)Z")
	private boolean method5667(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class122 local11 = this.method6683();
		@Pc(27) Class270 local27 = super.anInt8545 != -1 && super.anInt8492 == 0 ? Static245.aClass155_1.method3820(super.anInt8545) : null;
		@Pc(48) Class270 local48 = super.anInt8516 == -1 || this.aBoolean492 || super.aBoolean579 && local27 != null ? null : Static245.aClass155_1.method3820(super.anInt8516);
		@Pc(51) int local51 = local11.anInt4191;
		@Pc(54) int local54 = local11.anInt4196;
		if (local51 != 0 || local54 != 0 || local11.anInt4223 != 0 || local11.anInt4199 != 0) {
			arg1 |= 0x7;
		}
		@Pc(81) int local81 = super.aClass252_7.method5714();
		@Pc(103) boolean local103 = super.aByte122 != 0 && super.anInt8530 <= Static397.anInt6998 && super.anInt8510 > Static397.anInt6998;
		if (local103) {
			arg1 |= 0x80000;
		}
		@Pc(147) Class52 local147 = super.aClass52Array3[0] = this.aClass131_1.method3492(local81, super.anInt8517, Static324.aClass356_1, super.anInt8521, local48, super.anInt8526, super.lb, Static206.aClass143_3, arg1, super.anInt8522, super.anIntArray509, arg0, Static181.aClass60_1, local27, Static98.aClass313_1, super.anInt8539, super.aClass271Array3, Static272.aClass121_2, Static245.aClass155_1);
		@Pc(150) int local150 = Static526.method7260();
		if (Static372.anInt6489 < 96 && local150 > 50) {
			Static189.method3320();
		}
		if (Static412.aClass5_7 != Static332.aClass5_3 && local150 < 50) {
			@Pc(171) int local171 = 50 - local150;
			while (local171 > Static107.anInt2620) {
				Static44.aByteArrayArray53[Static107.anInt2620] = new byte[102400];
				Static107.anInt2620++;
			}
			while (Static107.anInt2620 > local171) {
				Static107.anInt2620--;
				Static44.aByteArrayArray53[Static107.anInt2620] = null;
			}
		} else if (Static412.aClass5_7 != Static332.aClass5_3) {
			Static107.anInt2620 = 0;
			Static44.aByteArrayArray53 = new byte[50][];
		}
		if (local147 == null) {
			return false;
		}
		super.anInt8562 = local147.J();
		super.anInt8497 = local147.RA();
		this.method6666(local147);
		if (local51 == 0 && local54 == 0) {
			this.method6679(0, this.method6668() << 9, 0, this.method6668() << 9, local81);
		} else {
			this.method6679(local11.anInt4217, local51, local11.anInt4183, local54, local81);
			if (super.anInt8555 != 0) {
				local147.MA(super.anInt8555);
			}
			if (super.anInt8534 != 0) {
				local147.W(super.anInt8534);
			}
			if (super.anInt8505 != 0) {
				local147.oa(0, super.anInt8505, 0);
			}
		}
		if (local103) {
			local147.method7631(super.aByte120, super.aByte121, super.aByte123, super.aByte122 & 0xFF);
		}
		@Pc(352) boolean local352;
		@Pc(354) int local354;
		@Pc(397) Class52 local397;
		@Pc(338) Class250 local338;
		if (this.aBoolean492 || super.anInt8548 == -1 || super.anInt8567 == -1) {
			super.aClass52Array3[1] = null;
		} else {
			local338 = Static386.aClass23_1.method228(super.anInt8548);
			local352 = local338.aByte99 == 3 && (local51 != 0 || local54 != 0);
			local354 = local7;
			if (local352) {
				local354 = local7 | 0x7;
			} else {
				if (super.anInt8498 != 0) {
					local354 = local7 | 0x5;
				}
				if (super.anInt8537 != 0) {
					local354 |= 0x2;
				}
			}
			local397 = super.aClass52Array3[1] = local338.method5609(super.anInt8567, Static245.aClass155_1, super.anInt8561, arg0, super.anInt8540, local354);
			if (local397 != null) {
				if (super.anInt8537 != 0) {
					local397.oa(0, -super.anInt8537 << 2, 0);
				}
				if (super.anInt8498 != 0) {
					local397.M(super.anInt8498 * 2048);
				}
				if (local352) {
					if (super.anInt8555 != 0) {
						local397.MA(super.anInt8555);
					}
					if (super.anInt8534 != 0) {
						local397.W(super.anInt8534);
					}
					if (super.anInt8505 != 0) {
						local397.oa(0, super.anInt8505, 0);
					}
				}
			}
		}
		if (this.aBoolean492 || super.anInt8508 == -1 || super.anInt8495 == -1) {
			super.aClass52Array3[2] = null;
		} else {
			local338 = Static386.aClass23_1.method228(super.anInt8508);
			local352 = local338.aByte99 == 3 && (local51 != 0 || local54 != 0);
			local354 = local7;
			if (local352) {
				local354 = local7 | 0x7;
			} else {
				if (super.anInt8557 != 0) {
					local354 = local7 | 0x5;
				}
				if (super.anInt8565 != 0) {
					local354 |= 0x2;
				}
			}
			local397 = super.aClass52Array3[2] = local338.method5608(arg0, local354, super.anInt8499, super.anInt8495, Static245.aClass155_1, super.anInt8504);
			if (local397 != null) {
				if (super.anInt8565 != 0) {
					local397.oa(0, -super.anInt8565 << 2, 0);
				}
				if (super.anInt8557 != 0) {
					local397.M(super.anInt8557 * 2048);
				}
				if (local352) {
					if (super.anInt8555 != 0) {
						local397.MA(super.anInt8555);
					}
					if (super.anInt8534 != 0) {
						local397.W(super.anInt8534);
					}
					if (super.anInt8505 != 0) {
						local397.oa(0, super.anInt8505, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BIBI)V")
	public void method5669(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8545 != -1 && Static245.aClass155_1.method3820(super.anInt8545).anInt7695 == 1) {
			super.anInt8545 = -1;
			super.anIntArray508 = null;
		}
		@Pc(31) Class250 local31;
		if (super.anInt8548 != -1) {
			local31 = Static386.aClass23_1.method228(super.anInt8548);
			if (local31.aBoolean484 && local31.anInt7025 != -1 && Static245.aClass155_1.method3820(local31.anInt7025).anInt7695 == 1) {
				super.anInt8548 = -1;
			}
		}
		if (super.anInt8508 != -1) {
			local31 = Static386.aClass23_1.method228(super.anInt8508);
			if (local31.aBoolean484 && local31.anInt7025 != -1 && Static245.aClass155_1.method3820(local31.anInt7025).anInt7695 == 1) {
				super.anInt8508 = -1;
			}
		}
		this.anInt7144 = -1;
		if (arg2 < 0 || arg2 >= Static345.anInt6228 || arg1 < 0 || Static535.anInt9341 <= arg1) {
			this.method5675(arg1, arg2);
		} else if (super.anIntArray512[0] >= 0 && Static345.anInt6228 > super.anIntArray512[0] && super.anIntArray513[0] >= 0 && super.anIntArray513[0] < Static535.anInt9341) {
			if (arg0 == 2) {
				Static73.method5993(arg2, this, arg1);
			}
			this.method5679(arg1, arg0, arg2);
		} else {
			this.method5675(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method5670() {
		return this.aString183;
	}

	@OriginalMember(owner = "client!pba", name = "q", descriptor = "(I)Z")
	public boolean method5671() {
		return this.aClass131_1 != null;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pba", name = "l", descriptor = "(I)I")
	@Override
	public int method6674() {
		return -1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!da;IBLclient!q;ILclient!r;II)V")
	private void method5674(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class31 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg3 * arg3;
		if (local11 < 262144 || arg5 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class52 local45 = Static548.method7508(local33, arg6, super.anInt8505, arg4, super.anInt8534, super.anInt8555);
		if (local45 != null) {
			arg4.ZA(false);
			local45.method7617(arg2, null, 0);
			arg4.ZA(true);
		}
	}

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(III)V")
	public void method5675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray512[0] = arg1;
		super.anInt8579 = 0;
		super.anInt8578 = 0;
		super.anInt8580 = 0;
		super.anIntArray513[0] = arg0;
		@Pc(26) int local26 = this.method6668();
		super.anInt8476 = local26 * 256 + super.anIntArray512[0] * 512;
		super.anInt8482 = local26 * 256 + super.anIntArray513[0] * 512;
		if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == this) {
			Static38.method1056();
		}
		if (super.aClass25_Sub7_7 != null) {
			super.aClass25_Sub7_7.method3785();
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)I")
	@Override
	protected int method6665() {
		return this.anInt7163;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method5676() {
		@Pc(7) String local7 = "";
		if (Static378.aStringArray31 != null) {
			local7 = local7 + Static378.aStringArray31[this.aByte107];
		}
		@Pc(29) int[] local29;
		if (this.aByte109 == 1 && Static48.anIntArray38 != null) {
			local29 = Static48.anIntArray38;
		} else {
			local29 = Static590.anIntArray599;
		}
		if (local29 != null && local29[this.aByte107] != -1) {
			@Pc(50) Class70 local50 = Static227.aClass344_1.method7704(local29[this.aByte107]);
			if (local50.aChar3 == 's') {
				local7 = local7 + local50.method2041(this.aByte108 & 0xFF);
			} else {
				Static332.method1390(new Throwable(), "gdn1");
				local29[this.aByte107] = -1;
			}
		}
		local7 = local7 + this.aString182;
		if (Static497.aStringArray42 != null) {
			local7 = local7 + Static497.aStringArray42[this.aByte107];
		}
		return local7;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method5677(@OriginalArg(0) Class3_Sub26 arg0) {
		arg0.anInt8703 = 0;
		@Pc(12) int local12 = arg0.method6814();
		this.aByte109 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean496;
		this.aBoolean496 = (local12 & 0x2) != 0;
		@Pc(38) boolean local38 = (local12 & 0x4) != 0;
		@Pc(42) int local42 = super.method6668();
		this.method6673((local12 >> 3 & 0x7) + 1);
		this.aByte107 = (byte) (local12 >> 6 & 0x3);
		super.anInt8476 += this.method6668() - local42 << 8;
		super.anInt8482 += this.method6668() - local42 << 8;
		this.aByte108 = arg0.method6825();
		this.anInt7152 = arg0.method6825();
		this.anInt7157 = arg0.method6825();
		this.aBoolean495 = arg0.method6825() == 1;
		if (Static412.aClass5_7 == Static332.aClass5_3 && Static212.anInt5852 >= 2) {
			this.aBoolean495 = false;
		}
		this.anInt7145 = 0;
		@Pc(126) int local126 = -1;
		@Pc(129) int[] local129 = new int[12];
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(197) int local197;
		for (@Pc(131) int local131 = 0; local131 < 12; local131++) {
			@Pc(137) int local137 = arg0.method6814();
			if (local137 == 0) {
				local129[local131] = 0;
			} else {
				local152 = arg0.method6814();
				local158 = local152 + (local137 << 8);
				if (local131 == 0 && local158 == 65535) {
					local126 = arg0.method6811();
					this.anInt7145 = arg0.method6814();
					break;
				}
				if (local158 >= 32768) {
					local158 = Static132.anIntArray112[local158 - 32768];
					local129[local131] = local158 | 0x40000000;
					local197 = Static272.aClass121_2.method3327(local158).anInt4390;
					if (local197 != 0) {
						this.anInt7145 = local197;
					}
				} else {
					local129[local131] = Integer.MIN_VALUE | local158 - 256;
				}
			}
		}
		@Pc(219) int[] local219 = new int[5];
		for (local152 = 0; local152 < 5; local152++) {
			local158 = arg0.method6814();
			if (Static276.aShortArrayArrayArray1.length < 1 || local158 < 0 || local158 >= Static276.aShortArrayArrayArray1[0][local152].length) {
				local158 = 0;
			}
			local219[local152] = local158;
		}
		this.anInt7163 = arg0.method6811();
		this.aString182 = arg0.method6786();
		this.aString183 = this.aString182;
		this.anInt7167 = arg0.method6814();
		if (local38) {
			this.anInt7165 = arg0.method6811();
			this.anInt7164 = -1;
			this.anInt7173 = this.anInt7167;
			if (this.anInt7165 == 65535) {
				this.anInt7165 = -1;
			}
		} else {
			this.anInt7165 = 0;
			this.anInt7173 = arg0.method6814();
			this.anInt7164 = arg0.method6814();
			if (this.anInt7164 == 255) {
				this.anInt7164 = -1;
			}
		}
		local158 = this.anInt7154;
		this.anInt7154 = arg0.method6814();
		@Pc(347) int local347;
		if (this.anInt7154 == 0) {
			Static52.method1263(this);
		} else {
			local197 = this.anInt7149;
			@Pc(344) int local344 = this.anInt7172;
			local347 = this.anInt7160;
			@Pc(350) int local350 = this.anInt7176;
			@Pc(353) int local353 = this.anInt7174;
			this.anInt7149 = arg0.method6811();
			this.anInt7172 = arg0.method6811();
			this.anInt7160 = arg0.method6811();
			this.anInt7176 = arg0.method6811();
			this.anInt7174 = arg0.method6814();
			if (local21 != this.aBoolean496 || local158 != this.anInt7154 || local197 != this.anInt7149 || this.anInt7172 != local344 || this.anInt7160 != local347 || local350 != this.anInt7176 || local353 != this.anInt7174) {
				Static11.method7288(this);
			}
		}
		if (this.aClass131_1 == null) {
			this.aClass131_1 = new Class131();
		}
		local197 = this.aClass131_1.anInt4335;
		@Pc(450) int[] local450 = this.aClass131_1.anIntArray196;
		this.aClass131_1.method3501(local129, local126, local219, this.method6665(), this.aByte109 == 1);
		if (local197 != local126) {
			super.anInt8476 = (super.anIntArray512[0] << 9) + (this.method6668() << 8);
			super.anInt8482 = (super.anIntArray513[0] << 9) + (this.method6668() << 8);
		}
		if (Static147.anInt3433 == super.anInt8529 && local450 != null) {
			for (local347 = 0; local347 < local219.length; local347++) {
				if (local450[local347] != local219[local347]) {
					Static272.aClass121_2.method3323();
					break;
				}
			}
		}
		if (super.aClass25_Sub7_7 != null) {
			super.aClass25_Sub7_7.method3785();
		}
		if (super.anInt8516 == -1 || !super.aBoolean579) {
			return;
		}
		@Pc(560) Class122 local560 = this.method6683();
		if (!local560.method3394(super.anInt8516)) {
			super.anInt8516 = -1;
			super.aBoolean579 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIBLclient!da;Lclient!q;Lclient!r;II)V")
	private void method5678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class52 arg3, @OriginalArg(5) Class42 arg4, @OriginalArg(6) Class31 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = arg1 * arg1 + arg0 * arg0;
		if (local19 < 262144 || arg2 < local19) {
			return;
		}
		@Pc(43) int local43 = (int) (Math.atan2((double) arg0, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(55) Class52 local55 = Static548.method7508(local43, arg7, super.anInt8505, arg5, super.anInt8534, super.anInt8555);
		if (local55 != null) {
			arg5.ZA(false);
			local55.method7619(arg4, null, arg6, 0);
			arg5.ZA(true);
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		if (this.aClass131_1 == null || !this.method5667(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class42 local19 = arg0.method8052();
		@Pc(24) int local24 = super.aClass252_7.method5714();
		local19.o(local24);
		@Pc(42) Class333 local42 = Static189.aClass333ArrayArrayArray1[super.aByte117][super.anInt8476 >> Static385.anInt6657][super.anInt8482 >> Static385.anInt6657];
		@Pc(69) int local69;
		if (local42 == null || local42.aClass25_Sub2_Sub5_1 == null) {
			super.anInt8515 = (int) ((float) super.anInt8515 - (float) super.anInt8515 / 10.0F);
		} else {
			local69 = super.anInt8515 - local42.aClass25_Sub2_Sub5_1.aShort48;
			super.anInt8515 = (int) ((float) super.anInt8515 - (float) local69 / 10.0F);
		}
		local19.U(super.anInt8476, -super.anInt8515 + super.anInt8480 - 20, super.anInt8482);
		super.aBoolean580 = false;
		if (Static348.aClass3_Sub51_Sub1_5.aBoolean684) {
			@Pc(104) Class122 local104 = this.method6683();
			if (local104.aBoolean284 && (this.aClass131_1.anInt4335 == -1 || Static181.aClass60_1.method1797(this.aClass131_1.anInt4335).aBoolean437)) {
				@Pc(136) Class270 local136 = super.anInt8545 != -1 && super.anInt8492 == 0 ? Static245.aClass155_1.method3820(super.anInt8545) : null;
				@Pc(156) Class270 local156 = super.anInt8516 == -1 || this.aBoolean492 || super.aBoolean579 && local136 != null ? null : Static245.aClass155_1.method3820(super.anInt8516);
				@Pc(188) Class52 local188 = Static469.method7148(0, arg0, 240, local156 == null ? local136 : local156, 1, super.anInt8534, super.aClass52Array3[0], 0, super.anInt8555, local156 == null ? super.anInt8539 : super.anInt8517, super.anInt8505, 160, local24);
				if (local188 != null) {
					super.aBoolean580 = true;
					arg0.ZA(false);
					if (Static547.aBoolean631) {
						local188.method7619(local19, null, Static150.anInt3469, 0);
					} else {
						local188.method7617(local19, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == this) {
			local19.NA(super.anInt8476, super.anInt8480, super.anInt8482);
			for (local69 = Static98.aClass167Array1.length - 1; local69 >= 0; local69--) {
				@Pc(236) Class167 local236 = Static98.aClass167Array1[local69];
				if (local236 != null && local236.anInt5100 != -1) {
					@Pc(269) int local269;
					if (local236.anInt5096 == 1) {
						@Pc(257) Class3_Sub39 local257 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local236.anInt5098);
						if (local257 != null) {
							@Pc(262) Class25_Sub2_Sub2_Sub5_Sub2 local262 = local257.aClass25_Sub2_Sub2_Sub5_Sub2_2;
							local269 = local262.anInt8476 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
							@Pc(275) int local275 = local262.anInt8482 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482;
							if (Static547.aBoolean631) {
								this.method5678(local269, local275, 92160000, super.aClass52Array3[0], local19, arg0, Static150.anInt3469, local236.anInt5100);
							} else {
								this.method5674(super.aClass52Array3[0], local269, local19, local275, arg0, 92160000, local236.anInt5100);
							}
						}
					}
					@Pc(332) int local332;
					if (local236.anInt5096 == 2) {
						@Pc(323) int local323 = local236.anInt5104 + 256 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
						local332 = local236.anInt5101 + 256 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482;
						local269 = local236.anInt5097 << 9;
						local269 *= local269;
						if (Static547.aBoolean631) {
							this.method5678(local323, local332, local269, super.aClass52Array3[0], local19, arg0, Static150.anInt3469, local236.anInt5100);
						} else {
							this.method5674(super.aClass52Array3[0], local323, local19, local332, arg0, local269, local236.anInt5100);
						}
					}
					if (local236.anInt5096 == 10 && local236.anInt5098 >= 0 && Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1.length > local236.anInt5098) {
						@Pc(395) Class25_Sub2_Sub2_Sub5_Sub1 local395 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local236.anInt5098];
						if (local395 != null) {
							local332 = local395.anInt8476 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
							local269 = local395.anInt8482 - Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482;
							if (Static547.aBoolean631) {
								this.method5678(local332, local269, 92160000, super.aClass52Array3[0], local19, arg0, Static150.anInt3469, local236.anInt5100);
							} else {
								this.method5674(super.aClass52Array3[0], local332, local19, local269, arg0, 92160000, local236.anInt5100);
							}
						}
					}
				}
			}
			local19.o(local24);
			local19.U(super.anInt8476, super.anInt8480, super.anInt8482);
		}
		local19.o(local24);
		local19.U(super.anInt8476, super.anInt8480 - super.anInt8515 - 5, super.anInt8482);
		@Pc(482) Class25_Sub10 local482 = Static65.method1625(super.aClass52Array3.length);
		this.method6663(arg0, local19, super.aClass52Array3, false);
		@Pc(494) int local494;
		if (Static547.aBoolean631) {
			for (local494 = 0; local494 < super.aClass52Array3.length; local494++) {
				if (super.aClass52Array3[local494] != null) {
					super.aClass52Array3[local494].method7619(local19, local482.aClass25_Sub1Array1[local494], Static150.anInt3469, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local494 = 0; local494 < super.aClass52Array3.length; local494++) {
				if (super.aClass52Array3[local494] != null) {
					super.aClass52Array3[local494].method7617(local19, local482.aClass25_Sub1Array1[local494], Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass25_Sub7_7 != null) {
			@Pc(572) Class323 local572 = super.aClass25_Sub7_7.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local572, Static150.anInt3469);
			} else {
				arg0.method8090(local572);
			}
		}
		for (local494 = 0; local494 < super.aClass52Array3.length; local494++) {
			if (super.aClass52Array3[local494] != null) {
				super.aBoolean580 |= super.aClass52Array3[local494].LA();
			}
		}
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		super.anInt8564 = Static335.anInt6052;
		return local482;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBII)V")
	public void method5679(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8580 < 9) {
			super.anInt8580++;
		}
		for (@Pc(30) int local30 = super.anInt8580; local30 > 0; local30--) {
			super.anIntArray512[local30] = super.anIntArray512[local30 - 1];
			super.anIntArray513[local30] = super.anIntArray513[local30 - 1];
			super.aByteArray209[local30] = super.aByteArray209[local30 - 1];
		}
		super.anIntArray512[0] = arg2;
		super.anIntArray513[0] = arg0;
		super.aByteArray209[0] = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		if (this.aClass131_1 == null || !super.aBoolean581 && !this.method5667(arg0, 0)) {
			return;
		}
		@Pc(20) Class42 local20 = arg0.method8052();
		local20.o(super.aClass252_7.method5714());
		local20.U(super.anInt8476, super.anInt8480 - 5, super.anInt8482);
		this.method6663(arg0, local20, super.aClass52Array3, super.aBoolean581);
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
	@Override
	public int method6668() {
		return this.aClass131_1 == null || this.aClass131_1.anInt4335 == -1 ? super.method6668() : Static181.aClass60_1.method1797(this.aClass131_1.anInt4335).anInt6196;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass131_1 == null || !this.method5667(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class42 local19 = arg1.method8052();
		@Pc(24) int local24 = super.aClass252_7.method5714();
		local19.o(local24);
		local19.U(super.anInt8476, super.anInt8480, super.anInt8482);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass52Array3.length; local39++) {
			if (super.aClass52Array3[local39] != null && (Static547.aBoolean631 ? super.aClass52Array3[local39].method7612(arg2, arg0, local19, true, Static150.anInt3469) : super.aClass52Array3[local39].method7635(arg2, arg0, local19, true))) {
				local37 = true;
				break;
			}
		}
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		return local37;
	}
}
