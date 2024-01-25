import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class14_Sub19 extends Class14 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!fba;")
	public Class100 aClass100_41;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
	public int anInt2685;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Lclient!js;")
	public Class14_Sub29_Sub1 aClass14_Sub29_Sub1_1;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public void method2220() {
		if (Static34.anInt915 < Static628.aClass14_Sub19Array1.length) {
			Static628.aClass14_Sub19Array1[Static34.anInt915++] = this;
		}
	}
}
