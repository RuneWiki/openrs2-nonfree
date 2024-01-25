import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class47 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!ra;")
	public Interface22 anInterface22_1;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!ra;")
	public Interface22 anInterface22_2;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Z")
	public boolean aBoolean92;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Z)V")
	public Class47(@OriginalArg(0) boolean arg0) {
		this.aBoolean92 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public boolean method1165() {
		return this.aBoolean93 && !this.aBoolean92;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public void method1167() {
		if (this.anInterface22_1 != null) {
			this.anInterface22_1.method7409();
		}
		this.aBoolean93 = false;
	}
}
