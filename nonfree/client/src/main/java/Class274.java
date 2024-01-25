import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class274 implements Runnable {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!br;")
	public Class47 aClass47_5;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[Lclient!lba;")
	public final Class107[] aClass107Array1 = new Class107[2];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public volatile boolean aBoolean489 = false;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Z")
	public volatile boolean aBoolean488 = false;

	@OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean488 = true;
		try {
			while (!this.aBoolean489) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class107 local19 = this.aClass107Array1[local12];
					if (local19 != null) {
						local19.method5370();
					}
				}
				Static550.method7219(10L);
				Static154.method2524((Object) null, this.aClass47_5);
			}
		} catch (@Pc(47) Exception local47) {
			Static275.method4893((String) null, local47);
		} finally {
			@Pc(57) Object local57 = null;
			this.aBoolean488 = false;
		}
	}
}
