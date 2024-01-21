import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!bb;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[Lclient!nb;")
	public final Class24[] aClass24Array1 = new Class24[2];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
	public volatile boolean aBoolean26 = false;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Z")
	public volatile boolean aBoolean27 = false;

	@OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean27 = true;
		try {
			while (!this.aBoolean26) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class24 local19 = this.aClass24Array1[local12];
					if (local19 != null) {
						local19.method1457();
					}
				}
				Static13.method399(10L);
				Static93.method1708(null, this.aClass7_1);
			}
		} catch (@Pc(41) Exception local41) {
			Static93.method1709(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean27 = false;
		}
	}
}
