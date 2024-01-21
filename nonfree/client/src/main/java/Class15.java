import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!qf;")
	public Class68 aClass68_1;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[Lclient!mf;")
	public final Class30[] aClass30Array1 = new Class30[2];

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Z")
	public volatile boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
	public volatile boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean35 = true;
		try {
			while (!this.aBoolean36) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class30 local15 = this.aClass30Array1[local8];
					if (local15 != null) {
						local15.method2685();
					}
				}
				Static65.method1574(10L);
				Static78.method1816(null, this.aClass68_1);
			}
		} catch (@Pc(39) Exception local39) {
			Static146.method2791(local39, null);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean35 = false;
		}
	}
}
