import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
	public static int[] anIntArray479 = new int[256];

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ua;")
	public Class176 aClass176_3;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[Lclient!tn;")
	public volatile Class105[] aClass105Array1 = new Class105[2];

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
	public volatile boolean aBoolean309 = false;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
	public volatile boolean aBoolean310 = false;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local6;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray479[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean310 = true;
		try {
			while (!this.aBoolean309) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(21) Class105 local21 = this.aClass105Array1[local13];
					if (local21 != null) {
						local21.method2781();
					}
				}
				Static150.method2552(10L);
				Static26.method419(this.aClass176_3, null);
			}
		} catch (@Pc(45) Exception local45) {
			Static42.method613(null, local45);
		} finally {
			this.aBoolean310 = false;
		}
	}
}
