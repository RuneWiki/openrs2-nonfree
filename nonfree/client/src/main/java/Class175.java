import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class175 implements Runnable {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!nt;")
	public Class177 aClass177_3;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "[Lclient!vn;")
	public final Class101[] aClass101Array1 = new Class101[2];

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Z")
	public volatile boolean aBoolean435 = false;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Z")
	public volatile boolean aBoolean434 = false;

	@OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean434 = true;
		try {
			while (!this.aBoolean435) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class101 local19 = this.aClass101Array1[local12];
					if (local19 != null) {
						local19.method4855();
					}
				}
				Static331.method4343(10L);
				Static286.method3789(null, this.aClass177_3);
			}
		} catch (@Pc(43) Exception local43) {
			Static338.method4409(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean434 = false;
		}
	}
}
