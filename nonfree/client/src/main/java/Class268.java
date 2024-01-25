import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class268 {

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public int anInt7886 = 0;

	static {
		new Class158("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method6114(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1171();
			if (local12 == 0) {
				return;
			}
			this.method6117(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLclient!ia;I)V")
	private void method6117(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt7886 = arg0.method1177();
		}
	}
}
