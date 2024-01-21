import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public abstract class Class52 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
	protected int[] anIntArray127;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	private int anInt2198;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "[Lclient!kg;")
	private Class53[] aClass53Array2;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "[I")
	protected int[] anIntArray131;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lclient!kg;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "[I")
	protected int[] anIntArray133;

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ZZ)V")
	protected Class52(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean115 = arg0;
		this.aBoolean114 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public final int method1550() {
		return this.anIntArray128.length;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
	protected int method1552(@OriginalArg(1) int arg0) {
		if (this.method1573(arg0)) {
			return this.anObjectArray28[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
	public final int[] method1553(@OriginalArg(0) int arg0) {
		if (!this.method1573(arg0)) {
			return null;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray14[arg0];
		if (local15 == null) {
			local15 = new int[this.anIntArray131[arg0]];
			@Pc(25) int local25 = 0;
			while (local25 < local15.length) {
				local15[local25] = local25++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oc;II)I")
	public final int method1554(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		if (this.method1573(arg1)) {
			@Pc(23) Class70 local23 = arg0.method2021();
			@Pc(33) int local33 = this.aClass53Array2[arg1].method1549(local23.method2044());
			return this.method1577(local33, arg1) ? local33 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	protected void method1555(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([IIBI)[B")
	public final byte[] method1556(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method1577(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(37) boolean local37 = this.method1570(arg1, arg0);
			if (!local37) {
				this.method1555(arg1);
				local37 = this.method1570(arg1, arg0);
				if (!local37) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static33.method579(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean114) {
			this.anObjectArrayArray2[arg1][arg2] = null;
			if (this.anIntArray128[arg1] == 1) {
				this.anObjectArrayArray2[arg1] = null;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[B")
	public final byte[] method1557(@OriginalArg(0) int arg0) {
		if (this.anIntArray128.length == 1) {
			return this.method1581(0, arg0);
		} else if (!this.method1573(arg0)) {
			return null;
		} else if (this.anIntArray128[arg0] == 1) {
			return this.method1581(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)Z")
	public final boolean method1558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1577(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method1555(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Z")
	public final boolean method1559(@OriginalArg(0) int arg0) {
		if (!this.method1573(arg0)) {
			return false;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method1555(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!oc;)I")
	public final int method1560(@OriginalArg(1) Class70 arg0) {
		@Pc(7) Class70 local7 = arg0.method2021();
		@Pc(20) int local20 = this.aClass53_2.method1549(local7.method2044());
		return this.method1573(local20) ? local20 : -1;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)V")
	protected void method1561(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)V")
	protected final void method1563(@OriginalArg(1) byte[] arg0) {
		this.anInt2223 = Static15.method294(arg0.length, arg0);
		@Pc(17) Class3_Sub4 local17 = new Class3_Sub4(Static135.method1932(arg0));
		@Pc(23) int local23 = local17.method1278();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local17.method1245();
		}
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = local17.method1278();
		this.anInt2198 = local17.method1270();
		@Pc(64) int local64 = -1;
		this.anIntArray129 = new int[this.anInt2198];
		for (@Pc(77) int local77 = 0; local77 < this.anInt2198; local77++) {
			this.anIntArray129[local77] = local53 += local17.method1270();
			if (local64 < this.anIntArray129[local77]) {
				local64 = this.anIntArray129[local77];
			}
		}
		this.anIntArray127 = new int[local64 + 1];
		this.anIntArray128 = new int[local64 + 1];
		this.anObjectArrayArray2 = new Object[local64 + 1][];
		this.anObjectArray28 = new Object[local64 + 1];
		this.anIntArray131 = new int[local64 + 1];
		this.anIntArray133 = new int[local64 + 1];
		this.anIntArrayArray14 = new int[local64 + 1][];
		@Pc(164) int local164;
		@Pc(182) int local182;
		if (local57 != 0) {
			this.anIntArray132 = new int[local64 + 1];
			for (local164 = 0; local164 < local64 + 1; local164++) {
				this.anIntArray132[local164] = -1;
			}
			for (local182 = 0; local182 < this.anInt2198; local182++) {
				this.anIntArray132[this.anIntArray129[local182]] = local17.method1245();
			}
			this.aClass53_2 = new Class53(this.anIntArray132);
		}
		for (local164 = 0; local164 < this.anInt2198; local164++) {
			this.anIntArray133[this.anIntArray129[local164]] = local17.method1245();
		}
		for (local182 = 0; local182 < this.anInt2198; local182++) {
			this.anIntArray127[this.anIntArray129[local182]] = local17.method1245();
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt2198; local247++) {
			this.anIntArray131[this.anIntArray129[local247]] = local17.method1270();
		}
		@Pc(279) int local279;
		@Pc(284) int local284;
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(308) int local308;
		for (@Pc(269) int local269 = 0; local269 < this.anInt2198; local269++) {
			local53 = 0;
			local274 = -1;
			local279 = this.anIntArray129[local269];
			local284 = this.anIntArray131[local279];
			this.anIntArrayArray14[local279] = new int[local284];
			for (local292 = 0; local292 < local284; local292++) {
				local308 = this.anIntArrayArray14[local279][local292] = local53 += local17.method1270();
				if (local274 < local308) {
					local274 = local308;
				}
			}
			this.anIntArray128[local279] = local274 + 1;
			if (local284 == local274 + 1) {
				this.anIntArrayArray14[local279] = null;
			}
		}
		if (local57 == 0) {
			return;
		}
		this.aClass53Array2 = new Class53[local64 + 1];
		this.anIntArrayArray13 = new int[local64 + 1][];
		for (local279 = 0; local279 < this.anInt2198; local279++) {
			local284 = this.anIntArray129[local279];
			local274 = this.anIntArray131[local284];
			this.anIntArrayArray13[local284] = new int[this.anIntArray128[local284]];
			for (local292 = 0; local292 < this.anIntArray128[local284]; local292++) {
				this.anIntArrayArray13[local284][local292] = -1;
			}
			for (local308 = 0; local308 < local274; local308++) {
				@Pc(402) int local402;
				if (this.anIntArrayArray14[local284] == null) {
					local402 = local308;
				} else {
					local402 = this.anIntArrayArray14[local284][local308];
				}
				this.anIntArrayArray13[local284][local402] = local17.method1245();
			}
			this.aClass53Array2[local284] = new Class53(this.anIntArrayArray13[local284]);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!oc;)I")
	public final int method1564(@OriginalArg(1) Class70 arg0) {
		@Pc(3) Class70 local3 = arg0.method2021();
		@Pc(20) int local20 = this.aClass53_2.method1549(local3.method2044());
		return this.method1552(local20);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public final void method1565() {
		for (@Pc(1) int local1 = 0; local1 < this.anObjectArrayArray2.length; local1++) {
			this.anObjectArrayArray2[local1] = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!oc;Lclient!oc;)[B")
	public final byte[] method1566(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(12) Class70 local12 = arg1.method2021();
		@Pc(16) Class70 local16 = arg0.method2021();
		@Pc(24) int local24 = this.aClass53_2.method1549(local12.method2044());
		if (this.method1573(local24)) {
			@Pc(43) int local43 = this.aClass53Array2[local24].method1549(local16.method2044());
			return this.method1581(local24, local43);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oc;B)V")
	public final void method1567(@OriginalArg(0) Class70 arg0) {
		@Pc(3) Class70 local3 = arg0.method2021();
		@Pc(20) int local20 = this.aClass53_2.method1549(local3.method2044());
		this.method1561(local20);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)[B")
	public final byte[] method1568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1577(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method1570(arg1, null);
			if (!local29) {
				this.method1555(arg1);
				local29 = this.method1570(arg1, null);
				if (!local29) {
					return null;
				}
			}
		}
		return Static33.method579(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oc;I)Z")
	public final boolean method1569(@OriginalArg(0) Class70 arg0) {
		@Pc(15) Class70 local15 = arg0.method2021();
		@Pc(25) int local25 = this.aClass53_2.method1549(local15.method2044());
		return this.method1559(local25);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[I)Z")
	private boolean method1570(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method1573(arg0)) {
			return false;
		} else if (this.anObjectArray28[arg0] == null) {
			return false;
		} else {
			@Pc(28) int[] local28 = this.anIntArrayArray14[arg0];
			@Pc(33) int local33 = this.anIntArray131[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray128[arg0]];
			}
			@Pc(52) Object[] local52 = this.anObjectArrayArray2[arg0];
			@Pc(54) boolean local54 = true;
			for (@Pc(56) int local56 = 0; local56 < local33; local56++) {
				@Pc(61) int local61;
				if (local28 == null) {
					local61 = local56;
				} else {
					local61 = local28[local56];
				}
				if (local52[local61] == null) {
					local54 = false;
					break;
				}
			}
			if (local54) {
				return true;
			}
			@Pc(114) byte[] local114;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local114 = Static33.method579(false, this.anObjectArray28[arg0]);
			} else {
				local114 = Static33.method579(true, this.anObjectArray28[arg0]);
				@Pc(119) Class3_Sub4 local119 = new Class3_Sub4(local114);
				local119.method1254(local119.aByteArray12.length, arg1);
			}
			@Pc(140) byte[] local140;
			try {
				local140 = Static135.method1932(local114);
			} catch (@Pc(142) RuntimeException local142) {
				throw Static123.method1757(local142, "T3 - " + (arg1 != null) + "," + arg0 + "," + local114.length + "," + Static15.method294(local114.length, local114) + "," + Static15.method294(local114.length - 2, local114) + "," + this.anIntArray133[arg0] + "," + this.anInt2223);
			}
			if (this.aBoolean115) {
				this.anObjectArray28[arg0] = null;
			}
			@Pc(211) int local211;
			if (local33 > 1) {
				local211 = local140.length;
				@Pc(213) int local213 = local211 - 1;
				@Pc(218) int local218 = local140[local213] & 0xFF;
				@Pc(223) Class3_Sub4 local223 = new Class3_Sub4(local140);
				@Pc(231) int local231 = local213 - local33 * 4 * local218;
				local223.anInt1758 = local231;
				@Pc(237) int[] local237 = new int[local33];
				@Pc(244) int local244;
				for (@Pc(239) int local239 = 0; local239 < local218; local239++) {
					@Pc(242) int local242 = 0;
					for (local244 = 0; local244 < local33; local244++) {
						local242 += local223.method1245();
						local237[local244] += local242;
					}
				}
				@Pc(271) byte[][] local271 = new byte[local33][];
				for (local244 = 0; local244 < local33; local244++) {
					local271[local244] = new byte[local237[local244]];
					local237[local244] = 0;
				}
				local223.anInt1758 = local231;
				@Pc(294) int local294 = 0;
				@Pc(299) int local299;
				@Pc(301) int local301;
				for (@Pc(296) int local296 = 0; local296 < local218; local296++) {
					local299 = 0;
					for (local301 = 0; local301 < local33; local301++) {
						local299 += local223.method1245();
						Static218.method2016(local140, local294, local271[local301], local237[local301], local299);
						local237[local301] += local299;
						local294 += local299;
					}
				}
				for (local299 = 0; local299 < local33; local299++) {
					if (local28 == null) {
						local301 = local299;
					} else {
						local301 = local28[local299];
					}
					if (this.aBoolean114) {
						local52[local301] = local271[local299];
					} else {
						local52[local301] = Static135.method1929(local271[local299]);
					}
				}
			} else {
				if (local28 == null) {
					local211 = 0;
				} else {
					local211 = local28[0];
				}
				if (this.aBoolean114) {
					local52[local211] = local140;
				} else {
					local52[local211] = Static135.method1929(local140);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Z")
	public final boolean method1571() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray129.length; local9++) {
			@Pc(16) int local16 = this.anIntArray129[local9];
			if (this.anObjectArray28[local16] == null) {
				this.method1555(local16);
				if (this.anObjectArray28[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)Z")
	protected final boolean method1573(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && this.anIntArray128.length > arg0 && this.anIntArray128[arg0] != 0) {
			return true;
		} else if (Static23.aBoolean32) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
	public final int method1574() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray28.length; local11++) {
			if (this.anIntArray131[local11] > 0) {
				local3 += 100;
				local9 += this.method1552(local11);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)I")
	public final int method1575(@OriginalArg(1) int arg0) {
		return this.method1573(arg0) ? this.anIntArray128[arg0] : 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oc;Lclient!oc;I)Z")
	public final boolean method1576(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1) {
		@Pc(7) Class70 local7 = arg0.method2021();
		@Pc(13) Class70 local13 = arg1.method2021();
		@Pc(23) int local23 = this.aClass53_2.method1549(local7.method2044());
		if (this.method1573(local23)) {
			@Pc(46) int local46 = this.aClass53Array2[local23].method1549(local13.method2044());
			return this.method1558(local23, local46);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
	private boolean method1577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.anIntArray128.length > arg1 && this.anIntArray128[arg1] > arg0) {
			return true;
		} else if (Static23.aBoolean32) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(II)Z")
	public final boolean method1578(@OriginalArg(1) int arg0) {
		if (this.anIntArray128.length == 1) {
			return this.method1558(0, arg0);
		} else if (!this.method1573(arg0)) {
			return false;
		} else if (this.anIntArray128[arg0] == 1) {
			return this.method1558(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(BI)V")
	public final void method1579(@OriginalArg(1) int arg0) {
		if (this.method1573(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIZ)V")
	public final void method1580(@OriginalArg(0) boolean arg0) {
		this.anIntArrayArray13 = null;
		this.aClass53Array2 = null;
		if (arg0) {
			this.anIntArray132 = null;
			this.aClass53_2 = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)[B")
	public final byte[] method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1556(null, arg0, arg1);
	}
}
