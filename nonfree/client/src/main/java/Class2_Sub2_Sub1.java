import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!of;")
	public final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Lclient!nc;")
	public final Class2_Sub2_Sub2 aClass2_Sub2_Sub2_1 = new Class2_Sub2_Sub2();

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Lclient!pd;")
	private final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class2_Sub2_Sub3 arg0) {
		this.aClass2_Sub2_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!qc;BII[I)V")
	private void method91(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass2_Sub2_Sub3_1.anIntArray291[arg1.anInt2431] & 0x4) != 0 && arg1.anInt2441 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub2_Sub3_1.anIntArray300[arg1.anInt2431] / Static35.anInt1167;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt2436) / local29;
				if (arg2 < local39) {
					arg1.anInt2436 += arg2 * local29;
					break;
				}
				arg1.aClass2_Sub2_Sub4_3.method1524(arg4, arg0, local39);
				arg1.anInt2436 += local39 * local29 - 1048576;
				@Pc(66) int local66 = Static35.anInt1167 / 100;
				arg0 += local39;
				arg2 -= local39;
				@Pc(78) int local78 = 262144 / local29;
				if (local66 > local78) {
					local66 = local78;
				}
				@Pc(90) Class2_Sub2_Sub4 local90 = arg1.aClass2_Sub2_Sub4_3;
				if (this.aClass2_Sub2_Sub3_1.anIntArray295[arg1.anInt2431] == 0) {
					arg1.aClass2_Sub2_Sub4_3 = Static133.method1560(arg1.aClass2_Sub16_Sub1_1, local90.method1552(), local90.method1539(), local90.method1553());
				} else {
					arg1.aClass2_Sub2_Sub4_3 = Static133.method1560(arg1.aClass2_Sub16_Sub1_1, local90.method1552(), 0, local90.method1553());
					this.aClass2_Sub2_Sub3_1.method1374(arg1.aClass2_Sub13_1.aShortArray10[arg1.anInt2437] < 0, arg1);
					arg1.aClass2_Sub2_Sub4_3.method1530(local66, local90.method1539());
				}
				if (arg1.aClass2_Sub13_1.aShortArray10[arg1.anInt2437] < 0) {
					arg1.aClass2_Sub2_Sub4_3.method1551(-1);
				}
				local90.method1533(local66);
				local90.method1524(arg4, arg0, arg3 - arg0);
				if (local90.method1540()) {
					this.aClass2_Sub2_Sub2_1.method1231(local90);
				}
			}
		}
		arg1.aClass2_Sub2_Sub4_3.method1524(arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V")
	@Override
	public void method1524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_Sub2_1.method1524(arg0, arg1, arg2);
		@Pc(16) int local16 = arg1 + arg2;
		for (@Pc(22) Class2_Sub15 local22 = (Class2_Sub15) this.aClass58_1.method1285(); local22 != null; local22 = (Class2_Sub15) this.aClass58_1.method1281()) {
			if (!this.aClass2_Sub2_Sub3_1.method1387(local22)) {
				@Pc(32) int local32 = arg2;
				@Pc(34) int local34 = arg1;
				do {
					if (local32 <= local22.anInt2448) {
						this.method91(local34, local22, local32, local16, arg0);
						local22.anInt2448 -= local32;
						break;
					}
					this.method91(local34, local22, local22.anInt2448, local16, arg0);
					local32 -= local22.anInt2448;
					local34 += local22.anInt2448;
				} while (!this.aClass2_Sub2_Sub3_1.method1376(local22));
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	@Override
	public void method1523(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) this.aClass58_1.method1285(); local11 != null; local11 = (Class2_Sub15) this.aClass58_1.method1281()) {
			if (!this.aClass2_Sub2_Sub3_1.method1387(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt2448) {
						this.method98(local11, local21);
						local11.anInt2448 -= local21;
						break;
					}
					this.method98(local11, local11.anInt2448);
					local21 -= local11.anInt2448;
				} while (!this.aClass2_Sub2_Sub3_1.method1376(local11));
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
	@Override
	public int method1520() {
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public Class2_Sub2 method1521() {
		@Pc(9) Class2_Sub15 local9 = (Class2_Sub15) this.aClass58_1.method1285();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub2_Sub4_3 == null) {
			return this.method1518();
		} else {
			return local9.aClass2_Sub2_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public Class2_Sub2 method1518() {
		@Pc(9) Class2_Sub15 local9;
		do {
			local9 = (Class2_Sub15) this.aClass58_1.method1281();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub2_Sub4_3 == null);
		return local9.aClass2_Sub2_Sub4_3;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!qc;II)V")
	private void method98(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub2_Sub3_1.anIntArray291[arg0.anInt2431] & 0x4) != 0 && arg0.anInt2441 < 0) {
			@Pc(20) int local20 = this.aClass2_Sub2_Sub3_1.anIntArray300[arg0.anInt2431] / Static35.anInt1167;
			@Pc(30) int local30 = (local20 + 1048575 - arg0.anInt2436) / local20;
			arg0.anInt2436 = arg1 * local20 + arg0.anInt2436 & 0xFFFFF;
			if (arg1 >= local30) {
				if (this.aClass2_Sub2_Sub3_1.anIntArray295[arg0.anInt2431] == 0) {
					arg0.aClass2_Sub2_Sub4_3 = Static133.method1560(arg0.aClass2_Sub16_Sub1_1, arg0.aClass2_Sub2_Sub4_3.method1552(), arg0.aClass2_Sub2_Sub4_3.method1539(), arg0.aClass2_Sub2_Sub4_3.method1553());
				} else {
					arg0.aClass2_Sub2_Sub4_3 = Static133.method1560(arg0.aClass2_Sub16_Sub1_1, arg0.aClass2_Sub2_Sub4_3.method1552(), 0, arg0.aClass2_Sub2_Sub4_3.method1553());
					this.aClass2_Sub2_Sub3_1.method1374(arg0.aClass2_Sub13_1.aShortArray10[arg0.anInt2437] < 0, arg0);
				}
				if (arg0.aClass2_Sub13_1.aShortArray10[arg0.anInt2437] < 0) {
					arg0.aClass2_Sub2_Sub4_3.method1551(-1);
				}
				arg1 = arg0.anInt2436 / local20;
			}
		}
		arg0.aClass2_Sub2_Sub4_3.method1523(arg1);
	}
}
