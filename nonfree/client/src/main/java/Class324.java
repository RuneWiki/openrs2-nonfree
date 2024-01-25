import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class324 {

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "Lclient!bo;")
	public Interface2 anInterface2_7;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Lclient!bo;")
	public Interface2 anInterface2_8;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Z)V")
	public Class324(@OriginalArg(0) boolean arg0) {
		this.aBoolean622 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
	public void method7237() {
		if (this.anInterface2_7 != null) {
			this.anInterface2_7.method7285();
		}
		this.aBoolean621 = false;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z")
	public boolean method7240() {
		return this.aBoolean621 && !this.aBoolean622;
	}
}
