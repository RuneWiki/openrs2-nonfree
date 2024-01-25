import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class78 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public int anInt2325;

	static {
		new Class202("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ps;Z)V")
	public void method2237(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5170();
			if (local9 == 0) {
				return;
			}
			this.method2238(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!ps;I)V")
	private void method2238(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2324 = arg0.method5229();
			this.anInt2325 = arg0.method5170();
			this.anInt2322 = arg0.method5170();
		}
	}
}
