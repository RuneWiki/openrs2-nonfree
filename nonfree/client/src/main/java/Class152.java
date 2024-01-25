import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class152 implements Runnable {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!hs;")
	public Class103 aClass103_4;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lclient!fr;")
	public final Class33[] aClass33Array1 = new Class33[2];

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
	public volatile boolean aBoolean352 = false;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
	public volatile boolean aBoolean353 = false;

	@OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean353 = true;
		try {
			while (!this.aBoolean352) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class33 local19 = this.aClass33Array1[local12];
					if (local19 != null) {
						local19.method3050();
					}
				}
				Static135.method2458(10L);
				Static363.method5127(this.aClass103_4, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static379.method1671(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean353 = false;
		}
	}
}
