import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public static int anInt667 = 2;

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_191 = Static12.method257("mapback");

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!qc;")
	public static Class47 aClass47_7 = new Class47(100);

	@OriginalMember(owner = "client!f", name = "sb", descriptor = "Lclient!o;")
	public static Class40 aClass40_192 = Static12.method257("Please reload this page)3");

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!f", name = "nb", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!f", name = "ob", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	public int anInt664 = -1;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
	public int anInt666 = -1;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	public int anInt669 = -1;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	public int anInt663 = -1;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "I")
	public int anInt658 = 5;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "I")
	public int anInt662 = 2;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public int anInt660 = 99;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
	public int anInt668 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ne;)Lclient!ne;", line = 3)
	public Class2_Sub2_Sub12_Sub4 method516(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub12_Sub4 arg1) {
		@Pc(8) int local8 = this.anIntArray124[arg0];
		@Pc(16) Class2_Sub2_Sub14 local16 = Static38.method754(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1142(true);
		}
		@Pc(28) Class2_Sub2_Sub14 local28 = null;
		@Pc(30) int local30 = 0;
		if (this.anIntArray127 != null && this.anIntArray127.length > arg0) {
			local30 = this.anIntArray127[arg0];
			local28 = Static38.method754(local30 >> 16);
			local30 &= 0xFFFF;
		}
		@Pc(69) Class2_Sub2_Sub12_Sub4 local69;
		if (local28 == null || local30 == 65535) {
			local69 = arg1.method1142(!local16.method1403(local20));
			local69.method1134(local16, local20);
			return local69;
		} else {
			local69 = arg1.method1142(!local16.method1403(local20) & !local28.method1403(local30));
			local69.method1134(local16, local20);
			local69.method1134(local28, local30);
			return local69;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BILclient!eb;)V", line = 54)
	private void method517(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(50) int local50;
		if (arg0 == 1) {
			local19 = arg1.method1708();
			this.anIntArray128 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray128[local25] = arg1.method1704();
			}
			this.anIntArray124 = new int[local19];
			for (local50 = 0; local50 < local19; local50++) {
				this.anIntArray124[local50] = arg1.method1704();
			}
			for (@Pc(69) int local69 = 0; local69 < local19; local69++) {
				this.anIntArray124[local69] = (arg1.method1704() << 16) + this.anIntArray124[local69];
			}
		} else if (arg0 == 2) {
			this.anInt669 = arg1.method1704();
		} else if (arg0 == 3) {
			local19 = arg1.method1708();
			this.anIntArray125 = new int[local19 + 1];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray125[local25] = arg1.method1708();
			}
			this.anIntArray125[local19] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean50 = true;
		} else if (arg0 == 5) {
			this.anInt658 = arg1.method1708();
		} else if (arg0 == 6) {
			this.anInt668 = arg1.method1704();
		} else if (arg0 == 7) {
			this.anInt664 = arg1.method1704();
		} else if (arg0 == 8) {
			this.anInt660 = arg1.method1708();
		} else if (arg0 == 9) {
			this.anInt663 = arg1.method1708();
		} else if (arg0 == 10) {
			this.anInt666 = arg1.method1708();
		} else if (arg0 == 11) {
			this.anInt662 = arg1.method1708();
		} else if (arg0 == 12) {
			local19 = arg1.method1708();
			this.anIntArray127 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray127[local25] = arg1.method1704();
			}
			for (local50 = 0; local50 < local19; local50++) {
				this.anIntArray127[local50] = (arg1.method1704() << 16) + this.anIntArray127[local50];
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ne;IB)Lclient!ne;", line = 170)
	public Class2_Sub2_Sub12_Sub4 method518(@OriginalArg(0) Class2_Sub2_Sub12_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray124[arg1];
		@Pc(16) Class2_Sub2_Sub14 local16 = Static38.method754(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg0.method1147(true);
		} else {
			@Pc(39) Class2_Sub2_Sub12_Sub4 local39 = arg0.method1147(!local16.method1403(local20));
			local39.method1134(local16, local20);
			return local39;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!f;ILclient!ne;IZ)Lclient!ne;", line = 191)
	public Class2_Sub2_Sub12_Sub4 method519(@OriginalArg(0) Class2_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub12_Sub4 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anIntArray124[arg3];
		@Pc(14) Class2_Sub2_Sub14 local14 = Static38.method754(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method526(arg2, arg1);
		}
		@Pc(31) int local31 = arg0.anIntArray124[arg1];
		@Pc(37) Class2_Sub2_Sub14 local37 = Static38.method754(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class2_Sub2_Sub12_Sub4 local54;
		if (local37 == null) {
			local54 = arg2.method1142(!local14.method1403(local18));
			local54.method1134(local14, local18);
			return local54;
		} else {
			local54 = arg2.method1142(!local14.method1403(local18) & !local37.method1403(local41));
			local54.method1159(local14, local18, local37, local41, this.anIntArray125);
			return local54;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ne;IBI)Lclient!ne;", line = 287)
	public Class2_Sub2_Sub12_Sub4 method521(@OriginalArg(0) Class2_Sub2_Sub12_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray124[arg1];
		@Pc(12) Class2_Sub2_Sub14 local12 = Static38.method754(local6 >> 16);
		@Pc(16) int local16 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg0.method1142(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(43) Class2_Sub2_Sub12_Sub4 local43 = arg0.method1142(!local12.method1403(local16));
		if (local30 == 1) {
			local43.method1146();
		} else if (local30 == 2) {
			local43.method1149();
		} else if (local30 == 3) {
			local43.method1148();
		}
		local43.method1134(local12, local16);
		if (local30 == 1) {
			local43.method1148();
		} else if (local30 == 2) {
			local43.method1149();
		} else if (local30 == 3) {
			local43.method1146();
		}
		return local43;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V", line = 341)
	public void method522() {
		if (this.anInt663 == -1) {
			if (this.anIntArray125 == null) {
				this.anInt663 = 0;
			} else {
				this.anInt663 = 2;
			}
		}
		if (this.anInt666 != -1) {
			return;
		}
		if (this.anIntArray125 == null) {
			this.anInt666 = 0;
		} else {
			this.anInt666 = 2;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!eb;)V", line = 373)
	public void method523(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1708();
			if (local5 == 0) {
				return;
			}
			this.method517(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ne;I)Lclient!ne;", line = 467)
	public Class2_Sub2_Sub12_Sub4 method526(@OriginalArg(1) Class2_Sub2_Sub12_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray124[arg1];
		@Pc(22) Class2_Sub2_Sub14 local22 = Static38.method754(local16 >> 16);
		@Pc(26) int local26 = local16 & 0xFFFF;
		if (local22 == null) {
			return arg0.method1142(true);
		} else {
			@Pc(43) Class2_Sub2_Sub12_Sub4 local43 = arg0.method1142(!local22.method1403(local26));
			local43.method1134(local22, local26);
			return local43;
		}
	}
}
