import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub17(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)I")
	public int method6114() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 2;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.aClass4_Sub6_1.method1091() && super.anInt10787 == 2) {
			super.anInt10787 = 1;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 2) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}
}
