import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 implements Runnable {

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!mi;")
	public Class72 aClass72_1;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[Lclient!ff;")
	public volatile Class42[] aClass42Array1 = new Class42[2];

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
	public volatile boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
	public volatile boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean3 = true;
		try {
			while (!this.aBoolean4) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class42 local19 = this.aClass42Array1[local12];
					if (local19 != null) {
						local19.method2740();
					}
				}
				Static186.method3115(10L);
				Static145.method2494(null, this.aClass72_1);
			}
		} catch (@Pc(43) Exception local43) {
			Static34.method595(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean3 = false;
		}
	}
}
