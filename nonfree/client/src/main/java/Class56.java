import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class56 implements Runnable {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!d;")
	public Class24 aClass24_2;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "[Lclient!bh;")
	public final Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Z")
	public volatile boolean aBoolean136 = false;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Z")
	public volatile boolean aBoolean135 = false;

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean135 = true;
		try {
			while (!this.aBoolean136) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class15 local15 = this.aClass15Array1[local8];
					if (local15 != null) {
						local15.method2627();
					}
				}
				Static199.method3292(10L);
				Static160.method2512(null, this.aClass24_2);
			}
		} catch (@Pc(37) Exception local37) {
			Static61.method998(local37, null);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean135 = false;
		}
	}
}
