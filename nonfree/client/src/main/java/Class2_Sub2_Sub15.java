import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "[I")
	public int[] anIntArray547;

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!tc", name = "xb", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
	public int anInt3730 = 5;

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
	public int anInt3731 = -1;

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
	public int anInt3727 = -1;

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
	public int anInt3736 = -1;

	@OriginalMember(owner = "client!tc", name = "wb", descriptor = "I")
	public int anInt3743 = -1;

	@OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
	public int anInt3742 = -1;

	@OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
	public int anInt3732 = 99;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	public int anInt3724 = 2;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!cd;I)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2587(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray548[arg0];
		@Pc(14) Class2_Sub2_Sub14 local14 = Static16.method343(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method582(true);
		}
		@Pc(26) Class2_Sub2_Sub14 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray546 != null && this.anIntArray546.length > arg0) {
			local28 = this.anIntArray546[arg0];
			local26 = Static16.method343(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(73) Class2_Sub2_Sub1_Sub2 local73;
		if (local26 == null || local28 == 65535) {
			local73 = arg1.method582(!local14.method1558(local18));
			local73.method590(local14, local18);
			return local73;
		} else {
			local73 = arg1.method582(!local14.method1558(local18) & !local26.method1558(local28));
			local73.method590(local14, local18);
			local73.method590(local26, local28);
			return local73;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILclient!cd;I)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2588(@OriginalArg(1) Class2_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray548[arg1];
		@Pc(14) Class2_Sub2_Sub14 local14 = Static16.method343(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method587(true);
		} else {
			@Pc(43) Class2_Sub2_Sub1_Sub2 local43 = arg0.method587(!local14.method1558(local18));
			local43.method590(local14, local18);
			return local43;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!cd;IILclient!tc;I)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2589(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub15 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray548[arg3];
		@Pc(10) Class2_Sub2_Sub14 local10 = Static16.method343(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg2.method2596(arg1, arg0);
		}
		@Pc(31) int local31 = arg2.anIntArray548[arg1];
		@Pc(37) Class2_Sub2_Sub14 local37 = Static16.method343(local31 >> 16);
		@Pc(50) int local50 = local31 & 0xFFFF;
		@Pc(65) Class2_Sub2_Sub1_Sub2 local65;
		if (local37 == null) {
			local65 = arg0.method582(!local10.method1558(local14));
			local65.method590(local10, local14);
			return local65;
		} else {
			local65 = arg0.method582(!local10.method1558(local14) & !local37.method1558(local50));
			local65.method596(local10, local14, local37, local50, this.anIntArray545);
			return local65;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!cd;BII)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2590(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray548[arg2];
		@Pc(16) Class2_Sub2_Sub14 local16 = Static16.method343(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method582(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class2_Sub2_Sub1_Sub2 local41 = arg0.method582(!local16.method1558(local20));
		if (local30 == 1) {
			local41.method589();
		} else if (local30 == 2) {
			local41.method594();
		} else if (local30 == 3) {
			local41.method586();
		}
		local41.method590(local16, local20);
		if (local30 == 1) {
			local41.method586();
		} else if (local30 == 2) {
			local41.method594();
		} else if (local30 == 3) {
			local41.method589();
		}
		return local41;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILclient!oa;)V")
	private void method2591(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(44) int local44;
		if (arg0 == 1) {
			local16 = arg1.method2353();
			this.anIntArray549 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray549[local22] = arg1.method2353();
			}
			this.anIntArray548 = new int[local16];
			for (local44 = 0; local44 < local16; local44++) {
				this.anIntArray548[local44] = arg1.method2353();
			}
			for (@Pc(58) int local58 = 0; local58 < local16; local58++) {
				this.anIntArray548[local58] = (arg1.method2353() << 16) + this.anIntArray548[local58];
			}
		} else if (arg0 == 2) {
			this.anInt3736 = arg1.method2353();
		} else if (arg0 == 3) {
			local16 = arg1.method2387();
			this.anIntArray545 = new int[local16 + 1];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray545[local22] = arg1.method2387();
			}
			this.anIntArray545[local16] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean151 = true;
		} else if (arg0 == 5) {
			this.anInt3730 = arg1.method2387();
		} else if (arg0 == 6) {
			this.anInt3742 = arg1.method2353();
		} else if (arg0 == 7) {
			this.anInt3743 = arg1.method2353();
		} else if (arg0 == 8) {
			this.anInt3732 = arg1.method2387();
		} else if (arg0 == 9) {
			this.anInt3727 = arg1.method2387();
		} else if (arg0 == 10) {
			this.anInt3731 = arg1.method2387();
		} else if (arg0 == 11) {
			this.anInt3724 = arg1.method2387();
		} else if (arg0 == 12) {
			local16 = arg1.method2387();
			this.anIntArray546 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray546[local22] = arg1.method2353();
			}
			for (local44 = 0; local44 < local16; local44++) {
				this.anIntArray546[local44] += arg1.method2353() << 16;
			}
		} else if (arg0 == 13) {
			local16 = arg1.method2387();
			this.anIntArray547 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray547[local22] = arg1.method2341();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public void method2592() {
		if (this.anInt3731 == -1) {
			if (this.anIntArray545 == null) {
				this.anInt3731 = 0;
			} else {
				this.anInt3731 = 2;
			}
		}
		if (this.anInt3727 != -1) {
			return;
		}
		if (this.anIntArray545 == null) {
			this.anInt3727 = 0;
		} else {
			this.anInt3727 = 2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!oa;)V")
	public void method2593(@OriginalArg(1) Class2_Sub18 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2387();
			if (local7 == 0) {
				return;
			}
			this.method2591(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!cd;)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method2596(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub1_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray548[arg0];
		@Pc(14) Class2_Sub2_Sub14 local14 = Static16.method343(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method582(true);
		} else {
			@Pc(40) Class2_Sub2_Sub1_Sub2 local40 = arg1.method582(!local14.method1558(local18));
			local40.method590(local14, local18);
			return local40;
		}
	}
}
