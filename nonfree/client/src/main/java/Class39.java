import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class39 implements Runnable {

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!dq;")
	public Class53 aClass53_1;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "[Lclient!dc;")
	public final Class45[] aClass45Array1 = new Class45[2];

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Z")
	public volatile boolean aBoolean83 = false;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
	public volatile boolean aBoolean84 = false;

	static {
		new Class221("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
		new Class221("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!cq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean84 = true;
		try {
			while (!this.aBoolean83) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class45 local19 = this.aClass45Array1[local12];
					if (local19 != null) {
						local19.method3370();
					}
				}
				Static185.method3004(10L);
				Static357.method870(this.aClass53_1, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static235.method3843(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean84 = false;
		}
	}
}
