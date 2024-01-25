import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class218 implements Runnable {

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!ji;")
	public Class124 aClass124_4;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "[Lclient!fe;")
	public final Class77[] aClass77Array1 = new Class77[2];

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Z")
	public volatile boolean aBoolean490 = false;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Z")
	public volatile boolean aBoolean489 = false;

	@OriginalMember(owner = "client!rs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean489 = true;
		try {
			while (!this.aBoolean490) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class77 local19 = this.aClass77Array1[local12];
					if (local19 != null) {
						local19.method4264();
					}
				}
				Static252.method2874(10L);
				Static95.method1359(this.aClass124_4, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static211.method2815(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean489 = false;
		}
	}
}
