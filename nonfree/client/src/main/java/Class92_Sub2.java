import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class92_Sub2 extends Class92 implements Interface3 {

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	private int anInt3912;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	private int anInt3911;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!fu;I[BIZ)V")
	public Class92_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt3912 = arg1;
		this.anInt3911 = this.aClass63_Sub2_30.method2071(this.anInt3912);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
	@Override
	protected void method3590() {
		this.aClass63_Sub2_30.method2136(this);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	@Override
	public void method3591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass63_Sub2_30.anOpengl2.glDrawElements(4, arg1, this.anInt3912, (long) (arg0 * this.anInt3911));
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()I")
	@Override
	public int method3588() {
		return super.method3588();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3592(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3589(arg0, arg1);
		this.anInt3912 = 5123;
		this.anInt3911 = this.aClass63_Sub2_30.method2071(this.anInt3912);
	}
}
