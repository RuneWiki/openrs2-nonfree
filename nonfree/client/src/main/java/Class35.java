import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class35 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	private final int[] anIntArray186;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([I)V")
	public Class35(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray186 = new int[local3 + local3];
		for (@Pc(30) int local30 = 0; local30 < local3 + local3; local30++) {
			this.anIntArray186[local30] = -1;
		}
		@Pc(49) int local49 = 0;
		while (arg0.length > local49) {
			@Pc(58) int local58;
			for (local58 = arg0[local49] & local3 - 1; this.anIntArray186[local58 + local58 + 1] != -1; local58 = local58 + 1 & local3 - 1) {
			}
			this.anIntArray186[local58 + local58] = arg0[local49];
			this.anIntArray186[local58 + local58 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	public int method856(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = this.anIntArray186.length - 2;
		@Pc(20) int local20 = local14 & arg0 << 1;
		while (true) {
			@Pc(25) int local25 = this.anIntArray186[local20];
			if (local25 == arg0) {
				return this.anIntArray186[local20 + 1];
			}
			if (local25 == -1) {
				return -1;
			}
			local20 = local20 + 2 & local14;
		}
	}
}
