import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "I")
	public int anInt1191;

	@OriginalMember(owner = "client!he", name = "zb", descriptor = "I")
	public int anInt1194;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)Lclient!v;")
	@Override
	public Class3_Sub1_Sub1_Sub6 method1792() {
		return Static37.method694(this.anInt1194).method425(this.anInt1191, true);
	}
}
