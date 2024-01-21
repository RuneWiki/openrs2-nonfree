import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!ja;")
	public Class47 aClass47_3;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[Lclient!lc;")
	public final Class56[] aClass56Array1 = new Class56[2];

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Z")
	public volatile boolean aBoolean82 = false;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Z")
	public volatile boolean aBoolean83 = false;

	@OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean83 = true;
		try {
			while (!this.aBoolean82) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class56 local15 = this.aClass56Array1[local8];
					if (local15 != null) {
						local15.method2457();
					}
				}
				Static119.method1720(10L);
				Static176.method2728(this.aClass47_3, null);
			}
		} catch (@Pc(37) Exception local37) {
			Static208.method1860(null, local37);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean83 = false;
		}
	}
}
