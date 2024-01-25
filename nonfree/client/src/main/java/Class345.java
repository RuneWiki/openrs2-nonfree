import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class345 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public int anInt9804;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public int anInt9805;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public int anInt9806;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class345() {
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!vk;)V")
	public Class345(@OriginalArg(0) Class345 arg0) {
		this.anInt9805 = arg0.anInt9805;
		this.anInt9806 = arg0.anInt9806;
		this.anInt9804 = arg0.anInt9804;
	}
}
