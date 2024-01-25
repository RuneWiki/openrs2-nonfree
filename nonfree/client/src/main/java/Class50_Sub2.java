import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class50_Sub2 extends Class50 implements Interface24 {

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
	private int anInt6758;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!jaa;I[BIZ)V")
	public Class50_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6758 = arg1;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
	@Override
	protected void method5678() {
		super.aClass14_Sub3_33.method3926(this);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)J")
	@Override
	public long method5681() {
		return 0L;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)I")
	@Override
	public int method5682() {
		return super.anInt6745;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.anInt6758;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5683(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5679(arg0, arg1);
		this.anInt6758 = 5123;
	}
}
