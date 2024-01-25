import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class27 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "Lclient!ug;")
	public Interface27 anInterface27_3;

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "Lclient!ug;")
	public Interface27 anInterface27_4;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Z)V")
	public Class27(@OriginalArg(0) boolean arg0) {
		this.aBoolean136 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public void method1347() {
		if (this.anInterface27_3 != null) {
			this.anInterface27_3.method8104();
		}
		this.aBoolean135 = false;
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(B)Z")
	public boolean method1348() {
		return this.aBoolean135 && !this.aBoolean136;
	}
}
