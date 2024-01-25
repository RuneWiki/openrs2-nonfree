import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class95 implements Runnable {

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!nga;")
	public Class228 aClass228_2;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "[Lclient!vm;")
	public final Class122[] aClass122Array1 = new Class122[2];

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
	public volatile boolean aBoolean317 = false;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
	public volatile boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean316 = true;
		try {
			while (!this.aBoolean317) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class122 local19 = this.aClass122Array1[local12];
					if (local19 != null) {
						local19.method6803();
					}
				}
				Static500.method7308(10L);
				Static231.method4411(this.aClass228_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static544.method7724(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean316 = false;
		}
	}
}
