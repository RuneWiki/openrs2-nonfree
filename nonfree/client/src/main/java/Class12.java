import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!ma;")
	public Class50 aClass50_1;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[Lclient!ud;")
	public final Class19[] aClass19Array1 = new Class19[2];

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
	public volatile boolean aBoolean39 = false;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Z")
	public volatile boolean aBoolean38 = false;

	@OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean38 = true;
		try {
			while (!this.aBoolean39) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class19 local19 = this.aClass19Array1[local12];
					if (local19 != null) {
						local19.method886();
					}
				}
				Static27.method564(10L);
				Static121.method2130(this.aClass50_1, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static19.method441(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean38 = false;
		}
	}
}
