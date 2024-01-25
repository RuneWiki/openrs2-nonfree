import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class258 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
	public boolean aBoolean493;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Lclient!id;")
	public Interface15 anInterface15_10;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!id;")
	public Interface15 anInterface15_11;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Z")
	public boolean aBoolean494;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Z)V")
	public Class258(@OriginalArg(0) boolean arg0) {
		this.aBoolean494 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public void method6233() {
		if (this.anInterface15_10 != null) {
			this.anInterface15_10.method8737();
		}
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
	public boolean method6236() {
		return this.aBoolean493 && !this.aBoolean494;
	}
}
