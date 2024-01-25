import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class148 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Z")
	public boolean aBoolean246;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!fka;")
	public Interface6 anInterface6_2;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!fka;")
	public Interface6 anInterface6_3;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Z)V")
	public Class148(@OriginalArg(0) boolean arg0) {
		this.aBoolean247 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public void method3091() {
		if (this.anInterface6_3 != null) {
			this.anInterface6_3.method7866();
		}
		this.aBoolean246 = false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Z")
	public boolean method3092() {
		return this.aBoolean246 && !this.aBoolean247;
	}
}
