import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class47 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
	private final int[] anIntArray101;

	static {
		new Class267("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([I)V")
	public Class47(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray101 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray101[local32] = -1;
		}
		@Pc(51) int local51 = 0;
		while (local51 < arg0.length) {
			@Pc(61) int local61;
			for (local61 = local5 - 1 & arg0[local51]; this.anIntArray101[local61 + local61 + 1] != -1; local61 = local5 - 1 & local61 + 1) {
			}
			this.anIntArray101[local61 + local61] = arg0[local51];
			this.anIntArray101[local61 + local61 + 1] = local51++;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	public int method1373(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray101.length >> 1) - 1;
		@Pc(23) int local23 = local11 & arg0;
		while (true) {
			@Pc(33) int local33 = this.anIntArray101[local23 + local23 + 1];
			if (local33 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray101[local23 + local23]) {
				return local33;
			}
			local23 = local11 & local23 + 1;
		}
	}
}
