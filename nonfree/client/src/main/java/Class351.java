import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class351 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_41;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public final int anInt9092;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class351(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass45_Sub3_41 = arg0;
		this.anInt9092 = arg2;
	}

	@OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub3_41.method7459(this.anInt9092);
		super.finalize();
	}
}
