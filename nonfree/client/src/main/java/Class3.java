import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3 implements Runnable {

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "[Lclient!ha;")
	public final Class26[] aClass26Array1 = new Class26[2];

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
	public volatile boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Z")
	public volatile boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean23 = true;
		try {
			while (!this.aBoolean24) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class26 local15 = this.aClass26Array1[local8];
					if (local15 != null) {
						local15.method1930();
					}
				}
				Static96.method1616(10L);
				Static14.method293(false);
			}
		} catch (@Pc(35) Exception local35) {
			Static95.method2004(null, local35);
		} finally {
			@Pc(45) Object local45 = null;
			this.aBoolean23 = false;
		}
	}
}
