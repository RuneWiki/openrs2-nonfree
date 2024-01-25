import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub19(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)I")
	public int method6178() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.aClass4_Sub16_2.method4906() && !Static294.method4869(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907())) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 2) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return Static294.method4869(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)Z")
	public boolean method6182() {
		return Static294.method4869(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907());
	}
}
