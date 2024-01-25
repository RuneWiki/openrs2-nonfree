import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class331 implements Runnable {

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!wea;")
	public Class370 aClass370_8;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "[Lclient!cba;")
	public final Class33[] aClass33Array1 = new Class33[2];

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
	public volatile boolean aBoolean682 = false;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Z")
	public volatile boolean aBoolean683 = false;

	@OriginalMember(owner = "client!tm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean683 = true;
		try {
			while (!this.aBoolean682) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class33 local19 = this.aClass33Array1[local12];
					if (local19 != null) {
						local19.method7214();
					}
				}
				Static190.method3914(10L);
				Static166.method3586(null, this.aClass370_8);
			}
		} catch (@Pc(41) Exception local41) {
			Static408.method6625(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean683 = false;
		}
	}
}
