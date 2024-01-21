import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class2_Sub2_Sub1_Sub4 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
	public int anInt3104;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lclient!cd;")
	@Override
	protected Class2_Sub2_Sub1_Sub2 method2908() {
		return Static158.method2689(this.anInt3104).method1299(this.anInt3107, null, 0);
	}
}
