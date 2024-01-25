import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class4_Sub14_Sub3 extends Class4_Sub14 {

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "Lclient!ub;")
	public final Class244 aClass244_32 = new Class244();

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "Lclient!iq;")
	public final Class4_Sub14_Sub2 aClass4_Sub14_Sub2_1 = new Class4_Sub14_Sub2();

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "Lclient!gj;")
	private final Class4_Sub14_Sub1 aClass4_Sub14_Sub1_1;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class4_Sub14_Sub3(@OriginalArg(0) Class4_Sub14_Sub1 arg0) {
		this.aClass4_Sub14_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZILclient!rt;)V")
	private void method4417(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub37 arg1) {
		if ((this.aClass4_Sub14_Sub1_1.anIntArray200[arg1.anInt5879] & 0x4) != 0 && arg1.anInt5877 < 0) {
			@Pc(23) int local23 = this.aClass4_Sub14_Sub1_1.anIntArray201[arg1.anInt5879] / Static145.anInt2577;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt5886) / local23;
			arg1.anInt5886 = arg1.anInt5886 + local23 * arg0 & 0xFFFFF;
			if (local33 <= arg0) {
				if (this.aClass4_Sub14_Sub1_1.anIntArray191[arg1.anInt5879] == 0) {
					arg1.aClass4_Sub14_Sub4_4 = Static466.method4811(arg1.aClass4_Sub15_Sub1_2, arg1.aClass4_Sub14_Sub4_4.method4802(), arg1.aClass4_Sub14_Sub4_4.method4798(), arg1.aClass4_Sub14_Sub4_4.method4828());
				} else {
					arg1.aClass4_Sub14_Sub4_4 = Static466.method4811(arg1.aClass4_Sub15_Sub1_2, arg1.aClass4_Sub14_Sub4_4.method4802(), 0, arg1.aClass4_Sub14_Sub4_4.method4828());
					this.aClass4_Sub14_Sub1_1.method1912(arg1.aClass4_Sub26_1.aShortArray81[arg1.anInt5887] < 0, arg1);
				}
				if (arg1.aClass4_Sub26_1.aShortArray81[arg1.anInt5887] < 0) {
					arg1.aClass4_Sub14_Sub4_4.method4812(-1);
				}
				arg0 = arg1.anInt5886 / local23;
			}
		}
		arg1.aClass4_Sub14_Sub4_4.method4783(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[ILclient!rt;III)V")
	private void method4421(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class4_Sub37 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub14_Sub1_1.anIntArray200[arg1.anInt5879] & 0x4) != 0 && arg1.anInt5877 < 0) {
			@Pc(31) int local31 = this.aClass4_Sub14_Sub1_1.anIntArray201[arg1.anInt5879] / Static145.anInt2577;
			while (true) {
				@Pc(42) int local42 = (local31 + 1048575 - arg1.anInt5886) / local31;
				if (arg3 < local42) {
					arg1.anInt5886 += arg3 * local31;
					break;
				}
				arg1.aClass4_Sub14_Sub4_4.method4788(arg0, arg4, local42);
				arg1.anInt5886 += local42 * local31 - 1048576;
				arg4 += local42;
				arg3 -= local42;
				@Pc(73) int local73 = Static145.anInt2577 / 100;
				@Pc(77) int local77 = 262144 / local31;
				if (local73 > local77) {
					local73 = local77;
				}
				@Pc(85) Class4_Sub14_Sub4 local85 = arg1.aClass4_Sub14_Sub4_4;
				if (this.aClass4_Sub14_Sub1_1.anIntArray191[arg1.anInt5879] == 0) {
					arg1.aClass4_Sub14_Sub4_4 = Static466.method4811(arg1.aClass4_Sub15_Sub1_2, local85.method4802(), local85.method4798(), local85.method4828());
				} else {
					arg1.aClass4_Sub14_Sub4_4 = Static466.method4811(arg1.aClass4_Sub15_Sub1_2, local85.method4802(), 0, local85.method4828());
					this.aClass4_Sub14_Sub1_1.method1912(arg1.aClass4_Sub26_1.aShortArray81[arg1.anInt5887] < 0, arg1);
					arg1.aClass4_Sub14_Sub4_4.method4817(local73, local85.method4798());
				}
				if (arg1.aClass4_Sub26_1.aShortArray81[arg1.anInt5887] < 0) {
					arg1.aClass4_Sub14_Sub4_4.method4812(-1);
				}
				local85.method4805(local73);
				local85.method4788(arg0, arg4, arg2 - arg4);
				if (local85.method4823()) {
					this.aClass4_Sub14_Sub2_1.method2418(local85);
				}
			}
		}
		arg1.aClass4_Sub14_Sub4_4.method4788(arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "()I")
	@Override
	public int method4786() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([III)V")
	@Override
	public void method4788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub14_Sub2_1.method4788(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub37 local17 = (Class4_Sub37) this.aClass244_32.method5263(); local17 != null; local17 = (Class4_Sub37) this.aClass244_32.method5271()) {
			if (!this.aClass4_Sub14_Sub1_1.method1902(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt5881) {
						this.method4421(arg0, local17, local29 + local27, local27, local29);
						local17.anInt5881 -= local27;
						break;
					}
					this.method4421(arg0, local17, local27 + local29, local17.anInt5881, local29);
					local27 -= local17.anInt5881;
					local29 += local17.anInt5881;
				} while (!this.aClass4_Sub14_Sub1_1.method1897(local17, arg0, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	@Override
	public void method4783(@OriginalArg(0) int arg0) {
		this.aClass4_Sub14_Sub2_1.method4783(arg0);
		for (@Pc(15) Class4_Sub37 local15 = (Class4_Sub37) this.aClass244_32.method5263(); local15 != null; local15 = (Class4_Sub37) this.aClass244_32.method5271()) {
			if (!this.aClass4_Sub14_Sub1_1.method1902(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5881 >= local25) {
						this.method4417(local25, local15);
						local15.anInt5881 -= local25;
						break;
					}
					this.method4417(local15.anInt5881, local15);
					local25 -= local15.anInt5881;
				} while (!this.aClass4_Sub14_Sub1_1.method1897(local15, null, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "()Lclient!hu;")
	@Override
	public Class4_Sub14 method4787() {
		@Pc(9) Class4_Sub37 local9;
		do {
			local9 = (Class4_Sub37) this.aClass244_32.method5271();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub14_Sub4_4 == null);
		return local9.aClass4_Sub14_Sub4_4;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()Lclient!hu;")
	@Override
	public Class4_Sub14 method4784() {
		@Pc(9) Class4_Sub37 local9 = (Class4_Sub37) this.aClass244_32.method5263();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub14_Sub4_4 == null) {
			return this.method4787();
		} else {
			return local9.aClass4_Sub14_Sub4_4;
		}
	}
}
