import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class65 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!ii;")
	public Interface13 anInterface13_1;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
	public boolean aBoolean122;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!ii;")
	public Interface13 anInterface13_2;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Z)V")
	public Class65(@OriginalArg(0) boolean arg0) {
		this.aBoolean123 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
	public boolean method1645() {
		return this.aBoolean122 && !this.aBoolean123;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public void method1646() {
		if (this.anInterface13_2 != null) {
			this.anInterface13_2.method4091();
		}
		this.aBoolean122 = false;
	}
}
