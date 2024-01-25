import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class15_Sub9 extends Class15 {

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub9(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return super.aClass6_Sub22_31.method3527().method8499() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.anInt10701 < 0 && super.anInt10701 > 4) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)I")
	public int method2203() {
		return super.anInt10701;
	}
}
