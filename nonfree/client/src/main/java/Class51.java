import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "Lclient!vk;")
	public Class359 aClass359_2;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "[Lclient!vo;")
	public final Class39[] aClass39Array1 = new Class39[2];

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "Z")
	public volatile boolean aBoolean89 = false;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "Z")
	public volatile boolean aBoolean88 = false;

	@OriginalMember(owner = "client!cda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean88 = true;
		try {
			while (!this.aBoolean89) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class39 local19 = this.aClass39Array1[local12];
					if (local19 != null) {
						local19.method2885();
					}
				}
				Static57.method1062(10L);
				Static28.method3675(this.aClass359_2, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static420.method6396(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean88 = false;
		}
	}
}
