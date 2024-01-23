import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!d;")
	public Class28 aClass28_2;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[Lclient!hk;")
	public volatile Class55[] aClass55Array1 = new Class55[2];

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
	public volatile boolean aBoolean105 = false;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
	public volatile boolean aBoolean104 = false;

	@OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean104 = true;
		try {
			while (!this.aBoolean105) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class55 local15 = this.aClass55Array1[local8];
					if (local15 != null) {
						local15.method3205();
					}
				}
				Static30.method587(10L);
				Static226.method3733(null, this.aClass28_2);
			}
		} catch (@Pc(39) Exception local39) {
			Static57.method1101(null, local39);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean104 = false;
		}
	}
}
