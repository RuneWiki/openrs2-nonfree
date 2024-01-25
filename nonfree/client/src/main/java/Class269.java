import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class269 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!js;")
	public Interface12 anInterface12_7;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Lclient!js;")
	public Interface12 anInterface12_8;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "Z")
	public boolean aBoolean546;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "Z")
	public boolean aBoolean547;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Z)V")
	public Class269(@OriginalArg(0) boolean arg0) {
		this.aBoolean547 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public void method6619() {
		if (this.anInterface12_7 != null) {
			this.anInterface12_7.method7572();
		}
		this.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Z")
	public boolean method6620() {
		return this.aBoolean546 && !this.aBoolean547;
	}
}
