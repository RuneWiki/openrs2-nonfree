import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public abstract class Class64 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[Lclient!he;")
	private Class35[] aClass35Array2;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "[I")
	protected int[] anIntArray299;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "[I")
	protected int[] anIntArray300;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "[I")
	protected int[] anIntArray301;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!he;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	private int anInt2438;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray45;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "[[B")
	protected byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "Z")
	private final boolean aBoolean206;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Z")
	private final boolean aBoolean205;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(ZZ)V")
	protected Class64(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean206 = arg0;
		this.aBoolean205 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ad;Z)V")
	public final void method1613(@OriginalArg(0) Class4 arg0) {
		@Pc(3) Class4 local3 = arg0.method153();
		@Pc(15) int local15 = this.aClass35_2.method804(local3.method128());
		if (local15 >= 0) {
			this.method1630(local15);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ad;Lclient!ad;I)Z")
	public final boolean method1614(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(3) Class4 local3 = arg0.method153();
		@Pc(20) Class4 local20 = arg1.method153();
		@Pc(28) int local28 = this.aClass35_2.method804(local3.method128());
		@Pc(40) int local40 = this.aClass35Array2[local28].method804(local20.method128());
		return this.method1633(local28, local40);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	public final int[] method1615(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray24[arg0];
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	public final void method1616(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray45[arg0].length; local7++) {
			this.aByteArrayArrayArray45[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[IIB)[B")
	public final byte[] method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || this.aByteArrayArrayArray45.length <= arg2 || this.aByteArrayArrayArray45[arg2] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray45[arg2].length) {
			return null;
		}
		if (this.aByteArrayArrayArray45[arg2][arg0] == null) {
			@Pc(48) boolean local48 = this.method1624(arg2, arg1);
			if (!local48) {
				this.method1629(arg2);
				local48 = this.method1624(arg2, arg1);
				if (!local48) {
					return null;
				}
			}
		}
		@Pc(71) byte[] local71 = this.aByteArrayArrayArray45[arg2][arg0];
		if (this.aBoolean205) {
			this.aByteArrayArrayArray45[arg2][arg0] = null;
		}
		return local71;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[B")
	public final byte[] method1619(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray45.length == 1) {
			return this.method1620(0, arg0);
		} else if (this.aByteArrayArrayArray45[arg0].length == 1) {
			return this.method1620(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)[B")
	public final byte[] method1620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray45.length || this.aByteArrayArrayArray45[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray45[arg0].length <= arg1) {
			return null;
		}
		if (this.aByteArrayArrayArray45[arg0][arg1] == null) {
			@Pc(46) boolean local46 = this.method1624(arg0, null);
			if (!local46) {
				this.method1629(arg0);
				local46 = this.method1624(arg0, null);
				if (!local46) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray45[arg0][arg1];
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!ad;Lclient!ad;I)[B")
	public final byte[] method1622(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(7) Class4 local7 = arg0.method153();
		@Pc(11) Class4 local11 = arg1.method153();
		@Pc(19) int local19 = this.aClass35_2.method804(local7.method128());
		@Pc(29) int local29 = this.aClass35Array2[local19].method804(local11.method128());
		return this.method1625(local19, local29);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[IB)Z")
	private boolean method1624(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aByteArrayArray7[arg0] == null) {
			return false;
		}
		@Pc(23) int local23 = this.anIntArray299[arg0];
		@Pc(28) int[] local28 = this.anIntArrayArray24[arg0];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray45[arg0];
		@Pc(35) boolean local35 = true;
		for (@Pc(37) int local37 = 0; local37 < local23; local37++) {
			if (local33[local28[local37]] == null) {
				local35 = false;
				break;
			}
		}
		if (local35) {
			return true;
		}
		@Pc(88) byte[] local88;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local88 = this.aByteArrayArray7[arg0];
		} else {
			local88 = new byte[this.aByteArrayArray7[arg0].length];
			Static116.method551(this.aByteArrayArray7[arg0], 0, local88, 0, local88.length);
			@Pc(103) Class3_Sub4 local103 = new Class3_Sub4(local88);
			local103.method430(local103.aByteArray4.length, arg1);
		}
		@Pc(122) byte[] local122;
		try {
			local122 = Static52.method888(local88);
		} catch (@Pc(124) RuntimeException local124) {
			throw Static81.method1287(local124, "T3 - " + (arg1 != null) + "," + arg0 + "," + local88.length + "," + Static73.method1183(local88.length, local88) + "," + Static73.method1183(local88.length - 2, local88) + "," + this.anIntArray300[arg0] + "," + this.anInt2434);
		}
		if (this.aBoolean206) {
			this.aByteArrayArray7[arg0] = null;
		}
		if (local23 <= 1) {
			local33[local28[0]] = local122;
		} else {
			@Pc(201) int local201 = local122.length;
			@Pc(204) int local204 = local201 - 1;
			@Pc(208) int local208 = local122[local204] & 0xFF;
			@Pc(211) int[] local211 = new int[local23];
			@Pc(216) Class3_Sub4 local216 = new Class3_Sub4(local122);
			@Pc(224) int local224 = local204 - local208 * 4 * local23;
			local216.anInt627 = local224;
			@Pc(233) int local233;
			@Pc(235) int local235;
			for (@Pc(229) int local229 = 0; local229 < local208; local229++) {
				local233 = 0;
				for (local235 = 0; local235 < local23; local235++) {
					local233 += local216.method438();
					local211[local235] += local233;
				}
			}
			for (local233 = 0; local233 < local23; local233++) {
				if (local33[local28[local233]] == null) {
					local33[local28[local233]] = new byte[local211[local233]];
				}
				local211[local233] = 0;
			}
			local216.anInt627 = local224;
			local235 = 0;
			for (@Pc(296) int local296 = 0; local296 < local208; local296++) {
				@Pc(300) int local300 = 0;
				for (@Pc(302) int local302 = 0; local302 < local23; local302++) {
					local300 += local216.method438();
					Static116.method551(local122, local235, local33[local28[local302]], local211[local302], local300);
					local211[local302] += local300;
					local235 += local300;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)[B")
	public final byte[] method1625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1618(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!ad;)I")
	public final int method1626(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) Class4 local7 = arg1.method153();
		return this.aClass35Array2[arg0].method804(local7.method128());
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Z")
	public final boolean method1627() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray302.length; local14++) {
			@Pc(21) int local21 = this.anIntArray302[local14];
			if (this.aByteArrayArray7[local21] == null) {
				this.method1629(local21);
				if (this.aByteArrayArray7[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
	protected void method1629(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	protected void method1630(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)[B")
	public final byte[] method1631(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray45.length == 1) {
			return this.method1625(0, arg0);
		} else if (this.aByteArrayArrayArray45[arg0].length == 1) {
			return this.method1625(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)Z")
	public final boolean method1633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray45.length || this.aByteArrayArrayArray45[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray45[arg0].length <= arg1) {
			return false;
		} else if (this.aByteArrayArrayArray45[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray7[arg0] == null) {
			this.method1629(arg0);
			return this.aByteArrayArray7[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)V")
	protected final void method1634(@OriginalArg(1) byte[] arg0) {
		this.anInt2434 = Static73.method1183(arg0.length, arg0);
		@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(Static52.method888(arg0));
		@Pc(27) int local27 = local23.method446();
		if (local27 != 5) {
			return;
		}
		@Pc(39) int local39 = local23.method446();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = -1;
		this.anInt2438 = local23.method459();
		this.anIntArray302 = new int[this.anInt2438];
		for (@Pc(55) int local55 = 0; local55 < this.anInt2438; local55++) {
			this.anIntArray302[local55] = local41 += local23.method459();
			if (this.anIntArray302[local55] > local43) {
				local43 = this.anIntArray302[local55];
			}
		}
		this.anIntArrayArray24 = new int[local43 + 1][];
		this.aByteArrayArray7 = new byte[local43 + 1][];
		this.anIntArray300 = new int[local43 + 1];
		this.anIntArray301 = new int[local43 + 1];
		this.anIntArray299 = new int[local43 + 1];
		this.aByteArrayArrayArray45 = new byte[local43 + 1][][];
		@Pc(133) int local133;
		if (local39 != 0) {
			this.anIntArray303 = new int[local43 + 1];
			for (local133 = 0; local133 < this.anInt2438; local133++) {
				this.anIntArray303[this.anIntArray302[local133]] = local23.method438();
			}
			this.aClass35_2 = new Class35(this.anIntArray303);
		}
		for (local133 = 0; local133 < this.anInt2438; local133++) {
			this.anIntArray300[this.anIntArray302[local133]] = local23.method438();
		}
		for (@Pc(178) int local178 = 0; local178 < this.anInt2438; local178++) {
			this.anIntArray301[this.anIntArray302[local178]] = local23.method438();
		}
		for (@Pc(197) int local197 = 0; local197 < this.anInt2438; local197++) {
			this.anIntArray299[this.anIntArray302[local197]] = local23.method459();
		}
		@Pc(225) int local225;
		@Pc(230) int local230;
		@Pc(232) int local232;
		@Pc(240) int local240;
		for (@Pc(216) int local216 = 0; local216 < this.anInt2438; local216++) {
			local41 = 0;
			local225 = this.anIntArray302[local216];
			local230 = this.anIntArray299[local225];
			local232 = -1;
			this.anIntArrayArray24[local225] = new int[local230];
			for (local240 = 0; local240 < local230; local240++) {
				@Pc(257) int local257 = this.anIntArrayArray24[local225][local240] = local41 += local23.method459();
				if (local232 < local257) {
					local232 = local257;
				}
			}
			this.aByteArrayArrayArray45[local225] = new byte[local232 + 1][];
		}
		if (local39 == 0) {
			return;
		}
		this.anIntArrayArray25 = new int[local43 + 1][];
		this.aClass35Array2 = new Class35[local43 + 1];
		for (local225 = 0; local225 < this.anInt2438; local225++) {
			local230 = this.anIntArray302[local225];
			local232 = this.anIntArray299[local230];
			this.anIntArrayArray25[local230] = new int[this.aByteArrayArrayArray45[local230].length];
			for (local240 = 0; local240 < local232; local240++) {
				this.anIntArrayArray25[local230][this.anIntArrayArray24[local230][local240]] = local23.method438();
			}
			this.aClass35Array2[local230] = new Class35(this.anIntArrayArray25[local230]);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I")
	public final int method1635() {
		return this.aByteArrayArrayArray45.length;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(II)I")
	public final int method1637(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray45[arg0].length;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ad;I)I")
	public final int method1638(@OriginalArg(0) Class4 arg0) {
		@Pc(3) Class4 local3 = arg0.method153();
		return this.aClass35_2.method804(local3.method128());
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(II)Z")
	public final boolean method1640(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray7[arg0] == null) {
			this.method1629(arg0);
			return this.aByteArrayArray7[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public final void method1641() {
		for (@Pc(13) int local13 = 0; local13 < this.aByteArrayArrayArray45.length; local13++) {
			if (this.aByteArrayArrayArray45[local13] != null) {
				for (@Pc(22) int local22 = 0; local22 < this.aByteArrayArrayArray45[local13].length; local22++) {
					this.aByteArrayArrayArray45[local13][local22] = null;
				}
			}
		}
	}
}
