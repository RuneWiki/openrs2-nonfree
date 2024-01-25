import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public int anInt6320;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "Z")
	public final boolean aBoolean474;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
	public int anInt6322;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public int anInt6317;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
	public int anInt6328;

	static {
		new Class221("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aBoolean474 = arg8;
		this.anInt6322 = (short) arg2;
		this.aByte74 = (byte) arg0;
		this.aShort96 = (short) arg5;
		this.aShort95 = (short) arg7;
		this.aByte73 = arg9;
		this.aShort97 = (short) arg4;
		this.aShort94 = (short) arg6;
		this.anInt6317 = (short) arg3;
		this.anInt6328 = (short) arg1;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
	public void method5457() {
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
	public abstract int method5459();
}
