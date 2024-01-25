import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class152_Sub1 extends Class152 implements Interface1 {

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
	private int anInt4720;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!fd;I[BIZ)V")
	public Class152_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4720 = arg1;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)J")
	@Override
	public long method3658() {
		return 0L;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
	@Override
	public int method3656() {
		return super.anInt6614;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
	@Override
	public int method3659() {
		return this.anInt4720;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([BZII)V")
	@Override
	public void method3657(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5177(arg1, arg0);
		this.anInt4720 = 5123;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
	@Override
	protected void method5179() {
		super.aClass19_Sub2_37.method1970(this);
	}
}
