import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class175 implements Runnable {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "Lclient!ul;")
	public Class255 aClass255_3;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "[Lclient!ed;")
	public final Class55[] aClass55Array1 = new Class55[2];

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Z")
	public volatile boolean aBoolean351 = false;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
	public volatile boolean aBoolean350 = false;

	static {
		new Class21(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class21("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!nq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean350 = true;
		try {
			while (!this.aBoolean351) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class55 local19 = this.aClass55Array1[local12];
					if (local19 != null) {
						local19.method5667();
					}
				}
				Static77.method1653(10L);
				Static220.method3814(null, this.aClass255_3);
			}
		} catch (@Pc(43) Exception local43) {
			Static417.method5814(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean350 = false;
		}
	}
}
