import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class307 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Lclient!iaa;")
	public Interface11 anInterface11_4;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
	public boolean aBoolean601;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Lclient!iaa;")
	public Interface11 anInterface11_5;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Z")
	public boolean aBoolean600;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Z)V")
	public Class307(@OriginalArg(0) boolean arg0) {
		this.aBoolean600 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public void method7068() {
		if (this.anInterface11_5 != null) {
			this.anInterface11_5.method8446();
		}
		this.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)Z")
	public boolean method7069() {
		return this.aBoolean601 && !this.aBoolean600;
	}
}
