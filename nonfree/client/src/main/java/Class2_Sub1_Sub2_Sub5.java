import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class2_Sub1_Sub2_Sub5 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!p", name = "qb", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!p", name = "yb", descriptor = "I")
	public int anInt2154;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)Lclient!ga;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		return Static66.method1384(this.anInt2154).method903(this.anInt2151, true);
	}
}
