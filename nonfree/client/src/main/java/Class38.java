import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!bi;")
	public Class12 aClass12_2;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "[Lclient!bc;")
	public final Class9[] aClass9Array1 = new Class9[2];

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Z")
	public volatile boolean aBoolean72 = false;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Z")
	public volatile boolean aBoolean73 = false;

	@OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean73 = true;
		try {
			while (!this.aBoolean72) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class9 local19 = this.aClass9Array1[local12];
					if (local19 != null) {
						local19.method2941();
					}
				}
				Static210.method739(10L);
				Static172.method2766(null, this.aClass12_2);
			}
		} catch (@Pc(41) Exception local41) {
			Static51.method890(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean73 = false;
		}
	}
}
