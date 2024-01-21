import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub10_Sub2 extends Class1_Sub10 {

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "Lclient!h;")
	public final Class30 aClass30_9 = new Class30();

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "Lclient!cb;")
	public final Class1_Sub10_Sub1 aClass1_Sub10_Sub1_2 = new Class1_Sub10_Sub1();

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!ie;")
	private final Class1_Sub10_Sub3 aClass1_Sub10_Sub3_1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class1_Sub10_Sub2(@OriginalArg(0) Class1_Sub10_Sub3 arg0) {
		this.aClass1_Sub10_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!a;I)V")
	private void method959(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if ((this.aClass1_Sub10_Sub3_1.anIntArray167[arg1.anInt17] & 0x4) != 0 && arg1.anInt25 < 0) {
			@Pc(36) int local36 = this.aClass1_Sub10_Sub3_1.anIntArray168[arg1.anInt17] / Static185.anInt3915;
			@Pc(47) int local47 = (local36 + 1048575 - arg1.anInt18) / local36;
			arg1.anInt18 = arg1.anInt18 + local36 * arg0 & 0xFFFFF;
			if (arg0 >= local47) {
				if (this.aClass1_Sub10_Sub3_1.anIntArray163[arg1.anInt17] == 0) {
					arg1.aClass1_Sub10_Sub4_1 = Static193.method2455(arg1.aClass1_Sub11_Sub1_1, arg1.aClass1_Sub10_Sub4_1.method2474(), arg1.aClass1_Sub10_Sub4_1.method2470(), arg1.aClass1_Sub10_Sub4_1.method2467());
				} else {
					arg1.aClass1_Sub10_Sub4_1 = Static193.method2455(arg1.aClass1_Sub11_Sub1_1, arg1.aClass1_Sub10_Sub4_1.method2474(), 0, arg1.aClass1_Sub10_Sub4_1.method2467());
					this.aClass1_Sub10_Sub3_1.method1295(arg1, arg1.aClass1_Sub24_1.aShortArray50[arg1.anInt27] < 0);
				}
				if (arg1.aClass1_Sub24_1.aShortArray50[arg1.anInt27] < 0) {
					arg1.aClass1_Sub10_Sub4_1.method2461(-1);
				}
				arg0 = arg1.anInt18 / local36;
			}
		}
		arg1.aClass1_Sub10_Sub4_1.method2438(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()Lclient!vh;")
	@Override
	public Class1_Sub10 method2440() {
		@Pc(9) Class1_Sub1 local9 = (Class1_Sub1) this.aClass30_9.method1115();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub10_Sub4_1 == null) {
			return this.method2439();
		} else {
			return local9.aClass1_Sub10_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
	@Override
	public int method2436() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIIILclient!a;[I)V")
	private void method960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub10_Sub3_1.anIntArray167[arg3.anInt17] & 0x4) != 0 && arg3.anInt25 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub10_Sub3_1.anIntArray168[arg3.anInt17] / Static185.anInt3915;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg3.anInt18) / local26;
				if (arg2 < local36) {
					arg3.anInt18 += arg2 * local26;
					break;
				}
				arg3.aClass1_Sub10_Sub4_1.method2442(arg4, arg0, local36);
				arg2 -= local36;
				arg3.anInt18 += local26 * local36 - 1048576;
				arg0 += local36;
				@Pc(71) int local71 = Static185.anInt3915 / 100;
				@Pc(75) int local75 = 262144 / local26;
				if (local75 < local71) {
					local71 = local75;
				}
				@Pc(83) Class1_Sub10_Sub4 local83 = arg3.aClass1_Sub10_Sub4_1;
				if (this.aClass1_Sub10_Sub3_1.anIntArray163[arg3.anInt17] == 0) {
					arg3.aClass1_Sub10_Sub4_1 = Static193.method2455(arg3.aClass1_Sub11_Sub1_1, local83.method2474(), local83.method2470(), local83.method2467());
				} else {
					arg3.aClass1_Sub10_Sub4_1 = Static193.method2455(arg3.aClass1_Sub11_Sub1_1, local83.method2474(), 0, local83.method2467());
					this.aClass1_Sub10_Sub3_1.method1295(arg3, arg3.aClass1_Sub24_1.aShortArray50[arg3.anInt27] < 0);
					arg3.aClass1_Sub10_Sub4_1.method2457(local71, local83.method2470());
				}
				if (arg3.aClass1_Sub24_1.aShortArray50[arg3.anInt27] < 0) {
					arg3.aClass1_Sub10_Sub4_1.method2461(-1);
				}
				local83.method2482(local71);
				local83.method2442(arg4, arg0, arg1 - arg0);
				if (local83.method2471()) {
					this.aClass1_Sub10_Sub1_2.method454(local83);
				}
			}
		}
		arg3.aClass1_Sub10_Sub4_1.method2442(arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public void method2438(@OriginalArg(0) int arg0) {
		this.aClass1_Sub10_Sub1_2.method2438(arg0);
		for (@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass30_9.method1115(); local15 != null; local15 = (Class1_Sub1) this.aClass30_9.method1125()) {
			if (!this.aClass1_Sub10_Sub3_1.method1315(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt31 >= local25) {
						this.method959(local25, local15);
						local15.anInt31 -= local25;
						break;
					}
					this.method959(local15.anInt31, local15);
					local25 -= local15.anInt31;
				} while (!this.aClass1_Sub10_Sub3_1.method1310(null, 0, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lclient!vh;")
	@Override
	public Class1_Sub10 method2439() {
		@Pc(9) Class1_Sub1 local9;
		do {
			local9 = (Class1_Sub1) this.aClass30_9.method1125();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub10_Sub4_1 == null);
		return local9.aClass1_Sub10_Sub4_1;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V")
	@Override
	public void method2442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub10_Sub1_2.method2442(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub1 local17 = (Class1_Sub1) this.aClass30_9.method1115(); local17 != null; local17 = (Class1_Sub1) this.aClass30_9.method1125()) {
			if (!this.aClass1_Sub10_Sub3_1.method1315(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt31) {
						this.method960(local29, local29 + local27, local27, local17, arg0);
						local17.anInt31 -= local27;
						break;
					}
					this.method960(local29, local29 + local27, local17.anInt31, local17, arg0);
					local29 += local17.anInt31;
					local27 -= local17.anInt31;
				} while (!this.aClass1_Sub10_Sub3_1.method1310(arg0, local29, local27, local17));
			}
		}
	}
}
