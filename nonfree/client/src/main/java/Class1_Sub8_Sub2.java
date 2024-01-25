import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Lclient!wo;")
	public final Class361 aClass361_35 = new Class361();

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "Lclient!qg;")
	public final Class1_Sub8_Sub4 aClass1_Sub8_Sub4_1 = new Class1_Sub8_Sub4();

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "Lclient!lfa;")
	private final Class1_Sub8_Sub3 aClass1_Sub8_Sub3_16;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lfa;)V")
	public Class1_Sub8_Sub2(@OriginalArg(0) Class1_Sub8_Sub3 arg0) {
		this.aClass1_Sub8_Sub3_16 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	@Override
	public void method6024(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_Sub4_1.method6024(arg0);
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) this.aClass361_35.method7854(); local15 != null; local15 = (Class1_Sub25) this.aClass361_35.method7853()) {
			if (!this.aClass1_Sub8_Sub3_16.method4641(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5497 >= local25) {
						this.method2421(local15, local25);
						local15.anInt5497 -= local25;
						break;
					}
					this.method2421(local15, local15.anInt5497);
					local25 -= local15.anInt5497;
				} while (!this.aClass1_Sub8_Sub3_16.method4648(null, 0, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!li;II[III)V")
	private void method2420(@OriginalArg(0) Class1_Sub25 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub8_Sub3_16.anIntArray335[arg0.anInt5500] & 0x4) != 0 && arg0.anInt5508 < 0) {
			@Pc(39) int local39 = this.aClass1_Sub8_Sub3_16.anIntArray334[arg0.anInt5500] / Static426.anInt7216;
			while (true) {
				@Pc(50) int local50 = (local39 + 1048575 - arg0.anInt5501) / local39;
				if (arg3 < local50) {
					arg0.anInt5501 += arg3 * local39;
					break;
				}
				arg0.aClass1_Sub8_Sub1_2.method6022(arg2, arg1, local50);
				arg1 += local50;
				arg0.anInt5501 += local39 * local50 - 1048576;
				arg3 -= local50;
				@Pc(85) int local85 = Static426.anInt7216 / 100;
				@Pc(89) int local89 = 262144 / local39;
				if (local85 > local89) {
					local85 = local89;
				}
				@Pc(97) Class1_Sub8_Sub1 local97 = arg0.aClass1_Sub8_Sub1_2;
				if (this.aClass1_Sub8_Sub3_16.anIntArray344[arg0.anInt5500] == 0) {
					arg0.aClass1_Sub8_Sub1_2 = Static597.method959(arg0.aClass1_Sub40_Sub1_2, local97.method961(), local97.method942(), local97.method950());
				} else {
					arg0.aClass1_Sub8_Sub1_2 = Static597.method959(arg0.aClass1_Sub40_Sub1_2, local97.method961(), 0, local97.method950());
					this.aClass1_Sub8_Sub3_16.method4669(arg0, arg0.aClass1_Sub19_1.aShortArray59[arg0.anInt5513] < 0);
					arg0.aClass1_Sub8_Sub1_2.method948(local85, local97.method942());
				}
				if (arg0.aClass1_Sub19_1.aShortArray59[arg0.anInt5513] < 0) {
					arg0.aClass1_Sub8_Sub1_2.method956(-1);
				}
				local97.method932(local85);
				local97.method6022(arg2, arg1, arg4 - arg1);
				if (local97.method944()) {
					this.aClass1_Sub8_Sub4_1.method6029(local97);
				}
			}
		}
		arg0.aClass1_Sub8_Sub1_2.method6022(arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([III)V")
	@Override
	public void method6022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub8_Sub4_1.method6022(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub25 local17 = (Class1_Sub25) this.aClass361_35.method7854(); local17 != null; local17 = (Class1_Sub25) this.aClass361_35.method7853()) {
			if (!this.aClass1_Sub8_Sub3_16.method4641(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt5497 >= local29) {
						this.method2420(local17, local27, arg0, local29, local27 + local29);
						local17.anInt5497 -= local29;
						break;
					}
					this.method2420(local17, local27, arg0, local17.anInt5497, local27 + local29);
					local29 -= local17.anInt5497;
					local27 += local17.anInt5497;
				} while (!this.aClass1_Sub8_Sub3_16.method4648(arg0, local27, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "()I")
	@Override
	public int method6021() {
		return 0;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "()Lclient!eg;")
	@Override
	public Class1_Sub8 method6023() {
		@Pc(9) Class1_Sub25 local9;
		do {
			local9 = (Class1_Sub25) this.aClass361_35.method7853();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub8_Sub1_2 == null);
		return local9.aClass1_Sub8_Sub1_2;
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "()Lclient!eg;")
	@Override
	public Class1_Sub8 method6026() {
		@Pc(9) Class1_Sub25 local9 = (Class1_Sub25) this.aClass361_35.method7854();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub8_Sub1_2 == null) {
			return this.method6023();
		} else {
			return local9.aClass1_Sub8_Sub1_2;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!li;II)V")
	private void method2421(@OriginalArg(0) Class1_Sub25 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub8_Sub3_16.anIntArray335[arg0.anInt5500] & 0x4) != 0 && arg0.anInt5508 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub8_Sub3_16.anIntArray334[arg0.anInt5500] / Static426.anInt7216;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt5501) / local23;
			arg0.anInt5501 = arg0.anInt5501 + local23 * arg1 & 0xFFFFF;
			if (arg1 >= local33) {
				if (this.aClass1_Sub8_Sub3_16.anIntArray344[arg0.anInt5500] == 0) {
					arg0.aClass1_Sub8_Sub1_2 = Static597.method959(arg0.aClass1_Sub40_Sub1_2, arg0.aClass1_Sub8_Sub1_2.method961(), arg0.aClass1_Sub8_Sub1_2.method942(), arg0.aClass1_Sub8_Sub1_2.method950());
				} else {
					arg0.aClass1_Sub8_Sub1_2 = Static597.method959(arg0.aClass1_Sub40_Sub1_2, arg0.aClass1_Sub8_Sub1_2.method961(), 0, arg0.aClass1_Sub8_Sub1_2.method950());
					this.aClass1_Sub8_Sub3_16.method4669(arg0, arg0.aClass1_Sub19_1.aShortArray59[arg0.anInt5513] < 0);
				}
				if (arg0.aClass1_Sub19_1.aShortArray59[arg0.anInt5513] < 0) {
					arg0.aClass1_Sub8_Sub1_2.method956(-1);
				}
				arg1 = arg0.anInt5501 / local23;
			}
		}
		arg0.aClass1_Sub8_Sub1_2.method6024(arg1);
	}
}
