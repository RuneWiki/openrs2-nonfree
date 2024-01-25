import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class227 implements Runnable {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!et;")
	public Class66 aClass66_7;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "[Lclient!ln;")
	public final Class49[] aClass49Array1 = new Class49[2];

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Z")
	public volatile boolean aBoolean589 = false;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Z")
	public volatile boolean aBoolean590 = false;

	@OriginalMember(owner = "client!tj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean590 = true;
		try {
			while (!this.aBoolean589) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class49 local19 = this.aClass49Array1[local12];
					if (local19 != null) {
						local19.method2069();
					}
				}
				Static435.method5503(10L);
				Static441.method5566(this.aClass66_7, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static94.method1654(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean590 = false;
		}
	}
}
