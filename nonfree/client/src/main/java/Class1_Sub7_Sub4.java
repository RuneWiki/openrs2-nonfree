import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class1_Sub7_Sub4 extends Class1_Sub7 {

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Lclient!jo;")
	public Class96 aClass96_21 = new Class96();

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "Lclient!qd;")
	public Class1_Sub7_Sub3 aClass1_Sub7_Sub3_2 = new Class1_Sub7_Sub3();

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "Lclient!lm;")
	private Class1_Sub7_Sub2 aClass1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!lm;)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub7_Sub2 arg0) {
		this.aClass1_Sub7_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!ja;I)V")
	private void method3729(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub7_Sub2_2.anIntArray279[arg0.anInt2475] & 0x4) != 0 && arg0.anInt2476 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub7_Sub2_2.anIntArray283[arg0.anInt2475] / Static69.anInt1498;
			@Pc(37) int local37 = (local27 + 1048575 - arg0.anInt2480) / local27;
			arg0.anInt2480 = arg1 * local27 + arg0.anInt2480 & 0xFFFFF;
			if (arg1 >= local37) {
				if (this.aClass1_Sub7_Sub2_2.anIntArray280[arg0.anInt2475] == 0) {
					arg0.aClass1_Sub7_Sub1_1 = Static316.method831(arg0.aClass1_Sub23_Sub1_1, arg0.aClass1_Sub7_Sub1_1.method848(), arg0.aClass1_Sub7_Sub1_1.method836(), arg0.aClass1_Sub7_Sub1_1.method815());
				} else {
					arg0.aClass1_Sub7_Sub1_1 = Static316.method831(arg0.aClass1_Sub23_Sub1_1, arg0.aClass1_Sub7_Sub1_1.method848(), 0, arg0.aClass1_Sub7_Sub1_1.method815());
					this.aClass1_Sub7_Sub2_2.method2765(arg0.aClass1_Sub3_1.aShortArray1[arg0.anInt2491] < 0, arg0);
				}
				if (arg0.aClass1_Sub3_1.aShortArray1[arg0.anInt2491] < 0) {
					arg0.aClass1_Sub7_Sub1_1.method825(-1);
				}
				arg1 = arg0.anInt2480 / local27;
			}
		}
		arg0.aClass1_Sub7_Sub1_1.method3726(arg1);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()Lclient!ro;")
	@Override
	public Class1_Sub7 method3724() {
		@Pc(9) Class1_Sub14 local9 = (Class1_Sub14) this.aClass96_21.method2340();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub7_Sub1_1 == null) {
			return this.method3722();
		} else {
			return local9.aClass1_Sub7_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	@Override
	public void method3726(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_Sub3_2.method3726(arg0);
		for (@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) this.aClass96_21.method2340(); local15 != null; local15 = (Class1_Sub14) this.aClass96_21.method2342()) {
			if (!this.aClass1_Sub7_Sub2_2.method2774(local15)) {
				@Pc(26) int local26 = arg0;
				do {
					if (local26 <= local15.anInt2477) {
						this.method3729(local15, local26);
						local15.anInt2477 -= local26;
						break;
					}
					this.method3729(local15, local15.anInt2477);
					local26 -= local15.anInt2477;
				} while (!this.aClass1_Sub7_Sub2_2.method2769(null, 0, local26, local15));
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII[ILclient!ja;)V")
	private void method3730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class1_Sub14 arg4) {
		if ((this.aClass1_Sub7_Sub2_2.anIntArray279[arg4.anInt2475] & 0x4) != 0 && arg4.anInt2476 < 0) {
			@Pc(32) int local32 = this.aClass1_Sub7_Sub2_2.anIntArray283[arg4.anInt2475] / Static69.anInt1498;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg4.anInt2480) / local32;
				if (arg0 < local42) {
					arg4.anInt2480 += local32 * arg0;
					break;
				}
				arg4.aClass1_Sub7_Sub1_1.method3725(arg3, arg2, local42);
				@Pc(55) int local55 = Static69.anInt1498 / 100;
				arg0 -= local42;
				arg4.anInt2480 += local42 * local32 - 1048576;
				arg2 += local42;
				@Pc(77) int local77 = 262144 / local32;
				if (local77 < local55) {
					local55 = local77;
				}
				@Pc(85) Class1_Sub7_Sub1 local85 = arg4.aClass1_Sub7_Sub1_1;
				if (this.aClass1_Sub7_Sub2_2.anIntArray280[arg4.anInt2475] == 0) {
					arg4.aClass1_Sub7_Sub1_1 = Static316.method831(arg4.aClass1_Sub23_Sub1_1, local85.method848(), local85.method836(), local85.method815());
				} else {
					arg4.aClass1_Sub7_Sub1_1 = Static316.method831(arg4.aClass1_Sub23_Sub1_1, local85.method848(), 0, local85.method815());
					this.aClass1_Sub7_Sub2_2.method2765(arg4.aClass1_Sub3_1.aShortArray1[arg4.anInt2491] < 0, arg4);
					arg4.aClass1_Sub7_Sub1_1.method842(local55, local85.method836());
				}
				if (arg4.aClass1_Sub3_1.aShortArray1[arg4.anInt2491] < 0) {
					arg4.aClass1_Sub7_Sub1_1.method825(-1);
				}
				local85.method823(local55);
				local85.method3725(arg3, arg2, arg1 - arg2);
				if (local85.method819()) {
					this.aClass1_Sub7_Sub3_2.method3615(local85);
				}
			}
		}
		arg4.aClass1_Sub7_Sub1_1.method3725(arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()Lclient!ro;")
	@Override
	public Class1_Sub7 method3722() {
		@Pc(9) Class1_Sub14 local9;
		do {
			local9 = (Class1_Sub14) this.aClass96_21.method2342();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub7_Sub1_1 == null);
		return local9.aClass1_Sub7_Sub1_1;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()I")
	@Override
	public int method3728() {
		return 0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([III)V")
	@Override
	public void method3725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub7_Sub3_2.method3725(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub14 local17 = (Class1_Sub14) this.aClass96_21.method2340(); local17 != null; local17 = (Class1_Sub14) this.aClass96_21.method2342()) {
			if (!this.aClass1_Sub7_Sub2_2.method2774(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2477 >= local29) {
						this.method3730(local29, local29 + local27, local27, arg0, local17);
						local17.anInt2477 -= local29;
						break;
					}
					this.method3730(local17.anInt2477, local29 + local27, local27, arg0, local17);
					local29 -= local17.anInt2477;
					local27 += local17.anInt2477;
				} while (!this.aClass1_Sub7_Sub2_2.method2769(arg0, local27, local29, local17));
			}
		}
	}
}
