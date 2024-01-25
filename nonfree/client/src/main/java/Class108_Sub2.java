import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class108_Sub2 extends Class108 implements Interface3 {

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	private int anInt8731;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!ap;I[BIZ)V")
	public Class108_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt8731 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	@Override
	protected void method7293() {
		super.aClass9_Sub2_34.method775(this);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
	@Override
	public int method7655() {
		return this.anInt8731;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
	@Override
	public int method7654() {
		return super.anInt8727;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)J")
	@Override
	public long method7656() {
		return 0L;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method7657(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method7294(arg0, arg1);
		this.anInt8731 = 5123;
	}
}
