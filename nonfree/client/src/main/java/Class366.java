import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class366 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!fb;")
	public Interface6 anInterface6_17;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!fb;")
	public Interface6 anInterface6_18;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
	public boolean aBoolean724;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Z)V")
	public Class366(@OriginalArg(0) boolean arg0) {
		this.aBoolean724 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
	public void method8616() {
		if (this.anInterface6_17 != null) {
			this.anInterface6_17.method6765();
		}
		this.aBoolean723 = false;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z")
	public boolean method8618() {
		return this.aBoolean723 && !this.aBoolean724;
	}
}
