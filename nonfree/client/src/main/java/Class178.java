import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class178 implements Runnable {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Lclient!jh;")
	public Class84 aClass84_5;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "[Lclient!cg;")
	public volatile Class24[] aClass24Array1 = new Class24[2];

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	public volatile boolean aBoolean441 = false;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
	public volatile boolean aBoolean442 = false;

	@OriginalMember(owner = "client!wg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean442 = true;
		try {
			while (!this.aBoolean441) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(23) Class24 local23 = this.aClass24Array1[local13];
					if (local23 != null) {
						local23.method2455();
					}
				}
				Static275.method4233(10L);
				Static80.method1356(null, this.aClass84_5);
			}
		} catch (@Pc(47) Exception local47) {
			Static6.method149(local47, null);
		} finally {
			this.aBoolean442 = false;
		}
	}
}
