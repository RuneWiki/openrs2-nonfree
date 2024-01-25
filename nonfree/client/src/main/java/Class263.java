import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class263 {

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
	public final boolean aBoolean571;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "B")
	public final byte aByte93;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public final int anInt7782;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "B")
	public final byte aByte94;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "S")
	public final short aShort82;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean571 = arg9;
		this.aByte93 = (byte) arg7;
		this.aShort81 = (short) arg5;
		this.anInt7782 = arg0;
		this.aByte94 = (byte) arg8;
		this.aShort83 = (short) arg4;
		this.aShort82 = (short) arg6;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)Lclient!qg;")
	public Class263 method6497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class263(arg0, arg2, arg3, arg1, this.aShort83, this.aShort81, this.aShort82, this.aByte93, this.aByte94, this.aBoolean571);
	}
}
