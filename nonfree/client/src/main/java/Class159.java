import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class Class159 {

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	protected Class159() {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Lclient!uk;")
	public abstract Class202 method4063();

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4064(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)I")
	public abstract int method4070(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public abstract void method4071(@OriginalArg(0) int arg0);
}
