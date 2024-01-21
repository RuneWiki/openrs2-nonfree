import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class1_Sub1_Sub8_Sub2 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!oc", name = "wb", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)Lclient!pc;")
	@Override
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		return Static36.method617(this.anInt1827).method151(true, this.anInt1824);
	}
}
