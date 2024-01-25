import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class45_Sub2 extends Class45 implements Interface12 {

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	private int anInt4646;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!bv;I[BI)V")
	public Class45_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4646 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.anInt4646;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4734(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method3513(arg1, arg0);
		this.anInt4646 = 5123;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)J")
	@Override
	public long method4732() {
		return super.aNativeBuffer4.a();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	@Override
	public int method4731() {
		return 0;
	}
}
