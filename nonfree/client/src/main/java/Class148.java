import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class148 {

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "S")
	public final short aShort76;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public final boolean aBoolean406;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort75 = (short) arg5;
		this.aByte85 = (byte) arg7;
		this.aShort76 = (short) arg6;
		this.aShort74 = (short) arg4;
		this.anInt4695 = arg0;
		this.aByte86 = (byte) arg8;
		this.aBoolean406 = arg9;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBI)Lclient!mg;")
	public Class148 method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new Class148(arg0, arg2, arg3, arg1, this.aShort74, this.aShort75, this.aShort76, this.aByte85, this.aByte86, this.aBoolean406);
	}
}
