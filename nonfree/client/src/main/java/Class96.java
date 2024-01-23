import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class96 implements Runnable {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!tk;")
	public Class164 aClass164_3;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[Lclient!fl;")
	public volatile Class51[] aClass51Array1 = new Class51[2];

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Z")
	public volatile boolean aBoolean194 = false;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Z")
	public volatile boolean aBoolean195 = false;

	@OriginalMember(owner = "client!la", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean195 = true;
		try {
			while (!this.aBoolean194) {
				for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
					@Pc(17) Class51 local17 = this.aClass51Array1[local9];
					if (local17 != null) {
						local17.method3286();
					}
				}
				Static122.method2061(10L);
				Static284.method4275(null, this.aClass164_3);
			}
		} catch (@Pc(40) Exception local40) {
			Static244.method3721(null, local40);
		} finally {
			this.aBoolean195 = false;
		}
	}
}
