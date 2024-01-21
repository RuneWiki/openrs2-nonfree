import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class6_Sub3_Sub1_Sub7 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!ud", name = "rb", descriptor = "I")
	public int anInt3086;

	@OriginalMember(owner = "client!ud", name = "sb", descriptor = "I")
	public int anInt3087;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Lclient!df;")
	@Override
	public Class6_Sub3_Sub1_Sub3 method2062() {
		return Static91.method1664(this.anInt3087).method955(this.anInt3086);
	}
}
