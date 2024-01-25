import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class71 {

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "Lclient!fk;")
	public Interface15 anInterface15_5;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "Lclient!fk;")
	public Interface15 anInterface15_6;

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Z)V")
	public Class71(@OriginalArg(0) boolean arg0) {
		this.aBoolean124 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public void method1371() {
		if (this.anInterface15_6 != null) {
			this.anInterface15_6.method7351();
		}
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)Z")
	public boolean method1372() {
		return this.aBoolean123 && !this.aBoolean124;
	}
}
