import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!e", name = "db", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!e", name = "sb", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!e", name = "xb", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!e", name = "Eb", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!e", name = "Gb", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
	public int anInt696 = 99;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public int anInt697 = -1;

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
	public int anInt700 = -1;

	@OriginalMember(owner = "client!e", name = "rb", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!e", name = "Db", descriptor = "I")
	public int anInt709 = 2;

	@OriginalMember(owner = "client!e", name = "Bb", descriptor = "I")
	public int anInt707 = -1;

	@OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
	public int anInt708 = -1;

	@OriginalMember(owner = "client!e", name = "Ob", descriptor = "I")
	public int anInt716 = -1;

	@OriginalMember(owner = "client!e", name = "Mb", descriptor = "I")
	public int anInt715 = 5;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!ue;)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method448(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub7 arg1) {
		@Pc(14) int local14 = this.anIntArray97[arg0];
		@Pc(20) Class1_Sub1_Sub1 local20 = Static58.method972(local14 >> 16);
		@Pc(24) int local24 = local14 & 0xFFFF;
		if (local20 == null) {
			return arg1.method1920(true);
		} else {
			@Pc(41) Class1_Sub1_Sub2_Sub7 local41 = arg1.method1920(!local20.method37(local24));
			local41.method1933(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ue;II)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method449(@OriginalArg(0) Class1_Sub1_Sub2_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anIntArray97[arg1];
		@Pc(19) Class1_Sub1_Sub1 local19 = Static58.method972(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1923(true);
		}
		@Pc(35) Class1_Sub1_Sub1 local35 = null;
		@Pc(37) int local37 = 0;
		if (this.anIntArray92 != null && arg1 < this.anIntArray92.length) {
			local37 = this.anIntArray92[arg1];
			local35 = Static58.method972(local37 >> 16);
			local37 &= 0xFFFF;
		}
		@Pc(82) Class1_Sub1_Sub2_Sub7 local82;
		if (local35 == null || local37 == 65535) {
			local82 = arg0.method1923(!local19.method37(local23));
			local82.method1933(local19, local23);
			return local82;
		} else {
			local82 = arg0.method1923(!local19.method37(local23) & !local35.method37(local37));
			local82.method1933(local19, local23);
			local82.method1933(local35, local37);
			return local82;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!e;ILclient!ue;)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2, @OriginalArg(4) Class1_Sub1_Sub2_Sub7 arg3) {
		@Pc(8) int local8 = this.anIntArray97[arg1];
		@Pc(14) Class1_Sub1_Sub1 local14 = Static58.method972(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method456(arg3, arg0);
		}
		@Pc(37) int local37 = arg2.anIntArray97[arg0];
		@Pc(43) Class1_Sub1_Sub1 local43 = Static58.method972(local37 >> 16);
		@Pc(47) int local47 = local37 & 0xFFFF;
		@Pc(60) Class1_Sub1_Sub2_Sub7 local60;
		if (local43 == null) {
			local60 = arg3.method1923(!local14.method37(local18));
			local60.method1933(local14, local18);
			return local60;
		} else {
			local60 = arg3.method1923(!local14.method37(local18) & !local43.method37(local47));
			local60.method1925(local14, local18, local43, local47, this.anIntArray94);
			return local60;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBLclient!id;)V")
	private void method451(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(147) int local147;
		if (arg0 == 1) {
			local25 = arg1.method1837();
			this.anIntArray96 = new int[local25];
			for (local33 = 0; local33 < local25; local33++) {
				this.anIntArray96[local33] = arg1.method1842();
			}
			this.anIntArray97 = new int[local25];
			for (local147 = 0; local147 < local25; local147++) {
				this.anIntArray97[local147] = arg1.method1842();
			}
			for (@Pc(274) int local274 = 0; local274 < local25; local274++) {
				this.anIntArray97[local274] += arg1.method1842() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt707 = arg1.method1842();
		} else if (arg0 == 3) {
			local25 = arg1.method1837();
			this.anIntArray94 = new int[local25 + 1];
			for (local33 = 0; local33 < local25; local33++) {
				this.anIntArray94[local33] = arg1.method1837();
			}
			this.anIntArray94[local25] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean47 = true;
		} else if (arg0 == 5) {
			this.anInt715 = arg1.method1837();
		} else if (arg0 == 6) {
			this.anInt697 = arg1.method1842();
		} else if (arg0 == 7) {
			this.anInt708 = arg1.method1842();
		} else if (arg0 == 8) {
			this.anInt696 = arg1.method1837();
		} else if (arg0 == 9) {
			this.anInt716 = arg1.method1837();
		} else if (arg0 == 10) {
			this.anInt700 = arg1.method1837();
		} else if (arg0 == 11) {
			this.anInt709 = arg1.method1837();
		} else if (arg0 == 12) {
			local25 = arg1.method1837();
			this.anIntArray92 = new int[local25];
			for (local33 = 0; local33 < local25; local33++) {
				this.anIntArray92[local33] = arg1.method1842();
			}
			for (local147 = 0; local147 < local25; local147++) {
				this.anIntArray92[local147] = (arg1.method1842() << 16) + this.anIntArray92[local147];
			}
		} else if (arg0 == 13) {
			local25 = arg1.method1837();
			this.anIntArray93 = new int[local25];
			for (local33 = 0; local33 < local25; local33++) {
				this.anIntArray93[local33] = arg1.method1868();
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
	public void method452() {
		if (this.anInt700 == -1) {
			if (this.anIntArray94 == null) {
				this.anInt700 = 0;
			} else {
				this.anInt700 = 2;
			}
		}
		if (this.anInt716 != -1) {
			return;
		}
		if (this.anIntArray94 == null) {
			this.anInt716 = 0;
		} else {
			this.anInt716 = 2;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILclient!ue;)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub7 arg2) {
		@Pc(10) int local10 = this.anIntArray97[arg0];
		@Pc(16) Class1_Sub1_Sub1 local16 = Static58.method972(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1923(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class1_Sub1_Sub2_Sub7 local41 = arg2.method1923(!local16.method37(local20));
		if (local30 == 1) {
			local41.method1929();
		} else if (local30 == 2) {
			local41.method1914();
		} else if (local30 == 3) {
			local41.method1915();
		}
		local41.method1933(local16, local20);
		if (local30 == 1) {
			local41.method1915();
		} else if (local30 == 2) {
			local41.method1914();
		} else if (local30 == 3) {
			local41.method1929();
		}
		return local41;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ue;IB)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method456(@OriginalArg(0) Class1_Sub1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray97[arg1];
		@Pc(14) Class1_Sub1_Sub1 local14 = Static58.method972(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1923(true);
		} else {
			@Pc(42) Class1_Sub1_Sub2_Sub7 local42 = arg0.method1923(!local14.method37(local23));
			local42.method1933(local14, local23);
			return local42;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!id;)V")
	public void method458(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1837();
			if (local9 == 0) {
				return;
			}
			this.method451(local9, arg0);
		}
	}
}
