import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class328 {

	@OriginalMember(owner = "client!su", name = "f", descriptor = "[I")
	private final int[] anIntArray527;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "([I)V")
	public Class328(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray527 = new int[local5 + local5];
		for (@Pc(39) int local39 = 0; local39 < local5 + local5; local39++) {
			this.anIntArray527[local39] = -1;
		}
		@Pc(57) int local57 = 0;
		while (local57 < arg0.length) {
			@Pc(69) int local69;
			for (local69 = arg0[local57] & local5 - 1; this.anIntArray527[local69 + local69 + 1] != -1; local69 = local5 - 1 & local69 - -1) {
			}
			this.anIntArray527[local69 + local69] = arg0[local57];
			this.anIntArray527[local69 + local69 + 1] = local57++;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
	public int method8005(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (this.anIntArray527.length >> 1) - 1;
		@Pc(24) int local24 = arg0 & local13;
		while (true) {
			@Pc(33) int local33 = this.anIntArray527[local24 + local24 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray527[local24 + local24]) {
				return local33;
			}
			local24 = local13 & local24 + 1;
		}
	}
}
