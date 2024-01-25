import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class209 {

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Lclient!rv;")
	public Interface22 anInterface22_16;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!rv;")
	public Interface22 anInterface22_17;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Z)V")
	public Class209(@OriginalArg(0) boolean arg0) {
		this.aBoolean459 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public void method5403() {
		if (this.anInterface22_17 != null) {
			this.anInterface22_17.method7572();
		}
		this.aBoolean458 = false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
	public boolean method5405() {
		return this.aBoolean458 && !this.aBoolean459;
	}
}
