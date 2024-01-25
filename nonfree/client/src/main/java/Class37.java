import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!nh;")
	public Class143 aClass143_3;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "[Lclient!uc;")
	public final Class7[] aClass7Array1 = new Class7[2];

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
	public volatile boolean aBoolean148 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Z")
	public volatile boolean aBoolean149 = false;

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean149 = true;
		try {
			while (!this.aBoolean148) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class7 local19 = this.aClass7Array1[local12];
					if (local19 != null) {
						local19.method5560();
					}
				}
				Static190.method3690(10L);
				Static62.method1535(null, this.aClass143_3);
			}
		} catch (@Pc(41) Exception local41) {
			Static109.method2355(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean149 = false;
		}
	}
}
