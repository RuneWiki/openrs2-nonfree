import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class94 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "Lclient!ega;")
	public Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Lclient!ega;")
	public Interface8 anInterface8_2;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Z)V")
	public Class94(@OriginalArg(0) boolean arg0) {
		this.aBoolean141 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public void method1729() {
		if (this.anInterface8_2 != null) {
			this.anInterface8_2.method7032();
		}
		this.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	public boolean method1731() {
		return this.aBoolean140 && !this.aBoolean141;
	}
}
