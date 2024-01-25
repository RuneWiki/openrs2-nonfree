import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class209 implements Runnable {

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!ng;")
	public Class162 aClass162_4;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "[Lclient!n;")
	public final Class14[] aClass14Array1 = new Class14[2];

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Z")
	public volatile boolean aBoolean511 = false;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Z")
	public volatile boolean aBoolean512 = false;

	static {
		new Class169("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!sf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean512 = true;
		try {
			while (!this.aBoolean511) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class14 local19 = this.aClass14Array1[local12];
					if (local19 != null) {
						local19.method4888();
					}
				}
				Static57.method5056(10L);
				Static265.method4065(this.aClass162_4, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static62.method1006(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean512 = false;
		}
	}
}
