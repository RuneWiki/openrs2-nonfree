import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class288 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!wba;")
	public Interface25 anInterface25_15;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Z")
	public boolean aBoolean614;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "Lclient!wba;")
	public Interface25 anInterface25_16;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Z")
	public boolean aBoolean613;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Z)V")
	public Class288(@OriginalArg(0) boolean arg0) {
		this.aBoolean613 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)Z")
	public boolean method7498() {
		return this.aBoolean614 && !this.aBoolean613;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method7499() {
		if (this.anInterface25_15 != null) {
			this.anInterface25_15.method9037();
		}
		this.aBoolean614 = false;
	}
}
