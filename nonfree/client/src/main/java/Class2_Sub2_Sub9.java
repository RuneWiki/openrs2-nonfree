import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!i", name = "J", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
	public int anInt1495;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!i", name = "mb", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!i", name = "Db", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!i", name = "Lb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!i", name = "I", descriptor = "I")
	public int anInt1480 = 1;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "I")
	private int anInt1485 = 128;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "I")
	public int anInt1490 = 2;

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
	public int anInt1493 = 0;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "I")
	public int anInt1482 = 1;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "I")
	private int anInt1487 = -1;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "I")
	public int anInt1489 = 16;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "I")
	public int anInt1483 = -1;

	@OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
	private int anInt1502 = -1;

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
	public int anInt1501 = -1;

	@OriginalMember(owner = "client!i", name = "qb", descriptor = "I")
	private int anInt1505 = 0;

	@OriginalMember(owner = "client!i", name = "sb", descriptor = "I")
	public int anInt1507 = 0;

	@OriginalMember(owner = "client!i", name = "ob", descriptor = "I")
	public int anInt1503 = -1;

	@OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
	private int anInt1500 = 128;

	@OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
	private int anInt1499 = 0;

	@OriginalMember(owner = "client!i", name = "wb", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[Lclient!lf;")
	public final Class49[] aClass49Array10 = new Class49[5];

	@OriginalMember(owner = "client!i", name = "ub", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!i", name = "Cb", descriptor = "I")
	public int anInt1512 = -1;

	@OriginalMember(owner = "client!i", name = "xb", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
	private int anInt1497 = 128;

	@OriginalMember(owner = "client!i", name = "vb", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!i", name = "tb", descriptor = "I")
	public int anInt1508 = 0;

	@OriginalMember(owner = "client!i", name = "db", descriptor = "I")
	private int anInt1496 = -1;

	@OriginalMember(owner = "client!i", name = "zb", descriptor = "Lclient!lf;")
	public Class49 aClass49_793 = Static108.aClass49_1051;

	@OriginalMember(owner = "client!i", name = "Gb", descriptor = "I")
	public int anInt1514 = 0;

	@OriginalMember(owner = "client!i", name = "Mb", descriptor = "I")
	private int anInt1517 = 0;

	@OriginalMember(owner = "client!i", name = "Fb", descriptor = "I")
	private int anInt1513 = 0;

	@OriginalMember(owner = "client!i", name = "Hb", descriptor = "I")
	public int anInt1515 = -1;

	@OriginalMember(owner = "client!i", name = "Eb", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!i", name = "Ob", descriptor = "I")
	private int anInt1518 = 0;

	@OriginalMember(owner = "client!i", name = "Pb", descriptor = "I")
	public int anInt1519 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII[[I)Lclient!ka;")
	public Class2_Sub2_Sub3 method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(21) long local21;
		if (this.anIntArray176 == null) {
			local21 = arg3 + (this.anInt1495 << 10);
		} else {
			local21 = (this.anInt1495 << 10) + ((arg2 << 3) + arg3);
		}
		@Pc(37) Class2_Sub2_Sub3 local37 = (Class2_Sub2_Sub3) Static104.aClass74_62.method2345(local21);
		if (local37 == null) {
			@Pc(45) Class2_Sub2_Sub3_Sub6 local45 = this.method1200(arg3, arg2);
			if (local45 == null) {
				return null;
			}
			if (this.aBoolean63) {
				local37 = local45;
				local45.aShort27 = (short) (this.anInt1505 * 5 + 768);
				local45.aShort28 = (short) (this.anInt1518 + 64);
				local45.method2035();
			} else {
				local37 = local45.method2027(this.anInt1518 + 64, this.anInt1505 * 5 + 768, -50, -10, -50, this.anInt1487 >= 0);
			}
			Static104.aClass74_62.method2341(local21, local37);
		}
		if (this.aBoolean63) {
			local37 = ((Class2_Sub2_Sub3_Sub6) local37).method2020();
		}
		if (this.anInt1487 >= 0) {
			if (local37 instanceof Class2_Sub2_Sub3_Sub4) {
				local37 = ((Class2_Sub2_Sub3_Sub4) local37).method1057(arg5, arg1, arg4, arg0, true, this.anInt1487);
			} else if (local37 instanceof Class2_Sub2_Sub3_Sub6) {
				local37 = ((Class2_Sub2_Sub3_Sub6) local37).method2021(arg5, arg1, arg4, arg0, this.anInt1487);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Lclient!i;")
	public Class2_Sub2_Sub9 method1196() {
		@Pc(5) int local5 = -1;
		if (this.anInt1496 != -1) {
			local5 = Static102.method1754(this.anInt1496);
		} else if (this.anInt1502 != -1) {
			local5 = Static165.anIntArray317[this.anInt1502];
		}
		return local5 < 0 || local5 >= this.anIntArray177.length || this.anIntArray177[local5] == -1 ? null : Static124.method2146(this.anIntArray177[local5]);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
	public boolean method1198(@OriginalArg(1) int arg0) {
		if (this.anIntArray176 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray176.length; local15++) {
				if (arg0 == this.anIntArray176[local15]) {
					return Static155.aClass11_123.method2063(0, this.anIntArray175[local15] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray175 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray175.length; local64++) {
				local62 &= Static155.aClass11_123.method2063(0, this.anIntArray175[local64] & 0xFFFF);
			}
			return local62;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZII)Lclient!oe;")
	private Class2_Sub2_Sub3_Sub6 method1200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub2_Sub3_Sub6 local7 = null;
		@Pc(10) boolean local10 = this.aBoolean67;
		if (arg1 == 2 && arg0 > 3) {
			local10 = !local10;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(51) int local51;
		if (this.anIntArray176 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray175 == null) {
				return null;
			}
			local43 = this.anIntArray175.length;
			for (local45 = 0; local45 < local43; local45++) {
				local51 = this.anIntArray175[local45];
				if (local10) {
					local51 += 65536;
				}
				local7 = (Class2_Sub2_Sub3_Sub6) Static70.aClass74_46.method2345((long) local51);
				if (local7 == null) {
					local7 = Static119.method2029(Static155.aClass11_123, local51 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local10) {
						local7.method2018();
					}
					Static70.aClass74_46.method2341((long) local51, local7);
				}
				if (local43 > 1) {
					Static146.aClass2_Sub2_Sub3_Sub6Array1[local45] = local7;
				}
			}
			if (local43 > 1) {
				local7 = new Class2_Sub2_Sub3_Sub6(Static146.aClass2_Sub2_Sub3_Sub6Array1, local43);
			}
		} else {
			local43 = -1;
			for (local45 = 0; local45 < this.anIntArray176.length; local45++) {
				if (arg1 == this.anIntArray176[local45]) {
					local43 = local45;
					break;
				}
			}
			if (local43 == -1) {
				return null;
			}
			local51 = this.anIntArray175[local43];
			if (local10) {
				local51 += 65536;
			}
			local7 = (Class2_Sub2_Sub3_Sub6) Static70.aClass74_46.method2345((long) local51);
			if (local7 == null) {
				local7 = Static119.method2029(Static155.aClass11_123, local51 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local10) {
					local7.method2018();
				}
				Static70.aClass74_46.method2341((long) local51, local7);
			}
		}
		@Pc(194) boolean local194;
		if (this.anInt1500 == 128 && this.anInt1485 == 128 && this.anInt1497 == 128) {
			local194 = false;
		} else {
			local194 = true;
		}
		@Pc(221) boolean local221;
		if (this.anInt1513 == 0 && this.anInt1517 == 0 && this.anInt1499 == 0) {
			local221 = false;
		} else {
			local221 = true;
		}
		@Pc(254) Class2_Sub2_Sub3_Sub6 local254 = new Class2_Sub2_Sub3_Sub6(local7, arg0 == 0 && !local194 && !local221 && !local10, this.aShortArray11 == null, this.aShortArray12 == null, true);
		if (local10) {
			local254.method2016();
		}
		if (arg1 == 4 && arg0 > 3) {
			local254.method2028();
			local254.method2036(45, 0, -45);
		}
		@Pc(276) int local276 = arg0 & 0x3;
		if (local276 == 1) {
			local254.method2024();
		} else if (local276 == 2) {
			local254.method2017();
		} else if (local276 == 3) {
			local254.method2015();
		}
		@Pc(302) int local302;
		if (this.aShortArray11 != null) {
			for (local302 = 0; local302 < this.aShortArray11.length; local302++) {
				local254.method2025(this.aShortArray11[local302], this.aShortArray9[local302]);
			}
		}
		if (this.aShortArray12 != null) {
			for (local302 = 0; local302 < this.aShortArray12.length; local302++) {
				local254.method2034(this.aShortArray12[local302], this.aShortArray10[local302]);
			}
		}
		if (local194) {
			local254.method2031(this.anInt1500, this.anInt1485, this.anInt1497);
		}
		if (local221) {
			local254.method2036(this.anInt1513, this.anInt1517, this.anInt1499);
		}
		return local254;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIII[[III)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method1201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray176 == null) {
			local19 = arg1 + (this.anInt1495 << 10);
		} else {
			local19 = arg1 + (this.anInt1495 << 10) + (arg4 << 3);
		}
		@Pc(35) Class2_Sub2_Sub3_Sub4 local35 = (Class2_Sub2_Sub3_Sub4) Static104.aClass74_63.method2345(local19);
		if (local35 == null) {
			@Pc(53) Class2_Sub2_Sub3_Sub6 local53 = this.method1200(arg1, arg4);
			if (local53 == null) {
				return null;
			}
			local35 = local53.method2027(this.anInt1518 + 64, 768 - -(this.anInt1505 * 5), -50, -10, -50, this.anInt1487 >= 0);
			Static104.aClass74_63.method2341(local19, local35);
		}
		if (this.anInt1487 >= 0) {
			local35 = local35.method1057(arg3, arg0, arg2, arg5, true, this.anInt1487);
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Z")
	public boolean method1202() {
		if (this.anIntArray177 == null) {
			return this.anInt1519 != -1 || this.anIntArray178 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray177.length; local21++) {
			if (this.anIntArray177[local21] != -1) {
				@Pc(36) Class2_Sub2_Sub9 local36 = Static124.method2146(this.anIntArray177[local21]);
				if (local36.anInt1519 != -1 || local36.anIntArray178 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ja;II)V")
	private void method1203(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(35) int local35;
		if (arg1 == 1) {
			local16 = arg0.method2962();
			if (local16 > 0) {
				if (this.anIntArray175 == null || Static6.aBoolean8) {
					this.anIntArray175 = new int[local16];
					this.anIntArray176 = new int[local16];
					for (local35 = 0; local35 < local16; local35++) {
						this.anIntArray175[local35] = arg0.method2933();
						this.anIntArray176[local35] = arg0.method2962();
					}
				} else {
					arg0.anInt3940 += local16 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass49_793 = arg0.method2926();
		} else if (arg1 == 5) {
			local16 = arg0.method2962();
			if (local16 > 0) {
				if (this.anIntArray175 == null || Static6.aBoolean8) {
					this.anIntArray175 = new int[local16];
					this.anIntArray176 = null;
					for (local35 = 0; local35 < local16; local35++) {
						this.anIntArray175[local35] = arg0.method2933();
					}
				} else {
					arg0.anInt3940 += local16 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1482 = arg0.method2962();
		} else if (arg1 == 15) {
			this.anInt1480 = arg0.method2962();
		} else if (arg1 == 17) {
			this.aBoolean66 = false;
			this.anInt1490 = 0;
		} else if (arg1 == 18) {
			this.aBoolean66 = false;
		} else if (arg1 == 19) {
			this.anInt1501 = arg0.method2962();
		} else if (arg1 == 21) {
			this.anInt1487 = 0;
		} else if (arg1 == 22) {
			this.aBoolean63 = true;
		} else if (arg1 == 23) {
			this.aBoolean64 = true;
		} else if (arg1 == 24) {
			this.anInt1512 = arg0.method2933();
			if (this.anInt1512 == 65535) {
				this.anInt1512 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt1490 = 1;
		} else if (arg1 == 28) {
			this.anInt1489 = arg0.method2962();
		} else if (arg1 == 29) {
			this.anInt1518 = arg0.method2948();
		} else if (arg1 == 39) {
			this.anInt1505 = arg0.method2948() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass49Array10[arg1 - 30] = arg0.method2926();
			if (this.aClass49Array10[arg1 - 30].method1645(Static141.aClass49_1360)) {
				this.aClass49Array10[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local16 = arg0.method2962();
			this.aShortArray11 = new short[local16];
			this.aShortArray9 = new short[local16];
			for (local35 = 0; local35 < local16; local35++) {
				this.aShortArray11[local35] = (short) arg0.method2933();
				this.aShortArray9[local35] = (short) arg0.method2933();
			}
		} else if (arg1 == 41) {
			local16 = arg0.method2962();
			this.aShortArray12 = new short[local16];
			this.aShortArray10 = new short[local16];
			for (local35 = 0; local35 < local16; local35++) {
				this.aShortArray12[local35] = (short) arg0.method2933();
				this.aShortArray10[local35] = (short) arg0.method2933();
			}
		} else if (arg1 == 60) {
			this.anInt1515 = arg0.method2933();
		} else if (arg1 == 62) {
			this.aBoolean67 = true;
		} else if (arg1 == 64) {
			this.aBoolean65 = false;
		} else if (arg1 == 65) {
			this.anInt1500 = arg0.method2933();
		} else if (arg1 == 66) {
			this.anInt1485 = arg0.method2933();
		} else if (arg1 == 67) {
			this.anInt1497 = arg0.method2933();
		} else if (arg1 == 68) {
			this.anInt1503 = arg0.method2933();
		} else if (arg1 == 69) {
			this.anInt1508 = arg0.method2962();
		} else if (arg1 == 70) {
			this.anInt1513 = arg0.method2941();
		} else if (arg1 == 71) {
			this.anInt1517 = arg0.method2941();
		} else if (arg1 == 72) {
			this.anInt1499 = arg0.method2941();
		} else if (arg1 == 73) {
			this.aBoolean62 = true;
		} else if (arg1 == 74) {
			this.aBoolean61 = true;
		} else if (arg1 == 75) {
			this.anInt1483 = arg0.method2962();
		} else if (arg1 == 77) {
			this.anInt1496 = arg0.method2933();
			if (this.anInt1496 == 65535) {
				this.anInt1496 = -1;
			}
			this.anInt1502 = arg0.method2933();
			if (this.anInt1502 == 65535) {
				this.anInt1502 = -1;
			}
			local16 = arg0.method2962();
			this.anIntArray177 = new int[local16 + 1];
			for (local35 = 0; local35 <= local16; local35++) {
				this.anIntArray177[local35] = arg0.method2933();
				if (this.anIntArray177[local35] == 65535) {
					this.anIntArray177[local35] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1519 = arg0.method2933();
			this.anInt1514 = arg0.method2962();
		} else if (arg1 == 79) {
			this.anInt1493 = arg0.method2933();
			this.anInt1507 = arg0.method2933();
			this.anInt1514 = arg0.method2962();
			local16 = arg0.method2962();
			this.anIntArray178 = new int[local16];
			for (local35 = 0; local35 < local16; local35++) {
				this.anIntArray178[local35] = arg0.method2933();
			}
		} else if (arg1 == 81) {
			this.anInt1487 = arg0.method2962() * 256;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
	public void method1204() {
		if (this.anInt1501 == -1) {
			this.anInt1501 = 0;
			if (this.anIntArray175 != null && (this.anIntArray176 == null || this.anIntArray176[0] == 10)) {
				this.anInt1501 = 1;
			}
			for (@Pc(35) int local35 = 0; local35 < 5; local35++) {
				if (this.aClass49Array10[local35] != null) {
					this.anInt1501 = 1;
				}
			}
		}
		if (this.anInt1483 == -1) {
			this.anInt1483 = this.anInt1490 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!ja;)V")
	public void method1205(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2962();
			if (local8 == 0) {
				return;
			}
			this.method1203(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!bi;IIIIIII[[I)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method1206(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[][] arg7) {
		@Pc(29) long local29;
		if (this.anIntArray176 == null) {
			local29 = (this.anInt1495 << 10) + arg5;
		} else {
			local29 = (this.anInt1495 << 10) - (-(arg1 << 3) - arg5);
		}
		@Pc(45) Class2_Sub2_Sub3_Sub4 local45 = (Class2_Sub2_Sub3_Sub4) Static185.aClass74_95.method2345(local29);
		if (local45 == null) {
			@Pc(53) Class2_Sub2_Sub3_Sub6 local53 = this.method1200(arg5, arg1);
			if (local53 == null) {
				return null;
			}
			local45 = local53.method2027(this.anInt1518 + 64, 768 - -(this.anInt1505 * 5), -50, -10, -50, true);
			Static185.aClass74_95.method2341(local29, local45);
		}
		if (arg0 == null && this.anInt1487 == -1) {
			return local45;
		}
		if (arg0 == null) {
			local45 = local45.method1041(true);
		} else {
			local45 = arg0.method367(arg3, local45, arg5);
		}
		if (this.anInt1487 >= 0) {
			local45 = local45.method1057(arg7, arg2, arg6, arg4, false, this.anInt1487);
		}
		return local45;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)Z")
	public boolean method1208() {
		if (this.anIntArray175 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray175.length; local14++) {
			local12 &= Static155.aClass11_123.method2063(0, this.anIntArray175[local14] & 0xFFFF);
		}
		return local12;
	}
}
