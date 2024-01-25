import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class249 implements Runnable {

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!nv;")
	public Class183 aClass183_5;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[Lclient!fl;")
	public final Class31[] aClass31Array1 = new Class31[2];

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
	public volatile boolean aBoolean472 = false;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Z")
	public volatile boolean aBoolean471 = false;

	@OriginalMember(owner = "client!ul", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean471 = true;
		try {
			while (!this.aBoolean472) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class31 local19 = this.aClass31Array1[local12];
					if (local19 != null) {
						local19.method2009();
					}
				}
				Static289.method4249(10L);
				Static193.method3128(null, this.aClass183_5);
			}
		} catch (@Pc(41) Exception local41) {
			Static247.method3669(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean471 = false;
		}
	}
}
