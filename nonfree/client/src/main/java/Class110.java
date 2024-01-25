import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class110 {

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
	private final int[] anIntArray250;

	static {
		new Class62("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "([I)V")
	public Class110(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray250 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray250[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray250[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 - -1) {
			}
			this.anIntArray250[local54 + local54] = arg0[local44];
			this.anIntArray250[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public int method2743(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = (this.anIntArray250.length >> 1) - 1;
		@Pc(19) int local19 = local15 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray250[local19 + local19 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray250[local19 + local19] == arg0) {
				return local29;
			}
			local19 = local19 + 1 & local15;
		}
	}
}
