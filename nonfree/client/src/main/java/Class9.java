import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class9 implements Runnable {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!pc;")
	public Class63 aClass63_2;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[Lclient!vf;")
	public final Class82[] aClass82Array1 = new Class82[2];

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Z")
	public volatile boolean aBoolean20 = false;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	public volatile boolean aBoolean19 = false;

	@OriginalMember(owner = "client!cc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean19 = true;
		try {
			while (!this.aBoolean20) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class82 local19 = this.aClass82Array1[local12];
					if (local19 != null) {
						local19.method2633();
					}
				}
				Static50.method927(10L);
				Static60.method1093(null, this.aClass63_2);
			}
		} catch (@Pc(41) Exception local41) {
			Static165.method2525(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean19 = false;
		}
	}
}
