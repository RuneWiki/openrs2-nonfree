import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class18 implements Runnable {

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!dc;")
	public Class17 aClass17_2;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "[Lclient!qc;")
	public final Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Z")
	public volatile boolean aBoolean58 = false;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
	public volatile boolean aBoolean56 = false;

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean56 = true;
		try {
			while (!this.aBoolean58) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class15 local19 = this.aClass15Array1[local12];
					if (local19 != null) {
						local19.method1197();
					}
				}
				Static46.method889(10L);
				Static48.method904(null, this.aClass17_2);
			}
		} catch (@Pc(41) Exception local41) {
			Static91.method1588(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean56 = false;
		}
	}
}
