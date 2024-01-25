import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class80_Sub2 extends Class80 implements Interface5 {

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	private int anInt5160;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	private int anInt5161;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!tb;I[BIZ)V")
	public Class80_Sub2(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5160 = arg1;
		this.anInt5161 = this.aClass129_Sub2_34.method5057(this.anInt5160);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()V")
	@Override
	protected void method4429() {
		this.aClass129_Sub2_34.method5059(this);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4886(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4428(arg0, arg1);
		this.anInt5160 = 5123;
		this.anInt5161 = this.aClass129_Sub2_34.method5057(this.anInt5160);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	@Override
	public void method4887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass129_Sub2_34.anOpengl2.glDrawElements(4, arg1, this.anInt5160, (long) (arg0 * this.anInt5161));
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
	@Override
	public int method4888() {
		return super.method4888();
	}
}
