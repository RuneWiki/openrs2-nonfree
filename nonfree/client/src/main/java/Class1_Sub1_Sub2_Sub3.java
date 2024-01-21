import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ge", name = "Bb", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!ge", name = "Ib", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class1_Sub1_Sub2_Sub6 method1415() {
		return Static111.method1907(this.anInt1041).method37(this.anInt1046, true);
	}
}
