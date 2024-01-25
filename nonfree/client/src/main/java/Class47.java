import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!de;")
	public Class42 aClass42_3;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[Lclient!ea;")
	public final Class30[] aClass30Array1 = new Class30[2];

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Z")
	public volatile boolean aBoolean67 = false;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Z")
	public volatile boolean aBoolean68 = false;

	@OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean68 = true;
		try {
			while (!this.aBoolean67) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class30 local19 = this.aClass30Array1[local12];
					if (local19 != null) {
						local19.method4527();
					}
				}
				Static134.method2241(10L);
				Static237.method4027(this.aClass42_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static69.method1091(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean68 = false;
		}
	}
}
