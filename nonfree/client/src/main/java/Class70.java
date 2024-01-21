import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!q;")
	public Class59 aClass59_4;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[Lclient!t;")
	public final Class34[] aClass34Array1 = new Class34[2];

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
	public volatile boolean aBoolean207 = false;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
	public volatile boolean aBoolean206 = false;

	@OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean206 = true;
		try {
			while (!this.aBoolean207) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class34 local15 = this.aClass34Array1[local8];
					if (local15 != null) {
						local15.method2125();
					}
				}
				Static85.method1582(10L);
				Static49.method884(null, this.aClass59_4);
			}
		} catch (@Pc(37) Exception local37) {
			Static92.method1662(local37, null);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean206 = false;
		}
	}
}
