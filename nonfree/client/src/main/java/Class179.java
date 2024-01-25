import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class179 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!ok;")
	public Class179 aClass179_3;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public int anInt5239;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!nu;")
	public Class7_Sub2 aClass7_Sub2_2;

	static {
		new Class189("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public void method4096() {
		if (Static219.anInt4143 >= 500) {
			return;
		}
		this.aClass7_Sub2_2 = null;
		this.aClass179_3 = Static37.aClass179_1;
		this.anInt5239 = 0;
		Static37.aClass179_1 = this;
		Static219.anInt4143++;
	}
}
