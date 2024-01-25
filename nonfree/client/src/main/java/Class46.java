import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "Lclient!kd;")
	public Class123 aClass123_1;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "[Lclient!gq;")
	public final Class89[] aClass89Array1 = new Class89[2];

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
	public volatile boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Z")
	public volatile boolean aBoolean90 = false;

	@OriginalMember(owner = "client!ct", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean90 = true;
		try {
			while (!this.aBoolean91) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class89 local19 = this.aClass89Array1[local12];
					if (local19 != null) {
						local19.method5853();
					}
				}
				Static215.method3855(10L);
				Static132.method2299(this.aClass123_1, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static346.method5531(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean90 = false;
		}
	}
}
