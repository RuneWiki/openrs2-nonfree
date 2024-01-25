import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class15_Sub28 extends Class15 {

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!vba;)V")
	public Class15_Sub28(@OriginalArg(0) Class3_Sub55 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(ILclient!vba;)V")
	public Class15_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub55 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)I")
	@Override
	public int method9420(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9418(@OriginalArg(1) int arg0) {
		super.anInt11276 = arg0;
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)I")
	public int method9169() {
		return super.anInt11276;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)I")
	@Override
	protected int method9419() {
		return 1;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
	@Override
	public void method9422() {
		if (super.anInt11276 != 1 && super.anInt11276 != 0) {
			super.anInt11276 = this.method9419();
		}
	}
}
