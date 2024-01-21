import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class76 implements Runnable {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!ih;")
	public Class39 aClass39_4;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[Lclient!sg;")
	public final Class5[] aClass5Array1 = new Class5[2];

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Z")
	public volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
	public volatile boolean aBoolean228 = false;

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean228 = true;
		try {
			while (!this.aBoolean227) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class5 local15 = this.aClass5Array1[local8];
					if (local15 != null) {
						local15.method2587();
					}
				}
				Static166.method2609(10L);
				Static121.method2098(null, this.aClass39_4);
			}
		} catch (@Pc(37) Exception local37) {
			Static29.method571(local37, null);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean228 = false;
		}
	}
}
