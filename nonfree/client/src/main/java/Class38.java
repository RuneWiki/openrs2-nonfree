import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!u;")
	public Class74 aClass74_2;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[Lclient!w;")
	public final Class34[] aClass34Array1 = new Class34[2];

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
	public volatile boolean aBoolean59 = false;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
	public volatile boolean aBoolean60 = false;

	@OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean60 = true;
		try {
			while (!this.aBoolean59) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class34 local15 = this.aClass34Array1[local8];
					if (local15 != null) {
						local15.method1727();
					}
				}
				Static126.method2277(10L);
				Static12.method337(null, this.aClass74_2);
			}
		} catch (@Pc(39) Exception local39) {
			Static87.method1031(local39, null);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean60 = false;
		}
	}
}
