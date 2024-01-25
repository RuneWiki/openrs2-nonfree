import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub4(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.anInt9788 != 1 && super.anInt9788 != 0) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)I")
	public int method2973() {
		return super.anInt9788;
	}
}
