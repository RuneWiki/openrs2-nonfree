import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class193 {

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	public final int anInt5143;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	public final int anInt5141;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	public final int anInt5139;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Z")
	public final boolean aBoolean464;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
	public final int anInt5145;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
	public final int anInt5140;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "B")
	public final byte aByte77;

	static {
		new Class142("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte76 = (byte) arg8;
		this.anInt5143 = arg2;
		this.anInt5141 = arg0;
		this.aShort75 = (short) arg4;
		this.anInt5139 = arg3;
		this.aBoolean464 = arg10;
		this.aShort77 = (short) arg6;
		this.aShort76 = (short) arg5;
		this.anInt5145 = arg1;
		this.anInt5140 = arg11;
		this.aByte77 = (byte) arg7;
	}
}
