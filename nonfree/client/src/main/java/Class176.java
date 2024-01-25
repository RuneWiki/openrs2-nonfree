import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class176 implements Runnable {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!ge;")
	public Class112 aClass112_3;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "[Lclient!vn;")
	public final Class190[] aClass190Array1 = new Class190[2];

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "Z")
	public volatile boolean aBoolean391 = false;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
	public volatile boolean aBoolean390 = false;

	@OriginalMember(owner = "client!kp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean390 = true;
		try {
			while (!this.aBoolean391) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class190 local19 = this.aClass190Array1[local12];
					if (local19 != null) {
						local19.method7499();
					}
				}
				Static179.method3254(10L);
				Static258.method4613(this.aClass112_3, (Object) null);
			}
		} catch (@Pc(41) Exception local41) {
			Static619.method8645(local41, (String) null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean390 = false;
		}
	}
}
