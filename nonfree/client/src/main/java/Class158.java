import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class158 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
	private final int[] anIntArray367;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "([I)V")
	public Class158(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray367 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray367[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray367[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray367[local58 + local58] = arg0[local48];
			this.anIntArray367[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public int method4051(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray367.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray367[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray367[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
