import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class118_Sub2 extends Class118 implements Interface10 {

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	private int anInt7455;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!vd;I[BIZ)V")
	public Class118_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7455 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	@Override
	public int method5744() {
		return this.anInt7455;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
	@Override
	protected void method5742() {
		super.aClass51_Sub2_41.method5417(this);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)J")
	@Override
	public long method5745() {
		return 0L;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method5743(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method5740(arg1, arg0);
		this.anInt7455 = 5123;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)I")
	@Override
	public int method5746() {
		return super.anInt7447;
	}
}
