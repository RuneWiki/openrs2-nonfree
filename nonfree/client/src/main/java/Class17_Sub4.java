import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class17_Sub4 extends Class17 {

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub4(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 3;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Z)I")
	public int method1072() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (super.anInt10866 < 0 || super.anInt10866 > 4) {
			super.anInt10866 = this.method9173();
		}
	}
}
