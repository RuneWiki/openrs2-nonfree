import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class10_Sub7_Sub3 extends Class10_Sub7 {

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!mf;")
	public final Class163 aClass163_32 = new Class163();

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!ew;")
	public final Class10_Sub7_Sub2 aClass10_Sub7_Sub2_3 = new Class10_Sub7_Sub2();

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Lclient!rv;")
	private final Class10_Sub7_Sub4 aClass10_Sub7_Sub4_2;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class10_Sub7_Sub3(@OriginalArg(0) Class10_Sub7_Sub4 arg0) {
		this.aClass10_Sub7_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()Lclient!sc;")
	@Override
	public Class10_Sub7 method4816() {
		@Pc(9) Class10_Sub35 local9;
		do {
			local9 = (Class10_Sub35) this.aClass163_32.method3621();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass10_Sub7_Sub1_4 == null);
		return local9.aClass10_Sub7_Sub1_4;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!pg;)V")
	private void method4033(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub35 arg1) {
		if ((this.aClass10_Sub7_Sub4_2.anIntArray592[arg1.anInt5340] & 0x4) != 0 && arg1.anInt5347 < 0) {
			@Pc(32) int local32 = this.aClass10_Sub7_Sub4_2.anIntArray591[arg1.anInt5340] / Static438.anInt7333;
			@Pc(42) int local42 = (local32 + 1048575 - arg1.anInt5358) / local32;
			arg1.anInt5358 = local32 * arg0 + arg1.anInt5358 & 0xFFFFF;
			if (local42 <= arg0) {
				if (this.aClass10_Sub7_Sub4_2.anIntArray595[arg1.anInt5340] == 0) {
					arg1.aClass10_Sub7_Sub1_4 = Static462.method591(arg1.aClass10_Sub25_Sub1_2, arg1.aClass10_Sub7_Sub1_4.method598(), arg1.aClass10_Sub7_Sub1_4.method588(), arg1.aClass10_Sub7_Sub1_4.method618());
				} else {
					arg1.aClass10_Sub7_Sub1_4 = Static462.method591(arg1.aClass10_Sub25_Sub1_2, arg1.aClass10_Sub7_Sub1_4.method598(), 0, arg1.aClass10_Sub7_Sub1_4.method618());
					this.aClass10_Sub7_Sub4_2.method4822(arg1.aClass10_Sub15_1.aShortArray17[arg1.anInt5342] < 0, arg1);
				}
				if (arg1.aClass10_Sub15_1.aShortArray17[arg1.anInt5342] < 0) {
					arg1.aClass10_Sub7_Sub1_4.method623(-1);
				}
				arg0 = arg1.anInt5358 / local32;
			}
		}
		arg1.aClass10_Sub7_Sub1_4.method4817(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)V")
	@Override
	public void method4813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass10_Sub7_Sub2_3.method4813(arg0, arg1, arg2);
		for (@Pc(17) Class10_Sub35 local17 = (Class10_Sub35) this.aClass163_32.method3620(); local17 != null; local17 = (Class10_Sub35) this.aClass163_32.method3621()) {
			if (!this.aClass10_Sub7_Sub4_2.method4832(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt5355 >= local27) {
						this.method4036(local27 + local29, local29, local17, arg0, local27);
						local17.anInt5355 -= local27;
						break;
					}
					this.method4036(local29 + local27, local29, local17, arg0, local17.anInt5355);
					local29 += local17.anInt5355;
					local27 -= local17.anInt5355;
				} while (!this.aClass10_Sub7_Sub4_2.method4829(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method4817(@OriginalArg(0) int arg0) {
		this.aClass10_Sub7_Sub2_3.method4817(arg0);
		for (@Pc(15) Class10_Sub35 local15 = (Class10_Sub35) this.aClass163_32.method3620(); local15 != null; local15 = (Class10_Sub35) this.aClass163_32.method3621()) {
			if (!this.aClass10_Sub7_Sub4_2.method4832(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt5355) {
						this.method4033(local25, local15);
						local15.anInt5355 -= local25;
						break;
					}
					this.method4033(local15.anInt5355, local15);
					local25 -= local15.anInt5355;
				} while (!this.aClass10_Sub7_Sub4_2.method4829(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lclient!sc;")
	@Override
	public Class10_Sub7 method4818() {
		@Pc(9) Class10_Sub35 local9 = (Class10_Sub35) this.aClass163_32.method3620();
		if (local9 == null) {
			return null;
		} else if (local9.aClass10_Sub7_Sub1_4 == null) {
			return this.method4816();
		} else {
			return local9.aClass10_Sub7_Sub1_4;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!pg;[III)V")
	private void method4036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub35 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass10_Sub7_Sub4_2.anIntArray592[arg2.anInt5340] & 0x4) != 0 && arg2.anInt5347 < 0) {
			@Pc(23) int local23 = this.aClass10_Sub7_Sub4_2.anIntArray591[arg2.anInt5340] / Static438.anInt7333;
			while (true) {
				@Pc(34) int local34 = (local23 + 1048575 - arg2.anInt5358) / local23;
				if (local34 > arg4) {
					arg2.anInt5358 += local23 * arg4;
					break;
				}
				arg2.aClass10_Sub7_Sub1_4.method4813(arg3, arg1, local34);
				arg4 -= local34;
				arg2.anInt5358 += local34 * local23 - 1048576;
				arg1 += local34;
				@Pc(65) int local65 = Static438.anInt7333 / 100;
				@Pc(69) int local69 = 262144 / local23;
				if (local69 < local65) {
					local65 = local69;
				}
				@Pc(81) Class10_Sub7_Sub1 local81 = arg2.aClass10_Sub7_Sub1_4;
				if (this.aClass10_Sub7_Sub4_2.anIntArray595[arg2.anInt5340] == 0) {
					arg2.aClass10_Sub7_Sub1_4 = Static462.method591(arg2.aClass10_Sub25_Sub1_2, local81.method598(), local81.method588(), local81.method618());
				} else {
					arg2.aClass10_Sub7_Sub1_4 = Static462.method591(arg2.aClass10_Sub25_Sub1_2, local81.method598(), 0, local81.method618());
					this.aClass10_Sub7_Sub4_2.method4822(arg2.aClass10_Sub15_1.aShortArray17[arg2.anInt5342] < 0, arg2);
					arg2.aClass10_Sub7_Sub1_4.method605(local65, local81.method588());
				}
				if (arg2.aClass10_Sub15_1.aShortArray17[arg2.anInt5342] < 0) {
					arg2.aClass10_Sub7_Sub1_4.method623(-1);
				}
				local81.method612(local65);
				local81.method4813(arg3, arg1, arg0 - arg1);
				if (local81.method594()) {
					this.aClass10_Sub7_Sub2_3.method1844(local81);
				}
			}
		}
		arg2.aClass10_Sub7_Sub1_4.method4813(arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
	@Override
	public int method4819() {
		return 0;
	}
}
