import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class8_Sub27 extends Class8 {

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub27(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)Z")
	public boolean method7981() {
		return Static252.method3671(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052());
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return Static252.method3671(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)I")
	public int method7983() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.aClass8_Sub13_2.method5054() && !Static252.method3671(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052())) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 2) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 0;
	}
}
