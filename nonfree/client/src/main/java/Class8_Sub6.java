import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub6(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.method3144() != Static179.aClass234_2) {
			super.anInt9788 = 1;
		} else if (super.aClass4_Sub20_31.method3139()) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 != 0 && super.anInt9788 != 1) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		if (super.aClass4_Sub20_31.method3139()) {
			return 3;
		} else if (super.aClass4_Sub20_31.method3144() == Static179.aClass234_2) {
			if (arg0 == 0) {
				if (super.aClass4_Sub20_31.aClass8_Sub25_1.method7779() == 1) {
					return 2;
				}
				if (super.aClass4_Sub20_31.aClass8_Sub2_1.method1355() == 1) {
					return 2;
				}
				if (super.aClass4_Sub20_31.aClass8_Sub12_1.method4650() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)I")
	public int method3083() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)Z")
	public boolean method3084() {
		if (super.aClass4_Sub20_31.method3139()) {
			return false;
		} else {
			return super.aClass4_Sub20_31.method3144() == Static179.aClass234_2;
		}
	}
}
