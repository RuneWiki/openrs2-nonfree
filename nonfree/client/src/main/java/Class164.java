import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class164 {

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "Lclient!or;")
	public Interface17 anInterface17_5;

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "Lclient!or;")
	public Interface17 anInterface17_6;

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "Z")
	public boolean aBoolean350;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Z)V")
	public Class164(@OriginalArg(0) boolean arg0) {
		this.aBoolean350 = arg0;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)Z")
	public boolean method4022() {
		return this.aBoolean349 && !this.aBoolean350;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
	public void method4023() {
		if (this.anInterface17_6 != null) {
			this.anInterface17_6.method6939();
		}
		this.aBoolean349 = false;
	}
}
