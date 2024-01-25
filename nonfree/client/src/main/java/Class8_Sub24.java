import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class8_Sub24 extends Class8 {

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub24(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
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

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)Z")
	public boolean method7742() {
		if (super.aClass4_Sub20_31.method3139()) {
			return false;
		} else {
			return super.aClass4_Sub20_31.method3144() == Static179.aClass234_2;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
	public int method7743() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		if (super.aClass4_Sub20_31.method3139()) {
			return 3;
		} else if (super.aClass4_Sub20_31.method3144() == Static179.aClass234_2) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 1;
	}
}
