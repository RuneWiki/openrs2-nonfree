import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class179 implements Runnable {

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!wv;")
	public Class366 aClass366_4;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[Lclient!pda;")
	public final Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
	public volatile boolean aBoolean410 = false;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Z")
	public volatile boolean aBoolean411 = false;

	@OriginalMember(owner = "client!kk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean411 = true;
		try {
			while (!this.aBoolean410) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class15 local19 = this.aClass15Array1[local12];
					if (local19 != null) {
						local19.method5351();
					}
				}
				Static214.method3478(10L);
				Static457.method6720(this.aClass366_4, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static109.method2014(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean411 = false;
		}
	}
}
