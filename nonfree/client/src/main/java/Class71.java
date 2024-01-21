import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public abstract class Class71 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
	protected int[] anIntArray264;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "[Lclient!oj;")
	private Class76[] aClass76Array2;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
	private int anInt2992;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Lclient!oj;")
	private Class76 aClass76_2;

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "[I")
	protected int[] anIntArray268;

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "[I")
	protected int[] anIntArray269;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Z")
	private final boolean aBoolean132;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ZZ)V")
	protected Class71(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean131 = arg0;
		this.aBoolean132 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Z")
	protected final boolean method2112(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && this.anIntArray265.length > arg0 && this.anIntArray265[arg0] != 0) {
			return true;
		} else if (Static103.aBoolean107) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
	public final boolean method2113() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray267.length; local15++) {
			@Pc(22) int local22 = this.anIntArray267[local15];
			if (this.anObjectArray29[local22] == null) {
				this.method2137(local22);
				if (this.anObjectArray29[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!mb;I)I")
	public final int method2114(@OriginalArg(0) Class62 arg0) {
		@Pc(3) Class62 local3 = arg0.method1872();
		@Pc(21) int local21 = this.aClass76_2.method2196(local3.method1868());
		return this.method2112(local21) ? local21 : -1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V")
	public final void method2115(@OriginalArg(1) int arg0) {
		if (this.method2112(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lclient!mb;I)Z")
	public final boolean method2116(@OriginalArg(0) Class62 arg0) {
		@Pc(16) int local16 = this.method2114(Static6.aClass62_49);
		return local16 == -1 ? this.method2141(arg0, Static6.aClass62_49) : this.method2141(Static6.aClass62_49, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public final int method2117(@OriginalArg(0) int arg0) {
		return this.method2112(arg0) ? this.anIntArray265[arg0] : 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZZ)V")
	public final void method2118(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.anIntArray266 = null;
			this.aClass76_2 = null;
		}
		this.aClass76Array2 = null;
		this.anIntArrayArray24 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Z")
	public final boolean method2119(@OriginalArg(0) int arg0) {
		if (this.anIntArray265.length == 1) {
			return this.method2143(arg0, 0);
		} else if (!this.method2112(arg0)) {
			return false;
		} else if (this.anIntArray265[arg0] == 1) {
			return this.method2143(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!mb;Z)Z")
	public final boolean method2120(@OriginalArg(0) Class62 arg0) {
		@Pc(7) Class62 local7 = arg0.method1872();
		@Pc(20) int local20 = this.aClass76_2.method2196(local7.method1868());
		return this.method2125(local20);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)[B")
	public final byte[] method2121(@OriginalArg(0) int arg0) {
		if (this.anIntArray265.length == 1) {
			return this.method2130(0, arg0);
		} else if (!this.method2112(arg0)) {
			return null;
		} else if (this.anIntArray265[arg0] == 1) {
			return this.method2130(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([III)Z")
	private boolean method2122(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method2112(arg1)) {
			return false;
		} else if (this.anObjectArray29[arg1] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray269[arg1];
			@Pc(29) int[] local29 = this.anIntArrayArray23[arg1];
			@Pc(31) boolean local31 = true;
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray265[arg1]];
			}
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg1];
			for (@Pc(52) int local52 = 0; local52 < local24; local52++) {
				@Pc(58) int local58;
				if (local29 == null) {
					local58 = local52;
				} else {
					local58 = local29[local52];
				}
				if (local50[local58] == null) {
					local31 = false;
					break;
				}
			}
			if (local31) {
				return true;
			}
			@Pc(116) byte[] local116;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local116 = Static200.method2929(this.anObjectArray29[arg1], false);
			} else {
				local116 = Static200.method2929(this.anObjectArray29[arg1], true);
				@Pc(121) Class2_Sub11 local121 = new Class2_Sub11(local116);
				local121.method1564(local121.aByteArray26.length, arg0);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static146.method2189(local116);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static78.method1102(local145, "T3 - " + (arg0 != null) + "," + arg1 + "," + local116.length + "," + Static33.method570(local116, local116.length) + "," + Static33.method570(local116, local116.length - 2) + "," + this.anIntArray264[arg1] + "," + this.anInt2995);
			}
			if (this.aBoolean131) {
				this.anObjectArray29[arg1] = null;
			}
			@Pc(212) int local212;
			if (local24 > 1) {
				local212 = local143.length;
				@Pc(215) int local215 = local212 - 1;
				@Pc(219) int local219 = local143[local215] & 0xFF;
				@Pc(222) int[] local222 = new int[local24];
				@Pc(227) Class2_Sub11 local227 = new Class2_Sub11(local143);
				@Pc(235) int local235 = local215 - local24 * local219 * 4;
				local227.anInt2235 = local235;
				@Pc(246) int local246;
				for (@Pc(240) int local240 = 0; local240 < local219; local240++) {
					@Pc(244) int local244 = 0;
					for (local246 = 0; local246 < local24; local246++) {
						local244 += local227.method1577();
						local222[local246] += local244;
					}
				}
				@Pc(276) byte[][] local276 = new byte[local24][];
				for (local246 = 0; local246 < local24; local246++) {
					local276[local246] = new byte[local222[local246]];
					local222[local246] = 0;
				}
				local227.anInt2235 = local235;
				@Pc(300) int local300 = 0;
				@Pc(306) int local306;
				@Pc(308) int local308;
				for (@Pc(302) int local302 = 0; local302 < local219; local302++) {
					local306 = 0;
					for (local308 = 0; local308 < local24; local308++) {
						local306 += local227.method1577();
						Static220.method1006(local143, local300, local276[local308], local222[local308], local306);
						local222[local308] += local306;
						local300 += local306;
					}
				}
				for (local306 = 0; local306 < local24; local306++) {
					if (local29 == null) {
						local308 = local306;
					} else {
						local308 = local29[local306];
					}
					if (this.aBoolean132) {
						local50[local308] = local276[local306];
					} else {
						local50[local308] = Static195.method2784(local276[local306]);
					}
				}
			} else {
				if (local29 == null) {
					local212 = 0;
				} else {
					local212 = local29[0];
				}
				if (this.aBoolean132) {
					local50[local212] = local143;
				} else {
					local50[local212] = Static195.method2784(local143);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)[I")
	public final int[] method2123(@OriginalArg(0) int arg0) {
		if (!this.method2112(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.anIntArrayArray23[arg0];
		if (local25 == null) {
			local25 = new int[this.anIntArray269[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local25.length) {
				local25[local35] = local35++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)Z")
	private boolean method2124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && this.anIntArray265.length > arg0 && this.anIntArray265[arg0] > arg1) {
			return true;
		} else if (Static103.aBoolean107) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)Z")
	public final boolean method2125(@OriginalArg(0) int arg0) {
		if (!this.method2112(arg0)) {
			return false;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method2137(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(II)I")
	protected int method2126(@OriginalArg(1) int arg0) {
		if (this.method2112(arg0)) {
			return this.anObjectArray29[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(II)V")
	protected void method2127(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(Lclient!mb;I)V")
	public final void method2128(@OriginalArg(0) Class62 arg0) {
		@Pc(7) Class62 local7 = arg0.method1872();
		@Pc(20) int local20 = this.aClass76_2.method2196(local7.method1868());
		this.method2127(local20);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([IIII)[B")
	public final byte[] method2129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2124(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(36) boolean local36 = this.method2122(arg0, arg2);
			if (!local36) {
				this.method2137(arg2);
				local36 = this.method2122(arg0, arg2);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static200.method2929(this.anObjectArrayArray2[arg2][arg1], false);
		if (this.aBoolean132) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray265[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)[B")
	public final byte[] method2130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2129(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IBI)[B")
	public final byte[] method2131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2124(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(35) boolean local35 = this.method2122(null, arg1);
			if (!local35) {
				this.method2137(arg1);
				local35 = this.method2122(null, arg1);
				if (!local35) {
					return null;
				}
			}
		}
		return Static200.method2929(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	public final int method2133() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray29.length; local11++) {
			if (this.anIntArray269[local11] > 0) {
				local3 += this.method2126(local11);
				local5 += 100;
			}
		}
		if (local5 == 0) {
			return 100;
		} else {
			return local3 * 100 / local5;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[B)V")
	protected final void method2134(@OriginalArg(1) byte[] arg0) {
		this.anInt2995 = Static33.method570(arg0, arg0.length);
		@Pc(22) Class2_Sub11 local22 = new Class2_Sub11(Static146.method2189(arg0));
		@Pc(28) int local28 = local22.method1534();
		if (local28 != 5 && local28 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local28);
		}
		if (local28 >= 6) {
			local22.method1577();
		}
		@Pc(60) int local60 = 0;
		@Pc(66) int local66 = local22.method1534();
		this.anInt2992 = local22.method1557();
		@Pc(73) int local73 = -1;
		this.anIntArray267 = new int[this.anInt2992];
		for (@Pc(80) int local80 = 0; local80 < this.anInt2992; local80++) {
			this.anIntArray267[local80] = local60 += local22.method1557();
			if (this.anIntArray267[local80] > local73) {
				local73 = this.anIntArray267[local80];
			}
		}
		this.anObjectArrayArray2 = new Object[local73 + 1][];
		this.anIntArray264 = new int[local73 + 1];
		this.anIntArray269 = new int[local73 + 1];
		this.anObjectArray29 = new Object[local73 + 1];
		this.anIntArray265 = new int[local73 + 1];
		this.anIntArray268 = new int[local73 + 1];
		this.anIntArrayArray23 = new int[local73 + 1][];
		@Pc(168) int local168;
		@Pc(187) int local187;
		if (local66 != 0) {
			this.anIntArray266 = new int[local73 + 1];
			for (local168 = 0; local168 < local73 + 1; local168++) {
				this.anIntArray266[local168] = -1;
			}
			for (local187 = 0; local187 < this.anInt2992; local187++) {
				this.anIntArray266[this.anIntArray267[local187]] = local22.method1577();
			}
			this.aClass76_2 = new Class76(this.anIntArray266);
		}
		for (local168 = 0; local168 < this.anInt2992; local168++) {
			this.anIntArray264[this.anIntArray267[local168]] = local22.method1577();
		}
		for (local187 = 0; local187 < this.anInt2992; local187++) {
			this.anIntArray268[this.anIntArray267[local187]] = local22.method1577();
		}
		for (@Pc(261) int local261 = 0; local261 < this.anInt2992; local261++) {
			this.anIntArray269[this.anIntArray267[local261]] = local22.method1557();
		}
		@Pc(287) int local287;
		@Pc(294) int local294;
		@Pc(302) int local302;
		@Pc(304) int local304;
		@Pc(321) int local321;
		for (@Pc(280) int local280 = 0; local280 < this.anInt2992; local280++) {
			local287 = this.anIntArray267[local280];
			local60 = 0;
			local294 = this.anIntArray269[local287];
			this.anIntArrayArray23[local287] = new int[local294];
			local302 = -1;
			for (local304 = 0; local304 < local294; local304++) {
				local321 = this.anIntArrayArray23[local287][local304] = local60 += local22.method1557();
				if (local321 > local302) {
					local302 = local321;
				}
			}
			this.anIntArray265[local287] = local302 + 1;
			if (local302 + 1 == local294) {
				this.anIntArrayArray23[local287] = null;
			}
		}
		if (local66 == 0) {
			return;
		}
		this.anIntArrayArray24 = new int[local73 + 1][];
		this.aClass76Array2 = new Class76[local73 + 1];
		for (local287 = 0; local287 < this.anInt2992; local287++) {
			local294 = this.anIntArray267[local287];
			local302 = this.anIntArray269[local294];
			this.anIntArrayArray24[local294] = new int[this.anIntArray265[local294]];
			for (local304 = 0; local304 < this.anIntArray265[local294]; local304++) {
				this.anIntArrayArray24[local294][local304] = -1;
			}
			for (local321 = 0; local321 < local302; local321++) {
				@Pc(426) int local426;
				if (this.anIntArrayArray23[local294] == null) {
					local426 = local321;
				} else {
					local426 = this.anIntArrayArray23[local294][local321];
				}
				this.anIntArrayArray24[local294][local426] = local22.method1577();
			}
			this.aClass76Array2[local294] = new Class76(this.anIntArrayArray24[local294]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
	public final int method2135() {
		return this.anIntArray265.length;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(Lclient!mb;I)I")
	public final int method2136(@OriginalArg(0) Class62 arg0) {
		@Pc(12) Class62 local12 = arg0.method1872();
		@Pc(20) int local20 = this.aClass76_2.method2196(local12.method1868());
		return this.method2126(local20);
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(II)V")
	protected void method2137(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!mb;ILclient!mb;)[B")
	public final byte[] method2139(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(7) Class62 local7 = arg0.method1872();
		@Pc(11) Class62 local11 = arg1.method1872();
		@Pc(21) int local21 = this.aClass76_2.method2196(local7.method1868());
		if (this.method2112(local21)) {
			@Pc(47) int local47 = this.aClass76Array2[local21].method2196(local11.method1868());
			return this.method2130(local21, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public final void method2140() {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2.length; local11++) {
			this.anObjectArrayArray2[local11] = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lclient!mb;ILclient!mb;)Z")
	public final boolean method2141(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(7) Class62 local7 = arg0.method1872();
		@Pc(11) Class62 local11 = arg1.method1872();
		@Pc(19) int local19 = this.aClass76_2.method2196(local7.method1868());
		if (this.method2112(local19)) {
			@Pc(44) int local44 = this.aClass76Array2[local19].method2196(local11.method1868());
			return this.method2143(local44, local19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!mb;I)I")
	public final int method2142(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1) {
		if (this.method2112(arg1)) {
			@Pc(21) Class62 local21 = arg0.method1872();
			@Pc(31) int local31 = this.aClass76Array2[arg1].method2196(local21.method1868());
			return this.method2124(arg1, local31) ? local31 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z")
	public final boolean method2143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2124(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray29[arg1] == null) {
			this.method2137(arg1);
			return this.anObjectArray29[arg1] != null;
		} else {
			return true;
		}
	}
}
