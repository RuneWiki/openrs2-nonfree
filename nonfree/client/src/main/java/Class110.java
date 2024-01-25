import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class110 implements Runnable {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!rp;")
	public Class298 aClass298_5;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "[Lclient!efa;")
	public final Class89[] aClass89Array1 = new Class89[2];

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "Z")
	public volatile boolean aBoolean240 = false;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Z")
	public volatile boolean aBoolean241 = false;

	@OriginalMember(owner = "client!fk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean241 = true;
		try {
			while (!this.aBoolean240) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class89 local19 = this.aClass89Array1[local12];
					if (local19 != null) {
						local19.method4206();
					}
				}
				Static143.method2414(10L);
				Static256.method4294(this.aClass298_5, (Object) null);
			}
		} catch (@Pc(43) Exception local43) {
			Static296.method5075(local43, (String) null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean241 = false;
		}
	}
}
