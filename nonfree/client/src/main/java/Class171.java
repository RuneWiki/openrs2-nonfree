import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class171 {

	@OriginalMember(owner = "client!jia", name = "o", descriptor = "Lclient!ib;")
	private Class13 aClass13_30;

	@OriginalMember(owner = "client!jia", name = "h", descriptor = "Lclient!ib;")
	private final Class13 aClass13_29 = new Class13();

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V")
	public Class171() {
		this.aClass13_29.aClass13_67 = this.aClass13_29;
		this.aClass13_29.aClass13_68 = this.aClass13_29;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)Lclient!ib;")
	public Class13 method3744() {
		@Pc(11) Class13 local11 = this.aClass13_30;
		if (this.aClass13_29 == local11) {
			this.aClass13_30 = null;
			return null;
		} else {
			this.aClass13_30 = local11.aClass13_67;
			return local11;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)Lclient!ib;")
	public Class13 method3745() {
		@Pc(7) Class13 local7 = this.aClass13_29.aClass13_67;
		if (this.aClass13_29 == local7) {
			this.aClass13_30 = null;
			return null;
		} else {
			this.aClass13_30 = local7.aClass13_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!ib;)V")
	public void method3746(@OriginalArg(1) Class13 arg0) {
		if (arg0.aClass13_68 != null) {
			arg0.method8394();
		}
		arg0.aClass13_67 = this.aClass13_29;
		arg0.aClass13_68 = this.aClass13_29.aClass13_68;
		arg0.aClass13_68.aClass13_67 = arg0;
		arg0.aClass13_67.aClass13_68 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(Z)Lclient!ib;")
	public Class13 method3749() {
		@Pc(7) Class13 local7 = this.aClass13_29.aClass13_68;
		if (this.aClass13_29 == local7) {
			this.aClass13_30 = null;
			return null;
		} else {
			this.aClass13_30 = local7.aClass13_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z")
	public boolean method3750() {
		return this.aClass13_29.aClass13_67 == this.aClass13_29;
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(I)I")
	public int method3751() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class13 local11 = this.aClass13_29.aClass13_67; local11 != this.aClass13_29; local11 = local11.aClass13_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "(I)Lclient!ib;")
	public Class13 method3752() {
		@Pc(7) Class13 local7 = this.aClass13_29.aClass13_67;
		if (this.aClass13_29 == local7) {
			return null;
		} else {
			local7.method8394();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(Z)V")
	public void method3755() {
		while (true) {
			@Pc(5) Class13 local5 = this.aClass13_29.aClass13_67;
			if (this.aClass13_29 == local5) {
				this.aClass13_30 = null;
				return;
			}
			local5.method8394();
		}
	}
}
