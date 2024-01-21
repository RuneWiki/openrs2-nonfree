import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public abstract class Class8 {

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[[B")
	protected byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public int anInt2551;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "[Lclient!oa;")
	private Class43[] aClass43Array2;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	private int anInt2553;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
	protected int[] anIntArray316;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "[I")
	protected int[] anIntArray320;

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "Lclient!oa;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "[I")
	protected int[] anIntArray321;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Z")
	private final boolean aBoolean148;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Z")
	private final boolean aBoolean149;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ZZ)V")
	protected Class8(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean148 = arg1;
		this.aBoolean149 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!a;Lclient!a;I)[B")
	public final byte[] method1682(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		@Pc(13) Class1 local13 = arg1.method30();
		@Pc(21) Class1 local21 = arg0.method30();
		@Pc(31) int local31 = this.aClass43_2.method1359(local13.method27());
		@Pc(41) int local41 = this.aClass43Array2[local31].method1359(local21.method27());
		return this.method1684(local41, local31);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public final void method1683(@OriginalArg(1) int arg0) {
		for (@Pc(5) int local5 = 0; local5 < this.aByteArrayArrayArray8[arg0].length; local5++) {
			this.aByteArrayArrayArray8[arg0][local5] = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)[B")
	public final byte[] method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1688(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)Z")
	public final boolean method1685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray8.length <= arg0 || this.aByteArrayArrayArray8[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray8[arg0].length) {
			return false;
		} else if (this.aByteArrayArrayArray8[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray10[arg0] == null) {
			this.method1689(arg0);
			return this.aByteArrayArray10[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	protected void method1686(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
	public final int method1687() {
		return this.aByteArrayArrayArray8.length;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg0 < 0 || this.aByteArrayArrayArray8.length <= arg0 || this.aByteArrayArrayArray8[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray8[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray8[arg0][arg1] == null) {
			@Pc(48) boolean local48 = this.method1693(arg0, arg2);
			if (!local48) {
				this.method1689(arg0);
				local48 = this.method1693(arg0, arg2);
				if (!local48) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = this.aByteArrayArrayArray8[arg0][arg1];
		if (this.aBoolean148) {
			this.aByteArrayArrayArray8[arg0][arg1] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	protected void method1689(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)V")
	protected final void method1690(@OriginalArg(1) byte[] arg0) {
		this.anInt2551 = Static11.method412(arg0, arg0.length);
		@Pc(15) Class2_Sub3 local15 = new Class2_Sub3(Static84.method1528(arg0));
		@Pc(19) int local19 = local15.method791();
		if (local19 != 5) {
			return;
		}
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local15.method791();
		this.anInt2553 = local15.method792();
		this.anIntArray318 = new int[this.anInt2553];
		@Pc(56) int local56 = -1;
		for (@Pc(58) int local58 = 0; local58 < this.anInt2553; local58++) {
			this.anIntArray318[local58] = local31 += local15.method792();
			if (this.anIntArray318[local58] > local56) {
				local56 = this.anIntArray318[local58];
			}
		}
		this.anIntArrayArray24 = new int[local56 + 1][];
		this.anIntArray316 = new int[local56 + 1];
		this.anIntArray320 = new int[local56 + 1];
		this.aByteArrayArrayArray8 = new byte[local56 + 1][][];
		this.anIntArray321 = new int[local56 + 1];
		this.aByteArrayArray10 = new byte[local56 + 1][];
		@Pc(140) int local140;
		if (local35 != 0) {
			this.anIntArray319 = new int[local56 + 1];
			for (local140 = 0; local140 < this.anInt2553; local140++) {
				this.anIntArray319[this.anIntArray318[local140]] = local15.method814();
			}
			this.aClass43_2 = new Class43(this.anIntArray319);
		}
		for (local140 = 0; local140 < this.anInt2553; local140++) {
			this.anIntArray320[this.anIntArray318[local140]] = local15.method814();
		}
		for (@Pc(189) int local189 = 0; local189 < this.anInt2553; local189++) {
			this.anIntArray316[this.anIntArray318[local189]] = local15.method814();
		}
		for (@Pc(208) int local208 = 0; local208 < this.anInt2553; local208++) {
			this.anIntArray321[this.anIntArray318[local208]] = local15.method792();
		}
		@Pc(242) int local242;
		@Pc(249) int local249;
		@Pc(244) int local244;
		@Pc(257) int local257;
		for (@Pc(233) int local233 = 0; local233 < this.anInt2553; local233++) {
			local31 = 0;
			local242 = this.anIntArray318[local233];
			local244 = -1;
			local249 = this.anIntArray321[local242];
			this.anIntArrayArray24[local242] = new int[local249];
			for (local257 = 0; local257 < local249; local257++) {
				@Pc(276) int local276 = this.anIntArrayArray24[local242][local257] = local31 += local15.method792();
				if (local276 > local244) {
					local244 = local276;
				}
			}
			this.aByteArrayArrayArray8[local242] = new byte[local244 + 1][];
		}
		if (local35 == 0) {
			return;
		}
		this.aClass43Array2 = new Class43[local56 + 1];
		this.anIntArrayArray23 = new int[local56 + 1][];
		for (local242 = 0; local242 < this.anInt2553; local242++) {
			local249 = this.anIntArray318[local242];
			local244 = this.anIntArray321[local249];
			this.anIntArrayArray23[local249] = new int[this.aByteArrayArrayArray8[local249].length];
			for (local257 = 0; local257 < local244; local257++) {
				this.anIntArrayArray23[local249][this.anIntArrayArray24[local249][local257]] = local15.method814();
			}
			this.aClass43Array2[local249] = new Class43(this.anIntArrayArray23[local249]);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!a;)I")
	public final int method1691(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(11) Class1 local11 = arg1.method30();
		return this.aClass43Array2[arg0].method1359(local11.method27());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[I)Z")
	private boolean method1693(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aByteArrayArray10[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray321[arg0];
		@Pc(22) byte[][] local22 = this.aByteArrayArrayArray8[arg0];
		@Pc(27) int[] local27 = this.anIntArrayArray24[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local22[local27[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(79) byte[] local79;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local79 = this.aByteArrayArray10[arg0];
		} else {
			local79 = new byte[this.aByteArrayArray10[arg0].length];
			Static116.method742(this.aByteArrayArray10[arg0], 0, local79, 0, local79.length);
			@Pc(103) Class2_Sub3 local103 = new Class2_Sub3(local79);
			local103.method806(arg1, local103.aByteArray7.length);
		}
		@Pc(117) byte[] local117;
		try {
			local117 = Static84.method1528(local79);
		} catch (@Pc(119) RuntimeException local119) {
			throw Static12.method1743(local119, "T3 - " + (arg1 != null) + "," + arg0 + "," + local79.length + "," + Static11.method412(local79, local79.length) + "," + Static11.method412(local79, local79.length - 2) + "," + this.anIntArray320[arg0] + "," + this.anInt2551);
		}
		if (this.aBoolean149) {
			this.aByteArrayArray10[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(186) int local186 = local117.length;
			@Pc(188) int local188 = local186 - 1;
			@Pc(193) int local193 = local117[local188] & 0xFF;
			@Pc(198) Class2_Sub3 local198 = new Class2_Sub3(local117);
			@Pc(206) int local206 = local188 - local193 * 4 * local17;
			local198.anInt1168 = local206;
			@Pc(212) int[] local212 = new int[local17];
			@Pc(218) int local218;
			@Pc(220) int local220;
			for (@Pc(214) int local214 = 0; local214 < local193; local214++) {
				local218 = 0;
				for (local220 = 0; local220 < local17; local220++) {
					local218 += local198.method814();
					local212[local220] += local218;
				}
			}
			for (local218 = 0; local218 < local17; local218++) {
				if (local22[local27[local218]] == null) {
					local22[local27[local218]] = new byte[local212[local218]];
				}
				local212[local218] = 0;
			}
			local198.anInt1168 = local206;
			local220 = 0;
			for (@Pc(291) int local291 = 0; local291 < local193; local291++) {
				@Pc(295) int local295 = 0;
				for (@Pc(297) int local297 = 0; local297 < local17; local297++) {
					local295 += local198.method814();
					Static116.method742(local117, local220, local22[local27[local297]], local212[local297], local295);
					local212[local297] += local295;
					local220 += local295;
				}
			}
		} else {
			local22[local27[0]] = local117;
		}
		return true;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)[B")
	public final byte[] method1694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.aByteArrayArrayArray8.length <= arg1 || this.aByteArrayArrayArray8[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray8[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray8[arg1][arg0] == null) {
			@Pc(43) boolean local43 = this.method1693(arg1, null);
			if (!local43) {
				this.method1689(arg1);
				local43 = this.method1693(arg1, null);
				if (!local43) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray8[arg1][arg0];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!a;)I")
	public final int method1695(@OriginalArg(1) Class1 arg0) {
		@Pc(16) Class1 local16 = arg0.method30();
		return this.aClass43_2.method1359(local16.method27());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z")
	public final boolean method1697() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray318.length; local14++) {
			@Pc(21) int local21 = this.anIntArray318[local14];
			if (this.aByteArrayArray10[local21] == null) {
				this.method1689(local21);
				if (this.aByteArrayArray10[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(II)Z")
	public final boolean method1698(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray10[arg0] == null) {
			this.method1689(arg0);
			return this.aByteArrayArray10[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IB)[B")
	public final byte[] method1699(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray8.length == 1) {
			return this.method1684(arg0, 0);
		} else if (this.aByteArrayArrayArray8[arg0].length == 1) {
			return this.method1684(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(IB)I")
	public final int method1702(@OriginalArg(0) int arg0) {
		return this.aByteArrayArrayArray8[arg0].length;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public final void method1703() {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray8.length; local7++) {
			if (this.aByteArrayArrayArray8[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.aByteArrayArrayArray8[local7].length; local16++) {
					this.aByteArrayArrayArray8[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)[I")
	public final int[] method1704(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray24[arg0];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[B")
	public final byte[] method1705(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray8.length == 1) {
			return this.method1694(arg0, 0);
		} else if (this.aByteArrayArrayArray8[arg0].length == 1) {
			return this.method1694(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lclient!a;Lclient!a;I)Z")
	public final boolean method1706(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		@Pc(13) Class1 local13 = arg0.method30();
		@Pc(17) Class1 local17 = arg1.method30();
		@Pc(25) int local25 = this.aClass43_2.method1359(local13.method27());
		@Pc(37) int local37 = this.aClass43Array2[local25].method1359(local17.method27());
		return this.method1685(local25, local37);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(ILclient!a;)V")
	public final void method1707(@OriginalArg(1) Class1 arg0) {
		@Pc(3) Class1 local3 = arg0.method30();
		@Pc(11) int local11 = this.aClass43_2.method1359(local3.method27());
		if (local11 >= 0) {
			this.method1686(local11);
		}
	}
}
