import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public abstract class Class26 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
	protected int[] anIntArray268;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[Lclient!sc;")
	private Class68[] aClass68Array2;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!sc;")
	private Class68 aClass68_2;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[I")
	protected int[] anIntArray270;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "I")
	protected int anInt1943;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	private int anInt1949;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "[I")
	protected int[] anIntArray272;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	public int anInt1957;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
	private final boolean aBoolean79;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Z")
	private final boolean aBoolean80;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ZZ)V")
	protected Class26(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean79 = arg1;
		this.aBoolean80 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!u;)I")
	public final int method1351(@OriginalArg(1) Class74 arg0) {
		@Pc(3) Class74 local3 = arg0.method1729();
		return this.aClass68_2.method1599(local3.method1708());
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
	public final int[] method1352(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray19[arg0];
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	public final boolean method1353() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray269.length; local9++) {
			@Pc(16) int local16 = this.anIntArray269[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method1366(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V")
	public final void method1355(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)[B")
	public final byte[] method1356(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1368(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1368(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)V")
	protected void method1357(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)[B")
	public final byte[] method1358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1364(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IZ)Z")
	public final boolean method1359(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1366(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BB)V")
	protected final void method1360(@OriginalArg(0) byte[] arg0) {
		this.anInt1957 = Static2.method22(arg0, arg0.length);
		@Pc(26) Class2_Sub10 local26 = new Class2_Sub10(Static7.method1866(arg0));
		@Pc(32) int local32 = local26.method1514();
		if (local32 != 5 && local32 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local32);
		}
		if (local32 < 6) {
			this.anInt1943 = 0;
		} else {
			this.anInt1943 = local26.method1532();
		}
		@Pc(69) int local69 = local26.method1514();
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = 0;
		this.anInt1949 = local26.method1517();
		this.anIntArray269 = new int[this.anInt1949];
		for (@Pc(85) int local85 = 0; local85 < this.anInt1949; local85++) {
			this.anIntArray269[local85] = local73 += local26.method1517();
			if (this.anIntArray269[local85] > local71) {
				local71 = this.anIntArray269[local85];
			}
		}
		this.anObjectArray2 = new Object[local71 + 1];
		this.anObjectArrayArray2 = new Object[local71 + 1][];
		this.anIntArray272 = new int[local71 + 1];
		this.anIntArray268 = new int[local71 + 1];
		this.anIntArray270 = new int[local71 + 1];
		this.anIntArrayArray19 = new int[local71 + 1][];
		@Pc(167) int local167;
		if (local69 != 0) {
			this.anIntArray271 = new int[local71 + 1];
			for (local167 = 0; local167 < this.anInt1949; local167++) {
				this.anIntArray271[this.anIntArray269[local167]] = local26.method1532();
			}
			this.aClass68_2 = new Class68(this.anIntArray271);
		}
		for (local167 = 0; local167 < this.anInt1949; local167++) {
			this.anIntArray272[this.anIntArray269[local167]] = local26.method1532();
		}
		for (@Pc(214) int local214 = 0; local214 < this.anInt1949; local214++) {
			this.anIntArray268[this.anIntArray269[local214]] = local26.method1532();
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt1949; local236++) {
			this.anIntArray270[this.anIntArray269[local236]] = local26.method1517();
		}
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(268) int local268;
		@Pc(281) int local281;
		for (@Pc(258) int local258 = 0; local258 < this.anInt1949; local258++) {
			local73 = 0;
			local266 = this.anIntArray269[local258];
			local268 = -1;
			local273 = this.anIntArray270[local266];
			this.anIntArrayArray19[local266] = new int[local273];
			for (local281 = 0; local281 < local273; local281++) {
				@Pc(297) int local297 = this.anIntArrayArray19[local266][local281] = local73 += local26.method1517();
				if (local268 < local297) {
					local268 = local297;
				}
			}
			this.anObjectArrayArray2[local266] = new Object[local268 + 1];
		}
		if (local69 == 0) {
			return;
		}
		this.aClass68Array2 = new Class68[local71 + 1];
		this.anIntArrayArray20 = new int[local71 + 1][];
		for (local266 = 0; local266 < this.anInt1949; local266++) {
			local273 = this.anIntArray269[local266];
			local268 = this.anIntArray270[local273];
			this.anIntArrayArray20[local273] = new int[this.anObjectArrayArray2[local273].length];
			for (local281 = 0; local281 < local268; local281++) {
				this.anIntArrayArray20[local273][this.anIntArrayArray19[local273][local281]] = local26.method1532();
			}
			this.aClass68Array2[local273] = new Class68(this.anIntArrayArray20[local273]);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLclient!u;)V")
	public final void method1363(@OriginalArg(1) Class74 arg0) {
		@Pc(3) Class74 local3 = arg0.method1729();
		@Pc(11) int local11 = this.aClass68_2.method1599(local3.method1708());
		if (local11 >= 0) {
			this.method1357(local11);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I)[B")
	public final byte[] method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(54) boolean local54 = this.method1373(arg2, arg0);
			if (!local54) {
				this.method1366(arg0);
				local54 = this.method1373(arg2, arg0);
				if (!local54) {
					return null;
				}
			}
		}
		@Pc(82) byte[] local82 = Static78.method1221(this.anObjectArrayArray2[arg0][arg1], false);
		if (this.aBoolean79) {
			this.anObjectArrayArray2[arg0][arg1] = null;
		}
		return local82;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)[B")
	public final byte[] method1365(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1358(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1358(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)V")
	protected void method1366(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)I")
	public final int method1367() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(III)[B")
	public final byte[] method1368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(51) boolean local51 = this.method1373(null, arg0);
			if (!local51) {
				this.method1366(arg0);
				local51 = this.method1373(null, arg0);
				if (!local51) {
					return null;
				}
			}
		}
		return Static78.method1221(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)I")
	public final int method1369(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public final void method1370() {
		for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2.length; local9++) {
			if (this.anObjectArrayArray2[local9] != null) {
				for (@Pc(17) int local17 = 0; local17 < this.anObjectArrayArray2[local9].length; local17++) {
					this.anObjectArrayArray2[local9][local17] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!u;Lclient!u;)[B")
	public final byte[] method1371(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class74 arg1) {
		@Pc(3) Class74 local3 = arg1.method1729();
		@Pc(7) Class74 local7 = arg0.method1729();
		@Pc(26) int local26 = this.aClass68_2.method1599(local3.method1708());
		@Pc(36) int local36 = this.aClass68Array2[local26].method1599(local7.method1708());
		return this.method1358(local36, local26);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!u;Lclient!u;)Z")
	public final boolean method1372(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class74 arg1) {
		@Pc(3) Class74 local3 = arg1.method1729();
		@Pc(19) Class74 local19 = arg0.method1729();
		@Pc(27) int local27 = this.aClass68_2.method1599(local3.method1708());
		@Pc(37) int local37 = this.aClass68Array2[local27].method1599(local19.method1708());
		return this.method1375(local37, local27);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([III)Z")
	private boolean method1373(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray270[arg1];
		@Pc(17) boolean local17 = true;
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg1];
		@Pc(27) int[] local27 = this.anIntArrayArray19[arg1];
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if (local22[local27[local29]] == null) {
				local17 = false;
				break;
			}
		}
		if (local17) {
			return true;
		}
		@Pc(85) byte[] local85;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local85 = Static78.method1221(this.anObjectArray2[arg1], false);
		} else {
			local85 = Static78.method1221(this.anObjectArray2[arg1], true);
			@Pc(90) Class2_Sub10 local90 = new Class2_Sub10(local85);
			local90.method1496(local90.aByteArray27.length, arg0);
		}
		@Pc(111) byte[] local111;
		try {
			local111 = Static7.method1866(local85);
		} catch (@Pc(113) RuntimeException local113) {
			throw Static87.method928(local113, "T3 - " + (arg0 != null) + "," + arg1 + "," + local85.length + "," + Static2.method22(local85, local85.length) + "," + Static2.method22(local85, local85.length - 2) + "," + this.anIntArray272[arg1] + "," + this.anInt1957);
		}
		if (this.aBoolean80) {
			this.anObjectArray2[arg1] = null;
		}
		if (local15 > 1) {
			@Pc(202) int local202 = local111.length;
			@Pc(204) int local204 = local202 - 1;
			@Pc(209) int local209 = local111[local204] & 0xFF;
			@Pc(214) Class2_Sub10 local214 = new Class2_Sub10(local111);
			@Pc(222) int local222 = local204 - local209 * 4 * local15;
			@Pc(225) int[] local225 = new int[local15];
			local214.anInt2187 = local222;
			@Pc(235) int local235;
			for (@Pc(230) int local230 = 0; local230 < local209; local230++) {
				@Pc(233) int local233 = 0;
				for (local235 = 0; local235 < local15; local235++) {
					local233 += local214.method1532();
					local225[local235] += local233;
				}
			}
			@Pc(264) byte[][] local264 = new byte[local15][];
			for (local235 = 0; local235 < local15; local235++) {
				local264[local235] = new byte[local225[local235]];
				local225[local235] = 0;
			}
			local214.anInt2187 = local222;
			@Pc(287) int local287 = 0;
			@Pc(292) int local292;
			for (@Pc(289) int local289 = 0; local289 < local209; local289++) {
				local292 = 0;
				for (@Pc(294) int local294 = 0; local294 < local15; local294++) {
					local292 += local214.method1532();
					Static133.method956(local111, local287, local264[local294], local225[local294], local292);
					local225[local294] += local292;
					local287 += local292;
				}
			}
			for (local292 = 0; local292 < local15; local292++) {
				if (this.aBoolean79) {
					local22[local27[local292]] = local264[local292];
				} else {
					local22[local27[local292]] = Static71.method1075(local264[local292]);
				}
			}
		} else if (this.aBoolean79) {
			local22[local27[0]] = local111;
		} else {
			local22[local27[0]] = Static71.method1075(local111);
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBLclient!u;)I")
	public final int method1374(@OriginalArg(0) int arg0, @OriginalArg(2) Class74 arg1) {
		@Pc(14) Class74 local14 = arg1.method1729();
		return this.aClass68Array2[arg0].method1599(local14.method1708());
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(III)Z")
	public final boolean method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method1366(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}
}
