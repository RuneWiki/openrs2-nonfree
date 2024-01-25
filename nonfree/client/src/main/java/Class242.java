import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class242 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!kga;")
	public Interface13 anInterface13_5;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!kga;")
	public Interface13 anInterface13_6;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Z")
	public boolean aBoolean491;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Z)V")
	public Class242(@OriginalArg(0) boolean arg0) {
		this.aBoolean491 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public void method5560() {
		if (this.anInterface13_6 != null) {
			this.anInterface13_6.method7651();
		}
		this.aBoolean490 = false;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)Z")
	public boolean method5563() {
		return this.aBoolean490 && !this.aBoolean491;
	}
}
