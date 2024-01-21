import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class1_Sub1_Sub1_Sub7 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)Lclient!w;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method3157() {
		return Static2.method118(this.anInt4373).method703(0, this.anInt4377, null);
	}
}
