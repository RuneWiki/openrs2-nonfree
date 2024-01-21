import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!a;")
	public Class1 aClass1_3;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "[Lclient!bb;")
	public final Class10[] aClass10Array1 = new Class10[2];

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Z")
	public volatile boolean aBoolean78 = false;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
	public volatile boolean aBoolean77 = false;

	@OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean77 = true;
		try {
			while (!this.aBoolean78) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class10 local15 = this.aClass10Array1[local8];
					if (local15 != null) {
						local15.method1787();
					}
				}
				Static119.method2069(10L);
				Static80.method1451(this.aClass1_3, null);
			}
		} catch (@Pc(39) Exception local39) {
			Static188.method2856(null, local39);
		} finally {
			@Pc(49) Object local49 = null;
			this.aBoolean77 = false;
		}
	}
}
