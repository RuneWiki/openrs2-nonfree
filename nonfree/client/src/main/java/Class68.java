import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!vi;")
	public Class99 aClass99_4;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[Lclient!pg;")
	public final Class42[] aClass42Array1 = new Class42[2];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
	public volatile boolean aBoolean128 = false;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
	public volatile boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean129 = true;
		try {
			while (!this.aBoolean128) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class42 local15 = this.aClass42Array1[local8];
					if (local15 != null) {
						local15.method2413();
					}
				}
				Static75.method3577(10L);
				Static194.method3314(null, this.aClass99_4);
			}
		} catch (@Pc(39) Exception local39) {
			Static151.method2591(null, local39);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean129 = false;
		}
	}
}
