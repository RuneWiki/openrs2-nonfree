import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class76 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
	private final int[] anIntArray222;

	static {
		new Class34("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([I)V")
	public Class76(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray222 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray222[local29] = -1;
		}
		@Pc(44) int local44 = 0;
		while (local44 < arg0.length) {
			@Pc(54) int local54;
			for (local54 = arg0[local44] & local5 - 1; this.anIntArray222[local54 + local54 + 1] != -1; local54 = local54 + 1 & local5 - 1) {
			}
			this.anIntArray222[local54 + local54] = arg0[local44];
			this.anIntArray222[local54 + local54 + 1] = local44++;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)I")
	public int method2067(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray222.length >> 1) - 1;
		@Pc(15) int local15 = arg0 & local11;
		while (true) {
			@Pc(31) int local31 = this.anIntArray222[local15 + local15 + 1];
			if (local31 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray222[local15 + local15]) {
				return local31;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
