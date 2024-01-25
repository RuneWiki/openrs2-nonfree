import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class117 implements Runnable {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!dq;")
	public Class51 aClass51_3;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[Lclient!kl;")
	public final Class96[] aClass96Array1 = new Class96[2];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
	public volatile boolean aBoolean260 = false;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
	public volatile boolean aBoolean259 = false;

	@OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean259 = true;
		try {
			while (!this.aBoolean260) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class96 local19 = this.aClass96Array1[local12];
					if (local19 != null) {
						local19.method3471();
					}
				}
				Static83.method1499(10L);
				Static121.method1944(null, this.aClass51_3);
			}
		} catch (@Pc(41) Exception local41) {
			Static120.method1926(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean259 = false;
		}
	}
}
