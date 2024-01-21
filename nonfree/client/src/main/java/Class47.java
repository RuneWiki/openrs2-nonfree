import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!oc;")
	public Class55 aClass55_3;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[Lclient!kc;")
	public final Class10[] aClass10Array1 = new Class10[2];

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
	public volatile boolean aBoolean50 = false;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Z")
	public volatile boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean51 = true;
		try {
			while (!this.aBoolean50) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class10 local19 = this.aClass10Array1[local12];
					if (local19 != null) {
						local19.method1301();
					}
				}
				Static70.method1226(10L);
				Static68.method1209(this.aClass55_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static122.method2173(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean51 = false;
		}
	}
}
