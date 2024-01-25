import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!kj;")
	public Class202 aClass202_1;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "[Lclient!fa;")
	public final Class107[] aClass107Array1 = new Class107[2];

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Z")
	public volatile boolean aBoolean113 = false;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "Z")
	public volatile boolean aBoolean112 = false;

	@OriginalMember(owner = "client!cv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean112 = true;
		try {
			while (!this.aBoolean113) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class107 local19 = this.aClass107Array1[local12];
					if (local19 != null) {
						local19.method8602();
					}
				}
				Static127.method1985(10L);
				Static366.method5464(this.aClass202_1, (Object) null);
			}
		} catch (@Pc(41) Exception local41) {
			Static17.method268((String) null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean112 = false;
		}
	}
}
