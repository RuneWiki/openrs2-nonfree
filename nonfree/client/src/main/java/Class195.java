import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class195 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!vn;")
	public Class12_Sub13_Sub4 aClass12_Sub13_Sub4_4;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "Lclient!mq;")
	public Class12_Sub35 aClass12_Sub35_1;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "Lclient!ke;")
	public Class12_Sub29_Sub1 aClass12_Sub29_Sub1_2;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "Lclient!gj;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public final int anInt5598;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	public final int anInt5596;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	public final int anInt5597;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public int anInt5599;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
	public final int anInt5600;

	static {
		new Class88("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(BIIIII)V")
	public Class195(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5598 = arg1;
		this.anInt5596 = arg5;
		this.anInt5597 = arg2;
		this.anInt5599 = arg3;
		this.aByte69 = arg0;
		this.anInt5600 = arg4;
	}
}
