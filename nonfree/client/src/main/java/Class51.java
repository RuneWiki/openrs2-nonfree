import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!nf;")
	public Class117 aClass117_2;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[Lclient!tl;")
	public volatile Class101[] aClass101Array1 = new Class101[2];

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Z")
	public volatile boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
	public volatile boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean112 = true;
		try {
			while (!this.aBoolean113) {
				for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
					@Pc(17) Class101 local17 = this.aClass101Array1[local9];
					if (local17 != null) {
						local17.method2799();
					}
				}
				Static202.method3246(10L);
				Static68.method1139(this.aClass117_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static195.method3178(null, local41);
		} finally {
			this.aBoolean112 = false;
		}
	}
}
