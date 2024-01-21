import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!qa", name = "mb", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!qa", name = "qb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!qa", name = "rb", descriptor = "I")
	public int anInt2344;

	@OriginalMember(owner = "client!qa", name = "Cb", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!qa", name = "Nb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
	public int anInt2334 = -1;

	@OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
	public int anInt2336 = -1;

	@OriginalMember(owner = "client!qa", name = "jb", descriptor = "I")
	private int anInt2339 = 128;

	@OriginalMember(owner = "client!qa", name = "ob", descriptor = "I")
	public int anInt2343 = 1;

	@OriginalMember(owner = "client!qa", name = "xb", descriptor = "Lclient!je;")
	public Class40 aClass40_1219 = Static75.aClass40_969;

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "I")
	public int anInt2347 = -1;

	@OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
	public int anInt2337 = -1;

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
	public int anInt2330 = -1;

	@OriginalMember(owner = "client!qa", name = "Ab", descriptor = "I")
	private int anInt2350 = 0;

	@OriginalMember(owner = "client!qa", name = "yb", descriptor = "[Lclient!je;")
	public final Class40[] aClass40Array18 = new Class40[5];

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "I")
	private int anInt2340 = -1;

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
	public int anInt2333 = -1;

	@OriginalMember(owner = "client!qa", name = "Hb", descriptor = "I")
	public int anInt2354 = -1;

	@OriginalMember(owner = "client!qa", name = "Jb", descriptor = "I")
	public int anInt2355 = 32;

	@OriginalMember(owner = "client!qa", name = "ab", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
	private int anInt2346 = -1;

	@OriginalMember(owner = "client!qa", name = "Pb", descriptor = "I")
	private int anInt2360 = 128;

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!qa", name = "Fb", descriptor = "I")
	public int anInt2353 = -1;

	@OriginalMember(owner = "client!qa", name = "Rb", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Z")
	public boolean aBoolean186 = true;

	@OriginalMember(owner = "client!qa", name = "Tb", descriptor = "I")
	public int anInt2362 = -1;

	@OriginalMember(owner = "client!qa", name = "Sb", descriptor = "I")
	private int anInt2361 = 0;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(B)V")
	public void method1660() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!nc;ILclient!nc;I)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1661(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub7 arg1, @OriginalArg(3) Class2_Sub1_Sub7 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray255 != null) {
			@Pc(12) Class2_Sub1_Sub11 local12 = this.method1665();
			return local12 == null ? null : local12.method1661(arg0, arg1, arg2, arg3);
		}
		@Pc(34) Class2_Sub1_Sub1_Sub2 local34 = (Class2_Sub1_Sub1_Sub2) Static87.aClass55_37.method1410((long) this.anInt2344);
		if (local34 == null) {
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray256.length; local40++) {
				if (!Static110.aClass24_20.method1924(this.anIntArray256[local40], 0)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(68) Class2_Sub1_Sub1_Sub7[] local68 = new Class2_Sub1_Sub1_Sub7[this.anIntArray256.length];
			for (@Pc(70) int local70 = 0; local70 < this.anIntArray256.length; local70++) {
				local68[local70] = Static131.method2175(Static110.aClass24_20, this.anIntArray256[local70]);
			}
			@Pc(102) Class2_Sub1_Sub1_Sub7 local102;
			if (local68.length == 1) {
				local102 = local68[0];
			} else {
				local102 = new Class2_Sub1_Sub1_Sub7(local68, local68.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray15 != null) {
				for (local116 = 0; local116 < this.aShortArray15.length; local116++) {
					local102.method2184(this.aShortArray15[local116], this.aShortArray17[local116]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local116 = 0; local116 < this.aShortArray18.length; local116++) {
					local102.method2191(this.aShortArray18[local116], this.aShortArray16[local116]);
				}
			}
			local34 = local102.method2176(this.anInt2361 + 64, this.anInt2350 + 850, -30, -50, -30);
			Static87.aClass55_37.method1411((long) this.anInt2344, local34);
		}
		@Pc(200) Class2_Sub1_Sub1_Sub2 local200;
		if (arg1 != null && arg2 != null) {
			local200 = arg1.method1272(arg0, arg2, arg3, local34);
		} else if (arg1 != null) {
			local200 = arg1.method1271(local34, arg3);
		} else if (arg2 == null) {
			local200 = local34.method116(true);
		} else {
			local200 = arg2.method1271(local34, arg0);
		}
		if (this.anInt2339 != 128 || this.anInt2360 != 128) {
			local200.method112(this.anInt2339, this.anInt2360, this.anInt2339);
		}
		return local200;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!na;)V")
	private void method1663(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub9 arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		if (arg0 == 1) {
			local16 = arg1.method640();
			this.anIntArray256 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray256[local22] = arg1.method632();
			}
		} else if (arg0 == 2) {
			this.aClass40_1219 = arg1.method625();
		} else if (arg0 == 12) {
			this.anInt2343 = arg1.method640();
		} else if (arg0 == 13) {
			this.anInt2347 = arg1.method632();
		} else if (arg0 == 14) {
			this.anInt2354 = arg1.method632();
		} else if (arg0 == 15) {
			this.anInt2337 = arg1.method632();
		} else if (arg0 == 16) {
			this.anInt2336 = arg1.method632();
		} else if (arg0 == 17) {
			this.anInt2354 = arg1.method632();
			this.anInt2362 = arg1.method632();
			this.anInt2353 = arg1.method632();
			this.anInt2330 = arg1.method632();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass40Array18[arg0 - 30] = arg1.method625();
			if (this.aClass40Array18[arg0 - 30].method984(Static133.aClass40_1647)) {
				this.aClass40Array18[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local16 = arg1.method640();
			this.aShortArray15 = new short[local16];
			this.aShortArray17 = new short[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.aShortArray15[local22] = (short) arg1.method632();
				this.aShortArray17[local22] = (short) arg1.method632();
			}
			return;
		} else if (arg0 == 41) {
			local16 = arg1.method640();
			this.aShortArray18 = new short[local16];
			this.aShortArray16 = new short[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.aShortArray18[local22] = (short) arg1.method632();
				this.aShortArray16[local22] = (short) arg1.method632();
			}
			return;
		} else if (arg0 == 60) {
			local16 = arg1.method640();
			this.anIntArray254 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray254[local22] = arg1.method632();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean188 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt2333 = arg1.method632();
		} else if (arg0 == 97) {
			this.anInt2339 = arg1.method632();
			return;
		} else if (arg0 == 98) {
			this.anInt2360 = arg1.method632();
			return;
		} else if (arg0 == 99) {
			this.aBoolean187 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt2361 = arg1.method658();
			return;
		} else if (arg0 == 101) {
			this.anInt2350 = arg1.method658() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt2334 = arg1.method632();
			return;
		} else if (arg0 == 103) {
			this.anInt2355 = arg1.method632();
			return;
		} else if (arg0 == 106) {
			this.anInt2340 = arg1.method632();
			if (this.anInt2340 == 65535) {
				this.anInt2340 = -1;
			}
			this.anInt2346 = arg1.method632();
			if (this.anInt2346 == 65535) {
				this.anInt2346 = -1;
			}
			local16 = arg1.method640();
			this.anIntArray255 = new int[local16 + 1];
			for (local22 = 0; local22 <= local16; local22++) {
				this.anIntArray255[local22] = arg1.method632();
				if (this.anIntArray255[local22] == 65535) {
					this.anIntArray255[local22] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean185 = false;
			} else if (arg0 == 109) {
				this.aBoolean186 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(B)Z")
	public boolean method1664() {
		if (this.anIntArray255 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2340 != -1) {
			local10 = Static49.method881(this.anInt2340);
		} else if (this.anInt2346 != -1) {
			local10 = Static35.anIntArray96[this.anInt2346];
		}
		return local10 >= 0 && this.anIntArray255.length > local10 && this.anIntArray255[local10] != -1;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lclient!qa;")
	public Class2_Sub1_Sub11 method1665() {
		@Pc(5) int local5 = -1;
		if (this.anInt2340 != -1) {
			local5 = Static49.method881(this.anInt2340);
		} else if (this.anInt2346 != -1) {
			local5 = Static35.anIntArray96[this.anInt2346];
		}
		return local5 < 0 || this.anIntArray255.length <= local5 || this.anIntArray255[local5] == -1 ? null : Static87.method896(this.anIntArray255[local5]);
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method1667() {
		if (this.anIntArray255 != null) {
			@Pc(12) Class2_Sub1_Sub11 local12 = this.method1665();
			return local12 == null ? null : local12.method1667();
		} else if (this.anIntArray254 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray254.length; local29++) {
				if (!Static110.aClass24_20.method1924(this.anIntArray254[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(66) Class2_Sub1_Sub1_Sub7[] local66 = new Class2_Sub1_Sub1_Sub7[this.anIntArray254.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray254.length; local68++) {
				local66[local68] = Static131.method2175(Static110.aClass24_20, this.anIntArray254[local68]);
			}
			@Pc(96) Class2_Sub1_Sub1_Sub7 local96;
			if (local66.length == 1) {
				local96 = local66[0];
			} else {
				local96 = new Class2_Sub1_Sub1_Sub7(local66, local66.length);
			}
			@Pc(110) int local110;
			if (this.aShortArray15 != null) {
				for (local110 = 0; local110 < this.aShortArray15.length; local110++) {
					local96.method2184(this.aShortArray15[local110], this.aShortArray17[local110]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local110 = 0; local110 < this.aShortArray18.length; local110++) {
					local96.method2191(this.aShortArray18[local110], this.aShortArray16[local110]);
				}
			}
			return local96;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!na;)V")
	public void method1669(@OriginalArg(1) Class2_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method640();
			if (local5 == 0) {
				return;
			}
			this.method1663(local5, arg0);
		}
	}
}
