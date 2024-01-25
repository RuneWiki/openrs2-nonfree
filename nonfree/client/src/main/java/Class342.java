import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class342 {

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	public int anInt9881;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public int anInt9876 = 443;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
	private boolean aBoolean691 = false;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public int anInt9874 = 43594;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!wd;)Lclient!nga;")
	public Class234 method8058(@OriginalArg(1) Class354 arg0) {
		return arg0.method8220(this.aBoolean691 ? this.anInt9876 : this.anInt9874, this.aBoolean692, this.aString96);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!vk;I)Z")
	public boolean method8060(@OriginalArg(0) Class342 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt9881 == arg0.anInt9881 && this.aString96.equals(arg0.aString96);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public void method8062() {
		if (!this.aBoolean691) {
			this.aBoolean692 = true;
			this.aBoolean691 = true;
		} else if (this.aBoolean692) {
			this.aBoolean692 = false;
		} else {
			this.aBoolean691 = false;
		}
	}
}
