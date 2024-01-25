import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class376 {

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "Z")
	public boolean aBoolean763;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Lclient!lq;")
	public Interface16 anInterface16_17;

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "Lclient!lq;")
	public Interface16 anInterface16_18;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Z")
	public boolean aBoolean764;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Z)V")
	public Class376(@OriginalArg(0) boolean arg0) {
		this.aBoolean764 = arg0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z")
	public boolean method8821() {
		return this.aBoolean763 && !this.aBoolean764;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	public void method8824() {
		if (this.anInterface16_17 != null) {
			this.anInterface16_17.method9249();
		}
		this.aBoolean763 = false;
	}
}
