import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class5_Sub1_Sub1_Sub5 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class5_Sub1_Sub1_Sub2 method1976() {
		return Static33.method691(this.anInt1918).method1922(this.anInt1915);
	}
}
