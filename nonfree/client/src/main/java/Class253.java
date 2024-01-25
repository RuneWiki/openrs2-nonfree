import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class253 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "Lclient!jj;")
	public Interface12 anInterface12_4;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!jj;")
	public Interface12 anInterface12_5;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Z)V")
	public Class253(@OriginalArg(0) boolean arg0) {
		this.aBoolean619 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public void method5907() {
		if (this.anInterface12_5 != null) {
			this.anInterface12_5.method8235();
		}
		this.aBoolean618 = false;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z")
	public boolean method5909() {
		return this.aBoolean618 && !this.aBoolean619;
	}
}
