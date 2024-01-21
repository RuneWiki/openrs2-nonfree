import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lclient!be;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method1423() {
		return Static4.method95(this.anInt960).method438(this.anInt961);
	}
}
