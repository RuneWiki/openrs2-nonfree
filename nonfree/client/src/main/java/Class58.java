import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class58 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!ui;")
	public Interface20 anInterface20_1;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!ui;")
	public Interface20 anInterface20_2;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Z)V")
	public Class58(@OriginalArg(0) boolean arg0) {
		this.aBoolean155 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Z")
	public boolean method1879() {
		return this.aBoolean154 && !this.aBoolean155;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public void method1880() {
		if (this.anInterface20_1 != null) {
			this.anInterface20_1.method6239();
		}
		this.aBoolean154 = false;
	}
}
