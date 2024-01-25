import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class110_Sub1 extends Class110 implements Interface5 {

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	private int anInt4617;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	private int anInt4616;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!cg;I[BIZ)V")
	public Class110_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4617 = arg1;
		this.anInt4616 = this.aClass37_Sub1_41.method792(this.anInt4617);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
	@Override
	protected void method5583() {
		this.aClass37_Sub1_41.method748(this);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	@Override
	public void method4904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass37_Sub1_41.anOpengl1.glDrawElements(4, arg1, this.anInt4617, (long) (arg0 * this.anInt4616));
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
	@Override
	public int method5582() {
		return super.method5582();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4905(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5584(arg0, arg1);
		this.anInt4617 = 5123;
		this.anInt4616 = this.aClass37_Sub1_41.method792(this.anInt4617);
	}
}
