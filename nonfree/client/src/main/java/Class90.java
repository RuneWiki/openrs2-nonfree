import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class90 implements Runnable {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!mr;")
	public Class226 aClass226_1;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "[Lclient!hh;")
	public final Class35[] aClass35Array1 = new Class35[2];

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Z")
	public volatile boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
	public volatile boolean aBoolean166 = false;

	@OriginalMember(owner = "client!ej", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean166 = true;
		try {
			while (!this.aBoolean165) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class35 local19 = this.aClass35Array1[local12];
					if (local19 != null) {
						local19.method2734();
					}
				}
				Static444.method6061(10L);
				Static284.method3923(null, this.aClass226_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static163.method2447(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean166 = false;
		}
	}
}
