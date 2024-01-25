import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class218 implements Runnable {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!ft;")
	public Class122 aClass122_21;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[Lclient!wm;")
	public final Class150[] aClass150Array1 = new Class150[2];

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Z")
	public volatile boolean aBoolean423 = false;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Z")
	public volatile boolean aBoolean424 = false;

	@OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean424 = true;
		try {
			while (!this.aBoolean423) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class150 local19 = this.aClass150Array1[local12];
					if (local19 != null) {
						local19.method5490(94);
					}
				}
				Static255.method4444(10L);
				Static372.method8350((Object) null, this.aClass122_21);
			}
		} catch (@Pc(45) Exception local45) {
			Static550.method7785(local45, (String) null);
		} finally {
			@Pc(55) Object local55 = null;
			this.aBoolean424 = false;
		}
	}
}
