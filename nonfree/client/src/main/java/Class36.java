import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class36 {

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
	private final int[] anIntArray186;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V")
	public Class36(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= (arg0.length >> 1) + arg0.length; local3 <<= 0x1) {
		}
		this.anIntArray186 = new int[local3 + local3];
		for (@Pc(25) int local25 = 0; local25 < local3 + local3; local25++) {
			this.anIntArray186[local25] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(52) int local52;
			for (local52 = local3 - 1 & arg0[local43]; this.anIntArray186[local52 + local52 + 1] != -1; local52 = local52 + 1 & local3 + -1) {
			}
			this.anIntArray186[local52 + local52] = arg0[local43];
			this.anIntArray186[local52 + local52 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
	public int method1129(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.anIntArray186.length - 2;
		@Pc(20) int local20 = arg0 << 1 & local14;
		while (true) {
			@Pc(25) int local25 = this.anIntArray186[local20];
			if (arg0 == local25) {
				return this.anIntArray186[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}
}
