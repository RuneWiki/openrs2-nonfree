import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class15 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Z")
	public boolean aBoolean39;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!lk;")
	public Interface16 anInterface16_1;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Lclient!lk;")
	public Interface16 anInterface16_2;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Z)V")
	public Class15(@OriginalArg(0) boolean arg0) {
		this.aBoolean40 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)Z")
	public boolean method422() {
		return this.aBoolean39 && !this.aBoolean40;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)V")
	public void method423() {
		if (this.anInterface16_1 != null) {
			this.anInterface16_1.method7459();
		}
		this.aBoolean39 = false;
	}
}
