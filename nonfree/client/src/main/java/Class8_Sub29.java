import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class8_Sub29 extends Class8 {

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub29(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 0;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return Static252.method3671(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
	public int method8390() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.aClass8_Sub13_2.method5054() && !Static252.method3671(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052())) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 1) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)Z")
	public boolean method8391() {
		return Static252.method3671(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052());
	}
}
