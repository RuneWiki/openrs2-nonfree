import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class138 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
	private final int[] anIntArray324;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "([I)V")
	public Class138(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray324 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray324[local33] = -1;
		}
		@Pc(49) int local49 = 0;
		while (arg0.length > local49) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray324[local59 + local59 + 1] != -1; local59 = local5 - 1 & local59 + 1) {
			}
			this.anIntArray324[local59 + local59] = arg0[local49];
			this.anIntArray324[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)I")
	public int method3300(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray324.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray324[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray324[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
