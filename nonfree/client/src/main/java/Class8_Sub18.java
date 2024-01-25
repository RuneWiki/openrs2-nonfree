import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class8_Sub18 extends Class8 {

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub18(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)Z")
	public boolean method6656() {
		return !super.aClass4_Sub20_31.method3139();
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)I")
	public int method6657() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return super.aClass4_Sub20_31.method3139() ? 3 : 1;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.method3139()) {
			super.anInt9788 = 2;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 2) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		if (super.aClass4_Sub20_31.method3139()) {
			return 2;
		} else if (super.aClass4_Sub20_31.aClass8_Sub13_2.method5054() && Static379.method4949(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052())) {
			return 1;
		} else {
			return 0;
		}
	}
}
