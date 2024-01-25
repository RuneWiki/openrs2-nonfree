import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class135 implements Runnable {

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!rd;")
	public Class168 aClass168_3;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "[Lclient!ir;")
	public final Class94[] aClass94Array1 = new Class94[2];

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Z")
	public volatile boolean aBoolean365 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Z")
	public volatile boolean aBoolean364 = false;

	@OriginalMember(owner = "client!ng", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean364 = true;
		try {
			while (!this.aBoolean365) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class94 local19 = this.aClass94Array1[local12];
					if (local19 != null) {
						local19.method5975();
					}
				}
				Static102.method2276(10L);
				Static8.method218(null, this.aClass168_3);
			}
		} catch (@Pc(43) Exception local43) {
			Static69.method1566(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean364 = false;
		}
	}
}
