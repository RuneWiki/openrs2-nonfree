import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class47_Sub2 extends Class47 implements Interface4 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!hj;I[BI)V")
	public Class47_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2761 = arg1;
		this.anInt2760 = this.aClass2_Sub1_20.method2341(this.anInt2761);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4265(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2667(arg0, arg1);
		this.anInt2761 = 5123;
		this.anInt2760 = this.aClass2_Sub1_20.method2341(this.anInt2761);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()I")
	@Override
	public int method4262() {
		return 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
	@Override
	public void method4266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass2_Sub1_20.anOpengl1.glDrawElements(4, arg1, this.anInt2761, this.aByteBuffer4.position(arg0 * this.anInt2760));
	}
}
