import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class48_Sub2 extends Class48 implements Interface6 {

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	private int anInt4290;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
	private int anInt4291;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!ig;I[BIZ)V")
	public Class48_Sub2(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4290 = arg1;
		this.anInt4291 = this.aClass47_Sub2_25.method2831(this.anInt4290);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4258(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3863(arg0, arg1);
		this.anInt4290 = 5123;
		this.anInt4291 = this.aClass47_Sub2_25.method2831(this.anInt4290);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	public void method4257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass47_Sub2_25.anOpengl2.glDrawElements(4, arg1, this.anInt4290, (long) (arg0 * this.anInt4291));
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()V")
	@Override
	protected void method3862() {
		this.aClass47_Sub2_25.method2806(this);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()I")
	@Override
	public int method4256() {
		return super.method4256();
	}
}
