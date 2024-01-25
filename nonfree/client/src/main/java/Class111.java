import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class111 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Z")
	public final boolean aBoolean184;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public final int anInt3124;

	static {
		new Class84("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean184 = arg9;
		this.aByte32 = (byte) arg7;
		this.aShort33 = (short) arg5;
		this.aShort32 = (short) arg4;
		this.aByte33 = (byte) arg8;
		this.aShort31 = (short) arg6;
		this.anInt3124 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIB)Lclient!ic;")
	public Class111 method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class111(arg3, arg0, arg2, arg1, this.aShort32, this.aShort33, this.aShort31, this.aByte32, this.aByte33, this.aBoolean184);
	}
}
