import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class200 {

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	public final int anInt5974;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "B")
	public final byte aByte66;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "B")
	public final byte aByte67;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "Z")
	public final boolean aBoolean408;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "S")
	public final short aShort91;

	static {
		new Class114("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort92 = (short) arg6;
		this.anInt5974 = arg0;
		this.aByte66 = (byte) arg7;
		this.aByte67 = (byte) arg8;
		this.aShort93 = (short) arg4;
		this.aBoolean408 = arg9;
		this.aShort91 = (short) arg5;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZIIII)Lclient!mv;")
	public Class200 method5157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class200(arg0, arg2, arg3, arg1, this.aShort93, this.aShort91, this.aShort92, this.aByte66, this.aByte67, this.aBoolean408);
	}
}
