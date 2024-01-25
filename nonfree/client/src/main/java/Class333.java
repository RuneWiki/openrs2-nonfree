import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class333 implements Runnable {

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!gba;")
	public Class114 aClass114_11;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "[Lclient!hq;")
	public final Class141[] aClass141Array1 = new Class141[2];

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Z")
	public volatile boolean aBoolean657 = false;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "Z")
	public volatile boolean aBoolean656 = false;

	@OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean656 = true;
		try {
			while (!this.aBoolean657) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class141 local19 = this.aClass141Array1[local12];
					if (local19 != null) {
						local19.method5530();
					}
				}
				Static423.method5918(10L);
				Static461.method6558(this.aClass114_11, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static259.method4059(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean656 = false;
		}
	}
}
