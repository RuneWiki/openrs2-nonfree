import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!db", name = "K", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!db", name = "vb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!db", name = "Db", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!db", name = "Rb", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public int anInt732 = 2;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
	public int anInt738 = -1;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
	public int anInt739 = -1;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
	public int anInt733 = 0;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Lclient!od;")
	public Class60 aClass60_231 = Static105.aClass60_973;

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	private int anInt740 = -1;

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	public int anInt745 = -1;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
	private int anInt744 = 0;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	private int anInt741 = 128;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	public int anInt731 = 0;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
	private int anInt743 = -1;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
	private int anInt746 = 0;

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
	public int anInt758 = 0;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt730 = 0;

	@OriginalMember(owner = "client!db", name = "lb", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
	private int anInt752 = -1;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!db", name = "Jb", descriptor = "I")
	private int anInt761 = 0;

	@OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
	public int anInt762 = 0;

	@OriginalMember(owner = "client!db", name = "Hb", descriptor = "Z")
	public boolean aBoolean30 = true;

	@OriginalMember(owner = "client!db", name = "Fb", descriptor = "[Lclient!od;")
	public final Class60[] aClass60Array3 = new Class60[5];

	@OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
	public int anInt753 = -1;

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
	private int anInt751 = 128;

	@OriginalMember(owner = "client!db", name = "Qb", descriptor = "I")
	private int anInt765 = 0;

	@OriginalMember(owner = "client!db", name = "Pb", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!db", name = "Gb", descriptor = "I")
	public int anInt760 = 1;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	public int anInt736 = -1;

	@OriginalMember(owner = "client!db", name = "Ib", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
	public int anInt755 = -1;

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!db", name = "Nb", descriptor = "I")
	public int anInt764 = 16;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
	public int anInt750 = 1;

	@OriginalMember(owner = "client!db", name = "Lb", descriptor = "I")
	private int anInt763 = 128;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Lclient!pf;")
	private Class4_Sub3_Sub1_Sub5 method395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub3_Sub1_Sub5 local7 = null;
		@Pc(14) int local14;
		@Pc(51) int local51;
		@Pc(115) boolean local115;
		@Pc(141) int local141;
		if (this.anIntArray83 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray84 == null) {
				return null;
			}
			local115 = this.aBoolean33;
			if (arg1 == 2 && arg0 > 3) {
				local115 = !local115;
			}
			local14 = this.anIntArray84.length;
			for (local51 = 0; local51 < local14; local51++) {
				local141 = this.anIntArray84[local51];
				if (local115) {
					local141 += 65536;
				}
				local7 = (Class4_Sub3_Sub1_Sub5) Static109.aClass12_25.method289((long) local141);
				if (local7 == null) {
					local7 = Static89.method1445(Static3.aClass10_4, local141 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local115) {
						local7.method1437();
					}
					Static109.aClass12_25.method290(local7, (long) local141);
				}
				if (local14 > 1) {
					Static103.aClass4_Sub3_Sub1_Sub5Array1[local51] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class4_Sub3_Sub1_Sub5(Static103.aClass4_Sub3_Sub1_Sub5Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray83.length; local14++) {
				if (this.anIntArray83[local14] == arg1) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local51 = this.anIntArray84[local12];
			@Pc(63) boolean local63 = arg0 > 3 ^ this.aBoolean33;
			if (local63) {
				local51 += 65536;
			}
			local7 = (Class4_Sub3_Sub1_Sub5) Static109.aClass12_25.method289((long) local51);
			if (local7 == null) {
				local7 = Static89.method1445(Static3.aClass10_4, local51 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local63) {
					local7.method1437();
				}
				Static109.aClass12_25.method290(local7, (long) local51);
			}
		}
		@Pc(223) boolean local223;
		if (this.anInt730 == 0 && this.anInt761 == 0 && this.anInt744 == 0) {
			local223 = false;
		} else {
			local223 = true;
		}
		if (this.anInt751 == 128 && this.anInt741 == 128 && this.anInt763 == 128) {
			local115 = false;
		} else {
			local115 = true;
		}
		@Pc(279) Class4_Sub3_Sub1_Sub5 local279 = new Class4_Sub3_Sub1_Sub5(local7, arg0 == 0 && !local115 && !local223, this.aShortArray3 == null, this.aShortArray4 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local279.method1446();
			local279.method1438(45, 0, -45);
		}
		@Pc(316) int local316 = arg0 & 0x3;
		if (local316 == 1) {
			local279.method1436();
		} else if (local316 == 2) {
			local279.method1443();
		} else if (local316 == 3) {
			local279.method1452();
		}
		if (this.aShortArray3 != null) {
			for (local141 = 0; local141 < this.aShortArray3.length; local141++) {
				local279.method1433(this.aShortArray3[local141], this.aShortArray6[local141]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local141 = 0; local141 < this.aShortArray4.length; local141++) {
				local279.method1439(this.aShortArray4[local141], this.aShortArray5[local141]);
			}
		}
		if (local115) {
			local279.method1442(this.anInt751, this.anInt741, this.anInt763);
		}
		if (local223) {
			local279.method1438(this.anInt730, this.anInt761, this.anInt744);
		}
		return local279;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)Z")
	public boolean method396() {
		if (this.anIntArray84 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray84.length; local14++) {
			local12 &= Static3.aClass10_4.method1778(this.anIntArray84[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[[IIIBI)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11;
		if (this.anIntArray83 == null) {
			local11 = (this.anInt766 << 10) + arg5;
		} else {
			local11 = arg5 + (arg0 << 3) + (this.anInt766 << 10);
		}
		@Pc(35) Class4_Sub3_Sub1_Sub7 local35 = (Class4_Sub3_Sub1_Sub7) Static81.aClass12_17.method289(local11);
		if (local35 == null) {
			@Pc(43) Class4_Sub3_Sub1_Sub5 local43 = this.method395(arg5, arg0);
			if (local43 == null) {
				return null;
			}
			local35 = local43.method1444(this.anInt746 + 64, this.anInt765 * 5 + 768, -50, -10, -50);
			Static81.aClass12_17.method290(local35, local11);
		}
		if (this.anInt743 >= 0) {
			local35 = local35.method1506(arg2, arg3, arg1, arg4, true, this.anInt743);
		}
		return local35;
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public void method398() {
		if (this.anInt738 == -1) {
			this.anInt738 = 0;
			if (this.anIntArray84 != null && (this.anIntArray83 == null || this.anIntArray83[0] == 10)) {
				this.anInt738 = 1;
			}
			for (@Pc(40) int local40 = 0; local40 < 5; local40++) {
				if (this.aClass60Array3[local40] != null) {
					this.anInt738 = 1;
				}
			}
		}
		if (this.anInt745 == -1) {
			this.anInt745 = this.anInt732 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[[IIIB)Lclient!h;")
	public Class4_Sub3_Sub1 method399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(31) long local31;
		if (this.anIntArray83 == null) {
			local31 = arg0 + (this.anInt766 << 10);
		} else {
			local31 = (this.anInt766 << 10) + (arg5 << 3) + arg0;
		}
		@Pc(53) Class4_Sub3_Sub1 local53 = (Class4_Sub3_Sub1) Static102.aClass12_24.method289(local31);
		if (local53 == null) {
			@Pc(61) Class4_Sub3_Sub1_Sub5 local61 = this.method395(arg0, arg5);
			if (local61 == null) {
				return null;
			}
			if (this.aBoolean29) {
				local61.aShort1 = (short) (this.anInt746 + 64);
				local61.aShort2 = (short) (this.anInt765 * 5 + 768);
				local53 = local61;
				local61.method1453();
			} else {
				local53 = local61.method1444(this.anInt746 + 64, this.anInt765 * 5 + 768, -50, -10, -50);
			}
			Static102.aClass12_24.method290(local53, local31);
		}
		if (this.aBoolean29) {
			local53 = ((Class4_Sub3_Sub1_Sub5) local53).method1441();
		}
		if (this.anInt743 >= 0) {
			if (local53 instanceof Class4_Sub3_Sub1_Sub7) {
				local53 = ((Class4_Sub3_Sub1_Sub7) local53).method1506(arg3, arg2, arg1, arg4, true, this.anInt743);
			} else if (local53 instanceof Class4_Sub3_Sub1_Sub5) {
				local53 = ((Class4_Sub3_Sub1_Sub5) local53).method1434(arg3, arg2, arg1, arg4, this.anInt743);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)Z")
	public boolean method401(@OriginalArg(1) int arg0) {
		if (this.anIntArray83 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray83.length; local15++) {
				if (arg0 == this.anIntArray83[local15]) {
					return Static3.aClass10_4.method1778(this.anIntArray84[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray84 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(54) boolean local54 = true;
			for (@Pc(56) int local56 = 0; local56 < this.anIntArray84.length; local56++) {
				local54 &= Static3.aClass10_4.method1778(this.anIntArray84[local56] & 0xFFFF, 0);
			}
			return local54;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!db;")
	public Class4_Sub3_Sub3 method402() {
		@Pc(1) int local1 = -1;
		if (this.anInt740 != -1) {
			local1 = Static59.method973(this.anInt740);
		} else if (this.anInt752 != -1) {
			local1 = Static53.anIntArray141[this.anInt752];
		}
		return local1 < 0 || this.anIntArray81.length <= local1 || this.anIntArray81[local1] == -1 ? null : Static76.method1244(this.anIntArray81[local1]);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILclient!ne;IZI[[II)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3_Sub10 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7) {
		@Pc(20) long local20;
		if (this.anIntArray83 == null) {
			local20 = arg1 + (this.anInt766 << 10);
		} else {
			local20 = arg1 + (arg4 << 3) + (this.anInt766 << 10);
		}
		@Pc(36) Class4_Sub3_Sub1_Sub7 local36 = (Class4_Sub3_Sub1_Sub7) Static81.aClass12_17.method289(local20);
		if (local36 == null) {
			@Pc(44) Class4_Sub3_Sub1_Sub5 local44 = this.method395(arg1, arg4);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method1444(this.anInt746 + 64, 768 - -(this.anInt765 * 5), -50, -10, -50);
			Static81.aClass12_17.method290(local36, local20);
		}
		if (arg3 == null && this.anInt743 == -1) {
			return local36;
		}
		if (arg3 == null) {
			local36 = local36.method1500(true);
		} else {
			local36 = arg3.method1261(arg1, local36, arg0);
		}
		if (this.anInt743 >= 0) {
			local36 = local36.method1506(arg6, arg5, arg2, arg7, false, this.anInt743);
		}
		return local36;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!tf;)V")
	public void method405(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method773();
			if (local7 == 0) {
				return;
			}
			this.method406(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!tf;II)V")
	private void method406(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(28) int local28;
		if (arg1 == 1) {
			local8 = arg0.method773();
			if (local8 > 0) {
				if (this.anIntArray84 == null || Static24.aBoolean34) {
					this.anIntArray84 = new int[local8];
					this.anIntArray83 = new int[local8];
					for (local28 = 0; local28 < local8; local28++) {
						this.anIntArray84[local28] = arg0.method816();
						this.anIntArray83[local28] = arg0.method773();
					}
				} else {
					arg0.anInt1312 += local8 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass60_231 = arg0.method776();
		} else if (arg1 == 5) {
			local8 = arg0.method773();
			if (local8 > 0) {
				if (this.anIntArray84 == null || Static24.aBoolean34) {
					this.anIntArray84 = new int[local8];
					this.anIntArray83 = null;
					for (local28 = 0; local28 < local8; local28++) {
						this.anIntArray84[local28] = arg0.method816();
					}
				} else {
					arg0.anInt1312 += local8 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt760 = arg0.method773();
		} else if (arg1 == 15) {
			this.anInt750 = arg0.method773();
		} else if (arg1 == 17) {
			this.aBoolean28 = false;
			this.anInt732 = 0;
		} else if (arg1 == 18) {
			this.aBoolean28 = false;
		} else if (arg1 == 19) {
			this.anInt738 = arg0.method773();
		} else if (arg1 == 21) {
			this.anInt743 = 0;
		} else if (arg1 == 22) {
			this.aBoolean29 = true;
		} else if (arg1 == 23) {
			this.aBoolean27 = true;
		} else if (arg1 == 24) {
			this.anInt753 = arg0.method816();
			if (this.anInt753 == 65535) {
				this.anInt753 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt732 = 1;
		} else if (arg1 == 28) {
			this.anInt764 = arg0.method773();
		} else if (arg1 == 29) {
			this.anInt746 = arg0.method797();
		} else if (arg1 == 39) {
			this.anInt765 = arg0.method797() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass60Array3[arg1 - 30] = arg0.method776();
			if (this.aClass60Array3[arg1 - 30].method1318(Static98.aClass60_929)) {
				this.aClass60Array3[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method773();
			this.aShortArray3 = new short[local8];
			this.aShortArray6 = new short[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.aShortArray3[local28] = (short) arg0.method816();
				this.aShortArray6[local28] = (short) arg0.method816();
			}
		} else if (arg1 == 41) {
			local8 = arg0.method773();
			this.aShortArray4 = new short[local8];
			this.aShortArray5 = new short[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.aShortArray4[local28] = (short) arg0.method816();
				this.aShortArray5[local28] = (short) arg0.method816();
			}
		} else if (arg1 == 60) {
			this.anInt755 = arg0.method816();
		} else if (arg1 == 62) {
			this.aBoolean33 = true;
		} else if (arg1 == 64) {
			this.aBoolean30 = false;
		} else if (arg1 == 65) {
			this.anInt751 = arg0.method816();
		} else if (arg1 == 66) {
			this.anInt741 = arg0.method816();
		} else if (arg1 == 67) {
			this.anInt763 = arg0.method816();
		} else if (arg1 == 68) {
			this.anInt736 = arg0.method816();
		} else if (arg1 == 69) {
			this.anInt758 = arg0.method773();
		} else if (arg1 == 70) {
			this.anInt730 = arg0.method774();
		} else if (arg1 == 71) {
			this.anInt761 = arg0.method774();
		} else if (arg1 == 72) {
			this.anInt744 = arg0.method774();
		} else if (arg1 == 73) {
			this.aBoolean31 = true;
		} else if (arg1 == 74) {
			this.aBoolean26 = true;
		} else if (arg1 == 75) {
			this.anInt745 = arg0.method773();
		} else if (arg1 == 77) {
			this.anInt740 = arg0.method816();
			if (this.anInt740 == 65535) {
				this.anInt740 = -1;
			}
			this.anInt752 = arg0.method816();
			if (this.anInt752 == 65535) {
				this.anInt752 = -1;
			}
			local8 = arg0.method773();
			this.anIntArray81 = new int[local8 + 1];
			for (local28 = 0; local28 <= local8; local28++) {
				this.anIntArray81[local28] = arg0.method816();
				if (this.anIntArray81[local28] == 65535) {
					this.anIntArray81[local28] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt739 = arg0.method816();
			this.anInt731 = arg0.method773();
		} else if (arg1 == 79) {
			this.anInt762 = arg0.method816();
			this.anInt733 = arg0.method816();
			this.anInt731 = arg0.method773();
			local8 = arg0.method773();
			this.anIntArray82 = new int[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.anIntArray82[local28] = arg0.method816();
			}
		} else if (arg1 == 81) {
			this.anInt743 = arg0.method773() * 256;
		}
	}

	@OriginalMember(owner = "client!db", name = "i", descriptor = "(I)Z")
	public boolean method407() {
		if (this.anIntArray81 == null) {
			return this.anInt739 != -1 || this.anIntArray82 != null;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray81.length; local28++) {
			if (this.anIntArray81[local28] != -1) {
				@Pc(44) Class4_Sub3_Sub3 local44 = Static76.method1244(this.anIntArray81[local28]);
				if (local44.anInt739 != -1 || local44.anIntArray82 != null) {
					return true;
				}
			}
		}
		return false;
	}
}
