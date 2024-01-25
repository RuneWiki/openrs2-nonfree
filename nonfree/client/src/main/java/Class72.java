import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class72 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!el;")
	public Interface4 anInterface4_11;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Lclient!el;")
	public Interface4 anInterface4_12;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Z)V")
	public Class72(@OriginalArg(0) boolean arg0) {
		this.aBoolean197 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public void method2235() {
		if (this.anInterface4_11 != null) {
			this.anInterface4_11.method6496();
		}
		this.aBoolean196 = false;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Z")
	public boolean method2236() {
		return this.aBoolean196 && !this.aBoolean197;
	}
}
