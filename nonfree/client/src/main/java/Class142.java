import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class142 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	private final int[] anIntArray405;

	static {
		new Class158(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([I)V")
	public Class142(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray405 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray405[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray405[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray405[local58 + local58] = arg0[local48];
			this.anIntArray405[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	public int method3293(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray405.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray405[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray405[local20 + local20]) {
				return local30;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
