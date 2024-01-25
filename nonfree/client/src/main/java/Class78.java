import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class78 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "Lclient!cq;")
	public Interface3 anInterface3_7;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "Lclient!cq;")
	public Interface3 anInterface3_8;

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Z)V")
	public Class78(@OriginalArg(0) boolean arg0) {
		this.aBoolean206 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	public void method1976() {
		if (this.anInterface3_7 != null) {
			this.anInterface3_7.method8235();
		}
		this.aBoolean205 = false;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	public boolean method1977() {
		return this.aBoolean205 && !this.aBoolean206;
	}
}
