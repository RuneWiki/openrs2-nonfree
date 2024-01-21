import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class73 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!da;")
	private final Class14 aClass14_12 = new Class14(256);

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!da;")
	private final Class14 aClass14_13 = new Class14(256);

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!dd;")
	private final Class16 aClass16_29;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!dd;")
	private final Class16 aClass16_27;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;)V")
	public Class73(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		this.aClass16_29 = arg1;
		this.aClass16_27 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[IB)Lclient!ih;")
	private Class1_Sub13_Sub1 method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub13_Sub1 local33 = (Class1_Sub13_Sub1) this.aClass14_13.method569(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class1_Sub24 local55 = (Class1_Sub24) this.aClass14_12.method569(local26);
			if (local55 == null) {
				local55 = Static176.method3171(this.aClass16_29, arg1, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass14_12.method570(local55, local26);
			}
			local33 = local55.method3174(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method3198();
				this.aClass14_13.method570(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)Lclient!ih;")
	public Class1_Sub13_Sub1 method2859(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass16_29.method2231() == 1) {
			return this.method2856(arg1, 0, arg0);
		} else if (this.aClass16_29.method2252(arg1) == 1) {
			return this.method2856(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIB)Lclient!ih;")
	private Class1_Sub13_Sub1 method2860(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x80000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub13_Sub1 local31 = (Class1_Sub13_Sub1) this.aClass14_13.method569(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class12 local54 = Static181.method383(this.aClass16_27, arg2, arg1);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method381();
			this.aClass14_13.method570(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray17.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[IB)Lclient!ih;")
	public Class1_Sub13_Sub1 method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass16_27.method2231() == 1) {
			return this.method2860(arg1, arg0, 0);
		} else if (this.aClass16_27.method2252(arg0) == 1) {
			return this.method2860(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
