import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class264 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!el;")
	public Interface9 anInterface9_12;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Z")
	public boolean aBoolean529;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Lclient!el;")
	public Interface9 anInterface9_13;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Z)V")
	public Class264(@OriginalArg(0) boolean arg0) {
		this.aBoolean528 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Z")
	public boolean method6350() {
		return this.aBoolean529 && !this.aBoolean528;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	public void method6353() {
		if (this.anInterface9_13 != null) {
			this.anInterface9_13.method5230();
		}
		this.aBoolean529 = false;
	}
}
