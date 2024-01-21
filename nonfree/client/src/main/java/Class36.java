import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!ke;")
	public Class45 aClass45_2;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[Lclient!ah;")
	public final Class5[] aClass5Array1 = new Class5[2];

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Z")
	public volatile boolean aBoolean58 = false;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Z")
	public volatile boolean aBoolean57 = false;

	@OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean57 = true;
		try {
			while (!this.aBoolean58) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class5 local19 = this.aClass5Array1[local12];
					if (local19 != null) {
						local19.method1793();
					}
				}
				Static50.method901(10L);
				Static132.method2219(this.aClass45_2, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static8.method1789(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean57 = false;
		}
	}
}
