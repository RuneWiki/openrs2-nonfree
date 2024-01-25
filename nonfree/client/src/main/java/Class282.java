import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class282 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "Lclient!uq;")
	public Interface24 anInterface24_5;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Lclient!uq;")
	public Interface24 anInterface24_6;

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Z")
	public boolean aBoolean642;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Z")
	public boolean aBoolean641;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Z)V")
	public Class282(@OriginalArg(0) boolean arg0) {
		this.aBoolean641 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	public void method7400() {
		if (this.anInterface24_6 != null) {
			this.anInterface24_6.method6475();
		}
		this.aBoolean642 = false;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z")
	public boolean method7402() {
		return this.aBoolean642 && !this.aBoolean641;
	}
}
