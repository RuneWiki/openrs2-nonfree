import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class8_Sub14 extends Class8 {

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
		Static407.method2223(super.anInt9788);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub14(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
		Static407.method2223(super.anInt9788);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return super.aClass4_Sub20_31.method3140().method1712() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.method3140().method1712() < 96) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 2) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I")
	public int method5186() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
		Static407.method2223(super.anInt9788);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return super.aClass4_Sub20_31.method3140().method1712() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Z")
	public boolean method5188() {
		return super.aClass4_Sub20_31.method3140().method1712() >= 96;
	}
}
