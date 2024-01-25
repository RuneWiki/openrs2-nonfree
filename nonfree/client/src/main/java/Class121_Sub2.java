import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class121_Sub2 extends Class121 implements Interface10 {

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	private int anInt6527;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!vj;I[BI)V")
	public Class121_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6527 = arg1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)J")
	@Override
	public long method5072() {
		return super.aNativeBuffer4.c();
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)I")
	@Override
	public int method5073() {
		return 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)I")
	@Override
	public int method5071() {
		return this.anInt6527;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5070(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5069(arg0, arg1);
		this.anInt6527 = 5123;
	}
}
