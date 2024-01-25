import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class262 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[I")
	private final int[] anIntArray483;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([I)V")
	public Class262(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray483 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray483[local32] = -1;
		}
		@Pc(47) int local47 = 0;
		while (arg0.length > local47) {
			@Pc(57) int local57;
			for (local57 = local5 - 1 & arg0[local47]; this.anIntArray483[local57 + local57 + 1] != -1; local57 = local57 + 1 & local5 - 1) {
			}
			this.anIntArray483[local57 + local57] = arg0[local47];
			this.anIntArray483[local57 + local57 + 1] = local47++;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
	public int method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = (this.anIntArray483.length >> 1) - 1;
		@Pc(19) int local19 = arg0 & local15;
		while (true) {
			@Pc(28) int local28 = this.anIntArray483[local19 + local19 + 1];
			if (local28 == -1) {
				return -1;
			}
			if (this.anIntArray483[local19 + local19] == arg0) {
				return local28;
			}
			local19 = local15 & local19 + 1;
		}
	}
}
