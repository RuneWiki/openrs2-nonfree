import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "Lclient!rj;")
	public Class154 aClass154_4;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "[Lclient!tj;")
	public volatile Class28[] aClass28Array1 = new Class28[2];

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
	public volatile boolean aBoolean271 = false;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Z")
	public volatile boolean aBoolean270 = false;

	@OriginalMember(owner = "client!ol", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean270 = true;
		try {
			while (!this.aBoolean271) {
				for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
					@Pc(17) Class28 local17 = this.aClass28Array1[local9];
					if (local17 != null) {
						local17.method4778();
					}
				}
				Static282.method4345(10L);
				Static159.method2736(this.aClass154_4, null);
			}
		} catch (@Pc(40) Exception local40) {
			Static159.method2733(local40, null);
		} finally {
			this.aBoolean270 = false;
		}
	}
}
