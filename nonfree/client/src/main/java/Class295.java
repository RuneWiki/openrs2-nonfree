import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class295 implements Runnable {

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "Lclient!k;")
	public Class168 aClass168_13;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "[Lclient!cl;")
	public final Class58[] aClass58Array1 = new Class58[2];

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "Z")
	public volatile boolean aBoolean570 = false;

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "Z")
	public volatile boolean aBoolean569 = false;

	@OriginalMember(owner = "client!saa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean569 = true;
		try {
			while (!this.aBoolean570) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class58 local19 = this.aClass58Array1[local12];
					if (local19 != null) {
						local19.method5323();
					}
				}
				Static373.method5240(10L);
				Static7.method63(this.aClass168_13, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static332.method1390(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean569 = false;
		}
	}
}
