import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class60 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
	private final int[] anIntArray100;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([I)V")
	public Class60(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray100 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray100[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray100[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray100[local58 + local58] = arg0[local48];
			this.anIntArray100[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I")
	public int method2133(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray100.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray100[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray100[local23 + local23]) {
				return local32;
			}
			local23 = local19 & local23 + 1;
		}
	}
}
