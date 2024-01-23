import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public abstract class Class86 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
	protected int[] anIntArray485;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray32;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "[Lclient!s;")
	private Class102[] aClass102Array2;

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "[I")
	protected int[] anIntArray486;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "[I")
	protected int[] anIntArray487;

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "Lclient!s;")
	private Class102 aClass102_2;

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
	private int anInt4242;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
	public int anInt4243;

	@OriginalMember(owner = "client!pa", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(ZZ)V")
	protected Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean197 = arg1;
		this.aBoolean198 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[I")
	public final int[] method3308(@OriginalArg(1) int arg0) {
		if (!this.method3328(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.anIntArrayArray35[arg0];
		if (local23 == null) {
			local23 = new int[this.anIntArray485[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local23.length) {
				local23[local33] = local33++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIZ)[B")
	public final byte[] method3309(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method3339(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(29) boolean local29 = this.method3324(arg0, arg2);
			if (!local29) {
				this.method3315(arg2);
				local29 = this.method3324(arg0, arg2);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static220.method3395(this.anObjectArrayArray2[arg2][arg1], false);
		if (this.aBoolean197) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray488[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!hh;)Z")
	public final boolean method3310(@OriginalArg(1) Class50 arg0) {
		@Pc(7) Class50 local7 = arg0.method1233();
		@Pc(15) int local15 = this.aClass102_2.method3084(local7.method1229());
		return this.method3314(local15);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B[B)V")
	protected final void method3311(@OriginalArg(1) byte[] arg0) {
		this.anInt4243 = Static42.method674(arg0, arg0.length);
		@Pc(19) Class1_Sub17 local19 = new Class1_Sub17(Static151.method2538(arg0));
		@Pc(23) int local23 = local19.method2142();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method2140();
		}
		@Pc(55) int local55 = local19.method2142();
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = -1;
		this.anInt4242 = local19.method2178();
		this.anIntArray484 = new int[this.anInt4242];
		for (@Pc(79) int local79 = 0; local79 < this.anInt4242; local79++) {
			this.anIntArray484[local79] = local57 += local19.method2178();
			if (this.anIntArray484[local79] > local59) {
				local59 = this.anIntArray484[local79];
			}
		}
		this.anIntArray488 = new int[local59 + 1];
		this.anIntArray485 = new int[local59 + 1];
		this.anObjectArray32 = new Object[local59 + 1];
		this.anIntArray486 = new int[local59 + 1];
		this.anIntArray487 = new int[local59 + 1];
		this.anObjectArrayArray2 = new Object[local59 + 1][];
		this.anIntArrayArray35 = new int[local59 + 1][];
		@Pc(164) int local164;
		@Pc(179) int local179;
		if (local55 != 0) {
			this.anIntArray489 = new int[local59 + 1];
			for (local164 = 0; local164 < local59 + 1; local164++) {
				this.anIntArray489[local164] = -1;
			}
			for (local179 = 0; local179 < this.anInt4242; local179++) {
				this.anIntArray489[this.anIntArray484[local179]] = local19.method2140();
			}
			this.aClass102_2 = new Class102(this.anIntArray489);
		}
		for (local164 = 0; local164 < this.anInt4242; local164++) {
			this.anIntArray487[this.anIntArray484[local164]] = local19.method2140();
		}
		for (local179 = 0; local179 < this.anInt4242; local179++) {
			this.anIntArray486[this.anIntArray484[local179]] = local19.method2140();
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt4242; local247++) {
			this.anIntArray485[this.anIntArray484[local247]] = local19.method2178();
		}
		@Pc(279) int local279;
		@Pc(286) int local286;
		@Pc(281) int local281;
		@Pc(294) int local294;
		@Pc(311) int local311;
		for (@Pc(270) int local270 = 0; local270 < this.anInt4242; local270++) {
			local57 = 0;
			local279 = this.anIntArray484[local270];
			local281 = -1;
			local286 = this.anIntArray485[local279];
			this.anIntArrayArray35[local279] = new int[local286];
			for (local294 = 0; local294 < local286; local294++) {
				local311 = this.anIntArrayArray35[local279][local294] = local57 += local19.method2178();
				if (local281 < local311) {
					local281 = local311;
				}
			}
			this.anIntArray488[local279] = local281 + 1;
			if (local286 == local281 + 1) {
				this.anIntArrayArray35[local279] = null;
			}
		}
		if (local55 == 0) {
			return;
		}
		this.aClass102Array2 = new Class102[local59 + 1];
		this.anIntArrayArray36 = new int[local59 + 1][];
		for (local279 = 0; local279 < this.anInt4242; local279++) {
			local286 = this.anIntArray484[local279];
			local281 = this.anIntArray485[local286];
			this.anIntArrayArray36[local286] = new int[this.anIntArray488[local286]];
			for (local294 = 0; local294 < this.anIntArray488[local286]; local294++) {
				this.anIntArrayArray36[local286][local294] = -1;
			}
			for (local311 = 0; local311 < local281; local311++) {
				@Pc(424) int local424;
				if (this.anIntArrayArray35[local286] == null) {
					local424 = local311;
				} else {
					local424 = this.anIntArrayArray35[local286][local311];
				}
				this.anIntArrayArray36[local286][local424] = local19.method2140();
			}
			this.aClass102Array2[local286] = new Class102(this.anIntArrayArray36[local286]);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Z")
	public final boolean method3312() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray484.length; local14++) {
			@Pc(21) int local21 = this.anIntArray484[local14];
			if (this.anObjectArray32[local21] == null) {
				this.method3315(local21);
				if (this.anObjectArray32[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
	protected int method3313(@OriginalArg(1) int arg0) {
		if (this.method3328(arg0)) {
			return this.anObjectArray32[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Z")
	public final boolean method3314(@OriginalArg(0) int arg0) {
		if (!this.method3328(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method3315(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
	protected void method3315(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(BLclient!hh;)Z")
	public final boolean method3317(@OriginalArg(1) Class50 arg0) {
		@Pc(15) Class50 local15 = arg0.method1233();
		@Pc(23) int local23 = this.aClass102_2.method3084(local15.method1229());
		return local23 >= 0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
	public final int method3319() {
		return this.anIntArray488.length;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(BI)[B")
	public final byte[] method3320(@OriginalArg(1) int arg0) {
		if (this.anIntArray488.length == 1) {
			return this.method3325(0, arg0);
		} else if (!this.method3328(arg0)) {
			return null;
		} else if (this.anIntArray488[arg0] == 1) {
			return this.method3325(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!hh;Lclient!hh;I)Z")
	public final boolean method3321(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(7) Class50 local7 = arg0.method1233();
		@Pc(11) Class50 local11 = arg1.method1233();
		@Pc(19) int local19 = this.aClass102_2.method3084(local7.method1229());
		if (this.method3328(local19)) {
			@Pc(38) int local38 = this.aClass102Array2[local19].method3084(local11.method1229());
			return this.method3329(local38, local19);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)Z")
	public final boolean method3322(@OriginalArg(0) int arg0) {
		if (this.anIntArray488.length == 1) {
			return this.method3329(arg0, 0);
		} else if (!this.method3328(arg0)) {
			return false;
		} else if (this.anIntArray488[arg0] == 1) {
			return this.method3329(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)I")
	public final int method3323(@OriginalArg(0) int arg0) {
		return this.method3328(arg0) ? this.anIntArray488[arg0] : 0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IBI)Z")
	private boolean method3324(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method3328(arg1)) {
			return false;
		} else if (this.anObjectArray32[arg1] == null) {
			return false;
		} else {
			@Pc(24) int[] local24 = this.anIntArrayArray35[arg1];
			@Pc(29) int local29 = this.anIntArray485[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray488[arg1]];
			}
			@Pc(45) boolean local45 = true;
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg1];
			for (@Pc(52) int local52 = 0; local52 < local29; local52++) {
				@Pc(60) int local60;
				if (local24 == null) {
					local60 = local52;
				} else {
					local60 = local24[local52];
				}
				if (local50[local60] == null) {
					local45 = false;
					break;
				}
			}
			if (local45) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local127 = Static220.method3395(this.anObjectArray32[arg1], false);
			} else {
				local127 = Static220.method3395(this.anObjectArray32[arg1], true);
				@Pc(132) Class1_Sub17 local132 = new Class1_Sub17(local127);
				local132.method2153(arg0, local132.aByteArray40.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static151.method2538(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static230.method2569(local156, "T3 - " + (arg0 != null) + "," + arg1 + "," + local127.length + "," + Static42.method674(local127, local127.length) + "," + Static42.method674(local127, local127.length - 2) + "," + this.anIntArray487[arg1] + "," + this.anInt4243);
			}
			if (this.aBoolean198) {
				this.anObjectArray32[arg1] = null;
			}
			@Pc(225) int local225;
			if (local29 > 1) {
				local225 = local154.length;
				@Pc(228) int local228 = local225 - 1;
				@Pc(232) int local232 = local154[local228] & 0xFF;
				@Pc(240) int local240 = local228 - local232 * 4 * local29;
				@Pc(245) Class1_Sub17 local245 = new Class1_Sub17(local154);
				@Pc(248) int[] local248 = new int[local29];
				local245.anInt2656 = local240;
				@Pc(259) int local259;
				for (@Pc(253) int local253 = 0; local253 < local232; local253++) {
					@Pc(257) int local257 = 0;
					for (local259 = 0; local259 < local29; local259++) {
						local257 += local245.method2140();
						local248[local259] += local257;
					}
				}
				@Pc(293) byte[][] local293 = new byte[local29][];
				for (local259 = 0; local259 < local29; local259++) {
					local293[local259] = new byte[local248[local259]];
					local248[local259] = 0;
				}
				@Pc(318) int local318 = 0;
				local245.anInt2656 = local240;
				@Pc(327) int local327;
				@Pc(329) int local329;
				for (@Pc(323) int local323 = 0; local323 < local232; local323++) {
					local327 = 0;
					for (local329 = 0; local329 < local29; local329++) {
						local327 += local245.method2140();
						Static235.method866(local154, local318, local293[local329], local248[local329], local327);
						local318 += local327;
						local248[local329] += local327;
					}
				}
				for (local327 = 0; local327 < local29; local327++) {
					if (local24 == null) {
						local329 = local327;
					} else {
						local329 = local24[local327];
					}
					if (this.aBoolean197) {
						local50[local329] = local293[local327];
					} else {
						local50[local329] = Static16.method230(local293[local327]);
					}
				}
			} else {
				if (local24 == null) {
					local225 = 0;
				} else {
					local225 = local24[0];
				}
				if (this.aBoolean197) {
					local50[local225] = local154;
				} else {
					local50[local225] = Static16.method230(local154);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)[B")
	public final byte[] method3325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3309(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public final void method3326() {
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray2.length; local15++) {
			this.anObjectArrayArray2[local15] = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)[B")
	public final byte[] method3327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3339(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(37) boolean local37 = this.method3324(null, arg1);
			if (!local37) {
				this.method3315(arg1);
				local37 = this.method3324(null, arg1);
				if (!local37) {
					return null;
				}
			}
		}
		return Static220.method3395(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(BI)Z")
	protected final boolean method3328(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray488.length && this.anIntArray488[arg0] != 0) {
			return true;
		} else if (Static114.aBoolean99) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIB)Z")
	public final boolean method3329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3339(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method3315(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(BI)V")
	protected void method3330(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!hh;B)I")
	public final int method3331(@OriginalArg(0) Class50 arg0) {
		@Pc(3) Class50 local3 = arg0.method1233();
		@Pc(24) int local24 = this.aClass102_2.method3084(local3.method1229());
		return this.method3313(local24);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!hh;)V")
	public final void method3333(@OriginalArg(1) Class50 arg0) {
		@Pc(3) Class50 local3 = arg0.method1233();
		@Pc(19) int local19 = this.aClass102_2.method3084(local3.method1229());
		this.method3330(local19);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!hh;Lclient!hh;)[B")
	public final byte[] method3335(@OriginalArg(1) Class50 arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(3) Class50 local3 = arg1.method1233();
		@Pc(7) Class50 local7 = arg0.method1233();
		@Pc(15) int local15 = this.aClass102_2.method3084(local3.method1229());
		if (this.method3328(local15)) {
			@Pc(42) int local42 = this.aClass102Array2[local15].method3084(local7.method1229());
			return this.method3325(local15, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!hh;)I")
	public final int method3336(@OriginalArg(1) Class50 arg0) {
		@Pc(3) Class50 local3 = arg0.method1233();
		@Pc(20) int local20 = this.aClass102_2.method3084(local3.method1229());
		return this.method3328(local20) ? local20 : -1;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)V")
	public final void method3337(@OriginalArg(0) int arg0) {
		if (this.method3328(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)Z")
	private boolean method3339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray488.length && arg0 < this.anIntArray488[arg1]) {
			return true;
		} else if (Static114.aBoolean99) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)I")
	public final int method3340() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray32.length; local11++) {
			if (this.anIntArray485[local11] > 0) {
				local9 += this.method3313(local11);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIZ)V")
	public final void method3341(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			this.anIntArray489 = null;
			this.aClass102_2 = null;
		}
		this.anIntArrayArray36 = null;
		this.aClass102Array2 = null;
	}
}
