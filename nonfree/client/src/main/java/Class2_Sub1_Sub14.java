import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!s", name = "Bb", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!s", name = "Db", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	public int anInt2389 = 99;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "I")
	public int anInt2386 = -1;

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
	public int anInt2395 = 5;

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
	public int anInt2399 = -1;

	@OriginalMember(owner = "client!s", name = "ub", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "I")
	public int anInt2390 = -1;

	@OriginalMember(owner = "client!s", name = "zb", descriptor = "I")
	public int anInt2408 = -1;

	@OriginalMember(owner = "client!s", name = "Cb", descriptor = "I")
	public int anInt2410 = -1;

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "I")
	public int anInt2406 = 2;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fd;II)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1676(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anIntArray287[arg1];
		@Pc(19) Class2_Sub1_Sub2 local19 = Static83.method1504(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method660(true);
		} else {
			@Pc(40) Class2_Sub1_Sub4_Sub1 local40 = arg0.method660(!local19.method169(local23));
			local40.method683(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public void method1677() {
		if (this.anInt2399 == -1) {
			if (this.anIntArray289 == null) {
				this.anInt2399 = 0;
			} else {
				this.anInt2399 = 2;
			}
		}
		if (this.anInt2408 != -1) {
			return;
		}
		if (this.anIntArray289 == null) {
			this.anInt2408 = 0;
		} else {
			this.anInt2408 = 2;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBLclient!s;Lclient!fd;I)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1679(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub14 arg1, @OriginalArg(3) Class2_Sub1_Sub4_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray287[arg0];
		@Pc(14) Class2_Sub1_Sub2 local14 = Static83.method1504(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1680(arg3, arg2);
		}
		@Pc(31) int local31 = arg1.anIntArray287[arg3];
		@Pc(39) Class2_Sub1_Sub2 local39 = Static83.method1504(local31 >> 16);
		@Pc(43) int local43 = local31 & 0xFFFF;
		@Pc(56) Class2_Sub1_Sub4_Sub1 local56;
		if (local39 == null) {
			local56 = arg2.method657(!local14.method169(local18));
			local56.method683(local14, local18);
			return local56;
		} else {
			local56 = arg2.method657(!local14.method169(local18) & !local39.method169(local43));
			local56.method670(local14, local18, local39, local43, this.anIntArray289);
			return local56;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!fd;B)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1680(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray287[arg0];
		@Pc(14) Class2_Sub1_Sub2 local14 = Static83.method1504(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method657(true);
		} else {
			@Pc(35) Class2_Sub1_Sub4_Sub1 local35 = arg1.method657(!local14.method169(local18));
			local35.method683(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method1681(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		@Pc(34) int local34;
		if (arg1 == 1) {
			local6 = arg0.method1399();
			this.anIntArray288 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray288[local12] = arg0.method1366();
			}
			this.anIntArray287 = new int[local6];
			for (local34 = 0; local34 < local6; local34++) {
				this.anIntArray287[local34] = arg0.method1366();
			}
			for (@Pc(48) int local48 = 0; local48 < local6; local48++) {
				this.anIntArray287[local48] += arg0.method1366() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt2386 = arg0.method1366();
		} else if (arg1 == 3) {
			local6 = arg0.method1399();
			this.anIntArray289 = new int[local6 + 1];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray289[local12] = arg0.method1399();
			}
			this.anIntArray289[local6] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean107 = true;
		} else if (arg1 == 5) {
			this.anInt2395 = arg0.method1399();
		} else if (arg1 == 6) {
			this.anInt2410 = arg0.method1366();
		} else if (arg1 == 7) {
			this.anInt2390 = arg0.method1366();
		} else if (arg1 == 8) {
			this.anInt2389 = arg0.method1399();
		} else if (arg1 == 9) {
			this.anInt2408 = arg0.method1399();
		} else if (arg1 == 10) {
			this.anInt2399 = arg0.method1399();
		} else if (arg1 == 11) {
			this.anInt2406 = arg0.method1399();
		} else if (arg1 == 12) {
			local6 = arg0.method1399();
			this.anIntArray286 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray286[local12] = arg0.method1366();
			}
			for (local34 = 0; local34 < local6; local34++) {
				this.anIntArray286[local34] += arg0.method1366() << 16;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Lclient!fd;II)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1682(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray287[arg1];
		@Pc(16) Class2_Sub1_Sub2 local16 = Static83.method1504(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg0.method657(true);
		}
		@Pc(28) int local28 = 0;
		@Pc(30) Class2_Sub1_Sub2 local30 = null;
		if (this.anIntArray286 != null && arg1 < this.anIntArray286.length) {
			local28 = this.anIntArray286[arg1];
			local30 = Static83.method1504(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(71) Class2_Sub1_Sub4_Sub1 local71;
		if (local30 == null || local28 == 65535) {
			local71 = arg0.method657(!local16.method169(local20));
			local71.method683(local16, local20);
			return local71;
		} else {
			local71 = arg0.method657(!local16.method169(local20) & !local30.method169(local28));
			local71.method683(local16, local20);
			local71.method683(local30, local28);
			return local71;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1686(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1399();
			if (local15 == 0) {
				return;
			}
			this.method1681(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fd;III)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1687(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray287[arg2];
		@Pc(16) Class2_Sub1_Sub2 local16 = Static83.method1504(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method657(true);
		}
		@Pc(45) Class2_Sub1_Sub4_Sub1 local45 = arg0.method657(!local16.method169(local20));
		@Pc(49) int local49 = arg1 & 0x3;
		if (local49 == 1) {
			local45.method661();
		} else if (local49 == 2) {
			local45.method658();
		} else if (local49 == 3) {
			local45.method684();
		}
		local45.method683(local16, local20);
		if (local49 == 1) {
			local45.method684();
		} else if (local49 == 2) {
			local45.method658();
		} else if (local49 == 3) {
			local45.method661();
		}
		return local45;
	}
}
