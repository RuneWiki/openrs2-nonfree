import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public abstract class Class40 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
	protected int[] anIntArray174;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "[[B")
	protected byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "[I")
	protected int[] anIntArray176;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private int anInt1791;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
	public int anInt1797;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "[Lclient!wa;")
	private Class67[] aClass67Array2;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "Lclient!wa;")
	private Class67 aClass67_2;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "[I")
	protected int[] anIntArray178;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "Z")
	private final boolean aBoolean83;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "Z")
	private final boolean aBoolean82;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ZZ)V")
	protected Class40(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean83 = arg1;
		this.aBoolean82 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)Z")
	public final boolean method1223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray11.length <= arg0 || this.aByteArrayArrayArray11[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray11[arg0].length) {
			return false;
		} else if (this.aByteArrayArrayArray11[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray4[arg0] == null) {
			this.method1226(arg0);
			return this.aByteArrayArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public final int method1224(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray11[arg0].length;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[I)[B")
	public final byte[] method1225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || this.aByteArrayArrayArray11.length <= arg1 || this.aByteArrayArrayArray11[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray11[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray11[arg1][arg0] == null) {
			@Pc(45) boolean local45 = this.method1241(arg2, arg1);
			if (!local45) {
				this.method1226(arg1);
				local45 = this.method1241(arg2, arg1);
				if (!local45) {
					return null;
				}
			}
		}
		@Pc(77) byte[] local77 = this.aByteArrayArrayArray11[arg1][arg0];
		if (this.aBoolean83) {
			this.aByteArrayArrayArray11[arg1][arg0] = null;
		}
		return local77;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	protected void method1226(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)[B")
	public final byte[] method1228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray11.length || this.aByteArrayArrayArray11[arg1] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray11[arg1].length) {
			return null;
		}
		if (this.aByteArrayArrayArray11[arg1][arg0] == null) {
			@Pc(61) boolean local61 = this.method1241(null, arg1);
			if (!local61) {
				this.method1226(arg1);
				local61 = this.method1241(null, arg1);
				if (!local61) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray11[arg1][arg0];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!rc;I)I")
	public final int method1229(@OriginalArg(0) Class55 arg0) {
		@Pc(7) Class55 local7 = arg0.method1669();
		return this.aClass67_2.method2043(local7.method1664());
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	public final int method1230() {
		return this.aByteArrayArrayArray11.length;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)Z")
	public final boolean method1231(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArray4[arg0] == null) {
			this.method1226(arg0);
			return this.aByteArrayArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!rc;ILclient!rc;)Z")
	public final boolean method1232(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(14) Class55 local14 = arg0.method1669();
		@Pc(18) Class55 local18 = arg1.method1669();
		@Pc(28) int local28 = this.aClass67_2.method2043(local14.method1664());
		@Pc(38) int local38 = this.aClass67Array2[local28].method2043(local18.method1664());
		return this.method1223(local28, local38);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Z")
	public final boolean method1234() {
		@Pc(3) boolean local3 = true;
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray175.length; local10++) {
			@Pc(17) int local17 = this.anIntArray175[local10];
			if (this.aByteArrayArray4[local17] == null) {
				this.method1226(local17);
				if (this.aByteArrayArray4[local17] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(II)[B")
	public final byte[] method1235(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray11.length == 1) {
			return this.method1228(arg0, 0);
		} else if (this.aByteArrayArrayArray11[arg0].length == 1) {
			return this.method1228(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(II)V")
	protected void method1236(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lclient!rc;I)V")
	public final void method1237(@OriginalArg(0) Class55 arg0) {
		@Pc(7) Class55 local7 = arg0.method1669();
		@Pc(25) int local25 = this.aClass67_2.method2043(local7.method1664());
		if (local25 >= 0) {
			this.method1236(local25);
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	public final void method1239() {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray11.length; local3++) {
			if (this.aByteArrayArrayArray11[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.aByteArrayArrayArray11[local3].length; local12++) {
					this.aByteArrayArrayArray11[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[I")
	public final int[] method1240(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray14[arg0];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([III)Z")
	private boolean method1241(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aByteArrayArray4[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray178[arg1];
		@Pc(22) byte[][] local22 = this.aByteArrayArrayArray11[arg1];
		@Pc(24) boolean local24 = true;
		@Pc(29) int[] local29 = this.anIntArrayArray14[arg1];
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local22[local29[local31]] == null) {
				local24 = false;
				break;
			}
		}
		if (local24) {
			return true;
		}
		@Pc(86) byte[] local86;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local86 = this.aByteArrayArray4[arg1];
		} else {
			local86 = new byte[this.aByteArrayArray4[arg1].length];
			Static120.method1341(this.aByteArrayArray4[arg1], 0, local86, 0, local86.length);
			@Pc(101) Class6_Sub1 local101 = new Class6_Sub1(local86);
			local101.method1491(arg0, local101.aByteArray11.length);
		}
		@Pc(120) byte[] local120;
		try {
			local120 = Static32.method804(local86);
		} catch (@Pc(122) RuntimeException local122) {
			throw Static103.method1958(local122, "T3 - " + (arg0 != null) + "," + arg1 + "," + local86.length + "," + Static109.method2035(local86.length, local86) + "," + Static109.method2035(local86.length - 2, local86) + "," + this.anIntArray174[arg1] + "," + this.anInt1797);
		}
		if (this.aBoolean82) {
			this.aByteArrayArray4[arg1] = null;
		}
		if (local17 <= 1) {
			local22[local29[0]] = local120;
		} else {
			@Pc(199) int local199 = local120.length;
			@Pc(202) int local202 = local199 - 1;
			@Pc(206) int local206 = local120[local202] & 0xFF;
			@Pc(214) int local214 = local202 - local17 * 4 * local206;
			@Pc(217) int[] local217 = new int[local17];
			@Pc(222) Class6_Sub1 local222 = new Class6_Sub1(local120);
			local222.anInt2209 = local214;
			@Pc(231) int local231;
			@Pc(233) int local233;
			for (@Pc(227) int local227 = 0; local227 < local206; local227++) {
				local231 = 0;
				for (local233 = 0; local233 < local17; local233++) {
					local231 += local222.method1503();
					local217[local233] += local231;
				}
			}
			for (local231 = 0; local231 < local17; local231++) {
				if (local22[local29[local231]] == null) {
					local22[local29[local231]] = new byte[local217[local231]];
				}
				local217[local231] = 0;
			}
			local222.anInt2209 = local214;
			local233 = 0;
			for (@Pc(298) int local298 = 0; local298 < local206; local298++) {
				@Pc(302) int local302 = 0;
				for (@Pc(304) int local304 = 0; local304 < local17; local304++) {
					local302 += local222.method1503();
					Static120.method1341(local120, local233, local22[local29[local304]], local217[local304], local302);
					local217[local304] += local302;
					local233 += local302;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLclient!rc;)I")
	public final int method1242(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(11) Class55 local11 = arg1.method1669();
		return this.aClass67Array2[arg0].method2043(local11.method1664());
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)[B")
	public final byte[] method1243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1225(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)[B")
	public final byte[] method1244(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray11.length == 1) {
			return this.method1243(arg0, 0);
		} else if (this.aByteArrayArrayArray11[arg0].length == 1) {
			return this.method1243(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[B)V")
	protected final void method1245(@OriginalArg(1) byte[] arg0) {
		this.anInt1797 = Static109.method2035(arg0.length, arg0);
		@Pc(27) Class6_Sub1 local27 = new Class6_Sub1(Static32.method804(arg0));
		@Pc(31) int local31 = local27.method1495();
		if (local31 != 5) {
			return;
		}
		@Pc(39) int local39 = local27.method1495();
		this.anInt1791 = local27.method1500();
		@Pc(46) int local46 = -1;
		this.anIntArray175 = new int[this.anInt1791];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < this.anInt1791; local55++) {
			this.anIntArray175[local55] = local53 += local27.method1500();
			if (this.anIntArray175[local55] > local46) {
				local46 = this.anIntArray175[local55];
			}
		}
		this.anIntArray176 = new int[local46 + 1];
		this.aByteArrayArray4 = new byte[local46 + 1][];
		this.anIntArray174 = new int[local46 + 1];
		this.anIntArray178 = new int[local46 + 1];
		this.aByteArrayArrayArray11 = new byte[local46 + 1][][];
		this.anIntArrayArray14 = new int[local46 + 1][];
		@Pc(137) int local137;
		if (local39 != 0) {
			this.anIntArray177 = new int[local46 + 1];
			for (local137 = 0; local137 < this.anInt1791; local137++) {
				this.anIntArray177[this.anIntArray175[local137]] = local27.method1503();
			}
			this.aClass67_2 = new Class67(this.anIntArray177);
		}
		for (local137 = 0; local137 < this.anInt1791; local137++) {
			this.anIntArray174[this.anIntArray175[local137]] = local27.method1503();
		}
		for (@Pc(190) int local190 = 0; local190 < this.anInt1791; local190++) {
			this.anIntArray176[this.anIntArray175[local190]] = local27.method1503();
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt1791; local209++) {
			this.anIntArray178[this.anIntArray175[local209]] = local27.method1500();
		}
		@Pc(237) int local237;
		@Pc(242) int local242;
		@Pc(250) int local250;
		@Pc(252) int local252;
		for (@Pc(228) int local228 = 0; local228 < this.anInt1791; local228++) {
			local53 = 0;
			local237 = this.anIntArray175[local228];
			local242 = this.anIntArray178[local237];
			this.anIntArrayArray14[local237] = new int[local242];
			local250 = -1;
			for (local252 = 0; local252 < local242; local252++) {
				@Pc(269) int local269 = this.anIntArrayArray14[local237][local252] = local53 += local27.method1500();
				if (local250 < local269) {
					local250 = local269;
				}
			}
			this.aByteArrayArrayArray11[local237] = new byte[local250 + 1][];
		}
		if (local39 == 0) {
			return;
		}
		this.anIntArrayArray13 = new int[local46 + 1][];
		this.aClass67Array2 = new Class67[local46 + 1];
		for (local237 = 0; local237 < this.anInt1791; local237++) {
			local242 = this.anIntArray175[local237];
			local250 = this.anIntArray178[local242];
			this.anIntArrayArray13[local242] = new int[this.aByteArrayArrayArray11[local242].length];
			for (local252 = 0; local252 < local250; local252++) {
				this.anIntArrayArray13[local242][this.anIntArrayArray14[local242][local252]] = local27.method1503();
			}
			this.aClass67Array2[local242] = new Class67(this.anIntArrayArray13[local242]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!rc;ZLclient!rc;)[B")
	public final byte[] method1246(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(7) Class55 local7 = arg0.method1669();
		@Pc(11) Class55 local11 = arg1.method1669();
		@Pc(19) int local19 = this.aClass67_2.method2043(local7.method1664());
		@Pc(29) int local29 = this.aClass67Array2[local19].method2043(local11.method1664());
		return this.method1243(local29, local19);
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(II)V")
	public final void method1247(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray11[arg0].length; local7++) {
			this.aByteArrayArrayArray11[arg0][local7] = null;
		}
	}
}
