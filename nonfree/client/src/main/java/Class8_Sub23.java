import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class8_Sub23 extends Class8 {

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub23(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	public int method7615() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.anInt9788 < 0 || super.anInt9788 > 4) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 0;
	}
}
