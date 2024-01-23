import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class163 implements Runnable {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Lclient!la;")
	public Class102 aClass102_4;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "[Lclient!em;")
	public volatile Class43[] aClass43Array1 = new Class43[2];

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Z")
	public volatile boolean aBoolean346 = false;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Z")
	public volatile boolean aBoolean345 = false;

	@OriginalMember(owner = "client!sm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean345 = true;
		try {
			while (!this.aBoolean346) {
				for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
					@Pc(19) Class43 local19 = this.aClass43Array1[local9];
					if (local19 != null) {
						local19.method2454();
					}
				}
				Static138.method2475(10L);
				Static21.method369(null, this.aClass102_4);
			}
		} catch (@Pc(42) Exception local42) {
			Static183.method3240(local42, null);
		} finally {
			this.aBoolean345 = false;
		}
	}
}
