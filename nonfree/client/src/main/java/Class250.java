import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class250 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!pi;")
	public Class258 aClass258_4;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!cv;")
	public final Class8[] aClass8Array1 = new Class8[2];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	public volatile boolean aBoolean519 = false;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
	public volatile boolean aBoolean520 = false;

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean520 = true;
		try {
			while (!this.aBoolean519) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class8 local19 = this.aClass8Array1[local12];
					if (local19 != null) {
						local19.method5525();
					}
				}
				Static589.method7892(10L);
				Static366.method5365(null, this.aClass258_4);
			}
		} catch (@Pc(41) Exception local41) {
			Static172.method7826(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean520 = false;
		}
	}
}
