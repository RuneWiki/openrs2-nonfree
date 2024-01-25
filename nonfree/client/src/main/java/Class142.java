import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class142 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Z")
	public boolean aBoolean249;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Lclient!oda;")
	public Interface19 anInterface19_1;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!oda;")
	public Interface19 anInterface19_2;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Z)V")
	public Class142(@OriginalArg(0) boolean arg0) {
		this.aBoolean251 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
	public void method3085() {
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method8358();
		}
		this.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
	public boolean method3088() {
		return this.aBoolean249 && !this.aBoolean251;
	}
}
