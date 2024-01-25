import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class47 {

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!vc;")
	public Interface23 anInterface23_2;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
	public boolean aBoolean86;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "Lclient!vc;")
	public Interface23 anInterface23_3;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Z)V")
	public Class47(@OriginalArg(0) boolean arg0) {
		this.aBoolean85 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)Z")
	public boolean method1165() {
		return this.aBoolean86 && !this.aBoolean85;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public void method1169() {
		if (this.anInterface23_3 != null) {
			this.anInterface23_3.method5601();
		}
		this.aBoolean86 = false;
	}
}
