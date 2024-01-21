import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class10 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray3;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[Lclient!uh;")
	private Class83[] aClass83Array2;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!uh;")
	private Class83 aClass83_2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private int anInt2424;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "[I")
	protected int[] anIntArray187;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "[I")
	protected int[] anIntArray189;

	@OriginalMember(owner = "client!c", name = "R", descriptor = "[I")
	protected int[] anIntArray190;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
	private final boolean aBoolean93;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Z")
	private final boolean aBoolean94;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ZZ)V")
	protected Class10(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean93 = arg1;
		this.aBoolean94 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
	public final boolean method1581(@OriginalArg(1) int arg0) {
		if (this.anObjectArray3[arg0] == null) {
			this.method1598(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	public final void method1582(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)V")
	protected final void method1583(@OriginalArg(1) byte[] arg0) {
		this.anInt2416 = Static101.method1398(arg0, arg0.length);
		@Pc(19) Class2_Sub13 local19 = new Class2_Sub13(Static160.method420(arg0));
		@Pc(23) int local23 = local19.method1402();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method1396();
		}
		@Pc(55) int local55 = local19.method1402();
		@Pc(57) int local57 = -1;
		this.anInt2424 = local19.method1397();
		@Pc(64) int local64 = 0;
		this.anIntArray186 = new int[this.anInt2424];
		for (@Pc(71) int local71 = 0; local71 < this.anInt2424; local71++) {
			this.anIntArray186[local71] = local64 += local19.method1397();
			if (this.anIntArray186[local71] > local57) {
				local57 = this.anIntArray186[local71];
			}
		}
		this.anObjectArrayArray2 = new Object[local57 + 1][];
		this.anIntArray187 = new int[local57 + 1];
		this.anIntArray189 = new int[local57 + 1];
		this.anIntArray190 = new int[local57 + 1];
		this.anObjectArray3 = new Object[local57 + 1];
		this.anIntArrayArray41 = new int[local57 + 1][];
		@Pc(149) int local149;
		@Pc(168) int local168;
		if (local55 != 0) {
			this.anIntArray188 = new int[local57 + 1];
			for (local149 = 0; local149 < local57 + 1; local149++) {
				this.anIntArray188[local149] = -1;
			}
			for (local168 = 0; local168 < this.anInt2424; local168++) {
				this.anIntArray188[this.anIntArray186[local168]] = local19.method1396();
			}
			this.aClass83_2 = new Class83(this.anIntArray188);
		}
		for (local149 = 0; local149 < this.anInt2424; local149++) {
			this.anIntArray189[this.anIntArray186[local149]] = local19.method1396();
		}
		for (local168 = 0; local168 < this.anInt2424; local168++) {
			this.anIntArray187[this.anIntArray186[local168]] = local19.method1396();
		}
		for (@Pc(244) int local244 = 0; local244 < this.anInt2424; local244++) {
			this.anIntArray190[this.anIntArray186[local244]] = local19.method1397();
		}
		@Pc(272) int local272;
		@Pc(277) int local277;
		@Pc(285) int local285;
		@Pc(287) int local287;
		@Pc(304) int local304;
		for (@Pc(263) int local263 = 0; local263 < this.anInt2424; local263++) {
			local64 = 0;
			local272 = this.anIntArray186[local263];
			local277 = this.anIntArray190[local272];
			this.anIntArrayArray41[local272] = new int[local277];
			local285 = -1;
			for (local287 = 0; local287 < local277; local287++) {
				local304 = this.anIntArrayArray41[local272][local287] = local64 += local19.method1397();
				if (local304 > local285) {
					local285 = local304;
				}
			}
			this.anObjectArrayArray2[local272] = new Object[local285 + 1];
		}
		if (local55 == 0) {
			return;
		}
		this.anIntArrayArray40 = new int[local57 + 1][];
		this.aClass83Array2 = new Class83[local57 + 1];
		for (local272 = 0; local272 < this.anInt2424; local272++) {
			local277 = this.anIntArray186[local272];
			local285 = this.anIntArray190[local277];
			this.anIntArrayArray40[local277] = new int[this.anObjectArrayArray2[local277].length];
			for (local287 = 0; local287 < this.anObjectArrayArray2[local277].length; local287++) {
				this.anIntArrayArray40[local277][local287] = -1;
			}
			for (local304 = 0; local304 < local285; local304++) {
				this.anIntArrayArray40[local277][this.anIntArrayArray41[local277][local304]] = local19.method1396();
			}
			this.aClass83Array2[local277] = new Class83(this.anIntArrayArray40[local277]);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z")
	public final boolean method1584(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1596(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1596(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!ai;)V")
	public final void method1585(@OriginalArg(1) Class6 arg0) {
		@Pc(7) Class6 local7 = arg0.method115();
		@Pc(15) int local15 = this.aClass83_2.method2654(local7.method102());
		if (local15 >= 0) {
			this.method1594(local15);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)[B")
	public final byte[] method1586(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1605(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1605(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I)Z")
	private boolean method1587(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray3[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray190[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray41[arg0];
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local27[local22[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(89) byte[] local89;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local89 = Static138.method2141(this.anObjectArray3[arg0], false);
		} else {
			local89 = Static138.method2141(this.anObjectArray3[arg0], true);
			@Pc(94) Class2_Sub13 local94 = new Class2_Sub13(local89);
			local94.method1433(arg1, local94.aByteArray14.length);
		}
		@Pc(116) byte[] local116;
		try {
			local116 = Static160.method420(local89);
		} catch (@Pc(118) RuntimeException local118) {
			throw Static94.method1533(local118, "T3 - " + (arg1 != null) + "," + arg0 + "," + local89.length + "," + Static101.method1398(local89, local89.length) + "," + Static101.method1398(local89, local89.length - 2) + "," + this.anIntArray189[arg0] + "," + this.anInt2416);
		}
		if (this.aBoolean94) {
			this.anObjectArray3[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(187) int[] local187 = new int[local17];
			@Pc(190) int local190 = local116.length;
			@Pc(192) int local192 = local190 - 1;
			@Pc(197) int local197 = local116[local192] & 0xFF;
			@Pc(202) Class2_Sub13 local202 = new Class2_Sub13(local116);
			@Pc(210) int local210 = local192 - local17 * local197 * 4;
			local202.anInt2154 = local210;
			@Pc(221) int local221;
			for (@Pc(215) int local215 = 0; local215 < local197; local215++) {
				@Pc(219) int local219 = 0;
				for (local221 = 0; local221 < local17; local221++) {
					local219 += local202.method1396();
					local187[local221] += local219;
				}
			}
			@Pc(255) byte[][] local255 = new byte[local17][];
			for (local221 = 0; local221 < local17; local221++) {
				local255[local221] = new byte[local187[local221]];
				local187[local221] = 0;
			}
			local202.anInt2154 = local210;
			@Pc(283) int local283 = 0;
			@Pc(289) int local289;
			for (@Pc(285) int local285 = 0; local285 < local197; local285++) {
				local289 = 0;
				for (@Pc(291) int local291 = 0; local291 < local17; local291++) {
					local289 += local202.method1396();
					Static184.method163(local116, local283, local255[local291], local187[local291], local289);
					local283 += local289;
					local187[local291] += local289;
				}
			}
			for (local289 = 0; local289 < local17; local289++) {
				if (this.aBoolean93) {
					local27[local22[local289]] = local255[local289];
				} else {
					local27[local22[local289]] = Static10.method161(local255[local289]);
				}
			}
		} else if (this.aBoolean93) {
			local27[local22[0]] = local116;
		} else {
			local27[local22[0]] = Static10.method161(local116);
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	public final int method1588(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ai;ILclient!ai;)Z")
	public final boolean method1589(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(3) Class6 local3 = arg1.method115();
		@Pc(11) Class6 local11 = arg0.method115();
		@Pc(24) int local24 = this.aClass83_2.method2654(local3.method102());
		@Pc(34) int local34 = this.aClass83Array2[local24].method2654(local11.method102());
		return this.method1596(local34, local24);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public final void method1590() {
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray2.length; local15++) {
			if (this.anObjectArrayArray2[local15] != null) {
				for (@Pc(24) int local24 = 0; local24 < this.anObjectArrayArray2[local15].length; local24++) {
					this.anObjectArrayArray2[local15][local24] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[B")
	public final byte[] method1593(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(42) boolean local42 = this.method1587(arg1, null);
			if (!local42) {
				this.method1598(arg1);
				local42 = this.method1587(arg1, null);
				if (!local42) {
					return null;
				}
			}
		}
		return Static138.method2141(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V")
	protected void method1594(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ai;Lclient!ai;Z)[B")
	public final byte[] method1595(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		@Pc(7) Class6 local7 = arg0.method115();
		@Pc(11) Class6 local11 = arg1.method115();
		@Pc(19) int local19 = this.aClass83_2.method2654(local7.method102());
		@Pc(35) int local35 = this.aClass83Array2[local19].method2654(local11.method102());
		return this.method1605(local35, local19);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
	public final boolean method1596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray3[arg1] == null) {
			this.method1598(arg1);
			return this.anObjectArray3[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)[I")
	public final int[] method1597(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray41[arg0];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
	protected void method1598(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
	public final int method1599() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLclient!ai;)I")
	public final int method1600(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(12) Class6 local12 = arg1.method115();
		return this.aClass83Array2[arg0].method2654(local12.method102());
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
	public final boolean method1601() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray186.length; local15++) {
			@Pc(22) int local22 = this.anIntArray186[local15];
			if (this.anObjectArray3[local22] == null) {
				this.method1598(local22);
				if (this.anObjectArray3[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ai;)I")
	public final int method1602(@OriginalArg(1) Class6 arg0) {
		@Pc(9) Class6 local9 = arg0.method115();
		return this.aClass83_2.method2654(local9.method102());
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[III)[B")
	public final byte[] method1604(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg2] == null || arg1 < 0 || this.anObjectArrayArray2[arg2].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(51) boolean local51 = this.method1587(arg2, arg0);
			if (!local51) {
				this.method1598(arg2);
				local51 = this.method1587(arg2, arg0);
				if (!local51) {
					return null;
				}
			}
		}
		@Pc(77) byte[] local77 = Static138.method2141(this.anObjectArrayArray2[arg2][arg1], false);
		if (this.aBoolean93) {
			this.anObjectArrayArray2[arg2][arg1] = null;
		}
		return local77;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)[B")
	public final byte[] method1605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1604(null, arg0, arg1);
	}
}
