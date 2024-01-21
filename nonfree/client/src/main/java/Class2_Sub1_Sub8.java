import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!ei", name = "V", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ei", name = "hb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
	public int anInt1545;

	@OriginalMember(owner = "client!ei", name = "mb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ei", name = "qb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!ei", name = "Ib", descriptor = "I")
	private int anInt1566;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "[Lclient!ob;")
	public Class60[] aClass60Array8 = new Class60[] { null, null, Static57.aClass60_413, null, null };

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
	private int anInt1524 = -1;

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
	public int anInt1535 = 0;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
	private int anInt1536 = 128;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public int anInt1529 = 0;

	@OriginalMember(owner = "client!ei", name = "eb", descriptor = "[Lclient!ob;")
	public Class60[] aClass60Array9 = new Class60[] { null, null, null, null, Static171.aClass60_1153 };

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
	private int anInt1537 = -1;

	@OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
	public int anInt1538 = -1;

	@OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
	private int anInt1543 = -1;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "Lclient!ob;")
	public Class60 aClass60_363 = Static138.aClass60_153;

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!ei", name = "lb", descriptor = "I")
	public int anInt1547 = 0;

	@OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
	private int anInt1546 = 0;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
	private int anInt1534 = -1;

	@OriginalMember(owner = "client!ei", name = "rb", descriptor = "I")
	private int anInt1551 = 0;

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	public int anInt1533 = -1;

	@OriginalMember(owner = "client!ei", name = "ub", descriptor = "I")
	private int anInt1554 = -1;

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	public int anInt1526 = -1;

	@OriginalMember(owner = "client!ei", name = "ob", descriptor = "I")
	private int anInt1549 = -1;

	@OriginalMember(owner = "client!ei", name = "tb", descriptor = "I")
	public int anInt1553 = 0;

	@OriginalMember(owner = "client!ei", name = "Ab", descriptor = "I")
	private int anInt1559 = 0;

	@OriginalMember(owner = "client!ei", name = "zb", descriptor = "I")
	public int anInt1558 = -1;

	@OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
	private int anInt1540 = -1;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	public int anInt1527 = 2000;

	@OriginalMember(owner = "client!ei", name = "Gb", descriptor = "I")
	public int anInt1564 = 1;

	@OriginalMember(owner = "client!ei", name = "Cb", descriptor = "I")
	private int anInt1561 = 0;

	@OriginalMember(owner = "client!ei", name = "yb", descriptor = "I")
	public int anInt1557 = 0;

	@OriginalMember(owner = "client!ei", name = "Fb", descriptor = "I")
	private int anInt1563 = 128;

	@OriginalMember(owner = "client!ei", name = "fb", descriptor = "I")
	private int anInt1542 = -1;

	@OriginalMember(owner = "client!ei", name = "xb", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!ei", name = "wb", descriptor = "I")
	public int anInt1556 = 0;

	@OriginalMember(owner = "client!ei", name = "Hb", descriptor = "I")
	public int anInt1565 = 0;

	@OriginalMember(owner = "client!ei", name = "Jb", descriptor = "I")
	private int anInt1567 = 128;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)Lclient!cb;")
	public Class2_Sub1_Sub1_Sub1 method1144(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1554;
		@Pc(11) int local11 = this.anInt1542;
		if (arg0) {
			local11 = this.anInt1540;
			local8 = this.anInt1543;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(30) Class2_Sub1_Sub1_Sub1 local30 = Static23.method578(Static24.aClass13_6, local8);
		if (local11 != -1) {
			@Pc(38) Class2_Sub1_Sub1_Sub1 local38 = Static23.method578(Static24.aClass13_6, local11);
			@Pc(49) Class2_Sub1_Sub1_Sub1[] local49 = new Class2_Sub1_Sub1_Sub1[] { local30, local38 };
			local30 = new Class2_Sub1_Sub1_Sub1(local49, 2);
		}
		@Pc(60) int local60;
		if (this.aShortArray26 != null) {
			for (local60 = 0; local60 < this.aShortArray26.length; local60++) {
				local30.method588(this.aShortArray26[local60], this.aShortArray27[local60]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local60 = 0; local60 < this.aShortArray28.length; local60++) {
				local30.method576(this.aShortArray28[local60], this.aShortArray29[local60]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!og;II)V")
	private void method1146(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1566 = arg0.method234();
		} else if (arg1 == 2) {
			this.aClass60_363 = arg0.method240();
		} else if (arg1 == 4) {
			this.anInt1527 = arg0.method234();
		} else if (arg1 == 5) {
			this.anInt1556 = arg0.method234();
		} else if (arg1 == 6) {
			this.anInt1547 = arg0.method234();
		} else if (arg1 == 7) {
			this.anInt1553 = arg0.method234();
			if (this.anInt1553 > 32767) {
				this.anInt1553 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1529 = arg0.method234();
			if (this.anInt1529 > 32767) {
				this.anInt1529 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1535 = 1;
		} else if (arg1 == 12) {
			this.anInt1564 = arg0.method206();
		} else if (arg1 == 16) {
			this.aBoolean58 = true;
		} else if (arg1 == 23) {
			this.anInt1526 = arg0.method234();
			this.anInt1559 = arg0.method218();
		} else if (arg1 == 24) {
			this.anInt1534 = arg0.method234();
		} else if (arg1 == 25) {
			this.anInt1558 = arg0.method234();
			this.anInt1546 = arg0.method218();
		} else if (arg1 == 26) {
			this.anInt1524 = arg0.method234();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass60Array8[arg1 - 30] = arg0.method240();
			if (this.aClass60Array8[arg1 - 30].method2698(Static161.aClass60_1093)) {
				this.aClass60Array8[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass60Array9[arg1 - 35] = arg0.method240();
		} else {
			@Pc(137) int local137;
			@Pc(147) int local147;
			if (arg1 == 40) {
				local137 = arg0.method218();
				this.aShortArray26 = new short[local137];
				this.aShortArray27 = new short[local137];
				for (local147 = 0; local147 < local137; local147++) {
					this.aShortArray26[local147] = (short) arg0.method234();
					this.aShortArray27[local147] = (short) arg0.method234();
				}
			} else if (arg1 == 41) {
				local137 = arg0.method218();
				this.aShortArray29 = new short[local137];
				this.aShortArray28 = new short[local137];
				for (local147 = 0; local147 < local137; local147++) {
					this.aShortArray28[local147] = (short) arg0.method234();
					this.aShortArray29[local147] = (short) arg0.method234();
				}
			} else if (arg1 == 65) {
				this.aBoolean57 = true;
			} else if (arg1 == 78) {
				this.anInt1549 = arg0.method234();
			} else if (arg1 == 79) {
				this.anInt1537 = arg0.method234();
			} else if (arg1 == 90) {
				this.anInt1554 = arg0.method234();
			} else if (arg1 == 91) {
				this.anInt1543 = arg0.method234();
			} else if (arg1 == 92) {
				this.anInt1542 = arg0.method234();
			} else if (arg1 == 93) {
				this.anInt1540 = arg0.method234();
			} else if (arg1 == 95) {
				this.anInt1557 = arg0.method234();
			} else if (arg1 == 97) {
				this.anInt1533 = arg0.method234();
			} else if (arg1 == 98) {
				this.anInt1538 = arg0.method234();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray147 == null) {
					this.anIntArray147 = new int[10];
					this.anIntArray146 = new int[10];
				}
				this.anIntArray147[arg1 - 100] = arg0.method234();
				this.anIntArray146[arg1 - 100] = arg0.method234();
			} else if (arg1 == 110) {
				this.anInt1567 = arg0.method234();
			} else if (arg1 == 111) {
				this.anInt1563 = arg0.method234();
			} else if (arg1 == 112) {
				this.anInt1536 = arg0.method234();
			} else if (arg1 == 113) {
				this.anInt1561 = arg0.method227();
			} else if (arg1 == 114) {
				this.anInt1551 = arg0.method227() * 5;
			} else if (arg1 == 115) {
				this.anInt1565 = arg0.method218();
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!ce;II)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method1148(@OriginalArg(1) Class2_Sub1_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray147 != null && arg1 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg1 >= this.anIntArray146[local17] && this.anIntArray146[local17] != 0) {
					local15 = this.anIntArray147[local17];
				}
			}
			if (local15 != -1) {
				return Static88.method2046(local15).method1148(arg0, 1, arg2);
			}
		}
		@Pc(64) Class2_Sub1_Sub1_Sub4 local64 = (Class2_Sub1_Sub1_Sub4) Static38.aClass89_12.method3437((long) this.anInt1545);
		if (local64 == null) {
			@Pc(72) Class2_Sub1_Sub1_Sub1 local72 = Static23.method578(Static24.aClass13_6, this.anInt1566);
			if (local72 == null) {
				return null;
			}
			@Pc(81) int local81;
			if (this.aShortArray26 != null) {
				for (local81 = 0; local81 < this.aShortArray26.length; local81++) {
					local72.method588(this.aShortArray26[local81], this.aShortArray27[local81]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local81 = 0; local81 < this.aShortArray28.length; local81++) {
					local72.method576(this.aShortArray28[local81], this.aShortArray29[local81]);
				}
			}
			local64 = local72.method595(this.anInt1561 + 64, 768 - -this.anInt1551, -50, -10, -50);
			if (this.anInt1567 != 128 || this.anInt1563 != 128 || this.anInt1536 != 128) {
				local64.method1611(this.anInt1567, this.anInt1563, this.anInt1536);
			}
			Static38.aClass89_12.method3432(local64, (long) this.anInt1545);
		}
		if (arg0 != null) {
			local64 = arg0.method646(local64, arg2);
		}
		return local64;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!ei;Lclient!ei;)V")
	public void method1151(@OriginalArg(1) Class2_Sub1_Sub8 arg0, @OriginalArg(2) Class2_Sub1_Sub8 arg1) {
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray27 = arg0.aShortArray27;
		this.anInt1564 = arg1.anInt1564;
		this.anInt1566 = arg0.anInt1566;
		this.anInt1557 = arg0.anInt1557;
		this.aClass60_363 = arg1.aClass60_363;
		this.aShortArray26 = arg0.aShortArray26;
		this.anInt1527 = arg0.anInt1527;
		this.anInt1535 = 1;
		this.anInt1529 = arg0.anInt1529;
		this.anInt1547 = arg0.anInt1547;
		this.aBoolean58 = arg1.aBoolean58;
		this.anInt1553 = arg0.anInt1553;
		this.anInt1556 = arg0.anInt1556;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)Lclient!ei;")
	public Class2_Sub1_Sub8 method1152(@OriginalArg(0) int arg0) {
		if (this.anIntArray147 != null && arg0 > 1) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (this.anIntArray146[local21] <= arg0 && this.anIntArray146[local21] != 0) {
					local19 = this.anIntArray147[local21];
				}
			}
			if (local19 != -1) {
				return Static88.method2046(local19);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZZ)Z")
	public boolean method1153(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt1542;
		@Pc(14) int local14 = this.anInt1554;
		if (arg0) {
			local14 = this.anInt1543;
			local11 = this.anInt1540;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static24.aClass13_6.method538(local14, 0)) {
			local30 = false;
		}
		if (local11 != -1 && !Static24.aClass13_6.method538(local11, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)Lclient!he;")
	public Class2_Sub1_Sub1_Sub4_Sub1 method1154() {
		@Pc(7) Class2_Sub1_Sub1_Sub1 local7 = Static23.method578(Static24.aClass13_6, this.anInt1566);
		if (local7 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray26 != null) {
			for (local20 = 0; local20 < this.aShortArray26.length; local20++) {
				local7.method588(this.aShortArray26[local20], this.aShortArray27[local20]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local20 = 0; local20 < this.aShortArray28.length; local20++) {
				local7.method576(this.aShortArray28[local20], this.aShortArray29[local20]);
			}
		}
		@Pc(79) Class2_Sub1_Sub1_Sub4_Sub1 local79 = local7.method581(this.anInt1561 + 64, this.anInt1551 + 768);
		local79.aBoolean89 = true;
		if (this.anInt1567 != 128 || this.anInt1563 != 128 || this.anInt1536 != 128) {
			local79.method1611(this.anInt1567, this.anInt1563, this.anInt1536);
		}
		return local79;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!og;I)V")
	public void method1155(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method218();
			if (local15 == 0) {
				return;
			}
			this.method1146(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(ZZ)Z")
	public boolean method1156(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1526;
		@Pc(9) int local9 = this.anInt1549;
		@Pc(12) int local12 = this.anInt1534;
		if (arg0) {
			local9 = this.anInt1537;
			local6 = this.anInt1558;
			local12 = this.anInt1524;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static24.aClass13_6.method538(local6, 0)) {
			local31 = false;
		}
		if (local12 != -1 && !Static24.aClass13_6.method538(local12, 0)) {
			local31 = false;
		}
		if (local9 != -1 && !Static24.aClass13_6.method538(local9, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V")
	public void method1157() {
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(ZZ)Lclient!cb;")
	public Class2_Sub1_Sub1_Sub1 method1158(@OriginalArg(1) boolean arg0) {
		@Pc(13) int local13 = this.anInt1526;
		@Pc(16) int local16 = this.anInt1534;
		@Pc(19) int local19 = this.anInt1549;
		if (arg0) {
			local13 = this.anInt1558;
			local16 = this.anInt1524;
			local19 = this.anInt1537;
		}
		if (local13 == -1) {
			return null;
		}
		@Pc(40) Class2_Sub1_Sub1_Sub1 local40 = Static23.method578(Static24.aClass13_6, local13);
		if (local16 != -1) {
			@Pc(49) Class2_Sub1_Sub1_Sub1 local49 = Static23.method578(Static24.aClass13_6, local16);
			if (local19 == -1) {
				@Pc(63) Class2_Sub1_Sub1_Sub1[] local63 = new Class2_Sub1_Sub1_Sub1[] { local40, local49 };
				local40 = new Class2_Sub1_Sub1_Sub1(local63, 2);
			} else {
				@Pc(76) Class2_Sub1_Sub1_Sub1 local76 = Static23.method578(Static24.aClass13_6, local19);
				@Pc(91) Class2_Sub1_Sub1_Sub1[] local91 = new Class2_Sub1_Sub1_Sub1[] { local40, local49, local76 };
				local40 = new Class2_Sub1_Sub1_Sub1(local91, 3);
			}
		}
		if (!arg0 && this.anInt1559 != 0) {
			local40.method582(0, this.anInt1559, 0);
		}
		if (arg0 && this.anInt1546 != 0) {
			local40.method582(0, this.anInt1546, 0);
		}
		@Pc(124) int local124;
		if (this.aShortArray26 != null) {
			for (local124 = 0; local124 < this.aShortArray26.length; local124++) {
				local40.method588(this.aShortArray26[local124], this.aShortArray27[local124]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local124 = 0; local124 < this.aShortArray28.length; local124++) {
				local40.method576(this.aShortArray28[local124], this.aShortArray29[local124]);
			}
		}
		return local40;
	}
}
