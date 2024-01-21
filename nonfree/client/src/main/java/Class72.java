import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!vf;")
	public Class80 aClass80_3;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "[Lclient!gb;")
	public final Class12[] aClass12Array1 = new Class12[2];

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Z")
	public volatile boolean aBoolean106 = false;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Z")
	public volatile boolean aBoolean107 = false;

	@OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean107 = true;
		try {
			while (!this.aBoolean106) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class12 local19 = this.aClass12Array1[local12];
					if (local19 != null) {
						local19.method1512();
					}
				}
				Static118.method1893(10L);
				Static121.method1906(null, this.aClass80_3);
			}
		} catch (@Pc(41) Exception local41) {
			Static21.method462(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean107 = false;
		}
	}
}
