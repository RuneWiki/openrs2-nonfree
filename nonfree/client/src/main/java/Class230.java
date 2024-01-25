import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class230 implements Runnable {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!hu;")
	public Class114 aClass114_5;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "[Lclient!fe;")
	public final Class75[] aClass75Array1 = new Class75[2];

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
	public volatile boolean aBoolean446 = false;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Z")
	public volatile boolean aBoolean445 = false;

	@OriginalMember(owner = "client!tj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean445 = true;
		try {
			while (!this.aBoolean446) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class75 local19 = this.aClass75Array1[local12];
					if (local19 != null) {
						local19.method5354();
					}
				}
				Static20.method1515(10L);
				Static342.method4774(null, this.aClass114_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static273.method3690(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean445 = false;
		}
	}
}
