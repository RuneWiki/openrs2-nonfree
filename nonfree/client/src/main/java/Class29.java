import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class29 {

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "[I")
	private final int[] anIntArray148;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([I)V")
	public Class29(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= (arg0.length >> 1) + arg0.length; local3 <<= 0x1) {
		}
		this.anIntArray148 = new int[local3 + local3];
		for (@Pc(29) int local29 = 0; local29 < local3 + local3; local29++) {
			this.anIntArray148[local29] = -1;
		}
		@Pc(47) int local47 = 0;
		while (local47 < arg0.length) {
			@Pc(56) int local56;
			for (local56 = arg0[local47] & local3 - 1; this.anIntArray148[local56 + local56 + 1] != -1; local56 = local56 + 1 & local3 + -1) {
			}
			this.anIntArray148[local56 + local56] = arg0[local47];
			this.anIntArray148[local56 + local56 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
	public int method1053(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray148.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(30) int local30 = this.anIntArray148[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray148[local20 + local20]) {
				return local30;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
