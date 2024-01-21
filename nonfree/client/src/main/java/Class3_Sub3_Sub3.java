import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
	public int anInt914;

	@OriginalMember(owner = "client!ha", name = "hb", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!ha", name = "wb", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!ha", name = "Cb", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!ha", name = "Db", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!ha", name = "Jb", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
	private int anInt912 = -1;

	@OriginalMember(owner = "client!ha", name = "pb", descriptor = "I")
	public int anInt921 = -1;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	public int anInt906 = -1;

	@OriginalMember(owner = "client!ha", name = "nb", descriptor = "I")
	public int anInt920 = 1;

	@OriginalMember(owner = "client!ha", name = "qb", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
	public int anInt918 = -1;

	@OriginalMember(owner = "client!ha", name = "lb", descriptor = "I")
	public int anInt919 = -1;

	@OriginalMember(owner = "client!ha", name = "ub", descriptor = "I")
	private int anInt923 = 128;

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!ha", name = "xb", descriptor = "I")
	public int anInt925 = -1;

	@OriginalMember(owner = "client!ha", name = "Lb", descriptor = "I")
	public int anInt933 = -1;

	@OriginalMember(owner = "client!ha", name = "Mb", descriptor = "I")
	public int anInt934 = 32;

	@OriginalMember(owner = "client!ha", name = "vb", descriptor = "I")
	private int anInt924 = 0;

	@OriginalMember(owner = "client!ha", name = "Kb", descriptor = "I")
	public int anInt932 = -1;

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
	private int anInt908 = -1;

	@OriginalMember(owner = "client!ha", name = "Ib", descriptor = "I")
	private int anInt931 = 128;

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "[Lclient!hb;")
	public final Class27[] aClass27Array2 = new Class27[5];

	@OriginalMember(owner = "client!ha", name = "Qb", descriptor = "I")
	private int anInt938 = 0;

	@OriginalMember(owner = "client!ha", name = "ob", descriptor = "Z")
	public boolean aBoolean49 = true;

	@OriginalMember(owner = "client!ha", name = "Eb", descriptor = "Lclient!hb;")
	public Class27 aClass27_468 = Static81.aClass27_1041;

	@OriginalMember(owner = "client!ha", name = "Sb", descriptor = "I")
	public int anInt940 = -1;

	@OriginalMember(owner = "client!ha", name = "Rb", descriptor = "I")
	public int anInt939 = -1;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method714() {
		if (this.anIntArray166 != null) {
			@Pc(12) Class3_Sub3_Sub3 local12 = this.method720();
			return local12 == null ? null : local12.method714();
		} else if (this.anIntArray167 == null) {
			return null;
		} else {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < this.anIntArray167.length; local37++) {
				if (!Static32.aClass54_16.method1598(this.anIntArray167[local37], 0)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(69) Class3_Sub3_Sub1_Sub1[] local69 = new Class3_Sub3_Sub1_Sub1[this.anIntArray167.length];
			for (@Pc(71) int local71 = 0; local71 < this.anIntArray167.length; local71++) {
				local69[local71] = Static21.method398(Static32.aClass54_16, this.anIntArray167[local71]);
			}
			@Pc(103) Class3_Sub3_Sub1_Sub1 local103;
			if (local69.length == 1) {
				local103 = local69[0];
			} else {
				local103 = new Class3_Sub3_Sub1_Sub1(local69, local69.length);
			}
			if (this.anIntArray168 != null) {
				for (@Pc(117) int local117 = 0; local117 < this.anIntArray168.length; local117++) {
					local103.method406(this.anIntArray168[local117], this.anIntArray165[local117]);
				}
			}
			return local103;
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public void method715() {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ua;IIILclient!ua;)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method719(@OriginalArg(0) Class3_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub3_Sub14 arg3) {
		if (this.anIntArray166 != null) {
			@Pc(12) Class3_Sub3_Sub3 local12 = this.method720();
			return local12 == null ? null : local12.method719(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class3_Sub3_Sub1_Sub1 local32 = (Class3_Sub3_Sub1_Sub1) Static66.aClass21_23.method658((long) this.anInt914);
		if (local32 == null) {
			@Pc(40) boolean local40 = false;
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray163.length; local42++) {
				if (!Static32.aClass54_16.method1598(this.anIntArray163[local42], 0)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(70) Class3_Sub3_Sub1_Sub1[] local70 = new Class3_Sub3_Sub1_Sub1[this.anIntArray163.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray163.length; local72++) {
				local70[local72] = Static21.method398(Static32.aClass54_16, this.anIntArray163[local72]);
			}
			if (local70.length == 1) {
				local32 = local70[0];
			} else {
				local32 = new Class3_Sub3_Sub1_Sub1(local70, local70.length);
			}
			if (this.anIntArray168 != null) {
				for (@Pc(114) int local114 = 0; local114 < this.anIntArray168.length; local114++) {
					local32.method406(this.anIntArray168[local114], this.anIntArray165[local114]);
				}
			}
			local32.method396();
			local32.method407(this.anInt924 + 64, this.anInt938 + 850, -30, -50, -30, true);
			Static66.aClass21_23.method660(local32, (long) this.anInt914);
		}
		@Pc(171) Class3_Sub3_Sub1_Sub1 local171;
		if (arg0 != null && arg3 != null) {
			local171 = arg0.method1805(local32, arg3, arg1, arg2);
		} else if (arg0 != null) {
			local171 = arg0.method1796(local32, arg1);
		} else if (arg3 == null) {
			local171 = local32.method405(true);
		} else {
			local171 = arg3.method1796(local32, arg2);
		}
		if (this.anInt923 != 128 || this.anInt931 != 128) {
			local171.method418(this.anInt923, this.anInt931, this.anInt923);
		}
		return local171;
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)Lclient!ha;")
	public Class3_Sub3_Sub3 method720() {
		@Pc(1) int local1 = -1;
		if (this.anInt912 != -1) {
			local1 = Static93.method1749(this.anInt912);
		} else if (this.anInt908 != -1) {
			local1 = Static18.anIntArray60[this.anInt908];
		}
		return local1 < 0 || local1 >= this.anIntArray166.length || this.anIntArray166[local1] == -1 ? null : Static99.method1802(this.anIntArray166[local1]);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)Z")
	public boolean method722() {
		if (this.anIntArray166 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt912 != -1) {
			local10 = Static93.method1749(this.anInt912);
		} else if (this.anInt908 != -1) {
			local10 = Static18.anIntArray60[this.anInt908];
		}
		return local10 >= 0 && local10 < this.anIntArray166.length && this.anIntArray166[local10] != -1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method724(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(75) int local75;
		@Pc(85) int local85;
		if (arg1 == 1) {
			local75 = arg0.method1421();
			this.anIntArray163 = new int[local75];
			for (local85 = 0; local85 < local75; local85++) {
				this.anIntArray163[local85] = arg0.method1451();
			}
		} else if (arg1 == 2) {
			this.aClass27_468 = arg0.method1426();
		} else if (arg1 == 12) {
			this.anInt920 = arg0.method1421();
		} else if (arg1 == 13) {
			this.anInt919 = arg0.method1451();
		} else if (arg1 == 14) {
			this.anInt921 = arg0.method1451();
		} else if (arg1 == 15) {
			this.anInt918 = arg0.method1451();
		} else if (arg1 == 16) {
			this.anInt925 = arg0.method1451();
		} else if (arg1 == 17) {
			this.anInt921 = arg0.method1451();
			this.anInt932 = arg0.method1451();
			this.anInt906 = arg0.method1451();
			this.anInt940 = arg0.method1451();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass27Array2[arg1 - 30] = arg0.method1426();
			if (this.aClass27Array2[arg1 - 30].method763(Static107.aClass27_1339)) {
				this.aClass27Array2[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local75 = arg0.method1421();
			this.anIntArray168 = new int[local75];
			this.anIntArray165 = new int[local75];
			for (local85 = 0; local85 < local75; local85++) {
				this.anIntArray168[local85] = arg0.method1451();
				this.anIntArray165[local85] = arg0.method1451();
			}
		} else if (arg1 == 60) {
			local75 = arg0.method1421();
			this.anIntArray167 = new int[local75];
			for (local85 = 0; local85 < local75; local85++) {
				this.anIntArray167[local85] = arg0.method1451();
			}
		} else if (arg1 == 93) {
			this.aBoolean48 = false;
		} else if (arg1 == 95) {
			this.anInt933 = arg0.method1451();
		} else if (arg1 == 97) {
			this.anInt923 = arg0.method1451();
		} else if (arg1 == 98) {
			this.anInt931 = arg0.method1451();
		} else if (arg1 == 99) {
			this.aBoolean50 = true;
		} else if (arg1 == 100) {
			this.anInt924 = arg0.method1432();
		} else if (arg1 == 101) {
			this.anInt938 = arg0.method1432() * 5;
		} else if (arg1 == 102) {
			this.anInt939 = arg0.method1451();
		} else if (arg1 == 103) {
			this.anInt934 = arg0.method1451();
		} else if (arg1 == 106) {
			this.anInt912 = arg0.method1451();
			if (this.anInt912 == 65535) {
				this.anInt912 = -1;
			}
			this.anInt908 = arg0.method1451();
			if (this.anInt908 == 65535) {
				this.anInt908 = -1;
			}
			local75 = arg0.method1421();
			this.anIntArray166 = new int[local75 + 1];
			for (local85 = 0; local85 <= local75; local85++) {
				this.anIntArray166[local85] = arg0.method1451();
				if (this.anIntArray166[local85] == 65535) {
					this.anIntArray166[local85] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean49 = false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(ILclient!wd;)V")
	public void method725(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1421();
			if (local15 == 0) {
				return;
			}
			this.method724(arg0, local15);
		}
	}
}
