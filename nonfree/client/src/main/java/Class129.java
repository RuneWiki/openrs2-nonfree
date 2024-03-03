import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class129 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "[Lclient!rn;")
	public static final Class205[] aClass205Array1 = new Class205[29];

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ml;")
	public Class152 aClass152_3;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "[Lclient!tg;")
	public final Class221[] aClass221Array1 = new Class221[2];

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Z")
	public volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Z")
	public volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V", line = 179)
	@Override
	public void run() {
		this.aBoolean226 = true;
		try {
			while (!this.aBoolean227) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class221 local19 = this.aClass221Array1[local12];
					if (local19 != null) {
						local19.method6317();
					}
				}
				Static214.method4024(10L);
				Static260.method4877(this.aClass152_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static241.method6254(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean226 = false;
		}
	}
}
