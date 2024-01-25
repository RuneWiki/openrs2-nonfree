import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class92_Sub2 extends Class92 implements Interface7 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	private int anInt6387;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!te;I[BI)V")
	public Class92_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6387 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J")
	@Override
	public long method6742() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	@Override
	public int method6743() {
		return this.anInt6387;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I")
	@Override
	public int method6740() {
		return 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method6741(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5531(arg1, arg0);
		this.anInt6387 = 5123;
	}
}
