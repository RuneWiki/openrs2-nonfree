import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class220 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "[I")
	private final int[] anIntArray396;

	static {
		new Class189("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "([I)V")
	public Class220(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray396 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray396[local28] = -1;
		}
		@Pc(44) int local44 = 0;
		while (arg0.length > local44) {
			@Pc(54) int local54;
			for (local54 = local5 - 1 & arg0[local44]; this.anIntArray396[local54 + local54 + 1] != -1; local54 = local5 - 1 & local54 + 1) {
			}
			this.anIntArray396[local54 + local54] = arg0[local44];
			this.anIntArray396[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I")
	public int method4753(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray396.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray396[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray396[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
