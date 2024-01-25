import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class67 implements Runnable {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!cr;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "[Lclient!fl;")
	public final Class45[] aClass45Array1 = new Class45[2];

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
	public volatile boolean aBoolean100 = false;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
	public volatile boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean99 = true;
		try {
			while (!this.aBoolean100) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class45 local19 = this.aClass45Array1[local12];
					if (local19 != null) {
						local19.method6491();
					}
				}
				Static149.method2211(10L);
				Static534.method7438(null, this.aClass57_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static169.method2641(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean99 = false;
		}
	}
}
