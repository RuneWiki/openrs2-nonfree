import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class70 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!je;")
	public Interface16 anInterface16_2;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!je;")
	public Interface16 anInterface16_3;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Z)V")
	public Class70(@OriginalArg(0) boolean arg0) {
		this.aBoolean135 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Z")
	public boolean method2052() {
		return this.aBoolean136 && !this.aBoolean135;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public void method2053() {
		if (this.anInterface16_2 != null) {
			this.anInterface16_2.method8358();
		}
		this.aBoolean136 = false;
	}
}
