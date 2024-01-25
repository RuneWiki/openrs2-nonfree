import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Lclient!od;")
	public Class180 aClass180_3;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "[Lclient!jd;")
	public final Class66[] aClass66Array1 = new Class66[2];

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Z")
	public volatile boolean aBoolean145 = false;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Z")
	public volatile boolean aBoolean144 = false;

	@OriginalMember(owner = "client!fr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean144 = true;
		try {
			while (!this.aBoolean145) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class66 local19 = this.aClass66Array1[local12];
					if (local19 != null) {
						local19.method5631();
					}
				}
				Static224.method3441(10L);
				Static328.method4664(this.aClass180_3, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static158.method2570(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean144 = false;
		}
	}
}
