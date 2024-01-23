import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class158 implements Runnable {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Lclient!uo;")
	public Class176 aClass176_4;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "[Lclient!on;")
	public volatile Class121[] aClass121Array1 = new Class121[2];

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "Z")
	public volatile boolean aBoolean456 = false;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Z")
	public volatile boolean aBoolean455 = false;

	@OriginalMember(owner = "client!sk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean455 = true;
		try {
			while (!this.aBoolean456) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(23) Class121 local23 = this.aClass121Array1[local13];
					if (local23 != null) {
						local23.method3575();
					}
				}
				Static16.method242(10L);
				Static102.method1972(this.aClass176_4, null);
			}
		} catch (@Pc(46) Exception local46) {
			Static6.method4140(local46, null);
		} finally {
			this.aBoolean455 = false;
		}
	}
}
