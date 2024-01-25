import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class104_Sub2 extends Class104 implements Interface12 {

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	private int anInt6047;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!bv;I[BIZ)V")
	public Class104_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6047 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.anInt6047;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)J")
	@Override
	public long method4732() {
		return 0L;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
	@Override
	protected void method4729() {
		super.aClass30_Sub1_38.method950(this);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4734(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method4727(arg1, arg0);
		this.anInt6047 = 5123;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I")
	@Override
	public int method4731() {
		return super.anInt6045;
	}
}
