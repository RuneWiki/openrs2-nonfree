import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class175 implements Runnable {

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!lt;")
	public Class159 aClass159_2;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "[Lclient!on;")
	public final Class130[] aClass130Array1 = new Class130[2];

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
	public volatile boolean aBoolean326 = false;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Z")
	public volatile boolean aBoolean327 = false;

	static {
		new Class182("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
		new Class182("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!no", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean327 = true;
		try {
			while (!this.aBoolean326) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class130 local19 = this.aClass130Array1[local12];
					if (local19 != null) {
						local19.method3642();
					}
				}
				Static328.method5696(10L);
				Static34.method476(this.aClass159_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static432.method5720(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean327 = false;
		}
	}
}
