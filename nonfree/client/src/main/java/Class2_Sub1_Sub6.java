import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!h", name = "I", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	public int anInt1491;

	@OriginalMember(owner = "client!h", name = "U", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!h", name = "X", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
	private int anInt1503;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	private int anInt1494 = 128;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	private int anInt1486 = -1;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "I")
	public int anInt1496 = 0;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	public int anInt1495 = 0;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "I")
	private int anInt1487 = -1;

	@OriginalMember(owner = "client!h", name = "W", descriptor = "I")
	private int anInt1502 = -1;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	private int anInt1489 = -1;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
	public int anInt1507 = 0;

	@OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
	private int anInt1519 = -1;

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	private int anInt1499 = 0;

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
	public int anInt1512 = -1;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "I")
	private int anInt1524 = -1;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "I")
	private int anInt1490 = 0;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
	private int anInt1511 = -1;

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
	public int anInt1510 = 0;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
	public int anInt1509 = 2000;

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "I")
	public int anInt1522 = 0;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "I")
	public int anInt1515 = 0;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "[Lclient!cd;")
	public Class10[] aClass10Array11 = new Class10[] { null, null, Static93.aClass10_922, null, null };

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "I")
	public int anInt1529 = 0;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "I")
	public int anInt1517 = 1;

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "[Lclient!cd;")
	public Class10[] aClass10Array10 = new Class10[] { null, null, null, null, Static91.aClass10_905 };

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "I")
	private int anInt1525 = 128;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "I")
	public int anInt1506 = -1;

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "I")
	private int anInt1528 = -1;

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "I")
	private int anInt1513 = -1;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "I")
	public int anInt1518 = 0;

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "I")
	public int anInt1532 = 0;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "I")
	private int anInt1520 = -1;

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "I")
	private int anInt1523 = 128;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "Lclient!cd;")
	public Class10 aClass10_662 = Static89.aClass10_876;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!va;B)V")
	private void method1088(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1503 = arg1.method1456();
		} else if (arg0 == 2) {
			this.aClass10_662 = arg1.method1452();
		} else if (arg0 == 4) {
			this.anInt1509 = arg1.method1456();
		} else if (arg0 == 5) {
			this.anInt1518 = arg1.method1456();
		} else if (arg0 == 6) {
			this.anInt1532 = arg1.method1456();
		} else if (arg0 == 7) {
			this.anInt1529 = arg1.method1456();
			if (this.anInt1529 > 32767) {
				this.anInt1529 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt1515 = arg1.method1456();
			if (this.anInt1515 > 32767) {
				this.anInt1515 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt1507 = 1;
		} else if (arg0 == 12) {
			this.anInt1517 = arg1.method1449();
		} else if (arg0 == 16) {
			this.aBoolean64 = true;
		} else if (arg0 == 23) {
			this.anInt1502 = arg1.method1456();
			this.anInt1490 = arg1.method1461();
		} else if (arg0 == 24) {
			this.anInt1511 = arg1.method1456();
		} else if (arg0 == 25) {
			this.anInt1520 = arg1.method1456();
			this.anInt1499 = arg1.method1461();
		} else if (arg0 == 26) {
			this.anInt1486 = arg1.method1456();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass10Array11[arg0 - 30] = arg1.method1452();
			if (this.aClass10Array11[arg0 - 30].method343(Static2.aClass10_32)) {
				this.aClass10Array11[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass10Array10[arg0 - 35] = arg1.method1452();
		} else {
			@Pc(415) int local415;
			@Pc(425) int local425;
			if (arg0 == 40) {
				local415 = arg1.method1461();
				this.aShortArray13 = new short[local415];
				this.aShortArray16 = new short[local415];
				for (local425 = 0; local425 < local415; local425++) {
					this.aShortArray13[local425] = (short) arg1.method1456();
					this.aShortArray16[local425] = (short) arg1.method1456();
				}
			} else if (arg0 == 41) {
				local415 = arg1.method1461();
				this.aShortArray15 = new short[local415];
				this.aShortArray14 = new short[local415];
				for (local425 = 0; local425 < local415; local425++) {
					this.aShortArray15[local425] = (short) arg1.method1456();
					this.aShortArray14[local425] = (short) arg1.method1456();
				}
			} else if (arg0 == 65) {
				this.aBoolean65 = true;
			} else if (arg0 == 78) {
				this.anInt1524 = arg1.method1456();
			} else if (arg0 == 79) {
				this.anInt1487 = arg1.method1456();
			} else if (arg0 == 90) {
				this.anInt1519 = arg1.method1456();
			} else if (arg0 == 91) {
				this.anInt1489 = arg1.method1456();
			} else if (arg0 == 92) {
				this.anInt1513 = arg1.method1456();
			} else if (arg0 == 93) {
				this.anInt1528 = arg1.method1456();
			} else if (arg0 == 95) {
				this.anInt1496 = arg1.method1456();
			} else if (arg0 == 97) {
				this.anInt1512 = arg1.method1456();
			} else if (arg0 == 98) {
				this.anInt1506 = arg1.method1456();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray172 == null) {
					this.anIntArray171 = new int[10];
					this.anIntArray172 = new int[10];
				}
				this.anIntArray172[arg0 - 100] = arg1.method1456();
				this.anIntArray171[arg0 - 100] = arg1.method1456();
			} else if (arg0 == 110) {
				this.anInt1525 = arg1.method1456();
			} else if (arg0 == 111) {
				this.anInt1494 = arg1.method1456();
			} else if (arg0 == 112) {
				this.anInt1523 = arg1.method1456();
			} else if (arg0 == 113) {
				this.anInt1522 = arg1.method1463();
			} else if (arg0 == 114) {
				this.anInt1510 = arg1.method1463() * 5;
			} else if (arg0 == 115) {
				this.anInt1495 = arg1.method1461();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1090(@OriginalArg(1) int arg0) {
		if (this.anIntArray172 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray171[local15] <= arg0 && this.anIntArray171[local15] != 0) {
					local13 = this.anIntArray172[local15];
				}
			}
			if (local13 != -1) {
				return Static78.method577(local13).method1090(1);
			}
		}
		@Pc(62) Class2_Sub1_Sub3_Sub3 local62 = (Class2_Sub1_Sub3_Sub3) Static100.aClass72_19.method2259((long) this.anInt1491);
		if (local62 != null) {
			return local62;
		}
		@Pc(80) Class2_Sub1_Sub3_Sub7 local80 = Static166.method2551(Static55.aClass29_27, this.anInt1503);
		if (local80 == null) {
			return null;
		}
		if (this.anInt1525 != 128 || this.anInt1494 != 128 || this.anInt1523 != 128) {
			local80.method2547(this.anInt1525, this.anInt1494, this.anInt1523);
		}
		@Pc(115) int local115;
		if (this.aShortArray13 != null) {
			for (local115 = 0; local115 < this.aShortArray13.length; local115++) {
				local80.method2566(this.aShortArray13[local115], this.aShortArray16[local115]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local115 = 0; local115 < this.aShortArray15.length; local115++) {
				local80.method2567(this.aShortArray15[local115], this.aShortArray14[local115]);
			}
		}
		local62 = local80.method2565(this.anInt1522 + 64, this.anInt1510 + 768, -50, -10, -50, false);
		local62.aBoolean34 = true;
		Static100.aClass72_19.method2254(local62, (long) this.anInt1491);
		return local62;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)Z")
	public boolean method1091(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt1511;
		@Pc(14) int local14 = this.anInt1502;
		@Pc(17) int local17 = this.anInt1524;
		if (arg0) {
			local14 = this.anInt1520;
			local11 = this.anInt1486;
			local17 = this.anInt1487;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static55.aClass29_27.method1016(local14, 0)) {
			local36 = false;
		}
		if (local11 != -1 && !Static55.aClass29_27.method1016(local11, 0)) {
			local36 = false;
		}
		if (local17 != -1 && !Static55.aClass29_27.method1016(local17, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(BI)Lclient!h;")
	public Class2_Sub1_Sub6 method1092(@OriginalArg(1) int arg0) {
		if (this.anIntArray172 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray171[local17] <= arg0 && this.anIntArray171[local17] != 0) {
					local15 = this.anIntArray172[local17];
				}
			}
			if (local15 != -1) {
				return Static78.method577(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public void method1095() {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!va;B)V")
	public void method1096(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1461();
			if (local13 == 0) {
				return;
			}
			this.method1088(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!h;Lclient!h;)V")
	public void method1097(@OriginalArg(1) Class2_Sub1_Sub6 arg0, @OriginalArg(2) Class2_Sub1_Sub6 arg1) {
		this.anInt1532 = arg0.anInt1532;
		this.aBoolean64 = arg1.aBoolean64;
		this.aShortArray15 = arg0.aShortArray15;
		this.anInt1517 = arg1.anInt1517;
		this.anInt1507 = 1;
		this.aShortArray13 = arg0.aShortArray13;
		this.anInt1529 = arg0.anInt1529;
		this.anInt1496 = arg0.anInt1496;
		this.anInt1503 = arg0.anInt1503;
		this.aShortArray14 = arg0.aShortArray14;
		this.anInt1515 = arg0.anInt1515;
		this.aShortArray16 = arg0.aShortArray16;
		this.anInt1509 = arg0.anInt1509;
		this.aClass10_662 = arg1.aClass10_662;
		this.anInt1518 = arg0.anInt1518;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(ZB)Z")
	public boolean method1099(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1519;
		@Pc(9) int local9 = this.anInt1513;
		if (arg0) {
			local9 = this.anInt1528;
			local6 = this.anInt1489;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static55.aClass29_27.method1016(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static55.aClass29_27.method1016(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method1100(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt1519;
		@Pc(7) int local7 = this.anInt1513;
		if (arg0) {
			local4 = this.anInt1489;
			local7 = this.anInt1528;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(30) Class2_Sub1_Sub3_Sub7 local30 = Static166.method2551(Static55.aClass29_27, local4);
		if (local7 != -1) {
			@Pc(39) Class2_Sub1_Sub3_Sub7 local39 = Static166.method2551(Static55.aClass29_27, local7);
			@Pc(50) Class2_Sub1_Sub3_Sub7[] local50 = new Class2_Sub1_Sub3_Sub7[] { local30, local39 };
			local30 = new Class2_Sub1_Sub3_Sub7(local50, 2);
		}
		@Pc(61) int local61;
		if (this.aShortArray13 != null) {
			for (local61 = 0; local61 < this.aShortArray13.length; local61++) {
				local30.method2566(this.aShortArray13[local61], this.aShortArray16[local61]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local61 = 0; local61 < this.aShortArray15.length; local61++) {
				local30.method2567(this.aShortArray15[local61], this.aShortArray14[local61]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(ZI)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method1101(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1511;
		@Pc(11) int local11 = this.anInt1502;
		@Pc(14) int local14 = this.anInt1524;
		if (arg0) {
			local14 = this.anInt1487;
			local8 = this.anInt1486;
			local11 = this.anInt1520;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub3_Sub7 local35 = Static166.method2551(Static55.aClass29_27, local11);
		if (local8 != -1) {
			@Pc(43) Class2_Sub1_Sub3_Sub7 local43 = Static166.method2551(Static55.aClass29_27, local8);
			if (local14 == -1) {
				@Pc(86) Class2_Sub1_Sub3_Sub7[] local86 = new Class2_Sub1_Sub3_Sub7[] { local35, local43 };
				local35 = new Class2_Sub1_Sub3_Sub7(local86, 2);
			} else {
				@Pc(52) Class2_Sub1_Sub3_Sub7 local52 = Static166.method2551(Static55.aClass29_27, local14);
				@Pc(67) Class2_Sub1_Sub3_Sub7[] local67 = new Class2_Sub1_Sub3_Sub7[] { local35, local43, local52 };
				local35 = new Class2_Sub1_Sub3_Sub7(local67, 3);
			}
		}
		if (!arg0 && this.anInt1490 != 0) {
			local35.method2555(0, this.anInt1490, 0);
		}
		if (arg0 && this.anInt1499 != 0) {
			local35.method2555(0, this.anInt1499, 0);
		}
		@Pc(130) int local130;
		if (this.aShortArray13 != null) {
			for (local130 = 0; local130 < this.aShortArray13.length; local130++) {
				local35.method2566(this.aShortArray13[local130], this.aShortArray16[local130]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local130 = 0; local130 < this.aShortArray15.length; local130++) {
				local35.method2567(this.aShortArray15[local130], this.aShortArray14[local130]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method1103(@OriginalArg(1) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray172 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray171[local17] <= arg0 && this.anIntArray171[local17] != 0) {
					local15 = this.anIntArray172[local17];
				}
			}
			if (local15 != -1) {
				return Static78.method577(local15).method1103(1);
			}
		}
		@Pc(60) Class2_Sub1_Sub3_Sub7 local60 = Static166.method2551(Static55.aClass29_27, this.anInt1503);
		if (local60 == null) {
			return null;
		}
		if (this.anInt1525 != 128 || this.anInt1494 != 128 || this.anInt1523 != 128) {
			local60.method2547(this.anInt1525, this.anInt1494, this.anInt1523);
		}
		if (this.aShortArray13 != null) {
			for (local17 = 0; local17 < this.aShortArray13.length; local17++) {
				local60.method2566(this.aShortArray13[local17], this.aShortArray16[local17]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local17 = 0; local17 < this.aShortArray15.length; local17++) {
				local60.method2567(this.aShortArray15[local17], this.aShortArray14[local17]);
			}
		}
		return local60;
	}
}
