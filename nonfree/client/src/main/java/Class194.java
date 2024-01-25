import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class194 implements Runnable {

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!uf;")
	public Class283 aClass283_2;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[Lclient!lr;")
	public final Class104[] aClass104Array1 = new Class104[2];

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Z")
	public volatile boolean aBoolean417 = false;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Z")
	public volatile boolean aBoolean418 = false;

	@OriginalMember(owner = "client!mv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean418 = true;
		try {
			while (!this.aBoolean417) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class104 local19 = this.aClass104Array1[local12];
					if (local19 != null) {
						local19.method7807();
					}
				}
				Static379.method5233(10L);
				Static497.method7322(this.aClass283_2, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static459.method6984(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean418 = false;
		}
	}
}
