import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class138_Sub2 extends Class138 implements Interface9 {

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	private int anInt5409;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!bt;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class138_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5409 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!bt;I[BIZ)V")
	public Class138_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5409 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
	@Override
	public int method4496() {
		return super.anInt5393;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)J")
	@Override
	public long method4495() {
		return 0L;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	@Override
	protected void method4492() {
		super.aClass30_Sub1_34.method714(this);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method4490(arg2, arg1);
		this.anInt5409 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I")
	@Override
	public int method4494() {
		return this.anInt5409;
	}
}
