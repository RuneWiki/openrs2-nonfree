import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class89 implements Runnable {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!vl;")
	public Class177 aClass177_6;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "[Lclient!wn;")
	public volatile Class3[] aClass3Array1 = new Class3[2];

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Z")
	public volatile boolean aBoolean210 = false;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
	public volatile boolean aBoolean207 = false;

	@OriginalMember(owner = "client!jm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean207 = true;
		try {
			while (!this.aBoolean210) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(23) Class3 local23 = this.aClass3Array1[local13];
					if (local23 != null) {
						local23.method2242();
					}
				}
				Static134.method2329(10L);
				Static120.method2209(null, this.aClass177_6);
			}
		} catch (@Pc(47) Exception local47) {
			Static108.method2009(local47, null);
		} finally {
			this.aBoolean207 = false;
		}
	}
}
