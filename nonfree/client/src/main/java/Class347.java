import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class347 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
	public boolean aBoolean703;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!cda;")
	public Interface3 anInterface3_7;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!cda;")
	public Interface3 anInterface3_8;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
	public boolean aBoolean702;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Z)V")
	public Class347(@OriginalArg(0) boolean arg0) {
		this.aBoolean702 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void method8142() {
		if (this.anInterface3_8 != null) {
			this.anInterface3_8.method5230();
		}
		this.aBoolean703 = false;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Z")
	public boolean method8143() {
		return this.aBoolean703 && !this.aBoolean702;
	}
}
