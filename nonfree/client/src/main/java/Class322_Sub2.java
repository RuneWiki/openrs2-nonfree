import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class322_Sub2 extends Class322 implements Interface5 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt9779;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!pc;I[BI)V")
	public Class322_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9779 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
	@Override
	public int method8461() {
		return this.anInt9779;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8458(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8373(arg1, arg0);
		this.anInt9779 = 5123;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
	@Override
	public int method8460() {
		return 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)J")
	@Override
	public long method8459() {
		return super.aBuffer3.getAddress();
	}
}
