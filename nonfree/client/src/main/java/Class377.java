import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public final class Class377 {

	@OriginalMember(owner = "client!via", name = "g", descriptor = "Lclient!fea;")
	public Interface7 anInterface7_17;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "Z")
	public boolean aBoolean738;

	@OriginalMember(owner = "client!via", name = "b", descriptor = "Lclient!fea;")
	public Interface7 anInterface7_18;

	@OriginalMember(owner = "client!via", name = "c", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Z)V")
	public Class377(@OriginalArg(0) boolean arg0) {
		this.aBoolean737 = arg0;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
	public void method9076() {
		if (this.anInterface7_18 != null) {
			this.anInterface7_18.method5842();
		}
		this.aBoolean738 = false;
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)Z")
	public boolean method9077() {
		return this.aBoolean738 && !this.aBoolean737;
	}
}
