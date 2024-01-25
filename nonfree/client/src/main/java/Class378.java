import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class378 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!rr;")
	public Interface19 anInterface19_7;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Z")
	public boolean aBoolean731;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!rr;")
	public Interface19 anInterface19_8;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Z)V")
	public Class378(@OriginalArg(0) boolean arg0) {
		this.aBoolean730 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public void method8723() {
		if (this.anInterface19_7 != null) {
			this.anInterface19_7.method7982();
		}
		this.aBoolean731 = false;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z")
	public boolean method8726() {
		return this.aBoolean731 && !this.aBoolean730;
	}
}
