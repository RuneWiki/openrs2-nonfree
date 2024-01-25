import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class158 {

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "S")
	public final short aShort54;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
	public final int anInt4310;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Z")
	public final boolean aBoolean281;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "S")
	public final short aShort53;

	static {
		new Class267("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort54 = (short) arg4;
		this.anInt4310 = arg0;
		this.aByte61 = (byte) arg7;
		this.aShort52 = (short) arg5;
		this.aBoolean281 = arg9;
		this.aByte62 = (byte) arg8;
		this.aShort53 = (short) arg6;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIII)Lclient!lt;")
	public Class158 method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class158(arg2, arg1, arg3, arg0, this.aShort54, this.aShort52, this.aShort53, this.aByte61, this.aByte62, this.aBoolean281);
	}
}
