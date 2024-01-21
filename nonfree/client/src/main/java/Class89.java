import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class89 implements Runnable {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!hf;")
	public Class41 aClass41_4;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[Lclient!n;")
	public final Class3[] aClass3Array1 = new Class3[2];

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Z")
	public volatile boolean aBoolean159 = false;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
	public volatile boolean aBoolean160 = false;

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean160 = true;
		try {
			while (!this.aBoolean159) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class3 local15 = this.aClass3Array1[local8];
					if (local15 != null) {
						local15.method102();
					}
				}
				Static117.method1813(10L);
				Static40.method663(null, this.aClass41_4);
			}
		} catch (@Pc(39) Exception local39) {
			Static84.method2582(null, local39);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean160 = false;
		}
	}
}
