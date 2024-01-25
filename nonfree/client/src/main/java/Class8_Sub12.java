import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class8_Sub12 extends Class8 {

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub12(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		if (super.aClass4_Sub20_31.method3139()) {
			return 3;
		} else if (arg0 == 0 || super.aClass4_Sub20_31.aClass8_Sub6_1.method3083() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public int method4650() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)Z")
	public boolean method4651() {
		return !super.aClass4_Sub20_31.method3139();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 1;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.method3139()) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 < 0 && super.anInt9788 > 2) {
			super.anInt9788 = this.method8383();
		}
	}
}
