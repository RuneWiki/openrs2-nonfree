import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Class8_Sub25 extends Class8 {

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub25(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)Z")
	public boolean method7778() {
		return true;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	public int method7779() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 1;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return arg0 == 0 || super.aClass4_Sub20_31.aClass8_Sub6_1.method3083() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.anInt9788 != 0 && super.aClass4_Sub20_31.aClass8_Sub6_1.method3083() != 1) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 1) {
			super.anInt9788 = this.method8383();
		}
	}
}
