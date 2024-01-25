import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class174 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Z")
	public boolean aBoolean373;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!g;")
	public Interface7 anInterface7_5;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!g;")
	public Interface7 anInterface7_6;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Z)V")
	public Class174(@OriginalArg(0) boolean arg0) {
		this.aBoolean374 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public void method4340() {
		if (this.anInterface7_6 != null) {
			this.anInterface7_6.method6953();
		}
		this.aBoolean373 = false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Z")
	public boolean method4341() {
		return this.aBoolean373 && !this.aBoolean374;
	}
}
