import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class106 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Z")
	public boolean aBoolean249;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!tq;")
	public Interface19 anInterface19_5;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!tq;")
	public Interface19 anInterface19_6;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Z")
	public boolean aBoolean248;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Z)V")
	public Class106(@OriginalArg(0) boolean arg0) {
		this.aBoolean248 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z")
	public boolean method2816() {
		return this.aBoolean249 && !this.aBoolean248;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
	public void method2817() {
		if (this.anInterface19_5 != null) {
			this.anInterface19_5.method6953();
		}
		this.aBoolean249 = false;
	}
}
