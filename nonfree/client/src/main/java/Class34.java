import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "[I")
	public static int[] anIntArray156 = new int[99];

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!qd;")
	public Class68 aClass68_3;

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "[Lclient!eh;")
	public final Class12[] aClass12Array1 = new Class12[2];

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
	public volatile boolean aBoolean61 = false;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Z")
	public volatile boolean aBoolean62 = false;

	static {
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < 99; local63++) {
			@Pc(68) int local68 = local63 + 1;
			@Pc(81) int local81 = (int) ((double) local68 + Math.pow(2.0D, (double) local68 / 7.0D) * 300.0D);
			local61 += local81;
			anIntArray156[local63] = local61 / 4;
		}
	}

	@OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean62 = true;
		try {
			while (!this.aBoolean61) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class12 local19 = this.aClass12Array1[local12];
					if (local19 != null) {
						local19.method2667();
					}
				}
				Static35.method627(10L);
				Static38.method685(null, this.aClass68_3);
			}
		} catch (@Pc(43) Exception local43) {
			Static124.method2117(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean62 = false;
		}
	}
}
