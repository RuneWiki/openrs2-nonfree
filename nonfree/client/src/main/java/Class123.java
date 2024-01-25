import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class123 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!bca;")
	public Interface4 anInterface4_2;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!bca;")
	public Interface4 anInterface4_3;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Z)V")
	public Class123(@OriginalArg(0) boolean arg0) {
		this.aBoolean227 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
	public boolean method2414() {
		return this.aBoolean228 && !this.aBoolean227;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public void method2415() {
		if (this.anInterface4_2 != null) {
			this.anInterface4_2.method7384();
		}
		this.aBoolean228 = false;
	}
}
