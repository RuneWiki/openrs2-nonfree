import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub15(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return Static294.method4869(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
	public boolean method4880() {
		return Static294.method4869(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907());
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.aClass4_Sub16_2.method4906() && !Static294.method4869(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907())) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 1) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)I")
	public int method4882() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 0;
	}
}
