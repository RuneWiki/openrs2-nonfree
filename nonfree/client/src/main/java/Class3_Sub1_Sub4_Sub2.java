import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class3_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(I)Lclient!o;")
	@Override
	protected Class3_Sub1_Sub4_Sub5 method2261() {
		return Static3.method42(this.anInt813).method947(null, this.anInt819, 0);
	}
}
