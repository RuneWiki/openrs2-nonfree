import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class89_Sub2 extends Class89 implements Interface13 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private int anInt4006;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!nq;I[BI)V")
	public Class89_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4006 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I")
	@Override
	public int method4214() {
		return this.anInt4006;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)J")
	@Override
	public long method4216() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	@Override
	public int method4217() {
		return 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method4215(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method3410(arg1, arg0);
		this.anInt4006 = 5123;
	}
}
