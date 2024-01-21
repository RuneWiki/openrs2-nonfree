import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "vb", descriptor = "I")
	public int anInt72;

	@OriginalMember(owner = "client!a", name = "Ab", descriptor = "I")
	public int anInt75;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Lclient!lb;")
	@Override
	public Class1_Sub1_Sub1_Sub6 method1897() {
		return Static20.method496(this.anInt72).method1085(this.anInt75);
	}
}
