import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!oh;")
	@Override
	protected Class1_Sub2_Sub1_Sub4 method2785() {
		return Static54.method969(this.anInt105).method1807(this.anInt106, 0, null);
	}
}
