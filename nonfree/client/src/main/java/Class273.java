import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class273 implements Runnable {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!hga;")
	public Class138 aClass138_4;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lclient!mda;")
	public final Class188[] aClass188Array1 = new Class188[2];

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
	public volatile boolean aBoolean560 = false;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
	public volatile boolean aBoolean559 = false;

	@OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean559 = true;
		try {
			while (!this.aBoolean560) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class188 local19 = this.aClass188Array1[local12];
					if (local19 != null) {
						local19.method7758();
					}
				}
				Static258.method4293(10L);
				Static358.method5878(this.aClass138_4, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static335.method5467(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean559 = false;
		}
	}
}
