import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class90 implements Runnable {

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!na;")
	public Class61 aClass61_4;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "[Lclient!hi;")
	public final Class38[] aClass38Array1 = new Class38[2];

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Z")
	public volatile boolean aBoolean163 = false;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
	public volatile boolean aBoolean162 = false;

	@OriginalMember(owner = "client!uf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean162 = true;
		try {
			while (!this.aBoolean163) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class38 local15 = this.aClass38Array1[local8];
					if (local15 != null) {
						local15.method2945();
					}
				}
				Static135.method2059(10L);
				Static126.method1862(null, this.aClass61_4);
			}
		} catch (@Pc(39) Exception local39) {
			Static67.method1005(local39, null);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean162 = false;
		}
	}
}
