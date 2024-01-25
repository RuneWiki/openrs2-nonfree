import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Lclient!gt;")
	public Class75 aClass75_3;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "[Lclient!fr;")
	public final Class48[] aClass48Array1 = new Class48[2];

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
	public volatile boolean aBoolean175 = false;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Z")
	public volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!gq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean176 = true;
		try {
			while (!this.aBoolean175) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class48 local19 = this.aClass48Array1[local12];
					if (local19 != null) {
						local19.method1830();
					}
				}
				Static135.method2737(10L);
				Static214.method3975(this.aClass75_3, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static119.method2541(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean176 = false;
		}
	}
}
