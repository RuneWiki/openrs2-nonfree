import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "(I)Lclient!ea;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method2225() {
		return Static22.method568(this.anInt122).method1191(this.anInt123);
	}
}
