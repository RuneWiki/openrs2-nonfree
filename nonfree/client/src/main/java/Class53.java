import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class53 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!eq;")
	public Class73 aClass73_2;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public int anInt1202;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	private int anInt1205;

	static {
		new Class231("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
		new Class231("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!hw;II)V")
	private void method1103(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1205 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt1202 = arg0.method6138();
			this.anInt1199 = arg0.method6138();
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)Lclient!ok;")
	public synchronized Class190 method1105() {
		@Pc(19) Class190 local19 = (Class190) this.aClass73_2.aClass188_20.method4158((long) this.anInt1205);
		if (local19 != null) {
			return local19;
		}
		local19 = Static470.method4242(this.aClass73_2.aClass171_27, this.anInt1205, 0);
		if (local19 != null) {
			this.aClass73_2.aClass188_20.method4155((long) this.anInt1205, local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!hw;I)V")
	public void method1106(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6138();
			if (local13 == 0) {
				return;
			}
			this.method1103(arg0, local13);
		}
	}
}
