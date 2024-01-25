import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class5_Sub14_Sub5 extends Class5_Sub14 {

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "Lclient!ga;")
	public final Class124 aClass124_108 = new Class124();

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "Lclient!fe;")
	public final Class5_Sub14_Sub3 aClass5_Sub14_Sub3_2 = new Class5_Sub14_Sub3();

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "Lclient!hk;")
	private final Class5_Sub14_Sub4 aClass5_Sub14_Sub4_36;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class5_Sub14_Sub5(@OriginalArg(0) Class5_Sub14_Sub4 arg0) {
		this.aClass5_Sub14_Sub4_36 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "()I")
	@Override
	public int method8783() {
		return 0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[ILclient!uw;BII)V")
	private void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class5_Sub53 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub14_Sub4_36.anIntArray219[arg2.anInt9937] & 0x4) != 0 && arg2.anInt9942 < 0) {
			@Pc(30) int local30 = this.aClass5_Sub14_Sub4_36.anIntArray214[arg2.anInt9937] / Static227.anInt3654;
			while (true) {
				@Pc(39) int local39 = (local30 + 1048575 - arg2.anInt9921) / local30;
				if (arg0 < local39) {
					arg2.anInt9921 += local30 * arg0;
					break;
				}
				arg2.aClass5_Sub14_Sub1_4.method8781(arg1, arg4, local39);
				arg0 -= local39;
				arg2.anInt9921 += local39 * local30 - 1048576;
				arg4 += local39;
				@Pc(70) int local70 = Static227.anInt3654 / 100;
				@Pc(74) int local74 = 262144 / local30;
				if (local74 < local70) {
					local70 = local74;
				}
				@Pc(82) Class5_Sub14_Sub1 local82 = arg2.aClass5_Sub14_Sub1_4;
				if (this.aClass5_Sub14_Sub4_36.anIntArray209[arg2.anInt9937] == 0) {
					arg2.aClass5_Sub14_Sub1_4 = Static678.method1349(arg2.aClass5_Sub9_Sub1_4, local82.method1347(), local82.method1355(), local82.method1339());
				} else {
					arg2.aClass5_Sub14_Sub1_4 = Static678.method1349(arg2.aClass5_Sub9_Sub1_4, local82.method1347(), 0, local82.method1339());
					this.aClass5_Sub14_Sub4_36.method3222(arg2.aClass5_Sub46_1.aShortArray104[arg2.anInt9934] < 0, arg2);
					arg2.aClass5_Sub14_Sub1_4.method1341(local70, local82.method1355());
				}
				if (arg2.aClass5_Sub46_1.aShortArray104[arg2.anInt9934] < 0) {
					arg2.aClass5_Sub14_Sub1_4.method1361(-1);
				}
				local82.method1340(local70);
				local82.method8781(arg1, arg4, arg3 - arg4);
				if (local82.method1371()) {
					this.aClass5_Sub14_Sub3_2.method2298(local82);
				}
			}
		}
		arg2.aClass5_Sub14_Sub1_4.method8781(arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8780() {
		@Pc(9) Class5_Sub53 local9;
		do {
			local9 = (Class5_Sub53) this.aClass124_108.method2569();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub14_Sub1_4 == null);
		return local9.aClass5_Sub14_Sub1_4;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public void method8778(@OriginalArg(0) int arg0) {
		this.aClass5_Sub14_Sub3_2.method8778(arg0);
		for (@Pc(15) Class5_Sub53 local15 = (Class5_Sub53) this.aClass124_108.method2572(); local15 != null; local15 = (Class5_Sub53) this.aClass124_108.method2569()) {
			if (!this.aClass5_Sub14_Sub4_36.method3234(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt9923) {
						this.method8788(local25, local15);
						local15.anInt9923 -= local25;
						break;
					}
					this.method8788(local15.anInt9923, local15);
					local25 -= local15.anInt9923;
				} while (!this.aClass5_Sub14_Sub4_36.method3252(0, (int[]) null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([III)V")
	@Override
	public void method8781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub14_Sub3_2.method8781(arg0, arg1, arg2);
		for (@Pc(15) Class5_Sub53 local15 = (Class5_Sub53) this.aClass124_108.method2572(); local15 != null; local15 = (Class5_Sub53) this.aClass124_108.method2569()) {
			if (!this.aClass5_Sub14_Sub4_36.method3234(local15)) {
				@Pc(24) int local24 = arg2;
				@Pc(26) int local26 = arg1;
				do {
					if (local15.anInt9923 >= local24) {
						this.method8785(local24, arg0, local15, local24 + local26, local26);
						local15.anInt9923 -= local24;
						break;
					}
					this.method8785(local15.anInt9923, arg0, local15, local24 + local26, local26);
					local26 += local15.anInt9923;
					local24 -= local15.anInt9923;
				} while (!this.aClass5_Sub14_Sub4_36.method3252(local26, arg0, local24, local15));
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!uw;)V")
	private void method8788(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub53 arg1) {
		if ((this.aClass5_Sub14_Sub4_36.anIntArray219[arg1.anInt9937] & 0x4) != 0 && arg1.anInt9942 < 0) {
			@Pc(33) int local33 = this.aClass5_Sub14_Sub4_36.anIntArray214[arg1.anInt9937] / Static227.anInt3654;
			@Pc(43) int local43 = (local33 + 1048575 - arg1.anInt9921) / local33;
			arg1.anInt9921 = arg1.anInt9921 + local33 * arg0 & 0xFFFFF;
			if (local43 <= arg0) {
				if (this.aClass5_Sub14_Sub4_36.anIntArray209[arg1.anInt9937] == 0) {
					arg1.aClass5_Sub14_Sub1_4 = Static678.method1349(arg1.aClass5_Sub9_Sub1_4, arg1.aClass5_Sub14_Sub1_4.method1347(), arg1.aClass5_Sub14_Sub1_4.method1355(), arg1.aClass5_Sub14_Sub1_4.method1339());
				} else {
					arg1.aClass5_Sub14_Sub1_4 = Static678.method1349(arg1.aClass5_Sub9_Sub1_4, arg1.aClass5_Sub14_Sub1_4.method1347(), 0, arg1.aClass5_Sub14_Sub1_4.method1339());
					this.aClass5_Sub14_Sub4_36.method3222(arg1.aClass5_Sub46_1.aShortArray104[arg1.anInt9934] < 0, arg1);
				}
				if (arg1.aClass5_Sub46_1.aShortArray104[arg1.anInt9934] < 0) {
					arg1.aClass5_Sub14_Sub1_4.method1361(-1);
				}
				arg0 = arg1.anInt9921 / local33;
			}
		}
		arg1.aClass5_Sub14_Sub1_4.method8778(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "()Lclient!eha;")
	@Override
	public Class5_Sub14 method8779() {
		@Pc(9) Class5_Sub53 local9 = (Class5_Sub53) this.aClass124_108.method2572();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub14_Sub1_4 == null) {
			return this.method8780();
		} else {
			return local9.aClass5_Sub14_Sub1_4;
		}
	}
}
