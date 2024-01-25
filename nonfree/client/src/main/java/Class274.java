import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class274 implements Runnable {

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!kk;")
	public Class192 aClass192_4;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "[Lclient!uu;")
	public final Class63[] aClass63Array1 = new Class63[2];

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Z")
	public volatile boolean aBoolean620 = false;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Z")
	public volatile boolean aBoolean619 = false;

	@OriginalMember(owner = "client!po", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean619 = true;
		try {
			while (!this.aBoolean620) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class63 local19 = this.aClass63Array1[local12];
					if (local19 != null) {
						local19.method3497();
					}
				}
				Static452.method7478(10L);
				Static235.method3626(this.aClass192_4, (Object) null);
			}
		} catch (@Pc(43) Exception local43) {
			Static280.method4194((String) null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean619 = false;
		}
	}
}
