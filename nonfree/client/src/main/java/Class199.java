import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class199 {

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!ps;")
	private Class7 aClass7_20;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!ps;")
	private final Class7 aClass7_19 = new Class7();

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class199() {
		this.aClass7_19.aClass7_23 = this.aClass7_19;
		this.aClass7_19.aClass7_24 = this.aClass7_19;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lclient!ps;")
	public Class7 method4896() {
		@Pc(13) Class7 local13 = this.aClass7_19.aClass7_24;
		if (this.aClass7_19 == local13) {
			this.aClass7_20 = null;
			return null;
		} else {
			this.aClass7_20 = local13.aClass7_24;
			return local13;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Lclient!ps;")
	public Class7 method4897() {
		@Pc(7) Class7 local7 = this.aClass7_19.aClass7_23;
		if (local7 == this.aClass7_19) {
			this.aClass7_20 = null;
			return null;
		} else {
			this.aClass7_20 = local7.aClass7_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method4898(@OriginalArg(0) Class7 arg0) {
		if (arg0.aClass7_23 != null) {
			arg0.method5398();
		}
		arg0.aClass7_24 = this.aClass7_19;
		arg0.aClass7_23 = this.aClass7_19.aClass7_23;
		arg0.aClass7_23.aClass7_24 = arg0;
		arg0.aClass7_24.aClass7_23 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public int method4899() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class7 local11 = this.aClass7_19.aClass7_24;
		while (this.aClass7_19 != local11) {
			local11 = local11.aClass7_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lclient!ps;")
	public Class7 method4900() {
		@Pc(15) Class7 local15 = this.aClass7_19.aClass7_24;
		if (this.aClass7_19 == local15) {
			return null;
		} else {
			local15.method5398();
			return local15;
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Lclient!ps;")
	public Class7 method4902() {
		@Pc(14) Class7 local14 = this.aClass7_20;
		if (local14 == this.aClass7_19) {
			this.aClass7_20 = null;
			return null;
		} else {
			this.aClass7_20 = local14.aClass7_24;
			return local14;
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public void method4905() {
		while (true) {
			@Pc(9) Class7 local9 = this.aClass7_19.aClass7_24;
			if (this.aClass7_19 == local9) {
				this.aClass7_20 = null;
				return;
			}
			local9.method5398();
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)Z")
	public boolean method4907() {
		return this.aClass7_19.aClass7_24 == this.aClass7_19;
	}
}
