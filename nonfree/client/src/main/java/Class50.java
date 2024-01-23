import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class50 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
	public static int[] anIntArray377 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!gj;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lclient!gf;")
	public volatile Class40[] aClass40Array1 = new Class40[2];

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
	public volatile boolean aBoolean81 = false;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
	public volatile boolean aBoolean79 = false;

	static {
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray377[local12] = Static145.method2574(local12);
		}
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean79 = true;
		try {
			while (!this.aBoolean81) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class40 local15 = this.aClass40Array1[local8];
					if (local15 != null) {
						local15.method3707();
					}
				}
				Static156.method2805(10L);
				Static95.method1665(null, this.aClass41_1);
			}
		} catch (@Pc(37) Exception local37) {
			Static139.method2127(local37, null);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean79 = false;
		}
	}
}
