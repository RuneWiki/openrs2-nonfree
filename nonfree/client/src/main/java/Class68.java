import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class68 {

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[I")
	private final int[] anIntArray329;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([I)V")
	public Class68(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= (arg0.length >> 1) + arg0.length; local3 <<= 0x1) {
		}
		this.anIntArray329 = new int[local3 + local3];
		for (@Pc(29) int local29 = 0; local29 < local3 + local3; local29++) {
			this.anIntArray329[local29] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(52) int local52;
			for (local52 = local3 - 1 & arg0[local43]; this.anIntArray329[local52 + local52 + 1] != -1; local52 = local52 + 1 & local3 + -1) {
			}
			this.anIntArray329[local52 + local52] = arg0[local43];
			this.anIntArray329[local52 + local52 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	public int method1599(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anIntArray329.length - 2;
		@Pc(21) int local21 = arg0 << 1 & local15;
		while (true) {
			@Pc(26) int local26 = this.anIntArray329[local21];
			if (arg0 == local26) {
				return this.anIntArray329[local21 + 1];
			}
			if (local26 == -1) {
				return -1;
			}
			local21 = local15 & local21 + 2;
		}
	}
}
