import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class352 {

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!wf;")
	public Interface24 anInterface24_14;

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "Lclient!wf;")
	public Interface24 anInterface24_15;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Z")
	public boolean aBoolean705;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "Z")
	public boolean aBoolean706;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Z)V")
	public Class352(@OriginalArg(0) boolean arg0) {
		this.aBoolean706 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public void method8017() {
		if (this.anInterface24_14 != null) {
			this.anInterface24_14.method7925();
		}
		this.aBoolean705 = false;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)Z")
	public boolean method8018() {
		return this.aBoolean705 && !this.aBoolean706;
	}
}
