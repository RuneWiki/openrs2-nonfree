import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class169 {

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!pi;")
	private Class28 aClass28_14;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!pi;")
	private final Class28 aClass28_13 = new Class28();

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class169() {
		this.aClass28_13.aClass28_26 = this.aClass28_13;
		this.aClass28_13.aClass28_25 = this.aClass28_13;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)I")
	public int method3591() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class28 local16 = this.aClass28_13.aClass28_25; local16 != this.aClass28_13; local16 = local16.aClass28_25) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lclient!pi;")
	public Class28 method3592() {
		@Pc(12) Class28 local12 = this.aClass28_13.aClass28_26;
		if (this.aClass28_13 == local12) {
			this.aClass28_14 = null;
			return null;
		} else {
			this.aClass28_14 = local12.aClass28_26;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
	public void method3594() {
		while (true) {
			@Pc(12) Class28 local12 = this.aClass28_13.aClass28_25;
			if (local12 == this.aClass28_13) {
				this.aClass28_14 = null;
				return;
			}
			local12.method5642();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)Z")
	public boolean method3595() {
		return this.aClass28_13.aClass28_25 == this.aClass28_13;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)Lclient!pi;")
	public Class28 method3597() {
		@Pc(6) Class28 local6 = this.aClass28_14;
		if (local6 == this.aClass28_13) {
			this.aClass28_14 = null;
			return null;
		} else {
			this.aClass28_14 = local6.aClass28_25;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Lclient!pi;")
	public Class28 method3598() {
		@Pc(7) Class28 local7 = this.aClass28_13.aClass28_25;
		if (this.aClass28_13 == local7) {
			this.aClass28_14 = null;
			return null;
		} else {
			this.aClass28_14 = local7.aClass28_25;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)Lclient!pi;")
	public Class28 method3599() {
		@Pc(12) Class28 local12 = this.aClass28_13.aClass28_25;
		if (this.aClass28_13 == local12) {
			return null;
		} else {
			local12.method5642();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!pi;)V")
	public void method3603(@OriginalArg(1) Class28 arg0) {
		if (arg0.aClass28_26 != null) {
			arg0.method5642();
		}
		arg0.aClass28_26 = this.aClass28_13.aClass28_26;
		arg0.aClass28_25 = this.aClass28_13;
		arg0.aClass28_26.aClass28_25 = arg0;
		arg0.aClass28_25.aClass28_26 = arg0;
	}
}
