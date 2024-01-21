import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!dc", name = "Lb", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Lclient!t;")
	@Override
	public Class3_Sub1_Sub2_Sub6 method2028() {
		return Static12.method239(this.anInt682).method1190(this.anInt688);
	}
}
