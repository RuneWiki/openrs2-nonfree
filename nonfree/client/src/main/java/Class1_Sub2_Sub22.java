import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "[I")
	public int[] anIntArray345;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "I")
	public int anInt3996 = 2;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public int anInt4005 = -1;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	public int anInt3999 = -1;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "I")
	public int anInt3994 = 5;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	public int anInt4003 = -1;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
	public int anInt4008 = -1;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "I")
	public int anInt3993 = 99;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
	public int anInt4002 = -1;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!lg;)Lclient!lg;")
	public Class5_Sub1 method3072(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray346[arg0];
		@Pc(16) Class1_Sub2_Sub25 local16 = Static14.method311(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg1.method153(true);
		} else {
			@Pc(42) Class5_Sub1 local42 = arg1.method153(!local16.method3560(local20));
			local42.method170(local16, local20);
			return local42;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!lg;IILclient!td;I)Lclient!lg;")
	public Class5_Sub1 method3074(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub22 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray346[arg1];
		@Pc(14) Class1_Sub2_Sub25 local14 = Static14.method311(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method3072(arg3, arg0);
		}
		@Pc(31) int local31 = arg2.anIntArray346[arg3];
		@Pc(37) Class1_Sub2_Sub25 local37 = Static14.method311(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class5_Sub1 local54;
		if (local37 == null) {
			local54 = arg0.method153(!local14.method3560(local18));
			local54.method170(local14, local18);
			return local54;
		} else {
			local54 = arg0.method153(!local14.method3560(local18) & !local37.method3560(local41));
			local54.method169(local14, local18, local37, local41, this.anIntArray343);
			return local54;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public void method3075() {
		if (this.anInt4003 == -1) {
			if (this.anIntArray343 == null) {
				this.anInt4003 = 0;
			} else {
				this.anInt4003 = 2;
			}
		}
		if (this.anInt4008 != -1) {
			return;
		}
		if (this.anIntArray343 == null) {
			this.anInt4008 = 0;
		} else {
			this.anInt4008 = 2;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IILclient!lg;)Lclient!lg;")
	public Class5_Sub1 method3076(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray346[arg0];
		@Pc(14) Class1_Sub2_Sub25 local14 = Static14.method311(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method162(true);
		} else {
			@Pc(35) Class5_Sub1 local35 = arg1.method162(!local14.method3560(local18));
			local35.method170(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!fj;I)V")
	private void method3077(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(137) int local137;
		if (arg1 == 1) {
			local22 = arg0.method2765();
			this.anIntArray344 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray344[local30] = arg0.method2765();
			}
			this.anIntArray346 = new int[local22];
			for (local137 = 0; local137 < local22; local137++) {
				this.anIntArray346[local137] = arg0.method2765();
			}
			for (@Pc(257) int local257 = 0; local257 < local22; local257++) {
				this.anIntArray346[local257] = (arg0.method2765() << 16) + this.anIntArray346[local257];
			}
		} else if (arg1 == 2) {
			this.anInt4005 = arg0.method2765();
		} else if (arg1 == 3) {
			local22 = arg0.method2771();
			this.anIntArray343 = new int[local22 + 1];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray343[local30] = arg0.method2771();
			}
			this.anIntArray343[local22] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean187 = true;
		} else if (arg1 == 5) {
			this.anInt3994 = arg0.method2771();
		} else if (arg1 == 6) {
			this.anInt3999 = arg0.method2765();
		} else if (arg1 == 7) {
			this.anInt4002 = arg0.method2765();
		} else if (arg1 == 8) {
			this.anInt3993 = arg0.method2771();
		} else if (arg1 == 9) {
			this.anInt4003 = arg0.method2771();
		} else if (arg1 == 10) {
			this.anInt4008 = arg0.method2771();
		} else if (arg1 == 11) {
			this.anInt3996 = arg0.method2771();
		} else if (arg1 == 12) {
			local22 = arg0.method2771();
			this.anIntArray342 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray342[local30] = arg0.method2765();
			}
			for (local137 = 0; local137 < local22; local137++) {
				this.anIntArray342[local137] += arg0.method2765() << 16;
			}
			return;
		} else if (arg1 == 13) {
			local22 = arg0.method2771();
			this.anIntArray345 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray345[local30] = arg0.method2745();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!fj;)V")
	public void method3078(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2771();
			if (local7 == 0) {
				return;
			}
			this.method3077(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IILclient!lg;)Lclient!lg;")
	public Class5_Sub1 method3079(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray346[arg0];
		@Pc(14) Class1_Sub2_Sub25 local14 = Static14.method311(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method153(true);
		}
		@Pc(26) Class1_Sub2_Sub25 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray342 != null && this.anIntArray342.length > arg0) {
			local28 = this.anIntArray342[arg0];
			local26 = Static14.method311(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(67) Class5_Sub1 local67;
		if (local26 == null || local28 == 65535) {
			local67 = arg1.method153(!local14.method3560(local18));
			local67.method170(local14, local18);
			return local67;
		} else {
			local67 = arg1.method153(!local14.method3560(local18) & !local26.method3560(local28));
			local67.method170(local14, local18);
			local67.method170(local26, local28);
			return local67;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!lg;II)Lclient!lg;")
	public Class5_Sub1 method3080(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = this.anIntArray346[arg2];
		@Pc(17) Class1_Sub2_Sub25 local17 = Static14.method311(local11 >> 16);
		@Pc(25) int local25 = local11 & 0xFFFF;
		if (local17 == null) {
			return arg1.method153(true);
		}
		@Pc(35) int local35 = arg0 & 0x3;
		@Pc(46) Class5_Sub1 local46 = arg1.method153(!local17.method3560(local25));
		if (local35 == 1) {
			local46.method159();
		} else if (local35 == 2) {
			local46.method157();
		} else if (local35 == 3) {
			local46.method168();
		}
		local46.method170(local17, local25);
		if (local35 == 1) {
			local46.method168();
		} else if (local35 == 2) {
			local46.method157();
		} else if (local35 == 3) {
			local46.method159();
		}
		return local46;
	}
}
