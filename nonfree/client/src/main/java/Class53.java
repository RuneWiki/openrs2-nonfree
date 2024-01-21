import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!je;")
	public Class40 aClass40_2;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lclient!db;")
	public final Class13[] aClass13Array1 = new Class13[2];

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Z")
	public volatile boolean aBoolean83 = false;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
	public volatile boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean84 = true;
		try {
			while (!this.aBoolean83) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class13 local19 = this.aClass13Array1[local12];
					if (local19 != null) {
						local19.method1601();
					}
				}
				Static107.method1511(10L);
				Static51.method766(this.aClass40_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static79.method1133(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean84 = false;
		}
	}
}
