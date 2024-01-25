import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class1_Sub19_Sub3 extends Class1_Sub19 {

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "Lclient!oe;")
	public final Class181 aClass181_39 = new Class181();

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "Lclient!fw;")
	public final Class1_Sub19_Sub2 aClass1_Sub19_Sub2_2 = new Class1_Sub19_Sub2();

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "Lclient!mf;")
	private final Class1_Sub19_Sub4 aClass1_Sub19_Sub4_1;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!mf;)V")
	public Class1_Sub19_Sub3(@OriginalArg(0) Class1_Sub19_Sub4 arg0) {
		this.aClass1_Sub19_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	@Override
	public void method3650(@OriginalArg(0) int arg0) {
		this.aClass1_Sub19_Sub2_2.method3650(arg0);
		for (@Pc(15) Class1_Sub16 local15 = (Class1_Sub16) this.aClass181_39.method4112(); local15 != null; local15 = (Class1_Sub16) this.aClass181_39.method4104()) {
			if (!this.aClass1_Sub19_Sub4_1.method3681(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1957 >= local25) {
						this.method3332(local15, local25);
						local15.anInt1957 -= local25;
						break;
					}
					this.method3332(local15, local15.anInt1957);
					local25 -= local15.anInt1957;
				} while (!this.aClass1_Sub19_Sub4_1.method3662(local15, 0, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()Lclient!fp;")
	@Override
	public Class1_Sub19 method3649() {
		@Pc(9) Class1_Sub16 local9 = (Class1_Sub16) this.aClass181_39.method4112();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub19_Sub1_1 == null) {
			return this.method3651();
		} else {
			return local9.aClass1_Sub19_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()I")
	@Override
	public int method3646() {
		return 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI[IILclient!ej;I)V")
	private void method3328(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub16 arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub19_Sub4_1.anIntArray376[arg3.anInt1963] & 0x4) != 0 && arg3.anInt1966 < 0) {
			@Pc(32) int local32 = this.aClass1_Sub19_Sub4_1.anIntArray377[arg3.anInt1963] / Static247.anInt7108;
			while (true) {
				@Pc(43) int local43 = (local32 + 1048575 - arg3.anInt1970) / local32;
				if (arg4 < local43) {
					arg3.anInt1970 += local32 * arg4;
					break;
				}
				arg3.aClass1_Sub19_Sub1_1.method3647(arg1, arg2, local43);
				arg4 -= local43;
				arg3.anInt1970 += local32 * local43 - 1048576;
				arg2 += local43;
				@Pc(78) int local78 = Static247.anInt7108 / 100;
				@Pc(82) int local82 = 262144 / local32;
				if (local82 < local78) {
					local78 = local82;
				}
				@Pc(94) Class1_Sub19_Sub1 local94 = arg3.aClass1_Sub19_Sub1_1;
				if (this.aClass1_Sub19_Sub4_1.anIntArray369[arg3.anInt1963] == 0) {
					arg3.aClass1_Sub19_Sub1_1 = Static462.method2042(arg3.aClass1_Sub20_Sub1_1, local94.method2051(), local94.method2044(), local94.method2035());
				} else {
					arg3.aClass1_Sub19_Sub1_1 = Static462.method2042(arg3.aClass1_Sub20_Sub1_1, local94.method2051(), 0, local94.method2035());
					this.aClass1_Sub19_Sub4_1.method3686(arg3.aClass1_Sub10_1.aShortArray19[arg3.anInt1967] < 0, arg3);
					arg3.aClass1_Sub19_Sub1_1.method2054(local78, local94.method2044());
				}
				if (arg3.aClass1_Sub10_1.aShortArray19[arg3.anInt1967] < 0) {
					arg3.aClass1_Sub19_Sub1_1.method2038(-1);
				}
				local94.method2029(local78);
				local94.method3647(arg1, arg2, arg0 - arg2);
				if (local94.method2048()) {
					this.aClass1_Sub19_Sub2_2.method2188(local94);
				}
			}
		}
		arg3.aClass1_Sub19_Sub1_1.method3647(arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([III)V")
	@Override
	public void method3647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub19_Sub2_2.method3647(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub16 local17 = (Class1_Sub16) this.aClass181_39.method4112(); local17 != null; local17 = (Class1_Sub16) this.aClass181_39.method4104()) {
			if (!this.aClass1_Sub19_Sub4_1.method3681(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt1957 >= local29) {
						this.method3328(local27 + local29, arg0, local27, local17, local29);
						local17.anInt1957 -= local29;
						break;
					}
					this.method3328(local29 + local27, arg0, local27, local17, local17.anInt1957);
					local27 += local17.anInt1957;
					local29 -= local17.anInt1957;
				} while (!this.aClass1_Sub19_Sub4_1.method3662(local17, local27, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()Lclient!fp;")
	@Override
	public Class1_Sub19 method3651() {
		@Pc(9) Class1_Sub16 local9;
		do {
			local9 = (Class1_Sub16) this.aClass181_39.method4104();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub19_Sub1_1 == null);
		return local9.aClass1_Sub19_Sub1_1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ej;IB)V")
	private void method3332(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub19_Sub4_1.anIntArray376[arg0.anInt1963] & 0x4) != 0 && arg0.anInt1966 < 0) {
			@Pc(30) int local30 = this.aClass1_Sub19_Sub4_1.anIntArray377[arg0.anInt1963] / Static247.anInt7108;
			@Pc(41) int local41 = (local30 + 1048575 - arg0.anInt1970) / local30;
			arg0.anInt1970 = local30 * arg1 + arg0.anInt1970 & 0xFFFFF;
			if (local41 <= arg1) {
				if (this.aClass1_Sub19_Sub4_1.anIntArray369[arg0.anInt1963] == 0) {
					arg0.aClass1_Sub19_Sub1_1 = Static462.method2042(arg0.aClass1_Sub20_Sub1_1, arg0.aClass1_Sub19_Sub1_1.method2051(), arg0.aClass1_Sub19_Sub1_1.method2044(), arg0.aClass1_Sub19_Sub1_1.method2035());
				} else {
					arg0.aClass1_Sub19_Sub1_1 = Static462.method2042(arg0.aClass1_Sub20_Sub1_1, arg0.aClass1_Sub19_Sub1_1.method2051(), 0, arg0.aClass1_Sub19_Sub1_1.method2035());
					this.aClass1_Sub19_Sub4_1.method3686(arg0.aClass1_Sub10_1.aShortArray19[arg0.anInt1967] < 0, arg0);
				}
				if (arg0.aClass1_Sub10_1.aShortArray19[arg0.anInt1967] < 0) {
					arg0.aClass1_Sub19_Sub1_1.method2038(-1);
				}
				arg1 = arg0.anInt1970 / local30;
			}
		}
		arg0.aClass1_Sub19_Sub1_1.method3650(arg1);
	}
}
