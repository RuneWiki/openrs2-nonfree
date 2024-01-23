import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Lclient!ab;")
	public Class3 aClass3_7 = new Class3();

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "Lclient!pd;")
	public Class1_Sub4_Sub4 aClass1_Sub4_Sub4_2 = new Class1_Sub4_Sub4();

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "Lclient!el;")
	private Class1_Sub4_Sub2 aClass1_Sub4_Sub2_3;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!el;)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class1_Sub4_Sub2 arg0) {
		this.aClass1_Sub4_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()Lclient!ta;")
	@Override
	public Class1_Sub4 method3073() {
		@Pc(5) Class1_Sub19 local5 = (Class1_Sub19) this.aClass3_7.method30();
		if (local5 == null) {
			return null;
		} else if (local5.aClass1_Sub4_Sub3_1 == null) {
			return this.method3075();
		} else {
			return local5.aClass1_Sub4_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!ne;)V")
	private void method660(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if ((this.aClass1_Sub4_Sub2_3.anIntArray131[arg1.anInt3730] & 0x4) != 0 && arg1.anInt3726 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub4_Sub2_3.anIntArray128[arg1.anInt3730] / Static107.anInt2862;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt3732) / local23;
			arg1.anInt3732 = arg1.anInt3732 + arg0 * local23 & 0xFFFFF;
			if (arg0 >= local33) {
				if (this.aClass1_Sub4_Sub2_3.anIntArray130[arg1.anInt3730] == 0) {
					arg1.aClass1_Sub4_Sub3_1 = Static269.method1420(arg1.aClass1_Sub7_Sub1_1, arg1.aClass1_Sub4_Sub3_1.method1393(), arg1.aClass1_Sub4_Sub3_1.method1400(), arg1.aClass1_Sub4_Sub3_1.method1389());
				} else {
					arg1.aClass1_Sub4_Sub3_1 = Static269.method1420(arg1.aClass1_Sub7_Sub1_1, arg1.aClass1_Sub4_Sub3_1.method1393(), 0, arg1.aClass1_Sub4_Sub3_1.method1389());
					this.aClass1_Sub4_Sub2_3.method1217(arg1.aClass1_Sub29_1.aShortArray67[arg1.anInt3737] < 0, arg1);
				}
				if (arg1.aClass1_Sub29_1.aShortArray67[arg1.anInt3737] < 0) {
					arg1.aClass1_Sub4_Sub3_1.method1422(-1);
				}
				arg0 = arg1.anInt3732 / local23;
			}
		}
		arg1.aClass1_Sub4_Sub3_1.method3074(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
	@Override
	public void method3074(@OriginalArg(0) int arg0) {
		this.aClass1_Sub4_Sub4_2.method3074(arg0);
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) this.aClass3_7.method30(); local15 != null; local15 = (Class1_Sub19) this.aClass3_7.method33()) {
			if (!this.aClass1_Sub4_Sub2_3.method1245(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3728 >= local25) {
						this.method660(local25, local15);
						local15.anInt3728 -= local25;
						break;
					}
					this.method660(local15.anInt3728, local15);
					local25 -= local15.anInt3728;
				} while (!this.aClass1_Sub4_Sub2_3.method1246(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ne;[IIIII)V")
	private void method661(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub4_Sub2_3.anIntArray131[arg0.anInt3730] & 0x4) != 0 && arg0.anInt3726 < 0) {
			@Pc(37) int local37 = this.aClass1_Sub4_Sub2_3.anIntArray128[arg0.anInt3730] / Static107.anInt2862;
			while (true) {
				@Pc(47) int local47 = (local37 + 1048575 - arg0.anInt3732) / local37;
				if (local47 > arg2) {
					arg0.anInt3732 += local37 * arg2;
					break;
				}
				arg0.aClass1_Sub4_Sub3_1.method3072(arg1, arg3, local47);
				arg3 += local47;
				@Pc(68) int local68 = 262144 / local37;
				arg0.anInt3732 += local47 * local37 - 1048576;
				@Pc(82) int local82 = Static107.anInt2862 / 100;
				arg2 -= local47;
				if (local68 < local82) {
					local82 = local68;
				}
				@Pc(94) Class1_Sub4_Sub3 local94 = arg0.aClass1_Sub4_Sub3_1;
				if (this.aClass1_Sub4_Sub2_3.anIntArray130[arg0.anInt3730] == 0) {
					arg0.aClass1_Sub4_Sub3_1 = Static269.method1420(arg0.aClass1_Sub7_Sub1_1, local94.method1393(), local94.method1400(), local94.method1389());
				} else {
					arg0.aClass1_Sub4_Sub3_1 = Static269.method1420(arg0.aClass1_Sub7_Sub1_1, local94.method1393(), 0, local94.method1389());
					this.aClass1_Sub4_Sub2_3.method1217(arg0.aClass1_Sub29_1.aShortArray67[arg0.anInt3737] < 0, arg0);
					arg0.aClass1_Sub4_Sub3_1.method1406(local82, local94.method1400());
				}
				if (arg0.aClass1_Sub29_1.aShortArray67[arg0.anInt3737] < 0) {
					arg0.aClass1_Sub4_Sub3_1.method1422(-1);
				}
				local94.method1386(local82);
				local94.method3072(arg1, arg3, arg4 - arg3);
				if (local94.method1413()) {
					this.aClass1_Sub4_Sub4_2.method3080(local94);
				}
			}
		}
		arg0.aClass1_Sub4_Sub3_1.method3072(arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()Lclient!ta;")
	@Override
	public Class1_Sub4 method3075() {
		@Pc(9) Class1_Sub19 local9;
		do {
			local9 = (Class1_Sub19) this.aClass3_7.method33();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub4_Sub3_1 == null);
		return local9.aClass1_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "()I")
	@Override
	public int method3076() {
		return 0;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "([III)V")
	@Override
	public void method3072(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub4_Sub4_2.method3072(arg0, arg1, arg2);
		for (@Pc(13) Class1_Sub19 local13 = (Class1_Sub19) this.aClass3_7.method30(); local13 != null; local13 = (Class1_Sub19) this.aClass3_7.method33()) {
			if (!this.aClass1_Sub4_Sub2_3.method1245(local13)) {
				@Pc(23) int local23 = arg2;
				@Pc(25) int local25 = arg1;
				do {
					if (local13.anInt3728 >= local23) {
						this.method661(local13, arg0, local23, local25, local23 + local25);
						local13.anInt3728 -= local23;
						break;
					}
					this.method661(local13, arg0, local13.anInt3728, local25, local25 + local23);
					local23 -= local13.anInt3728;
					local25 += local13.anInt3728;
				} while (!this.aClass1_Sub4_Sub2_3.method1246(local23, local13, arg0, local25));
			}
		}
	}
}
