import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!dr;")
	public Class59 aClass59_3;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[Lclient!eb;")
	public final Class18[] aClass18Array1 = new Class18[2];

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
	public volatile boolean aBoolean81 = false;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Z")
	public volatile boolean aBoolean82 = false;

	@OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean82 = true;
		try {
			while (!this.aBoolean81) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class18 local19 = this.aClass18Array1[local12];
					if (local19 != null) {
						local19.method5637();
					}
				}
				Static81.method1477(10L);
				Static295.method4252(this.aClass59_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static361.method4904(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean82 = false;
		}
	}
}
