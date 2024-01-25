import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class174 implements Runnable {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Lclient!gt;")
	public Class93 aClass93_4;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "[Lclient!sl;")
	public final Class191[] aClass191Array1 = new Class191[2];

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Z")
	public volatile boolean aBoolean289 = false;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Z")
	public volatile boolean aBoolean290 = false;

	static {
		new Class198("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!nn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean290 = true;
		try {
			while (!this.aBoolean289) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class191 local19 = this.aClass191Array1[local12];
					if (local19 != null) {
						local19.method5004();
					}
				}
				Static140.method2004(10L);
				Static209.method2789(null, this.aClass93_4);
			}
		} catch (@Pc(41) Exception local41) {
			Static206.method2769(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean290 = false;
		}
	}
}
