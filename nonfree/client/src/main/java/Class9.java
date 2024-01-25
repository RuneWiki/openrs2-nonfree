import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class9 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!jn;")
	public Interface9 anInterface9_1;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
	public boolean aBoolean11;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!jn;")
	public Interface9 anInterface9_2;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Z)V")
	public Class9(@OriginalArg(0) boolean arg0) {
		this.aBoolean10 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Z")
	public boolean method135() {
		return this.aBoolean11 && !this.aBoolean10;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public void method136() {
		if (this.anInterface9_2 != null) {
			this.anInterface9_2.method6461();
		}
		this.aBoolean11 = false;
	}
}
