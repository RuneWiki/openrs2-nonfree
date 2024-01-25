import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class33_Sub1 extends Class33 implements Interface9 {

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!hd;I[BIZ)V")
	public Class33_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2494 = arg1;
		this.anInt2493 = this.aClass89_Sub1_34.method2469(this.anInt2494);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	@Override
	public void method5711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass89_Sub1_34.anOpengl2.glDrawElements(4, arg1, this.anInt2494, (long) (arg0 * this.anInt2493));
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "()V")
	@Override
	protected void method4544() {
		this.aClass89_Sub1_34.method2444(this);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()I")
	@Override
	public int method5710() {
		return super.method5710();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5712(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4542(arg0, arg1);
		this.anInt2494 = 5123;
		this.anInt2493 = this.aClass89_Sub1_34.method2469(this.anInt2494);
	}
}
