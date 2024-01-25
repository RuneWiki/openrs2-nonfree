import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class135 implements Runnable {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!ml;")
	public Class134 aClass134_4;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[Lclient!ng;")
	public final Class35[] aClass35Array1 = new Class35[2];

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
	public volatile boolean aBoolean320 = false;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "Z")
	public volatile boolean aBoolean321 = false;

	@OriginalMember(owner = "client!mm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean321 = true;
		try {
			while (!this.aBoolean320) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class35 local19 = this.aClass35Array1[local12];
					if (local19 != null) {
						local19.method2559();
					}
				}
				Static249.method4396(10L);
				Static70.method1651(null, this.aClass134_4);
			}
		} catch (@Pc(41) Exception local41) {
			Static289.method4874(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean321 = false;
		}
	}
}
