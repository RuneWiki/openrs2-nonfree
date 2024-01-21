import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class25 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!c;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	protected int[] anIntArray154;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[I")
	protected int[] anIntArray155;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[Lclient!c;")
	private Class12[] aClass12Array2;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
	protected int[] anIntArray156;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
	public int anInt1358;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	protected int anInt1359;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Z")
	private final boolean aBoolean41;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ZZ)V")
	protected Class25(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean41 = arg0;
		this.aBoolean42 = arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)V")
	public final void method909(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	public final int method910() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)I")
	public final int method911(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)V")
	protected void method912(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)[B")
	public final byte[] method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(46) boolean local46 = this.method933(arg0, null);
			if (!local46) {
				this.method915(arg0);
				local46 = this.method933(arg0, null);
				if (!local46) {
					return null;
				}
			}
		}
		return Static128.method2289(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!qf;Lclient!qf;)[B")
	public final byte[] method914(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(12) Class60 local12 = arg1.method1846();
		@Pc(16) Class60 local16 = arg0.method1846();
		@Pc(24) int local24 = this.aClass12_2.method307(local12.method1855());
		@Pc(34) int local34 = this.aClass12Array2[local24].method307(local16.method1855());
		return this.method931(local34, local24);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(IB)V")
	protected void method915(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Z")
	public final boolean method916() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray157.length; local9++) {
			@Pc(16) int local16 = this.anIntArray157[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method915(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BZ)V")
	protected final void method917(@OriginalArg(0) byte[] arg0) {
		this.anInt1358 = Static16.method486(arg0, arg0.length);
		@Pc(19) Class3_Sub12 local19 = new Class3_Sub12(Static43.method972(arg0));
		@Pc(23) int local23 = local19.method1936();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 < 6) {
			this.anInt1359 = 0;
		} else {
			this.anInt1359 = local19.method1920();
		}
		@Pc(62) int local62 = local19.method1936();
		this.anInt1346 = local19.method1963();
		@Pc(69) int local69 = -1;
		@Pc(71) int local71 = 0;
		this.anIntArray157 = new int[this.anInt1346];
		for (@Pc(78) int local78 = 0; local78 < this.anInt1346; local78++) {
			this.anIntArray157[local78] = local71 += local19.method1963();
			if (this.anIntArray157[local78] > local69) {
				local69 = this.anIntArray157[local78];
			}
		}
		this.anIntArrayArray41 = new int[local69 + 1][];
		this.anObjectArrayArray2 = new Object[local69 + 1][];
		this.anIntArray154 = new int[local69 + 1];
		this.anIntArray155 = new int[local69 + 1];
		this.anObjectArray2 = new Object[local69 + 1];
		this.anIntArray156 = new int[local69 + 1];
		@Pc(156) int local156;
		if (local62 != 0) {
			this.anIntArray158 = new int[local69 + 1];
			for (local156 = 0; local156 < this.anInt1346; local156++) {
				this.anIntArray158[this.anIntArray157[local156]] = local19.method1920();
			}
			this.aClass12_2 = new Class12(this.anIntArray158);
		}
		for (local156 = 0; local156 < this.anInt1346; local156++) {
			this.anIntArray156[this.anIntArray157[local156]] = local19.method1920();
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt1346; local209++) {
			this.anIntArray154[this.anIntArray157[local209]] = local19.method1920();
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt1346; local228++) {
			this.anIntArray155[this.anIntArray157[local228]] = local19.method1963();
		}
		@Pc(256) int local256;
		@Pc(263) int local263;
		@Pc(258) int local258;
		@Pc(271) int local271;
		for (@Pc(247) int local247 = 0; local247 < this.anInt1346; local247++) {
			local71 = 0;
			local256 = this.anIntArray157[local247];
			local258 = -1;
			local263 = this.anIntArray155[local256];
			this.anIntArrayArray41[local256] = new int[local263];
			for (local271 = 0; local271 < local263; local271++) {
				@Pc(288) int local288 = this.anIntArrayArray41[local256][local271] = local71 += local19.method1963();
				if (local258 < local288) {
					local258 = local288;
				}
			}
			this.anObjectArrayArray2[local256] = new Object[local258 + 1];
		}
		if (local62 == 0) {
			return;
		}
		this.aClass12Array2 = new Class12[local69 + 1];
		this.anIntArrayArray40 = new int[local69 + 1][];
		for (local256 = 0; local256 < this.anInt1346; local256++) {
			local263 = this.anIntArray157[local256];
			local258 = this.anIntArray155[local263];
			this.anIntArrayArray40[local263] = new int[this.anObjectArrayArray2[local263].length];
			for (local271 = 0; local271 < local258; local271++) {
				this.anIntArrayArray40[local263][this.anIntArrayArray41[local263][local271]] = local19.method1920();
			}
			this.aClass12Array2[local263] = new Class12(this.anIntArrayArray40[local263]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)Z")
	public final boolean method918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method915(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Z")
	public final boolean method919(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method915(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!qf;)I")
	public final int method920(@OriginalArg(1) Class60 arg0) {
		@Pc(11) Class60 local11 = arg0.method1846();
		return this.aClass12_2.method307(local11.method1855());
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILclient!qf;)I")
	public final int method922(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(7) Class60 local7 = arg1.method1846();
		return this.aClass12Array2[arg0].method307(local7.method1855());
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(BLclient!qf;)V")
	public final void method923(@OriginalArg(1) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method1846();
		@Pc(15) int local15 = this.aClass12_2.method307(local3.method1855());
		if (local15 >= 0) {
			this.method912(local15);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[B")
	public final byte[] method924(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method913(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method913(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qf;ILclient!qf;)Z")
	public final boolean method925(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(15) Class60 local15 = arg1.method1846();
		@Pc(19) Class60 local19 = arg0.method1846();
		@Pc(27) int local27 = this.aClass12_2.method307(local15.method1855());
		@Pc(37) int local37 = this.aClass12Array2[local27].method307(local19.method1855());
		return this.method918(local27, local37);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)[B")
	public final byte[] method928(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method931(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method931(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public final void method929() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IZ)[I")
	public final int[] method930(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray41[arg0];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZII)[B")
	public final byte[] method931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method932(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[III)[B")
	public final byte[] method932(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(40) boolean local40 = this.method933(arg1, arg0);
			if (!local40) {
				this.method915(arg1);
				local40 = this.method933(arg1, arg0);
				if (!local40) {
					return null;
				}
			}
		}
		@Pc(68) byte[] local68 = Static128.method2289(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean42) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local68;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[I)Z")
	private boolean method933(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(22) int local22 = this.anIntArray155[arg0];
		@Pc(27) int[] local27 = this.anIntArrayArray41[arg0];
		@Pc(32) Object[] local32 = this.anObjectArrayArray2[arg0];
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < local22; local36++) {
			if (local32[local27[local36]] == null) {
				local34 = false;
				break;
			}
		}
		if (local34) {
			return true;
		}
		@Pc(95) byte[] local95;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local95 = Static128.method2289(false, this.anObjectArray2[arg0]);
		} else {
			local95 = Static128.method2289(true, this.anObjectArray2[arg0]);
			@Pc(112) Class3_Sub12 local112 = new Class3_Sub12(local95);
			local112.method1947(arg1, local112.aByteArray77.length);
		}
		@Pc(124) byte[] local124;
		try {
			local124 = Static43.method972(local95);
		} catch (@Pc(126) RuntimeException local126) {
			throw Static57.method2261(local126, "T3 - " + (arg1 != null) + "," + arg0 + "," + local95.length + "," + Static16.method486(local95, local95.length) + "," + Static16.method486(local95, local95.length - 2) + "," + this.anIntArray156[arg0] + "," + this.anInt1358);
		}
		if (this.aBoolean41) {
			this.anObjectArray2[arg0] = null;
		}
		if (local22 > 1) {
			@Pc(195) int local195 = local124.length;
			@Pc(198) int local198 = local195 - 1;
			@Pc(202) int local202 = local124[local198] & 0xFF;
			@Pc(207) Class3_Sub12 local207 = new Class3_Sub12(local124);
			@Pc(215) int local215 = local198 - local202 * local22 * 4;
			@Pc(218) int[] local218 = new int[local22];
			local207.anInt2886 = local215;
			@Pc(229) int local229;
			for (@Pc(223) int local223 = 0; local223 < local202; local223++) {
				@Pc(227) int local227 = 0;
				for (local229 = 0; local229 < local22; local229++) {
					local227 += local207.method1920();
					local218[local229] += local227;
				}
			}
			@Pc(263) byte[][] local263 = new byte[local22][];
			for (local229 = 0; local229 < local22; local229++) {
				local263[local229] = new byte[local218[local229]];
				local218[local229] = 0;
			}
			local207.anInt2886 = local215;
			@Pc(287) int local287 = 0;
			@Pc(293) int local293;
			for (@Pc(289) int local289 = 0; local289 < local202; local289++) {
				local293 = 0;
				for (@Pc(295) int local295 = 0; local295 < local22; local295++) {
					local293 += local207.method1920();
					Static135.method1705(local124, local287, local263[local295], local218[local295], local293);
					local287 += local293;
					local218[local295] += local293;
				}
			}
			for (local293 = 0; local293 < local22; local293++) {
				if (this.aBoolean42) {
					local32[local27[local293]] = local263[local293];
				} else {
					local32[local27[local293]] = Static129.method2299(local263[local293]);
				}
			}
		} else if (this.aBoolean42) {
			local32[local27[0]] = local124;
		} else {
			local32[local27[0]] = Static129.method2299(local124);
		}
		return true;
	}
}
