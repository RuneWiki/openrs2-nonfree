import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public abstract class Class7 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!ja;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
	protected int[] anIntArray23;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[Lclient!ja;")
	private Class36[] aClass36Array2;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
	protected int[] anIntArray24;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "[I")
	protected int[] anIntArray27;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Z")
	private final boolean aBoolean6;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
	private final boolean aBoolean5;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ZZ)V")
	protected Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean6 = arg0;
		this.aBoolean5 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rd;I)I")
	public final int method91(@OriginalArg(0) Class63 arg0) {
		@Pc(7) Class63 local7 = arg0.method1829();
		return this.aClass36_2.method1129(local7.method1798());
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)Z")
	private boolean method92(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray27[arg1];
		@Pc(22) int[] local22 = this.anIntArrayArray4[arg1];
		@Pc(30) boolean local30 = true;
		@Pc(35) Object[] local35 = this.anObjectArrayArray2[arg1];
		for (@Pc(37) int local37 = 0; local37 < local17; local37++) {
			if (local35[local22[local37]] == null) {
				local30 = false;
				break;
			}
		}
		if (local30) {
			return true;
		}
		@Pc(89) byte[] local89;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local89 = Static118.method2112(false, this.anObjectArray2[arg1]);
		} else {
			local89 = Static118.method2112(true, this.anObjectArray2[arg1]);
			@Pc(104) Class6_Sub4 local104 = new Class6_Sub4(local89);
			local104.method1329(arg0, local104.aByteArray27.length);
		}
		@Pc(116) byte[] local116;
		try {
			local116 = Static110.method2036(local89);
		} catch (@Pc(118) RuntimeException local118) {
			throw Static54.method1088(local118, "T3 - " + (arg0 != null) + "," + arg1 + "," + local89.length + "," + Static13.method343(local89.length, local89) + "," + Static13.method343(local89.length - 2, local89) + "," + this.anIntArray24[arg1] + "," + this.anInt146);
		}
		if (this.aBoolean6) {
			this.anObjectArray2[arg1] = null;
		}
		if (local17 <= 1) {
			local35[local22[0]] = Static99.method1835(local116);
		} else {
			@Pc(196) int local196 = local116.length;
			@Pc(198) int local198 = local196 - 1;
			@Pc(203) int local203 = local116[local198] & 0xFF;
			@Pc(208) Class6_Sub4 local208 = new Class6_Sub4(local116);
			@Pc(211) int[] local211 = new int[local17];
			@Pc(219) int local219 = local198 - local203 * 4 * local17;
			local208.anInt1949 = local219;
			@Pc(230) int local230;
			for (@Pc(224) int local224 = 0; local224 < local203; local224++) {
				@Pc(228) int local228 = 0;
				for (local230 = 0; local230 < local17; local230++) {
					local228 += local208.method1289();
					local211[local230] += local228;
				}
			}
			@Pc(260) byte[][] local260 = new byte[local17][];
			for (local230 = 0; local230 < local17; local230++) {
				local260[local230] = new byte[local211[local230]];
				local211[local230] = 0;
			}
			local208.anInt1949 = local219;
			@Pc(288) int local288 = 0;
			@Pc(294) int local294;
			for (@Pc(290) int local290 = 0; local290 < local203; local290++) {
				local294 = 0;
				for (@Pc(296) int local296 = 0; local296 < local17; local296++) {
					local294 += local208.method1289();
					Static129.method1440(local116, local288, local260[local296], local211[local296], local294);
					local288 += local294;
					local211[local296] += local294;
				}
			}
			for (local294 = 0; local294 < local17; local294++) {
				local35[local22[local294]] = Static99.method1835(local260[local294]);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	public final int method93() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	protected void method94(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	protected void method96(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
	public final void method97(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Z")
	public final boolean method98(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method94(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rd;Lclient!rd;)Z")
	public final boolean method99(@OriginalArg(1) Class63 arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(12) Class63 local12 = arg0.method1829();
		@Pc(22) Class63 local22 = arg1.method1829();
		@Pc(32) int local32 = this.aClass36_2.method1129(local12.method1798());
		@Pc(42) int local42 = this.aClass36Array2[local32].method1129(local22.method1798());
		return this.method109(local32, local42);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	public final boolean method100() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray25.length; local9++) {
			@Pc(16) int local16 = this.anIntArray25[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method94(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public final void method101() {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2.length; local11++) {
			if (this.anObjectArrayArray2[local11] != null) {
				for (@Pc(20) int local20 = 0; local20 < this.anObjectArrayArray2[local11].length; local20++) {
					this.anObjectArrayArray2[local11][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)I")
	public final int method103(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rd;ZLclient!rd;)[B")
	public final byte[] method104(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(7) Class63 local7 = arg1.method1829();
		@Pc(11) Class63 local11 = arg0.method1829();
		@Pc(24) int local24 = this.aClass36_2.method1129(local7.method1798());
		@Pc(34) int local34 = this.aClass36Array2[local24].method1129(local11.method1798());
		return this.method110(local24, local34);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rd;)V")
	public final void method105(@OriginalArg(1) Class63 arg0) {
		@Pc(7) Class63 local7 = arg0.method1829();
		@Pc(15) int local15 = this.aClass36_2.method1129(local7.method1798());
		if (local15 >= 0) {
			this.method96(local15);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[IB)[B")
	public final byte[] method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(53) boolean local53 = this.method92(arg2, arg1);
			if (!local53) {
				this.method94(arg1);
				local53 = this.method92(arg2, arg1);
				if (!local53) {
					return null;
				}
			}
		}
		@Pc(79) byte[] local79 = Static118.method2112(false, this.anObjectArrayArray2[arg1][arg0]);
		if (this.aBoolean5) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local79;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rd;I)I")
	public final int method107(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(7) Class63 local7 = arg1.method1829();
		return this.aClass36Array2[arg0].method1129(local7.method1798());
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
	public final boolean method109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method94(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)[B")
	public final byte[] method110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method106(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[B")
	public final byte[] method111(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method114(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method114(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(ZI)[I")
	public final int[] method113(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray4[arg0];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)[B")
	public final byte[] method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(55) boolean local55 = this.method92(null, arg1);
			if (!local55) {
				this.method94(arg1);
				local55 = this.method92(null, arg1);
				if (!local55) {
					return null;
				}
			}
		}
		return Static118.method2112(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(ZI)Z")
	public final boolean method115(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method109(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method109(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B)V")
	protected final void method116(@OriginalArg(1) byte[] arg0) {
		this.anInt146 = Static13.method343(arg0.length, arg0);
		@Pc(17) Class6_Sub4 local17 = new Class6_Sub4(Static110.method2036(arg0));
		@Pc(21) int local21 = local17.method1321();
		if (local21 != 5) {
			return;
		}
		@Pc(35) int local35 = local17.method1321();
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = 0;
		this.anInt128 = local17.method1306();
		this.anIntArray25 = new int[this.anInt128];
		for (@Pc(51) int local51 = 0; local51 < this.anInt128; local51++) {
			this.anIntArray25[local51] = local39 += local17.method1306();
			if (local37 < this.anIntArray25[local51]) {
				local37 = this.anIntArray25[local51];
			}
		}
		this.anObjectArray2 = new Object[local37 + 1];
		this.anIntArray23 = new int[local37 + 1];
		this.anIntArray27 = new int[local37 + 1];
		this.anObjectArrayArray2 = new Object[local37 + 1][];
		this.anIntArray24 = new int[local37 + 1];
		this.anIntArrayArray4 = new int[local37 + 1][];
		@Pc(129) int local129;
		if (local35 != 0) {
			this.anIntArray26 = new int[local37 + 1];
			for (local129 = 0; local129 < this.anInt128; local129++) {
				this.anIntArray26[this.anIntArray25[local129]] = local17.method1289();
			}
			this.aClass36_2 = new Class36(this.anIntArray26);
		}
		for (local129 = 0; local129 < this.anInt128; local129++) {
			this.anIntArray24[this.anIntArray25[local129]] = local17.method1289();
		}
		for (@Pc(172) int local172 = 0; local172 < this.anInt128; local172++) {
			this.anIntArray23[this.anIntArray25[local172]] = local17.method1289();
		}
		for (@Pc(190) int local190 = 0; local190 < this.anInt128; local190++) {
			this.anIntArray27[this.anIntArray25[local190]] = local17.method1306();
		}
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(217) int local217;
		@Pc(235) int local235;
		for (@Pc(212) int local212 = 0; local212 < this.anInt128; local212++) {
			local39 = 0;
			local217 = -1;
			local222 = this.anIntArray25[local212];
			local227 = this.anIntArray27[local222];
			this.anIntArrayArray4[local222] = new int[local227];
			for (local235 = 0; local235 < local227; local235++) {
				@Pc(251) int local251 = this.anIntArrayArray4[local222][local235] = local39 += local17.method1306();
				if (local217 < local251) {
					local217 = local251;
				}
			}
			this.anObjectArrayArray2[local222] = new Object[local217 + 1];
		}
		if (local35 == 0) {
			return;
		}
		this.anIntArrayArray3 = new int[local37 + 1][];
		this.aClass36Array2 = new Class36[local37 + 1];
		for (local222 = 0; local222 < this.anInt128; local222++) {
			local227 = this.anIntArray25[local222];
			local217 = this.anIntArray27[local227];
			this.anIntArrayArray3[local227] = new int[this.anObjectArrayArray2[local227].length];
			for (local235 = 0; local235 < local217; local235++) {
				this.anIntArrayArray3[local227][this.anIntArrayArray4[local227][local235]] = local17.method1289();
			}
			this.aClass36Array2[local227] = new Class36(this.anIntArrayArray3[local227]);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[B")
	public final byte[] method117(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method110(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method110(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
