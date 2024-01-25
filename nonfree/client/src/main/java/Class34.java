import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!ne;")
	public Class139 aClass139_2;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[Lclient!dh;")
	public final Class47[] aClass47Array1 = new Class47[2];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
	public volatile boolean aBoolean50 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
	public volatile boolean aBoolean49 = false;

	@OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean49 = true;
		try {
			while (!this.aBoolean50) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class47 local19 = this.aClass47Array1[local12];
					if (local19 != null) {
						local19.method5326();
					}
				}
				Static20.method408(10L);
				Static131.method2335(this.aClass139_2, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static114.method1992(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean49 = false;
		}
	}
}
