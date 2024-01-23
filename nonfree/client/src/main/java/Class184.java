import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class184 implements Runnable {

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Lclient!na;")
	public Class112 aClass112_4;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "[Lclient!hn;")
	public volatile Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
	public volatile boolean aBoolean385 = false;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Z")
	public volatile boolean aBoolean386 = false;

	@OriginalMember(owner = "client!vi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean386 = true;
		try {
			while (!this.aBoolean385) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(21) Class15 local21 = this.aClass15Array1[local13];
					if (local21 != null) {
						local21.method1248();
					}
				}
				Static312.method4734(10L);
				Static316.method4774(this.aClass112_4, null);
			}
		} catch (@Pc(46) Exception local46) {
			Static66.method3525(local46, null);
		} finally {
			this.aBoolean386 = false;
		}
	}
}
