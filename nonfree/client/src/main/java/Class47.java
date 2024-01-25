import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "Lclient!rj;")
	public Class287 aClass287_3;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "[Lclient!ah;")
	public final Class14[] aClass14Array1 = new Class14[2];

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Z")
	public volatile boolean aBoolean90 = false;

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "Z")
	public volatile boolean aBoolean91 = false;

	@OriginalMember(owner = "client!cba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean91 = true;
		try {
			while (!this.aBoolean90) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class14 local19 = this.aClass14Array1[local12];
					if (local19 != null) {
						local19.method5518();
					}
				}
				Static459.method6498(10L);
				Static421.method6466(this.aClass287_3, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static58.method946(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean91 = false;
		}
	}
}
