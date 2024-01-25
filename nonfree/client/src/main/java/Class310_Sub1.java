import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class310_Sub1 extends Class310 implements Interface2 {

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
	private int anInt9105;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!vj;I[BIZ)V")
	public Class310_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt9105 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
	@Override
	public int method7528() {
		return super.anInt9188;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	@Override
	protected void method7591() {
		super.aClass45_Sub3_43.method7471(this);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)J")
	@Override
	public long method7525() {
		return 0L;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
	@Override
	public int method7526() {
		return this.anInt9105;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([BIII)V")
	@Override
	public void method7527(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method7590(arg1, arg0);
		this.anInt9105 = 5123;
	}
}
