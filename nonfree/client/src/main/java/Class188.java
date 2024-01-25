import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class188 {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!gj;")
	private Class39 aClass39_18;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "Lclient!gj;")
	private final Class39 aClass39_17 = new Class39();

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class188() {
		this.aClass39_17.aClass39_24 = this.aClass39_17;
		this.aClass39_17.aClass39_23 = this.aClass39_17;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public void method4529() {
		while (true) {
			@Pc(5) Class39 local5 = this.aClass39_17.aClass39_24;
			if (local5 == this.aClass39_17) {
				this.aClass39_18 = null;
				return;
			}
			local5.method5616();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Lclient!gj;")
	public Class39 method4530() {
		@Pc(6) Class39 local6 = this.aClass39_18;
		if (local6 == this.aClass39_17) {
			this.aClass39_18 = null;
			return null;
		} else {
			this.aClass39_18 = local6.aClass39_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Lclient!gj;")
	public Class39 method4531() {
		@Pc(12) Class39 local12 = this.aClass39_17.aClass39_23;
		if (local12 == this.aClass39_17) {
			this.aClass39_18 = null;
			return null;
		} else {
			this.aClass39_18 = local12.aClass39_23;
			return local12;
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Lclient!gj;")
	public Class39 method4534() {
		@Pc(11) Class39 local11 = this.aClass39_17.aClass39_24;
		if (local11 == this.aClass39_17) {
			this.aClass39_18 = null;
			return null;
		} else {
			this.aClass39_18 = local11.aClass39_24;
			return local11;
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)I")
	public int method4535() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class39 local11 = this.aClass39_17.aClass39_24;
		while (local11 != this.aClass39_17) {
			local11 = local11.aClass39_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Lclient!gj;")
	public Class39 method4536() {
		@Pc(7) Class39 local7 = this.aClass39_17.aClass39_24;
		if (local7 == this.aClass39_17) {
			return null;
		} else {
			local7.method5616();
			return local7;
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)Z")
	public boolean method4537() {
		return this.aClass39_17.aClass39_24 == this.aClass39_17;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!gj;I)V")
	public void method4538(@OriginalArg(0) Class39 arg0) {
		if (arg0.aClass39_23 != null) {
			arg0.method5616();
		}
		arg0.aClass39_23 = this.aClass39_17.aClass39_23;
		arg0.aClass39_24 = this.aClass39_17;
		arg0.aClass39_23.aClass39_24 = arg0;
		arg0.aClass39_24.aClass39_23 = arg0;
	}
}
