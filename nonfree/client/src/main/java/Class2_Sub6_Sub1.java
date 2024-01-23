import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "Lclient!wi;")
	public Class108 aClass108_9 = new Class108();

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "Lclient!uf;")
	public Class2_Sub6_Sub4 aClass2_Sub6_Sub4_1 = new Class2_Sub6_Sub4();

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Lclient!pg;")
	private Class2_Sub6_Sub3 aClass2_Sub6_Sub3_2;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) Class2_Sub6_Sub3 arg0) {
		this.aClass2_Sub6_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()I")
	@Override
	public int method3089() {
		return 0;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	@Override
	public void method3090(@OriginalArg(0) int arg0) {
		this.aClass2_Sub6_Sub4_1.method3090(arg0);
		for (@Pc(15) Class2_Sub15 local15 = (Class2_Sub15) this.aClass108_9.method3322(); local15 != null; local15 = (Class2_Sub15) this.aClass108_9.method3331()) {
			if (!this.aClass2_Sub6_Sub3_2.method2459(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2695 >= local25) {
						this.method1618(local25, local15);
						local15.anInt2695 -= local25;
						break;
					}
					this.method1618(local15.anInt2695, local15);
					local25 -= local15.anInt2695;
				} while (!this.aClass2_Sub6_Sub3_2.method2442(null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class2_Sub6 method3091() {
		@Pc(9) Class2_Sub15 local9 = (Class2_Sub15) this.aClass108_9.method3322();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub6_Sub2_1 == null) {
			return this.method3086();
		} else {
			return local9.aClass2_Sub6_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!lg;)V")
	private void method1618(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if ((this.aClass2_Sub6_Sub3_2.anIntArray356[arg1.anInt2708] & 0x4) != 0 && arg1.anInt2709 < 0) {
			@Pc(32) int local32 = this.aClass2_Sub6_Sub3_2.anIntArray364[arg1.anInt2708] / Static10.anInt374;
			@Pc(42) int local42 = (local32 + 1048575 - arg1.anInt2712) / local32;
			arg1.anInt2712 = arg1.anInt2712 + arg0 * local32 & 0xFFFFF;
			if (arg0 >= local42) {
				if (this.aClass2_Sub6_Sub3_2.anIntArray365[arg1.anInt2708] == 0) {
					arg1.aClass2_Sub6_Sub2_1 = Static226.method2281(arg1.aClass2_Sub9_Sub1_1, arg1.aClass2_Sub6_Sub2_1.method2287(), arg1.aClass2_Sub6_Sub2_1.method2276(), arg1.aClass2_Sub6_Sub2_1.method2286());
				} else {
					arg1.aClass2_Sub6_Sub2_1 = Static226.method2281(arg1.aClass2_Sub9_Sub1_1, arg1.aClass2_Sub6_Sub2_1.method2287(), 0, arg1.aClass2_Sub6_Sub2_1.method2286());
					this.aClass2_Sub6_Sub3_2.method2470(arg1, arg1.aClass2_Sub25_1.aShortArray137[arg1.anInt2704] < 0);
				}
				if (arg1.aClass2_Sub25_1.aShortArray137[arg1.anInt2704] < 0) {
					arg1.aClass2_Sub6_Sub2_1.method2302(-1);
				}
				arg0 = arg1.anInt2712 / local32;
			}
		}
		arg1.aClass2_Sub6_Sub2_1.method3090(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class2_Sub6 method3086() {
		@Pc(9) Class2_Sub15 local9;
		do {
			local9 = (Class2_Sub15) this.aClass108_9.method3331();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub6_Sub2_1 == null);
		return local9.aClass2_Sub6_Sub2_1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([III)V")
	@Override
	public void method3085(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub6_Sub4_1.method3085(arg0, arg1, arg2);
		for (@Pc(13) Class2_Sub15 local13 = (Class2_Sub15) this.aClass108_9.method3322(); local13 != null; local13 = (Class2_Sub15) this.aClass108_9.method3331()) {
			if (!this.aClass2_Sub6_Sub3_2.method2459(local13)) {
				@Pc(23) int local23 = arg2;
				@Pc(25) int local25 = arg1;
				do {
					if (local13.anInt2695 >= local23) {
						this.method1622(local23, arg0, local25 + local23, local13, local25);
						local13.anInt2695 -= local23;
						break;
					}
					this.method1622(local13.anInt2695, arg0, local23 + local25, local13, local25);
					local23 -= local13.anInt2695;
					local25 += local13.anInt2695;
				} while (!this.aClass2_Sub6_Sub3_2.method2442(arg0, local23, local25, local13));
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[IILclient!lg;I)V")
	private void method1622(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub15 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub6_Sub3_2.anIntArray356[arg3.anInt2708] & 0x4) != 0 && arg3.anInt2709 < 0) {
			@Pc(36) int local36 = this.aClass2_Sub6_Sub3_2.anIntArray364[arg3.anInt2708] / Static10.anInt374;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg3.anInt2712) / local36;
				if (local46 > arg0) {
					arg3.anInt2712 += arg0 * local36;
					break;
				}
				arg0 -= local46;
				arg3.aClass2_Sub6_Sub2_1.method3085(arg1, arg4, local46);
				@Pc(67) int local67 = Static10.anInt374 / 100;
				arg3.anInt2712 += local36 * local46 - 1048576;
				@Pc(81) int local81 = 262144 / local36;
				@Pc(84) Class2_Sub6_Sub2 local84 = arg3.aClass2_Sub6_Sub2_1;
				if (local81 < local67) {
					local67 = local81;
				}
				if (this.aClass2_Sub6_Sub3_2.anIntArray365[arg3.anInt2708] == 0) {
					arg3.aClass2_Sub6_Sub2_1 = Static226.method2281(arg3.aClass2_Sub9_Sub1_1, local84.method2287(), local84.method2276(), local84.method2286());
				} else {
					arg3.aClass2_Sub6_Sub2_1 = Static226.method2281(arg3.aClass2_Sub9_Sub1_1, local84.method2287(), 0, local84.method2286());
					this.aClass2_Sub6_Sub3_2.method2470(arg3, arg3.aClass2_Sub25_1.aShortArray137[arg3.anInt2704] < 0);
					arg3.aClass2_Sub6_Sub2_1.method2299(local67, local84.method2276());
				}
				arg4 += local46;
				if (arg3.aClass2_Sub25_1.aShortArray137[arg3.anInt2704] < 0) {
					arg3.aClass2_Sub6_Sub2_1.method2302(-1);
				}
				local84.method2269(local67);
				local84.method3085(arg1, arg4, arg2 - arg4);
				if (local84.method2304()) {
					this.aClass2_Sub6_Sub4_1.method3094(local84);
				}
			}
		}
		arg3.aClass2_Sub6_Sub2_1.method3085(arg1, arg4, arg0);
	}
}
