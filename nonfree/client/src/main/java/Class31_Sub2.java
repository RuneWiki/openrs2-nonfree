import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class31_Sub2 extends Class31 implements Interface2 {

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	private int anInt7717;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!qg;I[BIZ)V")
	public Class31_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7717 = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	@Override
	public int method5944() {
		return this.anInt7717;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)J")
	@Override
	public long method5943() {
		return 0L;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	@Override
	public int method5942() {
		return super.anInt7709;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5945(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5939(arg0, arg1);
		this.anInt7717 = 5123;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
	@Override
	protected void method5940() {
		super.aClass121_Sub2_43.method4667(this);
	}
}
