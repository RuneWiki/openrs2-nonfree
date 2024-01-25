import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!gr;")
	public Class130 aClass130_38;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!jc;")
	public Class3_Sub3_Sub2 aClass3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method2137() {
		if (Static250.anInt4604 < Static465.aClass3_Sub14Array1.length) {
			Static465.aClass3_Sub14Array1[Static250.anInt4604++] = this;
		}
	}
}
