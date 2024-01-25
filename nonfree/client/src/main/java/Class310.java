import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class310 implements Runnable {

	@OriginalMember(owner = "client!rja", name = "f", descriptor = "Lclient!lu;")
	public Class231 aClass231_5;

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "[Lclient!lv;")
	public final Class232[] aClass232Array1 = new Class232[2];

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "Z")
	public volatile boolean aBoolean654 = false;

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "Z")
	public volatile boolean aBoolean655 = false;

	@OriginalMember(owner = "client!rja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean655 = true;
		try {
			while (!this.aBoolean654) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class232 local19 = this.aClass232Array1[local12];
					if (local19 != null) {
						local19.method8520();
					}
				}
				Static365.method3472(10L);
				Static297.method4593(this.aClass231_5, (Object) null);
			}
		} catch (@Pc(41) Exception local41) {
			Static81.method1711((String) null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean655 = false;
		}
	}
}
