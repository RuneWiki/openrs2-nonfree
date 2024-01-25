import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class249 implements Runnable {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!pc;")
	public Class196 aClass196_8;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[Lclient!vl;")
	public final Class53[] aClass53Array1 = new Class53[2];

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Z")
	public volatile boolean aBoolean494 = false;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Z")
	public volatile boolean aBoolean493 = false;

	@OriginalMember(owner = "client!uo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean493 = true;
		try {
			while (!this.aBoolean494) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class53 local19 = this.aClass53Array1[local12];
					if (local19 != null) {
						local19.method5620();
					}
				}
				Static435.method5777(10L);
				Static403.method5319(this.aClass196_8, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static33.method448(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean493 = false;
		}
	}
}
