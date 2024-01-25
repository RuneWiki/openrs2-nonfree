import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub5(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
		Static215.method9564(super.anInt10787);
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
		Static215.method9564(super.anInt10787);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return super.aClass2_Sub54_31.method9553().method131() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Z")
	public boolean method1071() {
		return super.aClass2_Sub54_31.method9553().method131() >= 96;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
		Static215.method9564(super.anInt10787);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.method9553().method131() < 96) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 2) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub54_31.method9553().method131() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)I")
	public int method1072() {
		return super.anInt10787;
	}
}
