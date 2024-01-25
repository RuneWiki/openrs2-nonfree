import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class161 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
	private final int[] anIntArray376;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([I)V")
	public Class161(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray376 = new int[local5 + local5];
		for (@Pc(30) int local30 = 0; local30 < local5 + local5; local30++) {
			this.anIntArray376[local30] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray376[local59 + local59 + 1] != -1; local59 = local5 - 1 & local59 + 1) {
			}
			this.anIntArray376[local59 + local59] = arg0[local49];
			this.anIntArray376[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	public int method4073(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray376.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray376[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (this.anIntArray376[local20 + local20] == arg0) {
				return local30;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
