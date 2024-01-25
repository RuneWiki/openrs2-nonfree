import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!jo;")
	public Class187 aClass187_27;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!iw;")
	public Class5_Sub15_Sub2 aClass5_Sub15_Sub2_1;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	public int anInt1726;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	public int anInt1727;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public void method1619() {
		if (Static311.anInt5526 < Static65.aClass5_Sub16Array1.length) {
			Static65.aClass5_Sub16Array1[Static311.anInt5526++] = this;
		}
	}
}
