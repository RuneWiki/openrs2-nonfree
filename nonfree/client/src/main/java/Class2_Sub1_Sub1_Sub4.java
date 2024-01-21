import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!fc", name = "qb", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Lclient!ad;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method2168() {
		return Static102.method1800(this.anInt771).method1578(this.anInt767);
	}
}
