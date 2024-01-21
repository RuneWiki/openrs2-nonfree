import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class4_Sub1_Sub1_Sub7 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
	public int anInt1983;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
	public int anInt1988;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)Lclient!dg;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method2820() {
		return Static83.method1663(this.anInt1988).method1883(0, this.anInt1983, null);
	}
}
