import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class8_Sub26 extends Class8 {

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub26(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)I")
	public int method7943() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 0;
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(B)Z")
	public boolean method7945() {
		@Pc(17) int local17 = super.aClass4_Sub20_31.method3140().method1712();
		return local17 >= 96;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = super.aClass4_Sub20_31.method3140().method1712();
		if (local12 < 96) {
			return 3;
		} else if (arg0 > 1 && local12 < 128) {
			return 3;
		} else if (arg0 > 3 && local12 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		@Pc(10) int local10 = super.aClass4_Sub20_31.method3140().method1712();
		if (local10 < 96) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 > 1 && local10 < 128) {
			super.anInt9788 = 1;
		}
		if (super.anInt9788 > 2 && local10 < 192) {
			super.anInt9788 = 2;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 3) {
			super.anInt9788 = this.method8383();
		}
	}
}
