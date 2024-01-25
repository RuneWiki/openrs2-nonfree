import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class204 implements Runnable {

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!ci;")
	public Class42 aClass42_5;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[Lclient!ig;")
	public final Class118[] aClass118Array1 = new Class118[2];

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Z")
	public volatile boolean aBoolean495 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
	public volatile boolean aBoolean494 = false;

	@OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean494 = true;
		try {
			while (!this.aBoolean495) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class118 local19 = this.aClass118Array1[local12];
					if (local19 != null) {
						local19.method3931();
					}
				}
				Static366.method5214(10L);
				Static13.method230(this.aClass42_5, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static101.method1630(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean494 = false;
		}
	}
}
