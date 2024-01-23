import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub9_Sub3 extends Class4_Sub9 {

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!an;")
	public Class10 aClass10_11 = new Class10();

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "Lclient!gk;")
	public Class4_Sub9_Sub4 aClass4_Sub9_Sub4_1 = new Class4_Sub9_Sub4();

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "Lclient!fg;")
	private Class4_Sub9_Sub2 aClass4_Sub9_Sub2_2;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fg;)V")
	public Class4_Sub9_Sub3(@OriginalArg(0) Class4_Sub9_Sub2 arg0) {
		this.aClass4_Sub9_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	@Override
	public void method1465(@OriginalArg(0) int arg0) {
		this.aClass4_Sub9_Sub4_1.method1465(arg0);
		for (@Pc(15) Class4_Sub1 local15 = (Class4_Sub1) this.aClass10_11.method190(); local15 != null; local15 = (Class4_Sub1) this.aClass10_11.method191()) {
			if (!this.aClass4_Sub9_Sub2_2.method1200(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt67 >= local25) {
						this.method1231(local15, local25);
						local15.anInt67 -= local25;
						break;
					}
					this.method1231(local15, local15.anInt67);
					local25 -= local15.anInt67;
				} while (!this.aClass4_Sub9_Sub2_2.method1171(local25, null, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III[ILclient!ad;I)V")
	private void method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4_Sub1 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub9_Sub2_2.anIntArray148[arg3.anInt73] & 0x4) != 0 && arg3.anInt46 < 0) {
			@Pc(30) int local30 = this.aClass4_Sub9_Sub2_2.anIntArray157[arg3.anInt73] / Static79.anInt1529;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg3.anInt48) / local30;
				if (arg4 < local40) {
					arg3.anInt48 += local30 * arg4;
					break;
				}
				arg4 -= local40;
				arg3.aClass4_Sub9_Sub1_1.method1469(arg2, arg0, local40);
				@Pc(59) int local59 = Static79.anInt1529 / 100;
				arg0 += local40;
				arg3.anInt48 += local40 * local30 - 1048576;
				@Pc(76) Class4_Sub9_Sub1 local76 = arg3.aClass4_Sub9_Sub1_1;
				@Pc(80) int local80 = 262144 / local30;
				if (local59 > local80) {
					local59 = local80;
				}
				if (this.aClass4_Sub9_Sub2_2.anIntArray151[arg3.anInt73] == 0) {
					arg3.aClass4_Sub9_Sub1_1 = Static302.method811(arg3.aClass4_Sub15_Sub1_1, local76.method780(), local76.method793(), local76.method786());
				} else {
					arg3.aClass4_Sub9_Sub1_1 = Static302.method811(arg3.aClass4_Sub15_Sub1_1, local76.method780(), 0, local76.method786());
					this.aClass4_Sub9_Sub2_2.method1202(arg3.aClass4_Sub26_1.aShortArray34[arg3.anInt63] < 0, arg3);
					arg3.aClass4_Sub9_Sub1_1.method778(local59, local76.method793());
				}
				if (arg3.aClass4_Sub26_1.aShortArray34[arg3.anInt63] < 0) {
					arg3.aClass4_Sub9_Sub1_1.method781(-1);
				}
				local76.method779(local59);
				local76.method1469(arg2, arg0, arg1 - arg0);
				if (local76.method798()) {
					this.aClass4_Sub9_Sub4_1.method1473(local76);
				}
			}
		}
		arg3.aClass4_Sub9_Sub1_1.method1469(arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V")
	@Override
	public void method1469(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub9_Sub4_1.method1469(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub1 local17 = (Class4_Sub1) this.aClass10_11.method190(); local17 != null; local17 = (Class4_Sub1) this.aClass10_11.method191()) {
			if (!this.aClass4_Sub9_Sub2_2.method1200(local17)) {
				@Pc(30) int local30 = arg1;
				@Pc(32) int local32 = arg2;
				do {
					if (local17.anInt67 >= local32) {
						this.method1229(local30, local32 + local30, arg0, local17, local32);
						local17.anInt67 -= local32;
						break;
					}
					this.method1229(local30, local30 + local32, arg0, local17, local17.anInt67);
					local30 += local17.anInt67;
					local32 -= local17.anInt67;
				} while (!this.aClass4_Sub9_Sub2_2.method1171(local32, arg0, local30, local17));
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()I")
	@Override
	public int method1467() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ad;IB)V")
	private void method1231(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass4_Sub9_Sub2_2.anIntArray148[arg0.anInt73] & 0x4) != 0 && arg0.anInt46 < 0) {
			@Pc(28) int local28 = this.aClass4_Sub9_Sub2_2.anIntArray157[arg0.anInt73] / Static79.anInt1529;
			@Pc(38) int local38 = (local28 + 1048575 - arg0.anInt48) / local28;
			arg0.anInt48 = arg0.anInt48 + local28 * arg1 & 0xFFFFF;
			if (arg1 >= local38) {
				if (this.aClass4_Sub9_Sub2_2.anIntArray151[arg0.anInt73] == 0) {
					arg0.aClass4_Sub9_Sub1_1 = Static302.method811(arg0.aClass4_Sub15_Sub1_1, arg0.aClass4_Sub9_Sub1_1.method780(), arg0.aClass4_Sub9_Sub1_1.method793(), arg0.aClass4_Sub9_Sub1_1.method786());
				} else {
					arg0.aClass4_Sub9_Sub1_1 = Static302.method811(arg0.aClass4_Sub15_Sub1_1, arg0.aClass4_Sub9_Sub1_1.method780(), 0, arg0.aClass4_Sub9_Sub1_1.method786());
					this.aClass4_Sub9_Sub2_2.method1202(arg0.aClass4_Sub26_1.aShortArray34[arg0.anInt63] < 0, arg0);
				}
				if (arg0.aClass4_Sub26_1.aShortArray34[arg0.anInt63] < 0) {
					arg0.aClass4_Sub9_Sub1_1.method781(-1);
				}
				arg1 = arg0.anInt48 / local28;
			}
		}
		arg0.aClass4_Sub9_Sub1_1.method1465(arg1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lclient!fb;")
	@Override
	public Class4_Sub9 method1463() {
		@Pc(9) Class4_Sub1 local9;
		do {
			local9 = (Class4_Sub1) this.aClass10_11.method191();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub9_Sub1_1 == null);
		return local9.aClass4_Sub9_Sub1_1;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lclient!fb;")
	@Override
	public Class4_Sub9 method1468() {
		@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass10_11.method190();
		if (local5 == null) {
			return null;
		} else if (local5.aClass4_Sub9_Sub1_1 == null) {
			return this.method1463();
		} else {
			return local5.aClass4_Sub9_Sub1_1;
		}
	}
}
