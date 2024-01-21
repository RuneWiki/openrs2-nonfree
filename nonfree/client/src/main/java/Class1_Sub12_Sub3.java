import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class1_Sub12_Sub3 extends Class1_Sub12 {

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!th;")
	public final Class82 aClass82_13 = new Class82();

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "Lclient!pa;")
	public final Class1_Sub12_Sub2 aClass1_Sub12_Sub2_2 = new Class1_Sub12_Sub2();

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "Lclient!sc;")
	private final Class1_Sub12_Sub4 aClass1_Sub12_Sub4_2;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!sc;)V")
	public Class1_Sub12_Sub3(@OriginalArg(0) Class1_Sub12_Sub4 arg0) {
		this.aClass1_Sub12_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	@Override
	public void method2633(@OriginalArg(0) int arg0) {
		this.aClass1_Sub12_Sub2_2.method2633(arg0);
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) this.aClass82_13.method2849(); local15 != null; local15 = (Class1_Sub13) this.aClass82_13.method2855()) {
			if (!this.aClass1_Sub12_Sub4_2.method2657(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2507 >= local25) {
						this.method2476(local25, local15);
						local15.anInt2507 -= local25;
						break;
					}
					this.method2476(local15.anInt2507, local15);
					local25 -= local15.anInt2507;
				} while (!this.aClass1_Sub12_Sub4_2.method2655(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([III)V")
	@Override
	public void method2632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub12_Sub2_2.method2632(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub13 local17 = (Class1_Sub13) this.aClass82_13.method2849(); local17 != null; local17 = (Class1_Sub13) this.aClass82_13.method2855()) {
			if (!this.aClass1_Sub12_Sub4_2.method2657(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2507 >= local29) {
						this.method2474(local29, local27 + local29, local17, local27, arg0);
						local17.anInt2507 -= local29;
						break;
					}
					this.method2474(local17.anInt2507, local27 + local29, local17, local27, arg0);
					local27 += local17.anInt2507;
					local29 -= local17.anInt2507;
				} while (!this.aClass1_Sub12_Sub4_2.method2655(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!kc;ZI[I)V")
	private void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub12_Sub4_2.anIntArray367[arg2.anInt2527] & 0x4) != 0 && arg2.anInt2524 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub12_Sub4_2.anIntArray380[arg2.anInt2527] / Static135.anInt3382;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg2.anInt2516) / local25;
				if (local35 > arg0) {
					arg2.anInt2516 += arg0 * local25;
					break;
				}
				arg0 -= local35;
				arg2.aClass1_Sub12_Sub1_3.method2632(arg4, arg3, local35);
				arg3 += local35;
				arg2.anInt2516 += local35 * local25 - 1048576;
				@Pc(66) int local66 = 262144 / local25;
				@Pc(70) int local70 = Static135.anInt3382 / 100;
				if (local70 > local66) {
					local70 = local66;
				}
				@Pc(78) Class1_Sub12_Sub1 local78 = arg2.aClass1_Sub12_Sub1_3;
				if (this.aClass1_Sub12_Sub4_2.anIntArray379[arg2.anInt2527] == 0) {
					arg2.aClass1_Sub12_Sub1_3 = Static192.method1747(arg2.aClass1_Sub4_Sub1_1, local78.method1755(), local78.method1762(), local78.method1769());
				} else {
					arg2.aClass1_Sub12_Sub1_3 = Static192.method1747(arg2.aClass1_Sub4_Sub1_1, local78.method1755(), 0, local78.method1769());
					this.aClass1_Sub12_Sub4_2.method2650(arg2.aClass1_Sub19_1.aShortArray42[arg2.anInt2519] < 0, arg2);
					arg2.aClass1_Sub12_Sub1_3.method1736(local70, local78.method1762());
				}
				if (arg2.aClass1_Sub19_1.aShortArray42[arg2.anInt2519] < 0) {
					arg2.aClass1_Sub12_Sub1_3.method1760(-1);
				}
				local78.method1743(local70);
				local78.method2632(arg4, arg3, arg1 - arg3);
				if (local78.method1761()) {
					this.aClass1_Sub12_Sub2_2.method2357(local78);
				}
			}
		}
		arg2.aClass1_Sub12_Sub1_3.method2632(arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!kc;)V")
	private void method2476(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if ((this.aClass1_Sub12_Sub4_2.anIntArray367[arg1.anInt2527] & 0x4) != 0 && arg1.anInt2524 < 0) {
			@Pc(21) int local21 = this.aClass1_Sub12_Sub4_2.anIntArray380[arg1.anInt2527] / Static135.anInt3382;
			@Pc(31) int local31 = (local21 + 1048575 - arg1.anInt2516) / local21;
			arg1.anInt2516 = arg0 * local21 + arg1.anInt2516 & 0xFFFFF;
			if (arg0 >= local31) {
				if (this.aClass1_Sub12_Sub4_2.anIntArray379[arg1.anInt2527] == 0) {
					arg1.aClass1_Sub12_Sub1_3 = Static192.method1747(arg1.aClass1_Sub4_Sub1_1, arg1.aClass1_Sub12_Sub1_3.method1755(), arg1.aClass1_Sub12_Sub1_3.method1762(), arg1.aClass1_Sub12_Sub1_3.method1769());
				} else {
					arg1.aClass1_Sub12_Sub1_3 = Static192.method1747(arg1.aClass1_Sub4_Sub1_1, arg1.aClass1_Sub12_Sub1_3.method1755(), 0, arg1.aClass1_Sub12_Sub1_3.method1769());
					this.aClass1_Sub12_Sub4_2.method2650(arg1.aClass1_Sub19_1.aShortArray42[arg1.anInt2519] < 0, arg1);
				}
				if (arg1.aClass1_Sub19_1.aShortArray42[arg1.anInt2519] < 0) {
					arg1.aClass1_Sub12_Sub1_3.method1760(-1);
				}
				arg0 = arg1.anInt2516 / local21;
			}
		}
		arg1.aClass1_Sub12_Sub1_3.method2633(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()Lclient!ve;")
	@Override
	public Class1_Sub12 method2629() {
		@Pc(9) Class1_Sub13 local9;
		do {
			local9 = (Class1_Sub13) this.aClass82_13.method2855();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub12_Sub1_3 == null);
		return local9.aClass1_Sub12_Sub1_3;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()Lclient!ve;")
	@Override
	public Class1_Sub12 method2630() {
		@Pc(9) Class1_Sub13 local9 = (Class1_Sub13) this.aClass82_13.method2849();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub12_Sub1_3 == null) {
			return this.method2629();
		} else {
			return local9.aClass1_Sub12_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
	@Override
	public int method2628() {
		return 0;
	}
}
