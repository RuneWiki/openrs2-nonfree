import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class28 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	public static final int[] anIntArray154 = new int[99];

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
	private final int[] anIntArray153;

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) ((double) local21 + Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D);
			local14 += local34;
			anIntArray154[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
	public Class28(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray153 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray153[local28] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray153[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray153[local57 + local57] = arg0[local47];
			this.anIntArray153[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)I")
	public int method743(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray153.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(30) int local30 = this.anIntArray153[local15 + local15 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray153[local15 + local15] == arg0) {
				return local30;
			}
			local15 = local15 + 1 & local11;
		}
	}
}
