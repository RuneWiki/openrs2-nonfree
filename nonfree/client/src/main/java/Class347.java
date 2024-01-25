import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class347 implements Runnable {

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!tt;")
	public Class313 aClass313_50;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "[Lclient!un;")
	public final Class189[] aClass189Array1 = new Class189[2];

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
	public volatile boolean aBoolean668 = false;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Z")
	public volatile boolean aBoolean667 = false;

	@OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean667 = true;
		try {
			while (!this.aBoolean668) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class189 local19 = this.aClass189Array1[local12];
					if (local19 != null) {
						local19.method4945();
					}
				}
				Static183.method3079(10L);
				Static200.method3330(null, this.aClass313_50);
			}
		} catch (@Pc(41) Exception local41) {
			Static214.method5693(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean667 = false;
		}
	}
}
