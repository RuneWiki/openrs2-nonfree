import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class2_Sub2_Sub12_Sub3 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
	public int anInt1490;

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "I")
	public int anInt1495;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		return Static105.method1669(this.anInt1490).method713(this.anInt1495, true);
	}
}
