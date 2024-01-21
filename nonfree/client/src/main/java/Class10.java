import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class10 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!f;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	protected int[] anIntArray326;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	protected int[] anIntArray327;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray27;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[Lclient!f;")
	private Class23[] aClass23Array2;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "[I")
	protected int[] anIntArray329;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	private int anInt2554;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "Z")
	private final boolean aBoolean109;

	@OriginalMember(owner = "client!c", name = "V", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ZZ)V")
	protected Class10(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean109 = arg1;
		this.aBoolean108 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!od;B)V")
	public final void method1762(@OriginalArg(0) Class60 arg0) {
		@Pc(14) Class60 local14 = arg0.method1339();
		@Pc(22) int local22 = this.aClass23_2.method501(local14.method1342());
		if (local22 >= 0) {
			this.method1764(local22);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public final void method1763() {
		for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2.length; local13++) {
			if (this.anObjectArrayArray2[local13] != null) {
				for (@Pc(22) int local22 = 0; local22 < this.anObjectArrayArray2[local13].length; local22++) {
					this.anObjectArrayArray2[local13][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	protected void method1764(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)Z")
	public final boolean method1765() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray330.length; local17++) {
			@Pc(24) int local24 = this.anIntArray330[local17];
			if (this.anObjectArray27[local24] == null) {
				this.method1767(local24);
				if (this.anObjectArray27[local24] == null) {
					local15 = false;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
	public final int method1766() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	protected void method1767(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[B")
	public final byte[] method1768(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1774(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1774(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!od;Lclient!od;)[B")
	public final byte[] method1769(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(3) Class60 local3 = arg0.method1339();
		@Pc(7) Class60 local7 = arg1.method1339();
		@Pc(27) int local27 = this.aClass23_2.method501(local3.method1342());
		@Pc(37) int local37 = this.aClass23Array2[local27].method501(local7.method1342());
		return this.method1774(local27, local37);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!od;)I")
	public final int method1770(@OriginalArg(1) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method1339();
		return this.aClass23_2.method501(local3.method1342());
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	public final int method1772(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)[I")
	public final int[] method1773(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray77[arg0];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)[B")
	public final byte[] method1774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1777(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!od;BLclient!od;)Z")
	public final boolean method1775(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(15) Class60 local15 = arg0.method1339();
		@Pc(19) Class60 local19 = arg1.method1339();
		@Pc(27) int local27 = this.aClass23_2.method501(local15.method1342());
		@Pc(37) int local37 = this.aClass23Array2[local27].method501(local19.method1342());
		return this.method1778(local27, local37);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)[B")
	public final byte[] method1776(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1783(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1783(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([IIII)[B")
	public final byte[] method1777(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || this.anObjectArrayArray2.length <= arg2 || this.anObjectArrayArray2[arg2] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg2].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(46) boolean local46 = this.method1782(arg2, arg0);
			if (!local46) {
				this.method1767(arg2);
				local46 = this.method1782(arg2, arg0);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = Static31.method481(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean109) {
			this.anObjectArrayArray2[arg2][arg1] = null;
		}
		return local72;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
	public final boolean method1778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray27[arg0] == null) {
			this.method1767(arg0);
			return this.anObjectArray27[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)V")
	protected final void method1779(@OriginalArg(1) byte[] arg0) {
		this.anInt2562 = Static122.method1920(arg0, arg0.length);
		@Pc(19) Class4_Sub9 local19 = new Class4_Sub9(Static120.method1904(arg0));
		@Pc(23) int local23 = local19.method773();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method780();
		}
		@Pc(51) int local51 = 0;
		@Pc(55) int local55 = local19.method773();
		@Pc(57) int local57 = -1;
		this.anInt2554 = local19.method816();
		this.anIntArray330 = new int[this.anInt2554];
		for (@Pc(69) int local69 = 0; local69 < this.anInt2554; local69++) {
			this.anIntArray330[local69] = local51 += local19.method816();
			if (local57 < this.anIntArray330[local69]) {
				local57 = this.anIntArray330[local69];
			}
		}
		this.anIntArray326 = new int[local57 + 1];
		this.anObjectArrayArray2 = new Object[local57 + 1][];
		this.anIntArray327 = new int[local57 + 1];
		this.anIntArray329 = new int[local57 + 1];
		this.anIntArrayArray77 = new int[local57 + 1][];
		this.anObjectArray27 = new Object[local57 + 1];
		@Pc(148) int local148;
		if (local55 != 0) {
			this.anIntArray325 = new int[local57 + 1];
			for (local148 = 0; local148 < this.anInt2554; local148++) {
				this.anIntArray325[this.anIntArray330[local148]] = local19.method780();
			}
			this.aClass23_2 = new Class23(this.anIntArray325);
		}
		for (local148 = 0; local148 < this.anInt2554; local148++) {
			this.anIntArray326[this.anIntArray330[local148]] = local19.method780();
		}
		for (@Pc(197) int local197 = 0; local197 < this.anInt2554; local197++) {
			this.anIntArray329[this.anIntArray330[local197]] = local19.method780();
		}
		for (@Pc(224) int local224 = 0; local224 < this.anInt2554; local224++) {
			this.anIntArray327[this.anIntArray330[local224]] = local19.method816();
		}
		@Pc(256) int local256;
		@Pc(263) int local263;
		@Pc(258) int local258;
		@Pc(271) int local271;
		for (@Pc(247) int local247 = 0; local247 < this.anInt2554; local247++) {
			local51 = 0;
			local256 = this.anIntArray330[local247];
			local258 = -1;
			local263 = this.anIntArray327[local256];
			this.anIntArrayArray77[local256] = new int[local263];
			for (local271 = 0; local271 < local263; local271++) {
				@Pc(288) int local288 = this.anIntArrayArray77[local256][local271] = local51 += local19.method816();
				if (local288 > local258) {
					local258 = local288;
				}
			}
			this.anObjectArrayArray2[local256] = new Object[local258 + 1];
		}
		if (local55 == 0) {
			return;
		}
		this.anIntArrayArray76 = new int[local57 + 1][];
		this.aClass23Array2 = new Class23[local57 + 1];
		for (local256 = 0; local256 < this.anInt2554; local256++) {
			local263 = this.anIntArray330[local256];
			local258 = this.anIntArray327[local263];
			this.anIntArrayArray76[local263] = new int[this.anObjectArrayArray2[local263].length];
			for (local271 = 0; local271 < local258; local271++) {
				this.anIntArrayArray76[local263][this.anIntArrayArray77[local263][local271]] = local19.method780();
			}
			this.aClass23Array2[local263] = new Class23(this.anIntArrayArray76[local263]);
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)Z")
	public final boolean method1780(@OriginalArg(0) int arg0) {
		if (this.anObjectArray27[arg0] == null) {
			this.method1767(arg0);
			return this.anObjectArray27[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I)Z")
	private boolean method1782(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray27[arg0] == null) {
			return false;
		}
		@Pc(24) int local24 = this.anIntArray327[arg0];
		@Pc(29) int[] local29 = this.anIntArrayArray77[arg0];
		@Pc(34) Object[] local34 = this.anObjectArrayArray2[arg0];
		@Pc(36) boolean local36 = true;
		for (@Pc(38) int local38 = 0; local38 < local24; local38++) {
			if (local34[local29[local38]] == null) {
				local36 = false;
				break;
			}
		}
		if (local36) {
			return true;
		}
		@Pc(87) byte[] local87;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local87 = Static31.method481(false, this.anObjectArray27[arg0]);
		} else {
			local87 = Static31.method481(true, this.anObjectArray27[arg0]);
			@Pc(102) Class4_Sub9 local102 = new Class4_Sub9(local87);
			local102.method777(local102.aByteArray6.length, arg1);
		}
		@Pc(114) byte[] local114;
		try {
			local114 = Static120.method1904(local87);
		} catch (@Pc(116) RuntimeException local116) {
			throw Static113.method784(local116, "T3 - " + (arg1 != null) + "," + arg0 + "," + local87.length + "," + Static122.method1920(local87, local87.length) + "," + Static122.method1920(local87, local87.length - 2) + "," + this.anIntArray326[arg0] + "," + this.anInt2562);
		}
		if (this.aBoolean108) {
			this.anObjectArray27[arg0] = null;
		}
		if (local24 > 1) {
			@Pc(207) int local207 = local114.length;
			@Pc(210) int local210 = local207 - 1;
			@Pc(214) int local214 = local114[local210] & 0xFF;
			@Pc(222) int local222 = local210 - local24 * local214 * 4;
			@Pc(227) Class4_Sub9 local227 = new Class4_Sub9(local114);
			@Pc(230) int[] local230 = new int[local24];
			local227.anInt1312 = local222;
			@Pc(241) int local241;
			for (@Pc(235) int local235 = 0; local235 < local214; local235++) {
				@Pc(239) int local239 = 0;
				for (local241 = 0; local241 < local24; local241++) {
					local239 += local227.method780();
					local230[local241] += local239;
				}
			}
			@Pc(275) byte[][] local275 = new byte[local24][];
			for (local241 = 0; local241 < local24; local241++) {
				local275[local241] = new byte[local230[local241]];
				local230[local241] = 0;
			}
			local227.anInt1312 = local222;
			@Pc(303) int local303 = 0;
			@Pc(309) int local309;
			for (@Pc(305) int local305 = 0; local305 < local214; local305++) {
				local309 = 0;
				for (@Pc(311) int local311 = 0; local311 < local24; local311++) {
					local309 += local227.method780();
					Static136.method700(local114, local303, local275[local311], local230[local311], local309);
					local303 += local309;
					local230[local311] += local309;
				}
			}
			for (local309 = 0; local309 < local24; local309++) {
				if (this.aBoolean109) {
					local34[local29[local309]] = local275[local309];
				} else {
					local34[local29[local309]] = Static47.method647(local275[local309]);
				}
			}
		} else if (this.aBoolean109) {
			local34[local29[0]] = local114;
		} else {
			local34[local29[0]] = Static47.method647(local114);
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[B")
	public final byte[] method1783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(57) boolean local57 = this.method1782(arg0, null);
			if (!local57) {
				this.method1767(arg0);
				local57 = this.method1782(arg0, null);
				if (!local57) {
					return null;
				}
			}
		}
		return Static31.method481(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)V")
	public final void method1784(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!od;I)I")
	public final int method1785(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class60 local8 = arg0.method1339();
		return this.aClass23Array2[arg1].method501(local8.method1342());
	}
}
