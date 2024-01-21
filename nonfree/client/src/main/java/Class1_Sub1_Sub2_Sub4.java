import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!od", name = "xb", descriptor = "I")
	public int anInt1844;

	@OriginalMember(owner = "client!od", name = "Gb", descriptor = "I")
	public int anInt1850;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)Lclient!ue;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1910() {
		return Static106.method1739(this.anInt1844).method724(this.anInt1850);
	}
}
