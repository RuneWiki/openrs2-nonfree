import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class339 implements Runnable {

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!vo;")
	public Class389 aClass389_6;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "[Lclient!hia;")
	public final Class70[] aClass70Array1 = new Class70[2];

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Z")
	public volatile boolean aBoolean792 = false;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Z")
	public volatile boolean aBoolean793 = false;

	@OriginalMember(owner = "client!sk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean793 = true;
		try {
			while (!this.aBoolean792) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class70 local19 = this.aClass70Array1[local12];
					if (local19 != null) {
						local19.method9362();
					}
				}
				Static570.method7907(10L);
				Static540.method7564((Object) null, this.aClass389_6);
			}
		} catch (@Pc(45) Exception local45) {
			Static329.method4572((String) null, local45);
		} finally {
			@Pc(55) Object local55 = null;
			this.aBoolean793 = false;
		}
	}
}
