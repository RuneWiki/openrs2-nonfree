import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class78 implements Runnable {

	@OriginalMember(owner = "client!s", name = "G", descriptor = "Lclient!pf;")
	public Class68 aClass68_4;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "[Lclient!wf;")
	public final Class31[] aClass31Array1 = new Class31[2];

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Z")
	public volatile boolean aBoolean141 = false;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Z")
	public volatile boolean aBoolean140 = false;

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean140 = true;
		try {
			while (!this.aBoolean141) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class31 local15 = this.aClass31Array1[local8];
					if (local15 != null) {
						local15.method3000();
					}
				}
				Static133.method2259(10L);
				Static109.method1826(null, this.aClass68_4);
			}
		} catch (@Pc(37) Exception local37) {
			Static5.method115(null, local37);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean140 = false;
		}
	}
}
