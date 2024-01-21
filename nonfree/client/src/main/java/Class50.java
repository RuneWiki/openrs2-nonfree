import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class50 implements Runnable {

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!vb;")
	public Class75 aClass75_2;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[Lclient!ld;")
	public final Class43[] aClass43Array1 = new Class43[2];

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Z")
	public volatile boolean aBoolean123 = false;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Z")
	public volatile boolean aBoolean122 = false;

	@OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean122 = true;
		try {
			while (!this.aBoolean123) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class43 local15 = this.aClass43Array1[local8];
					if (local15 != null) {
						local15.method1914();
					}
				}
				Static40.method783(10L);
				Static38.method770(null, this.aClass75_2);
			}
		} catch (@Pc(39) Exception local39) {
			Static38.method768(local39, null);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean122 = false;
		}
	}
}
