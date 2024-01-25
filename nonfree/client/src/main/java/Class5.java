import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class5 {

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Lclient!km;")
	public Interface15 anInterface15_1;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "Lclient!km;")
	public Interface15 anInterface15_2;

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Z)V")
	public Class5(@OriginalArg(0) boolean arg0) {
		this.aBoolean5 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
	public void method107() {
		if (this.anInterface15_1 != null) {
			this.anInterface15_1.method7409();
		}
		this.aBoolean6 = false;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)Z")
	public boolean method108() {
		return this.aBoolean6 && !this.aBoolean5;
	}
}
