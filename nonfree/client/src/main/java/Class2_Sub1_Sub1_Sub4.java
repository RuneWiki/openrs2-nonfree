import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!je", name = "Sb", descriptor = "I")
	public int anInt1702;

	@OriginalMember(owner = "client!je", name = "bc", descriptor = "I")
	public int anInt1708;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Lclient!pa;")
	@Override
	public Class2_Sub1_Sub1_Sub5 method1778() {
		return Static73.method1374(this.anInt1708).method1639(true, this.anInt1702);
	}
}
