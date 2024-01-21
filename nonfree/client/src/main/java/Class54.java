import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public abstract class Class54 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
	protected int[] anIntArray344;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!bd;")
	private Class8 aClass8_2;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	private int anInt2278;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "[I")
	protected int[] anIntArray347;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "[[B")
	protected byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "[I")
	protected int[] anIntArray348;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "[Lclient!bd;")
	private Class8[] aClass8Array2;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
	private final boolean aBoolean111;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Z")
	private final boolean aBoolean110;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(ZZ)V")
	protected Class54(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean111 = arg0;
		this.aBoolean110 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
	public final int method1596() {
		return this.aByteArrayArrayArray9.length;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I")
	public final int[] method1597(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray60[arg0];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
	public final boolean method1598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray9.length <= arg0 || this.aByteArrayArrayArray9[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray9[arg0].length) {
			return false;
		} else if (this.aByteArrayArrayArray9[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray13[arg0] == null) {
			this.method1623(arg0);
			return this.aByteArrayArray13[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!hb;Lclient!hb;)[B")
	public final byte[] method1599(@OriginalArg(1) Class27 arg0, @OriginalArg(2) Class27 arg1) {
		@Pc(15) Class27 local15 = arg1.method742();
		@Pc(19) Class27 local19 = arg0.method742();
		@Pc(27) int local27 = this.aClass8_2.method181(local15.method738());
		@Pc(37) int local37 = this.aClass8Array2[local27].method181(local19.method738());
		return this.method1615(local27, local37);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z")
	public final boolean method1600() {
		@Pc(3) boolean local3 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray346.length; local9++) {
			@Pc(16) int local16 = this.anIntArray346[local9];
			if (this.aByteArrayArray13[local16] == null) {
				this.method1623(local16);
				if (this.aByteArrayArray13[local16] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III[I)[B")
	public final byte[] method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray9.length || this.aByteArrayArrayArray9[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray9[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray9[arg1][arg0] == null) {
			@Pc(39) boolean local39 = this.method1619(arg2, arg1);
			if (!local39) {
				this.method1623(arg1);
				local39 = this.method1619(arg2, arg1);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = this.aByteArrayArrayArray9[arg1][arg0];
		if (this.aBoolean110) {
			this.aByteArrayArrayArray9[arg1][arg0] = null;
		}
		return local67;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI)[B")
	public final byte[] method1602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray9.length || this.aByteArrayArrayArray9[arg1] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray9[arg1].length) {
			return null;
		}
		if (this.aByteArrayArrayArray9[arg1][arg0] == null) {
			@Pc(42) boolean local42 = this.method1619(null, arg1);
			if (!local42) {
				this.method1623(arg1);
				local42 = this.method1619(null, arg1);
				if (!local42) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray9[arg1][arg0];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)[B")
	public final byte[] method1603(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray9.length == 1) {
			return this.method1602(arg0, 0);
		} else if (this.aByteArrayArrayArray9[arg0].length == 1) {
			return this.method1602(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)V")
	protected final void method1605(@OriginalArg(1) byte[] arg0) {
		this.anInt2269 = Static90.method1715(arg0.length, arg0);
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(Static30.method646(arg0));
		@Pc(23) int local23 = local19.method1421();
		if (local23 != 5) {
			return;
		}
		@Pc(31) int local31 = local19.method1421();
		this.anInt2278 = local19.method1451();
		this.anIntArray346 = new int[this.anInt2278];
		@Pc(43) int local43 = -1;
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < this.anInt2278; local47++) {
			this.anIntArray346[local47] = local45 += local19.method1451();
			if (this.anIntArray346[local47] > local43) {
				local43 = this.anIntArray346[local47];
			}
		}
		this.anIntArray348 = new int[local43 + 1];
		this.aByteArrayArrayArray9 = new byte[local43 + 1][][];
		this.anIntArrayArray60 = new int[local43 + 1][];
		this.aByteArrayArray13 = new byte[local43 + 1][];
		this.anIntArray347 = new int[local43 + 1];
		this.anIntArray344 = new int[local43 + 1];
		@Pc(137) int local137;
		if (local31 != 0) {
			this.anIntArray345 = new int[local43 + 1];
			for (local137 = 0; local137 < this.anInt2278; local137++) {
				this.anIntArray345[this.anIntArray346[local137]] = local19.method1444();
			}
			this.aClass8_2 = new Class8(this.anIntArray345);
		}
		for (local137 = 0; local137 < this.anInt2278; local137++) {
			this.anIntArray344[this.anIntArray346[local137]] = local19.method1444();
		}
		for (@Pc(186) int local186 = 0; local186 < this.anInt2278; local186++) {
			this.anIntArray347[this.anIntArray346[local186]] = local19.method1444();
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt2278; local205++) {
			this.anIntArray348[this.anIntArray346[local205]] = local19.method1451();
		}
		@Pc(231) int local231;
		@Pc(238) int local238;
		@Pc(246) int local246;
		@Pc(248) int local248;
		for (@Pc(224) int local224 = 0; local224 < this.anInt2278; local224++) {
			local231 = this.anIntArray346[local224];
			local45 = 0;
			local238 = this.anIntArray348[local231];
			this.anIntArrayArray60[local231] = new int[local238];
			local246 = -1;
			for (local248 = 0; local248 < local238; local248++) {
				@Pc(265) int local265 = this.anIntArrayArray60[local231][local248] = local45 += local19.method1451();
				if (local265 > local246) {
					local246 = local265;
				}
			}
			this.aByteArrayArrayArray9[local231] = new byte[local246 + 1][];
		}
		if (local31 == 0) {
			return;
		}
		this.anIntArrayArray59 = new int[local43 + 1][];
		this.aClass8Array2 = new Class8[local43 + 1];
		for (local231 = 0; local231 < this.anInt2278; local231++) {
			local238 = this.anIntArray346[local231];
			local246 = this.anIntArray348[local238];
			this.anIntArrayArray59[local238] = new int[this.aByteArrayArrayArray9[local238].length];
			for (local248 = 0; local248 < local246; local248++) {
				this.anIntArrayArray59[local238][this.anIntArrayArray60[local238][local248]] = local19.method1444();
			}
			this.aClass8Array2[local238] = new Class8(this.anIntArrayArray59[local238]);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ILclient!hb;Lclient!hb;)Z")
	public final boolean method1608(@OriginalArg(1) Class27 arg0, @OriginalArg(2) Class27 arg1) {
		@Pc(7) Class27 local7 = arg1.method742();
		@Pc(11) Class27 local11 = arg0.method742();
		@Pc(19) int local19 = this.aClass8_2.method181(local7.method738());
		@Pc(31) int local31 = this.aClass8Array2[local19].method181(local11.method738());
		return this.method1598(local19, local31);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)I")
	public final int method1609(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray9[arg0].length;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public final void method1610() {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray9.length; local7++) {
			if (this.aByteArrayArrayArray9[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.aByteArrayArrayArray9[local7].length; local16++) {
					this.aByteArrayArrayArray9[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)Z")
	public final boolean method1611(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArray13[arg0] == null) {
			this.method1623(arg0);
			return this.aByteArrayArray13[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!hb;I)V")
	public final void method1612(@OriginalArg(0) Class27 arg0) {
		@Pc(7) Class27 local7 = arg0.method742();
		@Pc(17) int local17 = this.aClass8_2.method181(local7.method738());
		if (local17 >= 0) {
			this.method1621(local17);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!hb;I)I")
	public final int method1613(@OriginalArg(1) Class27 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class27 local13 = arg0.method742();
		return this.aClass8Array2[arg1].method181(local13.method738());
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)[B")
	public final byte[] method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1601(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(II)[B")
	public final byte[] method1617(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray9.length == 1) {
			return this.method1615(0, arg0);
		} else if (this.aByteArrayArrayArray9[arg0].length == 1) {
			return this.method1615(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)V")
	public final void method1618(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray9[arg0].length; local3++) {
			this.aByteArrayArrayArray9[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([III)Z")
	private boolean method1619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteArrayArray13[arg1] == null) {
			return false;
		}
		@Pc(22) int local22 = this.anIntArray348[arg1];
		@Pc(27) byte[][] local27 = this.aByteArrayArrayArray9[arg1];
		@Pc(32) int[] local32 = this.anIntArrayArray60[arg1];
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < local22; local36++) {
			if (local27[local32[local36]] == null) {
				local34 = false;
				break;
			}
		}
		if (local34) {
			return true;
		}
		@Pc(85) byte[] local85;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local85 = this.aByteArrayArray13[arg1];
		} else {
			local85 = new byte[this.aByteArrayArray13[arg1].length];
			Static117.method1761(this.aByteArrayArray13[arg1], 0, local85, 0, local85.length);
			@Pc(109) Class3_Sub11 local109 = new Class3_Sub11(local85);
			local109.method1466(local109.aByteArray17.length, arg0);
		}
		@Pc(121) byte[] local121;
		try {
			local121 = Static30.method646(local85);
		} catch (@Pc(123) RuntimeException local123) {
			throw Static55.method1063(local123, "T3 - " + (arg0 != null) + "," + arg1 + "," + local85.length + "," + Static90.method1715(local85.length, local85) + "," + Static90.method1715(local85.length - 2, local85) + "," + this.anIntArray344[arg1] + "," + this.anInt2269);
		}
		if (this.aBoolean111) {
			this.aByteArrayArray13[arg1] = null;
		}
		if (local22 <= 1) {
			local27[local32[0]] = local121;
		} else {
			@Pc(198) int local198 = local121.length;
			@Pc(201) int local201 = local198 - 1;
			@Pc(205) int local205 = local121[local201] & 0xFF;
			@Pc(210) Class3_Sub11 local210 = new Class3_Sub11(local121);
			@Pc(218) int local218 = local201 - local205 * local22 * 4;
			@Pc(221) int[] local221 = new int[local22];
			local210.anInt2060 = local218;
			@Pc(230) int local230;
			@Pc(232) int local232;
			for (@Pc(226) int local226 = 0; local226 < local205; local226++) {
				local230 = 0;
				for (local232 = 0; local232 < local22; local232++) {
					local230 += local210.method1444();
					local221[local232] += local230;
				}
			}
			for (local230 = 0; local230 < local22; local230++) {
				if (local27[local32[local230]] == null) {
					local27[local32[local230]] = new byte[local221[local230]];
				}
				local221[local230] = 0;
			}
			local210.anInt2060 = local218;
			local232 = 0;
			for (@Pc(293) int local293 = 0; local293 < local205; local293++) {
				@Pc(297) int local297 = 0;
				for (@Pc(299) int local299 = 0; local299 < local22; local299++) {
					local297 += local210.method1444();
					Static117.method1761(local121, local232, local27[local32[local299]], local221[local299], local297);
					local232 += local297;
					local221[local299] += local297;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!hb;)I")
	public final int method1620(@OriginalArg(1) Class27 arg0) {
		@Pc(11) Class27 local11 = arg0.method742();
		return this.aClass8_2.method181(local11.method738());
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IB)V")
	protected void method1621(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	protected void method1623(@OriginalArg(1) int arg0) {
	}
}
