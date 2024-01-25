import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class65 implements Runnable {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!qn;")
	public Class209 aClass209_34;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "[Lclient!wg;")
	public final Class2[] aClass2Array1 = new Class2[2];

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
	public volatile boolean aBoolean146 = false;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Z")
	public volatile boolean aBoolean145 = false;

	static {
		new Class267(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean145 = true;
		try {
			while (!this.aBoolean146) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class2 local19 = this.aClass2Array1[local12];
					if (local19 != null) {
						local19.method360();
					}
				}
				Static88.method4161(10L);
				Static350.method5231(null, this.aClass209_34);
			}
		} catch (@Pc(43) Exception local43) {
			Static390.method5741(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean145 = false;
		}
	}
}
