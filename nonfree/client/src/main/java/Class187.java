import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class187 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "[I")
	public static final int[] anIntArray571;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "[I")
	public static final int[] anIntArray570;

	static {
		new Class85("Unable to send abuse report - system busy.", "", "", "");
		anIntArray571 = new int[16384];
		anIntArray570 = new int[16384];
		@Pc(19) double local19 = 3.834951969714103E-4D;
		for (@Pc(21) int local21 = 0; local21 < 16384; local21++) {
			anIntArray571[local21] = (int) (Math.sin(local19 * (double) local21) * 32768.0D);
			anIntArray570[local21] = (int) (Math.cos(local19 * (double) local21) * 32768.0D);
		}
	}
}
