import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class54 {

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "S")
	public final short aShort21;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
	public final boolean aBoolean84;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public final int anInt1370;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "B")
	public final byte aByte14;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort21 = (short) arg5;
		this.aBoolean84 = arg9;
		this.anInt1370 = arg0;
		this.aByte13 = (byte) arg8;
		this.aShort22 = (short) arg4;
		this.aShort20 = (short) arg6;
		this.aByte14 = (byte) arg7;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)Lclient!dl;")
	public Class54 method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class54(arg0, arg2, arg3, arg1, this.aShort22, this.aShort21, this.aShort20, this.aByte14, this.aByte13, this.aBoolean84);
	}
}
