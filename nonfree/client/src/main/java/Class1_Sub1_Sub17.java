import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!re", name = "F", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!re", name = "jb", descriptor = "[I")
	public int[] anIntArray370;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "I")
	public int anInt3864 = 99;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public int anInt3862 = 5;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public int anInt3860 = -1;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
	public int anInt3867 = -1;

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!re", name = "db", descriptor = "I")
	public int anInt3868 = -1;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
	public int anInt3869 = -1;

	@OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
	public int anInt3876 = -1;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "I")
	public int anInt3856 = 2;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!je;I)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2878(@OriginalArg(1) Class1_Sub1_Sub4_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray365[arg1];
		@Pc(14) Class1_Sub1_Sub10 local14 = Static171.method3409(local4 >> 16);
		@Pc(25) int local25 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method724(true);
		} else {
			@Pc(42) Class1_Sub1_Sub4_Sub1 local42 = arg0.method724(!local14.method1805(local25));
			local42.method718(local14, local25);
			return local42;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BILclient!fa;)V")
	private void method2879(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(145) int local145;
		if (arg0 == 1) {
			local27 = arg1.method1280();
			this.anIntArray370 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray370[local35] = arg1.method1280();
			}
			this.anIntArray365 = new int[local27];
			for (local145 = 0; local145 < local27; local145++) {
				this.anIntArray365[local145] = arg1.method1280();
			}
			for (@Pc(273) int local273 = 0; local273 < local27; local273++) {
				this.anIntArray365[local273] += arg1.method1280() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3869 = arg1.method1280();
		} else if (arg0 == 3) {
			local27 = arg1.method1234();
			this.anIntArray367 = new int[local27 + 1];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray367[local35] = arg1.method1234();
			}
			this.anIntArray367[local27] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean144 = true;
		} else if (arg0 == 5) {
			this.anInt3862 = arg1.method1234();
		} else if (arg0 == 6) {
			this.anInt3868 = arg1.method1280();
		} else if (arg0 == 7) {
			this.anInt3867 = arg1.method1280();
		} else if (arg0 == 8) {
			this.anInt3864 = arg1.method1234();
		} else if (arg0 == 9) {
			this.anInt3876 = arg1.method1234();
		} else if (arg0 == 10) {
			this.anInt3860 = arg1.method1234();
		} else if (arg0 == 11) {
			this.anInt3856 = arg1.method1234();
		} else if (arg0 == 12) {
			local27 = arg1.method1234();
			this.anIntArray368 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray368[local35] = arg1.method1280();
			}
			for (local145 = 0; local145 < local27; local145++) {
				this.anIntArray368[local145] += arg1.method1280() << 16;
			}
		} else if (arg0 == 13) {
			local27 = arg1.method1234();
			this.anIntArray369 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray369[local35] = arg1.method1230();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!je;IBI)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2880(@OriginalArg(0) Class1_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray365[arg1];
		@Pc(16) Class1_Sub1_Sub10 local16 = Static171.method3409(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method733(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(43) Class1_Sub1_Sub4_Sub1 local43 = arg0.method733(!local16.method1805(local20));
		if (local30 == 1) {
			local43.method727();
		} else if (local30 == 2) {
			local43.method730();
		} else if (local30 == 3) {
			local43.method726();
		}
		local43.method718(local16, local20);
		if (local30 == 1) {
			local43.method726();
		} else if (local30 == 2) {
			local43.method730();
		} else if (local30 == 3) {
			local43.method727();
		}
		return local43;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!re;Lclient!je;II)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2881(@OriginalArg(1) Class1_Sub1_Sub17 arg0, @OriginalArg(2) Class1_Sub1_Sub4_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray365[arg3];
		@Pc(14) Class1_Sub1_Sub10 local14 = Static171.method3409(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2886(arg2, arg1);
		}
		@Pc(36) int local36 = arg0.anIntArray365[arg2];
		@Pc(42) Class1_Sub1_Sub10 local42 = Static171.method3409(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class1_Sub1_Sub4_Sub1 local59;
		if (local42 == null) {
			local59 = arg1.method733(!local14.method1805(local18));
			local59.method718(local14, local18);
			return local59;
		} else {
			local59 = arg1.method733(!local14.method1805(local18) & !local42.method1805(local46));
			local59.method732(local14, local18, local42, local46, this.anIntArray367);
			return local59;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!fa;Z)V")
	public void method2882(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method1234();
			if (local18 == 0) {
				return;
			}
			this.method2879(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public void method2885() {
		if (this.anInt3860 == -1) {
			if (this.anIntArray367 == null) {
				this.anInt3860 = 0;
			} else {
				this.anInt3860 = 2;
			}
		}
		if (this.anInt3876 != -1) {
			return;
		}
		if (this.anIntArray367 == null) {
			this.anInt3876 = 0;
		} else {
			this.anInt3876 = 2;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!je;)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2886(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub4_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray365[arg0];
		@Pc(14) Class1_Sub1_Sub10 local14 = Static171.method3409(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method733(true);
		} else {
			@Pc(40) Class1_Sub1_Sub4_Sub1 local40 = arg1.method733(!local14.method1805(local18));
			local40.method718(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!je;II)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2888(@OriginalArg(0) Class1_Sub1_Sub4_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray365[arg1];
		@Pc(14) Class1_Sub1_Sub10 local14 = Static171.method3409(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method733(true);
		}
		@Pc(26) Class1_Sub1_Sub10 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray368 != null && this.anIntArray368.length > arg1) {
			local28 = this.anIntArray368[arg1];
			local26 = Static171.method3409(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(69) Class1_Sub1_Sub4_Sub1 local69;
		if (local26 == null || local28 == 65535) {
			local69 = arg0.method733(!local14.method1805(local18));
			local69.method718(local14, local18);
			return local69;
		} else {
			local69 = arg0.method733(!local14.method1805(local18) & !local26.method1805(local28));
			local69.method718(local14, local18);
			local69.method718(local26, local28);
			return local69;
		}
	}
}
