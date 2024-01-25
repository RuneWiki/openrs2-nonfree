import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class261 implements Runnable {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!lp;")
	public Class182 aClass182_7;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lclient!gaa;")
	public final Class39[] aClass39Array1 = new Class39[2];

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
	public volatile boolean aBoolean493 = false;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
	public volatile boolean aBoolean492 = false;

	@OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean492 = true;
		try {
			while (!this.aBoolean493) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class39 local19 = this.aClass39Array1[local12];
					if (local19 != null) {
						local19.method5071();
					}
				}
				Static505.method7295(10L);
				Static168.method3281(this.aClass182_7, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static41.method1359(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean492 = false;
		}
	}
}
