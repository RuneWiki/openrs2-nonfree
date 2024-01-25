import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class71 implements Runnable {

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!cea;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "[Lclient!bm;")
	public final Class33[] aClass33Array1 = new Class33[2];

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
	public volatile boolean aBoolean188 = false;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
	public volatile boolean aBoolean187 = false;

	@OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean187 = true;
		try {
			while (!this.aBoolean188) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class33 local19 = this.aClass33Array1[local12];
					if (local19 != null) {
						local19.method8229();
					}
				}
				Static564.method7845(10L);
				Static627.method8497((Object) null, this.aClass47_1);
			}
		} catch (@Pc(47) Exception local47) {
			Static64.method799((String) null, local47);
		} finally {
			@Pc(57) Object local57 = null;
			this.aBoolean187 = false;
		}
	}
}
