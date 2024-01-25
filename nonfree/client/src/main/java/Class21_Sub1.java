import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class21_Sub1 extends Class21 implements Interface10 {

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
	private int anInt5753;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!vj;I[BIZ)V")
	public Class21_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5753 = arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(Z)V")
	@Override
	protected void method4764() {
		super.aClass172_Sub2_33.method5551(this);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)J")
	@Override
	public long method5072() {
		return 0L;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)I")
	@Override
	public int method5073() {
		return super.anInt6099;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5070(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4763(arg0, arg1);
		this.anInt5753 = 5123;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I")
	@Override
	public int method5071() {
		return this.anInt5753;
	}
}
