import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!io", name = "z", descriptor = "Lclient!bu;")
	public final Class38 aClass38_31 = new Class38();

	@OriginalMember(owner = "client!io", name = "B", descriptor = "Lclient!sca;")
	public final Class1_Sub12_Sub3 aClass1_Sub12_Sub3_1 = new Class1_Sub12_Sub3();

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Lclient!tca;")
	private final Class1_Sub12_Sub4 aClass1_Sub12_Sub4_2;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!tca;)V")
	public Class1_Sub12_Sub2(@OriginalArg(0) Class1_Sub12_Sub4 arg0) {
		this.aClass1_Sub12_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	@Override
	public void method6516(@OriginalArg(0) int arg0) {
		this.aClass1_Sub12_Sub3_1.method6516(arg0);
		for (@Pc(15) Class1_Sub17 local15 = (Class1_Sub17) this.aClass38_31.method1419(); local15 != null; local15 = (Class1_Sub17) this.aClass38_31.method1415()) {
			if (!this.aClass1_Sub12_Sub4_2.method6525(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3190 >= local25) {
						this.method3822(local15, local25);
						local15.anInt3190 -= local25;
						break;
					}
					this.method3822(local15, local15.anInt3190);
					local25 -= local15.anInt3190;
				} while (!this.aClass1_Sub12_Sub4_2.method6523(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!fi;IIIZ[I)V")
	private void method3820(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub12_Sub4_2.anIntArray602[arg0.anInt3193] & 0x4) != 0 && arg0.anInt3197 < 0) {
			@Pc(25) int local25 = this.aClass1_Sub12_Sub4_2.anIntArray601[arg0.anInt3193] / Static77.anInt2079;
			while (true) {
				@Pc(34) int local34 = (local25 + 1048575 - arg0.anInt3182) / local25;
				if (arg1 < local34) {
					arg0.anInt3182 += arg1 * local25;
					break;
				}
				arg0.aClass1_Sub12_Sub1_4.method6519(arg4, arg3, local34);
				arg0.anInt3182 += local25 * local34 - 1048576;
				arg1 -= local34;
				arg3 += local34;
				@Pc(65) int local65 = Static77.anInt2079 / 100;
				@Pc(69) int local69 = 262144 / local25;
				if (local65 > local69) {
					local65 = local69;
				}
				@Pc(77) Class1_Sub12_Sub1 local77 = arg0.aClass1_Sub12_Sub1_4;
				if (this.aClass1_Sub12_Sub4_2.anIntArray604[arg0.anInt3193] == 0) {
					arg0.aClass1_Sub12_Sub1_4 = Static550.method2336(arg0.aClass1_Sub32_Sub1_2, local77.method2361(), local77.method2325(), local77.method2345());
				} else {
					arg0.aClass1_Sub12_Sub1_4 = Static550.method2336(arg0.aClass1_Sub32_Sub1_2, local77.method2361(), 0, local77.method2345());
					this.aClass1_Sub12_Sub4_2.method6528(arg0.aClass1_Sub8_1.aShortArray19[arg0.anInt3184] < 0, arg0);
					arg0.aClass1_Sub12_Sub1_4.method2328(local65, local77.method2325());
				}
				if (arg0.aClass1_Sub8_1.aShortArray19[arg0.anInt3184] < 0) {
					arg0.aClass1_Sub12_Sub1_4.method2351(-1);
				}
				local77.method2326(local65);
				local77.method6519(arg4, arg3, arg2 - arg3);
				if (local77.method2360()) {
					this.aClass1_Sub12_Sub3_1.method6369(local77);
				}
			}
		}
		arg0.aClass1_Sub12_Sub1_4.method6519(arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()Lclient!kca;")
	@Override
	public Class1_Sub12 method6517() {
		@Pc(9) Class1_Sub17 local9;
		do {
			local9 = (Class1_Sub17) this.aClass38_31.method1415();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub12_Sub1_4 == null);
		return local9.aClass1_Sub12_Sub1_4;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "()I")
	@Override
	public int method6521() {
		return 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([III)V")
	@Override
	public void method6519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub12_Sub3_1.method6519(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub17 local17 = (Class1_Sub17) this.aClass38_31.method1419(); local17 != null; local17 = (Class1_Sub17) this.aClass38_31.method1415()) {
			if (!this.aClass1_Sub12_Sub4_2.method6525(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt3190 >= local29) {
						this.method3820(local17, local29, local29 + local27, local27, arg0);
						local17.anInt3190 -= local29;
						break;
					}
					this.method3820(local17, local17.anInt3190, local29 + local27, local27, arg0);
					local27 += local17.anInt3190;
					local29 -= local17.anInt3190;
				} while (!this.aClass1_Sub12_Sub4_2.method6523(local29, local17, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!fi;II)V")
	private void method3822(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub12_Sub4_2.anIntArray602[arg0.anInt3193] & 0x4) != 0 && arg0.anInt3197 < 0) {
			@Pc(30) int local30 = this.aClass1_Sub12_Sub4_2.anIntArray601[arg0.anInt3193] / Static77.anInt2079;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt3182) / local30;
			arg0.anInt3182 = arg1 * local30 + arg0.anInt3182 & 0xFFFFF;
			if (arg1 >= local40) {
				if (this.aClass1_Sub12_Sub4_2.anIntArray604[arg0.anInt3193] == 0) {
					arg0.aClass1_Sub12_Sub1_4 = Static550.method2336(arg0.aClass1_Sub32_Sub1_2, arg0.aClass1_Sub12_Sub1_4.method2361(), arg0.aClass1_Sub12_Sub1_4.method2325(), arg0.aClass1_Sub12_Sub1_4.method2345());
				} else {
					arg0.aClass1_Sub12_Sub1_4 = Static550.method2336(arg0.aClass1_Sub32_Sub1_2, arg0.aClass1_Sub12_Sub1_4.method2361(), 0, arg0.aClass1_Sub12_Sub1_4.method2345());
					this.aClass1_Sub12_Sub4_2.method6528(arg0.aClass1_Sub8_1.aShortArray19[arg0.anInt3184] < 0, arg0);
				}
				if (arg0.aClass1_Sub8_1.aShortArray19[arg0.anInt3184] < 0) {
					arg0.aClass1_Sub12_Sub1_4.method2351(-1);
				}
				arg1 = arg0.anInt3182 / local30;
			}
		}
		arg0.aClass1_Sub12_Sub1_4.method6516(arg1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()Lclient!kca;")
	@Override
	public Class1_Sub12 method6515() {
		@Pc(9) Class1_Sub17 local9 = (Class1_Sub17) this.aClass38_31.method1419();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub12_Sub1_4 == null) {
			return this.method6517();
		} else {
			return local9.aClass1_Sub12_Sub1_4;
		}
	}
}
