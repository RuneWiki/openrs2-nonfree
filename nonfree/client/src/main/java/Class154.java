import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class154 {

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!gh;")
	private Class10 aClass10_14;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!gh;")
	private final Class10 aClass10_13 = new Class10();

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class154() {
		this.aClass10_13.aClass10_24 = this.aClass10_13;
		this.aClass10_13.aClass10_23 = this.aClass10_13;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
	public boolean method3477() {
		return this.aClass10_13 == this.aClass10_13.aClass10_23;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lclient!gh;")
	public Class10 method3479() {
		@Pc(7) Class10 local7 = this.aClass10_13.aClass10_23;
		if (local7 == this.aClass10_13) {
			this.aClass10_14 = null;
			return null;
		} else {
			this.aClass10_14 = local7.aClass10_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!gh;)V")
	public void method3481(@OriginalArg(1) Class10 arg0) {
		if (arg0.aClass10_24 != null) {
			arg0.method4605();
		}
		arg0.aClass10_23 = this.aClass10_13;
		arg0.aClass10_24 = this.aClass10_13.aClass10_24;
		arg0.aClass10_24.aClass10_23 = arg0;
		arg0.aClass10_23.aClass10_24 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Lclient!gh;")
	public Class10 method3482() {
		@Pc(7) Class10 local7 = this.aClass10_13.aClass10_24;
		if (this.aClass10_13 == local7) {
			this.aClass10_14 = null;
			return null;
		} else {
			this.aClass10_14 = local7.aClass10_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)Lclient!gh;")
	public Class10 method3483() {
		@Pc(6) Class10 local6 = this.aClass10_14;
		if (local6 == this.aClass10_13) {
			this.aClass10_14 = null;
			return null;
		} else {
			this.aClass10_14 = local6.aClass10_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Lclient!gh;")
	public Class10 method3484() {
		@Pc(12) Class10 local12 = this.aClass10_13.aClass10_23;
		if (this.aClass10_13 == local12) {
			return null;
		} else {
			local12.method4605();
			return local12;
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)I")
	public int method3487() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class10 local11 = this.aClass10_13.aClass10_23;
		while (this.aClass10_13 != local11) {
			local11 = local11.aClass10_23;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
	public void method3488() {
		while (true) {
			@Pc(13) Class10 local13 = this.aClass10_13.aClass10_23;
			if (this.aClass10_13 == local13) {
				this.aClass10_14 = null;
				return;
			}
			local13.method4605();
		}
	}
}
