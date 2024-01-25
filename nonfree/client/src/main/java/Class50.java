import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class50 {

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!uba;")
	public Interface25 anInterface25_2;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!uba;")
	public Interface25 anInterface25_3;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
	public boolean aBoolean49;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Z")
	public boolean aBoolean48;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Z)V")
	public Class50(@OriginalArg(0) boolean arg0) {
		this.aBoolean48 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Z")
	public boolean method765() {
		return this.aBoolean49 && !this.aBoolean48;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public void method766() {
		if (this.anInterface25_3 != null) {
			this.anInterface25_3.method8675();
		}
		this.aBoolean49 = false;
	}
}
