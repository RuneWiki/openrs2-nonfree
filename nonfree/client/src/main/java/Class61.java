import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!t;")
	public Class81 aClass81_3;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[Lclient!lg;")
	public final Class8[] aClass8Array1 = new Class8[2];

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	public volatile boolean aBoolean130 = false;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
	public volatile boolean aBoolean131 = false;

	@OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean131 = true;
		try {
			while (!this.aBoolean130) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class8 local19 = this.aClass8Array1[local12];
					if (local19 != null) {
						local19.method2801();
					}
				}
				Static85.method1993(10L);
				Static93.method2182(this.aClass81_3, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static153.method2973(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean131 = false;
		}
	}
}
