import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class39 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	private final int[] anIntArray255;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([I)V")
	public Class39(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray255 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray255[local28] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray255[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray255[local58 + local58] = arg0[local48];
			this.anIntArray255[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	public int method1282(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = (this.anIntArray255.length >> 1) - 1;
		@Pc(16) int local16 = local12 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray255[local16 + local16 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray255[local16 + local16]) {
				return local29;
			}
			local16 = local16 + 1 & local12;
		}
	}
}
