import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class19_Sub2 extends Class19 implements Interface5 {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	private int anInt3803;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	private int anInt3804;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!nm;I[BIZ)V")
	public Class19_Sub2(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt3803 = arg1;
		this.anInt3804 = this.aClass164_Sub1_28.method3592(this.anInt3803);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3105(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3102(arg0, arg1);
		this.anInt3803 = 5123;
		this.anInt3804 = this.aClass164_Sub1_28.method3592(this.anInt3803);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()V")
	@Override
	protected void method3101() {
		this.aClass164_Sub1_28.method3605(this);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method3104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass164_Sub1_28.anOpengl1.glDrawElements(4, arg1, this.anInt3803, (long) (arg0 * this.anInt3804));
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
	@Override
	public int method3103() {
		return super.method3103();
	}
}
