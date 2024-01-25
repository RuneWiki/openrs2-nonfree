import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class151 implements Runnable {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!ft;")
	public Class109 aClass109_6;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[Lclient!jp;")
	public final Class177[] aClass177Array1 = new Class177[2];

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Z")
	public volatile boolean aBoolean317 = false;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
	public volatile boolean aBoolean316 = false;

	@OriginalMember(owner = "client!id", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean316 = true;
		try {
			while (!this.aBoolean317) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class177 local19 = this.aClass177Array1[local12];
					if (local19 != null) {
						local19.method7519();
					}
				}
				Static391.method5400(10L);
				Static448.method6207(this.aClass109_6, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static345.method4708(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean316 = false;
		}
	}
}
