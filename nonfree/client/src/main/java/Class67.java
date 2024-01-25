import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class67 {

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!hg;")
	private Class55 aClass55_6;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!hg;")
	private final Class55 aClass55_5 = new Class55();

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class67() {
		this.aClass55_5.aClass55_23 = this.aClass55_5;
		this.aClass55_5.aClass55_24 = this.aClass55_5;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lclient!hg;")
	public Class55 method2095() {
		@Pc(7) Class55 local7 = this.aClass55_5.aClass55_24;
		if (this.aClass55_5 == local7) {
			this.aClass55_6 = null;
			return null;
		} else {
			this.aClass55_6 = local7.aClass55_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public void method2097() {
		while (true) {
			@Pc(17) Class55 local17 = this.aClass55_5.aClass55_23;
			if (this.aClass55_5 == local17) {
				this.aClass55_6 = null;
				return;
			}
			local17.method4599();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lclient!hg;")
	public Class55 method2098() {
		@Pc(12) Class55 local12 = this.aClass55_5.aClass55_23;
		if (local12 == this.aClass55_5) {
			this.aClass55_6 = null;
			return null;
		} else {
			this.aClass55_6 = local12.aClass55_23;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
	public int method2099() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class55 local11 = this.aClass55_5.aClass55_23; local11 != this.aClass55_5; local11 = local11.aClass55_23) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!hg;)V")
	public void method2100(@OriginalArg(1) Class55 arg0) {
		if (arg0.aClass55_24 != null) {
			arg0.method4599();
		}
		arg0.aClass55_23 = this.aClass55_5;
		arg0.aClass55_24 = this.aClass55_5.aClass55_24;
		arg0.aClass55_24.aClass55_23 = arg0;
		arg0.aClass55_23.aClass55_24 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Lclient!hg;")
	public Class55 method2101() {
		@Pc(12) Class55 local12 = this.aClass55_5.aClass55_23;
		if (this.aClass55_5 == local12) {
			return null;
		} else {
			local12.method4599();
			return local12;
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Z")
	public boolean method2103() {
		return this.aClass55_5.aClass55_23 == this.aClass55_5;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)Lclient!hg;")
	public Class55 method2104() {
		@Pc(6) Class55 local6 = this.aClass55_6;
		if (this.aClass55_5 == local6) {
			this.aClass55_6 = null;
			return null;
		} else {
			this.aClass55_6 = local6.aClass55_23;
			return local6;
		}
	}
}
