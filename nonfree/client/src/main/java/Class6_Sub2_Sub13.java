import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
	public int anInt2803 = -1;

	@OriginalMember(owner = "client!tb", name = "wb", descriptor = "I")
	public int anInt2815 = -1;

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
	public int anInt2801 = 5;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
	public int anInt2804 = -1;

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "I")
	public int anInt2814 = -1;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
	public int anInt2820 = 2;

	@OriginalMember(owner = "client!tb", name = "Ab", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "I")
	public int anInt2821 = -1;

	@OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
	public int anInt2818 = 99;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZLclient!jb;)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1857(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3_Sub3 arg1) {
		@Pc(15) int local15 = this.anIntArray264[arg0];
		@Pc(21) Class6_Sub2_Sub7 local21 = Static90.method1721(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg1.method966(true);
		} else {
			@Pc(42) Class6_Sub2_Sub3_Sub3 local42 = arg1.method966(!local21.method1015(local25));
			local42.method969(local21, local25);
			return local42;
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public void method1858() {
		if (this.anInt2803 == -1) {
			if (this.anIntArray262 == null) {
				this.anInt2803 = 0;
			} else {
				this.anInt2803 = 2;
			}
		}
		if (this.anInt2814 != -1) {
			return;
		}
		if (this.anIntArray262 == null) {
			this.anInt2814 = 0;
		} else {
			this.anInt2814 = 2;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!b;Z)V")
	public void method1860(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1495();
			if (local14 == 0) {
				return;
			}
			this.method1867(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!jb;I)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1861(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3_Sub3 arg1) {
		@Pc(14) int local14 = this.anIntArray264[arg0];
		@Pc(22) Class6_Sub2_Sub7 local22 = Static90.method1721(local14 >> 16);
		@Pc(26) int local26 = local14 & 0xFFFF;
		if (local22 == null) {
			return arg1.method959(true);
		} else {
			@Pc(43) Class6_Sub2_Sub3_Sub3 local43 = arg1.method959(!local22.method1015(local26));
			local43.method969(local22, local26);
			return local43;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!tb;Lclient!jb;I)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1862(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub13 arg1, @OriginalArg(3) Class6_Sub2_Sub3_Sub3 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray264[arg0];
		@Pc(14) Class6_Sub2_Sub7 local14 = Static90.method1721(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1857(arg3, arg2);
		}
		@Pc(36) int local36 = arg1.anIntArray264[arg3];
		@Pc(42) Class6_Sub2_Sub7 local42 = Static90.method1721(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class6_Sub2_Sub3_Sub3 local59;
		if (local42 == null) {
			local59 = arg2.method966(!local14.method1015(local18));
			local59.method969(local14, local18);
			return local59;
		} else {
			local59 = arg2.method966(!local14.method1015(local18) & !local42.method1015(local46));
			local59.method950(local14, local18, local42, local46, this.anIntArray262);
			return local59;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!jb;IZ)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1863(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3_Sub3 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anIntArray264[arg2];
		@Pc(21) Class6_Sub2_Sub7 local21 = Static90.method1721(local6 >> 16);
		@Pc(25) int local25 = local6 & 0xFFFF;
		if (local21 == null) {
			return arg1.method966(true);
		}
		@Pc(35) int local35 = arg0 & 0x3;
		@Pc(46) Class6_Sub2_Sub3_Sub3 local46 = arg1.method966(!local21.method1015(local25));
		if (local35 == 1) {
			local46.method948();
		} else if (local35 == 2) {
			local46.method976();
		} else if (local35 == 3) {
			local46.method968();
		}
		local46.method969(local21, local25);
		if (local35 == 1) {
			local46.method968();
		} else if (local35 == 2) {
			local46.method976();
		} else if (local35 == 3) {
			local46.method948();
		}
		return local46;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZILclient!jb;)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1864(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub3_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray264[arg0];
		@Pc(14) Class6_Sub2_Sub7 local14 = Static90.method1721(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method966(true);
		}
		@Pc(34) Class6_Sub2_Sub7 local34 = null;
		@Pc(36) int local36 = 0;
		if (this.anIntArray260 != null && this.anIntArray260.length > arg0) {
			local36 = this.anIntArray260[arg0];
			local34 = Static90.method1721(local36 >> 16);
			local36 &= 0xFFFF;
		}
		@Pc(77) Class6_Sub2_Sub3_Sub3 local77;
		if (local34 == null || local36 == 65535) {
			local77 = arg1.method966(!local14.method1015(local18));
			local77.method969(local14, local18);
			return local77;
		} else {
			local77 = arg1.method966(!local14.method1015(local18) & !local34.method1015(local36));
			local77.method969(local14, local18);
			local77.method969(local34, local36);
			return local77;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!b;Z)V")
	private void method1867(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(43) int local43;
		if (arg0 == 1) {
			local14 = arg1.method1495();
			this.anIntArray261 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray261[local20] = arg1.method1500();
			}
			this.anIntArray264 = new int[local14];
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray264[local43] = arg1.method1500();
			}
			for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
				this.anIntArray264[local58] = (arg1.method1500() << 16) + this.anIntArray264[local58];
			}
		} else if (arg0 == 2) {
			this.anInt2804 = arg1.method1500();
		} else if (arg0 == 3) {
			local14 = arg1.method1495();
			this.anIntArray262 = new int[local14 + 1];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray262[local20] = arg1.method1495();
			}
			this.anIntArray262[local14] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean128 = true;
		} else if (arg0 == 5) {
			this.anInt2801 = arg1.method1495();
		} else if (arg0 == 6) {
			this.anInt2815 = arg1.method1500();
		} else if (arg0 == 7) {
			this.anInt2821 = arg1.method1500();
		} else if (arg0 == 8) {
			this.anInt2818 = arg1.method1495();
		} else if (arg0 == 9) {
			this.anInt2803 = arg1.method1495();
		} else if (arg0 == 10) {
			this.anInt2814 = arg1.method1495();
		} else if (arg0 == 11) {
			this.anInt2820 = arg1.method1495();
		} else if (arg0 == 12) {
			local14 = arg1.method1495();
			this.anIntArray260 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray260[local20] = arg1.method1500();
			}
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray260[local43] += arg1.method1500() << 16;
			}
		}
	}
}
