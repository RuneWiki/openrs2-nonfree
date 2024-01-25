import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class274 {

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Z")
	public boolean aBoolean584;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "Lclient!tj;")
	public Interface21 anInterface21_6;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Lclient!tj;")
	public Interface21 anInterface21_7;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "Z")
	public boolean aBoolean585;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Z)V")
	public Class274(@OriginalArg(0) boolean arg0) {
		this.aBoolean585 = arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	public void method6626() {
		if (this.anInterface21_6 != null) {
			this.anInterface21_6.method6520();
		}
		this.aBoolean584 = false;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
	public boolean method6628() {
		return this.aBoolean584 && !this.aBoolean585;
	}
}
