import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class138 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "Lclient!ho;")
	public Interface10 anInterface10_2;

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Lclient!ho;")
	public Interface10 anInterface10_3;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "Z")
	public boolean aBoolean254;

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
	public boolean aBoolean253;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Z)V")
	public Class138(@OriginalArg(0) boolean arg0) {
		this.aBoolean253 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	public void method2940() {
		if (this.anInterface10_2 != null) {
			this.anInterface10_2.method7459();
		}
		this.aBoolean254 = false;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)Z")
	public boolean method2943() {
		return this.aBoolean254 && !this.aBoolean253;
	}
}
