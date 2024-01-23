import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!gn;")
	public Class66 aClass66_4;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[Lclient!bi;")
	public volatile Class9[] aClass9Array1 = new Class9[2];

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
	public volatile boolean aBoolean107 = false;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
	public volatile boolean aBoolean106 = false;

	@OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean106 = true;
		try {
			while (!this.aBoolean107) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(21) Class9 local21 = this.aClass9Array1[local13];
					if (local21 != null) {
						local21.method4340();
					}
				}
				Static230.method4022(10L);
				Static274.method2237(this.aClass66_4, null);
			}
		} catch (@Pc(46) Exception local46) {
			Static217.method3829(null, local46);
		} finally {
			this.aBoolean106 = false;
		}
	}
}
