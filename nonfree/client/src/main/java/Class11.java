import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public abstract class Class11 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	private int anInt2815;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!ca;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "[I")
	protected int[] anIntArray365;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lclient!ca;")
	private Class13[] aClass13Array2;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "[[B")
	protected byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	public int anInt2831;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
	protected int[] anIntArray366;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
	protected int[] anIntArray367;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Z")
	private final boolean aBoolean153;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ZZ)V")
	protected Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean152 = arg0;
		this.aBoolean153 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!ae;)I")
	public final int method1860(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(3) Class5 local3 = arg1.method151();
		return this.aClass13Array2[arg0].method323(local3.method130());
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ae;B)V")
	public final void method1861(@OriginalArg(0) Class5 arg0) {
		@Pc(3) Class5 local3 = arg0.method151();
		@Pc(11) int local11 = this.aClass13_2.method323(local3.method130());
		if (local11 >= 0) {
			this.method1864(local11);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public final void method1862() {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray7.length; local7++) {
			if (this.aByteArrayArrayArray7[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.aByteArrayArrayArray7[local7].length; local16++) {
					this.aByteArrayArrayArray7[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
	public final int[] method1863(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray26[arg0];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	protected void method1864(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I")
	public final int method1865() {
		return this.aByteArrayArrayArray7.length;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
	protected void method1866(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[B")
	public final byte[] method1868(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray7.length == 1) {
			return this.method1882(0, arg0);
		} else if (this.aByteArrayArrayArray7[arg0].length == 1) {
			return this.method1882(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ae;Lclient!ae;)Z")
	public final boolean method1869(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(7) Class5 local7 = arg1.method151();
		@Pc(11) Class5 local11 = arg0.method151();
		@Pc(24) int local24 = this.aClass13_2.method323(local7.method130());
		@Pc(34) int local34 = this.aClass13Array2[local24].method323(local11.method130());
		return this.method1872(local34, local24);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	public final void method1870(@OriginalArg(0) int arg0) {
		for (@Pc(9) int local9 = 0; local9 < this.aByteArrayArrayArray7[arg0].length; local9++) {
			this.aByteArrayArrayArray7[arg0][local9] = null;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)[B")
	public final byte[] method1871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray7.length <= arg0 || this.aByteArrayArrayArray7[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray7[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray7[arg0][arg1] == null) {
			@Pc(46) boolean local46 = this.method1878(arg0, null);
			if (!local46) {
				this.method1866(arg0);
				local46 = this.method1878(arg0, null);
				if (!local46) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)Z")
	public final boolean method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.aByteArrayArrayArray7.length <= arg1 || this.aByteArrayArrayArray7[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray7[arg1].length <= arg0) {
			return false;
		} else if (this.aByteArrayArrayArray7[arg1][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray10[arg1] == null) {
			this.method1866(arg1);
			return this.aByteArrayArray10[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[IB)[B")
	public final byte[] method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg0 < 0 || this.aByteArrayArrayArray7.length <= arg0 || this.aByteArrayArrayArray7[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray7[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray7[arg0][arg1] == null) {
			@Pc(43) boolean local43 = this.method1878(arg0, arg2);
			if (!local43) {
				this.method1866(arg0);
				local43 = this.method1878(arg0, arg2);
				if (!local43) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = this.aByteArrayArrayArray7[arg0][arg1];
		if (this.aBoolean153) {
			this.aByteArrayArrayArray7[arg0][arg1] = null;
		}
		return local72;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)I")
	public final int method1875(@OriginalArg(0) int arg0) {
		return this.aByteArrayArrayArray7[arg0].length;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z")
	public final boolean method1876() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray368.length; local15++) {
			@Pc(22) int local22 = this.anIntArray368[local15];
			if (this.aByteArrayArray10[local22] == null) {
				this.method1866(local22);
				if (this.aByteArrayArray10[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[II)Z")
	private boolean method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aByteArrayArray10[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray365[arg0];
		@Pc(22) byte[][] local22 = this.aByteArrayArrayArray7[arg0];
		@Pc(24) boolean local24 = true;
		@Pc(29) int[] local29 = this.anIntArrayArray26[arg0];
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local22[local29[local31]] == null) {
				local24 = false;
				break;
			}
		}
		if (local24) {
			return true;
		}
		@Pc(83) byte[] local83;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local83 = this.aByteArrayArray10[arg0];
		} else {
			local83 = new byte[this.aByteArrayArray10[arg0].length];
			Static118.method807(this.aByteArrayArray10[arg0], 0, local83, 0, local83.length);
			@Pc(107) Class3_Sub6 local107 = new Class3_Sub6(local83);
			local107.method1610(arg1, local107.aByteArray17.length);
		}
		@Pc(119) byte[] local119;
		try {
			local119 = Static15.method357(local83);
		} catch (@Pc(127) RuntimeException local127) {
			throw Static74.method1233(local127, "T3 - " + (arg1 != null) + "," + arg0 + "," + local83.length + "," + Static14.method1906(local83.length, local83) + "," + Static14.method1906(local83.length - 2, local83) + "," + this.anIntArray367[arg0] + "," + this.anInt2831);
		}
		if (this.aBoolean152) {
			this.aByteArrayArray10[arg0] = null;
		}
		if (local17 <= 1) {
			local22[local29[0]] = local119;
		} else {
			@Pc(202) int local202 = local119.length;
			@Pc(205) int local205 = local202 - 1;
			@Pc(209) int local209 = local119[local205] & 0xFF;
			@Pc(212) int[] local212 = new int[local17];
			@Pc(220) int local220 = local205 - local17 * 4 * local209;
			@Pc(225) Class3_Sub6 local225 = new Class3_Sub6(local119);
			local225.anInt2416 = local220;
			@Pc(234) int local234;
			@Pc(236) int local236;
			for (@Pc(230) int local230 = 0; local230 < local209; local230++) {
				local234 = 0;
				for (local236 = 0; local236 < local17; local236++) {
					local234 += local225.method1614();
					local212[local236] += local234;
				}
			}
			for (local234 = 0; local234 < local17; local234++) {
				if (local22[local29[local234]] == null) {
					local22[local29[local234]] = new byte[local212[local234]];
				}
				local212[local234] = 0;
			}
			local236 = 0;
			local225.anInt2416 = local220;
			for (@Pc(293) int local293 = 0; local293 < local209; local293++) {
				@Pc(297) int local297 = 0;
				for (@Pc(299) int local299 = 0; local299 < local17; local299++) {
					local297 += local225.method1614();
					Static118.method807(local119, local236, local22[local29[local299]], local212[local299], local297);
					local212[local299] += local297;
					local236 += local297;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!ae;B)I")
	public final int method1880(@OriginalArg(0) Class5 arg0) {
		@Pc(15) Class5 local15 = arg0.method151();
		return this.aClass13_2.method323(local15.method130());
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(ZI)Z")
	public final boolean method1881(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray10[arg0] == null) {
			this.method1866(arg0);
			return this.aByteArrayArray10[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)[B")
	public final byte[] method1882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1874(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)[B")
	public final byte[] method1883(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray7.length == 1) {
			return this.method1871(0, arg0);
		} else if (this.aByteArrayArrayArray7[arg0].length == 1) {
			return this.method1871(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ae;Lclient!ae;I)[B")
	public final byte[] method1884(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(7) Class5 local7 = arg0.method151();
		@Pc(11) Class5 local11 = arg1.method151();
		@Pc(19) int local19 = this.aClass13_2.method323(local7.method130());
		@Pc(29) int local29 = this.aClass13Array2[local19].method323(local11.method130());
		return this.method1882(local19, local29);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BB)V")
	protected final void method1885(@OriginalArg(0) byte[] arg0) {
		this.anInt2831 = Static14.method1906(arg0.length, arg0);
		@Pc(19) Class3_Sub6 local19 = new Class3_Sub6(Static15.method357(arg0));
		@Pc(23) int local23 = local19.method1587();
		if (local23 != 5) {
			return;
		}
		@Pc(31) int local31 = local19.method1587();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = -1;
		this.anInt2815 = local19.method1603();
		this.anIntArray368 = new int[this.anInt2815];
		for (@Pc(47) int local47 = 0; local47 < this.anInt2815; local47++) {
			this.anIntArray368[local47] = local33 += local19.method1603();
			if (this.anIntArray368[local47] > local35) {
				local35 = this.anIntArray368[local47];
			}
		}
		this.anIntArray365 = new int[local35 + 1];
		this.anIntArrayArray26 = new int[local35 + 1][];
		this.anIntArray366 = new int[local35 + 1];
		this.anIntArray367 = new int[local35 + 1];
		this.aByteArrayArrayArray7 = new byte[local35 + 1][][];
		this.aByteArrayArray10 = new byte[local35 + 1][];
		@Pc(126) int local126;
		if (local31 != 0) {
			this.anIntArray369 = new int[local35 + 1];
			for (local126 = 0; local126 < this.anInt2815; local126++) {
				this.anIntArray369[this.anIntArray368[local126]] = local19.method1614();
			}
			this.aClass13_2 = new Class13(this.anIntArray369);
		}
		for (local126 = 0; local126 < this.anInt2815; local126++) {
			this.anIntArray367[this.anIntArray368[local126]] = local19.method1614();
		}
		for (@Pc(175) int local175 = 0; local175 < this.anInt2815; local175++) {
			this.anIntArray366[this.anIntArray368[local175]] = local19.method1614();
		}
		for (@Pc(194) int local194 = 0; local194 < this.anInt2815; local194++) {
			this.anIntArray365[this.anIntArray368[local194]] = local19.method1603();
		}
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(229) int local229;
		@Pc(237) int local237;
		for (@Pc(213) int local213 = 0; local213 < this.anInt2815; local213++) {
			local33 = 0;
			local222 = this.anIntArray368[local213];
			local227 = this.anIntArray365[local222];
			local229 = -1;
			this.anIntArrayArray26[local222] = new int[local227];
			for (local237 = 0; local237 < local227; local237++) {
				@Pc(254) int local254 = this.anIntArrayArray26[local222][local237] = local33 += local19.method1603();
				if (local229 < local254) {
					local229 = local254;
				}
			}
			this.aByteArrayArrayArray7[local222] = new byte[local229 + 1][];
		}
		if (local31 == 0) {
			return;
		}
		this.anIntArrayArray27 = new int[local35 + 1][];
		this.aClass13Array2 = new Class13[local35 + 1];
		for (local222 = 0; local222 < this.anInt2815; local222++) {
			local227 = this.anIntArray368[local222];
			local229 = this.anIntArray365[local227];
			this.anIntArrayArray27[local227] = new int[this.aByteArrayArrayArray7[local227].length];
			for (local237 = 0; local237 < local229; local237++) {
				this.anIntArrayArray27[local227][this.anIntArrayArray26[local227][local237]] = local19.method1614();
			}
			this.aClass13Array2[local227] = new Class13(this.anIntArrayArray27[local227]);
		}
	}
}
