import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class189 implements Runnable {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!kj;")
	public Class138 aClass138_6;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "[Lclient!hv;")
	public final Class110[] aClass110Array1 = new Class110[2];

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
	public volatile boolean aBoolean370 = false;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
	public volatile boolean aBoolean371 = false;

	@OriginalMember(owner = "client!qm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean371 = true;
		try {
			while (!this.aBoolean370) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class110 local19 = this.aClass110Array1[local12];
					if (local19 != null) {
						local19.method4777();
					}
				}
				Static67.method1189(10L);
				Static58.method1059(null, this.aClass138_6);
			}
		} catch (@Pc(41) Exception local41) {
			Static315.method4700(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean371 = false;
		}
	}
}
