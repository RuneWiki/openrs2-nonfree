import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class4_Sub1_Sub10 extends Class4_Sub1 {

	@OriginalMember(owner = "client!o", name = "M", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!o", name = "yb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "[Lclient!ec;")
	public final Class22[] aClass22Array17 = new Class22[5];

	@OriginalMember(owner = "client!o", name = "H", descriptor = "I")
	public int anInt2146 = -1;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "I")
	private int anInt2150 = -1;

	@OriginalMember(owner = "client!o", name = "R", descriptor = "I")
	public int anInt2152 = -1;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	public int anInt2153 = 1;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
	public int anInt2165 = -1;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
	private int anInt2160 = 128;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
	public int anInt2163 = -1;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
	public int anInt2158 = -1;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	private int anInt2149 = 0;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "I")
	public int anInt2154 = -1;

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "Lclient!ec;")
	public Class22 aClass22_615 = Static58.aClass22_451;

	@OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
	private int anInt2172 = 0;

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
	public int anInt2171 = -1;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
	public int anInt2169 = -1;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	private int anInt2147 = -1;

	@OriginalMember(owner = "client!o", name = "X", descriptor = "I")
	public int anInt2157 = -1;

	@OriginalMember(owner = "client!o", name = "xb", descriptor = "I")
	private int anInt2176 = 128;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
	public int anInt2170 = 32;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "Z")
	public boolean aBoolean190 = true;

	@OriginalMember(owner = "client!o", name = "Lb", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!o", name = "Nb", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method1429() {
		if (this.anIntArray221 != null) {
			@Pc(12) Class4_Sub1_Sub10 local12 = this.method1434();
			return local12 == null ? null : local12.method1429();
		} else if (this.anIntArray220 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray220.length; local29++) {
				if (!Static15.aClass20_14.method604(this.anIntArray220[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class4_Sub1_Sub3_Sub4[] local57 = new Class4_Sub1_Sub3_Sub4[this.anIntArray220.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray220.length; local59++) {
				local57[local59] = Static86.method1524(Static15.aClass20_14, this.anIntArray220[local59]);
			}
			@Pc(87) Class4_Sub1_Sub3_Sub4 local87;
			if (local57.length == 1) {
				local87 = local57[0];
			} else {
				local87 = new Class4_Sub1_Sub3_Sub4(local57, local57.length);
			}
			@Pc(106) int local106;
			if (this.aShortArray23 != null) {
				for (local106 = 0; local106 < this.aShortArray23.length; local106++) {
					local87.method1517(this.aShortArray23[local106], this.aShortArray22[local106]);
				}
			}
			if (this.aShortArray20 != null) {
				for (local106 = 0; local106 < this.aShortArray20.length; local106++) {
					local87.method1537(this.aShortArray20[local106], this.aShortArray21[local106]);
				}
			}
			return local87;
		}
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z")
	public boolean method1432() {
		if (this.anIntArray221 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2150 != -1) {
			local10 = Static57.method1093(this.anInt2150);
		} else if (this.anInt2147 != -1) {
			local10 = Static23.anIntArray61[this.anInt2147];
		}
		return local10 >= 0 && local10 < this.anIntArray221.length && this.anIntArray221[local10] != -1;
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)Lclient!o;")
	public Class4_Sub1_Sub10 method1434() {
		@Pc(1) int local1 = -1;
		if (this.anInt2150 != -1) {
			local1 = Static57.method1093(this.anInt2150);
		} else if (this.anInt2147 != -1) {
			local1 = Static23.anIntArray61[this.anInt2147];
		}
		return local1 < 0 || local1 >= this.anIntArray221.length || this.anIntArray221[local1] == -1 ? null : Static14.method279(this.anIntArray221[local1]);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!jd;)V")
	public void method1435(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method719();
			if (local16 == 0) {
				return;
			}
			this.method1440(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!vc;ILclient!vc;BI)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1438(@OriginalArg(0) Class4_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub17 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray221 != null) {
			@Pc(12) Class4_Sub1_Sub10 local12 = this.method1434();
			return local12 == null ? null : local12.method1438(arg0, arg1, arg2, arg3);
		}
		@Pc(40) Class4_Sub1_Sub3_Sub3 local40 = (Class4_Sub1_Sub3_Sub3) Static120.aClass33_32.method998((long) this.anInt2174);
		if (local40 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray219.length; local46++) {
				if (!Static15.aClass20_14.method604(this.anIntArray219[local46], 0)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(78) Class4_Sub1_Sub3_Sub4[] local78 = new Class4_Sub1_Sub3_Sub4[this.anIntArray219.length];
			for (@Pc(80) int local80 = 0; local80 < this.anIntArray219.length; local80++) {
				local78[local80] = Static86.method1524(Static15.aClass20_14, this.anIntArray219[local80]);
			}
			@Pc(111) Class4_Sub1_Sub3_Sub4 local111;
			if (local78.length == 1) {
				local111 = local78[0];
			} else {
				local111 = new Class4_Sub1_Sub3_Sub4(local78, local78.length);
			}
			@Pc(122) int local122;
			if (this.aShortArray23 != null) {
				for (local122 = 0; local122 < this.aShortArray23.length; local122++) {
					local111.method1517(this.aShortArray23[local122], this.aShortArray22[local122]);
				}
			}
			if (this.aShortArray20 != null) {
				for (local122 = 0; local122 < this.aShortArray20.length; local122++) {
					local111.method1537(this.aShortArray20[local122], this.aShortArray21[local122]);
				}
			}
			local40 = local111.method1531(this.anInt2149 + 64, this.anInt2172 + 850, -30, -50, -30);
			Static120.aClass33_32.method997((long) this.anInt2174, local40);
		}
		@Pc(196) Class4_Sub1_Sub3_Sub3 local196;
		if (arg2 != null && arg0 != null) {
			local196 = arg2.method1918(arg3, arg0, local40, arg1);
		} else if (arg2 != null) {
			local196 = arg2.method1920(local40, arg1);
		} else if (arg0 == null) {
			local196 = local40.method1469(true);
		} else {
			local196 = arg0.method1920(local40, arg3);
		}
		if (this.anInt2160 != 128 || this.anInt2176 != 128) {
			local196.method1475(this.anInt2160, this.anInt2176, this.anInt2160);
		}
		return local196;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public void method1439() {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!jd;I)V")
	private void method1440(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local8 = arg0.method719();
			this.anIntArray219 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray219[local14] = arg0.method718();
			}
		} else if (arg1 == 2) {
			this.aClass22_615 = arg0.method742();
		} else if (arg1 == 12) {
			this.anInt2153 = arg0.method719();
		} else if (arg1 == 13) {
			this.anInt2152 = arg0.method718();
		} else if (arg1 == 14) {
			this.anInt2158 = arg0.method718();
		} else if (arg1 == 15) {
			this.anInt2163 = arg0.method718();
		} else if (arg1 == 16) {
			this.anInt2146 = arg0.method718();
		} else if (arg1 == 17) {
			this.anInt2158 = arg0.method718();
			this.anInt2157 = arg0.method718();
			this.anInt2171 = arg0.method718();
			this.anInt2165 = arg0.method718();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass22Array17[arg1 - 30] = arg0.method742();
			if (this.aClass22Array17[arg1 - 30].method480(Static134.aClass22_978)) {
				this.aClass22Array17[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method719();
			this.aShortArray23 = new short[local8];
			this.aShortArray22 = new short[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.aShortArray23[local14] = (short) arg0.method718();
				this.aShortArray22[local14] = (short) arg0.method718();
			}
		} else if (arg1 == 41) {
			local8 = arg0.method719();
			this.aShortArray20 = new short[local8];
			this.aShortArray21 = new short[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.aShortArray20[local14] = (short) arg0.method718();
				this.aShortArray21[local14] = (short) arg0.method718();
			}
		} else if (arg1 == 60) {
			local8 = arg0.method719();
			this.anIntArray220 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray220[local14] = arg0.method718();
			}
		} else if (arg1 == 93) {
			this.aBoolean190 = false;
		} else if (arg1 == 95) {
			this.anInt2154 = arg0.method718();
		} else if (arg1 == 97) {
			this.anInt2160 = arg0.method718();
		} else if (arg1 == 98) {
			this.anInt2176 = arg0.method718();
		} else if (arg1 == 99) {
			this.aBoolean192 = true;
		} else if (arg1 == 100) {
			this.anInt2149 = arg0.method731();
		} else if (arg1 == 101) {
			this.anInt2172 = arg0.method731() * 5;
		} else if (arg1 == 102) {
			this.anInt2169 = arg0.method718();
		} else if (arg1 == 103) {
			this.anInt2170 = arg0.method718();
		} else if (arg1 == 106) {
			this.anInt2150 = arg0.method718();
			if (this.anInt2150 == 65535) {
				this.anInt2150 = -1;
			}
			this.anInt2147 = arg0.method718();
			if (this.anInt2147 == 65535) {
				this.anInt2147 = -1;
			}
			local8 = arg0.method719();
			this.anIntArray221 = new int[local8 + 1];
			for (local14 = 0; local14 <= local8; local14++) {
				this.anIntArray221[local14] = arg0.method718();
				if (this.anIntArray221[local14] == 65535) {
					this.anIntArray221[local14] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean189 = false;
		} else if (arg1 == 109) {
			this.aBoolean191 = false;
		}
	}
}
