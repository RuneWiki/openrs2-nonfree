import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class275 implements Runnable {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!n;")
	public Class221 aClass221_7;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[Lclient!ri;")
	public final Class288[] aClass288Array1 = new Class288[2];

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Z")
	public volatile boolean aBoolean565 = false;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Z")
	public volatile boolean aBoolean564 = false;

	@OriginalMember(owner = "client!qi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean564 = true;
		try {
			while (!this.aBoolean565) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class288 local19 = this.aClass288Array1[local12];
					if (local19 != null) {
						local19.method6799();
					}
				}
				Static374.method5521(10L);
				Static194.method3307(null, this.aClass221_7);
			}
		} catch (@Pc(43) Exception local43) {
			Static379.method5607(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean564 = false;
		}
	}
}
