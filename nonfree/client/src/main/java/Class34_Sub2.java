import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class34_Sub2 extends Class34 implements Interface10 {

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
	private int anInt5205;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!od;I[BIZ)V")
	public Class34_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5205 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!od;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class34_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5205 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4283(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4053(arg1, arg0);
		this.anInt5205 = arg2;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
	@Override
	public int method4284() {
		return this.anInt5205;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)J")
	@Override
	public long method4282() {
		return 0L;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	@Override
	public int method4281() {
		return super.anInt5192;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
	@Override
	protected void method4051() {
		super.aClass128_Sub2_32.method3688(this);
	}
}
