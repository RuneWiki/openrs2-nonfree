import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub2(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub54_31.method9551() ? 3 : 1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.method9551()) {
			super.anInt10787 = 2;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 2) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Z")
	public boolean method171() {
		return !super.aClass2_Sub54_31.method9551();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		if (super.aClass2_Sub54_31.method9551()) {
			return 2;
		} else if (super.aClass2_Sub54_31.aClass4_Sub16_2.method4906() && Static169.method3353(super.aClass2_Sub54_31.aClass4_Sub16_2.method4907())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)I")
	public int method172() {
		return super.anInt10787;
	}
}
