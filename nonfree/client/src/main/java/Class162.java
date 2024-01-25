import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class162 implements Runnable {

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "Lclient!qn;")
	public Class291 aClass291_4;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "[Lclient!gw;")
	public final Class127[] aClass127Array1 = new Class127[2];

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Z")
	public volatile boolean aBoolean351 = false;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "Z")
	public volatile boolean aBoolean352 = false;

	@OriginalMember(owner = "client!jba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean352 = true;
		try {
			while (!this.aBoolean351) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class127 local19 = this.aClass127Array1[local12];
					if (local19 != null) {
						local19.method7564();
					}
				}
				Static373.method5403(10L);
				Static95.method1728((Object) null, this.aClass291_4);
			}
		} catch (@Pc(41) Exception local41) {
			Static503.method7153((String) null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean352 = false;
		}
	}
}
