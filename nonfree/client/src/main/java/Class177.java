import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class177 implements Runnable {

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Lclient!iha;")
	public Class173 aClass173_3;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "[Lclient!bh;")
	public final Class37[] aClass37Array1 = new Class37[2];

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Z")
	public volatile boolean aBoolean364 = false;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "Z")
	public volatile boolean aBoolean363 = false;

	@OriginalMember(owner = "client!io", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean363 = true;
		try {
			while (!this.aBoolean364) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class37 local19 = this.aClass37Array1[local12];
					if (local19 != null) {
						local19.method4370();
					}
				}
				Static548.method7968(10L);
				Static19.method294((Object) null, this.aClass173_3);
			}
		} catch (@Pc(45) Exception local45) {
			Static629.method8829((String) null, local45);
		} finally {
			@Pc(55) Object local55 = null;
			this.aBoolean363 = false;
		}
	}
}
