import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class121 {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
	private final int[] anIntArray180;

	static {
		new Class198("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
		aRectangleArray1 = new Rectangle[100];
		for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
			aRectangleArray1[local18] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V")
	public Class121(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= (arg0.length >> 1) + arg0.length; local5 <<= 0x1) {
		}
		this.anIntArray180 = new int[local5 + local5];
		for (@Pc(29) int local29 = 0; local29 < local5 + local5; local29++) {
			this.anIntArray180[local29] = -1;
		}
		@Pc(48) int local48 = 0;
		while (arg0.length > local48) {
			@Pc(58) int local58;
			for (local58 = local5 - 1 & arg0[local48]; this.anIntArray180[local58 + local58 + 1] != -1; local58 = local5 - 1 & local58 + 1) {
			}
			this.anIntArray180[local58 + local58] = arg0[local48];
			this.anIntArray180[local58 + local58 + 1] = local48++;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	public int method2562(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = (this.anIntArray180.length >> 1) - 1;
		@Pc(20) int local20 = arg0 & local16;
		while (true) {
			@Pc(30) int local30 = this.anIntArray180[local20 + local20 + 1];
			if (local30 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray180[local20 + local20]) {
				return local30;
			}
			local20 = local16 & local20 + 1;
		}
	}
}
