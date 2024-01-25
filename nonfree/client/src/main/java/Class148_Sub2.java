import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public final class Class148_Sub2 extends Class148 implements Interface14 {

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
	private int anInt4527;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!pq;I[BIZ)V")
	public Class148_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4527 = arg1;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)I")
	@Override
	public int method8577() {
		return this.anInt4527;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)I")
	@Override
	public int method8576() {
		return super.anInt4519;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)J")
	@Override
	public long method8574() {
		return 0L;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8575(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method3790(arg1, arg0);
		this.anInt4527 = 5123;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	@Override
	protected void method3788() {
		super.aClass132_Sub3_25.method6812(this);
	}
}
