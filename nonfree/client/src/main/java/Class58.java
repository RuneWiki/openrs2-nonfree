import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class58 implements Runnable {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!qe;")
	public Class66 aClass66_4;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[Lclient!fc;")
	public final Class21[] aClass21Array1 = new Class21[2];

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
	public volatile boolean aBoolean132 = false;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Z")
	public volatile boolean aBoolean133 = false;

	@OriginalMember(owner = "client!oh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean133 = true;
		try {
			while (!this.aBoolean132) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class21 local19 = this.aClass21Array1[local12];
					if (local19 != null) {
						local19.method1341();
					}
				}
				Static176.method2744(10L);
				Static124.method2023(null, this.aClass66_4);
			}
		} catch (@Pc(43) Exception local43) {
			Static178.method2785(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean133 = false;
		}
	}
}
