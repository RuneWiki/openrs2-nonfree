import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "[I")
	public static int[] anIntArray323 = new int[32];

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!ne", name = "mb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ne", name = "ub", descriptor = "I")
	public int anInt2105;

	@OriginalMember(owner = "client!ne", name = "Ab", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ne", name = "Ib", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
	private int anInt2093 = -1;

	@OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
	private int anInt2099 = 128;

	@OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
	public int anInt2101 = -1;

	@OriginalMember(owner = "client!ne", name = "vb", descriptor = "I")
	public int anInt2106 = -1;

	@OriginalMember(owner = "client!ne", name = "qb", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
	public int anInt2095 = -1;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
	public int anInt2096 = -1;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!ne", name = "yb", descriptor = "I")
	private int anInt2108 = 0;

	@OriginalMember(owner = "client!ne", name = "Db", descriptor = "I")
	private int anInt2112 = 0;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[Lclient!af;")
	public final Class5[] aClass5Array16 = new Class5[5];

	@OriginalMember(owner = "client!ne", name = "Eb", descriptor = "I")
	public int anInt2113 = -1;

	@OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
	private int anInt2100 = -1;

	@OriginalMember(owner = "client!ne", name = "xb", descriptor = "I")
	public int anInt2107 = -1;

	@OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
	private int anInt2103 = 128;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
	public int anInt2092 = 1;

	@OriginalMember(owner = "client!ne", name = "Gb", descriptor = "I")
	public int anInt2114 = -1;

	@OriginalMember(owner = "client!ne", name = "Kb", descriptor = "I")
	public int anInt2116 = -1;

	@OriginalMember(owner = "client!ne", name = "Hb", descriptor = "I")
	public int anInt2115 = 32;

	@OriginalMember(owner = "client!ne", name = "Jb", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!ne", name = "Mb", descriptor = "I")
	public int anInt2117 = -1;

	@OriginalMember(owner = "client!ne", name = "rb", descriptor = "Lclient!af;")
	public Class5 aClass5_1028 = Static49.aClass5_616;

	static {
		@Pc(21) int local21 = 2;
		for (@Pc(23) int local23 = 0; local23 < 32; local23++) {
			anIntArray323[local23] = local21 - 1;
			local21 += local21;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!rd;B)V")
	private void method1470(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg0 == 1) {
			local12 = arg1.method2053();
			this.anIntArray326 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray326[local18] = arg1.method2087();
			}
		} else if (arg0 == 2) {
			this.aClass5_1028 = arg1.method2101();
		} else if (arg0 == 12) {
			this.anInt2092 = arg1.method2053();
		} else if (arg0 == 13) {
			this.anInt2101 = arg1.method2087();
		} else if (arg0 == 14) {
			this.anInt2106 = arg1.method2087();
		} else if (arg0 == 15) {
			this.anInt2117 = arg1.method2087();
		} else if (arg0 == 16) {
			this.anInt2116 = arg1.method2087();
		} else if (arg0 == 17) {
			this.anInt2106 = arg1.method2087();
			this.anInt2096 = arg1.method2087();
			this.anInt2095 = arg1.method2087();
			this.anInt2113 = arg1.method2087();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass5Array16[arg0 - 30] = arg1.method2101();
			if (this.aClass5Array16[arg0 - 30].method207(Static105.aClass5_1347)) {
				this.aClass5Array16[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local12 = arg1.method2053();
			this.aShortArray8 = new short[local12];
			this.aShortArray9 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray8[local18] = (short) arg1.method2087();
				this.aShortArray9[local18] = (short) arg1.method2087();
			}
		} else if (arg0 == 60) {
			local12 = arg1.method2053();
			this.anIntArray325 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray325[local18] = arg1.method2087();
			}
		} else if (arg0 == 93) {
			this.aBoolean74 = false;
		} else if (arg0 == 95) {
			this.anInt2114 = arg1.method2087();
		} else if (arg0 == 97) {
			this.anInt2103 = arg1.method2087();
		} else if (arg0 == 98) {
			this.anInt2099 = arg1.method2087();
		} else if (arg0 == 99) {
			this.aBoolean71 = true;
		} else if (arg0 == 100) {
			this.anInt2108 = arg1.method2099();
		} else if (arg0 == 101) {
			this.anInt2112 = arg1.method2099() * 5;
		} else if (arg0 == 102) {
			this.anInt2107 = arg1.method2087();
		} else if (arg0 == 103) {
			this.anInt2115 = arg1.method2087();
		} else if (arg0 == 106) {
			this.anInt2093 = arg1.method2087();
			if (this.anInt2093 == 65535) {
				this.anInt2093 = -1;
			}
			this.anInt2100 = arg1.method2087();
			if (this.anInt2100 == 65535) {
				this.anInt2100 = -1;
			}
			local12 = arg1.method2053();
			this.anIntArray324 = new int[local12 + 1];
			for (local18 = 0; local18 <= local12; local18++) {
				this.anIntArray324[local18] = arg1.method2087();
				if (this.anIntArray324[local18] == 65535) {
					this.anIntArray324[local18] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean73 = false;
		} else if (arg0 == 109) {
			this.aBoolean72 = false;
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V")
	public void method1473() {
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Lclient!ne;")
	public Class1_Sub3_Sub12 method1475() {
		@Pc(1) int local1 = -1;
		if (this.anInt2093 != -1) {
			local1 = Static96.method1626(this.anInt2093);
		} else if (this.anInt2100 != -1) {
			local1 = Static40.anIntArray182[this.anInt2100];
		}
		return local1 < 0 || this.anIntArray324.length <= local1 || this.anIntArray324[local1] == -1 ? null : Static115.method2023(this.anIntArray324[local1]);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!rd;)V")
	public void method1477(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2053();
			if (local12 == 0) {
				return;
			}
			this.method1470(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)Z")
	public boolean method1478() {
		if (this.anIntArray324 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2093 != -1) {
			local10 = Static96.method1626(this.anInt2093);
		} else if (this.anInt2100 != -1) {
			local10 = Static40.anIntArray182[this.anInt2100];
		}
		return local10 >= 0 && this.anIntArray324.length > local10 && this.anIntArray324[local10] != -1;
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)Lclient!c;")
	public Class1_Sub3_Sub4_Sub1 method1480() {
		if (this.anIntArray324 != null) {
			@Pc(12) Class1_Sub3_Sub12 local12 = this.method1475();
			return local12 == null ? null : local12.method1480();
		} else if (this.anIntArray325 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(37) int local37 = 0; local37 < this.anIntArray325.length; local37++) {
				if (!Static120.aClass41_17.method1722(this.anIntArray325[local37], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(69) Class1_Sub3_Sub4_Sub1[] local69 = new Class1_Sub3_Sub4_Sub1[this.anIntArray325.length];
			for (@Pc(71) int local71 = 0; local71 < this.anIntArray325.length; local71++) {
				local69[local71] = Static14.method357(Static120.aClass41_17, this.anIntArray325[local71]);
			}
			@Pc(102) Class1_Sub3_Sub4_Sub1 local102;
			if (local69.length == 1) {
				local102 = local69[0];
			} else {
				local102 = new Class1_Sub3_Sub4_Sub1(local69, local69.length);
			}
			if (this.aShortArray8 != null) {
				for (@Pc(113) int local113 = 0; local113 < this.aShortArray8.length; local113++) {
					local102.method347(this.aShortArray8[local113], this.aShortArray9[local113]);
				}
			}
			return local102;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!nc;ILclient!nc;IB)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method1482(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub11 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray324 != null) {
			@Pc(14) Class1_Sub3_Sub12 local14 = this.method1475();
			return local14 == null ? null : local14.method1482(arg0, arg1, arg2, arg3);
		}
		@Pc(36) Class1_Sub3_Sub4_Sub4 local36 = (Class1_Sub3_Sub4_Sub4) Static12.aClass28_87.method796((long) this.anInt2105);
		if (local36 == null) {
			@Pc(40) boolean local40 = false;
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray326.length; local42++) {
				if (!Static120.aClass41_17.method1722(this.anIntArray326[local42], 0)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(70) Class1_Sub3_Sub4_Sub1[] local70 = new Class1_Sub3_Sub4_Sub1[this.anIntArray326.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray326.length; local72++) {
				local70[local72] = Static14.method357(Static120.aClass41_17, this.anIntArray326[local72]);
			}
			@Pc(98) Class1_Sub3_Sub4_Sub1 local98;
			if (local70.length == 1) {
				local98 = local70[0];
			} else {
				local98 = new Class1_Sub3_Sub4_Sub1(local70, local70.length);
			}
			if (this.aShortArray8 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.aShortArray8.length; local112++) {
					local98.method347(this.aShortArray8[local112], this.aShortArray9[local112]);
				}
			}
			local36 = local98.method356(this.anInt2108 + 64, this.anInt2112 + 850, -30, -50, -30);
			Static12.aClass28_87.method789(local36, (long) this.anInt2105);
		}
		@Pc(169) Class1_Sub3_Sub4_Sub4 local169;
		if (arg2 != null && arg0 != null) {
			local169 = arg2.method1434(arg0, local36, arg3, arg1);
		} else if (arg2 != null) {
			local169 = arg2.method1430(local36, arg1);
		} else if (arg0 == null) {
			local169 = local36.method652(true);
		} else {
			local169 = arg0.method1430(local36, arg3);
		}
		if (this.anInt2103 != 128 || this.anInt2099 != 128) {
			local169.method635(this.anInt2103, this.anInt2099, this.anInt2103);
		}
		return local169;
	}
}
