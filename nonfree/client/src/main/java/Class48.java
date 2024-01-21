import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!rf;")
	public Class74 aClass74_4;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lclient!hh;")
	public final Class40[] aClass40Array1 = new Class40[2];

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	public volatile boolean aBoolean124 = false;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
	public volatile boolean aBoolean125 = false;

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean125 = true;
		try {
			while (!this.aBoolean124) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class40 local19 = this.aClass40Array1[local12];
					if (local19 != null) {
						local19.method2516();
					}
				}
				Static35.method583(10L);
				Static47.method766(this.aClass74_4, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static153.method2616(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean125 = false;
		}
	}
}
