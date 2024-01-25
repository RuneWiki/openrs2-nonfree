import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class48_Sub2 extends Class48 implements Interface1 {

	@OriginalMember(owner = "client!up", name = "g", descriptor = "I")
	private int anInt6342;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "I")
	private int anInt6343;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!mm;I[BIZ)V")
	public Class48_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6342 = arg1;
		this.anInt6343 = this.aClass55_Sub1_39.method3687(this.anInt6342);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "()V")
	@Override
	protected void method5664() {
		this.aClass55_Sub1_39.method3675(this);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "()I")
	@Override
	public int method5663() {
		return super.method5663();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5665(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5662(arg0, arg1);
		this.anInt6342 = 5123;
		this.anInt6343 = this.aClass55_Sub1_39.method3687(this.anInt6342);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
	@Override
	public void method5666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass55_Sub1_39.anOpengl1.glDrawElements(4, arg1, this.anInt6342, (long) (arg0 * this.anInt6343));
	}
}
