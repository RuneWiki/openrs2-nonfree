import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class181 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Lclient!fw;")
	public Interface12 anInterface12_4;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "Lclient!fw;")
	public Interface12 anInterface12_5;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Z)V")
	public Class181(@OriginalArg(0) boolean arg0) {
		this.aBoolean308 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Z")
	public boolean method4138() {
		return this.aBoolean307 && !this.aBoolean308;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	public void method4141() {
		if (this.anInterface12_4 != null) {
			this.anInterface12_4.method8887();
		}
		this.aBoolean307 = false;
	}
}
