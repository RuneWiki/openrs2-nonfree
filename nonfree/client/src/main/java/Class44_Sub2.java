import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class44_Sub2 extends Class44 implements Interface3 {

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	private int anInt9534;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!qj;I[BI)V")
	public Class44_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9534 = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	@Override
	public int method7925() {
		return this.anInt9534;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III[B)V")
	@Override
	public void method7927(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7923(arg1, arg0);
		this.anInt9534 = 5123;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
	@Override
	public long method7924() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
	@Override
	public int method7926() {
		return 0;
	}
}
