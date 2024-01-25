import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!or;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[Lclient!eq;")
	public final Class38[] aClass38Array1 = new Class38[2];

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Z")
	public volatile boolean aBoolean11 = false;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Z")
	public volatile boolean aBoolean12 = false;

	@OriginalMember(owner = "client!af", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean12 = true;
		try {
			while (!this.aBoolean11) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class38 local19 = this.aClass38Array1[local12];
					if (local19 != null) {
						local19.method1480();
					}
				}
				Static429.method5376(10L);
				Static269.method3637(this.aClass183_1, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static434.method5460(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean12 = false;
		}
	}
}
