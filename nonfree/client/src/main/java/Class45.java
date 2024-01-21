import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!rh;")
	public Class76 aClass76_3;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[Lclient!mg;")
	public final Class41[] aClass41Array1 = new Class41[2];

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Z")
	public volatile boolean aBoolean92 = false;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Z")
	public volatile boolean aBoolean91 = false;

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean91 = true;
		try {
			while (!this.aBoolean92) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class41 local19 = this.aClass41Array1[local12];
					if (local19 != null) {
						local19.method2047();
					}
				}
				Static52.method1025(10L);
				Static123.method2212(null, this.aClass76_3);
			}
		} catch (@Pc(41) Exception local41) {
			Static146.method2485(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean91 = false;
		}
	}
}
