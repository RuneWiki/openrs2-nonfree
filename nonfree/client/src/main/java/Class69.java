import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public abstract class Class69 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[Lclient!dh;")
	private Class23[] aClass23Array2;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	private int anInt2872;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
	protected int[] anIntArray231;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray3;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "[I")
	protected int[] anIntArray233;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "Lclient!dh;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "[I")
	protected int[] anIntArray236;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Z")
	private final boolean aBoolean133;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Z")
	private final boolean aBoolean132;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ZZ)V")
	protected Class69(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean133 = arg0;
		this.aBoolean132 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZI)Z")
	public final boolean method2194(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2217(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method2197(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!dj;)I")
	public final int method2195(@OriginalArg(1) Class24 arg0) {
		@Pc(3) Class24 local3 = arg0.method753();
		@Pc(23) int local23 = this.aClass23_2.method728(local3.method745());
		return this.method2211(local23);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!dj;B)Z")
	public final boolean method2196(@OriginalArg(0) Class24 arg0) {
		@Pc(15) Class24 local15 = arg0.method753();
		@Pc(23) int local23 = this.aClass23_2.method728(local15.method745());
		return this.method2210(local23);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	protected void method2197(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(BLclient!dj;)V")
	public final void method2200(@OriginalArg(1) Class24 arg0) {
		@Pc(7) Class24 local7 = arg0.method753();
		@Pc(15) int local15 = this.aClass23_2.method728(local7.method745());
		this.method2222(local15);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[B)V")
	protected final void method2201(@OriginalArg(1) byte[] arg0) {
		this.anInt2891 = Static3.method95(arg0, arg0.length);
		@Pc(19) Class1_Sub7 local19 = new Class1_Sub7(Static207.method3160(arg0));
		@Pc(23) int local23 = local19.method2771();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(47) int local47 = 0;
		if (local23 >= 6) {
			local19.method2793();
		}
		@Pc(58) int local58 = -1;
		@Pc(62) int local62 = local19.method2771();
		this.anInt2872 = local19.method2765();
		this.anIntArray234 = new int[this.anInt2872];
		for (@Pc(74) int local74 = 0; local74 < this.anInt2872; local74++) {
			this.anIntArray234[local74] = local47 += local19.method2765();
			if (local58 < this.anIntArray234[local74]) {
				local58 = this.anIntArray234[local74];
			}
		}
		this.anIntArrayArray24 = new int[local58 + 1][];
		this.anIntArray231 = new int[local58 + 1];
		this.anIntArray236 = new int[local58 + 1];
		this.anIntArray233 = new int[local58 + 1];
		this.anObjectArrayArray2 = new Object[local58 + 1][];
		this.anIntArray235 = new int[local58 + 1];
		this.anObjectArray3 = new Object[local58 + 1];
		@Pc(166) int local166;
		@Pc(181) int local181;
		if (local62 != 0) {
			this.anIntArray232 = new int[local58 + 1];
			for (local166 = 0; local166 < local58 + 1; local166++) {
				this.anIntArray232[local166] = -1;
			}
			for (local181 = 0; local181 < this.anInt2872; local181++) {
				this.anIntArray232[this.anIntArray234[local181]] = local19.method2793();
			}
			this.aClass23_2 = new Class23(this.anIntArray232);
		}
		for (local166 = 0; local166 < this.anInt2872; local166++) {
			this.anIntArray233[this.anIntArray234[local166]] = local19.method2793();
		}
		for (local181 = 0; local181 < this.anInt2872; local181++) {
			this.anIntArray236[this.anIntArray234[local181]] = local19.method2793();
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt2872; local253++) {
			this.anIntArray231[this.anIntArray234[local253]] = local19.method2765();
		}
		@Pc(281) int local281;
		@Pc(286) int local286;
		@Pc(294) int local294;
		@Pc(296) int local296;
		@Pc(313) int local313;
		for (@Pc(272) int local272 = 0; local272 < this.anInt2872; local272++) {
			local47 = 0;
			local281 = this.anIntArray234[local272];
			local286 = this.anIntArray231[local281];
			this.anIntArrayArray24[local281] = new int[local286];
			local294 = -1;
			for (local296 = 0; local296 < local286; local296++) {
				local313 = this.anIntArrayArray24[local281][local296] = local47 += local19.method2765();
				if (local294 < local313) {
					local294 = local313;
				}
			}
			this.anIntArray235[local281] = local294 + 1;
			if (local286 == local294 + 1) {
				this.anIntArrayArray24[local281] = null;
			}
		}
		if (local62 == 0) {
			return;
		}
		this.aClass23Array2 = new Class23[local58 + 1];
		this.anIntArrayArray23 = new int[local58 + 1][];
		for (local281 = 0; local281 < this.anInt2872; local281++) {
			local286 = this.anIntArray234[local281];
			local294 = this.anIntArray231[local286];
			this.anIntArrayArray23[local286] = new int[this.anIntArray235[local286]];
			for (local296 = 0; local296 < this.anIntArray235[local286]; local296++) {
				this.anIntArrayArray23[local286][local296] = -1;
			}
			for (local313 = 0; local313 < local294; local313++) {
				@Pc(425) int local425;
				if (this.anIntArrayArray24[local286] == null) {
					local425 = local313;
				} else {
					local425 = this.anIntArrayArray24[local286][local313];
				}
				this.anIntArrayArray23[local286][local425] = local19.method2793();
			}
			this.aClass23Array2[local286] = new Class23(this.anIntArrayArray23[local286]);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)[B")
	public final byte[] method2202(@OriginalArg(1) int arg0) {
		if (this.anIntArray235.length == 1) {
			return this.method2208(0, arg0);
		} else if (!this.method2206(arg0)) {
			return null;
		} else if (this.anIntArray235[arg0] == 1) {
			return this.method2208(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!dj;I)I")
	public final int method2203(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1) {
		if (this.method2206(arg0)) {
			@Pc(18) Class24 local18 = arg1.method753();
			@Pc(28) int local28 = this.aClass23Array2[arg0].method728(local18.method745());
			return this.method2217(local28, arg0) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)[B")
	public final byte[] method2204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2217(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method2213(arg1, null);
			if (!local29) {
				this.method2197(arg1);
				local29 = this.method2213(arg1, null);
				if (!local29) {
					return null;
				}
			}
		}
		return Static157.method2664(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!dj;I)I")
	public final int method2205(@OriginalArg(0) Class24 arg0) {
		@Pc(8) Class24 local8 = arg0.method753();
		@Pc(16) int local16 = this.aClass23_2.method728(local8.method745());
		return this.method2206(local16) ? local16 : -1;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)Z")
	protected final boolean method2206(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && this.anIntArray235.length > arg0 && this.anIntArray235[arg0] != 0) {
			return true;
		} else if (Static196.aBoolean203) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZBZ)V")
	public final void method2207(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anIntArray232 = null;
			this.aClass23_2 = null;
		}
		this.aClass23Array2 = null;
		this.anIntArrayArray23 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIB)[B")
	public final byte[] method2208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2219(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
	public final boolean method2209(@OriginalArg(1) int arg0) {
		if (this.anIntArray235.length == 1) {
			return this.method2194(0, arg0);
		} else if (!this.method2206(arg0)) {
			return false;
		} else if (this.anIntArray235[arg0] == 1) {
			return this.method2194(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ZI)Z")
	public final boolean method2210(@OriginalArg(1) int arg0) {
		if (!this.method2206(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method2197(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
	protected int method2211(@OriginalArg(0) int arg0) {
		if (this.method2206(arg0)) {
			return this.anObjectArray3[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public final int method2212() {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anObjectArray3.length; local9++) {
			if (this.anIntArray231[local9] > 0) {
				local7 += 100;
				local5 += this.method2211(local9);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local5 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[I)Z")
	private boolean method2213(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method2206(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			return false;
		} else {
			@Pc(22) int local22 = this.anIntArray231[arg0];
			@Pc(27) int[] local27 = this.anIntArrayArray24[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray235[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray2[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local22; local50++) {
				@Pc(55) int local55;
				if (local27 == null) {
					local55 = local50;
				} else {
					local55 = local27[local50];
				}
				if (local46[local55] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local117 = Static157.method2664(this.anObjectArray3[arg0], false);
			} else {
				local117 = Static157.method2664(this.anObjectArray3[arg0], true);
				@Pc(131) Class1_Sub7 local131 = new Class1_Sub7(local117);
				local131.method2797(arg1, local131.aByteArray38.length);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static207.method3160(local117);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static88.method1591(local145, "T3 - " + (arg1 != null) + "," + arg0 + "," + local117.length + "," + Static3.method95(local117, local117.length) + "," + Static3.method95(local117, local117.length - 2) + "," + this.anIntArray233[arg0] + "," + this.anInt2891);
			}
			if (this.aBoolean133) {
				this.anObjectArray3[arg0] = null;
			}
			@Pc(212) int local212;
			if (local22 > 1) {
				local212 = local143.length;
				@Pc(214) int local214 = local212 - 1;
				@Pc(219) int local219 = local143[local214] & 0xFF;
				@Pc(224) Class1_Sub7 local224 = new Class1_Sub7(local143);
				@Pc(232) int local232 = local214 - local22 * local219 * 4;
				@Pc(235) int[] local235 = new int[local22];
				local224.anInt3592 = local232;
				@Pc(245) int local245;
				for (@Pc(240) int local240 = 0; local240 < local219; local240++) {
					@Pc(243) int local243 = 0;
					for (local245 = 0; local245 < local22; local245++) {
						local243 += local224.method2793();
						local235[local245] += local243;
					}
				}
				@Pc(270) byte[][] local270 = new byte[local22][];
				for (local245 = 0; local245 < local22; local245++) {
					local270[local245] = new byte[local235[local245]];
					local235[local245] = 0;
				}
				local224.anInt3592 = local232;
				@Pc(297) int local297 = 0;
				@Pc(302) int local302;
				@Pc(304) int local304;
				for (@Pc(299) int local299 = 0; local299 < local219; local299++) {
					local302 = 0;
					for (local304 = 0; local304 < local22; local304++) {
						local302 += local224.method2793();
						Static214.method348(local143, local297, local270[local304], local235[local304], local302);
						local297 += local302;
						local235[local304] += local302;
					}
				}
				for (local302 = 0; local302 < local22; local302++) {
					if (local27 == null) {
						local304 = local302;
					} else {
						local304 = local27[local302];
					}
					if (this.aBoolean132) {
						local46[local304] = local270[local302];
					} else {
						local46[local304] = Static57.method1100(local270[local302]);
					}
				}
			} else {
				if (local27 == null) {
					local212 = 0;
				} else {
					local212 = local27[0];
				}
				if (this.aBoolean132) {
					local46[local212] = local143;
				} else {
					local46[local212] = Static57.method1100(local143);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!dj;Lclient!dj;)[B")
	public final byte[] method2214(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(3) Class24 local3 = arg1.method753();
		@Pc(7) Class24 local7 = arg0.method753();
		@Pc(15) int local15 = this.aClass23_2.method728(local3.method745());
		if (this.method2206(local15)) {
			@Pc(36) int local36 = this.aClass23Array2[local15].method728(local7.method745());
			return this.method2208(local15, local36);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!dj;Lclient!dj;)Z")
	public final boolean method2215(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(7) Class24 local7 = arg0.method753();
		@Pc(11) Class24 local11 = arg1.method753();
		@Pc(19) int local19 = this.aClass23_2.method728(local7.method745());
		if (this.method2206(local19)) {
			@Pc(40) int local40 = this.aClass23Array2[local19].method728(local11.method745());
			return this.method2194(local19, local40);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)I")
	public final int method2216(@OriginalArg(1) int arg0) {
		return this.method2206(arg0) ? this.anIntArray235[arg0] : 0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Z")
	private boolean method2217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray235.length && arg0 < this.anIntArray235[arg1]) {
			return true;
		} else if (Static196.aBoolean203) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)V")
	public final void method2218(@OriginalArg(0) int arg0) {
		if (this.method2206(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[I)[B")
	public final byte[] method2219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method2217(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(34) boolean local34 = this.method2213(arg0, arg2);
			if (!local34) {
				this.method2197(arg0);
				local34 = this.method2213(arg0, arg2);
				if (!local34) {
					return null;
				}
			}
		}
		@Pc(60) byte[] local60 = Static157.method2664(this.anObjectArrayArray2[arg0][arg1], false);
		if (this.aBoolean132) {
			this.anObjectArrayArray2[arg0][arg1] = null;
			if (this.anIntArray235[arg0] == 1) {
				this.anObjectArrayArray2[arg0] = null;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
	public final int method2220() {
		return this.anIntArray235.length;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z")
	public final boolean method2221() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray234.length; local9++) {
			@Pc(16) int local16 = this.anIntArray234[local9];
			if (this.anObjectArray3[local16] == null) {
				this.method2197(local16);
				if (this.anObjectArray3[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IZ)V")
	protected void method2222(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	public final void method2223() {
		for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2.length; local9++) {
			this.anObjectArrayArray2[local9] = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(II)[I")
	public final int[] method2225(@OriginalArg(0) int arg0) {
		if (!this.method2206(arg0)) {
			return null;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray24[arg0];
		if (local15 == null) {
			local15 = new int[this.anIntArray231[arg0]];
			@Pc(30) int local30 = 0;
			while (local30 < local15.length) {
				local15[local30] = local30++;
			}
		}
		return local15;
	}
}
