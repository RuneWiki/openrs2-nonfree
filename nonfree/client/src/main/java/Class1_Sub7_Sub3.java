import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class1_Sub7_Sub3 extends Class1_Sub7 {

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!at;")
	public final Class17 aClass17_29 = new Class17();

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!qn;")
	public final Class1_Sub7_Sub4 aClass1_Sub7_Sub4_1 = new Class1_Sub7_Sub4();

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!di;")
	private final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_2;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!di;)V")
	public Class1_Sub7_Sub3(@OriginalArg(0) Class1_Sub7_Sub1 arg0) {
		this.aClass1_Sub7_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB[IILclient!ar;I)V")
	private void method2525(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub3 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub7_Sub1_2.anIntArray168[arg3.anInt293] & 0x4) != 0 && arg3.anInt303 < 0) {
			@Pc(39) int local39 = this.aClass1_Sub7_Sub1_2.anIntArray175[arg3.anInt293] / Static212.anInt3652;
			while (true) {
				@Pc(49) int local49 = (local39 + 1048575 - arg3.anInt305) / local39;
				if (arg2 < local49) {
					arg3.anInt305 += arg2 * local39;
					break;
				}
				arg3.aClass1_Sub7_Sub2_1.method4404(arg1, arg4, local49);
				arg4 += local49;
				arg2 -= local49;
				arg3.anInt305 += local49 * local39 - 1048576;
				@Pc(80) int local80 = Static212.anInt3652 / 100;
				@Pc(84) int local84 = 262144 / local39;
				if (local80 > local84) {
					local80 = local84;
				}
				@Pc(92) Class1_Sub7_Sub2 local92 = arg3.aClass1_Sub7_Sub2_1;
				if (this.aClass1_Sub7_Sub1_2.anIntArray163[arg3.anInt293] == 0) {
					arg3.aClass1_Sub7_Sub2_1 = Static399.method2243(arg3.aClass1_Sub31_Sub1_1, local92.method2246(), local92.method2262(), local92.method2239());
				} else {
					arg3.aClass1_Sub7_Sub2_1 = Static399.method2243(arg3.aClass1_Sub31_Sub1_1, local92.method2246(), 0, local92.method2239());
					this.aClass1_Sub7_Sub1_2.method1071(arg3, arg3.aClass1_Sub29_1.aShortArray82[arg3.anInt292] < 0);
					arg3.aClass1_Sub7_Sub2_1.method2248(local80, local92.method2262());
				}
				if (arg3.aClass1_Sub29_1.aShortArray82[arg3.anInt292] < 0) {
					arg3.aClass1_Sub7_Sub2_1.method2238(-1);
				}
				local92.method2251(local80);
				local92.method4404(arg1, arg4, arg0 - arg4);
				if (local92.method2227()) {
					this.aClass1_Sub7_Sub4_1.method4413(local92);
				}
			}
		}
		arg3.aClass1_Sub7_Sub2_1.method4404(arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()Lclient!uh;")
	@Override
	public Class1_Sub7 method4407() {
		@Pc(9) Class1_Sub3 local9 = (Class1_Sub3) this.aClass17_29.method202();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub7_Sub2_1 == null) {
			return this.method4408();
		} else {
			return local9.aClass1_Sub7_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ar;ZI)V")
	private void method2528(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub7_Sub1_2.anIntArray168[arg0.anInt293] & 0x4) != 0 && arg0.anInt303 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub7_Sub1_2.anIntArray175[arg0.anInt293] / Static212.anInt3652;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt305) / local23;
			arg0.anInt305 = local23 * arg1 + arg0.anInt305 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass1_Sub7_Sub1_2.anIntArray163[arg0.anInt293] == 0) {
					arg0.aClass1_Sub7_Sub2_1 = Static399.method2243(arg0.aClass1_Sub31_Sub1_1, arg0.aClass1_Sub7_Sub2_1.method2246(), arg0.aClass1_Sub7_Sub2_1.method2262(), arg0.aClass1_Sub7_Sub2_1.method2239());
				} else {
					arg0.aClass1_Sub7_Sub2_1 = Static399.method2243(arg0.aClass1_Sub31_Sub1_1, arg0.aClass1_Sub7_Sub2_1.method2246(), 0, arg0.aClass1_Sub7_Sub2_1.method2239());
					this.aClass1_Sub7_Sub1_2.method1071(arg0, arg0.aClass1_Sub29_1.aShortArray82[arg0.anInt292] < 0);
				}
				if (arg0.aClass1_Sub29_1.aShortArray82[arg0.anInt292] < 0) {
					arg0.aClass1_Sub7_Sub2_1.method2238(-1);
				}
				arg1 = arg0.anInt305 / local23;
			}
		}
		arg0.aClass1_Sub7_Sub2_1.method4405(arg1);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()Lclient!uh;")
	@Override
	public Class1_Sub7 method4408() {
		@Pc(9) Class1_Sub3 local9;
		do {
			local9 = (Class1_Sub3) this.aClass17_29.method207();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub7_Sub2_1 == null);
		return local9.aClass1_Sub7_Sub2_1;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "([III)V")
	@Override
	public void method4404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub7_Sub4_1.method4404(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub3 local17 = (Class1_Sub3) this.aClass17_29.method202(); local17 != null; local17 = (Class1_Sub3) this.aClass17_29.method207()) {
			if (!this.aClass1_Sub7_Sub1_2.method1080(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt308 >= local27) {
						this.method2525(local27 + local29, arg0, local27, local17, local29);
						local17.anInt308 -= local27;
						break;
					}
					this.method2525(local29 + local27, arg0, local17.anInt308, local17, local29);
					local29 += local17.anInt308;
					local27 -= local17.anInt308;
				} while (!this.aClass1_Sub7_Sub1_2.method1085(arg0, local27, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	@Override
	public void method4405(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_Sub4_1.method4405(arg0);
		for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass17_29.method202(); local15 != null; local15 = (Class1_Sub3) this.aClass17_29.method207()) {
			if (!this.aClass1_Sub7_Sub1_2.method1080(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt308) {
						this.method2528(local15, local25);
						local15.anInt308 -= local25;
						break;
					}
					this.method2528(local15, local15.anInt308);
					local25 -= local15.anInt308;
				} while (!this.aClass1_Sub7_Sub1_2.method1085(null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "()I")
	@Override
	public int method4409() {
		return 0;
	}
}
