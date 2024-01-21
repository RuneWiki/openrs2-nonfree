import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
	public int anInt2648 = -1;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
	public int anInt2658 = 2;

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
	public int anInt2659 = 5;

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
	public int anInt2650 = -1;

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
	public int anInt2657 = -1;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
	public int anInt2666 = 99;

	@OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
	public int anInt2663 = -1;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "I")
	public int anInt2668 = -1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!tb;ZLclient!lb;I)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1869(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub15 arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub6 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray450[arg3];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static8.method297(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1872(arg2, arg0);
		}
		@Pc(31) int local31 = arg1.anIntArray450[arg0];
		@Pc(37) Class1_Sub1_Sub11 local37 = Static8.method297(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class1_Sub1_Sub1_Sub6 local54;
		if (local37 == null) {
			local54 = arg2.method1325(!local14.method1609(local18));
			local54.method1339(local14, local18);
			return local54;
		} else {
			local54 = arg2.method1325(!local14.method1609(local18) & !local37.method1609(local41));
			local54.method1335(local14, local18, local37, local41, this.anIntArray451);
			return local54;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!mc;)V")
	public void method1870(@OriginalArg(1) Class1_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1190();
			if (local7 == 0) {
				return;
			}
			this.method1876(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lb;II)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1872(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray450[arg1];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static8.method297(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1325(true);
		} else {
			@Pc(35) Class1_Sub1_Sub1_Sub6 local35 = arg0.method1325(!local14.method1609(local18));
			local35.method1339(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lb;BI)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1874(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray450[arg1];
		@Pc(19) Class1_Sub1_Sub11 local19 = Static8.method297(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1333(true);
		} else {
			@Pc(40) Class1_Sub1_Sub1_Sub6 local40 = arg0.method1333(!local19.method1609(local23));
			local40.method1339(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lb;III)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1875(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray450[arg1];
		@Pc(16) Class1_Sub1_Sub11 local16 = Static8.method297(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method1325(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(41) Class1_Sub1_Sub1_Sub6 local41 = arg0.method1325(!local16.method1609(local20));
		if (local30 == 1) {
			local41.method1327();
		} else if (local30 == 2) {
			local41.method1332();
		} else if (local30 == 3) {
			local41.method1340();
		}
		local41.method1339(local16, local20);
		if (local30 == 1) {
			local41.method1340();
		} else if (local30 == 2) {
			local41.method1332();
		} else if (local30 == 3) {
			local41.method1327();
		}
		return local41;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!mc;I)V")
	private void method1876(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(51) int local51;
		if (arg0 == 1) {
			local22 = arg1.method1176();
			this.anIntArray452 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray452[local28] = arg1.method1176();
			}
			this.anIntArray450 = new int[local22];
			for (local51 = 0; local51 < local22; local51++) {
				this.anIntArray450[local51] = arg1.method1176();
			}
			for (@Pc(70) int local70 = 0; local70 < local22; local70++) {
				this.anIntArray450[local70] += arg1.method1176() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2657 = arg1.method1176();
		} else if (arg0 == 3) {
			local22 = arg1.method1190();
			this.anIntArray451 = new int[local22 + 1];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray451[local28] = arg1.method1190();
			}
			this.anIntArray451[local22] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean112 = true;
		} else if (arg0 == 5) {
			this.anInt2659 = arg1.method1190();
		} else if (arg0 == 6) {
			this.anInt2648 = arg1.method1176();
		} else if (arg0 == 7) {
			this.anInt2663 = arg1.method1176();
		} else if (arg0 == 8) {
			this.anInt2666 = arg1.method1190();
		} else if (arg0 == 9) {
			this.anInt2650 = arg1.method1190();
		} else if (arg0 == 10) {
			this.anInt2668 = arg1.method1190();
		} else if (arg0 == 11) {
			this.anInt2658 = arg1.method1190();
		} else if (arg0 == 12) {
			local22 = arg1.method1190();
			this.anIntArray453 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray453[local28] = arg1.method1176();
			}
			for (local51 = 0; local51 < local22; local51++) {
				this.anIntArray453[local51] = (arg1.method1176() << 16) + this.anIntArray453[local51];
			}
			return;
		} else if (arg0 == 13) {
			local22 = arg1.method1190();
			this.anIntArray454 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray454[local28] = arg1.method1215();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!lb;)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1879(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub6 arg1) {
		@Pc(4) int local4 = this.anIntArray450[arg0];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static8.method297(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1325(true);
		}
		@Pc(26) Class1_Sub1_Sub11 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray453 != null && arg0 < this.anIntArray453.length) {
			local28 = this.anIntArray453[arg0];
			local26 = Static8.method297(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(67) Class1_Sub1_Sub1_Sub6 local67;
		if (local26 == null || local28 == 65535) {
			local67 = arg1.method1325(!local14.method1609(local18));
			local67.method1339(local14, local18);
			return local67;
		} else {
			local67 = arg1.method1325(!local14.method1609(local18) & !local26.method1609(local28));
			local67.method1339(local14, local18);
			local67.method1339(local26, local28);
			return local67;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public void method1880() {
		if (this.anInt2650 == -1) {
			if (this.anIntArray451 == null) {
				this.anInt2650 = 0;
			} else {
				this.anInt2650 = 2;
			}
		}
		if (this.anInt2668 != -1) {
			return;
		}
		if (this.anIntArray451 == null) {
			this.anInt2668 = 0;
		} else {
			this.anInt2668 = 2;
		}
	}
}
