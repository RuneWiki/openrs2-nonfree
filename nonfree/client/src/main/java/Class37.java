import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!cf;")
	public Class14 aClass14_2;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "[Lclient!ab;")
	public final Class3[] aClass3Array1 = new Class3[2];

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
	public volatile boolean aBoolean85 = false;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Z")
	public volatile boolean aBoolean86 = false;

	@OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean86 = true;
		try {
			while (!this.aBoolean85) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class3 local19 = this.aClass3Array1[local12];
					if (local19 != null) {
						local19.method1532();
					}
				}
				Static6.method84(10L);
				Static50.method873(this.aClass14_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static102.method1593(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean86 = false;
		}
	}
}
