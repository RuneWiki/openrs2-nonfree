import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class4_Sub1_Sub3_Sub1 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Lclient!od;")
	@Override
	public Class4_Sub1_Sub3_Sub3 method1816() {
		return Static123.method2000(this.anInt361).method983(this.anInt363);
	}
}
