import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class274 implements Runnable {

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "Lclient!ec;")
	public Class92 aClass92_5;

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "[Lclient!br;")
	public final Class41[] aClass41Array1 = new Class41[2];

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Z")
	public volatile boolean aBoolean511 = false;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Z")
	public volatile boolean aBoolean512 = false;

	@OriginalMember(owner = "client!ow", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean512 = true;
		try {
			while (!this.aBoolean511) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class41 local19 = this.aClass41Array1[local12];
					if (local19 != null) {
						local19.method7698();
					}
				}
				Static26.method592(10L);
				Static8.method116((Object) null, this.aClass92_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static456.method6140((String) null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean512 = false;
		}
	}
}
