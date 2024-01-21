import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class1_Sub1_Sub4_Sub6 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)Lclient!je;")
	@Override
	protected Class1_Sub1_Sub4_Sub1 method3066() {
		return Static90.method1963(this.anInt3603).method162(null, this.anInt3602, 0);
	}
}
