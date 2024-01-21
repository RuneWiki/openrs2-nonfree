import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[Lclient!ve;")
	public final Class57[] aClass57Array1 = new Class57[2];

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Z")
	public volatile boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Z")
	public volatile boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean23 = true;
		try {
			while (!this.aBoolean26) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class57 local15 = this.aClass57Array1[local8];
					if (local15 != null) {
						local15.method2015();
					}
				}
				Static53.method1782(10L);
				Static39.method889(false);
			}
		} catch (@Pc(35) Exception local35) {
			Static120.method1980(null, local35);
		} finally {
			@Pc(45) Object local45 = null;
			this.aBoolean23 = false;
		}
	}
}
