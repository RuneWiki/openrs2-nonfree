import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "Lclient!lc;")
	public Class31 aClass31_660;

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!lb", name = "ob", descriptor = "I")
	public int anInt1858;

	@OriginalMember(owner = "client!lb", name = "pb", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!lb", name = "sb", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
	public int anInt1847 = -1;

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
	public int anInt1848 = -1;

	@OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
	private int anInt1853 = -1;

	@OriginalMember(owner = "client!lb", name = "lb", descriptor = "I")
	public int anInt1855 = -1;

	@OriginalMember(owner = "client!lb", name = "fb", descriptor = "[Lclient!lc;")
	public final Class31[] aClass31Array8 = new Class31[5];

	@OriginalMember(owner = "client!lb", name = "Bb", descriptor = "I")
	public int anInt1863 = 1;

	@OriginalMember(owner = "client!lb", name = "qb", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!lb", name = "Db", descriptor = "I")
	private int anInt1865 = -1;

	@OriginalMember(owner = "client!lb", name = "Gb", descriptor = "Z")
	public boolean aBoolean96 = true;

	@OriginalMember(owner = "client!lb", name = "Fb", descriptor = "I")
	public int anInt1866 = -1;

	@OriginalMember(owner = "client!lb", name = "vb", descriptor = "I")
	private int anInt1861 = 128;

	@OriginalMember(owner = "client!lb", name = "mb", descriptor = "I")
	public int anInt1856 = -1;

	@OriginalMember(owner = "client!lb", name = "rb", descriptor = "I")
	private int anInt1859 = 128;

	@OriginalMember(owner = "client!lb", name = "zb", descriptor = "I")
	public int anInt1862 = -1;

	@OriginalMember(owner = "client!lb", name = "Ab", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!lb", name = "Hb", descriptor = "I")
	public int anInt1867 = 32;

	@OriginalMember(owner = "client!lb", name = "yb", descriptor = "Lclient!lc;")
	public Class31 aClass31_662 = Static98.aClass31_393;

	@OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
	private int anInt1854 = 0;

	@OriginalMember(owner = "client!lb", name = "Ib", descriptor = "I")
	public int anInt1868 = -1;

	@OriginalMember(owner = "client!lb", name = "Jb", descriptor = "I")
	private int anInt1869 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1185(@OriginalArg(1) Class2_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method665();
			if (local5 == 0) {
				return;
			}
			this.method1194(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
	public void method1186() {
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)Lclient!lb;")
	public Class2_Sub1_Sub8 method1189() {
		@Pc(10) int local10 = -1;
		if (this.anInt1853 != -1) {
			local10 = Static68.method1373(this.anInt1853);
		} else if (this.anInt1865 != -1) {
			local10 = Static8.anIntArray46[this.anInt1865];
		}
		return local10 < 0 || local10 >= this.anIntArray271.length || this.anIntArray271[local10] == -1 ? null : Static79.method1443(this.anIntArray271[local10]);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!mb;Lclient!mb;I)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1191(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub10 arg1, @OriginalArg(3) Class2_Sub1_Sub10 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray271 != null) {
			@Pc(12) Class2_Sub1_Sub8 local12 = this.method1189();
			return local12 == null ? null : local12.method1191(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class2_Sub1_Sub4_Sub5 local32 = (Class2_Sub1_Sub4_Sub5) Static10.aClass17_15.method786((long) this.anInt1858);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray270.length; local38++) {
				if (!Static101.aClass11_24.method347(0, this.anIntArray270[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class2_Sub1_Sub4_Sub5[] local70 = new Class2_Sub1_Sub4_Sub5[this.anIntArray270.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray270.length; local72++) {
				local70[local72] = Static35.method896(Static101.aClass11_24, this.anIntArray270[local72]);
			}
			if (local70.length == 1) {
				local32 = local70[0];
			} else {
				local32 = new Class2_Sub1_Sub4_Sub5(local70, local70.length);
			}
			if (this.anIntArray273 != null) {
				for (@Pc(112) int local112 = 0; local112 < this.anIntArray273.length; local112++) {
					local32.method924(this.anIntArray273[local112], this.anIntArray272[local112]);
				}
			}
			local32.method897();
			local32.method904(this.anInt1869 + 64, this.anInt1854 + 850, -30, -50, -30, true);
			Static10.aClass17_15.method783(local32, (long) this.anInt1858);
		}
		@Pc(169) Class2_Sub1_Sub4_Sub5 local169;
		if (arg2 != null && arg1 != null) {
			local169 = arg2.method1310(arg1, arg3, local32, arg0);
		} else if (arg2 != null) {
			local169 = arg2.method1309(arg0, local32);
		} else if (arg1 == null) {
			local169 = local32.method902(true);
		} else {
			local169 = arg1.method1309(arg3, local32);
		}
		if (this.anInt1859 != 128 || this.anInt1861 != 128) {
			local169.method895(this.anInt1859, this.anInt1861, this.anInt1859);
		}
		return local169;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)Z")
	public boolean method1192() {
		if (this.anIntArray271 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt1853 != -1) {
			local15 = Static68.method1373(this.anInt1853);
		} else if (this.anInt1865 != -1) {
			local15 = Static8.anIntArray46[this.anInt1865];
		}
		return local15 >= 0 && local15 < this.anIntArray271.length && this.anIntArray271[local15] != -1;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(Z)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1193() {
		if (this.anIntArray271 != null) {
			@Pc(12) Class2_Sub1_Sub8 local12 = this.method1189();
			return local12 == null ? null : local12.method1193();
		} else if (this.anIntArray269 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray269.length; local29++) {
				if (!Static101.aClass11_24.method347(0, this.anIntArray269[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class2_Sub1_Sub4_Sub5[] local61 = new Class2_Sub1_Sub4_Sub5[this.anIntArray269.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray269.length; local63++) {
				local61[local63] = Static35.method896(Static101.aClass11_24, this.anIntArray269[local63]);
			}
			@Pc(95) Class2_Sub1_Sub4_Sub5 local95;
			if (local61.length == 1) {
				local95 = local61[0];
			} else {
				local95 = new Class2_Sub1_Sub4_Sub5(local61, local61.length);
			}
			if (this.anIntArray273 != null) {
				for (@Pc(109) int local109 = 0; local109 < this.anIntArray273.length; local109++) {
					local95.method924(this.anIntArray273[local109], this.anIntArray272[local109]);
				}
			}
			return local95;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!pd;IB)V")
	private void method1194(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local8 = arg0.method665();
			this.anIntArray270 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray270[local14] = arg0.method627();
			}
		} else if (arg1 == 2) {
			this.aClass31_662 = arg0.method670();
		} else if (arg1 == 3) {
			this.aClass31_660 = arg0.method670();
		} else if (arg1 == 12) {
			this.anInt1863 = arg0.method665();
		} else if (arg1 == 13) {
			this.anInt1868 = arg0.method627();
		} else if (arg1 == 14) {
			this.anInt1855 = arg0.method627();
		} else if (arg1 == 17) {
			this.anInt1855 = arg0.method627();
			this.anInt1848 = arg0.method627();
			this.anInt1847 = arg0.method627();
			this.anInt1856 = arg0.method627();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass31Array8[arg1 - 30] = arg0.method670();
			if (this.aClass31Array8[arg1 - 30].method1210(Static19.aClass31_284)) {
				this.aClass31Array8[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method665();
			this.anIntArray273 = new int[local8];
			this.anIntArray272 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray273[local14] = arg0.method627();
				this.anIntArray272[local14] = arg0.method627();
			}
		} else if (arg1 == 60) {
			local8 = arg0.method665();
			this.anIntArray269 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray269[local14] = arg0.method627();
			}
		} else if (arg1 == 93) {
			this.aBoolean96 = false;
		} else if (arg1 == 95) {
			this.anInt1866 = arg0.method627();
		} else if (arg1 == 97) {
			this.anInt1859 = arg0.method627();
		} else if (arg1 == 98) {
			this.anInt1861 = arg0.method627();
		} else if (arg1 == 99) {
			this.aBoolean95 = true;
		} else if (arg1 == 100) {
			this.anInt1869 = arg0.method673();
		} else if (arg1 == 101) {
			this.anInt1854 = arg0.method673() * 5;
		} else if (arg1 == 102) {
			this.anInt1862 = arg0.method627();
		} else if (arg1 == 103) {
			this.anInt1867 = arg0.method627();
		} else if (arg1 == 106) {
			this.anInt1853 = arg0.method627();
			if (this.anInt1853 == 65535) {
				this.anInt1853 = -1;
			}
			this.anInt1865 = arg0.method627();
			if (this.anInt1865 == 65535) {
				this.anInt1865 = -1;
			}
			local8 = arg0.method665();
			this.anIntArray271 = new int[local8 + 1];
			for (local14 = 0; local14 <= local8; local14++) {
				this.anIntArray271[local14] = arg0.method627();
				if (this.anIntArray271[local14] == 65535) {
					this.anIntArray271[local14] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean94 = false;
		}
	}
}
