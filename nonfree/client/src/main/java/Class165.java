import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class165 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!cb;")
	private final Class42 aClass42_18 = new Class42(256);

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "Lclient!cb;")
	private final Class42 aClass42_19 = new Class42(256);

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "Lclient!gp;")
	private final Class117 aClass117_119;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "Lclient!gp;")
	private final Class117 aClass117_118;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!gp;Lclient!gp;)V")
	public Class165(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1) {
		this.aClass117_119 = arg1;
		this.aClass117_118 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[II)Lclient!ar;")
	public Class5_Sub5_Sub1 method4139(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass117_118.method2972() == 1) {
			return this.method4143(arg1, 0, arg0);
		} else if (this.aClass117_118.method2951(arg1) == 1) {
			return this.method4143(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[III)Lclient!ar;")
	private Class5_Sub5_Sub1 method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF1) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub5_Sub1 local33 = (Class5_Sub5_Sub1) this.aClass42_19.method1109(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class5_Sub33 local60 = (Class5_Sub33) this.aClass42_18.method1109(local26);
			if (local60 == null) {
				local60 = Static333.method5240(this.aClass117_119, arg2, arg0);
				if (local60 == null) {
					return null;
				}
				this.aClass42_18.method1106(local26, local60);
			}
			local33 = local60.method5232(arg1);
			if (local33 == null) {
				return null;
			} else {
				local60.method7425();
				this.aClass42_19.method1106(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "([III)Lclient!ar;")
	public Class5_Sub5_Sub1 method4141(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass117_119.method2972() == 1) {
			return this.method4140(arg1, arg0, 0);
		} else if (this.aClass117_119.method2951(arg1) == 1) {
			return this.method4140(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III[I)Lclient!ar;")
	private Class5_Sub5_Sub1 method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class5_Sub5_Sub1 local31 = (Class5_Sub5_Sub1) this.aClass42_19.method1109(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class200 local57 = Static554.method5070(this.aClass117_118, arg1, arg0);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method5068();
			this.aClass42_19.method1106(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray6.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
