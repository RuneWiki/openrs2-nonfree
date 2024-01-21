import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ih", name = "gb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ih", name = "kb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!ih", name = "sb", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!ih", name = "wb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ih", name = "yb", descriptor = "I")
	public int anInt1826;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
	private int anInt1804 = 128;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
	private int anInt1793 = 0;

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
	public int anInt1807 = 0;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
	public int anInt1803 = -1;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
	public int anInt1795 = 1;

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
	private int anInt1800 = 0;

	@OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
	private int anInt1806 = 128;

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
	private int anInt1798 = 0;

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
	private int anInt1811 = 0;

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "[Lclient!kb;")
	public final Class46[] aClass46Array11 = new Class46[5];

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
	public int anInt1809 = -1;

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
	public int anInt1812 = -1;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
	private int anInt1794 = 0;

	@OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
	public int anInt1813 = 0;

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
	public int anInt1808 = -1;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "Lclient!kb;")
	public Class46 aClass46_625 = Static142.aClass46_1130;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
	private int anInt1801 = 128;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
	private int anInt1797 = -1;

	@OriginalMember(owner = "client!ih", name = "qb", descriptor = "I")
	public int anInt1820 = 2;

	@OriginalMember(owner = "client!ih", name = "xb", descriptor = "I")
	public int anInt1825 = 1;

	@OriginalMember(owner = "client!ih", name = "ub", descriptor = "I")
	public int anInt1823 = 16;

	@OriginalMember(owner = "client!ih", name = "ob", descriptor = "I")
	public int anInt1818 = -1;

	@OriginalMember(owner = "client!ih", name = "Fb", descriptor = "I")
	private int anInt1831 = -1;

	@OriginalMember(owner = "client!ih", name = "Ab", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!ih", name = "Cb", descriptor = "I")
	private int anInt1828 = -1;

	@OriginalMember(owner = "client!ih", name = "Bb", descriptor = "I")
	public int anInt1827 = 0;

	@OriginalMember(owner = "client!ih", name = "zb", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ih", name = "Eb", descriptor = "I")
	public int anInt1830 = -1;

	@OriginalMember(owner = "client!ih", name = "Gb", descriptor = "I")
	public int anInt1832 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)Lclient!ih;")
	public Class3_Sub2_Sub9 method1199() {
		@Pc(5) int local5 = -1;
		if (this.anInt1831 != -1) {
			local5 = Static20.method401(this.anInt1831);
		} else if (this.anInt1828 != -1) {
			local5 = Static41.anIntArray419[this.anInt1828];
		}
		return local5 < 0 || local5 >= this.anIntArray171.length || this.anIntArray171[local5] == -1 ? null : Static136.method2319(this.anIntArray171[local5]);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[IIBII)Lclient!ac;")
	public Class3_Sub2_Sub1 method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray168 == null) {
			local16 = (this.anInt1826 << 10) + arg5;
		} else {
			local16 = arg5 + (this.anInt1826 << 10) + (arg0 << 3);
		}
		@Pc(37) Class3_Sub2_Sub1 local37 = (Class3_Sub2_Sub1) Static180.aClass57_32.method1719(local16);
		if (local37 == null) {
			@Pc(50) Class3_Sub2_Sub1_Sub6 local50 = this.method1203(arg0, arg5);
			if (local50 == null) {
				return null;
			}
			if (this.aBoolean70) {
				local50.aShort27 = (short) (this.anInt1800 * 5 + 768);
				local37 = local50;
				local50.aShort31 = (short) (this.anInt1793 + 64);
				local50.method1951();
			} else {
				local37 = local50.method1938(this.anInt1793 + 64, this.anInt1800 * 5 + 768, -50, -10, -50, ~this.anInt1797 <= -1);
			}
			Static180.aClass57_32.method1717(local37, local16);
		}
		if (this.aBoolean70) {
			local37 = ((Class3_Sub2_Sub1_Sub6) local37).method1936();
		}
		if (this.anInt1797 >= 0) {
			if (local37 instanceof Class3_Sub2_Sub1_Sub2) {
				local37 = ((Class3_Sub2_Sub1_Sub2) local37).method1787(arg2, arg1, arg3, arg4, true, this.anInt1797);
			} else if (local37 instanceof Class3_Sub2_Sub1_Sub6) {
				local37 = ((Class3_Sub2_Sub1_Sub6) local37).method1941(arg2, arg1, arg3, arg4, this.anInt1797);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z")
	public boolean method1201(@OriginalArg(1) int arg0) {
		if (this.anIntArray168 != null) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray168.length; local25++) {
				if (this.anIntArray168[local25] == arg0) {
					return Static127.aClass44_24.method1618(0, this.anIntArray170[local25] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray170 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(66) boolean local66 = true;
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray170.length; local68++) {
				local66 &= Static127.aClass44_24.method1618(0, this.anIntArray170[local68] & 0xFFFF);
			}
			return local66;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method1202(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(268) int local268;
		@Pc(274) int local274;
		if (arg1 == 1) {
			local268 = arg0.method191();
			if (local268 > 0) {
				if (this.anIntArray170 == null || Static114.aBoolean114) {
					this.anIntArray168 = new int[local268];
					this.anIntArray170 = new int[local268];
					for (local274 = 0; local274 < local268; local274++) {
						this.anIntArray170[local274] = arg0.method208();
						this.anIntArray168[local274] = arg0.method191();
					}
				} else {
					arg0.anInt232 += local268 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass46_625 = arg0.method172();
		} else if (arg1 == 5) {
			local268 = arg0.method191();
			if (local268 > 0) {
				if (this.anIntArray170 == null || Static114.aBoolean114) {
					this.anIntArray170 = new int[local268];
					this.anIntArray168 = null;
					for (local274 = 0; local274 < local268; local274++) {
						this.anIntArray170[local274] = arg0.method208();
					}
				} else {
					arg0.anInt232 += local268 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1795 = arg0.method191();
		} else if (arg1 == 15) {
			this.anInt1825 = arg0.method191();
		} else if (arg1 == 17) {
			this.aBoolean69 = false;
			this.anInt1820 = 0;
		} else if (arg1 == 18) {
			this.aBoolean69 = false;
		} else if (arg1 == 19) {
			this.anInt1818 = arg0.method191();
		} else if (arg1 == 21) {
			this.anInt1797 = 0;
		} else if (arg1 == 22) {
			this.aBoolean70 = true;
		} else if (arg1 == 23) {
			this.aBoolean71 = true;
		} else if (arg1 == 24) {
			this.anInt1830 = arg0.method208();
			if (this.anInt1830 == 65535) {
				this.anInt1830 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt1820 = 1;
		} else if (arg1 == 28) {
			this.anInt1823 = arg0.method191();
		} else if (arg1 == 29) {
			this.anInt1793 = arg0.method203();
		} else if (arg1 == 39) {
			this.anInt1800 = arg0.method203() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass46Array11[arg1 - 30] = arg0.method172();
			if (this.aClass46Array11[arg1 - 30].method1389(Static114.aClass46_932)) {
				this.aClass46Array11[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local268 = arg0.method191();
			this.aShortArray11 = new short[local268];
			this.aShortArray9 = new short[local268];
			for (local274 = 0; local274 < local268; local274++) {
				this.aShortArray9[local274] = (short) arg0.method208();
				this.aShortArray11[local274] = (short) arg0.method208();
			}
		} else if (arg1 == 41) {
			local268 = arg0.method191();
			this.aShortArray10 = new short[local268];
			this.aShortArray8 = new short[local268];
			for (local274 = 0; local274 < local268; local274++) {
				this.aShortArray10[local274] = (short) arg0.method208();
				this.aShortArray8[local274] = (short) arg0.method208();
			}
		} else if (arg1 == 60) {
			this.anInt1808 = arg0.method208();
		} else if (arg1 == 62) {
			this.aBoolean73 = true;
		} else if (arg1 == 64) {
			this.aBoolean72 = false;
		} else if (arg1 == 65) {
			this.anInt1804 = arg0.method208();
		} else if (arg1 == 66) {
			this.anInt1801 = arg0.method208();
		} else if (arg1 == 67) {
			this.anInt1806 = arg0.method208();
		} else if (arg1 == 68) {
			this.anInt1812 = arg0.method208();
		} else if (arg1 == 69) {
			this.anInt1813 = arg0.method191();
		} else if (arg1 == 70) {
			this.anInt1798 = arg0.method220();
		} else if (arg1 == 71) {
			this.anInt1794 = arg0.method220();
		} else if (arg1 == 72) {
			this.anInt1811 = arg0.method220();
		} else if (arg1 == 73) {
			this.aBoolean74 = true;
		} else if (arg1 == 74) {
			this.aBoolean75 = true;
		} else if (arg1 == 75) {
			this.anInt1803 = arg0.method191();
		} else if (arg1 == 77) {
			this.anInt1831 = arg0.method208();
			if (this.anInt1831 == 65535) {
				this.anInt1831 = -1;
			}
			this.anInt1828 = arg0.method208();
			if (this.anInt1828 == 65535) {
				this.anInt1828 = -1;
			}
			local268 = arg0.method191();
			this.anIntArray171 = new int[local268 + 1];
			for (local274 = 0; local274 <= local268; local274++) {
				this.anIntArray171[local274] = arg0.method208();
				if (this.anIntArray171[local274] == 65535) {
					this.anIntArray171[local274] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1809 = arg0.method208();
			this.anInt1832 = arg0.method191();
		} else if (arg1 == 79) {
			this.anInt1807 = arg0.method208();
			this.anInt1827 = arg0.method208();
			this.anInt1832 = arg0.method191();
			local268 = arg0.method191();
			this.anIntArray169 = new int[local268];
			for (local274 = 0; local274 < local268; local274++) {
				this.anIntArray169[local274] = arg0.method208();
			}
		} else if (arg1 == 81) {
			this.anInt1797 = arg0.method191() * 256;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)Lclient!oe;")
	private Class3_Sub2_Sub1_Sub6 method1203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class3_Sub2_Sub1_Sub6 local3 = null;
		@Pc(14) int local14;
		@Pc(59) int local59;
		@Pc(111) boolean local111;
		@Pc(137) int local137;
		if (this.anIntArray168 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray170 == null) {
				return null;
			}
			local111 = this.aBoolean73;
			if (arg0 == 2 && arg1 > 3) {
				local111 = !local111;
			}
			local14 = this.anIntArray170.length;
			for (local59 = 0; local59 < local14; local59++) {
				local137 = this.anIntArray170[local59];
				if (local111) {
					local137 += 65536;
				}
				local3 = (Class3_Sub2_Sub1_Sub6) Static128.aClass57_19.method1719((long) local137);
				if (local3 == null) {
					local3 = Static115.method1944(Static127.aClass44_24, local137 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local111) {
						local3.method1946();
					}
					Static128.aClass57_19.method1717(local3, (long) local137);
				}
				if (local14 > 1) {
					Static97.aClass3_Sub2_Sub1_Sub6Array3[local59] = local3;
				}
			}
			if (local14 > 1) {
				local3 = new Class3_Sub2_Sub1_Sub6(Static97.aClass3_Sub2_Sub1_Sub6Array3, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray168.length; local14++) {
				if (arg0 == this.anIntArray168[local14]) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			@Pc(54) boolean local54 = this.aBoolean73 ^ arg1 > 3;
			local59 = this.anIntArray170[local12];
			if (local54) {
				local59 += 65536;
			}
			local3 = (Class3_Sub2_Sub1_Sub6) Static128.aClass57_19.method1719((long) local59);
			if (local3 == null) {
				local3 = Static115.method1944(Static127.aClass44_24, local59 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local54) {
					local3.method1946();
				}
				Static128.aClass57_19.method1717(local3, (long) local59);
			}
		}
		if (this.anInt1804 == 128 && this.anInt1801 == 128 && this.anInt1806 == 128) {
			local111 = false;
		} else {
			local111 = true;
		}
		@Pc(236) boolean local236;
		if (this.anInt1798 == 0 && this.anInt1794 == 0 && this.anInt1811 == 0) {
			local236 = false;
		} else {
			local236 = true;
		}
		@Pc(267) Class3_Sub2_Sub1_Sub6 local267 = new Class3_Sub2_Sub1_Sub6(local3, arg1 == 0 && !local111 && !local236, this.aShortArray9 == null, this.aShortArray10 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local267.method1939();
			local267.method1952(45, 0, -45);
		}
		@Pc(287) int local287 = arg1 & 0x3;
		if (local287 == 1) {
			local267.method1937();
		} else if (local287 == 2) {
			local267.method1942();
		} else if (local287 == 3) {
			local267.method1934();
		}
		if (this.aShortArray9 != null) {
			for (local137 = 0; local137 < this.aShortArray9.length; local137++) {
				local267.method1954(this.aShortArray9[local137], this.aShortArray11[local137]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local137 = 0; local137 < this.aShortArray10.length; local137++) {
				local267.method1933(this.aShortArray10[local137], this.aShortArray8[local137]);
			}
		}
		if (local111) {
			local267.method1943(this.anInt1804, this.anInt1801, this.anInt1806);
		}
		if (local236) {
			local267.method1952(this.anInt1798, this.anInt1794, this.anInt1811);
		}
		return local267;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!rd;)V")
	public void method1206(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method191();
			if (local11 == 0) {
				return;
			}
			this.method1202(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILclient!dg;I[[IIII)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub2_Sub2 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) long local20;
		if (this.anIntArray168 == null) {
			local20 = arg7 + (this.anInt1826 << 10);
		} else {
			local20 = arg7 + (arg6 << 3) + (this.anInt1826 << 10);
		}
		@Pc(36) Class3_Sub2_Sub1_Sub2 local36 = (Class3_Sub2_Sub1_Sub2) Static13.aClass57_2.method1719(local20);
		if (local36 == null) {
			@Pc(44) Class3_Sub2_Sub1_Sub6 local44 = this.method1203(arg6, arg7);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method1938(this.anInt1793 + 64, 768 - -(this.anInt1800 * 5), -50, -10, -50, true);
			Static13.aClass57_2.method1717(local36, local20);
		}
		if (arg3 == null && this.anInt1797 == -1) {
			return local36;
		}
		if (arg3 == null) {
			local36 = local36.method1789(true);
		} else {
			local36 = arg3.method602(arg0, local36, arg7);
		}
		if (this.anInt1797 >= 0) {
			local36 = local36.method1787(arg4, arg2, arg1, arg5, false, this.anInt1797);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public void method1208() {
		if (this.anInt1818 == -1) {
			this.anInt1818 = 0;
			if (this.anIntArray170 != null && (this.anIntArray168 == null || this.anIntArray168[0] == 10)) {
				this.anInt1818 = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < 5; local32++) {
				if (this.aClass46Array11[local32] != null) {
					this.anInt1818 = 1;
				}
			}
		}
		if (this.anInt1803 == -1) {
			this.anInt1803 = this.anInt1820 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[IBIII)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18;
		if (this.anIntArray168 == null) {
			local18 = (this.anInt1826 << 10) + arg5;
		} else {
			local18 = (this.anInt1826 << 10) + (arg3 << 3) + arg5;
		}
		@Pc(35) Class3_Sub2_Sub1_Sub2 local35 = (Class3_Sub2_Sub1_Sub2) Static174.aClass57_30.method1719(local18);
		if (local35 == null) {
			@Pc(50) Class3_Sub2_Sub1_Sub6 local50 = this.method1203(arg3, arg5);
			if (local50 == null) {
				return null;
			}
			local35 = local50.method1938(this.anInt1793 + 64, this.anInt1800 * 5 + 768, -50, -10, -50, ~this.anInt1797 <= -1);
			Static174.aClass57_30.method1717(local35, local18);
		}
		if (this.anInt1797 >= 0) {
			local35 = local35.method1787(arg2, arg1, arg0, arg4, true, this.anInt1797);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)Z")
	public boolean method1210() {
		if (this.anIntArray171 == null) {
			return this.anInt1809 != -1 || this.anIntArray169 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray171.length; local21++) {
			if (this.anIntArray171[local21] != -1) {
				@Pc(50) Class3_Sub2_Sub9 local50 = Static136.method2319(this.anIntArray171[local21]);
				if (local50.anInt1809 != -1 || local50.anIntArray169 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)Z")
	public boolean method1212() {
		if (this.anIntArray170 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray170.length; local14++) {
			local12 &= Static127.aClass44_24.method1618(0, this.anIntArray170[local14] & 0xFFFF);
		}
		return local12;
	}
}
