import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class289 {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
	private final int[] anIntArray545;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([I)V")
	public Class289(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray545 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray545[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(57) int local57;
			for (local57 = arg0[local47] & local5 - 1; this.anIntArray545[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 + -1) {
			}
			this.anIntArray545[local57 + local57] = arg0[local47];
			this.anIntArray545[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
	public int method6671(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray545.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray545[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray545[local20 + local20]) {
				return local30;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
