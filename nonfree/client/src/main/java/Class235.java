import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class235 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Lclient!cca;")
	public Interface3 anInterface3_10;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
	public boolean aBoolean456;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!cca;")
	public Interface3 anInterface3_11;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Z)V")
	public Class235(@OriginalArg(0) boolean arg0) {
		this.aBoolean457 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public void method5917() {
		if (this.anInterface3_10 != null) {
			this.anInterface3_10.method3138();
		}
		this.aBoolean456 = false;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)Z")
	public boolean method5918() {
		return this.aBoolean456 && !this.aBoolean457;
	}
}
