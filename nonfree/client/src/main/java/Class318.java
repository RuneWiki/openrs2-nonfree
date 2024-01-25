import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class318 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!u;")
	public Interface26 anInterface26_15;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!u;")
	public Interface26 anInterface26_16;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Z")
	public boolean aBoolean789;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "Z")
	public boolean aBoolean788;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Z)V")
	public Class318(@OriginalArg(0) boolean arg0) {
		this.aBoolean788 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method7727() {
		if (this.anInterface26_16 != null) {
			this.anInterface26_16.method7627();
		}
		this.aBoolean789 = false;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z")
	public boolean method7728() {
		return this.aBoolean789 && !this.aBoolean788;
	}
}
