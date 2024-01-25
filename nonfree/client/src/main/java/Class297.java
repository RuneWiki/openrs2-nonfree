import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class297 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!gaa;")
	public Class102 aClass102_5;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[Lclient!lj;")
	public final Class183[] aClass183Array1 = new Class183[2];

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	public volatile boolean aBoolean605 = false;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
	public volatile boolean aBoolean606 = false;

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean606 = true;
		try {
			while (!this.aBoolean605) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class183 local19 = this.aClass183Array1[local12];
					if (local19 != null) {
						local19.method7426();
					}
				}
				Static209.method3565(10L);
				Static346.method5259(null, this.aClass102_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static234.method4051(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean606 = false;
		}
	}
}
