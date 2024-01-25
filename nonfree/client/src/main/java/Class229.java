import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class229 implements Runnable {

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!ii;")
	public Class161 aClass161_6;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "[Lclient!sr;")
	public final Class303[] aClass303Array1 = new Class303[2];

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
	public volatile boolean aBoolean443 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Z")
	public volatile boolean aBoolean442 = false;

	@OriginalMember(owner = "client!mo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean442 = true;
		try {
			while (!this.aBoolean443) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class303 local19 = this.aClass303Array1[local12];
					if (local19 != null) {
						local19.method7980();
					}
				}
				Static55.method845(10L);
				Static208.method3668(null, this.aClass161_6);
			}
		} catch (@Pc(43) Exception local43) {
			Static473.method6593(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean442 = false;
		}
	}
}
