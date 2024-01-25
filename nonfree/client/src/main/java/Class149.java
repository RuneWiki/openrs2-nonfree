import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class149 implements Runnable {

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "[I")
	public static final int[] anIntArray396 = new int[32];

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!sc;")
	public Class179 aClass179_6;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[Lclient!il;")
	public final Class88[] aClass88Array1 = new Class88[2];

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Z")
	public volatile boolean aBoolean437 = false;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "Z")
	public volatile boolean aBoolean438 = false;

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray396[local16] = local14 - 1;
			local14 += local14;
		}
	}

	@OriginalMember(owner = "client!oj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean438 = true;
		try {
			while (!this.aBoolean437) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class88 local19 = this.aClass88Array1[local12];
					if (local19 != null) {
						local19.method2720();
					}
				}
				Static248.method4401(10L);
				Static234.method4285(null, this.aClass179_6);
			}
		} catch (@Pc(43) Exception local43) {
			Static40.method506(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean438 = false;
		}
	}
}
