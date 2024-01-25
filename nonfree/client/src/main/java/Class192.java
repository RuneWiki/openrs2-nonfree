import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class192 implements Runnable {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!am;")
	public Class10 aClass10_5;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "[Lclient!is;")
	public final Class14[] aClass14Array1 = new Class14[2];

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
	public volatile boolean aBoolean442 = false;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Z")
	public volatile boolean aBoolean443 = false;

	@OriginalMember(owner = "client!tk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean443 = true;
		try {
			while (!this.aBoolean442) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class14 local19 = this.aClass14Array1[local12];
					if (local19 != null) {
						local19.method5472();
					}
				}
				Static105.method2138(10L);
				Static2.method4(this.aClass10_5, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static113.method2252(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean443 = false;
		}
	}
}
