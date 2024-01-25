import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class Class60 {

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!vk;")
	public Class60 aClass60_67;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!vk;")
	public Class60 aClass60_68;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
	public final void method8914() {
		if (this.aClass60_68 != null) {
			this.aClass60_68.aClass60_67 = this.aClass60_67;
			this.aClass60_67.aClass60_68 = this.aClass60_68;
			this.aClass60_68 = null;
			this.aClass60_67 = null;
		}
	}
}
