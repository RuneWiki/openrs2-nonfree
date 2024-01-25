import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class63_Sub2 extends Class63 implements Interface4 {

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt4667;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt4666;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!hj;I[BIZ)V")
	public Class63_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4667 = arg1;
		this.anInt4666 = this.aClass2_Sub1_27.method2341(this.anInt4667);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "()V")
	@Override
	protected void method4263() {
		this.aClass2_Sub1_27.method2378(this);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()I")
	@Override
	public int method4262() {
		return super.method4262();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	@Override
	public void method4266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass2_Sub1_27.anOpengl1.glDrawElements(4, arg1, this.anInt4667, (long) (arg0 * this.anInt4666));
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4265(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4264(arg0, arg1);
		this.anInt4667 = 5123;
		this.anInt4666 = this.aClass2_Sub1_27.method2341(this.anInt4667);
	}
}
