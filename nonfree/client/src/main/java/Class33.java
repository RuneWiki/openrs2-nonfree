import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public abstract class Class33 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!jd;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "[Lclient!jd;")
	private Class35[] aClass35Array2;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	private int anInt1842;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
	protected int[] anIntArray258;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "[[B")
	protected byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
	protected int[] anIntArray260;

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
	public int anInt1854;

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "[I")
	protected int[] anIntArray263;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(ZZ)V")
	protected Class33(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean101 = arg0;
		this.aBoolean102 = arg1;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
	public final int method1299(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray9[arg0].length;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!mc;B)V")
	public final void method1301(@OriginalArg(0) Class42 arg0) {
		@Pc(17) Class42 local17 = arg0.method1036();
		@Pc(25) int local25 = this.aClass35_2.method856(local17.method1047());
		if (local25 >= 0) {
			this.method1314(local25);
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!mc;B)I")
	public final int method1302(@OriginalArg(0) Class42 arg0) {
		@Pc(3) Class42 local3 = arg0.method1036();
		return this.aClass35_2.method856(local3.method1047());
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[I")
	public final int[] method1303(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray17[arg0];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B[B)V")
	protected final void method1304(@OriginalArg(1) byte[] arg0) {
		this.anInt1854 = Static51.method964(arg0.length, arg0);
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(Static9.method180(arg0));
		@Pc(21) int local21 = local13.method1186();
		if (local21 != 5) {
			return;
		}
		@Pc(27) int local27 = -1;
		@Pc(31) int local31 = local13.method1186();
		this.anInt1842 = local13.method1199();
		this.anIntArray259 = new int[this.anInt1842];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < this.anInt1842; local45++) {
			this.anIntArray259[local45] = local43 += local13.method1199();
			if (local27 < this.anIntArray259[local45]) {
				local27 = this.anIntArray259[local45];
			}
		}
		this.anIntArray263 = new int[local27 + 1];
		this.aByteArrayArray8 = new byte[local27 + 1][];
		this.anIntArray260 = new int[local27 + 1];
		this.anIntArrayArray17 = new int[local27 + 1][];
		this.anIntArray258 = new int[local27 + 1];
		this.aByteArrayArrayArray9 = new byte[local27 + 1][][];
		@Pc(134) int local134;
		if (local31 != 0) {
			this.anIntArray261 = new int[local27 + 1];
			for (local134 = 0; local134 < this.anInt1842; local134++) {
				this.anIntArray261[this.anIntArray259[local134]] = local13.method1188();
			}
			this.aClass35_2 = new Class35(this.anIntArray261);
		}
		for (local134 = 0; local134 < this.anInt1842; local134++) {
			this.anIntArray260[this.anIntArray259[local134]] = local13.method1188();
		}
		for (@Pc(181) int local181 = 0; local181 < this.anInt1842; local181++) {
			this.anIntArray263[this.anIntArray259[local181]] = local13.method1188();
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt1842; local203++) {
			this.anIntArray258[this.anIntArray259[local203]] = local13.method1199();
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(231) int local231;
		@Pc(244) int local244;
		for (@Pc(221) int local221 = 0; local221 < this.anInt1842; local221++) {
			local227 = this.anIntArray259[local221];
			local43 = 0;
			local231 = -1;
			local236 = this.anIntArray258[local227];
			this.anIntArrayArray17[local227] = new int[local236];
			for (local244 = 0; local244 < local236; local244++) {
				@Pc(260) int local260 = this.anIntArrayArray17[local227][local244] = local43 += local13.method1199();
				if (local260 > local231) {
					local231 = local260;
				}
			}
			this.aByteArrayArrayArray9[local227] = new byte[local231 + 1][];
		}
		if (local31 == 0) {
			return;
		}
		this.aClass35Array2 = new Class35[local27 + 1];
		this.anIntArrayArray19 = new int[local27 + 1][];
		for (local227 = 0; local227 < this.anInt1842; local227++) {
			local236 = this.anIntArray259[local227];
			local231 = this.anIntArray258[local236];
			this.anIntArrayArray19[local236] = new int[this.aByteArrayArrayArray9[local236].length];
			for (local244 = 0; local244 < local231; local244++) {
				this.anIntArrayArray19[local236][this.anIntArrayArray17[local236][local244]] = local13.method1188();
			}
			this.aClass35Array2[local236] = new Class35(this.anIntArrayArray19[local236]);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)[B")
	public final byte[] method1305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1316(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
	protected void method1306(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)[B")
	public final byte[] method1307(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray9.length == 1) {
			return this.method1305(arg0, 0);
		} else if (this.aByteArrayArrayArray9[arg0].length == 1) {
			return this.method1305(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)[B")
	public final byte[] method1308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray9.length <= arg0 || this.aByteArrayArrayArray9[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray9[arg0].length <= arg1) {
			return null;
		}
		if (this.aByteArrayArrayArray9[arg0][arg1] == null) {
			@Pc(50) boolean local50 = this.method1319(arg0, null);
			if (!local50) {
				this.method1306(arg0);
				local50 = this.method1319(arg0, null);
				if (!local50) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray9[arg0][arg1];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Z")
	public final boolean method1309() {
		@Pc(3) boolean local3 = true;
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray259.length; local10++) {
			@Pc(17) int local17 = this.anIntArray259[local10];
			if (this.aByteArrayArray8[local17] == null) {
				this.method1306(local17);
				if (this.aByteArrayArray8[local17] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)Z")
	public final boolean method1310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray9.length || this.aByteArrayArrayArray9[arg1] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray9[arg1].length) {
			return false;
		} else if (this.aByteArrayArrayArray9[arg1][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray8[arg1] == null) {
			this.method1306(arg1);
			return this.aByteArrayArray8[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!mc;Lclient!mc;B)[B")
	public final byte[] method1311(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(12) Class42 local12 = arg1.method1036();
		@Pc(16) Class42 local16 = arg0.method1036();
		@Pc(26) int local26 = this.aClass35_2.method856(local12.method1047());
		@Pc(38) int local38 = this.aClass35Array2[local26].method856(local16.method1047());
		return this.method1305(local38, local26);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
	public final void method1312(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray9[arg0].length; local7++) {
			this.aByteArrayArrayArray9[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!mc;Lclient!mc;B)Z")
	public final boolean method1313(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(3) Class42 local3 = arg0.method1036();
		@Pc(11) Class42 local11 = arg1.method1036();
		@Pc(24) int local24 = this.aClass35_2.method856(local3.method1047());
		@Pc(34) int local34 = this.aClass35Array2[local24].method856(local11.method1047());
		return this.method1310(local34, local24);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)V")
	protected void method1314(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)Z")
	public final boolean method1315(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArray8[arg0] == null) {
			this.method1306(arg0);
			return this.aByteArrayArray8[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ[II)[B")
	public final byte[] method1316(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || this.aByteArrayArrayArray9.length <= arg2 || this.aByteArrayArrayArray9[arg2] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray9[arg2].length) {
			return null;
		}
		if (this.aByteArrayArrayArray9[arg2][arg0] == null) {
			@Pc(42) boolean local42 = this.method1319(arg2, arg1);
			if (!local42) {
				this.method1306(arg2);
				local42 = this.method1319(arg2, arg1);
				if (!local42) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = this.aByteArrayArrayArray9[arg2][arg0];
		if (this.aBoolean102) {
			this.aByteArrayArrayArray9[arg2][arg0] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	public final void method1318() {
		for (@Pc(12) int local12 = 0; local12 < this.aByteArrayArrayArray9.length; local12++) {
			if (this.aByteArrayArrayArray9[local12] != null) {
				for (@Pc(21) int local21 = 0; local21 < this.aByteArrayArrayArray9[local12].length; local21++) {
					this.aByteArrayArrayArray9[local12][local21] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI[I)Z")
	private boolean method1319(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aByteArrayArray8[arg0] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray258[arg0];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray9[arg0];
		@Pc(25) int[] local25 = this.anIntArrayArray17[arg0];
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if (local20[local25[local29]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(76) byte[] local76;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local76 = this.aByteArrayArray8[arg0];
		} else {
			local76 = new byte[this.aByteArrayArray8[arg0].length];
			Static114.method777(this.aByteArrayArray8[arg0], 0, local76, 0, local76.length);
			@Pc(99) Class1_Sub8 local99 = new Class1_Sub8(local76);
			local99.method1214(local99.aByteArray24.length, arg1);
		}
		@Pc(111) byte[] local111;
		try {
			local111 = Static9.method180(local76);
		} catch (@Pc(113) RuntimeException local113) {
			throw Static33.method579(local113, "T3 - " + (arg1 != null) + "," + arg0 + "," + local76.length + "," + Static51.method964(local76.length, local76) + "," + Static51.method964(local76.length - 2, local76) + "," + this.anIntArray260[arg0] + "," + this.anInt1854);
		}
		if (this.aBoolean101) {
			this.aByteArrayArray8[arg0] = null;
		}
		if (local15 <= 1) {
			local20[local25[0]] = local111;
		} else {
			@Pc(187) int local187 = local111.length;
			@Pc(190) int local190 = local187 - 1;
			@Pc(194) int local194 = local111[local190] & 0xFF;
			@Pc(202) int local202 = local190 - local194 * local15 * 4;
			@Pc(207) Class1_Sub8 local207 = new Class1_Sub8(local111);
			local207.anInt1692 = local202;
			@Pc(213) int[] local213 = new int[local15];
			@Pc(218) int local218;
			@Pc(220) int local220;
			for (@Pc(215) int local215 = 0; local215 < local194; local215++) {
				local218 = 0;
				for (local220 = 0; local220 < local15; local220++) {
					local218 += local207.method1188();
					local213[local220] += local218;
				}
			}
			for (local218 = 0; local218 < local15; local218++) {
				if (local20[local25[local218]] == null) {
					local20[local25[local218]] = new byte[local213[local218]];
				}
				local213[local218] = 0;
			}
			local207.anInt1692 = local202;
			local220 = 0;
			for (@Pc(283) int local283 = 0; local283 < local194; local283++) {
				@Pc(286) int local286 = 0;
				for (@Pc(288) int local288 = 0; local288 < local15; local288++) {
					local286 += local207.method1188();
					Static114.method777(local111, local220, local20[local25[local288]], local213[local288], local286);
					local220 += local286;
					local213[local288] += local286;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!mc;IB)I")
	public final int method1320(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class42 local12 = arg0.method1036();
		return this.aClass35Array2[arg1].method856(local12.method1047());
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IB)[B")
	public final byte[] method1321(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray9.length == 1) {
			return this.method1308(0, arg0);
		} else if (this.aByteArrayArrayArray9[arg0].length == 1) {
			return this.method1308(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)I")
	public final int method1322() {
		return this.aByteArrayArrayArray9.length;
	}
}
