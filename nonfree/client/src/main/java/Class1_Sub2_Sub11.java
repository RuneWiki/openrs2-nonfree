import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!ga", name = "Db", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!ga", name = "Fb", descriptor = "I")
	public int anInt1599;

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
	public int anInt1578 = -1;

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
	private int anInt1581 = 0;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
	private int anInt1579 = -1;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	private int anInt1576 = 128;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "S")
	public short aShort11 = 0;

	@OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
	public int anInt1587 = -1;

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
	public int anInt1583 = -1;

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "I")
	public int anInt1591 = -1;

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!ga", name = "lb", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
	private int anInt1585 = 128;

	@OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
	private int anInt1586 = 0;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
	public int anInt1590 = -1;

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "[Lclient!oc;")
	public final Class65[] aClass65Array21 = new Class65[5];

	@OriginalMember(owner = "client!ga", name = "vb", descriptor = "Lclient!oc;")
	public Class65 aClass65_970 = Static27.aClass65_572;

	@OriginalMember(owner = "client!ga", name = "zb", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!ga", name = "Cb", descriptor = "I")
	public int anInt1598 = -1;

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "I")
	public int anInt1592 = -1;

	@OriginalMember(owner = "client!ga", name = "ub", descriptor = "I")
	public int anInt1593 = -1;

	@OriginalMember(owner = "client!ga", name = "yb", descriptor = "I")
	public int anInt1595 = 1;

	@OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
	public int anInt1600 = 32;

	@OriginalMember(owner = "client!ga", name = "xb", descriptor = "S")
	public short aShort12 = 0;

	@OriginalMember(owner = "client!ga", name = "Ib", descriptor = "I")
	private int anInt1602 = -1;

	@OriginalMember(owner = "client!ga", name = "Jb", descriptor = "I")
	public int anInt1603 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!wa;I)V")
	private void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local6 = arg1.method1738();
			this.anIntArray153 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray153[local12] = arg1.method1753();
			}
		} else if (arg0 == 2) {
			this.aClass65_970 = arg1.method1706();
		} else if (arg0 == 12) {
			this.anInt1595 = arg1.method1738();
		} else if (arg0 == 13) {
			this.anInt1603 = arg1.method1753();
		} else if (arg0 == 14) {
			this.anInt1583 = arg1.method1753();
		} else if (arg0 == 15) {
			this.anInt1593 = arg1.method1753();
		} else if (arg0 == 16) {
			this.anInt1587 = arg1.method1753();
		} else if (arg0 == 17) {
			this.anInt1583 = arg1.method1753();
			this.anInt1592 = arg1.method1753();
			this.anInt1590 = arg1.method1753();
			this.anInt1578 = arg1.method1753();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass65Array21[arg0 - 30] = arg1.method1706();
			if (this.aClass65Array21[arg0 - 30].method2489(Static186.aClass65_2441)) {
				this.aClass65Array21[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local6 = arg1.method1738();
			this.aShortArray27 = new short[local6];
			this.aShortArray29 = new short[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.aShortArray27[local12] = (short) arg1.method1753();
				this.aShortArray29[local12] = (short) arg1.method1753();
			}
		} else if (arg0 == 41) {
			local6 = arg1.method1738();
			this.aShortArray28 = new short[local6];
			this.aShortArray26 = new short[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.aShortArray28[local12] = (short) arg1.method1753();
				this.aShortArray26[local12] = (short) arg1.method1753();
			}
		} else if (arg0 == 60) {
			local6 = arg1.method1738();
			this.anIntArray152 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray152[local12] = arg1.method1753();
			}
		} else if (arg0 == 93) {
			this.aBoolean66 = false;
		} else if (arg0 == 95) {
			this.anInt1598 = arg1.method1753();
		} else if (arg0 == 97) {
			this.anInt1576 = arg1.method1753();
		} else if (arg0 == 98) {
			this.anInt1585 = arg1.method1753();
		} else if (arg0 == 99) {
			this.aBoolean67 = true;
		} else if (arg0 == 100) {
			this.anInt1581 = arg1.method1720();
		} else if (arg0 == 101) {
			this.anInt1586 = arg1.method1720() * 5;
		} else if (arg0 == 102) {
			this.anInt1591 = arg1.method1753();
		} else if (arg0 == 103) {
			this.anInt1600 = arg1.method1753();
		} else if (arg0 == 106) {
			this.anInt1579 = arg1.method1753();
			if (this.anInt1579 == 65535) {
				this.anInt1579 = -1;
			}
			this.anInt1602 = arg1.method1753();
			if (this.anInt1602 == 65535) {
				this.anInt1602 = -1;
			}
			local6 = arg1.method1738();
			this.anIntArray151 = new int[local6 + 1];
			for (local12 = 0; local12 <= local6; local12++) {
				this.anIntArray151[local12] = arg1.method1753();
				if (this.anIntArray151[local12] == 65535) {
					this.anIntArray151[local12] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean68 = false;
		} else if (arg0 == 109) {
			this.aBoolean65 = false;
		} else if (arg0 != 111) {
			if (arg0 == 113) {
				arg1.method1753();
				arg1.method1753();
			} else if (arg0 == 114) {
				arg1.method1720();
				arg1.method1720();
			} else if (arg0 == 115) {
				this.aShort11 = (short) (arg1.method1738() * 4);
				this.aShort12 = (short) (arg1.method1738() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public void method1074() {
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Z")
	public boolean method1075() {
		if (this.anIntArray151 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1579 != -1) {
			local10 = Static160.method2103(this.anInt1579);
		} else if (this.anInt1602 != -1) {
			local10 = Static135.anIntArray379[this.anInt1602];
		}
		return local10 >= 0 && this.anIntArray151.length > local10 && this.anIntArray151[local10] != -1;
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Lclient!ga;")
	public Class1_Sub2_Sub11 method1076() {
		@Pc(5) int local5 = -1;
		if (this.anInt1579 != -1) {
			local5 = Static160.method2103(this.anInt1579);
		} else if (this.anInt1602 != -1) {
			local5 = Static135.anIntArray379[this.anInt1602];
		}
		return local5 < 0 || local5 >= this.anIntArray151.length || this.anIntArray151[local5] == -1 ? null : Static114.method2108(this.anIntArray151[local5]);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!kg;ILclient!kg;I)Lclient!bf;")
	public Class6_Sub3 method1077(@OriginalArg(1) Class1_Sub2_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub14 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray151 != null) {
			@Pc(12) Class1_Sub2_Sub11 local12 = this.method1076();
			return local12 == null ? null : local12.method1077(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class6_Sub3 local32 = (Class6_Sub3) Static134.aClass67_7.method2570((long) this.anInt1599);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray153.length; local38++) {
				if (!Static188.aClass60_37.method2317(this.anIntArray153[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class6_Sub1[] local70 = new Class6_Sub1[this.anIntArray153.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray153.length; local72++) {
				local70[local72] = Static10.method193(Static188.aClass60_37, this.anIntArray153[local72]);
			}
			@Pc(102) Class6_Sub1 local102;
			if (local70.length == 1) {
				local102 = local70[0];
			} else {
				local102 = new Class6_Sub1(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray27 != null) {
				for (local116 = 0; local116 < this.aShortArray27.length; local116++) {
					local102.method199(this.aShortArray27[local116], this.aShortArray29[local116]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local116 = 0; local116 < this.aShortArray28.length; local116++) {
					local102.method192(this.aShortArray28[local116], this.aShortArray26[local116]);
				}
			}
			local32 = local102.method184(this.anInt1581 + 64, this.anInt1586 + 850, -30, -50, -30);
			Static134.aClass67_7.method2567(local32, (long) this.anInt1599);
		}
		@Pc(198) Class6_Sub3 local198;
		if (arg2 != null && arg0 != null) {
			local198 = arg2.method1884(local32, arg3, arg0, arg1);
		} else if (arg2 != null) {
			local198 = arg2.method1886(local32, arg3);
		} else if (arg0 == null) {
			local198 = local32.method1183(true);
		} else {
			local198 = arg0.method1886(local32, arg1);
		}
		if (this.anInt1576 != 128 || this.anInt1585 != 128) {
			local198.method1185(this.anInt1576, this.anInt1585, this.anInt1576);
		}
		return local198;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!wa;B)V")
	public void method1079(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1738();
			if (local7 == 0) {
				return;
			}
			this.method1070(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLclient!kg;)Lclient!bf;")
	public Class6_Sub3 method1080(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub14 arg1) {
		if (this.anIntArray151 != null) {
			@Pc(20) Class1_Sub2_Sub11 local20 = this.method1076();
			return local20 == null ? null : local20.method1080(arg0, arg1);
		} else if (this.anIntArray152 == null) {
			return null;
		} else {
			@Pc(43) Class6_Sub3 local43 = (Class6_Sub3) Static189.aClass67_9.method2570((long) this.anInt1599);
			if (local43 == null) {
				@Pc(47) boolean local47 = false;
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray152.length; local49++) {
					if (!Static188.aClass60_37.method2317(this.anIntArray152[local49], 0)) {
						local47 = true;
					}
				}
				if (local47) {
					return null;
				}
				@Pc(81) Class6_Sub1[] local81 = new Class6_Sub1[this.anIntArray152.length];
				for (@Pc(83) int local83 = 0; local83 < this.anIntArray152.length; local83++) {
					local81[local83] = Static10.method193(Static188.aClass60_37, this.anIntArray152[local83]);
				}
				@Pc(118) Class6_Sub1 local118;
				if (local81.length == 1) {
					local118 = local81[0];
				} else {
					local118 = new Class6_Sub1(local81, local81.length);
				}
				@Pc(129) int local129;
				if (this.aShortArray27 != null) {
					for (local129 = 0; local129 < this.aShortArray27.length; local129++) {
						local118.method199(this.aShortArray27[local129], this.aShortArray29[local129]);
					}
				}
				if (this.aShortArray28 != null) {
					for (local129 = 0; local129 < this.aShortArray28.length; local129++) {
						local118.method192(this.aShortArray28[local129], this.aShortArray26[local129]);
					}
				}
				local43 = local118.method184(64, 768, -50, -10, -50);
				Static189.aClass67_9.method2567(local43, (long) this.anInt1599);
			}
			if (arg1 != null) {
				local43 = arg1.method1881(arg0, local43);
			}
			return local43;
		}
	}
}
