import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class2_Sub4_Sub1_Sub6 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!me", name = "Hb", descriptor = "I")
	public int anInt2590;

	@OriginalMember(owner = "client!me", name = "Qb", descriptor = "I")
	public int anInt2595;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Lclient!df;")
	@Override
	protected Class2_Sub4_Sub1_Sub3 method2858() {
		return Static58.method1034(this.anInt2595).method1557(0, null, this.anInt2590);
	}
}
