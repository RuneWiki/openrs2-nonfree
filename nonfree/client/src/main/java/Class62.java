import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class62 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!wl;")
	public Interface24 anInterface24_3;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
	public boolean aBoolean182;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!wl;")
	public Interface24 anInterface24_4;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
	public boolean aBoolean181;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Z)V")
	public Class62(@OriginalArg(0) boolean arg0) {
		this.aBoolean181 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z")
	public boolean method1947() {
		return this.aBoolean182 && !this.aBoolean181;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public void method1948() {
		if (this.anInterface24_3 != null) {
			this.anInterface24_3.method6939();
		}
		this.aBoolean182 = false;
	}
}
