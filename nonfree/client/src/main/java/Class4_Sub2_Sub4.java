import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!j", name = "C", descriptor = "Lclient!tb;")
	public final Class70 aClass70_11 = new Class70();

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Lclient!h;")
	public final Class4_Sub2_Sub3 aClass4_Sub2_Sub3_1 = new Class4_Sub2_Sub3();

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Lclient!ec;")
	private final Class4_Sub2_Sub2 aClass4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class4_Sub2_Sub4(@OriginalArg(0) Class4_Sub2_Sub2 arg0) {
		this.aClass4_Sub2_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!f;IB)V")
	private void method971(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass4_Sub2_Sub2_1.anIntArray49[arg0.anInt878] & 0x4) != 0 && arg0.anInt870 < 0) {
			@Pc(23) int local23 = this.aClass4_Sub2_Sub2_1.anIntArray55[arg0.anInt878] / Static31.anInt846;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt862) / local23;
			arg0.anInt862 = arg1 * local23 + arg0.anInt862 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass4_Sub2_Sub2_1.anIntArray51[arg0.anInt878] == 0) {
					arg0.aClass4_Sub2_Sub1_1 = Static132.method97(arg0.aClass4_Sub1_Sub1_1, arg0.aClass4_Sub2_Sub1_1.method96(), arg0.aClass4_Sub2_Sub1_1.method77(), arg0.aClass4_Sub2_Sub1_1.method78());
				} else {
					arg0.aClass4_Sub2_Sub1_1 = Static132.method97(arg0.aClass4_Sub1_Sub1_1, arg0.aClass4_Sub2_Sub1_1.method96(), 0, arg0.aClass4_Sub2_Sub1_1.method78());
					this.aClass4_Sub2_Sub2_1.method571(arg0.aClass4_Sub9_1.aShortArray1[arg0.anInt863] < 0, arg0);
				}
				if (arg0.aClass4_Sub9_1.aShortArray1[arg0.anInt863] < 0) {
					arg0.aClass4_Sub2_Sub1_1.method86(-1);
				}
				arg1 = arg0.anInt862 / local23;
			}
		}
		arg0.aClass4_Sub2_Sub1_1.method964(arg1);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()Lclient!oc;")
	@Override
	public Class4_Sub2 method969() {
		@Pc(9) Class4_Sub10 local9 = (Class4_Sub10) this.aClass70_11.method1939();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub2_Sub1_1 == null) {
			return this.method967();
		} else {
			return local9.aClass4_Sub2_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()Lclient!oc;")
	@Override
	public Class4_Sub2 method967() {
		@Pc(9) Class4_Sub10 local9;
		do {
			local9 = (Class4_Sub10) this.aClass70_11.method1936();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub2_Sub1_1 == null);
		return local9.aClass4_Sub2_Sub1_1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIILclient!f;[II)V")
	private void method973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub10 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub2_Sub2_1.anIntArray49[arg2.anInt878] & 0x4) != 0 && arg2.anInt870 < 0) {
			@Pc(32) int local32 = this.aClass4_Sub2_Sub2_1.anIntArray55[arg2.anInt878] / Static31.anInt846;
			while (true) {
				@Pc(41) int local41 = (local32 + 1048575 - arg2.anInt862) / local32;
				if (local41 > arg0) {
					arg2.anInt862 += local32 * arg0;
					break;
				}
				arg0 -= local41;
				arg2.aClass4_Sub2_Sub1_1.method968(arg3, arg4, local41);
				@Pc(62) int local62 = Static31.anInt846 / 100;
				arg2.anInt862 += local41 * local32 - 1048576;
				@Pc(75) Class4_Sub2_Sub1 local75 = arg2.aClass4_Sub2_Sub1_1;
				arg4 += local41;
				@Pc(83) int local83 = 262144 / local32;
				if (local62 > local83) {
					local62 = local83;
				}
				if (this.aClass4_Sub2_Sub2_1.anIntArray51[arg2.anInt878] == 0) {
					arg2.aClass4_Sub2_Sub1_1 = Static132.method97(arg2.aClass4_Sub1_Sub1_1, local75.method96(), local75.method77(), local75.method78());
				} else {
					arg2.aClass4_Sub2_Sub1_1 = Static132.method97(arg2.aClass4_Sub1_Sub1_1, local75.method96(), 0, local75.method78());
					this.aClass4_Sub2_Sub2_1.method571(arg2.aClass4_Sub9_1.aShortArray1[arg2.anInt863] < 0, arg2);
					arg2.aClass4_Sub2_Sub1_1.method105(local62, local75.method77());
				}
				if (arg2.aClass4_Sub9_1.aShortArray1[arg2.anInt863] < 0) {
					arg2.aClass4_Sub2_Sub1_1.method86(-1);
				}
				local75.method101(local62);
				local75.method968(arg3, arg4, arg1 - arg4);
				if (local75.method107()) {
					this.aClass4_Sub2_Sub3_1.method749(local75);
				}
			}
		}
		arg2.aClass4_Sub2_Sub1_1.method968(arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "([III)V")
	@Override
	public void method968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub2_Sub3_1.method968(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub10 local17 = (Class4_Sub10) this.aClass70_11.method1939(); local17 != null; local17 = (Class4_Sub10) this.aClass70_11.method1936()) {
			if (!this.aClass4_Sub2_Sub2_1.method546(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt865) {
						this.method973(local27, local29 + local27, local17, arg0, local29);
						local17.anInt865 -= local27;
						break;
					}
					this.method973(local17.anInt865, local27 + local29, local17, arg0, local29);
					local29 += local17.anInt865;
					local27 -= local17.anInt865;
				} while (!this.aClass4_Sub2_Sub2_1.method559(arg0, local17, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
	@Override
	public int method965() {
		return 0;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	@Override
	public void method964(@OriginalArg(0) int arg0) {
		this.aClass4_Sub2_Sub3_1.method964(arg0);
		for (@Pc(11) Class4_Sub10 local11 = (Class4_Sub10) this.aClass70_11.method1939(); local11 != null; local11 = (Class4_Sub10) this.aClass70_11.method1936()) {
			if (!this.aClass4_Sub2_Sub2_1.method546(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt865) {
						this.method971(local11, local21);
						local11.anInt865 -= local21;
						break;
					}
					this.method971(local11, local11.anInt865);
					local21 -= local11.anInt865;
				} while (!this.aClass4_Sub2_Sub2_1.method559(null, local11, 0, local21));
			}
		}
	}
}
