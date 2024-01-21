import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class4_Sub4_Sub1_Sub5 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
	public int anInt1411;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)Lclient!rb;")
	@Override
	public Class4_Sub4_Sub1_Sub6 method1976() {
		return Static24.method475(this.anInt1411).method1545(this.anInt1408);
	}
}
