import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 implements Interface4 {

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	private int anInt8;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!mi;I[BIZ)V")
	public Class1_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7 = arg1;
		this.anInt8 = this.aClass155_Sub1_15.method3617(this.anInt7);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
	@Override
	protected void method2199() {
		this.aClass155_Sub1_15.method3571(this);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method2311(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2201(arg0, arg1);
		this.anInt7 = 5123;
		this.anInt8 = this.aClass155_Sub1_15.method3617(this.anInt7);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	@Override
	public void method2310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass155_Sub1_15.anOpengl1.glDrawElements(4, arg1, this.anInt7, (long) (arg0 * this.anInt8));
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "()I")
	@Override
	public int method3932() {
		return super.method3932();
	}
}
