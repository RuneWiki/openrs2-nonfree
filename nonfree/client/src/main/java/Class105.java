import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class105 implements Runnable {

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!kq;")
	public Class110 aClass110_5;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "[Lclient!we;")
	public final Class174[] aClass174Array1 = new Class174[2];

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
	public volatile boolean aBoolean268 = false;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "Z")
	public volatile boolean aBoolean269 = false;

	@OriginalMember(owner = "client!js", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean269 = true;
		try {
			while (!this.aBoolean268) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class174 local19 = this.aClass174Array1[local12];
					if (local19 != null) {
						local19.method5525();
					}
				}
				Static134.method2598(10L);
				Static238.method4252(null, this.aClass110_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static152.method2899(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean269 = false;
		}
	}
}
