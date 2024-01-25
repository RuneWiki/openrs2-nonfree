import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class63_Sub2 extends Class63 implements Interface4 {

	@OriginalMember(owner = "client!km", name = "v", descriptor = "I")
	private int anInt5503;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!ml;I[BIZ)V")
	public Class63_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5503 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	@Override
	protected void method5014() {
		super.aClass75_Sub3_23.method5814(this);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5017(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method5011(arg0, arg1);
		this.anInt5503 = 5123;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)J")
	@Override
	public long method5016() {
		return 0L;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	@Override
	public int method5015() {
		return super.anInt5499;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	@Override
	public int method5018() {
		return this.anInt5503;
	}
}
