import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class4_Sub4_Sub9 extends Class4_Sub4 {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	public int anInt1558 = -1;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	public int anInt1552 = 5;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	public int anInt1562 = 99;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	public int anInt1560 = -1;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	public int anInt1563 = 2;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
	public int anInt1561 = -1;

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
	public int anInt1569 = -1;

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
	public int anInt1570 = -1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!kc;Lclient!u;ZI)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1027(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub9 arg1, @OriginalArg(2) Class4_Sub4_Sub3_Sub7 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray196[arg3];
		@Pc(14) Class4_Sub4_Sub17 local14 = Static88.method1466(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1035(arg0, arg2);
		}
		@Pc(31) int local31 = arg1.anIntArray196[arg0];
		@Pc(37) Class4_Sub4_Sub17 local37 = Static88.method1466(local31 >> 16);
		@Pc(47) int local47 = local31 & 0xFFFF;
		@Pc(60) Class4_Sub4_Sub3_Sub7 local60;
		if (local37 == null) {
			local60 = arg2.method1771(!local14.method1948(local18));
			local60.method1776(local14, local18);
			return local60;
		} else {
			local60 = arg2.method1771(!local14.method1948(local18) & !local37.method1948(local47));
			local60.method1779(local14, local18, local37, local47, this.anIntArray199);
			return local60;
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	public void method1028() {
		if (this.anInt1570 == -1) {
			if (this.anIntArray199 == null) {
				this.anInt1570 = 0;
			} else {
				this.anInt1570 = 2;
			}
		}
		if (this.anInt1560 != -1) {
			return;
		}
		if (this.anIntArray199 == null) {
			this.anInt1560 = 0;
		} else {
			this.anInt1560 = 2;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ne;I)V")
	public void method1029(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method599();
			if (local14 == 0) {
				return;
			}
			this.method1039(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!u;)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1032(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub4_Sub3_Sub7 arg1) {
		@Pc(8) int local8 = this.anIntArray196[arg0];
		@Pc(14) Class4_Sub4_Sub17 local14 = Static88.method1466(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1771(true);
		}
		@Pc(26) Class4_Sub4_Sub17 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray197 != null && this.anIntArray197.length > arg0) {
			local28 = this.anIntArray197[arg0];
			local26 = Static88.method1466(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(74) Class4_Sub4_Sub3_Sub7 local74;
		if (local26 == null || local28 == 65535) {
			local74 = arg1.method1771(!local14.method1948(local18));
			local74.method1776(local14, local18);
			return local74;
		} else {
			local74 = arg1.method1771(!local14.method1948(local18) & !local26.method1948(local28));
			local74.method1776(local14, local18);
			local74.method1776(local26, local28);
			return local74;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!u;II)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1033(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub3_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anIntArray196[arg0];
		@Pc(16) Class4_Sub4_Sub17 local16 = Static88.method1466(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1771(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(41) Class4_Sub4_Sub3_Sub7 local41 = arg1.method1771(!local16.method1948(local20));
		if (local30 == 1) {
			local41.method1762();
		} else if (local30 == 2) {
			local41.method1761();
		} else if (local30 == 3) {
			local41.method1765();
		}
		local41.method1776(local16, local20);
		if (local30 == 1) {
			local41.method1765();
		} else if (local30 == 2) {
			local41.method1761();
		} else if (local30 == 3) {
			local41.method1762();
		}
		return local41;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IILclient!u;)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1035(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub4_Sub3_Sub7 arg1) {
		@Pc(4) int local4 = this.anIntArray196[arg0];
		@Pc(14) Class4_Sub4_Sub17 local14 = Static88.method1466(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1771(true);
		} else {
			@Pc(40) Class4_Sub4_Sub3_Sub7 local40 = arg1.method1771(!local14.method1948(local18));
			local40.method1776(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!u;II)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1037(@OriginalArg(0) Class4_Sub4_Sub3_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray196[arg1];
		@Pc(14) Class4_Sub4_Sub17 local14 = Static88.method1466(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1777(true);
		} else {
			@Pc(40) Class4_Sub4_Sub3_Sub7 local40 = arg0.method1777(!local14.method1948(local18));
			local40.method1776(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!ne;I)V")
	private void method1039(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(41) int local41;
		if (arg1 == 1) {
			local12 = arg0.method604();
			this.anIntArray200 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray200[local18] = arg0.method604();
			}
			this.anIntArray196 = new int[local12];
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray196[local41] = arg0.method604();
			}
			for (@Pc(60) int local60 = 0; local60 < local12; local60++) {
				this.anIntArray196[local60] = (arg0.method604() << 16) + this.anIntArray196[local60];
			}
		} else if (arg1 == 2) {
			this.anInt1569 = arg0.method604();
		} else if (arg1 == 3) {
			local12 = arg0.method599();
			this.anIntArray199 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray199[local18] = arg0.method599();
			}
			this.anIntArray199[local12] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean98 = true;
		} else if (arg1 == 5) {
			this.anInt1552 = arg0.method599();
		} else if (arg1 == 6) {
			this.anInt1561 = arg0.method604();
		} else if (arg1 == 7) {
			this.anInt1558 = arg0.method604();
		} else if (arg1 == 8) {
			this.anInt1562 = arg0.method599();
		} else if (arg1 == 9) {
			this.anInt1560 = arg0.method599();
		} else if (arg1 == 10) {
			this.anInt1570 = arg0.method599();
		} else if (arg1 == 11) {
			this.anInt1563 = arg0.method599();
		} else if (arg1 == 12) {
			local12 = arg0.method599();
			this.anIntArray197 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray197[local18] = arg0.method604();
			}
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray197[local41] += arg0.method604() << 16;
			}
		} else if (arg1 == 13) {
			local12 = arg0.method599();
			this.anIntArray198 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray198[local18] = arg0.method572();
			}
		}
	}
}
