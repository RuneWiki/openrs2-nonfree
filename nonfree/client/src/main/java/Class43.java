import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Lclient!ec;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "[Lclient!wd;")
	public final Class116[] aClass116Array1 = new Class116[2];

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
	public volatile boolean aBoolean59 = false;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Z")
	public volatile boolean aBoolean58 = false;

	@OriginalMember(owner = "client!co", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean58 = true;
		try {
			while (!this.aBoolean59) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class116 local19 = this.aClass116Array1[local12];
					if (local19 != null) {
						local19.method5580();
					}
				}
				Static214.method2089(10L);
				Static22.method3910(null, this.aClass61_2);
			}
		} catch (@Pc(41) Exception local41) {
			Static419.method5247(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean58 = false;
		}
	}
}
