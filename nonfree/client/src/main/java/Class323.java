import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class323 implements Runnable {

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "Lclient!gh;")
	public Class118 aClass118_5;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "[Lclient!nc;")
	public final Class80[] aClass80Array1 = new Class80[2];

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Z")
	public volatile boolean aBoolean658 = false;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "Z")
	public volatile boolean aBoolean659 = false;

	@OriginalMember(owner = "client!tda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean659 = true;
		try {
			while (!this.aBoolean658) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class80 local19 = this.aClass80Array1[local12];
					if (local19 != null) {
						local19.method3198();
					}
				}
				Static214.method4061(10L);
				Static148.method5409(this.aClass118_5, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static596.method8231(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean659 = false;
		}
	}
}
