import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class283 implements Runnable {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!oq;")
	public Class268 aClass268_3;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[Lclient!nr;")
	public final Class255[] aClass255Array1 = new Class255[2];

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	public volatile boolean aBoolean672 = false;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Z")
	public volatile boolean aBoolean671 = false;

	@OriginalMember(owner = "client!q", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean671 = true;
		try {
			while (!this.aBoolean672) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class255 local19 = this.aClass255Array1[local12];
					if (local19 != null) {
						local19.method7452();
					}
				}
				Static579.method8004(10L);
				Static673.method8995((Object) null, this.aClass268_3);
			}
		} catch (@Pc(41) Exception local41) {
			Static234.method3615(local41, (String) null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean671 = false;
		}
	}
}
