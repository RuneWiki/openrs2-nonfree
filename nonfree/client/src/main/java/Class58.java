import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class58 implements Runnable {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!lc;")
	public Class207 aClass207_1;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[Lclient!nj;")
	public final Class64[] aClass64Array1 = new Class64[2];

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
	public volatile boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
	public volatile boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean120 = true;
		try {
			while (!this.aBoolean119) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class64 local19 = this.aClass64Array1[local12];
					if (local19 != null) {
						local19.method2209();
					}
				}
				Static491.method6679(10L);
				Static446.method6127((Object) null, this.aClass207_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static357.method4765(local41, (String) null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean120 = false;
		}
	}
}
