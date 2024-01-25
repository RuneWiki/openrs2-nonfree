import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class33 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public final int anInt1182;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "B")
	public final byte aByte14;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public final int anInt1179;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public final int anInt1180;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	public final int anInt1178;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
	public final boolean aBoolean95;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	public final int anInt1176;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "S")
	public final short aShort20;

	static {
		new Class267("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt1182 = arg2;
		this.aByte14 = (byte) arg7;
		this.anInt1179 = arg0;
		this.anInt1180 = arg3;
		this.aByte15 = (byte) arg8;
		this.anInt1178 = arg1;
		this.aShort19 = (short) arg6;
		this.aBoolean95 = arg10;
		this.aShort18 = (short) arg5;
		this.anInt1176 = arg11;
		this.aShort20 = (short) arg4;
	}
}
