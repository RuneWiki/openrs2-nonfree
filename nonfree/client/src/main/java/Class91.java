import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class91 {

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public int anInt2201 = 64;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt2196 = 1;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	public int anInt2200 = 64;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public int anInt2195 = -1;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	public int anInt2202 = 2;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "Z")
	public boolean aBoolean174 = false;

	static {
		new Class96("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILclient!ti;I)V")
	private void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt2195 = arg2.method4498();
			if (this.anInt2195 == 65535) {
				this.anInt2195 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2201 = arg2.method4498() + 1;
			this.anInt2200 = arg2.method4498() + 1;
		} else if (arg0 == 3) {
			arg2.method4529();
		} else if (arg0 == 4) {
			this.anInt2202 = arg2.method4548();
		} else if (arg0 == 5) {
			this.anInt2196 = arg2.method4548();
		} else if (arg0 == 6) {
			this.aBoolean173 = true;
		} else if (arg0 == 7) {
			this.aBoolean174 = true;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BILclient!ti;)V")
	public void method1801(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4548();
			if (local5 == 0) {
				return;
			}
			this.method1800(local5, arg0, arg1);
		}
	}
}
