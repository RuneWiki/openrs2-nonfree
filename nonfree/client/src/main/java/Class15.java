import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!gg;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[Lclient!ta;")
	public final Class2[] aClass2Array1 = new Class2[2];

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Z")
	public volatile boolean aBoolean44 = false;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
	public volatile boolean aBoolean45 = false;

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean45 = true;
		try {
			while (!this.aBoolean44) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class2 local19 = this.aClass2Array1[local12];
					if (local19 != null) {
						local19.method1980();
					}
				}
				Static24.method517(10L);
				Static82.method1863(this.aClass32_2, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static141.method2762(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean45 = false;
		}
	}
}
