import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class318 implements Runnable {

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!dj;")
	public Class71 aClass71_6;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!pr;")
	public final Class69[] aClass69Array1 = new Class69[2];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Z")
	public volatile boolean aBoolean681 = false;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
	public volatile boolean aBoolean682 = false;

	@OriginalMember(owner = "client!wl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean682 = true;
		try {
			while (!this.aBoolean681) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class69 local19 = this.aClass69Array1[local12];
					if (local19 != null) {
						local19.method6840();
					}
				}
				Static17.method388(10L);
				Static148.method5739(null, this.aClass71_6);
			}
		} catch (@Pc(43) Exception local43) {
			Static508.method7541(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean682 = false;
		}
	}
}
