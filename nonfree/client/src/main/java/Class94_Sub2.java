import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class94_Sub2 extends Class94 implements Interface12 {

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!na;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class94_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5615 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!na;I[BIZ)V")
	public Class94_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5615 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)I")
	@Override
	public int method5415() {
		return super.anInt5609;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)J")
	@Override
	public long method5417() {
		return 0L;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method4453(arg2, arg0);
		this.anInt5615 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	@Override
	public int method5414() {
		return this.anInt5615;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
	@Override
	protected void method4454() {
		super.aClass75_Sub2_32.method3828(this);
	}
}
