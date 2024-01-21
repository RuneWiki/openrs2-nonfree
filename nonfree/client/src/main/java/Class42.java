import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class42 {

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	private final int[] anIntArray193;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([I)V")
	public Class42(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray193 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray193[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = arg0[local44] & local5 - 1; this.anIntArray193[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 - -1) {
			}
			this.anIntArray193[local54 + local54] = arg0[local44];
			this.anIntArray193[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	public int method1080(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = this.anIntArray193.length - 2;
		@Pc(15) int local15 = local9 & arg0 << 1;
		while (true) {
			@Pc(30) int local30 = this.anIntArray193[local15];
			if (arg0 == local30) {
				return this.anIntArray193[local15 + 1];
			}
			if (local30 == -1) {
				return -1;
			}
			local15 = local9 & local15 + 2;
		}
	}
}
