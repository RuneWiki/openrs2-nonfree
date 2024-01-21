import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
	public int anInt1839;

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!nf", name = "yb", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!nf", name = "Hb", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!nf", name = "Qb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!nf", name = "Zb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "Lclient!fc;")
	public Class25 aClass25_884 = Static83.aClass25_893;

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
	public int anInt1847 = -1;

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "I")
	private int anInt1852 = 128;

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "I")
	public int anInt1849 = 32;

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
	public int anInt1851 = -1;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	public int anInt1842 = -1;

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	private int anInt1838 = 0;

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
	private int anInt1846 = -1;

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "[Lclient!fc;")
	public final Class25[] aClass25Array12 = new Class25[5];

	@OriginalMember(owner = "client!nf", name = "Lb", descriptor = "I")
	public int anInt1860 = -1;

	@OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Z")
	public boolean aBoolean79 = true;

	@OriginalMember(owner = "client!nf", name = "Rb", descriptor = "Z")
	public boolean aBoolean81 = true;

	@OriginalMember(owner = "client!nf", name = "ub", descriptor = "I")
	public int anInt1853 = -1;

	@OriginalMember(owner = "client!nf", name = "Tb", descriptor = "I")
	public int anInt1863 = 1;

	@OriginalMember(owner = "client!nf", name = "Cb", descriptor = "I")
	public int anInt1857 = -1;

	@OriginalMember(owner = "client!nf", name = "Ib", descriptor = "I")
	private int anInt1858 = -1;

	@OriginalMember(owner = "client!nf", name = "bc", descriptor = "I")
	private int anInt1866 = 0;

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
	private int anInt1845 = 128;

	@OriginalMember(owner = "client!nf", name = "ac", descriptor = "I")
	public int anInt1865 = -1;

	@OriginalMember(owner = "client!nf", name = "Ob", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!nf", name = "fc", descriptor = "I")
	public int anInt1868 = -1;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	public int anInt1840 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!dc;IB)V")
	private void method1399(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local8 = arg0.method672();
			this.anIntArray334 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray334[local14] = arg0.method651();
			}
		} else if (arg1 == 2) {
			this.aClass25_884 = arg0.method654();
		} else if (arg1 == 12) {
			this.anInt1863 = arg0.method672();
		} else if (arg1 == 13) {
			this.anInt1840 = arg0.method651();
		} else if (arg1 == 14) {
			this.anInt1860 = arg0.method651();
		} else if (arg1 == 15) {
			this.anInt1842 = arg0.method651();
		} else if (arg1 == 16) {
			this.anInt1853 = arg0.method651();
		} else if (arg1 == 17) {
			this.anInt1860 = arg0.method651();
			this.anInt1865 = arg0.method651();
			this.anInt1868 = arg0.method651();
			this.anInt1847 = arg0.method651();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass25Array12[arg1 - 30] = arg0.method654();
			if (this.aClass25Array12[arg1 - 30].method786(Static78.aClass25_818)) {
				this.aClass25Array12[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method672();
			this.aShortArray6 = new short[local8];
			this.aShortArray5 = new short[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.aShortArray6[local14] = (short) arg0.method651();
				this.aShortArray5[local14] = (short) arg0.method651();
			}
		} else if (arg1 == 60) {
			local8 = arg0.method672();
			this.anIntArray333 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray333[local14] = arg0.method651();
			}
		} else if (arg1 == 93) {
			this.aBoolean79 = false;
		} else if (arg1 == 95) {
			this.anInt1857 = arg0.method651();
		} else if (arg1 == 97) {
			this.anInt1852 = arg0.method651();
		} else if (arg1 == 98) {
			this.anInt1845 = arg0.method651();
		} else if (arg1 == 99) {
			this.aBoolean80 = true;
		} else if (arg1 == 100) {
			this.anInt1838 = arg0.method643();
		} else if (arg1 == 101) {
			this.anInt1866 = arg0.method643() * 5;
		} else if (arg1 == 102) {
			this.anInt1851 = arg0.method651();
		} else if (arg1 == 103) {
			this.anInt1849 = arg0.method651();
		} else if (arg1 == 106) {
			this.anInt1858 = arg0.method651();
			if (this.anInt1858 == 65535) {
				this.anInt1858 = -1;
			}
			this.anInt1846 = arg0.method651();
			if (this.anInt1846 == 65535) {
				this.anInt1846 = -1;
			}
			local8 = arg0.method672();
			this.anIntArray332 = new int[local8 + 1];
			for (local14 = 0; local14 <= local8; local14++) {
				this.anIntArray332[local14] = arg0.method651();
				if (this.anIntArray332[local14] == 65535) {
					this.anIntArray332[local14] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean78 = false;
		} else if (arg1 == 109) {
			this.aBoolean81 = false;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!qe;ZLclient!qe;II)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1400(@OriginalArg(0) Class1_Sub2_Sub17 arg0, @OriginalArg(2) Class1_Sub2_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray332 != null) {
			@Pc(17) Class1_Sub2_Sub13 local17 = this.method1408();
			return local17 == null ? null : local17.method1400(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class1_Sub2_Sub3_Sub2 local37 = (Class1_Sub2_Sub3_Sub2) Static24.aClass63_2.method1517((long) this.anInt1839);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray334.length; local43++) {
				if (!Static70.aClass56_49.method1265(this.anIntArray334[local43], 0)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(75) Class1_Sub2_Sub3_Sub7[] local75 = new Class1_Sub2_Sub3_Sub7[this.anIntArray334.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray334.length; local77++) {
				local75[local77] = Static117.method1886(Static70.aClass56_49, this.anIntArray334[local77]);
			}
			@Pc(103) Class1_Sub2_Sub3_Sub7 local103;
			if (local75.length == 1) {
				local103 = local75[0];
			} else {
				local103 = new Class1_Sub2_Sub3_Sub7(local75, local75.length);
			}
			if (this.aShortArray6 != null) {
				for (@Pc(117) int local117 = 0; local117 < this.aShortArray6.length; local117++) {
					local103.method1888(this.aShortArray6[local117], this.aShortArray5[local117]);
				}
			}
			local37 = local103.method1893(this.anInt1838 + 64, this.anInt1866 + 850, -30, -50, -30);
			Static24.aClass63_2.method1520(local37, (long) this.anInt1839);
		}
		@Pc(169) Class1_Sub2_Sub3_Sub2 local169;
		if (arg0 != null && arg1 != null) {
			local169 = arg0.method1672(local37, arg1, arg3, arg2);
		} else if (arg0 != null) {
			local169 = arg0.method1675(arg2, local37);
		} else if (arg1 == null) {
			local169 = local37.method481(true);
		} else {
			local169 = arg1.method1675(arg3, local37);
		}
		if (this.anInt1852 != 128 || this.anInt1845 != 128) {
			local169.method473(this.anInt1852, this.anInt1845, this.anInt1852);
		}
		return local169;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)Z")
	public boolean method1403() {
		if (this.anIntArray332 == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.anInt1858 != -1) {
			local16 = Static49.method984(this.anInt1858);
		} else if (this.anInt1846 != -1) {
			local16 = Static95.anIntArray385[this.anInt1846];
		}
		return local16 >= 0 && local16 < this.anIntArray332.length && this.anIntArray332[local16] != -1;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	public void method1404() {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method1406(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method672();
			if (local9 == 0) {
				return;
			}
			this.method1399(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1407() {
		if (this.anIntArray332 != null) {
			@Pc(12) Class1_Sub2_Sub13 local12 = this.method1408();
			return local12 == null ? null : local12.method1407();
		} else if (this.anIntArray333 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray333.length; local29++) {
				if (!Static70.aClass56_49.method1265(this.anIntArray333[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class1_Sub2_Sub3_Sub7[] local61 = new Class1_Sub2_Sub3_Sub7[this.anIntArray333.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray333.length; local63++) {
				local61[local63] = Static117.method1886(Static70.aClass56_49, this.anIntArray333[local63]);
			}
			@Pc(96) Class1_Sub2_Sub3_Sub7 local96;
			if (local61.length == 1) {
				local96 = local61[0];
			} else {
				local96 = new Class1_Sub2_Sub3_Sub7(local61, local61.length);
			}
			if (this.aShortArray6 != null) {
				for (@Pc(107) int local107 = 0; local107 < this.aShortArray6.length; local107++) {
					local96.method1888(this.aShortArray6[local107], this.aShortArray5[local107]);
				}
			}
			return local96;
		}
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)Lclient!nf;")
	public Class1_Sub2_Sub13 method1408() {
		@Pc(12) int local12 = -1;
		if (this.anInt1858 != -1) {
			local12 = Static49.method984(this.anInt1858);
		} else if (this.anInt1846 != -1) {
			local12 = Static95.anIntArray385[this.anInt1846];
		}
		return local12 < 0 || this.anIntArray332.length <= local12 || this.anIntArray332[local12] == -1 ? null : Static129.method2045(this.anIntArray332[local12]);
	}
}
