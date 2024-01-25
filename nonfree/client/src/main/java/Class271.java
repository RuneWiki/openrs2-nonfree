import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class271 implements Runnable {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Lclient!mca;")
	public Class230 aClass230_4;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "[Lclient!jq;")
	public final Class175[] aClass175Array1 = new Class175[2];

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "Z")
	public volatile boolean aBoolean574 = false;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Z")
	public volatile boolean aBoolean572 = false;

	@OriginalMember(owner = "client!ow", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean572 = true;
		try {
			while (!this.aBoolean574) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class175 local19 = this.aClass175Array1[local12];
					if (local19 != null) {
						local19.method4705();
					}
				}
				Static351.method5279(10L);
				Static378.method5535(this.aClass230_4, (Object) null);
			}
		} catch (@Pc(47) Exception local47) {
			Static405.method5934((String) null, local47);
		} finally {
			@Pc(57) Object local57 = null;
			this.aBoolean572 = false;
		}
	}
}
