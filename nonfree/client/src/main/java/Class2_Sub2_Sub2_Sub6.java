import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class2_Sub2_Sub2_Sub6 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
	public int anInt1884;

	@OriginalMember(owner = "client!pa", name = "Ab", descriptor = "I")
	public int anInt1889;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)Lclient!na;")
	@Override
	public Class2_Sub2_Sub2_Sub5 method1855() {
		return Static35.method1934(this.anInt1889).method1231(this.anInt1884);
	}
}
