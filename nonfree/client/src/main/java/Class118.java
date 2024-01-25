import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class118 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!fq;")
	public Class83 aClass83_3;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[Lclient!jl;")
	public final Class125[] aClass125Array1 = new Class125[2];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Z")
	public volatile boolean aBoolean372 = false;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
	public volatile boolean aBoolean373 = false;

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean373 = true;
		try {
			while (!this.aBoolean372) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class125 local19 = this.aClass125Array1[local12];
					if (local19 != null) {
						local19.method5857();
					}
				}
				Static223.method4582(10L);
				Static55.method975(null, this.aClass83_3);
			}
		} catch (@Pc(43) Exception local43) {
			Static55.method972(local43, null);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean373 = false;
		}
	}
}
