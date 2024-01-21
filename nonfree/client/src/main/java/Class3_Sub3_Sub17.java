import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub3_Sub17 extends Class3_Sub3 {

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
	public int anInt2743 = -1;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "Z")
	public boolean aBoolean134 = false;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	public int anInt2737 = 2;

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
	public int anInt2750 = 5;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
	public int anInt2738 = -1;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
	public int anInt2741 = -1;

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
	public int anInt2749 = -1;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
	public int anInt2739 = -1;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	public int anInt2744 = 99;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!wa;)Lclient!wa;")
	public Class26_Sub6 method1920(@OriginalArg(0) int arg0, @OriginalArg(2) Class26_Sub6 arg1) {
		@Pc(8) int local8 = this.anIntArray197[arg0];
		@Pc(24) Class3_Sub3_Sub20 local24 = Static22.method370(local8 >> 16);
		@Pc(28) int local28 = local8 & 0xFFFF;
		if (local24 == null) {
			return arg1.method2524(true);
		} else {
			@Pc(45) Class26_Sub6 local45 = arg1.method2524(!local24.method2220(local28));
			local45.method2539(local24, local28);
			return local45;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!wa;I)Lclient!wa;")
	public Class26_Sub6 method1924(@OriginalArg(1) Class26_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray197[arg1];
		@Pc(14) Class3_Sub3_Sub20 local14 = Static22.method370(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2527(true);
		} else {
			@Pc(35) Class26_Sub6 local35 = arg0.method2527(!local14.method2220(local18));
			local35.method2539(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public void method1925() {
		if (this.anInt2739 == -1) {
			if (this.anIntArray195 == null) {
				this.anInt2739 = 0;
			} else {
				this.anInt2739 = 2;
			}
		}
		if (this.anInt2741 != -1) {
			return;
		}
		if (this.anIntArray195 == null) {
			this.anInt2741 = 0;
		} else {
			this.anInt2741 = 2;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!wa;II)Lclient!wa;")
	public Class26_Sub6 method1926(@OriginalArg(0) Class26_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray197[arg1];
		@Pc(16) Class3_Sub3_Sub20 local16 = Static22.method370(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg0.method2527(true);
		}
		@Pc(28) Class3_Sub3_Sub20 local28 = null;
		@Pc(30) int local30 = 0;
		if (this.anIntArray196 != null && this.anIntArray196.length > arg1) {
			local30 = this.anIntArray196[arg1];
			local28 = Static22.method370(local30 >> 16);
			local30 &= 0xFFFF;
		}
		@Pc(69) Class26_Sub6 local69;
		if (local28 == null || local30 == 65535) {
			local69 = arg0.method2527(!local16.method2220(local20));
			local69.method2539(local16, local20);
			return local69;
		} else {
			local69 = arg0.method2527(!local16.method2220(local20) & !local28.method2220(local30));
			local69.method2539(local16, local20);
			local69.method2539(local28, local30);
			return local69;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method1927(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1278();
			if (local10 == 0) {
				return;
			}
			this.method1930(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!nd;ILclient!wa;)Lclient!wa;")
	public Class26_Sub6 method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub17 arg2, @OriginalArg(4) Class26_Sub6 arg3) {
		@Pc(8) int local8 = this.anIntArray197[arg1];
		@Pc(14) Class3_Sub3_Sub20 local14 = Static22.method370(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1924(arg3, arg0);
		}
		@Pc(31) int local31 = arg2.anIntArray197[arg0];
		@Pc(37) Class3_Sub3_Sub20 local37 = Static22.method370(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class26_Sub6 local54;
		if (local37 == null) {
			local54 = arg3.method2527(!local14.method2220(local18));
			local54.method2539(local14, local18);
			return local54;
		} else {
			local54 = arg3.method2527(!local14.method2220(local18) & !local37.method2220(local41));
			local54.method2523(local14, local18, local37, local41, this.anIntArray195);
			return local54;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLclient!ce;)V")
	private void method1930(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(91) int local91;
		@Pc(97) int local97;
		@Pc(115) int local115;
		if (arg0 == 1) {
			local91 = arg1.method1270();
			this.anIntArray193 = new int[local91];
			for (local97 = 0; local97 < local91; local97++) {
				this.anIntArray193[local97] = arg1.method1270();
			}
			this.anIntArray197 = new int[local91];
			for (local115 = 0; local115 < local91; local115++) {
				this.anIntArray197[local115] = arg1.method1270();
			}
			for (@Pc(285) int local285 = 0; local285 < local91; local285++) {
				this.anIntArray197[local285] += arg1.method1270() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2738 = arg1.method1270();
		} else if (arg0 == 3) {
			local91 = arg1.method1278();
			this.anIntArray195 = new int[local91 + 1];
			for (local97 = 0; local97 < local91; local97++) {
				this.anIntArray195[local97] = arg1.method1278();
			}
			this.anIntArray195[local91] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean134 = true;
		} else if (arg0 == 5) {
			this.anInt2750 = arg1.method1278();
		} else if (arg0 == 6) {
			this.anInt2743 = arg1.method1270();
		} else if (arg0 == 7) {
			this.anInt2749 = arg1.method1270();
		} else if (arg0 == 8) {
			this.anInt2744 = arg1.method1278();
		} else if (arg0 == 9) {
			this.anInt2739 = arg1.method1278();
		} else if (arg0 == 10) {
			this.anInt2741 = arg1.method1278();
		} else if (arg0 == 11) {
			this.anInt2737 = arg1.method1278();
			return;
		} else if (arg0 == 12) {
			local91 = arg1.method1278();
			this.anIntArray196 = new int[local91];
			for (local97 = 0; local97 < local91; local97++) {
				this.anIntArray196[local97] = arg1.method1270();
			}
			for (local115 = 0; local115 < local91; local115++) {
				this.anIntArray196[local115] += arg1.method1270() << 16;
			}
			return;
		} else if (arg0 == 13) {
			local91 = arg1.method1278();
			this.anIntArray192 = new int[local91];
			for (local97 = 0; local97 < local91; local97++) {
				this.anIntArray192[local97] = arg1.method1271();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIILclient!wa;)Lclient!wa;")
	public Class26_Sub6 method1933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26_Sub6 arg2) {
		@Pc(14) int local14 = this.anIntArray197[arg0];
		@Pc(24) Class3_Sub3_Sub20 local24 = Static22.method370(local14 >> 16);
		@Pc(28) int local28 = local14 & 0xFFFF;
		if (local24 == null) {
			return arg2.method2527(true);
		}
		@Pc(38) int local38 = arg1 & 0x3;
		@Pc(49) Class26_Sub6 local49 = arg2.method2527(!local24.method2220(local28));
		if (local38 == 1) {
			local49.method2526();
		} else if (local38 == 2) {
			local49.method2528();
		} else if (local38 == 3) {
			local49.method2531();
		}
		local49.method2539(local24, local28);
		if (local38 == 1) {
			local49.method2531();
		} else if (local38 == 2) {
			local49.method2528();
		} else if (local38 == 3) {
			local49.method2526();
		}
		return local49;
	}
}
