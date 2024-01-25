import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class204 {

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "Lclient!tea;")
	public Interface26 anInterface26_15;

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "Lclient!tea;")
	public Interface26 anInterface26_16;

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "Z")
	public boolean aBoolean547;

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "Z")
	public boolean aBoolean548;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Z)V")
	public Class204(@OriginalArg(0) boolean arg0) {
		this.aBoolean548 = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Z)V")
	public void method5736() {
		if (this.anInterface26_15 != null) {
			this.anInterface26_15.method8104();
		}
		this.aBoolean547 = false;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Z")
	public boolean method5737() {
		return this.aBoolean547 && !this.aBoolean548;
	}
}
