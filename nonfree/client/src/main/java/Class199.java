import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class199 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
	private final int[] anIntArray440;

	static {
		new Class96("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([I)V")
	public Class199(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray440 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray440[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray440[local58 + local58 + 1] != -1; local58 = local58 + 1 & local5 + -1) {
			}
			this.anIntArray440[local58 + local58] = arg0[local48];
			this.anIntArray440[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I")
	public int method4745(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray440.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray440[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray440[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
