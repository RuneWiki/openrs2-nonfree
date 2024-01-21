import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!fe;")
	public Class29 aClass29_17;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[Lclient!ib;")
	public final Class26[] aClass26Array1 = new Class26[2];

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
	public volatile boolean aBoolean46 = false;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Z")
	public volatile boolean aBoolean45 = false;

	@OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean45 = true;
		try {
			while (!this.aBoolean46) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class26 local19 = this.aClass26Array1[local12];
					if (local19 != null) {
						local19.method1805();
					}
				}
				Static125.method2177(10L);
				Static125.method2175(this.aClass29_17, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static77.method1294(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean45 = false;
		}
	}
}
