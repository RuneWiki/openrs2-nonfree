import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class344 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "J")
	public final long aLong402;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_38;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!ag;JI)V")
	public Class344(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong402 = arg1;
		this.aClass12_Sub1_38 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub1_38.method391(this.aLong402);
		super.finalize();
	}
}
