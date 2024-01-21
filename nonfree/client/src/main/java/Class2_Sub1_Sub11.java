import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!o", name = "yb", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!o", name = "Ob", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!o", name = "Pb", descriptor = "I")
	public int anInt2122;

	@OriginalMember(owner = "client!o", name = "db", descriptor = "I")
	public int anInt2097 = -1;

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "[Lclient!wb;")
	public final Class65[] aClass65Array10 = new Class65[5];

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "Lclient!wb;")
	public Class65 aClass65_972 = Static13.aClass65_241;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
	private int anInt2095 = 0;

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
	private int anInt2107 = 128;

	@OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
	public int anInt2108 = -1;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "Z")
	public boolean aBoolean109 = true;

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "I")
	private int anInt2103 = -1;

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "I")
	public int anInt2110 = -1;

	@OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
	public int anInt2109 = -1;

	@OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
	public int anInt2112 = -1;

	@OriginalMember(owner = "client!o", name = "Cb", descriptor = "I")
	public int anInt2114 = -1;

	@OriginalMember(owner = "client!o", name = "Ab", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!o", name = "Eb", descriptor = "I")
	private int anInt2115 = -1;

	@OriginalMember(owner = "client!o", name = "Fb", descriptor = "I")
	public int anInt2116 = -1;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	public int anInt2096 = -1;

	@OriginalMember(owner = "client!o", name = "Hb", descriptor = "I")
	private int anInt2118 = 0;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
	public int anInt2105 = 1;

	@OriginalMember(owner = "client!o", name = "Ub", descriptor = "I")
	private int anInt2127 = 128;

	@OriginalMember(owner = "client!o", name = "Tb", descriptor = "I")
	public int anInt2126 = 32;

	@OriginalMember(owner = "client!o", name = "Rb", descriptor = "I")
	public int anInt2124 = -1;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1261() {
		if (this.anIntArray285 != null) {
			@Pc(12) Class2_Sub1_Sub11 local12 = this.method1262();
			return local12 == null ? null : local12.method1261();
		} else if (this.anIntArray283 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray283.length; local29++) {
				if (!Static99.aClass33_41.method1140(0, this.anIntArray283[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(67) Class2_Sub1_Sub1_Sub6[] local67 = new Class2_Sub1_Sub1_Sub6[this.anIntArray283.length];
			for (@Pc(69) int local69 = 0; local69 < this.anIntArray283.length; local69++) {
				local67[local69] = Static86.method1543(Static99.aClass33_41, this.anIntArray283[local69]);
			}
			@Pc(104) Class2_Sub1_Sub1_Sub6 local104;
			if (local67.length == 1) {
				local104 = local67[0];
			} else {
				local104 = new Class2_Sub1_Sub1_Sub6(local67, local67.length);
			}
			if (this.anIntArray284 != null) {
				for (@Pc(115) int local115 = 0; local115 < this.anIntArray284.length; local115++) {
					local104.method1515(this.anIntArray284[local115], this.anIntArray287[local115]);
				}
			}
			return local104;
		}
	}

	@OriginalMember(owner = "client!o", name = "i", descriptor = "(I)Lclient!o;")
	public Class2_Sub1_Sub11 method1262() {
		@Pc(5) int local5 = -1;
		if (this.anInt2103 != -1) {
			local5 = Static36.method741(this.anInt2103);
		} else if (this.anInt2115 != -1) {
			local5 = Static26.anIntArray416[this.anInt2115];
		}
		return local5 < 0 || this.anIntArray285.length <= local5 || this.anIntArray285[local5] == -1 ? null : Static75.method1301(this.anIntArray285[local5]);
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public void method1264() {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!fe;II)V")
	private void method1265(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(130) int local130;
		@Pc(140) int local140;
		if (arg1 == 1) {
			local130 = arg0.method1410();
			this.anIntArray286 = new int[local130];
			for (local140 = 0; local140 < local130; local140++) {
				this.anIntArray286[local140] = arg0.method1396();
			}
		} else if (arg1 == 2) {
			this.aClass65_972 = arg0.method1400();
		} else if (arg1 == 12) {
			this.anInt2105 = arg0.method1410();
		} else if (arg1 == 13) {
			this.anInt2096 = arg0.method1396();
		} else if (arg1 == 14) {
			this.anInt2112 = arg0.method1396();
		} else if (arg1 == 15) {
			this.anInt2114 = arg0.method1396();
		} else if (arg1 == 16) {
			this.anInt2124 = arg0.method1396();
		} else if (arg1 == 17) {
			this.anInt2112 = arg0.method1396();
			this.anInt2116 = arg0.method1396();
			this.anInt2108 = arg0.method1396();
			this.anInt2110 = arg0.method1396();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass65Array10[arg1 - 30] = arg0.method1400();
			if (this.aClass65Array10[arg1 - 30].method1788(Static102.aClass65_1261)) {
				this.aClass65Array10[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local130 = arg0.method1410();
			this.anIntArray284 = new int[local130];
			this.anIntArray287 = new int[local130];
			for (local140 = 0; local140 < local130; local140++) {
				this.anIntArray284[local140] = arg0.method1396();
				this.anIntArray287[local140] = arg0.method1396();
			}
		} else if (arg1 == 60) {
			local130 = arg0.method1410();
			this.anIntArray283 = new int[local130];
			for (local140 = 0; local140 < local130; local140++) {
				this.anIntArray283[local140] = arg0.method1396();
			}
		} else if (arg1 == 93) {
			this.aBoolean109 = false;
		} else if (arg1 == 95) {
			this.anInt2109 = arg0.method1396();
		} else if (arg1 == 97) {
			this.anInt2127 = arg0.method1396();
		} else if (arg1 == 98) {
			this.anInt2107 = arg0.method1396();
		} else if (arg1 == 99) {
			this.aBoolean110 = true;
		} else if (arg1 == 100) {
			this.anInt2118 = arg0.method1380();
		} else if (arg1 == 101) {
			this.anInt2095 = arg0.method1380() * 5;
		} else if (arg1 == 102) {
			this.anInt2097 = arg0.method1396();
		} else if (arg1 == 103) {
			this.anInt2126 = arg0.method1396();
		} else if (arg1 == 106) {
			this.anInt2103 = arg0.method1396();
			if (this.anInt2103 == 65535) {
				this.anInt2103 = -1;
			}
			this.anInt2115 = arg0.method1396();
			if (this.anInt2115 == 65535) {
				this.anInt2115 = -1;
			}
			local130 = arg0.method1410();
			this.anIntArray285 = new int[local130 + 1];
			for (local140 = 0; local140 <= local130; local140++) {
				this.anIntArray285[local140] = arg0.method1396();
				if (this.anIntArray285[local140] == 65535) {
					this.anIntArray285[local140] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean111 = false;
		}
	}

	@OriginalMember(owner = "client!o", name = "j", descriptor = "(I)Z")
	public boolean method1268() {
		if (this.anIntArray285 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt2103 != -1) {
			local15 = Static36.method741(this.anInt2103);
		} else if (this.anInt2115 != -1) {
			local15 = Static26.anIntArray416[this.anInt2115];
		}
		return local15 >= 0 && local15 < this.anIntArray285.length && this.anIntArray285[local15] != -1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!fe;I)V")
	public void method1269(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1410();
			if (local5 == 0) {
				return;
			}
			this.method1265(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!gd;ZILclient!gd;)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1270(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub6 arg3) {
		if (this.anIntArray285 != null) {
			@Pc(12) Class2_Sub1_Sub11 local12 = this.method1262();
			return local12 == null ? null : local12.method1270(arg0, arg1, arg2, arg3);
		}
		@Pc(42) Class2_Sub1_Sub1_Sub6 local42 = (Class2_Sub1_Sub1_Sub6) Static33.aClass21_31.method744((long) this.anInt2122);
		if (local42 == null) {
			@Pc(46) boolean local46 = false;
			for (@Pc(48) int local48 = 0; local48 < this.anIntArray286.length; local48++) {
				if (!Static99.aClass33_41.method1140(0, this.anIntArray286[local48])) {
					local46 = true;
				}
			}
			if (local46) {
				return null;
			}
			@Pc(76) Class2_Sub1_Sub1_Sub6[] local76 = new Class2_Sub1_Sub1_Sub6[this.anIntArray286.length];
			for (@Pc(78) int local78 = 0; local78 < this.anIntArray286.length; local78++) {
				local76[local78] = Static86.method1543(Static99.aClass33_41, this.anIntArray286[local78]);
			}
			if (local76.length == 1) {
				local42 = local76[0];
			} else {
				local42 = new Class2_Sub1_Sub1_Sub6(local76, local76.length);
			}
			if (this.anIntArray284 != null) {
				for (@Pc(120) int local120 = 0; local120 < this.anIntArray284.length; local120++) {
					local42.method1515(this.anIntArray284[local120], this.anIntArray287[local120]);
				}
			}
			local42.method1524();
			local42.method1535(this.anInt2118 + 64, this.anInt2095 + 850, -30, -50, -30, true);
			Static33.aClass21_31.method745((long) this.anInt2122, local42);
		}
		@Pc(173) Class2_Sub1_Sub1_Sub6 local173;
		if (arg1 != null && arg3 != null) {
			local173 = arg1.method736(arg2, arg3, arg0, local42);
		} else if (arg1 != null) {
			local173 = arg1.method733(local42, arg0);
		} else if (arg3 == null) {
			local173 = local42.method1522(true);
		} else {
			local173 = arg3.method733(local42, arg2);
		}
		if (this.anInt2127 != 128 || this.anInt2107 != 128) {
			local173.method1517(this.anInt2127, this.anInt2107, this.anInt2127);
		}
		return local173;
	}
}
