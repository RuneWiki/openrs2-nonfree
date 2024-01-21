import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lclient!na;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1790() {
		return Static8.method224(this.anInt806).method1916(this.anInt802);
	}
}
