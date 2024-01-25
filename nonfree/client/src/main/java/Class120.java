import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class120 implements Runnable {

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!fl;")
	public Class104 aClass104_1;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "[Lclient!qn;")
	public final Class114[] aClass114Array1 = new Class114[2];

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
	public volatile boolean aBoolean333 = false;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
	public volatile boolean aBoolean334 = false;

	@OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean334 = true;
		try {
			while (!this.aBoolean333) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class114 local19 = this.aClass114Array1[local12];
					if (local19 != null) {
						local19.method4234();
					}
				}
				Static344.method5698(10L);
				Static403.method6329(this.aClass104_1, (Object) null);
			}
		} catch (@Pc(43) Exception local43) {
			Static358.method5809(local43, (String) null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean334 = false;
		}
	}
}
