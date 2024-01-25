import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class90 implements Runnable {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!lh;")
	public Class120 aClass120_2;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "[Lclient!ck;")
	public final Class39[] aClass39Array1 = new Class39[2];

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Z")
	public volatile boolean aBoolean212 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
	public volatile boolean aBoolean211 = false;

	@OriginalMember(owner = "client!hg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean211 = true;
		try {
			while (!this.aBoolean212) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class39 local19 = this.aClass39Array1[local12];
					if (local19 != null) {
						local19.method4807();
					}
				}
				Static270.method5481(10L);
				Static48.method914(this.aClass120_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static103.method2841(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean211 = false;
		}
	}
}
