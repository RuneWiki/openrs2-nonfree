import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class288 implements Runnable {

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "Lclient!tq;")
	public Class285 aClass285_15;

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "[Lclient!mca;")
	public final Class43[] aClass43Array1 = new Class43[2];

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Z")
	public volatile boolean aBoolean636 = false;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "Z")
	public volatile boolean aBoolean635 = false;

	static {
		new Class67("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!tw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean635 = true;
		try {
			while (!this.aBoolean636) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class43 local19 = this.aClass43Array1[local12];
					if (local19 != null) {
						local19.method7014();
					}
				}
				Static327.method5231(10L);
				Static57.method1161(this.aClass285_15, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static2.method220(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean635 = false;
		}
	}
}
