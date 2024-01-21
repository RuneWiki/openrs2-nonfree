import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public abstract class Class16 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	private int anInt3197;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public int anInt3198;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
	protected int[] anIntArray281;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
	protected int[] anIntArray283;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray93;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "[Lclient!qc;")
	private Class61[] aClass61Array2;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
	protected int[] anIntArray284;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!qc;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray94;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Z")
	private final boolean aBoolean135;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Z")
	private final boolean aBoolean136;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ZZ)V")
	protected Class16(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean135 = arg1;
		this.aBoolean136 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
	public final int method2231() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BI)V")
	protected final void method2232(@OriginalArg(0) byte[] arg0) {
		this.anInt3198 = Static101.method2133(arg0, arg0.length);
		@Pc(15) Class1_Sub6 local15 = new Class1_Sub6(Static81.method1794(arg0));
		@Pc(23) int local23 = local15.method544();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local15.method499();
		}
		@Pc(55) int local55 = local15.method544();
		this.anInt3197 = local15.method546();
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = -1;
		this.anIntArray285 = new int[this.anInt3197];
		for (@Pc(71) int local71 = 0; local71 < this.anInt3197; local71++) {
			this.anIntArray285[local71] = local62 += local15.method546();
			if (local64 < this.anIntArray285[local71]) {
				local64 = this.anIntArray285[local71];
			}
		}
		this.anObjectArray29 = new Object[local64 + 1];
		this.anIntArrayArray93 = new int[local64 + 1][];
		this.anIntArray283 = new int[local64 + 1];
		this.anIntArray284 = new int[local64 + 1];
		this.anObjectArrayArray2 = new Object[local64 + 1][];
		this.anIntArray281 = new int[local64 + 1];
		@Pc(154) int local154;
		@Pc(173) int local173;
		if (local55 != 0) {
			this.anIntArray282 = new int[local64 + 1];
			for (local154 = 0; local154 < local64 + 1; local154++) {
				this.anIntArray282[local154] = -1;
			}
			for (local173 = 0; local173 < this.anInt3197; local173++) {
				this.anIntArray282[this.anIntArray285[local173]] = local15.method499();
			}
			this.aClass61_2 = new Class61(this.anIntArray282);
		}
		for (local154 = 0; local154 < this.anInt3197; local154++) {
			this.anIntArray284[this.anIntArray285[local154]] = local15.method499();
		}
		for (local173 = 0; local173 < this.anInt3197; local173++) {
			this.anIntArray283[this.anIntArray285[local173]] = local15.method499();
		}
		for (@Pc(245) int local245 = 0; local245 < this.anInt3197; local245++) {
			this.anIntArray281[this.anIntArray285[local245]] = local15.method546();
		}
		@Pc(277) int local277;
		@Pc(282) int local282;
		@Pc(284) int local284;
		@Pc(292) int local292;
		@Pc(311) int local311;
		for (@Pc(268) int local268 = 0; local268 < this.anInt3197; local268++) {
			local62 = 0;
			local277 = this.anIntArray285[local268];
			local282 = this.anIntArray281[local277];
			local284 = -1;
			this.anIntArrayArray93[local277] = new int[local282];
			for (local292 = 0; local292 < local282; local292++) {
				local311 = this.anIntArrayArray93[local277][local292] = local62 += local15.method546();
				if (local311 > local284) {
					local284 = local311;
				}
			}
			this.anObjectArrayArray2[local277] = new Object[local284 + 1];
		}
		if (local55 == 0) {
			return;
		}
		this.aClass61Array2 = new Class61[local64 + 1];
		this.anIntArrayArray94 = new int[local64 + 1][];
		for (local277 = 0; local277 < this.anInt3197; local277++) {
			local282 = this.anIntArray285[local277];
			local284 = this.anIntArray281[local282];
			this.anIntArrayArray94[local282] = new int[this.anObjectArrayArray2[local282].length];
			for (local292 = 0; local292 < this.anObjectArrayArray2[local282].length; local292++) {
				this.anIntArrayArray94[local282][local292] = -1;
			}
			for (local311 = 0; local311 < local284; local311++) {
				this.anIntArrayArray94[local282][this.anIntArrayArray93[local282][local311]] = local15.method499();
			}
			this.aClass61Array2[local282] = new Class61(this.anIntArrayArray94[local282]);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)[B")
	public final byte[] method2233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(47) boolean local47 = this.method2255(null, arg1);
			if (!local47) {
				this.method2241(arg1);
				local47 = this.method2255(null, arg1);
				if (!local47) {
					return null;
				}
			}
		}
		return Static58.method1196(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[B")
	public final byte[] method2234(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2254(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2254(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z")
	public final boolean method2235(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2238(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2238(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[I)[B")
	public final byte[] method2236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(46) boolean local46 = this.method2255(arg2, arg1);
			if (!local46) {
				this.method2241(arg1);
				local46 = this.method2255(arg2, arg1);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = Static58.method1196(false, this.anObjectArrayArray2[arg1][arg0]);
		if (this.aBoolean135) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local72;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Z")
	public final boolean method2237() {
		@Pc(7) boolean local7 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray285.length; local17++) {
			@Pc(24) int local24 = this.anIntArray285[local17];
			if (this.anObjectArray29[local24] == null) {
				this.method2241(local24);
				if (this.anObjectArray29[local24] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)Z")
	public final boolean method2238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method2241(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)V")
	protected void method2240(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
	protected void method2241(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(IB)[I")
	public final int[] method2242(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray93[arg0];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ea;B)V")
	public final void method2244(@OriginalArg(0) Class18 arg0) {
		@Pc(7) Class18 local7 = arg0.method722();
		@Pc(15) int local15 = this.aClass61_2.method2494(local7.method737());
		if (local15 >= 0) {
			this.method2240(local15);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ea;)I")
	public final int method2246(@OriginalArg(1) Class18 arg0) {
		@Pc(14) Class18 local14 = arg0.method722();
		return this.aClass61_2.method2494(local14.method737());
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
	public final void method2247(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Z")
	public final boolean method2248(@OriginalArg(1) int arg0) {
		if (this.anObjectArray29[arg0] == null) {
			this.method2241(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ea;Lclient!ea;)[B")
	public final byte[] method2249(@OriginalArg(1) Class18 arg0, @OriginalArg(2) Class18 arg1) {
		@Pc(3) Class18 local3 = arg0.method722();
		@Pc(7) Class18 local7 = arg1.method722();
		@Pc(19) int local19 = this.aClass61_2.method2494(local3.method737());
		@Pc(37) int local37 = this.aClass61Array2[local19].method2494(local7.method737());
		return this.method2254(local37, local19);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public final void method2250() {
		for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2.length; local12++) {
			if (this.anObjectArrayArray2[local12] != null) {
				for (@Pc(21) int local21 = 0; local21 < this.anObjectArrayArray2[local12].length; local21++) {
					this.anObjectArrayArray2[local12][local21] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ea;II)I")
	public final int method2251(@OriginalArg(0) Class18 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class18 local12 = arg0.method722();
		return this.aClass61Array2[arg1].method2494(local12.method737());
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)I")
	public final int method2252(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ea;Lclient!ea;I)Z")
	public final boolean method2253(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1) {
		@Pc(3) Class18 local3 = arg0.method722();
		@Pc(17) Class18 local17 = arg1.method722();
		@Pc(25) int local25 = this.aClass61_2.method2494(local3.method737());
		@Pc(35) int local35 = this.aClass61Array2[local25].method2494(local17.method737());
		return this.method2238(local25, local35);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(III)[B")
	public final byte[] method2254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2236(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[II)Z")
	private boolean method2255(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray29[arg1] == null) {
			return false;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray93[arg1];
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg1];
		@Pc(27) int local27 = this.anIntArray281[arg1];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			if (local22[local17[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(89) byte[] local89;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local89 = Static58.method1196(false, this.anObjectArray29[arg1]);
		} else {
			local89 = Static58.method1196(true, this.anObjectArray29[arg1]);
			@Pc(94) Class1_Sub6 local94 = new Class1_Sub6(local89);
			local94.method547(local94.aByteArray3.length, arg0);
		}
		@Pc(116) byte[] local116;
		try {
			local116 = Static81.method1794(local89);
		} catch (@Pc(118) RuntimeException local118) {
			throw Static42.method846(local118, "T3 - " + (arg0 != null) + "," + arg1 + "," + local89.length + "," + Static101.method2133(local89, local89.length) + "," + Static101.method2133(local89, local89.length - 2) + "," + this.anIntArray284[arg1] + "," + this.anInt3198);
		}
		if (this.aBoolean136) {
			this.anObjectArray29[arg1] = null;
		}
		if (local27 > 1) {
			@Pc(185) int local185 = local116.length;
			@Pc(188) int local188 = local185 - 1;
			@Pc(192) int local192 = local116[local188] & 0xFF;
			@Pc(197) Class1_Sub6 local197 = new Class1_Sub6(local116);
			@Pc(205) int local205 = local188 - local192 * 4 * local27;
			local197.anInt839 = local205;
			@Pc(211) int[] local211 = new int[local27];
			@Pc(219) int local219;
			for (@Pc(213) int local213 = 0; local213 < local192; local213++) {
				@Pc(217) int local217 = 0;
				for (local219 = 0; local219 < local27; local219++) {
					local217 += local197.method499();
					local211[local219] += local217;
				}
			}
			@Pc(253) byte[][] local253 = new byte[local27][];
			for (local219 = 0; local219 < local27; local219++) {
				local253[local219] = new byte[local211[local219]];
				local211[local219] = 0;
			}
			local197.anInt839 = local205;
			@Pc(277) int local277 = 0;
			@Pc(283) int local283;
			for (@Pc(279) int local279 = 0; local279 < local192; local279++) {
				local283 = 0;
				for (@Pc(285) int local285 = 0; local285 < local27; local285++) {
					local283 += local197.method499();
					Static185.method2279(local116, local277, local253[local285], local211[local285], local283);
					local277 += local283;
					local211[local285] += local283;
				}
			}
			for (local283 = 0; local283 < local27; local283++) {
				if (this.aBoolean135) {
					local22[local17[local283]] = local253[local283];
				} else {
					local22[local17[local283]] = Static177.method3181(local253[local283]);
				}
			}
		} else if (this.aBoolean135) {
			local22[local17[0]] = local116;
		} else {
			local22[local17[0]] = Static177.method3181(local116);
		}
		return true;
	}
}
