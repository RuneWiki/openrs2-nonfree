import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!ma", name = "ub", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!ma", name = "Bb", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!ma", name = "Gb", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
	public int anInt1513 = -1;

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "I")
	public int anInt1518 = -1;

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
	public int anInt1508 = -1;

	@OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
	public int anInt1521 = 99;

	@OriginalMember(owner = "client!ma", name = "Db", descriptor = "I")
	public int anInt1527 = 5;

	@OriginalMember(owner = "client!ma", name = "xb", descriptor = "I")
	public int anInt1524 = -1;

	@OriginalMember(owner = "client!ma", name = "wb", descriptor = "Z")
	public boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
	public int anInt1511 = -1;

	@OriginalMember(owner = "client!ma", name = "Eb", descriptor = "I")
	public int anInt1528 = 2;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!na;II)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1044(@OriginalArg(0) Class2_Sub2_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray192[arg1];
		@Pc(14) Class2_Sub2_Sub16 local14 = Static125.method1890(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1118(true);
		} else {
			@Pc(35) Class2_Sub2_Sub2_Sub5 local35 = arg0.method1118(!local14.method1745(local18));
			local35.method1119(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZLclient!na;)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub2_Sub5 arg2) {
		@Pc(10) int local10 = this.anIntArray192[arg1];
		@Pc(16) Class2_Sub2_Sub16 local16 = Static125.method1890(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1118(true);
		}
		@Pc(35) int local35 = arg0 & 0x3;
		@Pc(46) Class2_Sub2_Sub2_Sub5 local46 = arg2.method1118(!local16.method1745(local20));
		if (local35 == 1) {
			local46.method1117();
		} else if (local35 == 2) {
			local46.method1124();
		} else if (local35 == 3) {
			local46.method1123();
		}
		local46.method1119(local16, local20);
		if (local35 == 1) {
			local46.method1123();
		} else if (local35 == 2) {
			local46.method1124();
		} else if (local35 == 3) {
			local46.method1117();
		}
		return local46;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!na;ZI)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1046(@OriginalArg(0) Class2_Sub2_Sub2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anIntArray192[arg1];
		@Pc(21) Class2_Sub2_Sub16 local21 = Static125.method1890(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method1118(true);
		}
		@Pc(33) int local33 = 0;
		@Pc(35) Class2_Sub2_Sub16 local35 = null;
		if (this.anIntArray190 != null && this.anIntArray190.length > arg1) {
			local33 = this.anIntArray190[arg1];
			local35 = Static125.method1890(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(74) Class2_Sub2_Sub2_Sub5 local74;
		if (local35 == null || local33 == 65535) {
			local74 = arg0.method1118(!local21.method1745(local25));
			local74.method1119(local21, local25);
			return local74;
		} else {
			local74 = arg0.method1118(!local21.method1745(local25) & !local35.method1745(local33));
			local74.method1119(local21, local25);
			local74.method1119(local35, local33);
			return local74;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ic;I)V")
	public void method1047(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1514();
			if (local3 == 0) {
				return;
			}
			this.method1054(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!na;II)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1049(@OriginalArg(0) Class2_Sub2_Sub2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray192[arg1];
		@Pc(19) Class2_Sub2_Sub16 local19 = Static125.method1890(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1136(true);
		} else {
			@Pc(40) Class2_Sub2_Sub2_Sub5 local40 = arg0.method1136(!local19.method1745(local23));
			local40.method1119(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILclient!na;Lclient!ma;)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub2_Sub5 arg2, @OriginalArg(4) Class2_Sub2_Sub11 arg3) {
		@Pc(8) int local8 = this.anIntArray192[arg0];
		@Pc(21) Class2_Sub2_Sub16 local21 = Static125.method1890(local8 >> 16);
		@Pc(25) int local25 = local8 & 0xFFFF;
		if (local21 == null) {
			return arg3.method1044(arg2, arg1);
		}
		@Pc(38) int local38 = arg3.anIntArray192[arg1];
		@Pc(44) Class2_Sub2_Sub16 local44 = Static125.method1890(local38 >> 16);
		@Pc(48) int local48 = local38 & 0xFFFF;
		@Pc(61) Class2_Sub2_Sub2_Sub5 local61;
		if (local44 == null) {
			local61 = arg2.method1118(!local21.method1745(local25));
			local61.method1119(local21, local25);
			return local61;
		} else {
			local61 = arg2.method1118(!local21.method1745(local25) & !local44.method1745(local48));
			local61.method1128(local21, local25, local44, local48, this.anIntArray188);
			return local61;
		}
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	public void method1053() {
		if (this.anInt1513 == -1) {
			if (this.anIntArray188 == null) {
				this.anInt1513 = 0;
			} else {
				this.anInt1513 = 2;
			}
		}
		if (this.anInt1524 != -1) {
			return;
		}
		if (this.anIntArray188 == null) {
			this.anInt1524 = 0;
		} else {
			this.anInt1524 = 2;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ic;II)V")
	private void method1054(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(77) int local77;
		@Pc(83) int local83;
		@Pc(101) int local101;
		if (arg1 == 1) {
			local77 = arg0.method1514();
			this.anIntArray191 = new int[local77];
			for (local83 = 0; local83 < local77; local83++) {
				this.anIntArray191[local83] = arg0.method1517();
			}
			this.anIntArray192 = new int[local77];
			for (local101 = 0; local101 < local77; local101++) {
				this.anIntArray192[local101] = arg0.method1517();
			}
			for (@Pc(269) int local269 = 0; local269 < local77; local269++) {
				this.anIntArray192[local269] += arg0.method1517() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1511 = arg0.method1517();
		} else if (arg1 == 3) {
			local77 = arg0.method1514();
			this.anIntArray188 = new int[local77 + 1];
			for (local83 = 0; local83 < local77; local83++) {
				this.anIntArray188[local83] = arg0.method1514();
			}
			this.anIntArray188[local77] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean59 = true;
		} else if (arg1 == 5) {
			this.anInt1527 = arg0.method1514();
		} else if (arg1 == 6) {
			this.anInt1518 = arg0.method1517();
		} else if (arg1 == 7) {
			this.anInt1508 = arg0.method1517();
		} else if (arg1 == 8) {
			this.anInt1521 = arg0.method1514();
		} else if (arg1 == 9) {
			this.anInt1524 = arg0.method1514();
		} else if (arg1 == 10) {
			this.anInt1513 = arg0.method1514();
		} else if (arg1 == 11) {
			this.anInt1528 = arg0.method1514();
		} else if (arg1 == 12) {
			local77 = arg0.method1514();
			this.anIntArray190 = new int[local77];
			for (local83 = 0; local83 < local77; local83++) {
				this.anIntArray190[local83] = arg0.method1517();
			}
			for (local101 = 0; local101 < local77; local101++) {
				this.anIntArray190[local101] += arg0.method1517() << 16;
			}
			return;
		} else if (arg1 == 13) {
			local77 = arg0.method1514();
			this.anIntArray187 = new int[local77];
			for (local83 = 0; local83 < local77; local83++) {
				this.anIntArray187[local83] = arg0.method1489();
			}
			return;
		}
	}
}
