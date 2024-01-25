import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "Lclient!fc;")
	public Class100 aClass100_3;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "[Lclient!en;")
	public final Class93[] aClass93Array1 = new Class93[2];

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Z")
	public volatile boolean aBoolean123 = false;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
	public volatile boolean aBoolean122 = false;

	@OriginalMember(owner = "client!dba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean122 = true;
		try {
			while (!this.aBoolean123) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class93 local19 = this.aClass93Array1[local12];
					if (local19 != null) {
						local19.method6372();
					}
				}
				Static314.method4821(10L);
				Static138.method2021(this.aClass100_3, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static524.method7740(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean122 = false;
		}
	}
}
