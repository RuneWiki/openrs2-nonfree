import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class33_Sub2 extends Class33 implements Interface10 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	private int anInt4903;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!ad;I[BI)V")
	public Class33_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4903 = arg1;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
	@Override
	public int method5403() {
		return this.anInt4903;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
	@Override
	public int method5400() {
		return 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)J")
	@Override
	public long method5401() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method5402(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method4106(arg0, arg1);
		this.anInt4903 = 5123;
	}
}
