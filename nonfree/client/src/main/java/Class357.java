import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public final class Class357 {

	@OriginalMember(owner = "client!tka", name = "d", descriptor = "Z")
	public boolean aBoolean816;

	@OriginalMember(owner = "client!tka", name = "g", descriptor = "Lclient!lg;")
	public Interface15 anInterface15_5;

	@OriginalMember(owner = "client!tka", name = "h", descriptor = "Lclient!lg;")
	public Interface15 anInterface15_6;

	@OriginalMember(owner = "client!tka", name = "c", descriptor = "Z")
	public boolean aBoolean817;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "(Z)V")
	public Class357(@OriginalArg(0) boolean arg0) {
		this.aBoolean817 = arg0;
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(Z)Z")
	public boolean method8405() {
		return this.aBoolean816 && !this.aBoolean817;
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(I)V")
	public void method8406() {
		if (this.anInterface15_6 != null) {
			this.anInterface15_6.method9218();
		}
		this.aBoolean816 = false;
	}
}
