import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class158_Sub2 extends Class158 implements Interface6 {

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
	private int anInt5963;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!jj;I[BIZ)V")
	public Class158_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5963 = arg1;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)J")
	@Override
	public long method6020() {
		return 0L;
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)V")
	@Override
	protected void method4962() {
		super.aClass62_Sub3_20.method3949(this);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method6017(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method4960(arg1, arg0);
		this.anInt5963 = 5123;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)I")
	@Override
	public int method6018() {
		return super.anInt5955;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)I")
	@Override
	public int method6019() {
		return this.anInt5963;
	}
}
