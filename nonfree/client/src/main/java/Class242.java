import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class242 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!du;")
	private Class36 aClass36_24;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Lclient!du;")
	private final Class36 aClass36_23 = new Class36();

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class242() {
		this.aClass36_23.aClass36_21 = this.aClass36_23;
		this.aClass36_23.aClass36_22 = this.aClass36_23;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Lclient!du;")
	public Class36 method5499() {
		@Pc(12) Class36 local12 = this.aClass36_23.aClass36_21;
		if (local12 == this.aClass36_23) {
			this.aClass36_24 = null;
			return null;
		} else {
			this.aClass36_24 = local12.aClass36_21;
			return local12;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!du;)V")
	public void method5501(@OriginalArg(1) Class36 arg0) {
		if (arg0.aClass36_21 != null) {
			arg0.method5131();
		}
		arg0.aClass36_21 = this.aClass36_23.aClass36_21;
		arg0.aClass36_22 = this.aClass36_23;
		arg0.aClass36_21.aClass36_22 = arg0;
		arg0.aClass36_22.aClass36_21 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lclient!du;")
	public Class36 method5503() {
		@Pc(7) Class36 local7 = this.aClass36_23.aClass36_22;
		if (this.aClass36_23 == local7) {
			this.aClass36_24 = null;
			return null;
		} else {
			this.aClass36_24 = local7.aClass36_22;
			return local7;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)Z")
	public boolean method5504() {
		return this.aClass36_23 == this.aClass36_23.aClass36_22;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public void method5505() {
		while (true) {
			@Pc(12) Class36 local12 = this.aClass36_23.aClass36_22;
			if (this.aClass36_23 == local12) {
				this.aClass36_24 = null;
				return;
			}
			local12.method5131();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Lclient!du;")
	public Class36 method5506() {
		@Pc(6) Class36 local6 = this.aClass36_24;
		if (this.aClass36_23 == local6) {
			this.aClass36_24 = null;
			return null;
		} else {
			this.aClass36_24 = local6.aClass36_22;
			return local6;
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)I")
	public int method5507() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class36 local16 = this.aClass36_23.aClass36_22; local16 != this.aClass36_23; local16 = local16.aClass36_22) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)Lclient!du;")
	public Class36 method5508() {
		@Pc(12) Class36 local12 = this.aClass36_23.aClass36_22;
		if (this.aClass36_23 == local12) {
			return null;
		} else {
			local12.method5131();
			return local12;
		}
	}
}
