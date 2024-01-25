import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class204 {

	@OriginalMember(owner = "client!um", name = "m", descriptor = "Lclient!jq;")
	private Class17 aClass17_22;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!jq;")
	private final Class17 aClass17_21 = new Class17();

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class204() {
		this.aClass17_21.aClass17_23 = this.aClass17_21;
		this.aClass17_21.aClass17_24 = this.aClass17_21;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lclient!jq;")
	public Class17 method5356() {
		@Pc(14) Class17 local14 = this.aClass17_21.aClass17_23;
		if (local14 == this.aClass17_21) {
			return null;
		} else {
			local14.method5473();
			return local14;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Lclient!jq;")
	public Class17 method5357() {
		@Pc(11) Class17 local11 = this.aClass17_22;
		if (this.aClass17_21 == local11) {
			this.aClass17_22 = null;
			return null;
		} else {
			this.aClass17_22 = local11.aClass17_23;
			return local11;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Z")
	public boolean method5358() {
		return this.aClass17_21.aClass17_23 == this.aClass17_21;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Lclient!jq;")
	public Class17 method5359() {
		@Pc(15) Class17 local15 = this.aClass17_21.aClass17_23;
		if (local15 == this.aClass17_21) {
			this.aClass17_22 = null;
			return null;
		} else {
			this.aClass17_22 = local15.aClass17_23;
			return local15;
		}
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(B)I")
	public int method5361() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class17 local19 = this.aClass17_21.aClass17_23;
		while (this.aClass17_21 != local19) {
			local19 = local19.aClass17_23;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public void method5362() {
		while (true) {
			@Pc(14) Class17 local14 = this.aClass17_21.aClass17_23;
			if (this.aClass17_21 == local14) {
				this.aClass17_22 = null;
				return;
			}
			local14.method5473();
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(B)Lclient!jq;")
	public Class17 method5363() {
		@Pc(12) Class17 local12 = this.aClass17_21.aClass17_24;
		if (local12 == this.aClass17_21) {
			this.aClass17_22 = null;
			return null;
		} else {
			this.aClass17_22 = local12.aClass17_24;
			return local12;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!jq;I)V")
	public void method5365(@OriginalArg(0) Class17 arg0) {
		if (arg0.aClass17_24 != null) {
			arg0.method5473();
		}
		arg0.aClass17_23 = this.aClass17_21;
		arg0.aClass17_24 = this.aClass17_21.aClass17_24;
		arg0.aClass17_24.aClass17_23 = arg0;
		arg0.aClass17_23.aClass17_24 = arg0;
	}
}
