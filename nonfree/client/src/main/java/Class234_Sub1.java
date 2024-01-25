import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class234_Sub1 extends Class234 implements Interface3 {

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	private int anInt6842;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ih;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class234_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6842 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class234_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6842 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)J")
	@Override
	public long method5207() {
		return 0L;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V")
	@Override
	protected void method5854() {
		super.aClass106_Sub2_41.method2852(this);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I")
	@Override
	public int method5204() {
		return this.anInt6842;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method5206(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5850(arg1, arg0);
		this.anInt6842 = arg2;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)I")
	@Override
	public int method5205() {
		return super.anInt7670;
	}
}
