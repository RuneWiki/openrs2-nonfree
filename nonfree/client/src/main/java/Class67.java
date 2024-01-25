import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class67 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
	private final int[] anIntArray180;

	static {
		new Class231("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([I)V")
	public Class67(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray180 = new int[local5 + local5];
		for (@Pc(32) int local32 = 0; local32 < local5 + local5; local32++) {
			this.anIntArray180[local32] = -1;
		}
		@Pc(48) int local48 = 0;
		while (local48 < arg0.length) {
			@Pc(58) int local58;
			for (local58 = arg0[local48] & local5 - 1; this.anIntArray180[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray180[local58 + local58] = arg0[local48];
			this.anIntArray180[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I")
	public int method1559(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = (this.anIntArray180.length >> 1) - 1;
		@Pc(20) int local20 = local11 & arg0;
		while (true) {
			@Pc(29) int local29 = this.anIntArray180[local20 + local20 + 1];
			if (local29 == -1) {
				return -1;
			}
			if (this.anIntArray180[local20 + local20] == arg0) {
				return local29;
			}
			local20 = local11 & local20 + 1;
		}
	}
}
