import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class119_Sub1 extends Class119 implements Interface12 {

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
	private int anInt4485;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!eq;I[BIZ)V")
	public Class119_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4485 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
	@Override
	public int method3817() {
		return super.anInt9833;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	@Override
	public int method3815() {
		return this.anInt4485;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3814(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method8090(arg1, arg0);
		this.anInt4485 = 5123;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	@Override
	protected void method8089() {
		super.aClass33_Sub3_40.method3030(this);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)J")
	@Override
	public long method3816() {
		return 0L;
	}
}
