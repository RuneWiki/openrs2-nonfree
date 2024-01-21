import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class2_Sub2_Sub3_Sub5 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
	public int anInt1386;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "I")
	public int anInt1391;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!ue;")
	@Override
	protected Class2_Sub2_Sub3_Sub4 method2725() {
		return Static113.method1913(this.anInt1391).method1245(null, 0, this.anInt1386);
	}
}
