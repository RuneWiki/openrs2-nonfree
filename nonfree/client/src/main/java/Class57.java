import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Class57 {

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "Lclient!ia;")
	public Interface10 anInterface10_1;

	@OriginalMember(owner = "client!cja", name = "g", descriptor = "Lclient!ia;")
	public Interface10 anInterface10_2;

	@OriginalMember(owner = "client!cja", name = "i", descriptor = "Z")
	public boolean aBoolean158;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "Z")
	public boolean aBoolean157;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(Z)V")
	public Class57(@OriginalArg(0) boolean arg0) {
		this.aBoolean157 = arg0;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)Z")
	public boolean method1641() {
		return this.aBoolean158 && !this.aBoolean157;
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V")
	public void method1642() {
		if (this.anInterface10_1 != null) {
			this.anInterface10_1.method8446();
		}
		this.aBoolean158 = false;
	}
}
