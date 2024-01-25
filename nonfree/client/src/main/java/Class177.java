import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class177 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!ft;")
	public Interface8 anInterface8_6;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!ft;")
	public Interface8 anInterface8_7;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
	public boolean aBoolean361;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
	public boolean aBoolean362;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Z)V")
	public Class177(@OriginalArg(0) boolean arg0) {
		this.aBoolean362 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
	public boolean method4111() {
		return this.aBoolean361 && !this.aBoolean362;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public void method4112() {
		if (this.anInterface8_6 != null) {
			this.anInterface8_6.method7146();
		}
		this.aBoolean361 = false;
	}
}
