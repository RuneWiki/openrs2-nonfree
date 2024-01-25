import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class56 implements Runnable {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!td;")
	public Class333 aClass333_3;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "[Lclient!hp;")
	public final Class112[] aClass112Array1 = new Class112[2];

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Z")
	public volatile boolean aBoolean125 = false;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
	public volatile boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ch", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean124 = true;
		try {
			while (!this.aBoolean125) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class112 local19 = this.aClass112Array1[local12];
					if (local19 != null) {
						local19.method5377();
					}
				}
				Static20.method9254(10L);
				Static447.method8527(this.aClass333_3, (Object) null);
			}
		} catch (@Pc(41) Exception local41) {
			Static524.method7532((String) null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean124 = false;
		}
	}
}
