import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class28 implements Runnable {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!pc;")
	public Class87 aClass87_5;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "[Lclient!id;")
	public volatile Class48[] aClass48Array1 = new Class48[2];

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
	public volatile boolean aBoolean54 = false;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Z")
	public volatile boolean aBoolean55 = false;

	@OriginalMember(owner = "client!eh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean55 = true;
		try {
			while (!this.aBoolean54) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class48 local19 = this.aClass48Array1[local12];
					if (local19 != null) {
						local19.method3223();
					}
				}
				Static204.method3250(10L);
				Static201.method3213(null, this.aClass87_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static204.method3249(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean55 = false;
		}
	}
}
