import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class32 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Z")
	public boolean aBoolean24;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!go;")
	public Interface11 anInterface11_2;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Lclient!go;")
	public Interface11 anInterface11_3;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Z")
	public boolean aBoolean25;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Z)V")
	public Class32(@OriginalArg(0) boolean arg0) {
		this.aBoolean25 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
	public boolean method567() {
		return this.aBoolean24 && !this.aBoolean25;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public void method570() {
		if (this.anInterface11_3 != null) {
			this.anInterface11_3.method7567();
		}
		this.aBoolean24 = false;
	}
}
