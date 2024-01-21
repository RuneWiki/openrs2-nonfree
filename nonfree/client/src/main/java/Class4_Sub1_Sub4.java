import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
	public int anInt540 = -1;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
	public int anInt547 = -1;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
	public int anInt539 = -1;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	public int anInt542 = 2;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
	public int anInt544 = 5;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
	public int anInt545 = 99;

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
	public int anInt549 = -1;

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
	public int anInt552 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!dg;II)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method343(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anIntArray52[arg0];
		@Pc(16) Class4_Sub1_Sub6 local16 = Static24.method396(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg1.method2833(true);
		}
		@Pc(37) Class4_Sub1_Sub1_Sub4 local37 = arg1.method2833(!local16.method729(local20));
		@Pc(41) int local41 = arg2 & 0x3;
		if (local41 == 1) {
			local37.method2838();
		} else if (local41 == 2) {
			local37.method2836();
		} else if (local41 == 3) {
			local37.method2839();
		}
		local37.method2832(local16, local20);
		if (local41 == 1) {
			local37.method2839();
		} else if (local41 == 2) {
			local37.method2836();
		} else if (local41 == 3) {
			local37.method2838();
		}
		return local37;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!dg;I)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method344(@OriginalArg(1) Class4_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray52[arg1];
		@Pc(14) Class4_Sub1_Sub6 local14 = Static24.method396(local4 >> 16);
		@Pc(27) int local27 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2833(true);
		} else {
			@Pc(44) Class4_Sub1_Sub1_Sub4 local44 = arg0.method2833(!local14.method729(local27));
			local44.method2832(local14, local27);
			return local44;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!h;)V")
	public void method345(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1253();
			if (local5 == 0) {
				return;
			}
			this.method350(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(ILclient!dg;I)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method346(@OriginalArg(1) Class4_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray52[arg1];
		@Pc(14) Class4_Sub1_Sub6 local14 = Static24.method396(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2828(true);
		} else {
			@Pc(35) Class4_Sub1_Sub1_Sub4 local35 = arg0.method2828(!local14.method729(local18));
			local35.method2832(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ca;IILclient!dg;I)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method348(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub1_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray52[arg1];
		@Pc(14) Class4_Sub1_Sub6 local14 = Static24.method396(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method344(arg2, arg3);
		}
		@Pc(31) int local31 = arg0.anIntArray52[arg3];
		@Pc(37) Class4_Sub1_Sub6 local37 = Static24.method396(local31 >> 16);
		@Pc(46) int local46 = local31 & 0xFFFF;
		@Pc(59) Class4_Sub1_Sub1_Sub4 local59;
		if (local37 == null) {
			local59 = arg2.method2833(!local14.method729(local18));
			local59.method2832(local14, local18);
			return local59;
		} else {
			local59 = arg2.method2833(!local14.method729(local18) & !local37.method729(local46));
			local59.method2837(local14, local18, local37, local46, this.anIntArray51);
			return local59;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILclient!dg;)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method349(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub4 arg1) {
		@Pc(8) int local8 = this.anIntArray52[arg0];
		@Pc(14) Class4_Sub1_Sub6 local14 = Static24.method396(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2833(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class4_Sub1_Sub6 local28 = null;
		if (this.anIntArray54 != null && this.anIntArray54.length > arg0) {
			local26 = this.anIntArray54[arg0];
			local28 = Static24.method396(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(69) Class4_Sub1_Sub1_Sub4 local69;
		if (local28 == null || local26 == 65535) {
			local69 = arg1.method2833(!local14.method729(local18));
			local69.method2832(local14, local18);
			return local69;
		} else {
			local69 = arg1.method2833(!local14.method729(local18) & !local28.method729(local26));
			local69.method2832(local14, local18);
			local69.method2832(local28, local26);
			return local69;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!h;I)V")
	private void method350(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(171) int local171;
		if (arg1 == 1) {
			local27 = arg0.method1252();
			this.anIntArray50 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray50[local35] = arg0.method1252();
			}
			this.anIntArray52 = new int[local27];
			for (local171 = 0; local171 < local27; local171++) {
				this.anIntArray52[local171] = arg0.method1252();
			}
			for (@Pc(286) int local286 = 0; local286 < local27; local286++) {
				this.anIntArray52[local286] = (arg0.method1252() << 16) + this.anIntArray52[local286];
			}
		} else if (arg1 == 2) {
			this.anInt547 = arg0.method1252();
		} else if (arg1 == 3) {
			local27 = arg0.method1253();
			this.anIntArray51 = new int[local27 + 1];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray51[local35] = arg0.method1253();
			}
			this.anIntArray51[local27] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean26 = true;
		} else if (arg1 == 5) {
			this.anInt544 = arg0.method1253();
		} else if (arg1 == 6) {
			this.anInt552 = arg0.method1252();
		} else if (arg1 == 7) {
			this.anInt549 = arg0.method1252();
		} else if (arg1 == 8) {
			this.anInt545 = arg0.method1253();
		} else if (arg1 == 9) {
			this.anInt540 = arg0.method1253();
		} else if (arg1 == 10) {
			this.anInt539 = arg0.method1253();
		} else if (arg1 == 11) {
			this.anInt542 = arg0.method1253();
		} else if (arg1 == 12) {
			local27 = arg0.method1253();
			this.anIntArray54 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray54[local35] = arg0.method1252();
			}
			for (local171 = 0; local171 < local27; local171++) {
				this.anIntArray54[local171] += arg0.method1252() << 16;
			}
		} else if (arg1 == 13) {
			local27 = arg0.method1253();
			this.anIntArray53 = new int[local27];
			for (local35 = 0; local35 < local27; local35++) {
				this.anIntArray53[local35] = arg0.method1225();
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
	public void method351() {
		if (this.anInt539 == -1) {
			if (this.anIntArray51 == null) {
				this.anInt539 = 0;
			} else {
				this.anInt539 = 2;
			}
		}
		if (this.anInt540 != -1) {
			return;
		}
		if (this.anIntArray51 == null) {
			this.anInt540 = 0;
		} else {
			this.anInt540 = 2;
		}
	}
}
