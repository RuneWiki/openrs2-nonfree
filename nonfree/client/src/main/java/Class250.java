import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class250 implements Runnable {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Lclient!ufa;")
	public Class326 aClass326_1;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[Lclient!dc;")
	public final Class24[] aClass24Array1 = new Class24[2];

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "Z")
	public volatile boolean aBoolean637 = false;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Z")
	public volatile boolean aBoolean636 = false;

	@OriginalMember(owner = "client!ou", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean636 = true;
		try {
			while (!this.aBoolean637) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class24 local19 = this.aClass24Array1[local12];
					if (local19 != null) {
						local19.method1139();
					}
				}
				Static1.method125(10L);
				Static462.method7090(this.aClass326_1, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static468.method7192(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean636 = false;
		}
	}
}
