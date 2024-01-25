import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class202_Sub1 extends Class202 implements Interface12 {

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!qfa;I[BIZ)V")
	public Class202_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6002 = arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method5494(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5112(arg1, arg0);
		this.anInt6002 = 5123;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)J")
	@Override
	public long method5495() {
		return 0L;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)I")
	@Override
	public int method5496() {
		return super.anInt6160;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
	@Override
	public int method5493() {
		return this.anInt6002;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V")
	@Override
	protected void method5110() {
		super.aClass137_Sub3_20.method7099(this);
	}
}
