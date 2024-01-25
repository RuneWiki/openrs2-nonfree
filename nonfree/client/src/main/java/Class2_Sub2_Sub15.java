import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!s", name = "B", descriptor = "[I")
	public static final int[] anIntArray486;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "I")
	public final int anInt7234;

	static {
		new Class256("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
		anIntArray486 = new int[256];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(15) int local15 = local12;
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if ((local15 & 0x1) == 1) {
					local15 = local15 >>> 1 ^ 0xEDB88320;
				} else {
					local15 >>>= 0x1;
				}
			}
			anIntArray486[local12] = local15;
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt7234 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
	public abstract boolean method5629();

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5630();
}
