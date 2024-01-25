import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class249 {

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!uv;")
	private Class102 aClass102_12;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Lclient!uv;")
	private final Class102 aClass102_11 = new Class102();

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class249() {
		this.aClass102_11.aClass102_26 = this.aClass102_11;
		this.aClass102_11.aClass102_25 = this.aClass102_11;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!uv;)V")
	public void method5809(@OriginalArg(1) Class102 arg0) {
		if (arg0.aClass102_25 != null) {
			arg0.method7587();
		}
		arg0.aClass102_26 = this.aClass102_11;
		arg0.aClass102_25 = this.aClass102_11.aClass102_25;
		arg0.aClass102_25.aClass102_26 = arg0;
		arg0.aClass102_26.aClass102_25 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Lclient!uv;")
	public Class102 method5811() {
		@Pc(14) Class102 local14 = this.aClass102_11.aClass102_25;
		if (this.aClass102_11 == local14) {
			this.aClass102_12 = null;
			return null;
		} else {
			this.aClass102_12 = local14.aClass102_25;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Lclient!uv;")
	public Class102 method5812() {
		@Pc(14) Class102 local14 = this.aClass102_11.aClass102_26;
		if (this.aClass102_11 == local14) {
			return null;
		} else {
			local14.method7587();
			return local14;
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)I")
	public int method5814() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class102 local16 = this.aClass102_11.aClass102_26;
		while (local16 != this.aClass102_11) {
			local16 = local16.aClass102_26;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)Lclient!uv;")
	public Class102 method5815() {
		@Pc(6) Class102 local6 = this.aClass102_12;
		if (local6 == this.aClass102_11) {
			this.aClass102_12 = null;
			return null;
		} else {
			this.aClass102_12 = local6.aClass102_26;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z")
	public boolean method5816() {
		return this.aClass102_11 == this.aClass102_11.aClass102_26;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)Lclient!uv;")
	public Class102 method5817() {
		@Pc(7) Class102 local7 = this.aClass102_11.aClass102_26;
		if (local7 == this.aClass102_11) {
			this.aClass102_12 = null;
			return null;
		} else {
			this.aClass102_12 = local7.aClass102_26;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
	public void method5818() {
		while (true) {
			@Pc(5) Class102 local5 = this.aClass102_11.aClass102_26;
			if (local5 == this.aClass102_11) {
				this.aClass102_12 = null;
				return;
			}
			local5.method7587();
		}
	}
}
