import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public final class Class130_Sub1 extends Class130 implements Interface23 {

	@OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
	private int anInt6306;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!ok;I[BIZ)V")
	public Class130_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6306 = arg1;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method5061(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method7481(arg0, arg1);
		this.anInt6306 = 5123;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)I")
	@Override
	public int method5063() {
		return this.anInt6306;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)J")
	@Override
	public long method5064() {
		return 0L;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
	@Override
	protected void method7483() {
		super.aClass134_Sub2_41.method5235(this);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)I")
	@Override
	public int method5062() {
		return super.anInt9128;
	}
}
