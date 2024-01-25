import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class217 {

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Lclient!gj;")
	private Class8 aClass8_24;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "Lclient!gj;")
	private final Class8 aClass8_23 = new Class8();

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class217() {
		this.aClass8_23.aClass8_21 = this.aClass8_23;
		this.aClass8_23.aClass8_22 = this.aClass8_23;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!gj;I)V")
	public void method5678(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_22 != null) {
			arg0.method4763();
		}
		arg0.aClass8_22 = this.aClass8_23.aClass8_22;
		arg0.aClass8_21 = this.aClass8_23;
		arg0.aClass8_22.aClass8_21 = arg0;
		arg0.aClass8_21.aClass8_22 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lclient!gj;")
	public Class8 method5679() {
		@Pc(12) Class8 local12 = this.aClass8_24;
		if (local12 == this.aClass8_23) {
			this.aClass8_24 = null;
			return null;
		} else {
			this.aClass8_24 = local12.aClass8_21;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lclient!gj;")
	public Class8 method5680() {
		@Pc(12) Class8 local12 = this.aClass8_23.aClass8_22;
		if (this.aClass8_23 == local12) {
			this.aClass8_24 = null;
			return null;
		} else {
			this.aClass8_24 = local12.aClass8_22;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
	public boolean method5681() {
		return this.aClass8_23 == this.aClass8_23.aClass8_21;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Lclient!gj;")
	public Class8 method5683() {
		@Pc(12) Class8 local12 = this.aClass8_23.aClass8_21;
		if (this.aClass8_23 == local12) {
			this.aClass8_24 = null;
			return null;
		} else {
			this.aClass8_24 = local12.aClass8_21;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I")
	public int method5687() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class8 local11 = this.aClass8_23.aClass8_21; local11 != this.aClass8_23; local11 = local11.aClass8_21) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)V")
	public void method5688() {
		while (true) {
			@Pc(9) Class8 local9 = this.aClass8_23.aClass8_21;
			if (this.aClass8_23 == local9) {
				this.aClass8_24 = null;
				return;
			}
			local9.method4763();
		}
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)Lclient!gj;")
	public Class8 method5689() {
		@Pc(11) Class8 local11 = this.aClass8_23.aClass8_21;
		if (this.aClass8_23 == local11) {
			return null;
		} else {
			local11.method4763();
			return local11;
		}
	}
}
