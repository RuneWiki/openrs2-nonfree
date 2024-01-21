import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "[Lclient!fe;")
	public final Class1[] aClass1Array1 = new Class1[2];

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Z")
	public volatile boolean aBoolean98 = false;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Z")
	public volatile boolean aBoolean97 = false;

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean97 = true;
		try {
			while (!this.aBoolean98) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class1 local19 = this.aClass1Array1[local12];
					if (local19 != null) {
						local19.method1397();
					}
				}
				Static40.method822(10L);
				Static51.method946(false);
			}
		} catch (@Pc(39) Exception local39) {
			Static10.method172(null, local39);
		}
		this.aBoolean97 = false;
	}
}
