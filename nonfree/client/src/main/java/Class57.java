import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!is;")
	public Class111 aClass111_1;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[Lclient!ue;")
	public final Class85[] aClass85Array1 = new Class85[2];

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
	public volatile boolean aBoolean106 = false;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Z")
	public volatile boolean aBoolean107 = false;

	@OriginalMember(owner = "client!eh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean107 = true;
		try {
			while (!this.aBoolean106) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class85 local19 = this.aClass85Array1[local12];
					if (local19 != null) {
						local19.method4216();
					}
				}
				Static358.method2028(10L);
				Static391.method5670(null, this.aClass111_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static142.method2676(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean107 = false;
		}
	}
}
