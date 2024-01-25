import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class54_Sub1 extends Class54 implements Interface5 {

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	private int anInt1849;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	private int anInt1850;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!sq;I[BIZ)V")
	public Class54_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1849 = arg1;
		this.anInt1850 = this.aClass46_Sub2_16.method5232(this.anInt1849);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
	@Override
	public void method5080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass46_Sub2_16.anOpengl1.glDrawElements(4, arg1, this.anInt1849, (long) (arg0 * this.anInt1850));
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "()I")
	@Override
	public int method5385() {
		return super.method5385();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5081(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2650(arg0, arg1);
		this.anInt1849 = 5123;
		this.anInt1850 = this.aClass46_Sub2_16.method5232(this.anInt1849);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "()V")
	@Override
	protected void method2649() {
		this.aClass46_Sub2_16.method5227(this);
	}
}
