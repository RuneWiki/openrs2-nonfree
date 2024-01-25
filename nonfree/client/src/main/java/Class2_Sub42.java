import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Lclient!ks;")
	public Class2_Sub15_Sub2 aClass2_Sub15_Sub2_2;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "Lclient!rga;")
	public Class286 aClass286_149;

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
	public int anInt8409;

	@OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
	public int anInt8414;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	public void method6996() {
		if (Static344.anInt6233 < Static454.aClass2_Sub42Array1.length) {
			Static454.aClass2_Sub42Array1[Static344.anInt6233++] = this;
		}
	}
}
