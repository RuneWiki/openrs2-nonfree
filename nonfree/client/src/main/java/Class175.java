import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class175 {

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!rs;")
	private Class15 aClass15_22;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!rs;")
	private final Class15 aClass15_21 = new Class15();

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class175() {
		this.aClass15_21.aClass15_23 = this.aClass15_21;
		this.aClass15_21.aClass15_24 = this.aClass15_21;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	public boolean method4666() {
		return this.aClass15_21.aClass15_24 == this.aClass15_21;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method4667() {
		while (true) {
			@Pc(9) Class15 local9 = this.aClass15_21.aClass15_24;
			if (local9 == this.aClass15_21) {
				this.aClass15_22 = null;
				return;
			}
			local9.method5441();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Lclient!rs;")
	public Class15 method4669() {
		@Pc(7) Class15 local7 = this.aClass15_21.aClass15_24;
		if (this.aClass15_21 == local7) {
			this.aClass15_22 = null;
			return null;
		} else {
			this.aClass15_22 = local7.aClass15_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!rs;I)V")
	public void method4672(@OriginalArg(0) Class15 arg0) {
		if (arg0.aClass15_23 != null) {
			arg0.method5441();
		}
		arg0.aClass15_23 = this.aClass15_21.aClass15_23;
		arg0.aClass15_24 = this.aClass15_21;
		arg0.aClass15_23.aClass15_24 = arg0;
		arg0.aClass15_24.aClass15_23 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Lclient!rs;")
	public Class15 method4673() {
		@Pc(6) Class15 local6 = this.aClass15_22;
		if (this.aClass15_21 == local6) {
			this.aClass15_22 = null;
			return null;
		} else {
			this.aClass15_22 = local6.aClass15_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Lclient!rs;")
	public Class15 method4674() {
		@Pc(7) Class15 local7 = this.aClass15_21.aClass15_23;
		if (this.aClass15_21 == local7) {
			this.aClass15_22 = null;
			return null;
		} else {
			this.aClass15_22 = local7.aClass15_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
	public int method4675() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class15 local19 = this.aClass15_21.aClass15_24;
		while (local19 != this.aClass15_21) {
			local19 = local19.aClass15_24;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)Lclient!rs;")
	public Class15 method4676() {
		@Pc(13) Class15 local13 = this.aClass15_21.aClass15_24;
		if (local13 == this.aClass15_21) {
			return null;
		} else {
			local13.method5441();
			return local13;
		}
	}
}
