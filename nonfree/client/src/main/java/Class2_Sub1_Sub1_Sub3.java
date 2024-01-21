import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
	public int anInt1292;

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
	public int anInt1297;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)Lclient!r;")
	@Override
	public Class2_Sub1_Sub1_Sub6 method1512() {
		return Static70.method1263(this.anInt1292).method1073(true, this.anInt1297);
	}
}
