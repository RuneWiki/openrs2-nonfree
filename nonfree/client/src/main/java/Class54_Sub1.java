import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class54_Sub1 extends Class54 implements Interface3 {

	@OriginalMember(owner = "client!er", name = "h", descriptor = "I")
	private int anInt1728;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	private int anInt1727;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ql;I[BIZ)V")
	public Class54_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1728 = arg1;
		this.anInt1727 = this.aClass92_Sub2_30.method4602(this.anInt1728);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4363(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4301(arg0, arg1);
		this.anInt1728 = 5123;
		this.anInt1727 = this.aClass92_Sub2_30.method4602(this.anInt1728);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	@Override
	public void method4364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass92_Sub2_30.anOpengl2.glDrawElements(4, arg1, this.anInt1728, (long) (arg0 * this.anInt1727));
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()V")
	@Override
	protected void method4300() {
		this.aClass92_Sub2_30.method4571(this);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
	@Override
	public int method4362() {
		return super.method4362();
	}
}
