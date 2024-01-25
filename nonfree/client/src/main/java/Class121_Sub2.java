import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class121_Sub2 extends Class121 implements Interface8 {

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int anInt6207;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int anInt6206;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!se;I[BIZ)V")
	public Class121_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6207 = arg1;
		this.anInt6206 = this.aClass122_Sub2_42.method4885(this.anInt6207);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()I")
	@Override
	public int method5253() {
		return super.method5253();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5257(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5255(arg0, arg1);
		this.anInt6207 = 5123;
		this.anInt6206 = this.aClass122_Sub2_42.method4885(this.anInt6207);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method5256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass122_Sub2_42.anOpengl2.glDrawElements(4, arg1, this.anInt6207, (long) (arg0 * this.anInt6206));
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
	@Override
	protected void method5254() {
		this.aClass122_Sub2_42.method4829(this);
	}
}
