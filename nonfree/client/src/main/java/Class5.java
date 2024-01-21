import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!e;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "[Lclient!sd;")
	public final Class53[] aClass53Array1 = new Class53[2];

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
	public volatile boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Z")
	public volatile boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ah", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean24 = true;
		try {
			while (!this.aBoolean23) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class53 local19 = this.aClass53Array1[local12];
					if (local19 != null) {
						local19.method3053();
					}
				}
				Static181.method2982(10L);
				Static45.method1185(this.aClass16_1, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static154.method2661(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean24 = false;
		}
	}
}
