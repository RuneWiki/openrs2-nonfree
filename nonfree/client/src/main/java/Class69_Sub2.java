import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class69_Sub2 extends Class69 implements Interface4 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	private int anInt2561;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!h;I[BIZ)V")
	public Class69_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2560 = arg1;
		this.anInt2561 = this.aClass32_Sub2_17.method2292(this.anInt2560);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	@Override
	protected void method2339() {
		this.aClass32_Sub2_17.method2298(this);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	@Override
	public void method2575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass32_Sub2_17.anOpengl2.glDrawElements(4, arg1, this.anInt2560, (long) (arg0 * this.anInt2561));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2574(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2337(arg0, arg1);
		this.anInt2560 = 5123;
		this.anInt2561 = this.aClass32_Sub2_17.method2292(this.anInt2560);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
	@Override
	public int method2573() {
		return super.method2573();
	}
}
