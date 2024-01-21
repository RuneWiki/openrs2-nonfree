import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[Lclient!le;")
	public final Class18[] aClass18Array1 = new Class18[2];

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	public volatile boolean aBoolean10 = false;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
	public volatile boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean11 = true;
		try {
			while (!this.aBoolean10) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class18 local19 = this.aClass18Array1[local12];
					if (local19 != null) {
						local19.method1539();
					}
				}
				Static68.method1266(10L);
				Static115.method1896(false);
			}
		} catch (@Pc(41) Exception local41) {
			Static61.method1200(null, local41);
		}
		this.aBoolean11 = false;
	}
}
