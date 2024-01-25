import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class6_Sub1_Sub17 extends Class6_Sub1 {

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	public int anInt6943 = 0;

	static {
		new Class231("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!ha;I)V")
	private void method5623(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt6943 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method5624(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3111();
			if (local17 == 0) {
				return;
			}
			this.method5623(arg0, local17);
		}
	}
}
