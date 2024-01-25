import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!vj;")
	public Class206 aClass206_2;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "[Lclient!ck;")
	public final Class34[] aClass34Array1 = new Class34[2];

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Z")
	public volatile boolean aBoolean55 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
	public volatile boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean53 = true;
		try {
			while (!this.aBoolean55) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class34 local19 = this.aClass34Array1[local12];
					if (local19 != null) {
						local19.method5832();
					}
				}
				Static278.method5283(10L);
				Static189.method3562(null, this.aClass206_2);
			}
		} catch (@Pc(43) Exception local43) {
			Static346.method5707(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean53 = false;
		}
	}
}
