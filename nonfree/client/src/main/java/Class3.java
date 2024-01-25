import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3 implements Runnable {

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "Lclient!pq;")
	public Class229 aClass229_1;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "[Lclient!oba;")
	public final Class15[] aClass15Array1 = new Class15[2];

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "Z")
	public volatile boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "Z")
	public volatile boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean3 = true;
		try {
			while (!this.aBoolean4) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class15 local19 = this.aClass15Array1[local12];
					if (local19 != null) {
						local19.method3560();
					}
				}
				Static265.method3147(10L);
				Static31.method7358(this.aClass229_1, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static25.method773(local41, null);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean3 = false;
		}
	}
}
