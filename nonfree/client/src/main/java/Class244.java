import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class244 implements Runnable {

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!qj;")
	public Class272 aClass272_4;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[Lclient!aj;")
	public final Class11[] aClass11Array1 = new Class11[2];

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Z")
	public volatile boolean aBoolean460 = false;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Z")
	public volatile boolean aBoolean459 = false;

	@OriginalMember(owner = "client!or", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean459 = true;
		try {
			while (!this.aBoolean460) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class11 local19 = this.aClass11Array1[local12];
					if (local19 != null) {
						local19.method6286();
					}
				}
				Static318.method4952(10L);
				Static416.method5972(null, this.aClass272_4);
			}
		} catch (@Pc(41) Exception local41) {
			Static256.method4328(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean459 = false;
		}
	}
}
