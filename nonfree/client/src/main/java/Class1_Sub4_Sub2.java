import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "Lclient!sf;")
	public Class105 aClass105_9 = new Class105();

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "Lclient!n;")
	public Class1_Sub4_Sub3 aClass1_Sub4_Sub3_1 = new Class1_Sub4_Sub3();

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "Lclient!bh;")
	private Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!bh;)V")
	public Class1_Sub4_Sub2(@OriginalArg(0) Class1_Sub4_Sub1 arg0) {
		this.aClass1_Sub4_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "()I")
	@Override
	public int method2356() {
		return 0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!bc;III[II)V")
	private void method1208(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub4_Sub1_1.anIntArray24[arg0.anInt352] & 0x4) != 0 && arg0.anInt369 < 0) {
			@Pc(29) int local29 = this.aClass1_Sub4_Sub1_1.anIntArray23[arg0.anInt352] / Static31.anInt702;
			while (true) {
				@Pc(40) int local40 = (local29 + 1048575 - arg0.anInt358) / local29;
				if (local40 > arg4) {
					arg0.anInt358 += arg4 * local29;
					break;
				}
				arg4 -= local40;
				arg0.aClass1_Sub4_Sub4_1.method2355(arg3, arg1, local40);
				@Pc(61) int local61 = Static31.anInt702 / 100;
				arg1 += local40;
				@Pc(69) int local69 = 262144 / local29;
				if (local61 > local69) {
					local61 = local69;
				}
				arg0.anInt358 += local29 * local40 - 1048576;
				@Pc(87) Class1_Sub4_Sub4 local87 = arg0.aClass1_Sub4_Sub4_1;
				if (this.aClass1_Sub4_Sub1_1.anIntArray33[arg0.anInt352] == 0) {
					arg0.aClass1_Sub4_Sub4_1 = Static237.method2378(arg0.aClass1_Sub6_Sub1_1, local87.method2391(), local87.method2397(), local87.method2363());
				} else {
					arg0.aClass1_Sub4_Sub4_1 = Static237.method2378(arg0.aClass1_Sub6_Sub1_1, local87.method2391(), 0, local87.method2363());
					this.aClass1_Sub4_Sub1_1.method361(arg0.aClass1_Sub9_1.aShortArray8[arg0.anInt366] < 0, arg0);
					arg0.aClass1_Sub4_Sub4_1.method2395(local61, local87.method2397());
				}
				if (arg0.aClass1_Sub9_1.aShortArray8[arg0.anInt366] < 0) {
					arg0.aClass1_Sub4_Sub4_1.method2389(-1);
				}
				local87.method2394(local61);
				local87.method2355(arg3, arg1, arg2 - arg1);
				if (local87.method2393()) {
					this.aClass1_Sub4_Sub3_1.method2306(local87);
				}
			}
		}
		arg0.aClass1_Sub4_Sub4_1.method2355(arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()Lclient!r;")
	@Override
	public Class1_Sub4 method2354() {
		@Pc(9) Class1_Sub3 local9;
		do {
			local9 = (Class1_Sub3) this.aClass105_9.method3109();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub4_Sub4_1 == null);
		return local9.aClass1_Sub4_Sub4_1;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	@Override
	public void method2357(@OriginalArg(0) int arg0) {
		this.aClass1_Sub4_Sub3_1.method2357(arg0);
		for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass105_9.method3120(); local15 != null; local15 = (Class1_Sub3) this.aClass105_9.method3109()) {
			if (!this.aClass1_Sub4_Sub1_1.method374(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt374) {
						this.method1211(local15, local25);
						local15.anInt374 -= local25;
						break;
					}
					this.method1211(local15, local15.anInt374);
					local25 -= local15.anInt374;
				} while (!this.aClass1_Sub4_Sub1_1.method378(0, null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()Lclient!r;")
	@Override
	public Class1_Sub4 method2353() {
		@Pc(9) Class1_Sub3 local9 = (Class1_Sub3) this.aClass105_9.method3120();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub4_Sub4_1 == null) {
			return this.method2354();
		} else {
			return local9.aClass1_Sub4_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([III)V")
	@Override
	public void method2355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub4_Sub3_1.method2355(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub3 local17 = (Class1_Sub3) this.aClass105_9.method3120(); local17 != null; local17 = (Class1_Sub3) this.aClass105_9.method3109()) {
			if (!this.aClass1_Sub4_Sub1_1.method374(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt374 >= local27) {
						this.method1208(local17, local29, local29 + local27, arg0, local27);
						local17.anInt374 -= local27;
						break;
					}
					this.method1208(local17, local29, local27 + local29, arg0, local17.anInt374);
					local29 += local17.anInt374;
					local27 -= local17.anInt374;
				} while (!this.aClass1_Sub4_Sub1_1.method378(local29, arg0, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!bc;I)V")
	private void method1211(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub4_Sub1_1.anIntArray24[arg0.anInt352] & 0x4) != 0 && arg0.anInt369 < 0) {
			@Pc(24) int local24 = this.aClass1_Sub4_Sub1_1.anIntArray23[arg0.anInt352] / Static31.anInt702;
			@Pc(33) int local33 = (local24 + 1048575 - arg0.anInt358) / local24;
			arg0.anInt358 = local24 * arg1 + arg0.anInt358 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass1_Sub4_Sub1_1.anIntArray33[arg0.anInt352] == 0) {
					arg0.aClass1_Sub4_Sub4_1 = Static237.method2378(arg0.aClass1_Sub6_Sub1_1, arg0.aClass1_Sub4_Sub4_1.method2391(), arg0.aClass1_Sub4_Sub4_1.method2397(), arg0.aClass1_Sub4_Sub4_1.method2363());
				} else {
					arg0.aClass1_Sub4_Sub4_1 = Static237.method2378(arg0.aClass1_Sub6_Sub1_1, arg0.aClass1_Sub4_Sub4_1.method2391(), 0, arg0.aClass1_Sub4_Sub4_1.method2363());
					this.aClass1_Sub4_Sub1_1.method361(arg0.aClass1_Sub9_1.aShortArray8[arg0.anInt366] < 0, arg0);
				}
				if (arg0.aClass1_Sub9_1.aShortArray8[arg0.anInt366] < 0) {
					arg0.aClass1_Sub4_Sub4_1.method2389(-1);
				}
				arg1 = arg0.anInt358 / local24;
			}
		}
		arg0.aClass1_Sub4_Sub4_1.method2357(arg1);
	}
}
