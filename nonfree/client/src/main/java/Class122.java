import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class122 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
	private final int[] anIntArray376;

	static {
		new Class169("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "([I)V")
	public Class122(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray376 = new int[local5 + local5];
		for (@Pc(33) int local33 = 0; local33 < local5 + local5; local33++) {
			this.anIntArray376[local33] = -1;
		}
		@Pc(49) int local49 = 0;
		while (local49 < arg0.length) {
			@Pc(59) int local59;
			for (local59 = local5 - 1 & arg0[local49]; this.anIntArray376[local59 + local59 + 1] != -1; local59 = local5 - 1 & local59 + 1) {
			}
			this.anIntArray376[local59 + local59] = arg0[local49];
			this.anIntArray376[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)I")
	public int method2589(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray376.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray376[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray376[local20 + local20]) {
				return local29;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
