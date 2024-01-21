import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class2_Sub3_Sub5_Sub2 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	public int anInt1018;

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
	public int anInt1025;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Lclient!sa;")
	@Override
	protected Class2_Sub3_Sub5_Sub7 method2298() {
		return Static92.method1502(this.anInt1025).method1322(this.anInt1018, null, 0);
	}
}
