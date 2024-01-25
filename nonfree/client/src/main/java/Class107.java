import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class107 implements Runnable {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!ko;")
	public Class118 aClass118_4;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[Lclient!ir;")
	public final Class78[] aClass78Array1 = new Class78[2];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Z")
	public volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Z")
	public volatile boolean aBoolean177 = false;

	static {
		new Class117("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean177 = true;
		try {
			while (!this.aBoolean176) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class78 local19 = this.aClass78Array1[local12];
					if (local19 != null) {
						local19.method5513();
					}
				}
				Static244.method4311(10L);
				Static207.method3723(null, this.aClass118_4);
			}
		} catch (@Pc(43) Exception local43) {
			Static38.method554(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean177 = false;
		}
	}
}
