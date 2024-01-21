import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public abstract class Class11 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Lclient!ig;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "[I")
	protected int[] anIntArray241;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[Lclient!ig;")
	private Class41[] aClass41Array2;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	private int anInt2526;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[I")
	protected int[] anIntArray243;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "[I")
	protected int[] anIntArray244;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
	public int anInt2532;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray3;

	@OriginalMember(owner = "client!bg", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "Z")
	private final boolean aBoolean113;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ZZ)V")
	protected Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean112 = arg0;
		this.aBoolean113 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)[B")
	public final byte[] method2049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2073(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)[B")
	public final byte[] method2050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(45) boolean local45 = this.method2060(null, arg1);
			if (!local45) {
				this.method2054(arg1);
				local45 = this.method2060(null, arg1);
				if (!local45) {
					return null;
				}
			}
		}
		return Static25.method462(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[I")
	public final int[] method2051(@OriginalArg(1) int arg0) {
		@Pc(10) int[] local10 = this.anIntArrayArray28[arg0];
		if (local10 == null) {
			local10 = new int[this.anIntArray243[arg0]];
			@Pc(26) int local26 = 0;
			while (local10.length > local26) {
				local10[local26] = local26++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!lf;)I")
	public final int method2053(@OriginalArg(1) Class49 arg0) {
		@Pc(7) Class49 local7 = arg0.method1643();
		return this.aClass41_2.method1254(local7.method1670());
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	protected void method2054(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!lf;I)I")
	public final int method2056(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class49 local7 = arg0.method1643();
		return this.aClass41Array2[arg1].method1254(local7.method1670());
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!lf;Lclient!lf;)[B")
	public final byte[] method2058(@OriginalArg(1) Class49 arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(3) Class49 local3 = arg1.method1643();
		@Pc(7) Class49 local7 = arg0.method1643();
		@Pc(19) int local19 = this.aClass41_2.method1254(local3.method1670());
		@Pc(35) int local35 = this.aClass41Array2[local19].method1254(local7.method1670());
		return this.method2049(local35, local19);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V")
	protected void method2059(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([III)Z")
	private boolean method2060(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray3[arg1] == null) {
			return false;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray28[arg1];
		@Pc(22) int local22 = this.anIntArray243[arg1];
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg1];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
			@Pc(37) int local37;
			if (local17 == null) {
				local37 = local31;
			} else {
				local37 = local17[local31];
			}
			if (local27[local37] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(91) byte[] local91;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local91 = Static25.method462(false, this.anObjectArray3[arg1]);
		} else {
			local91 = Static25.method462(true, this.anObjectArray3[arg1]);
			@Pc(106) Class2_Sub13 local106 = new Class2_Sub13(local91);
			local106.method2940(arg0, local106.aByteArray49.length);
		}
		@Pc(118) byte[] local118;
		try {
			local118 = Static118.method1997(local91);
		} catch (@Pc(120) RuntimeException local120) {
			throw Static40.method788(local120, "T3 - " + (arg0 != null) + "," + arg1 + "," + local91.length + "," + Static124.method2144(local91, local91.length) + "," + Static124.method2144(local91, local91.length - 2) + "," + this.anIntArray244[arg1] + "," + this.anInt2532);
		}
		if (this.aBoolean112) {
			this.anObjectArray3[arg1] = null;
		}
		@Pc(187) int local187;
		if (local22 > 1) {
			local187 = local118.length;
			@Pc(190) int[] local190 = new int[local22];
			@Pc(192) int local192 = local187 - 1;
			@Pc(197) int local197 = local118[local192] & 0xFF;
			@Pc(202) Class2_Sub13 local202 = new Class2_Sub13(local118);
			@Pc(210) int local210 = local192 - local22 * local197 * 4;
			local202.anInt3940 = local210;
			@Pc(221) int local221;
			for (@Pc(215) int local215 = 0; local215 < local197; local215++) {
				@Pc(219) int local219 = 0;
				for (local221 = 0; local221 < local22; local221++) {
					local219 += local202.method2946();
					local190[local221] += local219;
				}
			}
			@Pc(255) byte[][] local255 = new byte[local22][];
			for (local221 = 0; local221 < local22; local221++) {
				local255[local221] = new byte[local190[local221]];
				local190[local221] = 0;
			}
			local202.anInt3940 = local210;
			@Pc(283) int local283 = 0;
			@Pc(289) int local289;
			@Pc(291) int local291;
			for (@Pc(285) int local285 = 0; local285 < local197; local285++) {
				local289 = 0;
				for (local291 = 0; local291 < local22; local291++) {
					local289 += local202.method2946();
					Static191.method1826(local118, local283, local255[local291], local190[local291], local289);
					local283 += local289;
					local190[local291] += local289;
				}
			}
			for (local289 = 0; local289 < local22; local289++) {
				if (local17 == null) {
					local291 = local289;
				} else {
					local291 = local17[local289];
				}
				if (this.aBoolean113) {
					local27[local291] = local255[local289];
				} else {
					local27[local291] = Static165.method2737(local255[local289]);
				}
			}
		} else {
			if (local17 == null) {
				local187 = 0;
			} else {
				local187 = local17[0];
			}
			if (this.aBoolean113) {
				local27[local187] = local118;
			} else {
				local27[local187] = Static165.method2737(local118);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IB)Z")
	public final boolean method2061(@OriginalArg(0) int arg0) {
		if (this.anObjectArray3[arg0] == null) {
			this.method2054(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(ILclient!lf;Lclient!lf;)Z")
	public final boolean method2062(@OriginalArg(1) Class49 arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(14) Class49 local14 = arg0.method1643();
		@Pc(18) Class49 local18 = arg1.method1643();
		@Pc(26) int local26 = this.aClass41_2.method1254(local14.method1670());
		@Pc(36) int local36 = this.aClass41Array2[local26].method1254(local18.method1670());
		return this.method2063(local36, local26);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(III)Z")
	public final boolean method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray3[arg1] == null) {
			this.method2054(arg1);
			return this.anObjectArray3[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(II)Z")
	public final boolean method2065(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2063(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2063(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!lf;)V")
	public final void method2066(@OriginalArg(1) Class49 arg0) {
		@Pc(7) Class49 local7 = arg0.method1643();
		@Pc(15) int local15 = this.aClass41_2.method1254(local7.method1670());
		if (local15 >= 0) {
			this.method2059(local15);
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(II)V")
	public final void method2068(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)I")
	public final int method2069(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	public final int method2070() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BI)V")
	protected final void method2071(@OriginalArg(0) byte[] arg0) {
		this.anInt2532 = Static124.method2144(arg0, arg0.length);
		@Pc(19) Class2_Sub13 local19 = new Class2_Sub13(Static118.method1997(arg0));
		@Pc(23) int local23 = local19.method2962();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method2946();
		}
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = local19.method2962();
		this.anInt2526 = local19.method2933();
		this.anIntArray245 = new int[this.anInt2526];
		@Pc(69) int local69 = -1;
		for (@Pc(71) int local71 = 0; local71 < this.anInt2526; local71++) {
			this.anIntArray245[local71] = local53 += local19.method2933();
			if (this.anIntArray245[local71] > local69) {
				local69 = this.anIntArray245[local71];
			}
		}
		this.anIntArray244 = new int[local69 + 1];
		this.anIntArray241 = new int[local69 + 1];
		this.anObjectArray3 = new Object[local69 + 1];
		this.anIntArray243 = new int[local69 + 1];
		this.anIntArrayArray28 = new int[local69 + 1][];
		this.anObjectArrayArray2 = new Object[local69 + 1][];
		@Pc(154) int local154;
		@Pc(173) int local173;
		if (local57 != 0) {
			this.anIntArray240 = new int[local69 + 1];
			for (local154 = 0; local154 < local69 + 1; local154++) {
				this.anIntArray240[local154] = -1;
			}
			for (local173 = 0; local173 < this.anInt2526; local173++) {
				this.anIntArray240[this.anIntArray245[local173]] = local19.method2946();
			}
			this.aClass41_2 = new Class41(this.anIntArray240);
		}
		for (local154 = 0; local154 < this.anInt2526; local154++) {
			this.anIntArray244[this.anIntArray245[local154]] = local19.method2946();
		}
		for (local173 = 0; local173 < this.anInt2526; local173++) {
			this.anIntArray241[this.anIntArray245[local173]] = local19.method2946();
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt2526; local247++) {
			this.anIntArray243[this.anIntArray245[local247]] = local19.method2933();
		}
		@Pc(279) int local279;
		@Pc(284) int local284;
		@Pc(292) int local292;
		@Pc(294) int local294;
		@Pc(311) int local311;
		for (@Pc(270) int local270 = 0; local270 < this.anInt2526; local270++) {
			local53 = 0;
			local279 = this.anIntArray245[local270];
			local284 = this.anIntArray243[local279];
			this.anIntArrayArray28[local279] = new int[local284];
			local292 = -1;
			for (local294 = 0; local294 < local284; local294++) {
				local311 = this.anIntArrayArray28[local279][local294] = local53 += local19.method2933();
				if (local292 < local311) {
					local292 = local311;
				}
			}
			if (local292 + 1 == local284) {
				this.anIntArrayArray28[local279] = null;
			}
			this.anObjectArrayArray2[local279] = new Object[local292 + 1];
		}
		if (local57 == 0) {
			return;
		}
		this.anIntArrayArray27 = new int[local69 + 1][];
		this.aClass41Array2 = new Class41[local69 + 1];
		for (local279 = 0; local279 < this.anInt2526; local279++) {
			local284 = this.anIntArray245[local279];
			local292 = this.anIntArray243[local284];
			this.anIntArrayArray27[local284] = new int[this.anObjectArrayArray2[local284].length];
			for (local294 = 0; local294 < this.anObjectArrayArray2[local284].length; local294++) {
				this.anIntArrayArray27[local284][local294] = -1;
			}
			for (local311 = 0; local311 < local292; local311++) {
				@Pc(429) int local429;
				if (this.anIntArrayArray28[local284] == null) {
					local429 = local311;
				} else {
					local429 = this.anIntArrayArray28[local284][local311];
				}
				this.anIntArrayArray27[local284][local429] = local19.method2946();
			}
			this.aClass41Array2[local284] = new Class41(this.anIntArrayArray27[local284]);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Z")
	public final boolean method2072() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray245.length; local15++) {
			@Pc(22) int local22 = this.anIntArray245[local15];
			if (this.anObjectArray3[local22] == null) {
				this.method2054(local22);
				if (this.anObjectArray3[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[III)[B")
	public final byte[] method2073(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || this.anObjectArrayArray2[arg1].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(50) boolean local50 = this.method2060(arg0, arg1);
			if (!local50) {
				this.method2054(arg1);
				local50 = this.method2060(arg0, arg1);
				if (!local50) {
					return null;
				}
			}
		}
		@Pc(82) byte[] local82 = Static25.method462(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean113) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local82;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(II)[B")
	public final byte[] method2075(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2049(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2049(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public final void method2076() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			if (this.anObjectArrayArray2[local7] != null) {
				for (@Pc(22) int local22 = 0; local22 < this.anObjectArrayArray2[local7].length; local22++) {
					this.anObjectArrayArray2[local7][local22] = null;
				}
			}
		}
	}
}
