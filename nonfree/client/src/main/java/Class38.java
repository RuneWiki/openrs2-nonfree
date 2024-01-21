import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lclient!ce;")
	public final Class10[] aClass10Array1 = new Class10[2];

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
	public volatile boolean aBoolean94 = false;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	public volatile boolean aBoolean93 = false;

	@OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean93 = true;
		try {
			while (!this.aBoolean94) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class10 local19 = this.aClass10Array1[local12];
					if (local19 != null) {
						local19.method1726();
					}
				}
				Static53.method2063(10L);
				Static34.method846(false);
			}
		} catch (@Pc(41) Exception local41) {
			Static92.method1674(local41, null);
		}
		this.aBoolean93 = false;
	}
}
