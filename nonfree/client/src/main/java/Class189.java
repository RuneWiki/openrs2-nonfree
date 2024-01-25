import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jja")
public final class Class189 {

	@OriginalMember(owner = "client!jja", name = "g", descriptor = "[I")
	private final int[] anIntArray291;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "([I)V")
	public Class189(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray291 = new int[local5 + local5];
		for (@Pc(38) int local38 = 0; local38 < local5 + local5; local38++) {
			this.anIntArray291[local38] = -1;
		}
		@Pc(56) int local56 = 0;
		while (local56 < arg0.length) {
			@Pc(68) int local68;
			for (local68 = local5 - 1 & arg0[local56]; this.anIntArray291[local68 + local68 + 1] != -1; local68 = local5 - 1 & local68 - -1) {
			}
			this.anIntArray291[local68 + local68] = arg0[local56];
			this.anIntArray291[local68 + local68 + 1] = local56++;
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(II)I")
	public int method4781(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (this.anIntArray291.length >> 1) - 1;
		@Pc(22) int local22 = local18 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray291[local22 + local22 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray291[local22 + local22]) {
				return local32;
			}
			local22 = local22 + 1 & local18;
		}
	}
}
