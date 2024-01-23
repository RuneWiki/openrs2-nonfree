import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!qg;")
	public Class83 aClass83_4;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[Lclient!ej;")
	public volatile Class31[] aClass31Array1 = new Class31[2];

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
	public volatile boolean aBoolean189 = false;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Z")
	public volatile boolean aBoolean190 = false;

	@OriginalMember(owner = "client!oi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean190 = true;
		try {
			while (!this.aBoolean189) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class31 local19 = this.aClass31Array1[local12];
					if (local19 != null) {
						local19.method1505();
					}
				}
				Static19.method344(10L);
				Static134.method2138(null, this.aClass83_4);
			}
		} catch (@Pc(41) Exception local41) {
			Static196.method3064(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean190 = false;
		}
	}
}
