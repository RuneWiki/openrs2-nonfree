import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class42 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
	private final int[] anIntArray174;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V")
	public Class42(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray174 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray174[local34] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray174[local59 + local59 + 1] != -1; local59 = local5 - 1 & local59 + 1) {
			}
			this.anIntArray174[local59 + local59] = arg0[local49];
			this.anIntArray174[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
	public int method1046(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.anIntArray174.length - 2;
		@Pc(23) int local23 = local17 & arg0 << 1;
		while (true) {
			@Pc(28) int local28 = this.anIntArray174[local23];
			if (local28 == arg0) {
				return this.anIntArray174[local23 + 1];
			}
			if (local28 == -1) {
				return -1;
			}
			local23 = local17 & local23 + 2;
		}
	}
}
