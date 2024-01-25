import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class252 implements Runnable {

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!hf;")
	public Class103 aClass103_5;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "[Lclient!wl;")
	public final Class105[] aClass105Array1 = new Class105[2];

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
	public volatile boolean aBoolean476 = false;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Z")
	public volatile boolean aBoolean475 = false;

	@OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean475 = true;
		try {
			while (!this.aBoolean476) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class105 local19 = this.aClass105Array1[local12];
					if (local19 != null) {
						local19.method5166();
					}
				}
				Static170.method1617(10L);
				Static288.method4289(null, this.aClass103_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static40.method799(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean475 = false;
		}
	}
}
