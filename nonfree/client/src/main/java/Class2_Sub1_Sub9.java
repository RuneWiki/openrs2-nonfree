import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	public int anInt1653;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!fc", name = "bb", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!fc", name = "nb", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!fc", name = "Db", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!fc", name = "Ob", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	public int anInt1651 = -1;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	public int anInt1649 = -1;

	@OriginalMember(owner = "client!fc", name = "eb", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
	private int anInt1660 = 0;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
	private int anInt1654 = -1;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	private int anInt1656 = 128;

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
	private int anInt1658 = 128;

	@OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
	private int anInt1662 = 128;

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "Z")
	public boolean aBoolean63 = true;

	@OriginalMember(owner = "client!fc", name = "lb", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	private int anInt1648 = -1;

	@OriginalMember(owner = "client!fc", name = "qb", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!fc", name = "yb", descriptor = "I")
	public int anInt1677 = 0;

	@OriginalMember(owner = "client!fc", name = "rb", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!fc", name = "vb", descriptor = "I")
	private int anInt1675 = 0;

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
	public int anInt1667 = -1;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "Lclient!ob;")
	public Class60 aClass60_381 = Static122.aClass60_935;

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
	private int anInt1678 = -1;

	@OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
	public int anInt1664 = 16;

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
	public int anInt1676 = 0;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!fc", name = "Gb", descriptor = "I")
	public int anInt1683 = 1;

	@OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
	public int anInt1669 = -1;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
	public int anInt1672 = 0;

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
	public int anInt1674 = 2;

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
	private int anInt1657 = 0;

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "[Lclient!ob;")
	public final Class60[] aClass60Array10 = new Class60[5];

	@OriginalMember(owner = "client!fc", name = "Bb", descriptor = "I")
	public int anInt1680 = 0;

	@OriginalMember(owner = "client!fc", name = "Fb", descriptor = "I")
	private int anInt1682 = 0;

	@OriginalMember(owner = "client!fc", name = "Kb", descriptor = "I")
	public int anInt1686 = -1;

	@OriginalMember(owner = "client!fc", name = "Rb", descriptor = "I")
	private int anInt1692 = 0;

	@OriginalMember(owner = "client!fc", name = "Mb", descriptor = "I")
	public int anInt1688 = 1;

	@OriginalMember(owner = "client!fc", name = "Ib", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!fc", name = "Hb", descriptor = "I")
	public int anInt1684 = -1;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)Z")
	public boolean method1250() {
		if (this.anIntArray164 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray164.length; local20++) {
			local12 &= Static107.aClass13_22.method538(this.anIntArray164[local20] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!og;)V")
	private void method1251(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 1) {
			local16 = arg1.method218();
			if (local16 > 0) {
				if (this.anIntArray164 != null && !Static171.aBoolean165) {
					arg1.anInt273 += local16 * 3;
					return;
				}
				this.anIntArray163 = new int[local16];
				this.anIntArray164 = new int[local16];
				for (local45 = 0; local45 < local16; local45++) {
					this.anIntArray164[local45] = arg1.method234();
					this.anIntArray163[local45] = arg1.method218();
				}
				return;
			}
		} else if (arg0 == 2) {
			this.aClass60_381 = arg1.method240();
			return;
		} else if (arg0 == 5) {
			local16 = arg1.method218();
			if (local16 <= 0) {
				return;
			}
			if (this.anIntArray164 == null || Static171.aBoolean165) {
				this.anIntArray164 = new int[local16];
				this.anIntArray163 = null;
				for (local45 = 0; local45 < local16; local45++) {
					this.anIntArray164[local45] = arg1.method234();
				}
				return;
			}
			arg1.anInt273 += local16 * 2;
		} else if (arg0 == 14) {
			this.anInt1688 = arg1.method218();
			return;
		} else if (arg0 == 15) {
			this.anInt1683 = arg1.method218();
			return;
		} else if (arg0 == 17) {
			this.anInt1674 = 0;
			this.aBoolean63 = false;
			return;
		} else if (arg0 == 18) {
			this.aBoolean63 = false;
			return;
		} else if (arg0 == 19) {
			this.anInt1669 = arg1.method218();
			return;
		} else if (arg0 == 21) {
			this.anInt1654 = 0;
			return;
		} else if (arg0 == 22) {
			this.aBoolean62 = true;
			return;
		} else {
			if (arg0 == 23) {
				this.aBoolean67 = true;
			} else if (arg0 == 24) {
				this.anInt1667 = arg1.method234();
				if (this.anInt1667 == 65535) {
					this.anInt1667 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.anInt1674 = 1;
				return;
			} else if (arg0 == 28) {
				this.anInt1664 = arg1.method218();
				return;
			} else if (arg0 == 29) {
				this.anInt1692 = arg1.method227();
				return;
			} else if (arg0 == 39) {
				this.anInt1660 = arg1.method227() * 5;
				return;
			} else {
				if (arg0 >= 30 && arg0 < 35) {
					this.aClass60Array10[arg0 - 30] = arg1.method240();
					if (this.aClass60Array10[arg0 - 30].method2698(Static161.aClass60_1093)) {
						this.aClass60Array10[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					local16 = arg1.method218();
					this.aShortArray33 = new short[local16];
					this.aShortArray31 = new short[local16];
					for (local45 = 0; local45 < local16; local45++) {
						this.aShortArray31[local45] = (short) arg1.method234();
						this.aShortArray33[local45] = (short) arg1.method234();
					}
					return;
				} else if (arg0 == 41) {
					local16 = arg1.method218();
					this.aShortArray34 = new short[local16];
					this.aShortArray32 = new short[local16];
					for (local45 = 0; local45 < local16; local45++) {
						this.aShortArray34[local45] = (short) arg1.method234();
						this.aShortArray32[local45] = (short) arg1.method234();
					}
					return;
				} else if (arg0 == 60) {
					this.anInt1686 = arg1.method234();
					return;
				} else if (arg0 == 62) {
					this.aBoolean61 = true;
					return;
				} else if (arg0 == 64) {
					this.aBoolean65 = false;
				} else if (arg0 == 65) {
					this.anInt1656 = arg1.method234();
					return;
				} else if (arg0 == 66) {
					this.anInt1662 = arg1.method234();
					return;
				} else if (arg0 == 67) {
					this.anInt1658 = arg1.method234();
					return;
				} else if (arg0 == 68) {
					this.anInt1649 = arg1.method234();
					return;
				} else if (arg0 == 69) {
					this.anInt1677 = arg1.method218();
					return;
				} else if (arg0 == 70) {
					this.anInt1657 = arg1.method219();
					return;
				} else if (arg0 == 71) {
					this.anInt1682 = arg1.method219();
					return;
				} else if (arg0 == 72) {
					this.anInt1675 = arg1.method219();
					return;
				} else if (arg0 == 73) {
					this.aBoolean68 = true;
					return;
				} else if (arg0 == 74) {
					this.aBoolean64 = true;
					return;
				} else if (arg0 == 75) {
					this.anInt1651 = arg1.method218();
					return;
				} else if (arg0 == 77) {
					this.anInt1648 = arg1.method234();
					if (this.anInt1648 == 65535) {
						this.anInt1648 = -1;
					}
					this.anInt1678 = arg1.method234();
					if (this.anInt1678 == 65535) {
						this.anInt1678 = -1;
					}
					local16 = arg1.method218();
					this.anIntArray162 = new int[local16 + 1];
					for (local45 = 0; local45 <= local16; local45++) {
						this.anIntArray162[local45] = arg1.method234();
						if (this.anIntArray162[local45] == 65535) {
							this.anIntArray162[local45] = -1;
						}
					}
					return;
				} else if (arg0 == 78) {
					this.anInt1684 = arg1.method234();
					this.anInt1676 = arg1.method218();
					return;
				} else if (arg0 == 79) {
					this.anInt1680 = arg1.method234();
					this.anInt1672 = arg1.method234();
					this.anInt1676 = arg1.method218();
					local16 = arg1.method218();
					this.anIntArray165 = new int[local16];
					for (local45 = 0; local45 < local16; local45++) {
						this.anIntArray165[local45] = arg1.method234();
					}
					return;
				} else {
					if (arg0 == 81) {
						this.anInt1654 = arg1.method218() * 256;
					} else if (arg0 != 82) {
						if (arg0 != 83) {
							if (arg0 == 84) {
								arg1.method219();
								return;
							}
							if (arg0 == 85) {
								arg1.method219();
								return;
							}
							if (arg0 == 86) {
								arg1.method219();
							} else if (arg0 == 87) {
								arg1.method234();
								return;
							} else if (arg0 != 88) {
								if (arg0 == 89) {
									this.aBoolean66 = false;
									return;
								}
								if (arg0 == 90) {
									this.aBoolean60 = true;
									return;
								}
							}
							return;
						}
						arg1.method218();
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	public void method1252() {
		if (this.anInt1669 == -1) {
			this.anInt1669 = 0;
			if (this.anIntArray164 != null && (this.anIntArray163 == null || this.anIntArray163[0] == 10)) {
				this.anInt1669 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass60Array10[local28] != null) {
					this.anInt1669 = 1;
				}
			}
		}
		if (this.anInt1651 == -1) {
			this.anInt1651 = this.anInt1674 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!og;)V")
	public void method1253(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method218();
			if (local3 == 0) {
				return;
			}
			this.method1251(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(III)Lclient!cb;")
	private Class2_Sub1_Sub1_Sub1 method1257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub1_Sub1_Sub1 local7 = null;
		@Pc(10) boolean local10 = this.aBoolean61;
		if (arg1 == 2 && arg0 > 3) {
			local10 = !local10;
		}
		@Pc(41) int local41;
		@Pc(43) int local43;
		@Pc(49) int local49;
		if (this.anIntArray163 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray164 == null) {
				return null;
			}
			local41 = this.anIntArray164.length;
			for (local43 = 0; local43 < local41; local43++) {
				local49 = this.anIntArray164[local43];
				if (local10) {
					local49 += 65536;
				}
				local7 = (Class2_Sub1_Sub1_Sub1) Static84.aClass89_27.method3437((long) local49);
				if (local7 == null) {
					local7 = Static23.method578(Static107.aClass13_22, local49 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local10) {
						local7.method586();
					}
					Static84.aClass89_27.method3432(local7, (long) local49);
				}
				if (local41 > 1) {
					Static151.aClass2_Sub1_Sub1_Sub1Array2[local43] = local7;
				}
			}
			if (local41 > 1) {
				local7 = new Class2_Sub1_Sub1_Sub1(Static151.aClass2_Sub1_Sub1_Sub1Array2, local41);
			}
		} else {
			local41 = -1;
			for (local43 = 0; local43 < this.anIntArray163.length; local43++) {
				if (this.anIntArray163[local43] == arg1) {
					local41 = local43;
					break;
				}
			}
			if (local41 == -1) {
				return null;
			}
			local49 = this.anIntArray164[local41];
			if (local10) {
				local49 += 65536;
			}
			local7 = (Class2_Sub1_Sub1_Sub1) Static84.aClass89_27.method3437((long) local49);
			if (local7 == null) {
				local7 = Static23.method578(Static107.aClass13_22, local49 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local10) {
					local7.method586();
				}
				Static84.aClass89_27.method3432(local7, (long) local49);
			}
		}
		@Pc(210) boolean local210;
		if (this.anInt1656 == 128 && this.anInt1662 == 128 && this.anInt1658 == 128) {
			local210 = false;
		} else {
			local210 = true;
		}
		@Pc(228) boolean local228;
		if (this.anInt1657 == 0 && this.anInt1682 == 0 && this.anInt1675 == 0) {
			local228 = false;
		} else {
			local228 = true;
		}
		@Pc(259) Class2_Sub1_Sub1_Sub1 local259 = new Class2_Sub1_Sub1_Sub1(local7, arg0 == 0 && !local210 && !local228, this.aShortArray31 == null, this.aShortArray34 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local259.method574();
			local259.method582(45, 0, -45);
		}
		@Pc(279) int local279 = arg0 & 0x3;
		if (local279 == 1) {
			local259.method577();
		} else if (local279 == 2) {
			local259.method592();
		} else if (local279 == 3) {
			local259.method583();
		}
		@Pc(309) int local309;
		if (this.aShortArray31 != null) {
			for (local309 = 0; local309 < this.aShortArray31.length; local309++) {
				local259.method588(this.aShortArray31[local309], this.aShortArray33[local309]);
			}
		}
		if (this.aShortArray34 != null) {
			for (local309 = 0; local309 < this.aShortArray34.length; local309++) {
				local259.method576(this.aShortArray34[local309], this.aShortArray32[local309]);
			}
		}
		if (local210) {
			local259.method593(this.anInt1656, this.anInt1662, this.anInt1658);
		}
		if (local228) {
			local259.method582(this.anInt1657, this.anInt1682, this.anInt1675);
		}
		return local259;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)Z")
	public boolean method1258() {
		if (this.anIntArray162 == null) {
			return this.anInt1684 != -1 || this.anIntArray165 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray162.length; local27++) {
			if (this.anIntArray162[local27] != -1) {
				@Pc(42) Class2_Sub1_Sub9 local42 = Static158.method3037(this.anIntArray162[local27]);
				if (local42.anInt1684 != -1 || local42.anIntArray165 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[[IIIBLclient!ce;)Lclient!qb;")
	public Class2_Sub1_Sub16 method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class2_Sub1_Sub5 arg7) {
		@Pc(19) long local19;
		if (this.anIntArray163 == null) {
			local19 = arg1 + (this.anInt1653 << 10);
		} else {
			local19 = (this.anInt1653 << 10) + ((arg6 << 3) + arg1);
		}
		@Pc(40) Class2_Sub1_Sub1_Sub4_Sub1 local40 = (Class2_Sub1_Sub1_Sub4_Sub1) Static41.aClass89_13.method3437(local19);
		if (local40 == null) {
			@Pc(48) Class2_Sub1_Sub1_Sub1 local48 = this.method1257(arg1, arg6);
			if (local48 == null) {
				return null;
			}
			local40 = new Class2_Sub1_Sub1_Sub4_Sub1(local48, this.anInt1692 + 64, 768 - -(this.anInt1660 * 5), -50, -10, -50);
			Static41.aClass89_13.method3432(local40, local19);
		}
		if (arg7 != null) {
			local40 = (Class2_Sub1_Sub1_Sub4_Sub1) arg7.method638(arg1, arg2, local40);
		}
		if (this.anInt1654 >= 0) {
			if (arg7 == null) {
				local40 = (Class2_Sub1_Sub1_Sub4_Sub1) local40.method1615(true);
			}
			local40 = local40.method1627(arg4, arg3, arg5, arg0, false, this.anInt1654);
		}
		Static75.aClass2_Sub1_Sub16_1.aClass2_Sub1_Sub1_8 = local40;
		return Static75.aClass2_Sub1_Sub16_1;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Z")
	public boolean method1260(@OriginalArg(1) int arg0) {
		if (this.anIntArray163 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray163.length; local16++) {
				if (arg0 == this.anIntArray163[local16]) {
					return Static107.aClass13_22.method538(this.anIntArray164[local16] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray164 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray164.length; local59++) {
				local57 &= Static107.aClass13_22.method538(this.anIntArray164[local59] & 0xFFFF, 0);
			}
			return local57;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZIIII[[I)Lclient!qb;")
	public Class2_Sub1_Sub16 method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][] arg6) {
		@Pc(16) long local16;
		if (this.anIntArray163 == null) {
			local16 = (this.anInt1653 << 10) + arg3;
		} else {
			local16 = (this.anInt1653 << 10) + ((arg1 << 3) + arg3);
		}
		@Pc(38) boolean local38;
		if (arg2 && this.aBoolean62) {
			local38 = true;
			local16 |= Long.MIN_VALUE;
		} else {
			local38 = false;
		}
		@Pc(52) Class2_Sub1_Sub1 local52 = (Class2_Sub1_Sub1) Static65.aClass89_21.method3437(local16);
		if (local52 == null) {
			@Pc(60) Class2_Sub1_Sub1_Sub1 local60 = this.method1257(arg3, arg1);
			if (local60 == null) {
				Static75.aClass2_Sub1_Sub16_1.aClass2_Sub1_Sub1_8 = null;
				return Static75.aClass2_Sub1_Sub16_1;
			}
			local60.method591();
			if (local38) {
				local60.aShort6 = (short) (this.anInt1692 + 64);
				local52 = local60;
				local60.aShort8 = (short) (this.anInt1660 * 5 + 768);
				local60.method587();
			} else {
				local52 = new Class2_Sub1_Sub1_Sub4_Sub1(local60, this.anInt1692 + 64, this.anInt1660 * 5 + 768, -50, -10, -50);
			}
			Static65.aClass89_21.method3432(local52, local16);
		}
		if (local38) {
			local52 = ((Class2_Sub1_Sub1_Sub1) local52).method584();
		}
		if (this.anInt1654 >= 0) {
			if (local52 instanceof Class2_Sub1_Sub1_Sub4_Sub1) {
				local52 = ((Class2_Sub1_Sub1_Sub4_Sub1) local52).method1627(arg6, arg0, arg4, arg5, true, this.anInt1654);
			} else if (local52 instanceof Class2_Sub1_Sub1_Sub1) {
				local52 = ((Class2_Sub1_Sub1_Sub1) local52).method579(arg6, arg0, arg4, arg5, this.anInt1654);
			}
		}
		Static75.aClass2_Sub1_Sub16_1.aClass2_Sub1_Sub1_8 = local52;
		return Static75.aClass2_Sub1_Sub16_1;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)Lclient!fc;")
	public Class2_Sub1_Sub9 method1262() {
		@Pc(5) int local5 = -1;
		if (this.anInt1648 != -1) {
			local5 = Static7.method3570(this.anInt1648);
		} else if (this.anInt1678 != -1) {
			local5 = Static163.anIntArray447[this.anInt1678];
		}
		return local5 < 0 || local5 >= this.anIntArray162.length || this.anIntArray162[local5] == -1 ? null : Static158.method3037(this.anIntArray162[local5]);
	}
}
