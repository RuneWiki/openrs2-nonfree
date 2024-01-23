import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "Lclient!ll;")
	public Class114 aClass114_3 = new Class114();

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "Lclient!lo;")
	public Class4_Sub6_Sub3 aClass4_Sub6_Sub3_1 = new Class4_Sub6_Sub3();

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "Lclient!ld;")
	private Class4_Sub6_Sub2 aClass4_Sub6_Sub2_1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!ld;)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) Class4_Sub6_Sub2 arg0) {
		this.aClass4_Sub6_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	@Override
	public void method3358(@OriginalArg(0) int arg0) {
		this.aClass4_Sub6_Sub3_1.method3358(arg0);
		for (@Pc(15) Class4_Sub9 local15 = (Class4_Sub9) this.aClass114_3.method2623(); local15 != null; local15 = (Class4_Sub9) this.aClass114_3.method2629()) {
			if (!this.aClass4_Sub6_Sub2_1.method2498(local15)) {
				@Pc(28) int local28 = arg0;
				do {
					if (local15.anInt1303 >= local28) {
						this.method386(local28, local15);
						local15.anInt1303 -= local28;
						break;
					}
					this.method386(local15.anInt1303, local15);
					local28 -= local15.anInt1303;
				} while (!this.aClass4_Sub6_Sub2_1.method2513(local15, 0, local28, null));
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!ej;I[IIB)V")
	private void method385(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass4_Sub6_Sub2_1.anIntArray285[arg1.anInt1301] & 0x4) != 0 && arg1.anInt1288 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub6_Sub2_1.anIntArray275[arg1.anInt1301] / Static288.anInt5395;
			while (true) {
				@Pc(39) int local39 = (local28 + 1048575 - arg1.anInt1294) / local28;
				if (arg0 < local39) {
					arg1.anInt1294 += local28 * arg0;
					break;
				}
				arg1.aClass4_Sub6_Sub4_1.method3361(arg3, arg2, local39);
				arg2 += local39;
				@Pc(56) int local56 = 262144 / local28;
				@Pc(59) Class4_Sub6_Sub4 local59 = arg1.aClass4_Sub6_Sub4_1;
				@Pc(63) int local63 = Static288.anInt5395 / 100;
				arg0 -= local39;
				if (local63 > local56) {
					local63 = local56;
				}
				arg1.anInt1294 += local28 * local39 - 1048576;
				if (this.aClass4_Sub6_Sub2_1.anIntArray279[arg1.anInt1301] == 0) {
					arg1.aClass4_Sub6_Sub4_1 = Static322.method3397(arg1.aClass4_Sub8_Sub1_1, local59.method3381(), local59.method3394(), local59.method3401());
				} else {
					arg1.aClass4_Sub6_Sub4_1 = Static322.method3397(arg1.aClass4_Sub8_Sub1_1, local59.method3381(), 0, local59.method3401());
					this.aClass4_Sub6_Sub2_1.method2509(arg1, arg1.aClass4_Sub23_1.aShortArray80[arg1.anInt1296] < 0);
					arg1.aClass4_Sub6_Sub4_1.method3392(local63, local59.method3394());
				}
				if (arg1.aClass4_Sub23_1.aShortArray80[arg1.anInt1296] < 0) {
					arg1.aClass4_Sub6_Sub4_1.method3372(-1);
				}
				local59.method3373(local63);
				local59.method3361(arg3, arg2, arg4 - arg2);
				if (local59.method3385()) {
					this.aClass4_Sub6_Sub3_1.method2687(local59);
				}
			}
		}
		arg1.aClass4_Sub6_Sub4_1.method3361(arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public Class4_Sub6 method3363() {
		@Pc(9) Class4_Sub9 local9 = (Class4_Sub9) this.aClass114_3.method2623();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub6_Sub4_1 == null) {
			return this.method3362();
		} else {
			return local9.aClass4_Sub6_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public Class4_Sub6 method3362() {
		@Pc(9) Class4_Sub9 local9;
		do {
			local9 = (Class4_Sub9) this.aClass114_3.method2629();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub6_Sub4_1 == null);
		return local9.aClass4_Sub6_Sub4_1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([III)V")
	@Override
	public void method3361(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub6_Sub3_1.method3361(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub9 local17 = (Class4_Sub9) this.aClass114_3.method2623(); local17 != null; local17 = (Class4_Sub9) this.aClass114_3.method2629()) {
			if (!this.aClass4_Sub6_Sub2_1.method2498(local17)) {
				@Pc(28) int local28 = arg1;
				@Pc(30) int local30 = arg2;
				do {
					if (local17.anInt1303 >= local30) {
						this.method385(local30, local17, local28, arg0, local30 + local28);
						local17.anInt1303 -= local30;
						break;
					}
					this.method385(local17.anInt1303, local17, local28, arg0, local28 + local30);
					local30 -= local17.anInt1303;
					local28 += local17.anInt1303;
				} while (!this.aClass4_Sub6_Sub2_1.method2513(local17, local28, local30, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!ej;)V")
	private void method386(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if ((this.aClass4_Sub6_Sub2_1.anIntArray285[arg1.anInt1301] & 0x4) != 0 && arg1.anInt1288 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub6_Sub2_1.anIntArray275[arg1.anInt1301] / Static288.anInt5395;
			@Pc(38) int local38 = (local28 + 1048575 - arg1.anInt1294) / local28;
			arg1.anInt1294 = local28 * arg0 + arg1.anInt1294 & 0xFFFFF;
			if (arg0 >= local38) {
				if (this.aClass4_Sub6_Sub2_1.anIntArray279[arg1.anInt1301] == 0) {
					arg1.aClass4_Sub6_Sub4_1 = Static322.method3397(arg1.aClass4_Sub8_Sub1_1, arg1.aClass4_Sub6_Sub4_1.method3381(), arg1.aClass4_Sub6_Sub4_1.method3394(), arg1.aClass4_Sub6_Sub4_1.method3401());
				} else {
					arg1.aClass4_Sub6_Sub4_1 = Static322.method3397(arg1.aClass4_Sub8_Sub1_1, arg1.aClass4_Sub6_Sub4_1.method3381(), 0, arg1.aClass4_Sub6_Sub4_1.method3401());
					this.aClass4_Sub6_Sub2_1.method2509(arg1, arg1.aClass4_Sub23_1.aShortArray80[arg1.anInt1296] < 0);
				}
				if (arg1.aClass4_Sub23_1.aShortArray80[arg1.anInt1296] < 0) {
					arg1.aClass4_Sub6_Sub4_1.method3372(-1);
				}
				arg0 = arg1.anInt1294 / local28;
			}
		}
		arg1.aClass4_Sub6_Sub4_1.method3358(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()I")
	@Override
	public int method3359() {
		return 0;
	}
}
