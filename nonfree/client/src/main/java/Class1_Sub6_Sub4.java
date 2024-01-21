import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "Lclient!v;")
	public final Class91 aClass91_12 = new Class91();

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "Lclient!lg;")
	public final Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2 = new Class1_Sub6_Sub1();

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "Lclient!ma;")
	private final Class1_Sub6_Sub2 aClass1_Sub6_Sub2_2;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ma;)V")
	public Class1_Sub6_Sub4(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		this.aClass1_Sub6_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIILclient!wf;II)V")
	private void method2377(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub27 arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass1_Sub6_Sub2_2.anIntArray312[arg3.anInt4424] & 0x4) != 0 && arg3.anInt4407 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub6_Sub2_2.anIntArray322[arg3.anInt4424] / Static178.anInt4019;
			while (true) {
				@Pc(32) int local32 = (local23 + 1048575 - arg3.anInt4426) / local23;
				if (local32 > arg1) {
					arg3.anInt4426 += arg1 * local23;
					break;
				}
				arg1 -= local32;
				arg3.aClass1_Sub6_Sub3_3.method2371(arg0, arg4, local32);
				@Pc(48) Class1_Sub6_Sub3 local48 = arg3.aClass1_Sub6_Sub3_3;
				@Pc(52) int local52 = 262144 / local23;
				arg4 += local32;
				@Pc(60) int local60 = Static178.anInt4019 / 100;
				if (local52 < local60) {
					local60 = local52;
				}
				arg3.anInt4426 += local32 * local23 - 1048576;
				if (this.aClass1_Sub6_Sub2_2.anIntArray317[arg3.anInt4424] == 0) {
					arg3.aClass1_Sub6_Sub3_3 = Static216.method2204(arg3.aClass1_Sub19_Sub1_1, local48.method2219(), local48.method2186(), local48.method2187());
				} else {
					arg3.aClass1_Sub6_Sub3_3 = Static216.method2204(arg3.aClass1_Sub19_Sub1_1, local48.method2219(), 0, local48.method2187());
					this.aClass1_Sub6_Sub2_2.method2062(arg3, arg3.aClass1_Sub17_1.aShortArray35[arg3.anInt4419] < 0);
					arg3.aClass1_Sub6_Sub3_3.method2202(local60, local48.method2186());
				}
				if (arg3.aClass1_Sub17_1.aShortArray35[arg3.anInt4419] < 0) {
					arg3.aClass1_Sub6_Sub3_3.method2184(-1);
				}
				local48.method2217(local60);
				local48.method2371(arg0, arg4, arg2 - arg4);
				if (local48.method2191()) {
					this.aClass1_Sub6_Sub1_2.method1995(local48);
				}
			}
		}
		arg3.aClass1_Sub6_Sub3_3.method2371(arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "()Lclient!d;")
	@Override
	public Class1_Sub6 method2369() {
		@Pc(9) Class1_Sub27 local9;
		do {
			local9 = (Class1_Sub27) this.aClass91_12.method3150();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub6_Sub3_3 == null);
		return local9.aClass1_Sub6_Sub3_3;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!wf;)V")
	private void method2379(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub27 arg1) {
		if ((this.aClass1_Sub6_Sub2_2.anIntArray312[arg1.anInt4424] & 0x4) != 0 && arg1.anInt4407 < 0) {
			@Pc(24) int local24 = this.aClass1_Sub6_Sub2_2.anIntArray322[arg1.anInt4424] / Static178.anInt4019;
			@Pc(35) int local35 = (local24 + 1048575 - arg1.anInt4426) / local24;
			arg1.anInt4426 = arg1.anInt4426 + arg0 * local24 & 0xFFFFF;
			if (arg0 >= local35) {
				if (this.aClass1_Sub6_Sub2_2.anIntArray317[arg1.anInt4424] == 0) {
					arg1.aClass1_Sub6_Sub3_3 = Static216.method2204(arg1.aClass1_Sub19_Sub1_1, arg1.aClass1_Sub6_Sub3_3.method2219(), arg1.aClass1_Sub6_Sub3_3.method2186(), arg1.aClass1_Sub6_Sub3_3.method2187());
				} else {
					arg1.aClass1_Sub6_Sub3_3 = Static216.method2204(arg1.aClass1_Sub19_Sub1_1, arg1.aClass1_Sub6_Sub3_3.method2219(), 0, arg1.aClass1_Sub6_Sub3_3.method2187());
					this.aClass1_Sub6_Sub2_2.method2062(arg1, arg1.aClass1_Sub17_1.aShortArray35[arg1.anInt4419] < 0);
				}
				if (arg1.aClass1_Sub17_1.aShortArray35[arg1.anInt4419] < 0) {
					arg1.aClass1_Sub6_Sub3_3.method2184(-1);
				}
				arg0 = arg1.anInt4426 / local24;
			}
		}
		arg1.aClass1_Sub6_Sub3_3.method2373(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()Lclient!d;")
	@Override
	public Class1_Sub6 method2368() {
		@Pc(9) Class1_Sub27 local9 = (Class1_Sub27) this.aClass91_12.method3148();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub6_Sub3_3 == null) {
			return this.method2369();
		} else {
			return local9.aClass1_Sub6_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "()I")
	@Override
	public int method2374() {
		return 0;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public void method2373(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_Sub1_2.method2373(arg0);
		for (@Pc(15) Class1_Sub27 local15 = (Class1_Sub27) this.aClass91_12.method3148(); local15 != null; local15 = (Class1_Sub27) this.aClass91_12.method3150()) {
			if (!this.aClass1_Sub6_Sub2_2.method2074(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt4421 >= local25) {
						this.method2379(local25, local15);
						local15.anInt4421 -= local25;
						break;
					}
					this.method2379(local15.anInt4421, local15);
					local25 -= local15.anInt4421;
				} while (!this.aClass1_Sub6_Sub2_2.method2051(null, local25, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V")
	@Override
	public void method2371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub6_Sub1_2.method2371(arg0, arg1, arg2);
		for (@Pc(15) Class1_Sub27 local15 = (Class1_Sub27) this.aClass91_12.method3148(); local15 != null; local15 = (Class1_Sub27) this.aClass91_12.method3150()) {
			if (!this.aClass1_Sub6_Sub2_2.method2074(local15)) {
				@Pc(24) int local24 = arg1;
				@Pc(26) int local26 = arg2;
				do {
					if (local26 <= local15.anInt4421) {
						this.method2377(arg0, local26, local24 + local26, local15, local24);
						local15.anInt4421 -= local26;
						break;
					}
					this.method2377(arg0, local15.anInt4421, local26 + local24, local15, local24);
					local24 += local15.anInt4421;
					local26 -= local15.anInt4421;
				} while (!this.aClass1_Sub6_Sub2_2.method2051(arg0, local26, local15, local24));
			}
		}
	}
}
