import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class80_Sub1 extends Class80 implements Interface8 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	private int anInt1920;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	private int anInt1919;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!nf;I[BIZ)V")
	public Class80_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1920 = arg1;
		this.anInt1919 = this.aClass105_Sub1_22.method3583(this.anInt1920);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
	@Override
	public int method4193() {
		return super.method4193();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	@Override
	public void method1582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass105_Sub1_22.anOpengl1.glDrawElements(4, arg1, this.anInt1920, (long) (arg0 * this.anInt1919));
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method1583(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2977(arg0, arg1);
		this.anInt1920 = 5123;
		this.anInt1919 = this.aClass105_Sub1_22.method3583(this.anInt1920);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
	@Override
	protected void method2979() {
		this.aClass105_Sub1_22.method3616(this);
	}
}
