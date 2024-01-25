import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class151 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!vp;")
	public Interface23 anInterface23_4;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Z")
	public boolean aBoolean249;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!vp;")
	public Interface23 anInterface23_5;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
	public boolean aBoolean248;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Z)V")
	public Class151(@OriginalArg(0) boolean arg0) {
		this.aBoolean248 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z")
	public boolean method3236() {
		return this.aBoolean249 && !this.aBoolean248;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	public void method3237() {
		if (this.anInterface23_4 != null) {
			this.anInterface23_4.method7567();
		}
		this.aBoolean249 = false;
	}
}
