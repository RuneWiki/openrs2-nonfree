import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class260 {

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "Lclient!fg;")
	public Interface11 anInterface11_17;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Z")
	public boolean aBoolean543;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!fg;")
	public Interface11 anInterface11_18;

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "Z")
	public boolean aBoolean542;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Z)V")
	public Class260(@OriginalArg(0) boolean arg0) {
		this.aBoolean542 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)Z")
	public boolean method6703() {
		return this.aBoolean543 && !this.aBoolean542;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V")
	public void method6705() {
		if (this.anInterface11_18 != null) {
			this.anInterface11_18.method7982();
		}
		this.aBoolean543 = false;
	}
}
