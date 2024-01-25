import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class383 {

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "Lclient!hl;")
	public Interface10 anInterface10_17;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "Z")
	public boolean aBoolean751;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "Lclient!hl;")
	public Interface10 anInterface10_18;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Z")
	public boolean aBoolean753;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Z)V")
	public Class383(@OriginalArg(0) boolean arg0) {
		this.aBoolean753 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)Z")
	public boolean method9128() {
		return this.aBoolean751 && !this.aBoolean753;
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
	public void method9129() {
		if (this.anInterface10_18 != null) {
			this.anInterface10_18.method5675();
		}
		this.aBoolean751 = false;
	}
}
