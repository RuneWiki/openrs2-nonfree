import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class102 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V")
	public Class102(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray432 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray432[local33] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray432[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 - -1) {
			}
			this.anIntArray432[local58 + local58] = arg0[local48];
			this.anIntArray432[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
	public int method3084(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray432.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(32) int local32 = this.anIntArray432[local15 + local15 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray432[local15 + local15]) {
				return local32;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
