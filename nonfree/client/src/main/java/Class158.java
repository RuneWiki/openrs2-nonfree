import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class158 {

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "Lclient!dq;")
	private final Class38 aClass38_26 = new Class38(256);

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "Lclient!dq;")
	private final Class38 aClass38_27 = new Class38(256);

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!ct;")
	private final Class30 aClass30_68;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "Lclient!ct;")
	private final Class30 aClass30_69;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ct;Lclient!ct;)V")
	public Class158(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		this.aClass30_68 = arg0;
		this.aClass30_69 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[I)Lclient!ua;")
	public Class1_Sub39_Sub1 method4296(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass30_69.method1158() == 1) {
			return this.method4300(0, arg1, arg0);
		} else if (this.aClass30_69.method1180(arg0) == 1) {
			return this.method4300(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([IIII)Lclient!ua;")
	private Class1_Sub39_Sub1 method4299(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x10000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(33) Class1_Sub39_Sub1 local33 = (Class1_Sub39_Sub1) this.aClass38_27.method1475(local24);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(51) Class65 local51 = Static371.method2048(this.aClass30_68, arg2, arg1);
			if (local51 == null) {
				return null;
			}
			local33 = local51.method2046();
			this.aClass38_27.method1472(local33, local24);
			if (arg0 != null) {
				arg0[0] -= local33.aByteArray89.length;
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[II)Lclient!ua;")
	private Class1_Sub39_Sub1 method4300(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg0 & 0x80000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub39_Sub1 local33 = (Class1_Sub39_Sub1) this.aClass38_27.method1475(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class1_Sub11 local60 = (Class1_Sub11) this.aClass38_26.method1475(local26);
			if (local60 == null) {
				local60 = Static32.method836(this.aClass30_69, arg0, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass38_26.method1472(local60, local26);
			}
			local33 = local60.method835(arg1);
			if (local33 == null) {
				return null;
			} else {
				local60.method6045();
				this.aClass38_27.method1472(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[IB)Lclient!ua;")
	public Class1_Sub39_Sub1 method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass30_68.method1158() == 1) {
			return this.method4299(arg1, arg0, 0);
		} else if (this.aClass30_68.method1180(arg0) == 1) {
			return this.method4299(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
