import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!vt;")
	public Class380 aClass380_2;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "[Lclient!sh;")
	public final Class64[] aClass64Array1 = new Class64[2];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
	public volatile boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
	public volatile boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean121 = true;
		try {
			while (!this.aBoolean120) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class64 local19 = this.aClass64Array1[local12];
					if (local19 != null) {
						local19.method1732();
					}
				}
				Static520.method7923(10L);
				Static201.method7514((Object) null, this.aClass380_2);
			}
		} catch (@Pc(41) Exception local41) {
			Static664.method9007(local41, (String) null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean121 = false;
		}
	}
}
