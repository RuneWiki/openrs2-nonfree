import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class156 implements Runnable {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!wd;")
	public Class354 aClass354_2;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "[Lclient!kv;")
	public final Class80[] aClass80Array1 = new Class80[2];

	@OriginalMember(owner = "client!il", name = "h", descriptor = "Z")
	public volatile boolean aBoolean305 = false;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "Z")
	public volatile boolean aBoolean304 = false;

	@OriginalMember(owner = "client!il", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean304 = true;
		try {
			while (!this.aBoolean305) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class80 local19 = this.aClass80Array1[local12];
					if (local19 != null) {
						local19.method5601();
					}
				}
				Static63.method1019(10L);
				Static197.method3386(this.aClass354_2, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static205.method3450(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean304 = false;
		}
	}
}
