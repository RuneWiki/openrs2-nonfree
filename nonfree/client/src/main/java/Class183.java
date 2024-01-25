import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class183 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
	private final int[] anIntArray376;

	static {
		new Class40("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([I)V")
	public Class183(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray376 = new int[local5 + local5];
		for (@Pc(28) int local28 = 0; local28 < local5 + local5; local28++) {
			this.anIntArray376[local28] = -1;
		}
		@Pc(43) int local43 = 0;
		while (arg0.length > local43) {
			@Pc(53) int local53;
			for (local53 = arg0[local43] & local5 - 1; this.anIntArray376[local53 + local53 + 1] != -1; local53 = local53 + 1 & local5 + -1) {
			}
			this.anIntArray376[local53 + local53] = arg0[local43];
			this.anIntArray376[local53 + local53 + 1] = local43++;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)I")
	public int method4504(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (this.anIntArray376.length >> 1) - 1;
		@Pc(20) int local20 = local16 & arg0;
		while (true) {
			@Pc(30) int local30 = this.anIntArray376[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray376[local20 + local20]) {
				return local30;
			}
			local20 = local20 + 1 & local16;
		}
	}
}
