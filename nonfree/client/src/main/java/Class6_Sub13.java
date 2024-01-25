import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
	public int anInt2125;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!mv;")
	public Class241 aClass241_29;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!eea;")
	public Class6_Sub15_Sub1 aClass6_Sub15_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
	public void method2052() {
		if (Static603.aClass6_Sub13Array1.length > Static656.anInt10169) {
			Static603.aClass6_Sub13Array1[Static656.anInt10169++] = this;
		}
	}
}
