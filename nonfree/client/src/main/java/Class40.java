import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public abstract class Class40 {

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[Lclient!e;")
	private Class18[] aClass18Array2;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[I")
	protected int[] anIntArray231;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Lclient!e;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
	protected int[] anIntArray234;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
	public int anInt2533;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "[I")
	protected int[] anIntArray235;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Z")
	private final boolean aBoolean119;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Z")
	private final boolean aBoolean120;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ZZ)V")
	protected Class40(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean119 = arg0;
		this.aBoolean120 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!gg;ILclient!gg;)[B")
	public final byte[] method1769(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(3) Class28 local3 = arg1.method1123();
		@Pc(15) Class28 local15 = arg0.method1123();
		@Pc(23) int local23 = this.aClass18_2.method723(local3.method1126());
		@Pc(33) int local33 = this.aClass18Array2[local23].method723(local15.method1126());
		return this.method1771(local23, local33);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)[B")
	public final byte[] method1770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method1786(arg1, null);
			if (!local49) {
				this.method1779(arg1);
				local49 = this.method1786(arg1, null);
				if (!local49) {
					return null;
				}
			}
		}
		return Static88.method1579(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)[B")
	public final byte[] method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1773(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!gg;I)V")
	public final void method1772(@OriginalArg(0) Class28 arg0) {
		@Pc(3) Class28 local3 = arg0.method1123();
		@Pc(17) int local17 = this.aClass18_2.method723(local3.method1126());
		if (local17 >= 0) {
			this.method1781(local17);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1773(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(59) boolean local59 = this.method1786(arg0, arg1);
			if (!local59) {
				this.method1779(arg0);
				local59 = this.method1786(arg0, arg1);
				if (!local59) {
					return null;
				}
			}
		}
		@Pc(87) byte[] local87 = Static88.method1579(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean120) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local87;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!gg;I)I")
	public final int method1774(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class28 local3 = arg0.method1123();
		return this.aClass18Array2[arg1].method723(local3.method1126());
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)Z")
	public final boolean method1776(@OriginalArg(0) int arg0) {
		if (this.anObjectArray28[arg0] == null) {
			this.method1779(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!gg;)I")
	public final int method1777(@OriginalArg(1) Class28 arg0) {
		@Pc(3) Class28 local3 = arg0.method1123();
		return this.aClass18_2.method723(local3.method1126());
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public final void method1778() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			if (this.anObjectArrayArray2[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray2[local7].length; local16++) {
					this.anObjectArrayArray2[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
	protected void method1779(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BI)[I")
	public final int[] method1780(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray23[arg0];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	protected void method1781(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Z")
	public final boolean method1782() {
		@Pc(3) boolean local3 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray232.length; local14++) {
			@Pc(21) int local21 = this.anIntArray232[local14];
			if (this.anObjectArray28[local21] == null) {
				this.method1779(local21);
				if (this.anObjectArray28[local21] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)Z")
	public final boolean method1783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method1779(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(BI)[B")
	public final byte[] method1784(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1771(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1771(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)I")
	public final int method1785(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[I)Z")
	private boolean method1786(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray28[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray231[arg0];
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg0];
		@Pc(27) int[] local27 = this.anIntArrayArray23[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local22[local27[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(88) byte[] local88;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local88 = Static88.method1579(false, this.anObjectArray28[arg0]);
		} else {
			local88 = Static88.method1579(true, this.anObjectArray28[arg0]);
			@Pc(103) Class2_Sub2 local103 = new Class2_Sub2(local88);
			local103.method1701(local103.aByteArray35.length, arg1);
		}
		@Pc(115) byte[] local115;
		try {
			local115 = Static64.method1174(local88);
		} catch (@Pc(117) RuntimeException local117) {
			throw Static180.method2863(local117, "T3 - " + (arg1 != null) + "," + arg0 + "," + local88.length + "," + Static62.method1130(local88, local88.length) + "," + Static62.method1130(local88, local88.length - 2) + "," + this.anIntArray235[arg0] + "," + this.anInt2533);
		}
		if (this.aBoolean119) {
			this.anObjectArray28[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(206) int local206 = local115.length;
			@Pc(208) int local208 = local206 - 1;
			@Pc(213) int local213 = local115[local208] & 0xFF;
			@Pc(221) int local221 = local208 - local17 * 4 * local213;
			@Pc(226) Class2_Sub2 local226 = new Class2_Sub2(local115);
			local226.anInt2385 = local221;
			@Pc(232) int[] local232 = new int[local17];
			@Pc(240) int local240;
			for (@Pc(234) int local234 = 0; local234 < local213; local234++) {
				@Pc(238) int local238 = 0;
				for (local240 = 0; local240 < local17; local240++) {
					local238 += local226.method1690();
					local232[local240] += local238;
				}
			}
			@Pc(270) byte[][] local270 = new byte[local17][];
			for (local240 = 0; local240 < local17; local240++) {
				local270[local240] = new byte[local232[local240]];
				local232[local240] = 0;
			}
			local226.anInt2385 = local221;
			@Pc(294) int local294 = 0;
			@Pc(300) int local300;
			for (@Pc(296) int local296 = 0; local296 < local213; local296++) {
				local300 = 0;
				for (@Pc(302) int local302 = 0; local302 < local17; local302++) {
					local300 += local226.method1690();
					Static184.method1640(local115, local294, local270[local302], local232[local302], local300);
					local294 += local300;
					local232[local302] += local300;
				}
			}
			for (local300 = 0; local300 < local17; local300++) {
				if (this.aBoolean120) {
					local22[local27[local300]] = local270[local300];
				} else {
					local22[local27[local300]] = Static67.method1219(local270[local300]);
				}
			}
		} else if (this.aBoolean120) {
			local22[local27[0]] = local115;
		} else {
			local22[local27[0]] = Static67.method1219(local115);
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!gg;Lclient!gg;)Z")
	public final boolean method1787(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(3) Class28 local3 = arg1.method1123();
		@Pc(18) Class28 local18 = arg0.method1123();
		@Pc(26) int local26 = this.aClass18_2.method723(local3.method1126());
		@Pc(36) int local36 = this.aClass18Array2[local26].method723(local18.method1126());
		return this.method1783(local26, local36);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public final void method1788(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	public final int method1789() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[B)V")
	protected final void method1790(@OriginalArg(1) byte[] arg0) {
		this.anInt2533 = Static62.method1130(arg0, arg0.length);
		@Pc(19) Class2_Sub2 local19 = new Class2_Sub2(Static64.method1174(arg0));
		@Pc(23) int local23 = local19.method1698();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = -1;
		if (local23 >= 6) {
			local19.method1690();
		}
		@Pc(57) int local57 = local19.method1698();
		this.anInt2521 = local19.method1680();
		this.anIntArray232 = new int[this.anInt2521];
		for (@Pc(69) int local69 = 0; local69 < this.anInt2521; local69++) {
			this.anIntArray232[local69] = local44 += local19.method1680();
			if (local46 < this.anIntArray232[local69]) {
				local46 = this.anIntArray232[local69];
			}
		}
		this.anIntArray234 = new int[local46 + 1];
		this.anIntArray235 = new int[local46 + 1];
		this.anObjectArray28 = new Object[local46 + 1];
		this.anIntArrayArray23 = new int[local46 + 1][];
		this.anIntArray231 = new int[local46 + 1];
		this.anObjectArrayArray2 = new Object[local46 + 1][];
		@Pc(155) int local155;
		@Pc(170) int local170;
		if (local57 != 0) {
			this.anIntArray233 = new int[local46 + 1];
			for (local155 = 0; local155 < local46 + 1; local155++) {
				this.anIntArray233[local155] = -1;
			}
			for (local170 = 0; local170 < this.anInt2521; local170++) {
				this.anIntArray233[this.anIntArray232[local170]] = local19.method1690();
			}
			this.aClass18_2 = new Class18(this.anIntArray233);
		}
		for (local155 = 0; local155 < this.anInt2521; local155++) {
			this.anIntArray235[this.anIntArray232[local155]] = local19.method1690();
		}
		for (local170 = 0; local170 < this.anInt2521; local170++) {
			this.anIntArray234[this.anIntArray232[local170]] = local19.method1690();
		}
		for (@Pc(246) int local246 = 0; local246 < this.anInt2521; local246++) {
			this.anIntArray231[this.anIntArray232[local246]] = local19.method1680();
		}
		@Pc(276) int local276;
		@Pc(281) int local281;
		@Pc(285) int local285;
		@Pc(293) int local293;
		@Pc(310) int local310;
		for (@Pc(269) int local269 = 0; local269 < this.anInt2521; local269++) {
			local276 = this.anIntArray232[local269];
			local281 = this.anIntArray231[local276];
			local44 = 0;
			local285 = -1;
			this.anIntArrayArray23[local276] = new int[local281];
			for (local293 = 0; local293 < local281; local293++) {
				local310 = this.anIntArrayArray23[local276][local293] = local44 += local19.method1680();
				if (local310 > local285) {
					local285 = local310;
				}
			}
			this.anObjectArrayArray2[local276] = new Object[local285 + 1];
		}
		if (local57 == 0) {
			return;
		}
		this.anIntArrayArray24 = new int[local46 + 1][];
		this.aClass18Array2 = new Class18[local46 + 1];
		for (local276 = 0; local276 < this.anInt2521; local276++) {
			local281 = this.anIntArray232[local276];
			local285 = this.anIntArray231[local281];
			this.anIntArrayArray24[local281] = new int[this.anObjectArrayArray2[local281].length];
			for (local293 = 0; local293 < this.anObjectArrayArray2[local281].length; local293++) {
				this.anIntArrayArray24[local281][local293] = -1;
			}
			for (local310 = 0; local310 < local285; local310++) {
				this.anIntArrayArray24[local281][this.anIntArrayArray23[local281][local310]] = local19.method1690();
			}
			this.aClass18Array2[local281] = new Class18(this.anIntArrayArray24[local281]);
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)Z")
	public final boolean method1791(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1783(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1783(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
