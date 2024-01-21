import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!ih;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[Lclient!wg;")
	public final Class41[] aClass41Array1 = new Class41[2];

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
	public volatile boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Z")
	public volatile boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ce", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean18 = true;
		try {
			while (!this.aBoolean19) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class41 local19 = this.aClass41Array1[local12];
					if (local19 != null) {
						local19.method1512();
					}
				}
				Static155.method2675(10L);
				Static77.method1233(null, this.aClass36_1);
			}
		} catch (@Pc(43) Exception local43) {
			Static97.method1572(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean18 = false;
		}
	}
}
