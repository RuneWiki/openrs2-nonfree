import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class98 implements Runnable {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!mc;")
	public Class65 aClass65_6;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "[Lclient!cb;")
	public volatile Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
	public volatile boolean aBoolean229 = false;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Z")
	public volatile boolean aBoolean230 = false;

	@OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean230 = true;
		try {
			while (!this.aBoolean229) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class15 local19 = this.aClass15Array1[local12];
					if (local19 != null) {
						local19.method1990();
					}
				}
				Static146.method2494(10L);
				Static139.method2383(null, this.aClass65_6);
			}
		} catch (@Pc(43) Exception local43) {
			Static131.method2194(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean230 = false;
		}
	}
}
