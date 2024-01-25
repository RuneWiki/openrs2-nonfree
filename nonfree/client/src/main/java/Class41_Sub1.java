import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class41_Sub1 extends Class41 implements Interface17 {

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!dw;I[BI)V")
	public Class41_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1075 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)J")
	@Override
	public long method5962() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I")
	@Override
	public int method5961() {
		return this.anInt1075;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	@Override
	public int method5959() {
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5960(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5395(arg1, arg0);
		this.anInt1075 = 5123;
	}
}
