import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class350 implements Runnable {

	@OriginalMember(owner = "client!tja", name = "f", descriptor = "Lclient!cea;")
	public Class48 aClass48_7;

	@OriginalMember(owner = "client!tja", name = "g", descriptor = "[Lclient!iv;")
	public final Class34[] aClass34Array1 = new Class34[2];

	@OriginalMember(owner = "client!tja", name = "e", descriptor = "Z")
	public volatile boolean aBoolean733 = false;

	@OriginalMember(owner = "client!tja", name = "h", descriptor = "Z")
	public volatile boolean aBoolean734 = false;

	@OriginalMember(owner = "client!tja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean734 = true;
		try {
			while (!this.aBoolean733) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class34 local19 = this.aClass34Array1[local12];
					if (local19 != null) {
						local19.method6328();
					}
				}
				Static650.method9565(10L);
				Static490.method7749(this.aClass48_7, (Object) null);
			}
		} catch (@Pc(41) Exception local41) {
			Static165.method3319(local41, (String) null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean734 = false;
		}
	}
}
