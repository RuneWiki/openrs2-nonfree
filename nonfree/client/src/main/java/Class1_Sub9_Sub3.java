import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub9_Sub3 extends Class1_Sub9 {

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Lclient!vp;")
	public final Class254 aClass254_19 = new Class254();

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "Lclient!df;")
	public final Class1_Sub9_Sub2 aClass1_Sub9_Sub2_2 = new Class1_Sub9_Sub2();

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!s;")
	private final Class1_Sub9_Sub4 aClass1_Sub9_Sub4_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!s;)V")
	public Class1_Sub9_Sub3(@OriginalArg(0) Class1_Sub9_Sub4 arg0) {
		this.aClass1_Sub9_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[IIILclient!sd;)V")
	private void method2456(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub36 arg4) {
		if ((this.aClass1_Sub9_Sub4_1.anIntArray361[arg4.anInt5975] & 0x4) != 0 && arg4.anInt5984 < 0) {
			@Pc(34) int local34 = this.aClass1_Sub9_Sub4_1.anIntArray352[arg4.anInt5975] / Static155.anInt2607;
			while (true) {
				@Pc(43) int local43 = (local34 + 1048575 - arg4.anInt5985) / local34;
				if (arg0 < local43) {
					arg4.anInt5985 += local34 * arg0;
					break;
				}
				arg4.aClass1_Sub9_Sub1_2.method4592(arg1, arg3, local43);
				arg3 += local43;
				arg0 -= local43;
				arg4.anInt5985 += local43 * local34 - 1048576;
				@Pc(74) int local74 = Static155.anInt2607 / 100;
				@Pc(78) int local78 = 262144 / local34;
				if (local78 < local74) {
					local74 = local78;
				}
				@Pc(86) Class1_Sub9_Sub1 local86 = arg4.aClass1_Sub9_Sub1_2;
				if (this.aClass1_Sub9_Sub4_1.anIntArray362[arg4.anInt5975] == 0) {
					arg4.aClass1_Sub9_Sub1_2 = Static457.method911(arg4.aClass1_Sub28_Sub1_2, local86.method921(), local86.method935(), local86.method919());
				} else {
					arg4.aClass1_Sub9_Sub1_2 = Static457.method911(arg4.aClass1_Sub28_Sub1_2, local86.method921(), 0, local86.method919());
					this.aClass1_Sub9_Sub4_1.method4626(arg4, arg4.aClass1_Sub37_1.aShortArray77[arg4.anInt5983] < 0);
					arg4.aClass1_Sub9_Sub1_2.method917(local74, local86.method935());
				}
				if (arg4.aClass1_Sub37_1.aShortArray77[arg4.anInt5983] < 0) {
					arg4.aClass1_Sub9_Sub1_2.method934(-1);
				}
				local86.method941(local74);
				local86.method4592(arg1, arg3, arg2 - arg3);
				if (local86.method914()) {
					this.aClass1_Sub9_Sub2_2.method1036(local86);
				}
			}
		}
		arg4.aClass1_Sub9_Sub1_2.method4592(arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()Lclient!hf;")
	@Override
	public Class1_Sub9 method4591() {
		@Pc(9) Class1_Sub36 local9;
		do {
			local9 = (Class1_Sub36) this.aClass254_19.method5433();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub9_Sub1_2 == null);
		return local9.aClass1_Sub9_Sub1_2;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III)V")
	@Override
	public void method4592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub9_Sub2_2.method4592(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub36 local17 = (Class1_Sub36) this.aClass254_19.method5437(); local17 != null; local17 = (Class1_Sub36) this.aClass254_19.method5433()) {
			if (!this.aClass1_Sub9_Sub4_1.method4615(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt5989) {
						this.method2456(local29, arg0, local29 + local27, local27, local17);
						local17.anInt5989 -= local29;
						break;
					}
					this.method2456(local17.anInt5989, arg0, local29 + local27, local27, local17);
					local29 -= local17.anInt5989;
					local27 += local17.anInt5989;
				} while (!this.aClass1_Sub9_Sub4_1.method4617(local17, local27, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void method4597(@OriginalArg(0) int arg0) {
		this.aClass1_Sub9_Sub2_2.method4597(arg0);
		for (@Pc(15) Class1_Sub36 local15 = (Class1_Sub36) this.aClass254_19.method5437(); local15 != null; local15 = (Class1_Sub36) this.aClass254_19.method5433()) {
			if (!this.aClass1_Sub9_Sub4_1.method4615(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt5989) {
						this.method2461(local25, local15);
						local15.anInt5989 -= local25;
						break;
					}
					this.method2461(local15.anInt5989, local15);
					local25 -= local15.anInt5989;
				} while (!this.aClass1_Sub9_Sub4_1.method4617(local15, 0, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
	@Override
	public int method4596() {
		return 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!sd;Z)V")
	private void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub36 arg1) {
		if ((this.aClass1_Sub9_Sub4_1.anIntArray361[arg1.anInt5975] & 0x4) != 0 && arg1.anInt5984 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub9_Sub4_1.anIntArray352[arg1.anInt5975] / Static155.anInt2607;
			@Pc(36) int local36 = (local27 + 1048575 - arg1.anInt5985) / local27;
			arg1.anInt5985 = arg1.anInt5985 + arg0 * local27 & 0xFFFFF;
			if (arg0 >= local36) {
				if (this.aClass1_Sub9_Sub4_1.anIntArray362[arg1.anInt5975] == 0) {
					arg1.aClass1_Sub9_Sub1_2 = Static457.method911(arg1.aClass1_Sub28_Sub1_2, arg1.aClass1_Sub9_Sub1_2.method921(), arg1.aClass1_Sub9_Sub1_2.method935(), arg1.aClass1_Sub9_Sub1_2.method919());
				} else {
					arg1.aClass1_Sub9_Sub1_2 = Static457.method911(arg1.aClass1_Sub28_Sub1_2, arg1.aClass1_Sub9_Sub1_2.method921(), 0, arg1.aClass1_Sub9_Sub1_2.method919());
					this.aClass1_Sub9_Sub4_1.method4626(arg1, arg1.aClass1_Sub37_1.aShortArray77[arg1.anInt5983] < 0);
				}
				if (arg1.aClass1_Sub37_1.aShortArray77[arg1.anInt5983] < 0) {
					arg1.aClass1_Sub9_Sub1_2.method934(-1);
				}
				arg0 = arg1.anInt5985 / local27;
			}
		}
		arg1.aClass1_Sub9_Sub1_2.method4597(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()Lclient!hf;")
	@Override
	public Class1_Sub9 method4595() {
		@Pc(9) Class1_Sub36 local9 = (Class1_Sub36) this.aClass254_19.method5437();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub9_Sub1_2 == null) {
			return this.method4591();
		} else {
			return local9.aClass1_Sub9_Sub1_2;
		}
	}
}
