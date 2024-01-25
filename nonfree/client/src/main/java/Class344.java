import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class344 {

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "Lclient!am;")
	public Interface1 anInterface1_15;

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "Z")
	public boolean aBoolean766;

	@OriginalMember(owner = "client!uia", name = "l", descriptor = "Lclient!am;")
	public Interface1 anInterface1_16;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "Z")
	public boolean aBoolean767;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Z)V")
	public Class344(@OriginalArg(0) boolean arg0) {
		this.aBoolean767 = arg0;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
	public void method8150() {
		if (this.anInterface1_15 != null) {
			this.anInterface1_15.method7716();
		}
		this.aBoolean766 = false;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)Z")
	public boolean method8151() {
		return this.aBoolean766 && !this.aBoolean767;
	}
}
