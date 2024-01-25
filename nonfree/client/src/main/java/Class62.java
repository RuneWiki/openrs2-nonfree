import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class62 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "[I")
	private final int[] anIntArray80;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "([I)V")
	public Class62(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray80 = new int[local5 + local5];
		for (@Pc(35) int local35 = 0; local35 < local5 + local5; local35++) {
			this.anIntArray80[local35] = -1;
		}
		@Pc(52) int local52 = 0;
		while (arg0.length > local52) {
			@Pc(64) int local64;
			for (local64 = arg0[local52] & local5 - 1; this.anIntArray80[local64 + local64 + 1] != -1; local64 = local64 + 1 & local5 + -1) {
			}
			this.anIntArray80[local64 + local64] = arg0[local52];
			this.anIntArray80[local64 + local64 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
	public int method1219(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (this.anIntArray80.length >> 1) - 1;
		@Pc(23) int local23 = local19 & arg0;
		while (true) {
			@Pc(32) int local32 = this.anIntArray80[local23 + local23 + 1];
			if (local32 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray80[local23 + local23]) {
				return local32;
			}
			local23 = local23 + 1 & local19;
		}
	}
}
