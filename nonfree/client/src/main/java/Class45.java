import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Lclient!qg;")
	public Class286 aClass286_1;

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "[Lclient!bl;")
	public final Class39[] aClass39Array1 = new Class39[2];

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Z")
	public volatile boolean aBoolean126 = false;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "Z")
	public volatile boolean aBoolean125 = false;

	@OriginalMember(owner = "client!bu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean125 = true;
		try {
			while (!this.aBoolean126) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class39 local19 = this.aClass39Array1[local12];
					if (local19 != null) {
						local19.method4891();
					}
				}
				Static440.method6322(10L);
				Static117.method5171((Object) null, this.aClass286_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static25.method7457(local41, (String) null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean125 = false;
		}
	}
}
