import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!tb", name = "Nb", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
	private int anInt2292 = 128;

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
	private int anInt2299 = -1;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
	public int anInt2301 = -1;

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "Lclient!rd;")
	public Class64 aClass64_1477 = Static60.aClass64_859;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
	public int anInt2293 = -1;

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "Z")
	public boolean aBoolean141 = true;

	@OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
	public int anInt2305 = -1;

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
	private int anInt2302 = -1;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
	private int anInt2295 = 0;

	@OriginalMember(owner = "client!tb", name = "Gb", descriptor = "[Lclient!rd;")
	public final Class64[] aClass64Array17 = new Class64[5];

	@OriginalMember(owner = "client!tb", name = "yb", descriptor = "Z")
	public boolean aBoolean140 = true;

	@OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
	public int anInt2308 = -1;

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "I")
	public int anInt2303 = -1;

	@OriginalMember(owner = "client!tb", name = "Jb", descriptor = "I")
	private int anInt2311 = 128;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
	public int anInt2309 = -1;

	@OriginalMember(owner = "client!tb", name = "Ab", descriptor = "I")
	private int anInt2307 = 0;

	@OriginalMember(owner = "client!tb", name = "Ib", descriptor = "I")
	public int anInt2310 = 32;

	@OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
	public int anInt2314 = -1;

	@OriginalMember(owner = "client!tb", name = "Mb", descriptor = "I")
	public int anInt2313 = 1;

	@OriginalMember(owner = "client!tb", name = "Kb", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!tb", name = "Ub", descriptor = "I")
	public int anInt2319 = -1;

	@OriginalMember(owner = "client!tb", name = "Tb", descriptor = "I")
	public int anInt2318 = -1;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Lclient!tb;")
	public Class1_Sub1_Sub15 method1648() {
		@Pc(1) int local1 = -1;
		if (this.anInt2302 != -1) {
			local1 = Static75.method1253(this.anInt2302);
		} else if (this.anInt2299 != -1) {
			local1 = Static101.anIntArray333[this.anInt2299];
		}
		return local1 < 0 || local1 >= this.anIntArray339.length || this.anIntArray339[local1] == -1 ? null : Static42.method697(this.anIntArray339[local1]);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!id;)V")
	public void method1649(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1837();
			if (local12 == 0) {
				return;
			}
			this.method1652(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!e;IBLclient!e;)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1651(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub1_Sub4 arg3) {
		if (this.anIntArray339 != null) {
			@Pc(12) Class1_Sub1_Sub15 local12 = this.method1648();
			return local12 == null ? null : local12.method1651(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class1_Sub1_Sub2_Sub7 local37 = (Class1_Sub1_Sub2_Sub7) Static39.aClass19_35.method410((long) this.anInt2306);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray338.length; local43++) {
				if (!Static103.aClass41_61.method1072(0, this.anIntArray338[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(75) Class1_Sub1_Sub2_Sub3[] local75 = new Class1_Sub1_Sub2_Sub3[this.anIntArray338.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray338.length; local77++) {
				local75[local77] = Static59.method1010(Static103.aClass41_61, this.anIntArray338[local77]);
			}
			@Pc(106) Class1_Sub1_Sub2_Sub3 local106;
			if (local75.length == 1) {
				local106 = local75[0];
			} else {
				local106 = new Class1_Sub1_Sub2_Sub3(local75, local75.length);
			}
			if (this.aShortArray10 != null) {
				for (@Pc(117) int local117 = 0; local117 < this.aShortArray10.length; local117++) {
					local106.method1013(this.aShortArray10[local117], this.aShortArray9[local117]);
				}
			}
			local37 = local106.method1002(this.anInt2295 + 64, this.anInt2307 + 850, -30, -50, -30);
			Static39.aClass19_35.method409(local37, (long) this.anInt2306);
		}
		@Pc(168) Class1_Sub1_Sub2_Sub7 local168;
		if (arg1 != null && arg3 != null) {
			local168 = arg1.method450(arg0, arg2, arg3, local37);
		} else if (arg1 != null) {
			local168 = arg1.method456(local37, arg2);
		} else if (arg3 == null) {
			local168 = local37.method1923(true);
		} else {
			local168 = arg3.method456(local37, arg0);
		}
		if (this.anInt2311 != 128 || this.anInt2292 != 128) {
			local168.method1913(this.anInt2311, this.anInt2292, this.anInt2311);
		}
		return local168;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!id;I)V")
	private void method1652(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 1) {
			local14 = arg0.method1837();
			this.anIntArray338 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray338[local20] = arg0.method1842();
			}
		} else if (arg1 == 2) {
			this.aClass64_1477 = arg0.method1831();
		} else if (arg1 == 12) {
			this.anInt2313 = arg0.method1837();
		} else if (arg1 == 13) {
			this.anInt2301 = arg0.method1842();
		} else if (arg1 == 14) {
			this.anInt2308 = arg0.method1842();
		} else if (arg1 == 15) {
			this.anInt2319 = arg0.method1842();
		} else if (arg1 == 16) {
			this.anInt2303 = arg0.method1842();
		} else if (arg1 == 17) {
			this.anInt2308 = arg0.method1842();
			this.anInt2305 = arg0.method1842();
			this.anInt2293 = arg0.method1842();
			this.anInt2314 = arg0.method1842();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass64Array17[arg1 - 30] = arg0.method1831();
			if (this.aClass64Array17[arg1 - 30].method1501(Static25.aClass64_1772)) {
				this.aClass64Array17[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local14 = arg0.method1837();
			this.aShortArray9 = new short[local14];
			this.aShortArray10 = new short[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.aShortArray10[local20] = (short) arg0.method1842();
				this.aShortArray9[local20] = (short) arg0.method1842();
			}
		} else if (arg1 == 60) {
			local14 = arg0.method1837();
			this.anIntArray340 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray340[local20] = arg0.method1842();
			}
		} else if (arg1 == 93) {
			this.aBoolean140 = false;
		} else if (arg1 == 95) {
			this.anInt2318 = arg0.method1842();
		} else if (arg1 == 97) {
			this.anInt2311 = arg0.method1842();
		} else if (arg1 == 98) {
			this.anInt2292 = arg0.method1842();
		} else if (arg1 == 99) {
			this.aBoolean142 = true;
		} else if (arg1 == 100) {
			this.anInt2295 = arg0.method1824();
		} else if (arg1 == 101) {
			this.anInt2307 = arg0.method1824() * 5;
		} else if (arg1 == 102) {
			this.anInt2309 = arg0.method1842();
		} else if (arg1 == 103) {
			this.anInt2310 = arg0.method1842();
		} else if (arg1 == 106) {
			this.anInt2302 = arg0.method1842();
			if (this.anInt2302 == 65535) {
				this.anInt2302 = -1;
			}
			this.anInt2299 = arg0.method1842();
			if (this.anInt2299 == 65535) {
				this.anInt2299 = -1;
			}
			local14 = arg0.method1837();
			this.anIntArray339 = new int[local14 + 1];
			for (local20 = 0; local20 <= local14; local20++) {
				this.anIntArray339[local20] = arg0.method1842();
				if (this.anIntArray339[local20] == 65535) {
					this.anIntArray339[local20] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean141 = false;
		} else if (arg1 == 109) {
			this.aBoolean139 = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public void method1655() {
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method1656() {
		if (this.anIntArray339 != null) {
			@Pc(12) Class1_Sub1_Sub15 local12 = this.method1648();
			return local12 == null ? null : local12.method1656();
		} else if (this.anIntArray340 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray340.length; local29++) {
				if (!Static103.aClass41_61.method1072(0, this.anIntArray340[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class1_Sub1_Sub2_Sub3[] local57 = new Class1_Sub1_Sub2_Sub3[this.anIntArray340.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray340.length; local59++) {
				local57[local59] = Static59.method1010(Static103.aClass41_61, this.anIntArray340[local59]);
			}
			@Pc(87) Class1_Sub1_Sub2_Sub3 local87;
			if (local57.length == 1) {
				local87 = local57[0];
			} else {
				local87 = new Class1_Sub1_Sub2_Sub3(local57, local57.length);
			}
			if (this.aShortArray10 != null) {
				for (@Pc(101) int local101 = 0; local101 < this.aShortArray10.length; local101++) {
					local87.method1013(this.aShortArray10[local101], this.aShortArray9[local101]);
				}
			}
			return local87;
		}
	}

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)Z")
	public boolean method1657() {
		if (this.anIntArray339 == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.anInt2302 != -1) {
			local16 = Static75.method1253(this.anInt2302);
		} else if (this.anInt2299 != -1) {
			local16 = Static101.anIntArray333[this.anInt2299];
		}
		return local16 >= 0 && local16 < this.anIntArray339.length && this.anIntArray339[local16] != -1;
	}
}
