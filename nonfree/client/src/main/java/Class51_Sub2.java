import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class51_Sub2 extends Class51 implements Interface2 {

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
	private int anInt4893;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ur;I[BIZ)V")
	public Class51_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4893 = arg1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI[BI)V")
	@Override
	public void method3824(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method3818(arg0, arg1);
		this.anInt4893 = 5123;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I")
	@Override
	public int method3826() {
		return super.anInt4878;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method3825() {
		return this.anInt4893;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	@Override
	protected void method3821() {
		super.aClass34_Sub2_24.method5538(this);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)J")
	@Override
	public long method3823() {
		return 0L;
	}
}
