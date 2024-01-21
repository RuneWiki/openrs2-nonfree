import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class5_Sub2_Sub4_Sub1 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "I")
	public int anInt339;

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Lclient!dd;")
	@Override
	public Class5_Sub2_Sub4_Sub2 method1612() {
		return Static81.method1515(this.anInt339).method160(this.anInt340);
	}
}
