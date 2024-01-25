import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class145 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!eu;")
	public Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!eu;")
	public Interface6 anInterface6_5;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
	public boolean aBoolean304;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
	public boolean aBoolean305;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Z)V")
	public Class145(@OriginalArg(0) boolean arg0) {
		this.aBoolean305 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
	public boolean method3357() {
		return this.aBoolean304 && !this.aBoolean305;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method3359() {
		if (this.anInterface6_4 != null) {
			this.anInterface6_4.method7925();
		}
		this.aBoolean304 = false;
	}
}
