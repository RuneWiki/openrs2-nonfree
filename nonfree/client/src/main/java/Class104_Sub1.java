import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class104_Sub1 extends Class104 implements Interface6 {

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	private int anInt2739;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!bv;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class104_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2739 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!bv;I[BIZ)V")
	public Class104_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2739 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method2114(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4727(arg0, arg1);
		this.anInt2739 = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	@Override
	public int method2115() {
		return this.anInt2739;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)J")
	@Override
	public long method2116() {
		return 0L;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
	@Override
	protected void method4729() {
		super.aClass30_Sub1_38.method978(this);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)I")
	@Override
	public int method2117() {
		return super.anInt6045;
	}
}
