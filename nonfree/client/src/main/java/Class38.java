import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "Lclient!ej;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "[Lclient!jh;")
	public volatile Class62[] aClass62Array1 = new Class62[2];

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Z")
	public volatile boolean aBoolean136 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
	public volatile boolean aBoolean135 = false;

	@OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean135 = true;
		try {
			while (!this.aBoolean136) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class62 local19 = this.aClass62Array1[local12];
					if (local19 != null) {
						local19.method2407();
					}
				}
				Static148.method2431(10L);
				Static69.method1242(null, this.aClass34_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static81.method1384(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean135 = false;
		}
	}
}
