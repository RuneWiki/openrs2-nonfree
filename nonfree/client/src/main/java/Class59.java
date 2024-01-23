import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class59 implements Runnable {

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!we;")
	public Class184 aClass184_2;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lclient!nc;")
	public volatile Class112[] aClass112Array1 = new Class112[2];

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Z")
	public volatile boolean aBoolean107 = false;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
	public volatile boolean aBoolean106 = false;

	@OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean106 = true;
		try {
			while (!this.aBoolean107) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(23) Class112 local23 = this.aClass112Array1[local13];
					if (local23 != null) {
						local23.method4462();
					}
				}
				Static193.method3169(10L);
				Static151.method2392(this.aClass184_2, null);
			}
		} catch (@Pc(46) Exception local46) {
			Static204.method3269(local46, null);
		} finally {
			this.aBoolean106 = false;
		}
	}
}
