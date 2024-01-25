import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class68_Sub1 extends Class68 implements Interface9 {

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
	private int anInt3984;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ih;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class68_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3984 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class68_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3984 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)J")
	@Override
	public long method3688() {
		return 0L;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
	@Override
	protected void method5200() {
		super.aClass117_Sub1_39.method2497(this);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	@Override
	public int method3687() {
		return super.anInt6475;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method5203(arg2, arg1);
		this.anInt3984 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I")
	@Override
	public int method3690() {
		return this.anInt3984;
	}
}
