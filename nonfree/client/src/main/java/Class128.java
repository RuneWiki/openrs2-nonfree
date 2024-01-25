import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class128 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "B")
	public final byte aByte28;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	public final int anInt3925;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
	public final boolean aBoolean365;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte28 = (byte) arg8;
		this.aShort45 = (short) arg5;
		this.aByte29 = (byte) arg7;
		this.anInt3925 = arg0;
		this.aShort46 = (short) arg4;
		this.aBoolean365 = arg9;
		this.aShort47 = (short) arg6;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)Lclient!km;")
	public Class128 method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class128(arg1, arg3, arg2, arg0, this.aShort46, this.aShort45, this.aShort47, this.aByte29, this.aByte28, this.aBoolean365);
	}
}
