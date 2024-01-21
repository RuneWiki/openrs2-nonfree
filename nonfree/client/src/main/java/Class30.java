import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[Lclient!kf;")
	public final Class22[] aClass22Array1 = new Class22[2];

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
	public volatile boolean aBoolean35 = false;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
	public volatile boolean aBoolean36 = false;

	@OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean36 = true;
		try {
			while (!this.aBoolean35) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class22 local15 = this.aClass22Array1[local8];
					if (local15 != null) {
						local15.method1087();
					}
				}
				Static80.method1260(10L);
				Static84.method1289(false);
			}
		} catch (@Pc(35) Exception local35) {
			Static29.method518(null, local35);
		} finally {
			@Pc(45) Object local45 = null;
			this.aBoolean36 = false;
		}
	}
}
