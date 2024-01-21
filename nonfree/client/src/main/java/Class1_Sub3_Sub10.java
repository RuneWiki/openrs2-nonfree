import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lf", name = "lb", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
	public int anInt1683;

	@OriginalMember(owner = "client!lf", name = "Ub", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!lf", name = "Wb", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!lf", name = "ec", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
	private int anInt1674 = 0;

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
	private int anInt1678 = 0;

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
	private int anInt1680 = 128;

	@OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
	public int anInt1681 = 2;

	@OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
	private int anInt1692 = 0;

	@OriginalMember(owner = "client!lf", name = "Db", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!lf", name = "Cb", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	public int anInt1671 = -1;

	@OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
	public int anInt1682 = 0;

	@OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
	public int anInt1693 = 1;

	@OriginalMember(owner = "client!lf", name = "Gb", descriptor = "Z")
	public boolean aBoolean56 = false;

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
	private int anInt1673 = -1;

	@OriginalMember(owner = "client!lf", name = "Hb", descriptor = "I")
	public int anInt1690 = 16;

	@OriginalMember(owner = "client!lf", name = "Vb", descriptor = "[Lclient!af;")
	public final Class5[] aClass5Array11 = new Class5[5];

	@OriginalMember(owner = "client!lf", name = "Qb", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public int anInt1666 = -1;

	@OriginalMember(owner = "client!lf", name = "Rb", descriptor = "I")
	private int anInt1699 = 128;

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!lf", name = "Fb", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
	private int anInt1687 = 0;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
	public int anInt1670 = -1;

	@OriginalMember(owner = "client!lf", name = "Xb", descriptor = "I")
	public int anInt1701 = 0;

	@OriginalMember(owner = "client!lf", name = "Ob", descriptor = "I")
	private int anInt1697 = 128;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
	public int anInt1664 = 0;

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "I")
	public int anInt1689 = -1;

	@OriginalMember(owner = "client!lf", name = "Zb", descriptor = "I")
	public int anInt1702 = -1;

	@OriginalMember(owner = "client!lf", name = "Tb", descriptor = "I")
	private int anInt1700 = -1;

	@OriginalMember(owner = "client!lf", name = "bc", descriptor = "I")
	public int anInt1703 = 0;

	@OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
	public int anInt1696 = 1;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "Lclient!af;")
	public Class5 aClass5_836 = Static41.aClass5_494;

	@OriginalMember(owner = "client!lf", name = "ac", descriptor = "Z")
	public boolean aBoolean59 = true;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
	private int anInt1668 = 0;

	@OriginalMember(owner = "client!lf", name = "Yb", descriptor = "Z")
	public boolean aBoolean58 = true;

	@OriginalMember(owner = "client!lf", name = "dc", descriptor = "I")
	public int anInt1704 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method1250(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(130) int local130;
		@Pc(140) int local140;
		if (arg1 == 1) {
			local130 = arg0.method2053();
			if (local130 > 0) {
				if (this.anIntArray282 == null || Static16.aBoolean13) {
					this.anIntArray284 = new int[local130];
					this.anIntArray282 = new int[local130];
					for (local140 = 0; local140 < local130; local140++) {
						this.anIntArray282[local140] = arg0.method2087();
						this.anIntArray284[local140] = arg0.method2053();
					}
				} else {
					arg0.anInt2951 += local130 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass5_836 = arg0.method2101();
		} else if (arg1 == 5) {
			local130 = arg0.method2053();
			if (local130 > 0) {
				if (this.anIntArray282 == null || Static16.aBoolean13) {
					this.anIntArray284 = null;
					this.anIntArray282 = new int[local130];
					for (local140 = 0; local140 < local130; local140++) {
						this.anIntArray282[local140] = arg0.method2087();
					}
				} else {
					arg0.anInt2951 += local130 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1696 = arg0.method2053();
		} else if (arg1 == 15) {
			this.anInt1693 = arg0.method2053();
		} else if (arg1 == 17) {
			this.anInt1681 = 0;
			this.aBoolean58 = false;
		} else if (arg1 == 18) {
			this.aBoolean58 = false;
		} else if (arg1 == 19) {
			this.anInt1702 = arg0.method2053();
		} else if (arg1 == 21) {
			this.aBoolean53 = true;
		} else if (arg1 == 22) {
			this.aBoolean57 = true;
		} else if (arg1 == 23) {
			this.aBoolean54 = true;
		} else if (arg1 == 24) {
			this.anInt1704 = arg0.method2087();
			if (this.anInt1704 == 65535) {
				this.anInt1704 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt1681 = 1;
		} else if (arg1 == 28) {
			this.anInt1690 = arg0.method2053();
		} else if (arg1 == 29) {
			this.anInt1678 = arg0.method2099();
		} else if (arg1 == 39) {
			this.anInt1674 = arg0.method2099() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass5Array11[arg1 - 30] = arg0.method2101();
			if (this.aClass5Array11[arg1 - 30].method207(Static105.aClass5_1347)) {
				this.aClass5Array11[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local130 = arg0.method2053();
			this.aShortArray6 = new short[local130];
			this.aShortArray7 = new short[local130];
			for (local140 = 0; local140 < local130; local140++) {
				this.aShortArray7[local140] = (short) arg0.method2087();
				this.aShortArray6[local140] = (short) arg0.method2087();
			}
		} else if (arg1 == 60) {
			this.anInt1666 = arg0.method2087();
		} else if (arg1 == 62) {
			this.aBoolean55 = true;
		} else if (arg1 == 64) {
			this.aBoolean59 = false;
		} else if (arg1 == 65) {
			this.anInt1699 = arg0.method2087();
		} else if (arg1 == 66) {
			this.anInt1680 = arg0.method2087();
		} else if (arg1 == 67) {
			this.anInt1697 = arg0.method2087();
		} else if (arg1 == 68) {
			this.anInt1671 = arg0.method2087();
		} else if (arg1 == 69) {
			this.anInt1701 = arg0.method2053();
		} else if (arg1 == 70) {
			this.anInt1687 = arg0.method2079();
		} else if (arg1 == 71) {
			this.anInt1668 = arg0.method2079();
		} else if (arg1 == 72) {
			this.anInt1692 = arg0.method2079();
		} else if (arg1 == 73) {
			this.aBoolean52 = true;
		} else if (arg1 == 74) {
			this.aBoolean56 = true;
		} else if (arg1 == 75) {
			this.anInt1670 = arg0.method2053();
		} else if (arg1 == 77) {
			this.anInt1700 = arg0.method2087();
			if (this.anInt1700 == 65535) {
				this.anInt1700 = -1;
			}
			this.anInt1673 = arg0.method2087();
			if (this.anInt1673 == 65535) {
				this.anInt1673 = -1;
			}
			local130 = arg0.method2053();
			this.anIntArray283 = new int[local130 + 1];
			for (local140 = 0; local140 <= local130; local140++) {
				this.anIntArray283[local140] = arg0.method2087();
				if (this.anIntArray283[local140] == 65535) {
					this.anIntArray283[local140] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1689 = arg0.method2087();
			this.anInt1703 = arg0.method2053();
		} else if (arg1 == 79) {
			this.anInt1682 = arg0.method2087();
			this.anInt1664 = arg0.method2087();
			this.anInt1703 = arg0.method2053();
			local130 = arg0.method2053();
			this.anIntArray281 = new int[local130];
			for (local140 = 0; local140 < local130; local140++) {
				this.anIntArray281[local140] = arg0.method2087();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)Z")
	public boolean method1252() {
		if (this.anIntArray283 == null) {
			return this.anInt1689 != -1 || this.anIntArray281 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray283.length; local22++) {
			if (this.anIntArray283[local22] != -1) {
				@Pc(37) Class1_Sub3_Sub10 local37 = Static131.method2263(this.anIntArray283[local22]);
				if (local37.anInt1689 != -1 || local37.anIntArray281 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Z")
	public boolean method1254() {
		if (this.anIntArray282 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray282.length; local14++) {
			local12 &= Static27.aClass41_3.method1722(this.anIntArray282[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)Lclient!od;")
	public Class1_Sub3_Sub4 method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray284 == null) {
			local16 = arg5 + (this.anInt1683 << 10);
		} else {
			local16 = arg5 + (this.anInt1683 << 10) + (arg0 << 3);
		}
		@Pc(38) Class1_Sub3_Sub4 local38 = (Class1_Sub3_Sub4) Static2.aClass28_5.method796(local16);
		if (local38 == null) {
			@Pc(50) Class1_Sub3_Sub4_Sub1 local50 = this.method1259(arg5, arg0);
			if (local50 == null) {
				return null;
			}
			if (this.aBoolean57) {
				local38 = local50;
				local50.aShort2 = (short) (this.anInt1674 * 5 + 768);
				local50.aShort1 = (short) (this.anInt1678 + 64);
				local50.method345();
			} else {
				local38 = local50.method356(this.anInt1678 + 64, this.anInt1674 * 5 + 768, -50, -10, -50);
			}
			Static2.aClass28_5.method789(local38, local16);
		}
		if (this.aBoolean57) {
			local38 = ((Class1_Sub3_Sub4_Sub1) local38).method351();
		}
		if (this.aBoolean53) {
			if (local38 instanceof Class1_Sub3_Sub4_Sub4) {
				local38 = ((Class1_Sub3_Sub4_Sub4) local38).method633(arg4, arg2, arg1, arg3, true);
			} else if (local38 instanceof Class1_Sub3_Sub4_Sub1) {
				local38 = ((Class1_Sub3_Sub4_Sub1) local38).method350(arg4, arg2, arg1, arg3);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIILclient!nc;II)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub3_Sub11 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray284 == null) {
			local16 = (this.anInt1683 << 10) + arg4;
		} else {
			local16 = (arg1 << 3) + (this.anInt1683 << 10) + arg4;
		}
		@Pc(37) Class1_Sub3_Sub4_Sub4 local37 = (Class1_Sub3_Sub4_Sub4) Static21.aClass28_19.method796(local16);
		if (local37 == null) {
			@Pc(45) Class1_Sub3_Sub4_Sub1 local45 = this.method1259(arg4, arg1);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method356(this.anInt1678 + 64, 768 - -(this.anInt1674 * 5), -50, -10, -50);
			Static21.aClass28_19.method789(local37, local16);
		}
		if (arg5 == null && !this.aBoolean53) {
			return local37;
		}
		if (arg5 == null) {
			local37 = local37.method652(true);
		} else {
			local37 = arg5.method1429(arg0, local37, arg4);
		}
		if (this.aBoolean53) {
			local37.method633(arg3, arg2, arg7, arg6, false);
		}
		return local37;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Z")
	public boolean method1258(@OriginalArg(1) int arg0) {
		if (this.anIntArray284 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.anIntArray284.length; local53++) {
				if (this.anIntArray284[local53] == arg0) {
					return Static27.aClass41_3.method1722(this.anIntArray282[local53] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray282 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(26) boolean local26 = true;
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray282.length; local28++) {
				local26 &= Static27.aClass41_3.method1722(this.anIntArray282[local28] & 0xFFFF, 0);
			}
			return local26;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Lclient!c;")
	private Class1_Sub3_Sub4_Sub1 method1259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub3_Sub4_Sub1 local7 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (this.anIntArray284 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray282 == null) {
				return null;
			}
			local30 = arg0 > 3 ^ this.aBoolean55;
			local34 = this.anIntArray282.length;
			for (local36 = 0; local36 < local34; local36++) {
				local42 = this.anIntArray282[local36];
				if (local30) {
					local42 += 65536;
				}
				local7 = (Class1_Sub3_Sub4_Sub1) Static54.aClass28_35.method796((long) local42);
				if (local7 == null) {
					local7 = Static14.method357(Static27.aClass41_3, local42 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local30) {
						local7.method359();
					}
					Static54.aClass28_35.method789(local7, (long) local42);
				}
				if (local34 > 1) {
					Static105.aClass1_Sub3_Sub4_Sub1Array2[local36] = local7;
				}
			}
			if (local34 > 1) {
				local7 = new Class1_Sub3_Sub4_Sub1(Static105.aClass1_Sub3_Sub4_Sub1Array2, local34);
			}
		} else {
			@Pc(105) int local105 = -1;
			for (local34 = 0; local34 < this.anIntArray284.length; local34++) {
				if (arg1 == this.anIntArray284[local34]) {
					local105 = local34;
					break;
				}
			}
			if (local105 == -1) {
				return null;
			}
			local36 = this.anIntArray282[local105];
			@Pc(145) boolean local145 = this.aBoolean55 ^ arg0 > 3;
			if (local145) {
				local36 += 65536;
			}
			local7 = (Class1_Sub3_Sub4_Sub1) Static54.aClass28_35.method796((long) local36);
			if (local7 == null) {
				local7 = Static14.method357(Static27.aClass41_3, local36 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local145) {
					local7.method359();
				}
				Static54.aClass28_35.method789(local7, (long) local36);
			}
		}
		@Pc(201) boolean local201;
		if (this.anInt1687 == 0 && this.anInt1668 == 0 && this.anInt1692 == 0) {
			local201 = false;
		} else {
			local201 = true;
		}
		if (this.anInt1699 == 128 && this.anInt1680 == 128 && this.anInt1697 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(251) Class1_Sub3_Sub4_Sub1 local251 = new Class1_Sub3_Sub4_Sub1(local7, arg0 == 0 && !local30 && !local201, this.aShortArray7 == null, true);
		@Pc(255) int local255 = arg0 & 0x3;
		if (local255 == 1) {
			local251.method362();
		} else if (local255 == 2) {
			local251.method363();
		} else if (local255 == 3) {
			local251.method355();
		}
		if (this.aShortArray7 != null) {
			for (local42 = 0; local42 < this.aShortArray7.length; local42++) {
				local251.method347(this.aShortArray7[local42], this.aShortArray6[local42]);
			}
		}
		if (local30) {
			local251.method354(this.anInt1699, this.anInt1680, this.anInt1697);
		}
		if (local201) {
			local251.method358(this.anInt1687, this.anInt1668, this.anInt1692);
		}
		return local251;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Lclient!lf;")
	public Class1_Sub3_Sub10 method1260() {
		@Pc(5) int local5 = -1;
		if (this.anInt1700 != -1) {
			local5 = Static96.method1626(this.anInt1700);
		} else if (this.anInt1673 != -1) {
			local5 = Static40.anIntArray182[this.anInt1673];
		}
		return local5 < 0 || this.anIntArray283.length <= local5 || this.anIntArray283[local5] == -1 ? null : Static131.method2263(this.anIntArray283[local5]);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)V")
	public void method1261() {
		if (this.anInt1702 == -1) {
			this.anInt1702 = 0;
			if (this.anIntArray282 != null && (this.anIntArray284 == null || this.anIntArray284[0] == 10)) {
				this.anInt1702 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass5Array11[local31] != null) {
					this.anInt1702 = 1;
				}
			}
		}
		if (this.anInt1670 == -1) {
			this.anInt1670 = this.anInt1681 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILclient!rd;)V")
	public void method1264(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2053();
			if (local17 == 0) {
				return;
			}
			this.method1250(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIIII)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray284 == null) {
			local20 = (this.anInt1683 << 10) + arg0;
		} else {
			local20 = (this.anInt1683 << 10) - (-(arg4 << 3) - arg0);
		}
		@Pc(36) Class1_Sub3_Sub4_Sub4 local36 = (Class1_Sub3_Sub4_Sub4) Static21.aClass28_19.method796(local20);
		if (local36 == null) {
			@Pc(44) Class1_Sub3_Sub4_Sub1 local44 = this.method1259(arg0, arg4);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method356(this.anInt1678 + 64, this.anInt1674 * 5 + 768, -50, -10, -50);
			Static21.aClass28_19.method789(local36, local20);
		}
		if (this.aBoolean53) {
			local36 = local36.method633(arg5, arg2, arg3, arg1, true);
		}
		return local36;
	}
}
