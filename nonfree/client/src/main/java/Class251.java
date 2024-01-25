import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class251 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!up;")
	public Interface16 anInterface16_13;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!up;")
	public Interface16 anInterface16_14;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Z)V")
	public Class251(@OriginalArg(0) boolean arg0) {
		this.aBoolean526 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	public boolean method6001() {
		return this.aBoolean525 && !this.aBoolean526;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method6002() {
		if (this.anInterface16_13 != null) {
			this.anInterface16_13.method3493();
		}
		this.aBoolean525 = false;
	}
}
