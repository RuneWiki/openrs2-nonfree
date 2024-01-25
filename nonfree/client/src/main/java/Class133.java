import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class133 implements Runnable {

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!bd;")
	public Class21 aClass21_5;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[Lclient!aq;")
	public final Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Z")
	public volatile boolean aBoolean295 = false;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Z")
	public volatile boolean aBoolean296 = false;

	@OriginalMember(owner = "client!lo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean296 = true;
		try {
			while (!this.aBoolean295) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class15 local19 = this.aClass15Array1[local12];
					if (local19 != null) {
						local19.method4455();
					}
				}
				Static129.method2634(10L);
				Static304.method4915(null, this.aClass21_5);
			}
		} catch (@Pc(43) Exception local43) {
			Static46.method1056(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean296 = false;
		}
	}
}
