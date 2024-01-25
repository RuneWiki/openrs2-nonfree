import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class327 implements Runnable {

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "Lclient!pe;")
	public Class246 aClass246_8;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "[Lclient!wf;")
	public final Class196[] aClass196Array1 = new Class196[2];

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Z")
	public volatile boolean aBoolean693 = false;

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "Z")
	public volatile boolean aBoolean694 = false;

	@OriginalMember(owner = "client!vca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean694 = true;
		try {
			while (!this.aBoolean693) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class196 local19 = this.aClass196Array1[local12];
					if (local19 != null) {
						local19.method6403();
					}
				}
				Static566.method8004(10L);
				Static441.method6734(null, this.aClass246_8);
			}
		} catch (@Pc(41) Exception local41) {
			Static5.method211(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean694 = false;
		}
	}
}
