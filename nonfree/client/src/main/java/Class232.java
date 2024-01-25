import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class232 implements Runnable {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!pb;")
	public Class194 aClass194_5;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "[Lclient!in;")
	public final Class62[] aClass62Array1 = new Class62[2];

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Z")
	public volatile boolean aBoolean447 = false;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Z")
	public volatile boolean aBoolean448 = false;

	static {
		new Class231(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean448 = true;
		try {
			while (!this.aBoolean447) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class62 local19 = this.aClass62Array1[local12];
					if (local19 != null) {
						local19.method2422();
					}
				}
				Static167.method6157(10L);
				Static191.method2758(this.aClass194_5, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static22.method402(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean448 = false;
		}
	}
}
