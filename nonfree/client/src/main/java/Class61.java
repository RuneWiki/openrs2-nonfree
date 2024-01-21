import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!ve;")
	public Class81 aClass81_3;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[Lclient!cc;")
	public final Class11[] aClass11Array1 = new Class11[2];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public volatile boolean aBoolean68 = false;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Z")
	public volatile boolean aBoolean69 = false;

	@OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean69 = true;
		try {
			while (!this.aBoolean68) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class11 local19 = this.aClass11Array1[local12];
					if (local19 != null) {
						local19.method1846();
					}
				}
				Static103.method1711(10L);
				Static55.method883(null, this.aClass81_3);
			}
		} catch (@Pc(43) Exception local43) {
			Static117.method1885(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean69 = false;
		}
	}
}
