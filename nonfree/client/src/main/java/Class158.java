import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class158 implements Runnable {

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!li;")
	public Class143 aClass143_4;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "[Lclient!kc;")
	public final Class16[] aClass16Array1 = new Class16[2];

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Z")
	public volatile boolean aBoolean430 = false;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Z")
	public volatile boolean aBoolean431 = false;

	@OriginalMember(owner = "client!mu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean431 = true;
		try {
			while (!this.aBoolean430) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class16 local19 = this.aClass16Array1[local12];
					if (local19 != null) {
						local19.method4114();
					}
				}
				Static360.method4758(10L);
				Static346.method4591(null, this.aClass143_4);
			}
		} catch (@Pc(43) Exception local43) {
			Static324.method5974(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean431 = false;
		}
	}
}
