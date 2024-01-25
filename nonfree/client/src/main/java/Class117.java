import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class117 implements Runnable {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "Lclient!ew;")
	public Class99 aClass99_1;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "[Lclient!cv;")
	public final Class7[] aClass7Array1 = new Class7[2];

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
	public volatile boolean aBoolean175 = false;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Z")
	public volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!fv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean176 = true;
		try {
			while (!this.aBoolean175) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class7 local19 = this.aClass7Array1[local12];
					if (local19 != null) {
						local19.method6311();
					}
				}
				Static263.method3671(10L);
				Static202.method2530(null, this.aClass99_1);
			}
		} catch (@Pc(43) Exception local43) {
			Static357.method5094(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean176 = false;
		}
	}
}
