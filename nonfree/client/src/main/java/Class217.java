import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class217 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!oh;")
	public Interface20 anInterface20_4;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!oh;")
	public Interface20 anInterface20_5;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V")
	public Class217(@OriginalArg(0) boolean arg0) {
		this.aBoolean429 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method5389() {
		if (this.anInterface20_5 != null) {
			this.anInterface20_5.method8737();
		}
		this.aBoolean428 = false;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z")
	public boolean method5391() {
		return this.aBoolean428 && !this.aBoolean429;
	}
}
