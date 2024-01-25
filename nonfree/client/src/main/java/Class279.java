import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public final class Class279 {

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "Lclient!bl;")
	public Interface6 anInterface6_15;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "Lclient!bl;")
	public Interface6 anInterface6_16;

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "Z")
	public boolean aBoolean588;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Z)V")
	public Class279(@OriginalArg(0) boolean arg0) {
		this.aBoolean588 = arg0;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)Z")
	public boolean method6961() {
		return this.aBoolean589 && !this.aBoolean588;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	public void method6962() {
		if (this.anInterface6_15 != null) {
			this.anInterface6_15.method8675();
		}
		this.aBoolean589 = false;
	}
}
