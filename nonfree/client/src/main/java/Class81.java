import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!jb;")
	public Class35 aClass35_4;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[Lclient!kc;")
	public final Class39[] aClass39Array1 = new Class39[2];

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Z")
	public volatile boolean aBoolean126 = false;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	public volatile boolean aBoolean127 = false;

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean127 = true;
		try {
			while (!this.aBoolean126) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class39 local19 = this.aClass39Array1[local12];
					if (local19 != null) {
						local19.method1684();
					}
				}
				Static13.method278(10L);
				Static38.method644(this.aClass35_4, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static15.method2092(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean127 = false;
		}
	}
}
