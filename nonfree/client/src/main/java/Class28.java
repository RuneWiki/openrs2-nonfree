import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class28 implements Runnable {

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Lclient!da;")
	public Class14 aClass14_2;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "[Lclient!pg;")
	public final Class4[] aClass4Array1 = new Class4[2];

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Z")
	public volatile boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
	public volatile boolean aBoolean63 = false;

	@OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean63 = true;
		try {
			while (!this.aBoolean64) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class4 local19 = this.aClass4Array1[local12];
					if (local19 != null) {
						local19.method2767();
					}
				}
				Static135.method2569(10L);
				Static105.method1957(null, this.aClass14_2);
			}
		} catch (@Pc(43) Exception local43) {
			Static107.method1977(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean63 = false;
		}
	}
}
