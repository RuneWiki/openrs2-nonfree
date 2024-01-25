import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class199_Sub2 extends Class199 implements Interface12 {

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	private int anInt6070;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!kd;I[BIZ)V")
	public Class199_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6070 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!kd;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class199_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6070 = arg1;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)J")
	@Override
	public long method5066() {
		return 0L;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	@Override
	protected void method5062() {
		super.aClass39_Sub2_37.method3169(this);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I")
	@Override
	public int method5065() {
		return this.anInt6070;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method5068(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5061(arg0, arg1);
		this.anInt6070 = arg2;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I")
	@Override
	public int method5067() {
		return super.anInt6063;
	}
}
