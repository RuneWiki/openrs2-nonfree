import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class281 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!bd;")
	public Interface1 anInterface1_6;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Z")
	public boolean aBoolean557;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!bd;")
	public Interface1 anInterface1_7;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Z")
	public boolean aBoolean558;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Z)V")
	public Class281(@OriginalArg(0) boolean arg0) {
		this.aBoolean558 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	public boolean method6495() {
		return this.aBoolean557 && !this.aBoolean558;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method6496() {
		if (this.anInterface1_6 != null) {
			this.anInterface1_6.method5728();
		}
		this.aBoolean557 = false;
	}
}
