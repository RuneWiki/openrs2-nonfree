import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class219 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "[I")
	private final int[] anIntArray499;

	static {
		new Class55(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([I)V")
	public Class219(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray499 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray499[local28] = -1;
		}
		@Pc(44) int local44 = 0;
		while (arg0.length > local44) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray499[local54 + local54 + 1] != -1; local54 = local54 + 1 & local5 + -1) {
			}
			this.anIntArray499[local54 + local54] = arg0[local44];
			this.anIntArray499[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
	public int method4467(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray499.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray499[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (this.anIntArray499[local23 + local23] == arg0) {
				return local32;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
