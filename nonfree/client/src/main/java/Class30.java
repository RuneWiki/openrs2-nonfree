import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!dd;")
	public Class15 aClass15_2;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lclient!wb;")
	public final Class22[] aClass22Array1 = new Class22[2];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
	public volatile boolean aBoolean82 = false;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
	public volatile boolean aBoolean83 = false;

	@OriginalMember(owner = "client!hf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean83 = true;
		try {
			while (!this.aBoolean82) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class22 local15 = this.aClass22Array1[local8];
					if (local15 != null) {
						local15.method931();
					}
				}
				Static109.method2037(10L);
				Static93.method1597(this.aClass15_2, null);
			}
		} catch (@Pc(37) Exception local37) {
			Static65.method1115(null, local37);
		} finally {
			@Pc(47) Object local47 = null;
			this.aBoolean83 = false;
		}
	}
}
