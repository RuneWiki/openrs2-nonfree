import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!od;")
	public Class53 aClass53_3;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "[Lclient!gh;")
	public final Class25[] aClass25Array1 = new Class25[2];

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
	public volatile boolean aBoolean124 = false;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
	public volatile boolean aBoolean123 = false;

	@OriginalMember(owner = "client!nb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean123 = true;
		try {
			while (!this.aBoolean124) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class25 local15 = this.aClass25Array1[local8];
					if (local15 != null) {
						local15.method1566();
					}
				}
				Static114.method2304(10L);
				Static177.method3182(null, this.aClass53_3);
			}
		} catch (@Pc(37) Exception local37) {
			Static15.method266(null, local37);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean123 = false;
		}
	}
}
