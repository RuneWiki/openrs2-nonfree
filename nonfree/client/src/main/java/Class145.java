import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class145 implements Runnable {

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!ap;")
	public Class15 aClass15_4;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "[Lclient!bp;")
	public final Class26[] aClass26Array1 = new Class26[2];

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Z")
	public volatile boolean aBoolean257 = false;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Z")
	public volatile boolean aBoolean256 = false;

	@OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean256 = true;
		try {
			while (!this.aBoolean257) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class26 local19 = this.aClass26Array1[local12];
					if (local19 != null) {
						local19.method4217();
					}
				}
				Static15.method5425(10L);
				Static165.method4554(null, this.aClass15_4);
			}
		} catch (@Pc(43) Exception local43) {
			Static47.method1149(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean256 = false;
		}
	}
}
