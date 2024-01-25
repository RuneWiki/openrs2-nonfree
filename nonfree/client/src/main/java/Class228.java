import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class228 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "[I")
	private final int[] anIntArray537;

	static {
		new Class209("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "([I)V")
	public Class228(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray537 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray537[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (local43 < arg0.length) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray537[local53 + local53 + 1] != -1; local53 = local5 - 1 & local53 - -1) {
			}
			this.anIntArray537[local53 + local53] = arg0[local43];
			this.anIntArray537[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)I")
	public int method4996(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray537.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray537[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray537[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
