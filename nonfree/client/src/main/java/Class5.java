import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!wd;")
	public Class215 aClass215_1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "[Lclient!po;")
	public final Class125[] aClass125Array1 = new Class125[2];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Z")
	public volatile boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Z")
	public volatile boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean7 = true;
		try {
			while (!this.aBoolean6) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class125 local19 = this.aClass125Array1[local12];
					if (local19 != null) {
						local19.method5311();
					}
				}
				Static163.method2863(10L);
				Static158.method2800(null, this.aClass215_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static268.method4816(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean7 = false;
		}
	}
}
