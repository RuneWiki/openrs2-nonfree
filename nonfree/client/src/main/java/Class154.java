import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class154 implements Runnable {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!bk;")
	public Class17 aClass17_4;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "[Lclient!nb;")
	public volatile Class111[] aClass111Array1 = new Class111[2];

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Z")
	public volatile boolean aBoolean392 = false;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Z")
	public volatile boolean aBoolean391 = false;

	@OriginalMember(owner = "client!sj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean391 = true;
		try {
			while (!this.aBoolean392) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(21) Class111 local21 = this.aClass111Array1[local13];
					if (local21 != null) {
						local21.method4159();
					}
				}
				Static162.method2645(10L);
				Static283.method4211(this.aClass17_4, null);
			}
		} catch (@Pc(46) Exception local46) {
			Static88.method1444(null, local46);
		} finally {
			this.aBoolean391 = false;
		}
	}
}
