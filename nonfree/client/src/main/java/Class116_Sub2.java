import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class116_Sub2 extends Class116 implements Interface27 {

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
	private int anInt10679;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!aq;I[BIZ)V")
	public Class116_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt10679 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)J")
	@Override
	public long method9068() {
		return 0L;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)I")
	@Override
	public int method9069() {
		return super.anInt10667;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	@Override
	protected void method9066() {
		super.aClass22_Sub1_40.method909(this);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)I")
	@Override
	public int method9067() {
		return this.anInt10679;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method9070(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method9065(arg0, arg1);
		this.anInt10679 = 5123;
	}
}
