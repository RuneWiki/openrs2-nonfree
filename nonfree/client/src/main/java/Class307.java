import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class307 {

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!tfa;")
	public Interface20 anInterface20_12;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "Z")
	public boolean aBoolean673;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!tfa;")
	public Interface20 anInterface20_13;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Z")
	public boolean aBoolean672;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Z)V")
	public Class307(@OriginalArg(0) boolean arg0) {
		this.aBoolean672 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	public boolean method7454() {
		return this.aBoolean673 && !this.aBoolean672;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public void method7456() {
		if (this.anInterface20_13 != null) {
			this.anInterface20_13.method6520();
		}
		this.aBoolean673 = false;
	}
}
