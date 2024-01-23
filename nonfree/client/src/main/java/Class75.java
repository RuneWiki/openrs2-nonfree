import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class75 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!ff;")
	private Class33 aClass33_10 = new Class33(256);

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!ff;")
	private Class33 aClass33_11 = new Class33(256);

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!ai;")
	private Class7 aClass7_31;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!ai;")
	private Class7 aClass7_32;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!ai;Lclient!ai;)V")
	public Class75(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1) {
		this.aClass7_31 = arg0;
		this.aClass7_32 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[II)Lclient!pd;")
	public Class1_Sub19_Sub1 method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass7_31.method3237() == 1) {
			return this.method2495(arg0, arg1, 0);
		} else if (this.aClass7_31.method3246(arg0) == 1) {
			return this.method2495(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[III)Lclient!pd;")
	private Class1_Sub19_Sub1 method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = (arg2 << 4 & 0xFFF8 | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local11 | arg2 << 16;
		@Pc(28) long local28 = (long) local21;
		@Pc(35) Class1_Sub19_Sub1 local35 = (Class1_Sub19_Sub1) this.aClass33_11.method1071(local28);
		if (local35 != null) {
			return local35;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(56) Class30 local56 = Static223.method1057(this.aClass7_31, arg2, arg0);
			if (local56 == null) {
				return null;
			}
			local35 = local56.method1055();
			this.aClass33_11.method1072(local28, local35);
			if (arg1 != null) {
				arg1[0] -= local35.aByteArray42.length;
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[I)Lclient!pd;")
	private Class1_Sub19_Sub1 method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x10000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub19_Sub1 local33 = (Class1_Sub19_Sub1) this.aClass33_11.method1071(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class1_Sub25 local55 = (Class1_Sub25) this.aClass33_10.method1071(local26);
			if (local55 == null) {
				local55 = Static169.method2759(this.aClass7_32, arg0, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass33_10.method1072(local26, local55);
			}
			local33 = local55.method2751(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method3530();
				this.aClass33_11.method1072(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIB)Lclient!pd;")
	public Class1_Sub19_Sub1 method2497(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass7_32.method3237() == 1) {
			return this.method2496(0, arg1, arg0);
		} else if (this.aClass7_32.method3246(arg1) == 1) {
			return this.method2496(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
