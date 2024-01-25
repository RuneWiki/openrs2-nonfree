import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class94_Sub2 extends Class94 implements Interface6 {

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	private int anInt5824;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	private int anInt5823;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ic;I[BIZ)V")
	public Class94_Sub2(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5824 = arg1;
		this.anInt5823 = this.aClass48_Sub2_30.method2610(this.anInt5824);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
	@Override
	public int method5135() {
		return super.method5135();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5133(arg0, arg1);
		this.anInt5824 = 5123;
		this.anInt5823 = this.aClass48_Sub2_30.method2610(this.anInt5824);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	@Override
	public void method5137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass48_Sub2_30.anOpengl2.glDrawElements(4, arg1, this.anInt5824, (long) (arg0 * this.anInt5823));
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "()V")
	@Override
	protected void method5134() {
		this.aClass48_Sub2_30.method2562(this);
	}
}
