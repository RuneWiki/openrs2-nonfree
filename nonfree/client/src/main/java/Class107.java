import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class107 implements Runnable {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!laa;")
	public Class198 aClass198_1;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "[Lclient!jca;")
	public final Class76[] aClass76Array1 = new Class76[2];

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
	public volatile boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Z")
	public volatile boolean aBoolean214 = false;

	@OriginalMember(owner = "client!ft", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean214 = true;
		try {
			while (!this.aBoolean215) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class76 local19 = this.aClass76Array1[local12];
					if (local19 != null) {
						local19.method2511();
					}
				}
				Static408.method5841(10L);
				Static464.method7013(null, this.aClass198_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static419.method5957(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean214 = false;
		}
	}
}
