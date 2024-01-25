import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!js;")
	public Class131 aClass131_2;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[Lclient!ou;")
	public final Class141[] aClass141Array1 = new Class141[2];

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
	public volatile boolean aBoolean156 = false;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Z")
	public volatile boolean aBoolean155 = false;

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean155 = true;
		try {
			while (!this.aBoolean156) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class141 local19 = this.aClass141Array1[local12];
					if (local19 != null) {
						local19.method5200();
					}
				}
				Static443.method5991(10L);
				Static293.method4556(this.aClass131_2, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static80.method1410(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean155 = false;
		}
	}
}
