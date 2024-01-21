import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class6_Sub3_Sub10 extends Class6_Sub3 {

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
	public int anInt1674;

	@OriginalMember(owner = "client!j", name = "ob", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!j", name = "Eb", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!j", name = "Xb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!j", name = "bc", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!j", name = "hc", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!j", name = "db", descriptor = "Lclient!rd;")
	public Class63 aClass63_882 = Static24.aClass63_490;

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
	private int anInt1668 = 0;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
	private int anInt1667 = 0;

	@OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
	public int anInt1682 = -1;

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
	public int anInt1675 = -1;

	@OriginalMember(owner = "client!j", name = "qb", descriptor = "I")
	public int anInt1681 = -1;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
	public int anInt1670 = -1;

	@OriginalMember(owner = "client!j", name = "Bb", descriptor = "Z")
	public boolean aBoolean84 = true;

	@OriginalMember(owner = "client!j", name = "Hb", descriptor = "I")
	private int anInt1691 = -1;

	@OriginalMember(owner = "client!j", name = "Rb", descriptor = "I")
	public int anInt1695 = -1;

	@OriginalMember(owner = "client!j", name = "Ab", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!j", name = "Fb", descriptor = "I")
	private int anInt1689 = 128;

	@OriginalMember(owner = "client!j", name = "yb", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!j", name = "Jb", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!j", name = "sb", descriptor = "I")
	public int anInt1683 = 1;

	@OriginalMember(owner = "client!j", name = "Ib", descriptor = "[Lclient!rd;")
	public final Class63[] aClass63Array15 = new Class63[5];

	@OriginalMember(owner = "client!j", name = "vb", descriptor = "I")
	private int anInt1684 = 0;

	@OriginalMember(owner = "client!j", name = "Qb", descriptor = "I")
	public int anInt1694 = 0;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
	public int anInt1672 = 1;

	@OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
	private int anInt1679 = 128;

	@OriginalMember(owner = "client!j", name = "Nb", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
	public int anInt1669 = 16;

	@OriginalMember(owner = "client!j", name = "Mb", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!j", name = "zb", descriptor = "I")
	public int anInt1686 = 0;

	@OriginalMember(owner = "client!j", name = "Wb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!j", name = "ac", descriptor = "I")
	public int anInt1700 = 0;

	@OriginalMember(owner = "client!j", name = "dc", descriptor = "I")
	private int anInt1702 = 128;

	@OriginalMember(owner = "client!j", name = "Tb", descriptor = "I")
	public int anInt1696 = -1;

	@OriginalMember(owner = "client!j", name = "Pb", descriptor = "Z")
	public boolean aBoolean88 = true;

	@OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
	private int anInt1680 = 0;

	@OriginalMember(owner = "client!j", name = "fc", descriptor = "I")
	private int anInt1704 = 0;

	@OriginalMember(owner = "client!j", name = "cc", descriptor = "I")
	public int anInt1701 = 0;

	@OriginalMember(owner = "client!j", name = "jc", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!j", name = "ic", descriptor = "I")
	private int anInt1706 = -1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method1113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10;
		if (this.anIntArray184 == null) {
			local10 = arg5 + (this.anInt1674 << 10);
		} else {
			local10 = arg5 + (arg4 << 3) + (this.anInt1674 << 10);
		}
		@Pc(34) Class6_Sub3_Sub1_Sub3 local34 = (Class6_Sub3_Sub1_Sub3) Static1.aClass49_1.method1397(local10);
		if (local34 == null) {
			@Pc(47) Class6_Sub3_Sub1_Sub1 local47 = this.method1121(arg4, arg5);
			if (local47 == null) {
				return null;
			}
			local34 = local47.method211(this.anInt1680 + 64, this.anInt1667 * 5 + 768, -50, -10, -50);
			Static1.aClass49_1.method1396(local10, local34);
		}
		if (this.aBoolean91) {
			local34 = local34.method631(arg2, arg0, arg1, arg3, true);
		}
		return local34;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!bf;IB)V")
	private void method1115(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(24) int local24;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local24 = arg0.method1321();
			if (local24 > 0) {
				if (this.anIntArray183 == null || Static94.aBoolean140) {
					this.anIntArray184 = new int[local24];
					this.anIntArray183 = new int[local24];
					for (local43 = 0; local43 < local24; local43++) {
						this.anIntArray183[local43] = arg0.method1306();
						this.anIntArray184[local43] = arg0.method1321();
					}
				} else {
					arg0.anInt1949 += local24 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass63_882 = arg0.method1339();
		} else if (arg1 == 5) {
			local24 = arg0.method1321();
			if (local24 > 0) {
				if (this.anIntArray183 != null && !Static94.aBoolean140) {
					arg0.anInt1949 += local24 * 2;
					return;
				}
				this.anIntArray184 = null;
				this.anIntArray183 = new int[local24];
				for (local43 = 0; local43 < local24; local43++) {
					this.anIntArray183[local43] = arg0.method1306();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt1672 = arg0.method1321();
			return;
		} else if (arg1 == 15) {
			this.anInt1683 = arg0.method1321();
			return;
		} else if (arg1 == 17) {
			this.aBoolean83 = false;
			this.aBoolean88 = false;
			return;
		} else if (arg1 == 18) {
			this.aBoolean88 = false;
		} else if (arg1 == 19) {
			this.anInt1682 = arg0.method1321();
			return;
		} else if (arg1 == 21) {
			this.aBoolean91 = true;
			return;
		} else {
			if (arg1 == 22) {
				this.aBoolean87 = true;
			} else if (arg1 == 23) {
				this.aBoolean82 = true;
				return;
			} else if (arg1 == 24) {
				this.anInt1681 = arg0.method1306();
				if (this.anInt1681 == 65535) {
					this.anInt1681 = -1;
					return;
				}
				return;
			} else if (arg1 == 28) {
				this.anInt1669 = arg0.method1321();
				return;
			} else if (arg1 == 29) {
				this.anInt1680 = arg0.method1297();
				return;
			} else if (arg1 == 39) {
				this.anInt1667 = arg0.method1297() * 5;
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass63Array15[arg1 - 30] = arg0.method1339();
				if (this.aClass63Array15[arg1 - 30].method1822(Static58.aClass63_907)) {
					this.aClass63Array15[arg1 - 30] = null;
					return;
				}
			} else if (arg1 == 40) {
				local24 = arg0.method1321();
				this.aShortArray9 = new short[local24];
				this.aShortArray8 = new short[local24];
				for (local43 = 0; local43 < local24; local43++) {
					this.aShortArray9[local43] = (short) arg0.method1306();
					this.aShortArray8[local43] = (short) arg0.method1306();
				}
				return;
			} else if (arg1 == 60) {
				this.anInt1670 = arg0.method1306();
				return;
			} else if (arg1 == 62) {
				this.aBoolean85 = true;
				return;
			} else if (arg1 == 64) {
				this.aBoolean84 = false;
				return;
			} else if (arg1 == 65) {
				this.anInt1702 = arg0.method1306();
				return;
			} else if (arg1 == 66) {
				this.anInt1689 = arg0.method1306();
				return;
			} else if (arg1 == 67) {
				this.anInt1679 = arg0.method1306();
				return;
			} else if (arg1 == 68) {
				this.anInt1695 = arg0.method1306();
				return;
			} else if (arg1 == 69) {
				this.anInt1686 = arg0.method1321();
				return;
			} else if (arg1 == 70) {
				this.anInt1668 = arg0.method1323();
				return;
			} else if (arg1 == 71) {
				this.anInt1684 = arg0.method1323();
				return;
			} else if (arg1 == 72) {
				this.anInt1704 = arg0.method1323();
				return;
			} else if (arg1 == 73) {
				this.aBoolean86 = true;
				return;
			} else if (arg1 == 74) {
				this.aBoolean90 = true;
				return;
			} else {
				if (arg1 == 75) {
					this.anInt1696 = arg0.method1321();
				} else if (arg1 == 77) {
					this.anInt1706 = arg0.method1306();
					if (this.anInt1706 == 65535) {
						this.anInt1706 = -1;
					}
					this.anInt1691 = arg0.method1306();
					if (this.anInt1691 == 65535) {
						this.anInt1691 = -1;
					}
					local24 = arg0.method1321();
					this.anIntArray185 = new int[local24 + 1];
					for (local43 = 0; local43 <= local24; local43++) {
						this.anIntArray185[local43] = arg0.method1306();
						if (this.anIntArray185[local43] == 65535) {
							this.anIntArray185[local43] = -1;
						}
					}
					return;
				} else if (arg1 == 78) {
					this.anInt1675 = arg0.method1306();
					this.anInt1701 = arg0.method1321();
					return;
				} else if (arg1 == 79) {
					this.anInt1700 = arg0.method1306();
					this.anInt1694 = arg0.method1306();
					this.anInt1701 = arg0.method1321();
					local24 = arg0.method1321();
					this.anIntArray182 = new int[local24];
					for (local43 = 0; local43 < local24; local43++) {
						this.anIntArray182[local43] = arg0.method1306();
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)Z")
	public boolean method1116() {
		if (this.anIntArray185 == null) {
			return this.anInt1675 != -1 || this.anIntArray182 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray185.length; local21++) {
			if (this.anIntArray185[local21] != -1) {
				@Pc(36) Class6_Sub3_Sub10 local36 = Static123.method2172(this.anIntArray185[local21]);
				if (local36.anInt1675 != -1 || local36.anIntArray182 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)Lclient!id;")
	public Class6_Sub3_Sub1 method1117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(21) long local21;
		if (this.anIntArray184 == null) {
			local21 = (this.anInt1674 << 10) + arg0;
		} else {
			local21 = arg0 + (this.anInt1674 << 10) + (arg3 << 3);
		}
		@Pc(37) Class6_Sub3_Sub1 local37 = (Class6_Sub3_Sub1) Static90.aClass49_24.method1397(local21);
		if (local37 == null) {
			@Pc(45) Class6_Sub3_Sub1_Sub1 local45 = this.method1121(arg3, arg0);
			if (local45 == null) {
				return null;
			}
			if (this.aBoolean87) {
				local45.aShort2 = (short) (this.anInt1680 + 64);
				local45.aShort1 = (short) (this.anInt1667 * 5 + 768);
				local37 = local45;
				local45.method214();
			} else {
				local37 = local45.method211(this.anInt1680 + 64, this.anInt1667 * 5 + 768, -50, -10, -50);
			}
			Static90.aClass49_24.method1396(local21, local37);
		}
		if (this.aBoolean87) {
			local37 = ((Class6_Sub3_Sub1_Sub1) local37).method221();
		}
		if (this.aBoolean91) {
			if (local37 instanceof Class6_Sub3_Sub1_Sub3) {
				local37 = ((Class6_Sub3_Sub1_Sub3) local37).method631(arg4, arg1, arg5, arg2, true);
			} else if (local37 instanceof Class6_Sub3_Sub1_Sub1) {
				local37 = ((Class6_Sub3_Sub1_Sub1) local37).method217(arg4, arg1, arg5, arg2);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!bf;)V")
	public void method1118(@OriginalArg(1) Class6_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1321();
			if (local5 == 0) {
				return;
			}
			this.method1115(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
	public void method1119() {
		if (this.anInt1682 == -1) {
			this.anInt1682 = 0;
			if (this.anIntArray183 != null && (this.anIntArray184 == null || this.anIntArray184[0] == 10)) {
				this.anInt1682 = 1;
			}
			for (@Pc(29) int local29 = 0; local29 < 5; local29++) {
				if (this.aClass63Array15[local29] != null) {
					this.anInt1682 = 1;
				}
			}
		}
		if (this.anInt1696 == -1) {
			this.anInt1696 = this.aBoolean83 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
	public boolean method1120(@OriginalArg(1) int arg0) {
		if (this.anIntArray184 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray184.length; local15++) {
				if (arg0 == this.anIntArray184[local15]) {
					return Static90.aClass7_50.method109(this.anIntArray183[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray183 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray183.length; local64++) {
				local62 &= Static90.aClass7_50.method109(this.anIntArray183[local64] & 0xFFFF, 0);
			}
			return local62;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZ)Lclient!bc;")
	private Class6_Sub3_Sub1_Sub1 method1121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class6_Sub3_Sub1_Sub1 local7 = null;
		@Pc(14) int local14;
		@Pc(58) int local58;
		@Pc(117) boolean local117;
		@Pc(129) int local129;
		if (this.anIntArray184 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray183 == null) {
				return null;
			}
			local117 = this.aBoolean85 ^ arg1 > 3;
			local14 = this.anIntArray183.length;
			for (local58 = 0; local58 < local14; local58++) {
				local129 = this.anIntArray183[local58];
				if (local117) {
					local129 += 65536;
				}
				local7 = (Class6_Sub3_Sub1_Sub1) Static58.aClass49_18.method1397((long) local129);
				if (local7 == null) {
					local7 = Static9.method212(Static90.aClass7_50, local129 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local117) {
						local7.method213();
					}
					Static58.aClass49_18.method1396((long) local129, local7);
				}
				if (local14 > 1) {
					Static111.aClass6_Sub3_Sub1_Sub1Array1[local58] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class6_Sub3_Sub1_Sub1(Static111.aClass6_Sub3_Sub1_Sub1Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray184.length; local14++) {
				if (this.anIntArray184[local14] == arg0) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			@Pc(53) boolean local53 = this.aBoolean85 ^ arg1 > 3;
			local58 = this.anIntArray183[local12];
			if (local53) {
				local58 += 65536;
			}
			local7 = (Class6_Sub3_Sub1_Sub1) Static58.aClass49_18.method1397((long) local58);
			if (local7 == null) {
				local7 = Static9.method212(Static90.aClass7_50, local58 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local53) {
					local7.method213();
				}
				Static58.aClass49_18.method1396((long) local58, local7);
			}
		}
		if (this.anInt1702 == 128 && this.anInt1689 == 128 && this.anInt1679 == 128) {
			local117 = false;
		} else {
			local117 = true;
		}
		@Pc(222) boolean local222;
		if (this.anInt1668 == 0 && this.anInt1684 == 0 && this.anInt1704 == 0) {
			local222 = false;
		} else {
			local222 = true;
		}
		@Pc(247) Class6_Sub3_Sub1_Sub1 local247 = new Class6_Sub3_Sub1_Sub1(local7, arg1 == 0 && !local117 && !local222, this.aShortArray9 == null, true);
		@Pc(259) int local259 = arg1 & 0x3;
		if (local259 == 1) {
			local247.method225();
		} else if (local259 == 2) {
			local247.method219();
		} else if (local259 == 3) {
			local247.method220();
		}
		if (this.aShortArray9 != null) {
			for (local129 = 0; local129 < this.aShortArray9.length; local129++) {
				local247.method229(this.aShortArray9[local129], this.aShortArray8[local129]);
			}
		}
		if (local117) {
			local247.method224(this.anInt1702, this.anInt1689, this.anInt1679);
		}
		if (local222) {
			local247.method223(this.anInt1668, this.anInt1684, this.anInt1704);
		}
		return local247;
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "(I)Z")
	public boolean method1122() {
		if (this.anIntArray183 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray183.length; local21++) {
			local19 &= Static90.aClass7_50.method109(this.anIntArray183[local21] & 0xFFFF, 0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "(I)Lclient!j;")
	public Class6_Sub3_Sub10 method1123() {
		@Pc(1) int local1 = -1;
		if (this.anInt1706 != -1) {
			local1 = Static89.method1599(this.anInt1706);
		} else if (this.anInt1691 != -1) {
			local1 = Static89.anIntArray283[this.anInt1691];
		}
		return local1 < 0 || local1 >= this.anIntArray185.length || this.anIntArray185[local1] == -1 ? null : Static123.method2172(this.anIntArray185[local1]);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!gd;IBIIIIII)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method1125(@OriginalArg(0) Class6_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) long local21;
		if (this.anIntArray184 == null) {
			local21 = (this.anInt1674 << 10) + arg3;
		} else {
			local21 = (this.anInt1674 << 10) + (arg5 << 3) + arg3;
		}
		@Pc(37) Class6_Sub3_Sub1_Sub3 local37 = (Class6_Sub3_Sub1_Sub3) Static1.aClass49_1.method1397(local21);
		if (local37 == null) {
			@Pc(45) Class6_Sub3_Sub1_Sub1 local45 = this.method1121(arg5, arg3);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method211(this.anInt1680 + 64, 768 - -(this.anInt1667 * 5), -50, -10, -50);
			Static1.aClass49_1.method1396(local21, local37);
		}
		if (arg0 == null && !this.aBoolean91) {
			return local37;
		}
		if (arg0 == null) {
			local37 = local37.method626(true);
		} else {
			local37 = arg0.method928(local37, arg3, arg4);
		}
		if (this.aBoolean91) {
			local37.method631(arg6, arg7, arg2, arg1, false);
		}
		return local37;
	}
}
