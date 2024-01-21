import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public abstract class Class41 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public int anInt2472;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "[I")
	protected int[] anIntArray382;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
	protected int[] anIntArray383;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	protected int[] anIntArray384;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "[Lclient!ke;")
	private Class42[] aClass42Array2;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt2483;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray27;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Lclient!ke;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
	protected int anInt2497;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Z")
	private final boolean aBoolean98;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ZZ)V")
	protected Class41(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean98 = arg0;
		this.aBoolean97 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!af;II)I")
	public final int method1698(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class5 local11 = arg0.method208();
		return this.aClass42Array2[arg1].method1183(local11.method211());
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)I")
	public final int method1700(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)[B")
	public final byte[] method1701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(49) boolean local49 = this.method1704(arg0, null);
			if (!local49) {
				this.method1723(arg0);
				local49 = this.method1704(arg0, null);
				if (!local49) {
					return null;
				}
			}
		}
		return Static39.method775(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!af;Lclient!af;B)Z")
	public final boolean method1702(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(3) Class5 local3 = arg0.method208();
		@Pc(7) Class5 local7 = arg1.method208();
		@Pc(15) int local15 = this.aClass42_2.method1183(local3.method211());
		@Pc(25) int local25 = this.aClass42Array2[local15].method1183(local7.method211());
		return this.method1722(local15, local25);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
	public final boolean method1703(@OriginalArg(1) int arg0) {
		if (this.anObjectArray27[arg0] == null) {
			this.method1723(arg0);
			return this.anObjectArray27[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[II)Z")
	private boolean method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray27[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray382[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray71[arg0];
		@Pc(29) boolean local29 = true;
		@Pc(34) Object[] local34 = this.anObjectArrayArray2[arg0];
		for (@Pc(36) int local36 = 0; local36 < local17; local36++) {
			if (local34[local22[local36]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(92) byte[] local92;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local92 = Static39.method775(this.anObjectArray27[arg0], false);
		} else {
			local92 = Static39.method775(this.anObjectArray27[arg0], true);
			@Pc(107) Class1_Sub20 local107 = new Class1_Sub20(local92);
			local107.method2088(arg1, local107.aByteArray36.length);
		}
		@Pc(119) byte[] local119;
		try {
			local119 = Static106.method1826(local92);
		} catch (@Pc(121) RuntimeException local121) {
			throw Static42.method786(local121, "T3 - " + (arg1 != null) + "," + arg0 + "," + local92.length + "," + Static109.method1892(local92.length, local92) + "," + Static109.method1892(local92.length - 2, local92) + "," + this.anIntArray384[arg0] + "," + this.anInt2472);
		}
		if (this.aBoolean98) {
			this.anObjectArray27[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(188) int local188 = local119.length;
			@Pc(190) int local190 = local188 - 1;
			@Pc(195) int local195 = local119[local190] & 0xFF;
			@Pc(203) int local203 = local190 - local195 * local17 * 4;
			@Pc(208) Class1_Sub20 local208 = new Class1_Sub20(local119);
			local208.anInt2951 = local203;
			@Pc(214) int[] local214 = new int[local17];
			@Pc(222) int local222;
			for (@Pc(216) int local216 = 0; local216 < local195; local216++) {
				@Pc(220) int local220 = 0;
				for (local222 = 0; local222 < local17; local222++) {
					local220 += local208.method2094();
					local214[local222] += local220;
				}
			}
			@Pc(252) byte[][] local252 = new byte[local17][];
			for (local222 = 0; local222 < local17; local222++) {
				local252[local222] = new byte[local214[local222]];
				local214[local222] = 0;
			}
			local208.anInt2951 = local203;
			@Pc(276) int local276 = 0;
			@Pc(282) int local282;
			for (@Pc(278) int local278 = 0; local278 < local195; local278++) {
				local282 = 0;
				for (@Pc(284) int local284 = 0; local284 < local17; local284++) {
					local282 += local208.method2094();
					Static138.method1878(local119, local276, local252[local284], local214[local284], local282);
					local276 += local282;
					local214[local284] += local282;
				}
			}
			for (local282 = 0; local282 < local17; local282++) {
				if (this.aBoolean97) {
					local34[local22[local282]] = local252[local282];
				} else {
					local34[local22[local282]] = Static84.method1493(local252[local282]);
				}
			}
		} else if (this.aBoolean97) {
			local34[local22[0]] = local119;
		} else {
			local34[local22[0]] = Static84.method1493(local119);
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[B")
	public final byte[] method1705(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1701(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1701(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[B")
	public final byte[] method1706(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1710(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1710(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public final void method1708() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB[II)[B")
	public final byte[] method1709(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg2] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg2].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg0] == null) {
			@Pc(49) boolean local49 = this.method1704(arg2, arg1);
			if (!local49) {
				this.method1723(arg2);
				local49 = this.method1704(arg2, arg1);
				if (!local49) {
					return null;
				}
			}
		}
		@Pc(75) byte[] local75 = Static39.method775(this.anObjectArrayArray2[arg2][arg0], false);
		if (this.aBoolean97) {
			this.anObjectArrayArray2[arg2][arg0] = null;
		}
		return local75;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)[B")
	public final byte[] method1710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1709(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!af;Lclient!af;)[B")
	public final byte[] method1711(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(7) Class5 local7 = arg1.method208();
		@Pc(11) Class5 local11 = arg0.method208();
		@Pc(28) int local28 = this.aClass42_2.method1183(local7.method211());
		@Pc(38) int local38 = this.aClass42Array2[local28].method1183(local11.method211());
		return this.method1710(local28, local38);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I")
	public final int[] method1712(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray71[arg0];
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)V")
	protected void method1713(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI)V")
	protected final void method1714(@OriginalArg(0) byte[] arg0) {
		this.anInt2472 = Static109.method1892(arg0.length, arg0);
		@Pc(19) Class1_Sub20 local19 = new Class1_Sub20(Static106.method1826(arg0));
		@Pc(23) int local23 = local19.method2053();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			this.anInt2497 = local19.method2094();
		} else {
			this.anInt2497 = 0;
		}
		@Pc(63) int local63 = local19.method2053();
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = -1;
		this.anInt2483 = local19.method2087();
		this.anIntArray386 = new int[this.anInt2483];
		for (@Pc(79) int local79 = 0; local79 < this.anInt2483; local79++) {
			this.anIntArray386[local79] = local65 += local19.method2087();
			if (this.anIntArray386[local79] > local67) {
				local67 = this.anIntArray386[local79];
			}
		}
		this.anObjectArray27 = new Object[local67 + 1];
		this.anIntArray384 = new int[local67 + 1];
		this.anIntArray383 = new int[local67 + 1];
		this.anIntArrayArray71 = new int[local67 + 1][];
		this.anObjectArrayArray2 = new Object[local67 + 1][];
		this.anIntArray382 = new int[local67 + 1];
		@Pc(161) int local161;
		if (local63 != 0) {
			this.anIntArray385 = new int[local67 + 1];
			for (local161 = 0; local161 < this.anInt2483; local161++) {
				this.anIntArray385[this.anIntArray386[local161]] = local19.method2094();
			}
			this.aClass42_2 = new Class42(this.anIntArray385);
		}
		for (local161 = 0; local161 < this.anInt2483; local161++) {
			this.anIntArray384[this.anIntArray386[local161]] = local19.method2094();
		}
		for (@Pc(210) int local210 = 0; local210 < this.anInt2483; local210++) {
			this.anIntArray383[this.anIntArray386[local210]] = local19.method2094();
		}
		for (@Pc(233) int local233 = 0; local233 < this.anInt2483; local233++) {
			this.anIntArray382[this.anIntArray386[local233]] = local19.method2087();
		}
		@Pc(263) int local263;
		@Pc(270) int local270;
		@Pc(272) int local272;
		@Pc(280) int local280;
		for (@Pc(256) int local256 = 0; local256 < this.anInt2483; local256++) {
			local263 = this.anIntArray386[local256];
			local65 = 0;
			local270 = this.anIntArray382[local263];
			local272 = -1;
			this.anIntArrayArray71[local263] = new int[local270];
			for (local280 = 0; local280 < local270; local280++) {
				@Pc(297) int local297 = this.anIntArrayArray71[local263][local280] = local65 += local19.method2087();
				if (local297 > local272) {
					local272 = local297;
				}
			}
			this.anObjectArrayArray2[local263] = new Object[local272 + 1];
		}
		if (local63 == 0) {
			return;
		}
		this.anIntArrayArray72 = new int[local67 + 1][];
		this.aClass42Array2 = new Class42[local67 + 1];
		for (local263 = 0; local263 < this.anInt2483; local263++) {
			local270 = this.anIntArray386[local263];
			local272 = this.anIntArray382[local270];
			this.anIntArrayArray72[local270] = new int[this.anObjectArrayArray2[local270].length];
			for (local280 = 0; local280 < local272; local280++) {
				this.anIntArrayArray72[local270][this.anIntArrayArray71[local270][local280]] = local19.method2094();
			}
			this.aClass42Array2[local270] = new Class42(this.anIntArrayArray72[local270]);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!af;)V")
	public final void method1716(@OriginalArg(1) Class5 arg0) {
		@Pc(3) Class5 local3 = arg0.method208();
		@Pc(17) int local17 = this.aClass42_2.method1183(local3.method211());
		if (local17 >= 0) {
			this.method1713(local17);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)Z")
	public final boolean method1719() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray386.length; local9++) {
			@Pc(16) int local16 = this.anIntArray386[local9];
			if (this.anObjectArray27[local16] == null) {
				this.method1723(local16);
				if (this.anObjectArray27[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)I")
	public final int method1720() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)V")
	public final void method1721(@OriginalArg(0) int arg0) {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2[arg0].length; local5++) {
			this.anObjectArrayArray2[arg0][local5] = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)Z")
	public final boolean method1722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray27[arg0] == null) {
			this.method1723(arg0);
			return this.anObjectArray27[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)V")
	protected void method1723(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!af;I)I")
	public final int method1724(@OriginalArg(0) Class5 arg0) {
		@Pc(8) Class5 local8 = arg0.method208();
		return this.aClass42_2.method1183(local8.method211());
	}
}
